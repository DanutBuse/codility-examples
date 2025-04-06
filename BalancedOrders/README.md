##Description
An e-commerce system is receiving a stream of orders. Each order is represented as a pair of strings: the item name and the action, where action is either "buy" or "sell". A "balanced" order list is one where for each item, the number of "buy" actions is equal to the number of "sell" actions.

Write a Java function that determines whether the list of orders is balanced.

##Constraints:
- The orders list will contain at most 100,000 entries.

- Item names contain only lowercase letters and have a length between 1 and 50.

- Actions are always either "buy" or "sell".

##Examples:
    List<String[]> orders = new ArrayList<>();
    orders.add(new String[]{"laptop", "buy"});
    orders.add(new String[]{"laptop", "sell"});
    orders.add(new String[]{"phone", "buy"});
    orders.add(new String[]{"phone", "sell"});
    orders.add(new String[]{"monitor", "buy"});
    orders.add(new String[]{"monitor", "sell"});
    
    isBalanced(orders) => true
    
    List<String[]> orders = new ArrayList<>();
    orders.add(new String[]{"laptop", "buy"});
    orders.add(new String[]{"laptop", "sell"});
    orders.add(new String[]{"phone", "buy"});
    
    isBalanced(orders) => false
