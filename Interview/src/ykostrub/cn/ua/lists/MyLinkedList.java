package ykostrub.cn.ua.lists;

// TODO: Auto-generated Javadoc
/**
 * The Class MyLinkedList.
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class MyLinkedList {

  /** The data. */
  private int data;

  /** The next. */
  private MyLinkedList next;

  /** The count. */
  public static int count;

  /**
   * Gets the data.
   * @return the data
   */
  public int getData() {
    return data;
  }

  /**
   * Sets the data.
   * @param data the new data
   */
  public void setData(
      int data) {
    this.data = data;
  }

  /**
   * Gets the next.
   * @return the next
   */
  public MyLinkedList getNext() {
    return next;
  }

  /**
   * Sets the next.
   * @param next the new next
   */
  public void setNext(
      MyLinkedList next) {
    this.next = next;
  }

  /**
   * Adds the.
   * @param node the node
   */
  public void add(
      MyLinkedList node) {
    MyLinkedList list = this;
    while (list.next != null) {
      list = list.next;
    }
    list.next = node;
  }

  /**
   * Adds the.
   * @param data the data
   */
  public void add(
      int data) {
    MyLinkedList node = new MyLinkedList(data);
    MyLinkedList list = this;
    while (list.next != null) {
      list = list.next;
    }
    list.next = node;
  }

  /**
   * Instantiates a new my linked list.
   * @param data the data
   */
  public MyLinkedList(
      int data) {
    super();
    this.data = data;
  }

  /**
   * Instantiates a new my linked list.
   */
  public MyLinkedList() {
    super();
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "data=" + data + " , next=" + next;
  }

}
