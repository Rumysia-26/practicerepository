package sort;

public class BubbleList {
	Nodee START;
	public BubbleList() {
		START=null;
	}
	public void add(int data) {
		Nodee n =new Nodee(data,null);
		if(START==null) {
			n.next=START;
			START=n;
			return;
		}
		Nodee curr;
		for(curr=START;curr.next!=null;curr=curr.next)
		{
			
		}
		curr.next=n;
		
	}
	public void addAtBeginnig(int data) {
		Nodee n = new Nodee(data,null);
		n.next=START;
		START=n;
		
	}
	
		public void traverse() {
			Nodee curr;
			for(curr= START;curr!=null;curr=curr.next)
			{
				System.out.println(curr.data);
			}
		}
		public void bubbleSort() {
			if(START==null)
				return;
			boolean swapped;
			do{
				swapped = false;
				Nodee current = START;
				while (current!= null&& current.next!=null) {
					if(current.data>current.next.data) {
						int temp = current.data;
						current.data=current.next.data;
						current.next.data=temp;
						swapped = true;
					}
					current=current.next;
				}
			}
				while(swapped);
				
			}
		

public static void main(String [] args) {
	
	BubbleList obj = new BubbleList();
	obj.add(12);
	obj.add(13);
	obj.add(14);
	obj.add(15);
	obj.add(16);
	obj.add(10);
	//obj.addAtBeginnig(55);
	//obj.traverse();
	obj.bubbleSort();
	obj.traverse();
	

	
}
}
