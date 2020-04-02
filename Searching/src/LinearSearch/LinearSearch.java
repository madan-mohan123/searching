package LinearSearch;

public class LinearSearch {
	private int[] a;
	public  LinearSearch(int[] a){
		this.a=a;
	}
	public boolean MyLinearSearch(int SearchElement){
	for(int i=0;i<a.length-1;i++) {
		if(a[i]==SearchElement) {
			return true;
		}	
	}
	return false;
		} 
}
