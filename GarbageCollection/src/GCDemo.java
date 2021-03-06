
public class GCDemo {
	/*
	 * GARBAGE COLLECTION IS A PROCESS BY WHICH A DEMON THREAD, THE 
	 * GARBAGE COLLECTION THREAD WILL CLEAR UP THE UNREACHABLE OBJECTS IN THE HEAP
	 */
	
	int objId;
	
	GCDemo(int objId){
		this.objId=objId;
		System.out.println("Created: "+ this.objId);
	}
	
	
	public static void main(String[] args) {
		
		new GCDemo(1);
		new GCDemo(2);
		//GCDemo x = new GCDemo(2);
		//x = null;
		for(int i=1; i<=100; i++){
			/*
			 * It is possible to request the JVM to kick off the garbage collector thread using the system class' GC
		     * method.
			 */
			System.gc();
		}
		
	}
	
	@Override
	protected void finalize(){
		/*
		 * GARBAGE COLLECTION WORKS WHEN THE JVM IS RUNNING LOW ON MEMORY SO IT HAS TO DELETE UNASSIGNED OBJECTS FROM THE HEAP
		 */
		System.out.println("Finalized: " +objId);
	}
	
	/*
	 * Garbage Collect unreachable objects
	 * finalize() method is called by the JVM just before garbage collection
	 * System.gc() method can be used to request garbage collection
	 */

}
