import java.util.Scanner;
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner C=new Scanner(System.in);	
		
	phone P=new phone("Apple","iPhone",2010,350);
	phone Q=new phone("Android","Samsung",2012,420);	
	phone R=new phone("Android","Galaxy",2014,400);	
		
	System.out.println(P.Brand + P.PhoneName + P.yearReleased);	
	System.out.println(Q.Brand + Q.PhoneName + Q.yearReleased);	
	System.out.println(R.Brand + R.PhoneName + R.yearReleased);	
		
	System.out.println("Which Phone would you like to Purchase?");	
	int A=C.nextInt();

if(A==1){
	System.out.println(P.Price);
}

else if(A==2){
System.out.println(Q.Price);
}

else if(A==3){
	System.out.println(R.Price);}

else{
	System.out.println("Try Again");
}		
		
		
		
	}	
	
}	

