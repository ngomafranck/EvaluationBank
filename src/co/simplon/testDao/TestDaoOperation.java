package co.simplon.testDao;

import co.simplon.dao.OperationDao;
import co.simplon.entities.Operation;

public class TestDaoOperation {

	public static void lancerTests() {
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider 
		// Comment faire ici ?
		
		OperationDao od = new OperationDao();		
				
		Operation o1 = new Operation(30,5000, 8);
		
		if(od.create(o1))	System.out.println("Operation Ok " + o1);
		else System.out.println("Impossible to insert, that operation was already did ");
				
		Operation o2 = od.find(o1.getNumOp()); 		
		if(o2 == null)	System.out.println("That operation was not yet did... ");
		else System.out.println("customer already exists: " + o2);
		
		o1.setAmount(550);
		if(od.update(o1)) System.out.println("ok updated " + o1);
		else System.out.println("Impossible to update ");
		
		if(od.delete(o1))	System.out.println("delete ok " + o1);
		else System.out.println("Impossible to delete ");				
	}
}
