package MainClasses;
import java.util.Arrays;
import java.util.Scanner;
import Student.StudentInformation;
import Student.StudentSearch;

public class StudentSearchMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result;
		StudentInformation[] STArray=new StudentInformation[6];
		
		int  SearchElement;
        System.out.println("enter information for student");
        for(int i=0;i<6;i++) {
        StudentInformation si=new StudentInformation();
         si.setName(sc.next());
         si.setEmail(sc.next());
         si.setCoarse(sc.next());
        
         si.setRoll(sc.nextInt());
         si.setCpi(sc.nextFloat());
         sc.nextLine();
         STArray[i]=si;
        }
        
        Arrays.sort(STArray);
        
        StudentSearch ss=new StudentSearch(STArray);
        System.out.println("enter  roll to search : ");
		 SearchElement=sc.nextInt();
		 
		result=ss.BinarySearchIterative(SearchElement);
		if(result==-1) {
			System.out.println("SORRY");
		}
		else {
			System.out.println("YOUR INFORMAION OF ROLL "+SearchElement+ " is :");
			System.out.println("NAME\t\tCOARSE\t\tROLL\t\tCPI\t\tEMAIL");
			System.out.println(STArray[result].toString());
		}
	}

}
/*
MADAN
Madan.mohan@gmail.com
B.Tech
67
7
MOHAN
Mohan.mohan23@gmail.com
BBA
60
7.8
UDIT
Udit.agarwal@gmail.com
BCOM
100
9
vinay
vinay.thakur1123@gmail.com
BBA
2
6.5
kumar
manish.kumar@gmail.com
M.Tech
69
8.7
bhagwan
bhagwan87823@gmail.com
BA
65
9

*/
