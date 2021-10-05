package newCourseExample1;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {

		List<Person> listP = List.of(new Person("Carlos", 32), 
				new Person("Joao", 18), 
				new Person("Isa", 10),
				new Person("Marquinhos", 4));
		
		listP.stream().filter(n -> n.age < 18)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	
	}

	static class Person {

		public final String name;
		public final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	}

}
