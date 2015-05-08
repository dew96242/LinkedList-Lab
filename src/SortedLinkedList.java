public class SortedLinkedList
{
  private Node head;
  private int length;
  
  /**
   * Create an empty list.
   */
  public SortedLinkedList()
  {
    head = null;
    length = 0;
  }
  
  /**
   * Print all the elements of the list to the console.  Each element will have
   * the form "name:quantity" and the entries will be separated by a single
   * space.
   */
  public void print()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.getName() + ":" + temp.getQuantity() + " ");
      temp = temp.getNext();
    }
    
    System.out.println();
  }
  
  /**
   * This method will return the name at the specified index.  Similar to an
   * array, the index of the first entry is zero.  If the index is invalid,
   * this method will return null.
   */
  public String getName(int index)
  {
    Node temp = head;
    
    // if the index is out of bounds return null
    if (index < 0 || index >= length) {
      return null;
    } 
    
    // if the list is empty return null
    if (temp == null) {
      return null;
    }

    // if there is one element in the list
    if (index == 0 && temp != null) {
      return temp.getName();
    }

    return null;
    
  }
      

  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    Node temp = head;
    
    // if the index is out of bounds return -1
    if (index < 0 || index >= length) {
      return -1;
    }
    return -1;
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
   return length;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    Node node = head;
    boolean found = false;
    while (node != null && !found) {
      if (node.getName().equals(name)) {
        found = true;
      }
      else {
        node = node.getNext();
      }
    }
    return found;
  }
 
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {    
    Node temp = head;
    Node newNode = new Node(name, quantity);
    
    head = newNode;
    
    length++;
    }
  }

