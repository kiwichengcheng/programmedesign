package com.cc.alg;

import lombok.Data;

@Data
public class ReverserLink {


    //翻转left到right之间的列表
    public static Node revert(Node head, int left, int right){

        if(head == null){
            return null;
        }
        Node prev;
        Node cur;
        Node curNext;
        prev = head;
        for(int i = 0 ; i < left-1 ; i++){
            prev = prev.next;
        }

        cur = prev.next;
        for(int i = 0 ; i < right-left ; i++){
            curNext = cur.next;
            cur.next = curNext.next;
            curNext.next = prev.next;
            prev.next = curNext;
        }

        return head;

    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        Node curr = node1;
        for(int i = 0 ; i < 5 ; i++){

            System.out.println(curr.getValue());
            curr = curr.next;

        }
        Node newNode = revert(node1,1,3);
        curr = newNode;
        for(int i = 0 ; i < 5 ; i++){

            System.out.println(curr.getValue());
            curr = curr.next;

        }
    }



    @Data
    static class Node{
        private int value;
        private Node next;

        public Node(int i){
            value = i;
        }
    }
}
