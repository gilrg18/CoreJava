import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//CREATE USER DEFINED ANNOTATION
//right click -> new -> annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	/*
	 * If you select RUNTIME, then the compiler will have the
	 * 
	 * annotation available for processing at runtime.
	 * 
	 * So most of the times, the annotations we create are for runtime. So
	 * select RUNTIME, save it. Next, one
	 * 
	 * more annotation we need to mark MyAnnotation class with is
	 * 
	 * @Target.
	 * 
	 * Import it, control+1 again. Target is from java.lang.annotation. And a
	 * Target tells where
	 * 
	 * this annotation should be applied, whether it's on a class, a method, a
	 * field, etc,
	 */
}
