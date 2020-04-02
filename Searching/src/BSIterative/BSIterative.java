package BSIterative;

public class BSIterative {
	private int[] a;
	public  BSIterative(int[] a){
		this.a=a;
	}
	public int BinarySearchIterative(int SearchElement) {
		int low=0;
		int high=a.length;
		while(low<=high) { 
			int mid=(low+high)/2;
			if(SearchElement==a[mid]) {
				return mid;
			}
			else if(SearchElement<a[mid]) {
				high=mid-1; 
			} 
			else {
				low=mid+1;
			}
		}
		return -1;
	}
}
