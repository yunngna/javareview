package lambdaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StreamEmpTest {
	@Test
	@DisplayName("test")
	public void test (){
		
		
		List<EmpVO>list = Arrays.asList(new EmpVO("홍길동",100),
								      new EmpVO("김기자",200),
								      new EmpVO("이순신",50));
		
		//forEach 출력 
		list.stream() //스트림으로 변경 
			.forEach(System.out::println);
		
		//이름만 출력
//		list.stream() //스트림으로 변경 
//			.forEach(s-> System.out.println(s.name));
		
		Stream<EmpVO> stream = list.stream();
		stream.forEach(emp -> System.out.println(emp.getName()));
		
		//급여순으로 정렬 출력 sort, forEach
		//오름차순
		list.stream()
			.sorted((a,b)->a.sal-b.sal)
			.forEach(System.out::println);
		//내림차순
		list.stream()
			.sorted((a,b)->b.sal-a.sal)
			.forEach(System.out::println);
		
		
		//최대급여사원의 이름 max, peek
		//null 인지 아닌지 알기 위해서 null을 포함하기 위해서 Optional 을 해준다.
		Optional<EmpVO> result = list.stream()
								.max(Comparator.comparing(EmpVO::getSal));
		//혹은 orElseThrow 사용 
		//EmpVO result = stream.min(Comparator.comparing(EmpVO::getSal))
								//.orElseThrow(Exception::new)
								//.orElse(EmpVO::new);
		System.out.println("max == " + result.get());
	}
}
