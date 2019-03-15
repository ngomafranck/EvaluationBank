package co.simplon.testDao;

import co.simplon.dao.CustomerDao;
import co.simplon.entities.Customer;

public class TestDaoCustomer {

	public static void lancerTests() {
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider 
		// Comment faire ici ?
		
		CustomerDao cd = new CustomerDao();		
				
		Customer c1 = new Customer(20,"Hanakin","Skywalker");
		
		if(cd.create(c1))	System.out.println("insertion ok de " + c1);
		else System.out.println("Impossible to insert, that customer already exists ");
				
		Customer c2 = cd.find(c1.getIdCust()); 		
		if(c2 == null)	System.out.println("That customer is not exist... ");
		else System.out.println("customer already exists: " + c2);
		
		c1.setFirstName("Vador");
		if(cd.update(c1)) System.out.println("ok updated " + c1);
		else System.out.println("Impossible to update ");
		
		if(cd.delete(c1))	System.out.println("delete ok " + c1);
		else System.out.println("Impossible to delete ");				
	}
}
