package functionalinterface;

public class _Predicate {

	public static void main(String[] args) {
		
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("07000911111"));

	}
	
	static boolean isPhoneNumberValid(String pNumber) {
		return pNumber.startsWith("07") && pNumber.length() == 11;
	}

}
