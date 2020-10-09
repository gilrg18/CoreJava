
public class LabelledBlock {
	//BREAK CAN BE USED IN SWITCH AND LOOPS NORMALLY, BUT ALSO CAN BE USED IN LABELLED BLOCKS.. EXAMPLE:
	public static void main(String[] args) {
		int x = 20;
		
		l1:{
			System.out.println("Block Begins");
			if(x==20){
				break l1; //BREAK IN LABELLED BLOCK
			}
			System.out.println("Block Ends");
		}
		System.out.println("Outside the block");
	}

}
