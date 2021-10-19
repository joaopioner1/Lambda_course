package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {

		greetCustomer(new Customer("Joao", "981811615", 800));
		greetCustomerConsumer.accept(new Customer("ISA", "77777777", 222));
		greetCustomerConsumerV2.accept(new Customer("adriana", "7777777", 22), true);
	}

	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) -> System.out
			.println("Name: " + customer.customerName + "PHONE: " + (showPhone ? customer.customerPhone : "********"));

	static Consumer<Customer> checkSalary = salary -> System.out.println("SALARY" + salary);

	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
			"Hello " + customer.customerName + ", thank you for registering phone number " + customer.customerPhone);

	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + ", thank you for registering phone number "
				+ customer.customerPhone);
	}

	static class Customer {
		private final String customerName;
		private final String customerPhone;
		private double salary;

		public Customer(String customerName, String customerPhone, double salary) {
			this.salary = salary;
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}

	}
}
