import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestEvalBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/EvalBank"; //driver jdbc : //machine physique+port / nom bdd
		String log = "root";
		String pwd = "root";
		
		try {
			Class.forName(driver); //Charge le driver et l'enregistre auprès du driver manager
			Connection connection = DriverManager.getConnection(url, log, pwd); //récupére une connection à partir de l'url+log+pwd
			Statement statement = connection.createStatement(); // l'objet statement permet d'executer des requetes
			
			//statement.executeQuery("DROP DATABASE IF EXISTS Bank;");
			//statement.executeQuery("CREATE DATABASE Bank;");
			//statement.executeQuery("use Bank;");
			//String str = "select * from T_Comptes inner join T_Clients on T_Comptes.CodeCli = T_Clients.CodeCli where T_Comptes.CodeCli=1;";
			/*
			 * ResultSet resultSet = statement.executeQuery(str); while(resultSet.next()) {
			 * System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " +
			 * resultSet.getString(3) + " " + resultSet.getInt(4) + " " +
			 * resultSet.getInt(5)); }
			 */
			
		/*	statement.executeQuery("insert into T_Clients (CodeCli,Nom,Prenom) values(1,'El babili','mohamed');");
			statement.executeQuery("insert into T_Clients (CodeCli,Nom,Prenom) values(2,'Ezzaouia','saadia');");
				
			statement.executeQuery("insert into T_Comptes (NumCpte,Solde,CodeCli) values(200,10000,1);");
			statement.executeQuery("insert into T_Comptes (NumCpte,Solde,CodeCli) values(250,15000,1);");
			statement.executeQuery("insert into T_Comptes (NumCpte,Solde,CodeCli) values(300,250000,2);");
		*/	
					
		/*	String str = "CREATE TABLE T_Clients (" + 
					"	CodeCli					int(4)		PRIMARY KEY AUTO_INCREMENT," + 
					"	Nom						varchar(20)	NOT NULL," + 
					"	Prenom					varchar(20)	NOT NULL" + 
					") ENGINE = InnoDB;";			
			statement.executeQuery(str);
			
			str = "CREATE TABLE T_Comptes (" + 
					"	NumCpte				int(4)		PRIMARY KEY AUTO_INCREMENT," + 
					"	Solde				int(4)		NOT NULL DEFAULT 0," + 
					"	CodeCli				int(4)		NOT NULL REFERENCES T_Clients(CodeCli)" + 
					") ENGINE = InnoDB;";
			statement.executeQuery(str);*/
			
			
			//String str = "INSERT INTO T_Users (Login, Password) VALUES ( 'Brad' ,'pit' );";			
			//statement.executeQuery(str);
			
			//String str = "update T_Users set Login='Anderson' where IdUser=1;";			
			//statement.executeQuery(str);
			
			//String str = "delete from T_Users where IdUser=7;";			
			//statement.executeQuery(str);
			
			/*
			 * String str = "select * from T_Users;"; 
			 * ResultSet resultSet = statement.executeQuery(str);			//l'objet resultSet contient le résultat d'une requête
			 * 
			 * while(resultSet.next()) { 
			 * 		int id = resultSet.getInt(1); 
			 * 		String login = resultSet.getString(2); 
			 * 		String password = resultSet.getString(3); 
			 * 		int connectionNumber = resultSet.getInt(4);
			 * 
			 * 		System.out.println(id + " " + login + " " + password + " " + connectionNumber); 
			 * }
			 */
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
