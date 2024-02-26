package com.java17.interview.prepartion;

import java.util.*;

public class CustomImmutableClass {

	public static void main(String[] args) throws CloneNotSupportedException {


		//Declare class as final.
		//Make all properties as private final.
		//Do not declare setters. Only getters.
		//Declare all args constructor.
		//If there are custom nested objects in the class as properties,, implement clone.
		//If there are other types of nested objects as properties, perform a deep copy.

		Address address1 = new Address("s1", "c1");
		List<String> phoneNumbers = new ArrayList<>();
		phoneNumbers.add("123345");
		phoneNumbers.add("456789");
		Map<String, String> metadata = new HashMap<>();
		metadata.put("hobby", "Watching Movies");

		Employee e = new Employee("Mindranda", 23, address1, phoneNumbers, metadata);

		// trying to Employee Object modifications, but not able to do so.Thus Immutable. achieved by Cloneble Interface, clone() method., final keywords, priavte access modifiers.
		e.getAddress().setCity("c3");
		e.getAddress().setStreet("s3");

		e.getPhoneNumbers().add("1234");
		e.getMetadata().put("skill", "Java");
		e.getMetadata().put("designation", "HR");

		System.out.println(e.getEmpName());
		System.out.println(e.getAge());
		System.out.println(e.getAddress());
		System.out.println(e.getPhoneNumbers());
		System.out.println(e.getMetadata());


	}

	static final class Employee{

		private final String name;
		private final int age;
		private final Address address;
		private final List<String> phoneNumbers;
		private final Map<String, String> metadata;


		public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata){
			this.name = name;
			this.age = age;
			this.address = address;
			this.phoneNumbers = phoneNumbers;
			this.metadata = metadata;
		}

		public String getEmpName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		// clone the address object
		public Address getAddress() throws CloneNotSupportedException {
			return (Address) address.clone();
		}

		// deep copy the list of phone numbers
		public List<String> getPhoneNumbers() {
			return new ArrayList<>(phoneNumbers);
		}

		// deep copy the map of metadata
		public Map<String, String> getMetadata() {
			return new HashMap<>(metadata);
		}
		@Override
		public String toString() {
			return "Employee{" +
					"name='" + name + '\'' +
					", age=" + age +
					", address=" + address +
					", phoneNumbers=" + phoneNumbers +
					", metadata=" + metadata +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Employee employee = (Employee) o;
			return age == employee.age && name.equals(employee.name) && address.equals(employee.address) && phoneNumbers.equals(employee.phoneNumbers) && metadata.equals(employee.metadata);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age, address, phoneNumbers, metadata);
		}
	}

	static final class Address implements Cloneable {

		private String street;
		private String city;

		public Address(String street, String city) {
			this.street = street;
			this.city = city;
		}

		@Override
		public String toString() {
			return "Address{" +
					"street='" + street + '\'' +
					", city='" + city + '\'' +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Address address = (Address) o;
			return street.equals(address.street) && city.equals(address.city);
		}

		@Override
		public int hashCode() {
			return Objects.hash(street, city);
		}
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}

}
