package org.sou.lists;

public class LinkedListTest {

  public static void main(String[] args) {
    Node root = new Node(5);
    Node root1 = new Node(6);
    root.setNext(root1);
    print(root);
  }

  public static void print(Node root) {
    while (root != null) {
      System.out.println(root.data);
      root = root.next;
    }
  }

}
