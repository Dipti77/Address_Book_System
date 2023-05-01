package com.bridgelabz;

public class AddressBook {
		
		Contacts person = new Contacts();
		
		public void getContact(){
			
	        person.getPersonDetails();

	    }

		@Override
		public String toString() {
			return "AddressBook [person=" + person + "]";
		}
		
	}
