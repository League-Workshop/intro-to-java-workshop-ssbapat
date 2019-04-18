package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int userscore = 0;

		// 2. Ask the user a question
		String year = JOptionPane.showInputDialog(null, "What age did I start engineering");

		// 3. Use an if statement to check if their answer is correct
		if (year.equals("8")) {
			userscore = 1;
		} else {
			userscore = 0;
		}
		// 4. if the user's answer is correct
		

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String foodrightnow = JOptionPane.showInputDialog(null, "What food do I want right now");
		if (foodrightnow.equals("swirl ice cream")) {
			userscore +=1;
		} else {
			userscore +=0;
		}
		String bone = JOptionPane.showInputDialog(null, "What age was I when I first broke a bone ");
		if (foodrightnow.equals("swirl ice cream")) {
			userscore +=1;
		} else {
			userscore +=0;
		}
		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "your score is "+userscore+"/2" );
	}
}
