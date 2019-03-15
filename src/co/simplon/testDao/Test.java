package co.simplon.testDao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		/*
		 * TestDaoCustomer.lancerTests(); System.out.println("\n\n");
		 * TestDaoCount.lancerTests();
		 */
		// TODO Auto-generated method stub
		String driver = "org.mariadb.jdbc.Driver";   //pilote utilisé pour permettre la connection à MariaDB
		String url = "jdbc:mariadb://localhost:3306/EvalBank"; // Lien de localisation du projet EvalDB ici l'ordinateur meme joue le role de serveur
		String username = "root";  // C'est le login de connexion
		String password = "root";  // Mot de passe utlisateur

		try {

			Class.forName(driver);   // Les instances de la classe Class sont des objets représentant les classes du langage.
			Connection connection = DriverManager.getConnection(url, username, password); // Type connexxion
			System.out.println("Connection réussie");
			Statement statement = connection.createStatement();

			// String res = "create database EvalBank;";

//			String ste = "create table EvalBank.T_Customers(" + "IdCust  int(4)		PRIMARY KEY AUTO_INCREMENT,"
//					+ "Name      varchar(20)   NOT NULL," + "FirstName   varchar(20)   NOT NULL" + ");";

//			
//			  String ste = "create table EvalBank.T_Counts("+
//			  "NumCt int(4)   PRIMARY KEY AUTO_INCREMENT," +
//			  "DateCreation date  NOT NULL,"+
//			  "Balance   float(4) NOT NULL DEFAULT 0," +
//			  "IdCust int(4)   NOT NULL REFERENCES T_Customers(IdCust)" + ");";
//			
//			 String ste = "create table EvalBank.T_Operations("+
//			 "NumoP int(4)   PRIMARY KEY AUTO_INCREMENT," +
//			 "Amount   float(4) NOT NULL DEFAULT 0," +
//			 "NumCt  int(4)   NOT NULL REFERENCES T_Operations(NumCt)" + ");";
			
//			  statement.executeQuery(ste); 
//			  ResultSet result = statement.executeQuery(ste);
			 
//					  
//					  String str = "create table T_Comptes("+
//					  "NumCpte int(4)   PRIMARY KEY AUTO_INCREMENT," +
//					  "Solde   float(4) NOT NULL DEFAULT 0," +
//					  "CodeCli int(4)   NOT NULL REFERENCES T_Clients(CodeCli)" + ");";

			// String Delete = "DELETE FROM T_Customers where IdCust=3 ; ";
			// String update = "UPDATE  T_Customers set Name= 'Bob' where IdCust=1 ; ";
			
		//	 String str = "INSERT INTO T_Counts (NumCt, DateCreation,Balance, IdCust) VALUES ( 6, now() , 55000, 1 );";
		//	 String str ="INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 1, 'Makana' ,	'Banjamin' );";
		//	 String str ="INSERT INTO T_Operations (NumOp, Amount, NumCt) VALUES (7, 12900 , 11 );";

			
		//	 String str= "SELECT * FROM T_Counts INNER JOIN T_Customers ON  T_Counts.IdCust =T_Customers.IdCust; ";
		//	 String str= "SELECT * FROM T_Counts INNER JOIN T_Customers ON  T_Counts.IdCust =T_Customers.IdCust where T_Customers.IdCust=1; ";
	//		 String str= "SELECT * FROM T_Operations INNER JOIN T_Counts ON  T_Operations.NumCt =T_Counts.NumCt; ";
			
			statement.executeQuery(update);

			ResultSet result = statement.executeQuery(update);

			while (result.next()) {
				 System.out.println(result.getInt(1) + " " + result.getString(2) + " " +
				 result.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
