package misc;

public class SwapList {

	public static void main(String[] args) {
		ListNode head =null;
		ListNode current = null;
		for(int i=0;i<10;i++){
			if(head ==null){
				head = new ListNode(i);
				current = head;
			}else{
				current.next = new ListNode(i);
				current = current.next;
			}
		}
		current = head;
		while(current!=null){
			System.out.print(current.val+" --> ");
			current = current.next;
		}
		System.out.println("null");
		head = swapNodes(11, head);
		current = head;
		while(current!=null){
			System.out.print(current.val+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	private static ListNode swapNodes(final int k,final ListNode head){
		ListNode runner = head;
		int length=0;
		if (head==null){
			throw new IllegalArgumentException("Head cannot be null");
		}
		while(runner!=null){
			length++;
			runner=runner.next;
		}
		if(k>length){
			throw new IllegalArgumentException("k cannot be greater than length of the string");
		}
		int i=0; 
		ListNode newHead = head;
		ListNode first = head;
		ListNode firstPrev=null;
		for(i=0;i<k-1;i++){
			firstPrev = first;
			first = first.next;
		}
		ListNode second = head;
		ListNode secondPrev = null;
		for(i=0;i<length-k;i++){
			secondPrev = second;
			second = second.next;
		}
		ListNode temp = null;
		if(first.next!=second)
			temp = first.next;
		else{
			temp=first;
		}
		if(firstPrev!=null&&firstPrev!=second)
			firstPrev.next = second;
		if(secondPrev!=null&&secondPrev!=first)
			secondPrev.next = first;
		if(second.next!=first)
			first.next = second.next;
		else{
			first.next = second;
		}
		second.next = temp;
		if(firstPrev==null){
			newHead = second;
		}else if(secondPrev==null){
			newHead = first;
		}
		return newHead;
	}
}
