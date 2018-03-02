import java.util.Random;

public class CricScore {
	static int score=0;
	static int target=98;
	public static void main(String[] args) {
		score();
		
		
	}
	
	public static void score(){
while(score<target){
		score=score+randomNumber(0, 6)	;
		System.out.println(score);
		}

		
	}
	
	public static int randomNumber(int min,int max){
		Random ran=new Random();
		int randomNumber=ran.nextInt(7);
		return randomNumber;
		
	}
}
