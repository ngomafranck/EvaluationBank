-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS Bank;
CREATE DATABASE Bank;
USE Bank;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Customers                                ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Customers (
	IdCust			int(4)		PRIMARY KEY AUTO_INCREMENT,
	Name			varchar(20)	NOT NULL,
	FirstName		varchar(20)	NOT NULL
	
) ENGINE = InnoDB;

INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 1, 'Makana' ,	'Banjamin' );
INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 2, 'NGOUAMA',	'Jean Pierre' );
INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 3, 'NGOMA' ,		'Prince Deogratias' );
INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 4, 'Rastide',		'jane' );
INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 5, 'Ballois' ,		'Christ' );

SELECT * FROM T_Customers;

-- -----------------------------------------------------------------------------
-- - Construction de la table des Counts 	---
-- -----------------------------------------------------------------------------

CREATE TABLE T_Count (
	NumCt				int(4) 		PRIMARY KEY AUTO_INCREMENT,  
        Balance                         float(8)        NOT NULL ,
        DateCreation                    datetime    	NOT NULL DEFAULT CURRENT_TIMESTAMP
	IdCust				int(4)		NOT NULL REFERENCES T_Customers(IdCust)
) ENGINE = InnoDB;

INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 5,150,now() ,2);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 6, 200,now(),2);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 10,100,now() ,1);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 20, 50,now(),1);

SELECT * FROM T_Counts;

-- -----------------------------------------------------------------------------
-- - Construction de la table des Operations 	---
-- -----------------------------------------------------------------------------


CREATE TABLE T_Operations (
        NumOp                          int(4)         	PRIMARY KEY AUTO_INCREMENT,  
        Amount                         float(8)       	NOT NULL,
	NumCt                          int(4) 		NOT NULL REFERENCES T_Counts(NumCt)  
) ENGINE = InnoDB; 

INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 1,250,1);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 2,50,1);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 3,90,1);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 4,80,2);
INSERT INTO T_Counts (NumCt,Balance,DateCreation, IdCust) VALUES ( 5,200,2);
 


