package MainClasses;
import java.util.Scanner;
import BSRecurtion.MyBSRecursion;


public class BSRecursionMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] arr= {10,20,30,40,50,60,70,80,90,100};
		 int SearchElement;
		 System.out.println("enter search element");
		 SearchElement=sc.nextInt();
         MyBSRecursion bs=new MyBSRecursion(arr);
         
         boolean result=bs.BSRecursion(SearchElement,0,arr.length-1);
         if(result) {
       	  System.out.println(SearchElement +" is found");
         }
         else {
       	  System.out.println(SearchElement +" is not found");
         }

	}

}
