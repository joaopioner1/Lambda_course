package original_example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;

public class Program {

	public static void main(String[] args) {
		//AUTHOR: JOAO VITOR SOUZA PIONER | DATE: 10/08/21
		Scanner scan = new Scanner(System.in);
		
		List<User> list = new ArrayList<>();

		String[] names_array = {"jorge","mateus","claudio","yago"};
		Random random = new Random();
		
		for (int i = 1; i <= names_array.length; i++) {
			String name = names_array[random.nextInt(names_array.length)];
			if (!list.contains(new User(name, i))) {	//names are reapiting, fix this
				list.add(new User(name, i));
			}
		}
		
		list.forEach( (user) -> { System.out.println(user); });//lambda
	}

}













