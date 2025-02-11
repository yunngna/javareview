package lambdaStream;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class DoubleColon {
	@Test
	@DisplayName("더블콜론")
	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("사과","바나나","포도");
		
		for(int i=0; i<fruit.size(); i++) {
//			System.out.println(fruit.get((i));
		}
		
		fruit.forEach(System.out::println);
	}
	
	
}
