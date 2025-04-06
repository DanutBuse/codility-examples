package com.balancedorders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String[]> orders = new ArrayList<>();
        orders.add(new String[]{"laptop", "buy"});
        orders.add(new String[]{"laptop", "sell"});
        orders.add(new String[]{"phone", "buy"});
        orders.add(new String[]{"phone", "sell"});
        orders.add(new String[]{"monitor", "buy"});
        orders.add(new String[]{"monitor", "sell"});

        System.out.println(isBalanced(orders));

        orders = new ArrayList<>();
        orders.add(new String[]{"laptop", "buy"});
        orders.add(new String[]{"laptop", "sell"});
        orders.add(new String[]{"phone", "buy"});

        System.out.println(isBalanced(orders));
    }

    public static boolean isBalanced(List<String[]> orders) {
        // Map to keep track of net count of buy/sell per item
        Map<String, Integer> itemBalance = new HashMap<>();

        for (String[] order : orders) {
            String item = order[0];
            String action = order[1];

            // Increment or decrement count based on action
            if (action.equals("buy")) {
                itemBalance.put(item, itemBalance.getOrDefault(item, 0) + 1);
            } else if (action.equals("sell")) {
                itemBalance.put(item, itemBalance.getOrDefault(item, 0) - 1);
            } else {
                // Unexpected action (should not happen per constraints)
                throw new IllegalArgumentException("Invalid action: " + action);
            }
        }

        // Check if all balances are zero
        for (int balance : itemBalance.values()) {
            if (balance != 0) {
                return false;
            }
        }

        return true;
    }
}
