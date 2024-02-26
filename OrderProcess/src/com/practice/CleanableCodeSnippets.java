package com.practice;
/**
 * @author S406147
 * 
 */
public class CleanableCodeSnippets {

    /**
     * 1. why is it NOT so clean ?
     */
    public void processOrder(Order order) {
        if (order != null && order.getItems() != null && !order.getItems().isEmpty()) {
            if (order.getTotalPrice() > 100 && order.getCustomer().getCategory() == CustomerCategory.PREMIUM) {
                // BUSINESS LOGIC
            }
        }
    }

    

    /**
     * 2. can this filtering of Strings be done in a better way with fewer lines, instead of going with the Traditional approach ?
     */
    public List<String> filterStrings(List<String> strings, String prefix) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith(prefix)) {
                result.add(s);
            }
        }
        return result;
    }
    

    /**
     * 3. Code looks cool, but what would be the Cleaner approach?
     */
    public void processOrders(Order order) {
    	if(order.count > 15) {
			throw new Exception("The order "+order.Id+" has too many items!");
		}
    }

    

    /**
     * 4. What is the acceptable limit of no. of params for a method? If there more than the limit, what should we do?
     */   
    public void complexMethod(int a, int b, int c, int d, int e, int f) {
        // Complex logic with multiple parameters
    }
    

    /**
     * 5. Find all pitfalls in this code...as much as you can ;-)
     */
    public void processOrder(Order order) throws Exception {
		if(order != null) {
			if(order.isVerified) {
				if(order.count > 0) {
					if(order.count > 15) {
						throw new Exception("The order "+order.Id+" has too many items!");
					}
					
					if(order.status != "Ready to Process") {
						throw new Exception("The order"+order.Id+" isn't ready for process!");
					}
				}
			}
		}
	}



}
