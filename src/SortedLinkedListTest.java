import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SortedLinkedListTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testEmptyList() {
    SortedLinkedList ll = new SortedLinkedList();
    assertEquals(null, ll.getName(0));
    assertEquals(-1, ll.getQuantity(0));
    assertEquals(0, ll.length());
    assertEquals(false, ll.isMember("Node"));                
  }
  
  public void testSingleNode() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Daniel", 13);
    assertEquals("Daniel", ll.getName(0));
    assertEquals(13, ll.getQuantity(0));
    assertEquals(1, ll.length());
    assertEquals(false, ll.isMember("Node"));
    assertEquals(true, ll.isMember("Daniel"));
  }

  public void testSecondNodeNewHead() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("David", 4);
    //assertEquals("David", ll.getName(1));
    assertEquals(4, ll.getQuantity(4));
    assertEquals(2, ll.length());
    assertEquals(true, ll.isMember("Daniel"));
    assertEquals(true, ll.isMember("David"));
  }
  
  
}
