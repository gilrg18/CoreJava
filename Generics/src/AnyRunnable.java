//RESTRICTING GENERIC TYPE PARAMETERS
//This T will only accept generic types that implement the runnable interface
//On the right side of <> we can either have an interface or a parent class 
//So using the extends keyword helps restricting the generic type
//USING MULTIPLE RESTRICTIONS USING &
public class AnyRunnable<T extends Thread & Comparable> {

}
