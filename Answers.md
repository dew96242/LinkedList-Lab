**Question 1**: 

For an empty list, you would test the methods in these ways:

getName(): when getName is called with a parameter of an index that does not exist the return value will be null. Since there is no nodes in an empty list we can test getName by calling assertEquals(null, list.getName(i).

getQuantity(): is tested almost the same way getName is called except for the return value will -1 for invalid indexes

length(): Since the list is empty length should be equal to 0.

isMember(): will return false because there is nothing in the list yet.

**Question 2**:

For list with One node, you would test the method in these ways:

getName(): a parameter of 0 should return the name of the single node in the list.

getQuantity(): a parameter of 0 should return the quantity of the single node in the list.

length(): the length of the list should be equal to 1 because there is a single node.

isMember(): should return true if the parameter equals the the 

**Question 3**:

**Question 4**: