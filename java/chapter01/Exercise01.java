import java.util.Scanner;

public class Exercise01 {
   
	//Checks if every character in the string is unique
	//Assumes ASCI alphabet, which only has 128 characters
	public static boolean isUnique(String str) {
		//If the characters are asci there are 128 possible unique characters
		//Then by the pigeon hole principle there must be a recurring character if there are over 128 characters
		if(str.length() > 128) {
			return false;
		}
      return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
   
}

