
public class Grading {
	public static void main(String[] args) {
		int maths = 100, physics=100, chemestry=50;
		
		if(maths <35 || physics <35 || chemestry <35){
			System.out.println("Failed");
		}else{
			int avg = (maths+physics+chemestry)/3;
			if(avg<=59){
				System.out.println("Grade: C");
			}else if(avg <=69){
				System.out.println("Grade: B");
			}else{
				System.out.println("Grade: A");
			}
		}
	}
}

