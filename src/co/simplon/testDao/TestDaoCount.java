package co.simplon.testDao;

import java.util.Date;

import co.simplon.dao.CountDao;
import co.simplon.entities.Count;

public class TestDaoCount {
	
	public static void lancerTests() {
		// le principe de base d'un programme de tests, 
		// c'est qu'on doit passer par tous les chemins pour valider
		// Comment faire ici ?
		
		CountDao cod = new CountDao();
		
		Count cpt1 = new Count(123456,Now(),2500,1);
			
			
		if(cod.create(cpt1))	System.out.println("Count is created: its ok " + cpt1);
		else System.out.println("Impossible to create a count ");
		
		Count cpt2 = cod.find(cpt1.getNumCt());
		if(cpt2 == null)	System.out.println("That Count is not exist in the database... ");
		else System.out.println("Count already exists... " + cpt2);
		
		cpt1.setAmount(cpt1.getAmount() + 5000);
		if(cod.update(cpt1))	System.out.println("updated " + cpt1);
		else System.out.println("Impossible to update ");
		
		if(cod.delete(cpt1))	System.out.println("count is deleted " + cpt1);
		else System.out.println("Impossible to delete! ");
	}

	private static Date Now() {
		// TODO Auto-generated method stub
		return null;
	}
}
