package java11features;

import java.util.Optional;

public class OptionalUpdates {
	public static void main(String[] args) {
		//Optional<String> str = Optional.empty();
		Optional<String> str = Optional.of("test");
		//before java 11
		if(str.isPresent()) {
			System.out.println("wu");
		}else {
			//more logic
		}
		
		//java 11 isEmpty
		System.out.println(str.isEmpty());
	}
}
