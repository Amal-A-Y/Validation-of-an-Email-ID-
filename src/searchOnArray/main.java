package searchOnArray;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {


ArrayList<String> emailId = new ArrayList<String>();
Scanner sc= new Scanner(System.in);
String option;
String newEmail;
String searchEmail;
Boolean serchStatus = false;
emailId.add("example1.a.b@gmail.com");
emailId.add("example2_qq@gmail.com");
emailId.add("example1321@gmail.com");
emailId.add("example12020@gmail.com");
emailId.add("mohammed2000@gmail.com");
emailId.add("ali22@gmail.com");
emailId.add("alis_2023.@gmail.com");
do {
System.out.println("email ID for emploee :  \n____________________________________ \n" );

for(String email: emailId) {
	
	System.out.println("email ID  :  " + email);
}
System.out.println("\n____________________________________" );
System.out.println("Are you want add new email Id ?  (y/n)");
option=sc.nextLine();
if(option.contentEquals("y")|| option.contentEquals("yes")|| option.contentEquals("Y")|| option.contentEquals("YES")){
	System.out.println("please enter the new email ID:");
	newEmail=sc.next();
	emailId.add(newEmail);


	
}else if(option.contentEquals("n")|| option.contentEquals("no") || option.contentEquals("N") || option.contentEquals("NO")){{
	System.out.println("please enter the email to search: \n");
searchEmail=sc.nextLine();
for(String search: emailId) {

	if(search.contentEquals(searchEmail)) {
	 System.out.println("---  email ID  :  " + search + " IS FOUND  ---");
	serchStatus=true;
	//else 
		// System.out.println("email ID " + search + "  not found");	
}
}
if( serchStatus == false	)
	 System.out.println("email ID   " + searchEmail + " NOT FOUND \n \n ");
}

option="";
searchEmail="";

}else {
	System.out.println("please enter valid option: \n");
}
}while(!option.contentEquals("y") || !option.contentEquals("yes"));



	}

}
