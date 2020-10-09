package abstraction.assignemnt;

public class Test {
	public static void main(String[] args) {
		
		HPNotebook hp = new HPNotebook();
		DELLNotebook dell = new DELLNotebook();
		hp.click();
		hp.scroll();
		dell.click();
		dell.scroll();
		
	}
}
