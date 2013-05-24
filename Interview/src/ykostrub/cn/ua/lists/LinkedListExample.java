package ykostrub.cn.ua.lists;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class LinkedListExample {

  // private int data = 0;
  // private LinkedListExample next = null;
  //
  // private static int count;
  //
  // public LinkedListExample(
  // int data) {
  // super();
  // this.data = data;
  // }
  //
  // @Override
  // public String toString() {
  // return "[data=" + data + "," + next + "]";
  // }

  /**
   * @param args
   */
  public static void main(
      String[] args) {

    MyLinkedList list = new MyLinkedList(5);
    list.add(9);
    list.add(5);
    list.add(0);
    list.add(4);
    list.add(8);
    list.add(1);
    list.add(7);

    System.out.println(list);
//    System.out.println(nthToLastRecursion(list, 3));
//    System.out.println(nthToLast(list, 4));
    System.out.println(getSumElements(list, list, 0));
   // deleteDupsWithoutBuffer(list);
   // System.out.println(list);
  }

  public static void deleteDupsWithBuffer(
      MyLinkedList list) {
    if (list != null) {
      HashMap<Integer, Object> map = new HashMap<Integer, Object>();
      MyLinkedList prev = null;
      while (list != null) {
        if (map.containsKey(list.getData())) {
          prev.setNext(list.getNext());
        } else {
          map.put(list.getData(), true);
          prev = list;
        }
        list = list.getNext();
      }

    }

  }

  public static void deleteDupsWithoutBuffer(
      MyLinkedList list) {
    if (list != null) {
      while (list != null) {

        MyLinkedList cur = list;

        while (cur.getNext() != null) {
          if (list.getData() == cur.getNext().getData()) {
            cur.setNext(cur.getNext().getNext());
          } else {
            cur = cur.getNext();
          }
        }

        list = list.getNext();
      }

    }

  }

  public static MyLinkedList nthToLastRecursion(MyLinkedList list, int k) {
    if (list == null) {
      return null;
    }
    MyLinkedList node = nthToLastRecursion(list.getNext(), k);
    MyLinkedList.count ++;
    if (MyLinkedList.count == k) {
      return list;
    }    
    return node;    
  }
  
  public static MyLinkedList nthToLast(MyLinkedList list, int k) {
    if (list == null || k < 0) {
      return null;
    }
    
    MyLinkedList p1 = list;
    MyLinkedList p2 = list; 
    
    for (int i = 0; i < k; i++) {
      if (p1 == null) {
        return null;
      }
      p1 = p1.getNext();
    }    
    while (p1 != null) {
      p1 = p1.getNext();
      p2 = p2.getNext();
    }   
    return p2;    
  }
  
  public static MyLinkedList getSumElements(MyLinkedList l1, MyLinkedList l2, int carry){
    
    if (l1 == null && l2 == null && carry == 0) {
      return null;
    }

    
    MyLinkedList sum = new MyLinkedList();
    
    MyLinkedList node = getSumElements(l1.getNext(), l2.getNext(),  carry);
    
    
    int data = carry;
    
    if (l1 != null) {
      data = data + l1.getData();
    }
    if (l2 != null) {
      data = data +l2.getData();
    }
    
    System.out.println(data);
   
    
    sum.add(node);
    
    
    
    return sum;
    
    
  }
  
  // public static int ntnToLast(LinkedListExample head, int n){
  // if (head == null) {
  // return 0;
  // }
  // int i = ntnToLast(head.next, n) +1;
  // if (i == n) {
  // System.out.println(head.data);
  // }
  // return i;
  //
  // }
  //
  // public static void removeDublicate1(
  // LinkedListExample list) {
  //
  // if (list != null && list.next != null) {
  // HashMap<Integer, Object> map = new HashMap<Integer, Object>();
  // LinkedListExample prev = null;
  // while (list != null) {
  // if (map.containsKey(list.data)) {
  // prev.next = list.next;
  // } else {
  // map.put(list.data, true);
  // prev = list;
  // }
  // list = list.next;
  //
  // }
  // }
  //
  // }
  //
  // public static void removeDublicate2(
  // LinkedListExample list) {
  //
  // if (list != null && list.next != null) {
  //
  // LinkedListExample current = list;
  // while (current != null) {
  // LinkedListExample runner = current;
  // while (runner.next != null) {
  // if (current.data == runner.next.data) {
  // runner.next = runner.next.next;
  // } else {
  // runner = runner.next;
  // }
  // }
  // current = current.next;
  //
  // }
  //
  // }
  //
  // }
  //
  // private static LinkedListExample nthToLastRecursion(
  // LinkedListExample head,
  // int k) {
  // if (head == null) {
  // return null;
  // }
  // LinkedListExample node = nthToLastRecursion(head.next, k);
  // count++;
  // if (count == k) {
  // return head;
  //
  // }
  // return node;
  // }
  //
  // @SuppressWarnings("unused")
  // private static int nthToLastRecursionPosition(
  // final LinkedListExample list,
  // final int k) {
  // if (list == null) {
  // return 0;
  // }
  // int i = nthToLastRecursionPosition(list.next, k) + 1;
  // if (i == k) {
  // System.out.println(list.data);
  //
  // }
  // return i;
  //
  // }
  //
  // @SuppressWarnings("unused")
  // private static LinkedListExample nthToLast(
  // final LinkedListExample head,
  // final int k) {
  // if (k < 0) {
  // return null;
  // }
  //
  // LinkedListExample p1 = head;
  // LinkedListExample p2 = head;
  //
  // for (int i = 0; i < k - 1; i++) {
  // if (p2 == null) {
  // return null;
  // }
  // p2 = p2.next;
  //
  // }
  //
  // if (p2 == null) {
  // return null;
  // }
  //
  // while (p2.next != null) {
  // p2 = p2.next;
  // p1 = p1.next;
  // }
  //
  // System.out.println(p1.data);
  // return p1;
  // }
  //
  // public static boolean deleteNode(
  // LinkedListExample head) {
  //
  // if (head == null) {
  // return false;
  // }
  // if (head.next == null) {
  // head = null;
  // return true;
  // }
  // head.data = head.next.data;
  // head.next = head.next.next;
  //
  // return true;
  //
  // }
  //
  // private static LinkedListExample partition(
  // LinkedListExample head,
  // int k) {
  // LinkedListExample beforeStart = null;
  // LinkedListExample beforeEnd = null;
  //
  // LinkedListExample afterStart = null;
  // LinkedListExample afterEnd = null;
  //
  // while (head != null) {
  //
  // if (head.data < k) {
  // if (beforeStart == null) {
  // beforeStart = head;
  // beforeEnd = beforeStart;
  // } else {
  // beforeEnd.next = head;
  // beforeEnd = head;
  //
  // }
  //
  // } else {
  // if (afterStart == null) {
  // afterStart = head;
  // afterEnd = afterStart;
  // } else {
  // afterEnd.next = head;
  // afterEnd = head;
  // }
  //
  // }
  //
  // head = head.next;
  //
  // }
  // if (beforeStart == null) {
  // return afterStart;
  // }
  // beforeEnd.next = afterStart;
  // return beforeStart;
  //
  // }
  //
  // private static LinkedListExample partition2(
  // LinkedListExample head,
  // int k) {
  // LinkedListExample beforeStart = null;
  //
  // LinkedListExample afterStart = null;
  //
  //
  // while (head != null) {
  //
  // LinkedListExample next = head.next;
  //
  // if (head.data < k) {
  // head.next = beforeStart;
  // beforeStart = head;
  //
  // } else {
  // head.next = afterStart;
  // afterStart = head;
  // }
  // head = next;
  //
  // }
  //
  // if (beforeStart == null) {
  // return afterStart;
  // }
  //
  // LinkedListExample h = beforeStart;
  // while(beforeStart.next != null){
  // beforeStart = beforeStart.next;
  // }
  // beforeStart.next = afterStart;
  //
  //
  //
  //
  // return h;
  //
  // }

}
