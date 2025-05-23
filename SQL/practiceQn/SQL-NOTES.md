DATA:-
	data is a raw fact which is describe of attributes an entity.

DATABASE:-
	it is a place where we store our data in systamatic and orgnazid way.
	Types- CRUD
		create retreive update delete.

DATABASE MANAGEMENT SYSTEM:-
			it is a software where we manage and maintain our database.
			it provides security and authorization to our data.
			we use query to communicate with dbms.
Types of DBMS:-
	1.NETWORK DBMS
	2.OBJECT ORIENTED DBMS
	3.HEIRARCHICAL DBMS
	4.RELATIONAL DBMS

RDBMS:-
	it is a software to store our data in table form.
	we use sql to communicate the rdbms.
SQL- structured query language.

Data Types:-
	it is used to explain which type of data we store in particular column.
	1.char(2000):- store data in characters format.There are some wastage of memory when we have empty data on memory location.
	2.varchar(2000):- there is no wastage of memory becauase he remove extra spaces on memory. / varchar2(4000).
	3.number(precision,[scale]):- store numeric value. scale is optional.
	4.date:- dd-mon-yy, dd-mon-yyyy.
	5.large object:-character(4gb), binary(img,video,files).

Constraints:-
	they are the condition that be assign for the extra validation in particular column.
	this are the condition is optional not mendatory.
	1.unique- not repeating data.
	2.not null- not be empty cell.
	3.check- used to extra validation.
	4.primary key- must be unique and only one in table.
	5.foreign key- it use to stablished connection between two table and foreign key many of in table.

Statement of SQL:-
	1.ddl(data defination language)
	2.dml(data manuplation language)
	3.dcl(data control language)
	4.tcl(transaction control language)
	5.dql(data query language)

DDL:-
	1.create
		CREATE TABLE TABLE_NAME(
			TABLE_NAME CAHR(value),
			TABLE_NAME VARCHAR(value),
			TABLE_NAME NUMBER(value),
			TABLE_NAME DATE,

			COLUMN_NAME DATATYPE NOT NULL,

			CONSTRAINT Constraint_ref_name CHECK(COLUMN_NAME),
			CONSTRAINT Constraint_ref_name PRIMARY KEY(COLUMN_NAME),
			CONSTRAINT Constraint_ref_name UNIQUE(COLUMN_NAME),
			CONSTRAINT Constraint_ref_name FOREIGN KEY(COLUMN_NAME) REFERENCES PARENT_TABLE_NAME
		);

	2.rename
		RENAME OLD_TABLE_NAME TO NEW_TABLE_NAME;
	
	3.alter	
		ALTER TBALE TABLE_NAME
		ADD COLUMN_NAME  DATATYPE(__);
		// DROP COLUMN COLUMN_NAME;
		// MODIFY COLUMN_NAME NEW_DATATYPE;
		// RENAME COLUMN COLUMN_NAME TO NEW_NAME; 
	
	4.truncate
		TRUNCATE TABLE TABLE_NAME;
		
	5.delete
		DROP TABLE TABLE_NAME;

	// FLASHBACK TABLE TABLE_NAME
		TO BEFORE DROP; /- to retreive the table which is deleted by drop.
	// PURGE TABLE STUDENT;

DML:-
	1.insert
		INSERT INTO TABLE_NAME VALUES(V1,V2,V3...);
		// INSERT INTO TABLE_NAME(COL1,COL2,COL3.....) VALUES(V1,V2,V3....);
		// INSERT INTO TABLE_NAME(COL1,COL2,COL3.....) VALUES(&V1,&V2,&V3....); 
		---USING '/' TO USE THIS QUERY AGAIN AND AGAIN.
	
	2.update
		UPDATE TABLE_NAME
		SET COL1=V1,COL2=V2....COLn=Vn;
		WHERE <FILTER CONDITION>
		
	3.delete
		DELETE
		FROM TABLE_NAME
		WHERE <FILTER CONDITION>

DCL:-
	1.grant
		GRANT sql_statement ON TABLE_NAME
			to user_name;

	2.revoke
		REVOKE sql_statement ON TABLE_NAME
			FROM user_name;

TCL:-
	1.commit
		COMMIT;

	2.savepoint
		SAVEPOINT SAVEPOINT_NAME;

	3.rollback
		ROLLBACK TO SAVEPOINT_NAME;		

DQL:-
	1.select	2.projection	3.selection		4.joins

exp/- 
	select */[distinct] col-name/expression [alias]
	from table-name
	where <filter condition>
	group by col/expression
	having <condition>;

	FUNCTIONS/- max,min,avg,sum,count(); 
			written in select statement.

SQL Syntax and Clauses:-

	WHERE: Filters records based on specified conditions.
	ORDER BY: Sorts the result set in ascending or descending order.
	GROUP BY: Groups rows sharing a property so aggregate functions can be applied.
	HAVING: Filters records based on aggregate functions.
	JOIN: Combines rows from two or more tables based on a related column.
		INNER JOIN/-Returns rows when there is a match in both tables.
		SELECT table1.column1, table2.column2
		FROM table1
		INNER JOIN table2
		ON table1.common_column = table2.common_column;

		LEFT JOIN (LEFT OUTER JOIN)/-Returns all rows from the left table and matched rows from the right table. If no match is found, NULL values are returned for columns from the right table.
		SELECT table1.column1, table2.column2
		FROM table1
		LEFT JOIN table2
		ON table1.common_column = table2.common_column;

		RIGHT JOIN (RIGHT OUTER JOIN)/-Returns all rows from the right table and matched rows from the left table. If no match is found, NULL values are returned for columns from the left table.
		SELECT table1.column1, table2.column2
		FROM table1
		RIGHT JOIN table2
		ON table1.common_column = table2.common_column;

		FULL JOIN (FULL OUTER JOIN)/-Returns all rows when there is a match in either left or right table. If there is no match, NULL values are returned for columns from the table without a match.
		SELECT table1.column1, table2.column2
		FROM table1
		FULL JOIN table2
		ON table1.common_column = table2.common_column;



IMPORATANT QUESTIONS-
Qn1) difference between dbms and rdbms?
Qn2) rules of edger f. cord?
Qn3) datatypes are mandatory?