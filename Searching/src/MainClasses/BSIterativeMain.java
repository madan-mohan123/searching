package MainClasses;

import java.util.Scanner;

import BSIterative.BSIterative;

public class BSIterativeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] arr= {10,20,30,40,50,60,70,80,90,100};
		 int SearchElement;
		 System.out.println("enter search element");
		 SearchElement=sc.nextInt();
		 BSIterative bt=new BSIterative(arr);
        
        int result=bt.BinarySearchIterative(SearchElement);
        if(result==-1) {
      	 
      	 System.out.println(SearchElement +" is not found");
        }
        else {
        	 System.out.println(SearchElement +" is found " + "at index no " +result+ " at postion "+ (result+1));
        }
	}   

}
