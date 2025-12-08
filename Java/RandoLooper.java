import java.util.Random;
import java.util.Scanner;

public class RandoLooper {
	public static void main (String[]args) {
	
	Random random = new Random();
	Scanner input = new Scanner(System.in);

	
	int firstNumber = (int)(Math.random()*10);
	int secondNumber = (int)(Math.random()*10);
	int total = firstNumber - secondNumber;

	System.out.print("enter result of first number - second number:  ");
	int userAnswer = input.nextInt();

	int totalTime = startTime + endTime / 60;
}

	ProblemSolver(userAnswer);

		

public static String ProblemSolver(int userAnswer) {

		if(userAnswer == total){
		return "correct answer";

		}

		return "incorrect answer";
}

}
