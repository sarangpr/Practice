package storage.pure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static class LinkedListNode{
    int val;
    LinkedListNode next;

    LinkedListNode(int node_value) {
        val = node_value;
        next = null;
    }
};

public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, int val){
    if(head == null) {
        head = new LinkedListNode(val);
    }
    else {
        LinkedListNode end = head;
        while (end.next != null) {
            end = end.next;
        }
        LinkedListNode node = new LinkedListNode(val);
        end.next = node;
    }
    return head;
}
/*
For your reference:
class LinkedListNode {
    int val;
    LinkedListNode next;
}
*/
    static LinkedListNode removeAll(int val, LinkedListNode list) {
        LinkedListNode prev = null;
        LinkedListNode current = list;
        while(current!=null){
            if(current.val==val){
                if(current == list){
                    list = current.next;
                }
                else{
                    prev.next = current.next;
                }
                current = current.next;
            }
            if(current!=null&&current.val!=val){
            	prev = current;
            	current = current.next;
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _val;
        _val = in.nextInt();
        
      	int _list_size = in.nextInt(), _list_i;
        int _list_item;
        LinkedListNode _list = null;
        for(_list_i = 0; _list_i < _list_size; _list_i++) {
          	_list_item = in.nextInt();
            _list = _insert_node_into_singlylinkedlist(_list, _list_item);
        }
        
        _list = removeAll(_val, _list);
      
      	LinkedListNode _current = _list;
      	while (_current != null)
        {
          System.out.print(_current.val + " ");
          _current = _current.next;
        }
        
    }
}