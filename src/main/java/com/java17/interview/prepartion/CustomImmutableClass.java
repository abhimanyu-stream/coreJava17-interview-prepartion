package com.java17.interview.prepartion;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CustomImmutableClass {

	public static void main(String[] args) {


		//Declare class as final.
		//Make all properties as private final.
		//Do not declare setters. Only getters.
		//Declare all args constructor.
		//If there are custom nested objects in the class as properties,, implement clone.
		//If there are other types of nested objects as properties, perform a deep copy.



	}

	final class Employee{

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

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public Address getAddress() {
			return address;
		}

		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public Map<String, String> getMetadata() {
			return metadata;
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

	final class Address{

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
	}

}
