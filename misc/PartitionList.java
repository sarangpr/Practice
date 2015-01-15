package misc;

public class PartitionList {

	public static void main(String[] args) {
		int[] array = new int[]{};
		ListNode head=null;
		ListNode current = null;
		for(int i:array){
			if(head==null){
				current = new ListNode(i);
				head = current;
			}
			else{
				current.next = new ListNode(i);
				current=current.next;
			}
		}
		current = head;
		while(current!=null){
			System.out.print(current.val+" ---> ");
			current=current.next;
		}
		System.out.println("null");
		current = partition(head, 1);
		while(current!=null){
			System.out.print(current.val+" ---> ");
			current=current.next;
		}
		System.out.println("null");
	}
    public static ListNode partition(ListNode head, int x) {
    	ListNode smallListHead = null;
    	ListNode bigListHead = null;
    	ListNode current=head;
    	ListNode smallCurrent = null;
    	ListNode bigCurrent = null;
    	if(head == null){
    		return null;
    	}
    	while(current!=null){
    		if(current.val<x){
    			if(smallListHead==null){
    				smallListHead = smallCurrent = current;
    				
    			}
    			else{
    				smallCurrent.next = current;
    				smallCurrent=smallCurrent.next;
    			}
    			current = current.next;
    			smallCurrent.next=null;
    		}else{
    			if(bigListHead==null){
    				bigListHead = bigCurrent = current;
    				
    			}
    			else{
    				bigCurrent.next = current;
    				bigCurrent=bigCurrent.next;
    			}
    			current = current.next;
    			bigCurrent.next=null;
    		}
    	}
    	smallCurrent.next = bigListHead;
    	return smallListHead;
    }
}
