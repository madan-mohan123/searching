package MainClasses;
import LinearSearch.LinearSearch;

import java.util.Scanner;
public class LinearSearchMain {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] arr= {10,20,30,40,50,60,70,80,90,100};
		 int SearchElement;
		 System.out.println("enter search element");
		 SearchElement=sc.nextInt();
          LinearSearch ls=new LinearSearch(arr);
         
          boolean result=ls.MyLinearSearch(SearchElement);
          if(result) {
        	  System.out.println(SearchElement +" is found");
          }
          else {
        	  System.out.println(SearchElement +" is not found");
          }

	}

}
