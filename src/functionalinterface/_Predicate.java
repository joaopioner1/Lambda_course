package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		System.out.println(isPhoneNumberValid("0700000000")); //FALSE
		System.out.println(isPhoneNumberValid("07000911111")); //TRUE
		System.out.println("---------");
		System.out.println(isPhoneNumberValidPredicate.test("0700000000")); //FALSE
		System.out.println(isPhoneNumberValidPredicate.test("07000911111")); //TRUE
		System.out.println("---------");
		//Conecting predicates
		System.out.println(
				isPhoneNumberValidPredicate
				.and(containsNumber3).test("076983025749")); //can be "or" instead of "and"
		
	}
	//Normal function
	static boolean isPhoneNumberValid(String pNumber) {
		return pNumber.startsWith("07") && pNumber.length() == 11;
	}
	
	//Lambada function
	static Predicate<String> isPhoneNumberValidPredicate = 
			pNumber -> pNumber.startsWith("07") && pNumber.length() == 11;
			
	static Predicate<String> containsNumber3 = 
			pNumber -> pNumber.contains("3");
}


