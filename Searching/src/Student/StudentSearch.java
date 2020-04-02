package Student;
public class StudentSearch {
	private StudentInformation[] a;
	
	public  StudentSearch(StudentInformation[] a){
		this.a=a; 
	}
	
	public int BinarySearchIterative(int SearchElement) {
		int low=0;
		int high=a.length;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid].getRoll()==SearchElement) {
				return mid;
			}
			else if(a[mid].getRoll()>SearchElement) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
			
		return -1;
}		 
}
 