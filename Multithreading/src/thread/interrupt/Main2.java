package thread.interrupt;

import java.math.BigInteger;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new LongComputationTask(new BigInteger("20000"), new BigInteger("100000000000")));
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(100);//MAIN THREAD
		thread.interrupt();//EVEN THO THE LONG CALCULTATION HASNT FINISHED, JUST THE FACT THAT THE MAIN THREAD ENDED
							//MAKES THE ENTIRE APP TERMINATE
		
	}
	
	public static class LongComputationTask implements Runnable{
		private BigInteger base;
		private BigInteger power;
		
		public LongComputationTask(BigInteger base, BigInteger power){
			this.base =base;
			this.power = power;
		}
		
		@Override
		public void run(){
			System.out.println(base+" ala "+power+" = " + pow(base,power));
		}
		
		private BigInteger pow(BigInteger base, BigInteger power){
			BigInteger result = BigInteger.ONE;
			
			for(BigInteger i = BigInteger.ZERO; i.compareTo(power)!=0; i = i.add(BigInteger.ONE)){
				//CHECK IF CURRENT THREAD IS INTERRUPTED
			/*	if(Thread.currentThread().isInterrupted()){
					System.out.println("Prematurely Interruped computation");
					return BigInteger.ZERO;
				}*/
				result = result.multiply(base);
			}
			
			return result;
		}
	}
}
