package BSRecurtion;

public class MyBSRecursion {
	private int[] a;
	public  MyBSRecursion(int[] a){
		this.a=a;
	}
	public boolean BSRecursion(int SearchElement,int low,int high) {
		if(low>high) {
			return false;
		}
		int mid=(low+high)/2;
		if(SearchElement==a[mid]) {
			return true;
		}
		else if(SearchElement<a[mid]) {
			return BSRecursion(SearchElement, low,mid-1);
		}
		else {
			return BSRecursion(SearchElement,mid+1,high);
		}
	}
}
