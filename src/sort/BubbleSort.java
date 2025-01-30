package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {14,34,56,12,45};
		int n=a.length;
		int j=0;
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for( j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				//System.out.println(a[j]);
				
			}
			
			System.out.println(a[i]);
		}
		

	}

}
