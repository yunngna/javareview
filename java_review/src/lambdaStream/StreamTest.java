package lambdaStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StreamTest {
	@Test
	@DisplayName("스트림테스트")
	public void test1 () {
		String[] strArr = {"키위","포도","바나나","사과","귤","감","수박","구아바"};
		
		//배열을 스트림으로 변환
		//(1)
		long cnt = Stream.of(strArr)  //스트림 생성
				//중간 연산함수는 n개 가능 
				  .filter(s -> s.length()>1) // 길이 1이상만 포함 (가공)
				  .distinct() //중복값 제거 (가공)
				  .count(); //갯수 (결과)
		
		System.out.println(cnt);
		
		
		//(2) 방법1
		List<String> list = Stream.of(strArr)  //스트림 생성
			  .filter(s -> s.length()>1) // 길이 1이상만 포함 (가공)
			  .distinct() //중복값 제거 (가공)
			  .collect(Collectors.toList()); //list 배열 결과(결과)
		
		System.out.println(list);
		
		
		//(3) 방법2
				Stream.of(strArr)  //스트림 생성
				  .filter(s -> s.length()>1) // 길이 1이상만 포함 (가공)
				  .distinct() //중복값 제거 (가공)
				  .sorted((a,b)-> b.compareTo(a)) //출력 정렬 하기 
				  .forEach(System.out::println);//최종 함수는 단 하나만 해야 한다. 
				
				
	}
}
