import java.util.Random;

class LuckyFive {
public static void main(String[] args) {
	Random randomGenerator = new Random();
	//Generate a number between 1 and 6
	int dieRoll = randomGenerator.nextInt(6) + 1;
	
	//Repeat while roll insn't 5 
	while (dieRoll != 5) {
	System.out.println(dieRoll);
	dieRoll = randomGenerator.nextInt(6) + 1;
	}

}

}

