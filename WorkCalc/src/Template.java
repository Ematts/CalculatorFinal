import java.util.Scanner;
public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("What is your pay rate?");
Scanner rate=new Scanner (System.in);
double rateAnswer = Double.parseDouble(rate.next());

System.out.println("How many hours did you work?");
Scanner hours=new Scanner (System.in);
double hoursAnswer = Double.parseDouble(hours.next());


if(hoursAnswer<=40){
	
	straightTotal(hoursAnswer, rateAnswer);
	}

else{
	overTotal(hoursAnswer, rateAnswer);
	}
}

public static void straightTotal(double hoursAnswer, double rateAnswer) {
	
	double result;
	
	result = hoursAnswer * rateAnswer;
	
	System.out.printf("Your total pay is $" + "%.2f",result);
}

public static void overTotal(double hoursAnswer, double rateAnswer) {
	
	double result;
	
	result = (40 * rateAnswer) + ((hoursAnswer-40) * rateAnswer * 1.5);
	
	System.out.printf("Your total pay is $" + "%.2f",result);
}
	
}
	




	

	


