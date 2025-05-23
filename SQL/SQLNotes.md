# SQL ( STRUCTURED QUERY LANGUAGE )

# COMMANDS ON SQL*Plus :-
1. CLEAR SCREEN [ CL SCR ] : To clear the screen 
2. SET LINES 100 PAGES 100 : To set the dimensions of the Output page .
3. EXIT / QUIT : To Close the Software .
4. When account is Locked !!!
➢ Log in as SYSTEM 
➢ Password TIGER  
➢ ALTER USER SCOTT ACCOUNT UNLOCK ; 
➢ ALTER USER SCOTT IDENTIFIED BY TIGER ;
5. SELECT * FROM TAB ;

# DATA :-
    "Data is a raw-fact which describes the attribute of an Entity."
    Exp :-
        Water Bottle(Entity) -> Height(Attributes) : 20cm , Color(Attributes) : black , Capacity(Attributes) : 500ml

# DATABASE :-
    "Database is place or medium in which we store the data in a Systematic and Organized manner."
    
1.) The basic operation that can be performed on a database are
    * CREATE / INSERT
    * READ / RETRIEVE
    * UPDATE / MODIFY
    * DELETE / DROP

2.) These operations are reffered as "CRUD" Operations.

# DATABASE MANAGEMENT SYSTEM (DBMS) :-
    "it is a software which is used to maintain and manage the database."

1. Security and Authorization are two important features that DBMS provides.
2. We use query language to communicate or intract with DBMS.
3. DBMS stores in the form of files.
    1.)Network DBMS
    2.)Object Oriented DBMS
    3.)Heirarchichal DBMS
    4.)Reletional DBMS
    
# RELETIONAL DATABASE MANAGEMENT SYSTEM (RDBMS) :-
    "it is a type of DBMS software in which we store the data in the form of Tables(row & column).
1. We use SQL to communicate or inract with RDBMS.
2. RDBMS stores the data in the form of Tables.

# RELETIONAL MODEL :-
    Reletional Model is designed by E.F.CODD 
    In Reletional Model we can store the data in the form of tables.

    TABLE :- "it is a logical organization of data which consists of Column & Rows.

# RULES OF E.F.CODD :-
1. The data entered into a cell must always be a single value data.
2. According to E.F.CODD  we can store the data in Multiple Tables, if we needed we can establish 
    a connection between the tables with the help of key Attributes.
3. In RDBMS we store everything in the form of table including MetaData.
    Exp :- Metadata : The details about a data is known as Metadata.
4. The Data entered into the table can be validated in 2 steps.
    a) By assigning Datatypes
    b) By assigning Contraints
    Datatypes are mendatory but Constraints are Optional.

# DATATYPES :-
    it is used to specify or determine the type of data that will be stored in a particular memory location.
    NOTE :- SQL is not a case Senstive Language.

# DATATYPES IN SQL :-
1. Char :-
    a.)In character datatype we can store 'A-Z' , 'a-z' , '0-9' And Special Characters( $ , & , @ , ! … ) .
    b.)Characters must always be enclosed within single quotes ' '. 
    c.)Whenever we use char datatype we must mention size 
    Size : it is used to specify number of characters it can store .
    The maximum number of characters it can store is 2000ch.
    d.)Char follows fixed length memory allocation.
    Syntax: CHAR ( SIZE )

2. VARCHAR :-
    a.)In varchar datatype we can store 'A-Z' , 'a-z' , '0-9' And Special Characters( $ , & , @ , ! … ) .
    b.)Characters must always be enclosed within single quotes ' '. 
    c.)Whenever we use char datatype we must mention size 
    Size : it is used to specify number of characters it can store .
    The maximum number of characters it can store is 2000ch.
    d.)VarChar follows variable length memory allocation.
    Syntax: VARCHAR ( SIZE )
    NOTE : VARCHAR2 : it is an updated version of varchar where in
    We can store up to 4000Ch.
    Syntax: VARCHAR2 ( SIZE )

3. NUMBER :-
    It is used to store numeric values .
    SYNTAX: NUMBER( Precision , [Scale])

a.) Precision: it is used to determine the number of digits used
    To store integer value .

b.) Scale :it is used to determine the number of digits used to store
    Decimal ( floating ) value within the precision
    Scale is not mandatory , and the default value of scale Is zero ( 0) .

    Example : Number ( 3 ) +/-999
    Example : Number ( 5 , 2 ) +/-999.99
    Example : Number ( 5 , 8 ) +/-.00099999

4. DATE :-
    it is used to store dates in a particular format .
    It used Oracle specified Format.
    'DD-MON-YY' OR 'DD-MON-YYYY'
    '22-JUN-20'    '22-JUN-2020'
    SYNTAX: DATE

5. LARGE OBJECT :-
    a.) Character large object ( CLOB ) :-
        It is used to store characters up to 4 GB of size .

    b.) Binary large object ( BLOB ) :-
        It is used to store binary values of images , mp3 , mp4 Documents etc …. Up to 4GB of size .

# CONSTRAINTS :-
    It is a rule given to a column for validation .

# TYPES OF CONSTRAINS :-
1. UNIQUE:-
    "It is used to avoid duplicate values into the column".

2. NOT NULL:-
    "It is used to avoid Null ".

3. CHECK:-
    "It is an extra validation with a condition If the condition is satisfied then the value is accepted else Rejected".

4. PRIMARY KEY :-
    "It is a constraint which is used to identify a record Uniquely from the table" .

# Characteristics of Primary key :-
    1. We can have only 1 PK in a table
    2. PK cannot accept duplicate / repeated values .
    3. PK cannot accept Null
    4. PK is always a combination of Unique and Not Null Constraint.
    5. FOREIGN KEY: "It is used to establish a connection between the The tables"

# Characteristics of Foreign key :-
    1. We can have only Multiple FK in a table
    2. FK can accept duplicate / repeated values .
    3. FK can accept Null
    4. FK is not a combination of Unique and Not Null Constraint.
    5. For an Attribute ( column ) to become a FK ,it is mandatory That it must be a PK in its own table .

    NOTE : NULL
    Null Is a keywordwhich is used to represent Nothing / Empty Cell.

# Differentiate between Primary key and Foreign key ?
A.) PRIMARY KEY :-
1. It is used to identify a records Uniquely from the table.
2. It cannot accept Null.
3. It cannot accept duplicate values.
4. It is always a combination of Not Null and Unique constraint
5. We can have only 1 PK in a table.

B.) FOREIGN KEY :-
1. It is used to establish a connection Between the tables
2. It can accept Null
3. It can accept duplicate values
4. It is not a combination of Not Null and Unique constraint 
5. We can have Multiple FK in a table

# Characteristics of Null : -
1. Null doesn’t represent 0 or Space . 
2. Any operations performed on a Null will result in Null itself 
3. Null doesn’t Occupy any Memory . 
4. Null doesn’t Occupy any Memory . 
5. We cannot Equate Null . 

# OVERVIEW OF SQL STATEMENTS :-
1. DATA DEFINITION LANGUAGE ( DDL )
2. DATA MANIPULATION LANGUAGE ( DML )
3. TRANSCATION CONTROL LANGUAGE ( TCL )
4. DATA CONTROL LANGUAGE ( DCL )
5. DATA QUERY LANGUAGE ( DQL )

# DATA QUERY LANGUAGE ( DQL _) :-
    " DQL is used to retrieve the data from the database " 
    it had 4 statements :

# SELECT : "It is used to retrieve the data from the table and display it.
    Exp :-
        SELECT * FROM TAB;

# PROJECTION :-
    "It is a process of retrieving the data by selecting only the columns is known as Projection".
    In projection all the records / values present in a particular column are by default selected .
    SYNTAX : 
    SELECT * / [DISTINCT] Column_Name / Expression [ALIAS]
    FROM Table_Name ; 

    a.) It is a process of retrieving the data by selecting only the columns is known as Projection.
    b.) In projection all the records / values present in a particular column are by default selected .

    1)DISTINCT :-
    " It is used to remove the duplicate or repeated values from the Result table " . 
    1. Distinct clause has to be used As the first argument to select clause .
    2. We can use multiple columns As an argument to distinct clause, it will remove the combination of columns in which the records are duplicated .

    2)EXPRESSION :-
    "A statement which gives result is known as Expression ".
    Expression is a combination Operand and Operator .

    Operand : These are the values that we pass .
    Operator : These are the Symbols which perform some Operation on The Operand .
    Example : 5 * 10 

    3)ALIAS :-
    "It is an alternate name given to a Column or an Expression In the result table " .
    1. We can assign alias name with or without using 'As' keyword .
    2. Alias names have to be a single string which is separated by An underscore or enclosed within double quotes . 
    Select sal*12 Annual_Salary 
    From emp ; 

# SELECTION :-
    "It is a process retrieving the data by selecting both the columns and rows is known as Selection " .
    SYNTAX : 
    SELECT * / [DISTINCT] Column_Name / Expression [ALIAS]
    FROM Table_Name 
    WHERE <Filter_Condition> ; 

    ORDER OF EXECUTION => FROM => WHERE => SELECT

    WHERE Clause :-
    "Where clause is used to filter the records ".on the basis of specific condition

# OPERATORS :-
1. ARITHEMATIC OPERATORS :- ( + , - , * , / )
2. CONCATENATION OPERATOR :- ( || )
3. COMPARISION OPERATORS :- ( = , != or <> )
4. RELATIONAL OPERATOR :- ( > , < , >= , <= )
5. LOGICAL OPERATOR : ( AND , OR , NOT )
6. SPECIAL OPERATOR :- (IN, NOT IN, NOT BETWEEN, IS, IS NOT, LIKE NOT LIKE)
A.) IN :- 
    It is a multi-valued operator which can accept multiple values At the RHS .
    SYNTAX: Column_Name / Exp IN ( v1 , v2 , . . Vn ) 

B.) NOT IN :-
    It is a multi-valued operator which can accept multiple values At the RHS . It is similar to IN op instead of selecting it Rejects the values .
    SYNTAX: Column_Name / Exp NOT IN ( v1 , v2 , . . vn ) 

C.) BETWEEN :- "It is used whenever we have range of values " [ Start value and Stop Value ] .
    SYNTAX: Column_Name BETWEEN Lower_Range AND Higher_Range ;

D.) NOT BETWEEN :- It is Opposite of Between .
    SYNTAX:- Column_Name NOT BETWEEN Lower_Range AND Higher_Range ;

E.) IS : "It is used to compare only NULL "
    Syntax: Column_Name IS NULL ;

F.) IS NOT : "It is used to compare the values with NOT NULL ".
    Syntax: Column_Name IS NOT NULL ;

G.) LIKE : "It is used for Pattern Matching ".
    To achieve pattern matching we use special characters .
    Percentile (%) 
    Underscore ( _ )
    Syntax: Column_Name LIKE 'pattern' ;

H.) NOT LIKE :- Opposite of Like .
    Syntax: Column_Name NOT LIKE 'pattern' ;

7. SUBQUERY OPERATORS:- (ALL, ANY, EXISTS, NOT EXISTS)
8. CONCATENATION Operator :- " It is used to join the strings ".
    Symbol : || 
9. LOGICAL OPERATORS :- (AND, OR, NOT)

# FUNCTIONS :-
    Are a block of code or list of instructions which are used to perform a specific task .
    There are 3 main components of a function 
    1. Function_Name 
    2. Number_of_arguments ( no of inputs )
    3. Return type

# Types of Functions in SQL :-
1. SINGLE ROW FUNCTIONS
2. MULTI ROW FUNCTIONS

# SINGLE ROW FUNCTION :-
1. LENGTH :-
    "It is used to count the number of characters present In the given string ".
    SYNTAX: LENGTH ( 'string' )

# NOTE : DUAL TABLE
    It is a DUMMY table which has 1 col and 1 row .
    Which is used to output the result .

    SELECT DUAL;
OR
    SELECT * FROM DUAL;

2. CONCAT() : "It is used to join the given two strings '
    SYNTAX : CONCAT ( 'string1' , 'String2' ) 

3. UPPER() : "It is used to convert a given string to upper case "
    SYNTAX: UPPER ( 'string' ) 

4. LOWER() : "It is used to convert a given string to lower case "
    SYNTAX: LOWER( 'string' )

5. initcap() : "It is used to convert a given string to initial capital letter case ".
    SYNTAX: INITCAP( 'string' ) 

6. REVERSE(): "It is used to reverse a given string ".
    SYNTAX: REVERSE( 'string' )

7. SUBSTR : "It is used to extract a part of string from the given Original string " .
    SYNTAX: SUBSTR ( 'Original_String' , Position , [  Length ] ) 

8. REPLACE () : "It is used to replace a string with another string in The original string.
    SYNTAX:REPLACE ( 'Original_String' , 'string' [, 'new_String' ] )

# NOTE : if the third argument is not mentioned the default Value of it is Null .

9. INSTR () : 
    "it is used to obtain the position in which the string is present in the Original string ".
    It is used to search for a string in the Original string if present it returns the POSITION Else it returns 0 ".
    Syntax: INSTR( 'Original_String' , 'String' , Position [, Occurrence] ) 

10. MOD() : "It is used to obtain modulus/remainder of the given number " 
    Syntax: MOD ( m , n )

11. ROUND() : " It is used to Round-off the given number based on the scale value "
    Syntax: ROUND ( Number [, Scale ] )

12. TRUNC() : 
    "It is similar to ROUND() but it always rounds-off the given number to the lower value "
    Syntax: TRUNC( Number [, Scale ] )

# NOTE :-
    DATE COMMANDS : 
    i.) SYSDATE : " it is used to obtain Todays Date " 
    ii.) CURRERNT_DATE : " it is also used to obtain todays date " 
    iii.) SYSTIMESTAMP : "It is used to obtain date , time and time zone " 

SQL> SELECT SYSDATE 
    2 FROM DUAL ;
SYSDATE
---------------
17-MAY-20

SQL> SELECT CURRENT_DATE 
    2 FROM DUAL ;
CURRENT_D
------------------
17-MAY-20

SQL> SELECT SYSTIMESTAMP
    2 FROM DUAL ;
SYSTIMESTAMP
---------------------------------------------------
17-MAY-20 05.05.52.356000 PM +05:30

13. MONTHS_BETWEEN() :
    "It is used to Obtain the number of months present between the Given two dates " 
    Syntax: MONTHS_BETWEEN ( DATE1 , DATE2 )

14. LAST_DAY( ): " it is used to Obtain the last day in the particular of the given date" . 
    Syntax: LAST_DAY( DATE ) ;

15. TO_CHAR( ) :
    "It is used to convert the given date into String format based on the Model given "
    Syntax: TO_CHAR( DATE , 'Format _ Models')

# Format Models :-
i.) YEAR : TWENTY TWENTY 
ii.) YYYY : 2020
iii.) YY : 20
iv.) MONTH : JULY
v.) MON : JUL
vi.) MM : 07
vii.) DAY : WEDNESDAY
viii.) DY : WED
ix.) DD : 08
x.) D : 4 ( day of the week ) 
xi.) HH24 : 17 hours
xii.) HH12 : 5 hours
xiii.) MI : 22 minutes 
xiv.) SS : 53 seconds 
xv.) 'HH12:MI:SS' : 5 : 22 : 53 
xvi.) 'DD-MM-YY' : 17 - 05 - 20
xvii.) 'MM-DD-YYYY' : 05 - 17 - 2020 

16. NVL() :
    [ NULL VALUE LOGIC ] " It is used to eliminate the side effects of using null in arithmetic operations " .
    Syntax : NVL ( Argument1 , Argument2 )

Argument 1 : Here write any column / exp which can result In null . 
Argument 2 : Here we write a numeric value which will be substituted 
if argument 1 results in Null , 
If argument 1 is NOT NULL then the same value will be considered .

# MULTI ROW FUNCTIONS :-
    It takes all the inputs at one shot and then executes and provides A single output .
    If we pass 'n' number of inputs to a MRF( ) it returns '1' Output .

# List of MRF () :-
1. MAX() :- it is used to obtain the maximum value present in the column.
2. MIN() :- it is used to obtain the minimum value present in the column.
3. SUM() :- it is used to obtain the average of values present in the column. 
4. AVG() :- it is used to obtain the average of values present in the column.
5. COUNT :- it is used to obtain the number of values present in the column.

Note :-
    Multi row functions can accept only one argument , i.e a Column_Name or an Expression 
    SYNTAX :- MRF ( Column_Name / Exp ) 
    Along with a MRF( ) we are not supposed to use any other Column_Name in the select clause .
    MRF( ) ignore the Null .
    We cannot use a MRF( ) in where clause .
    COUNT( ) is the only MRF which can accept * as an Argument .

# GROUPING : GROUP BY Clause :-
    Group by clause is used to group the records .
    SYNTAX:
    SELECT group_by_expression / group_function
    FROM table_name 
    [WHERE <filter_condition>]
    GROUP BY column_name/expression ;

# ORDER OF EXECUTION :-
1. FROM 
2. WHERE(if used) [ROW-BY-ROW]
3. GROUP BY [ROW-BY-ROW]
4. SELECT [GROUP-BY-GROUP]

NOTE :-
1. Group By clause is used to group the records .
2. Group By clause executes row by row .
3. After the execution of Group By clause we get Groups .
4. Therefore any clause that executes after group by must execute Group By Group .
5. The Column_Name or expression used for grouping can be used In select clause .
6. Group By clause can be used without using Where clause .

# FILTERING : HAVING Clause :- 
    " Having Clause is used to Filter the Group ".
    SYNTAX:
    SELECT group_by_expression / group_function
    FROM table_name 
    [WHERE <filter_condition>]
    GROUP BY column_name/expression 
    HAVING <group_filter_condition>;

# ORDER OF EXECUTION:-
1. FROM 
2. WHERE(if used) [ROW-BY-ROW]
3. GROUP BY(if used) [ROW-BY-ROW]
4. HAVING (if used ) [GROUP-BY-GROUP]
5. SELECT [GROUP-BY-GROUP]

# Differentiate between Where and Having ?
A.) WHERE :-
1. Where clause is used to Filter the records .
2. Where clause executes row By row .
3. In Where Clause we cannot Use MRF()
4. Where clause executes before Group by clause .

B.) HAVING :-
1. Having clause is used to Filter the groups .
2. Having clause executes Group by group 
3. Can use MRF( ).
4. Having clause executes After group by clause .

# SUB-QUERY :-
    " A QUERY WRITTEN INSIDE ANOTHER QUERY IS KNOWN AS SUB QUERY "
    Let us consider two queries Outer Query and Inner Query .
1. Inner Query executes first and produces an Output .
2. The Output of Inner Query is given / fed as an Input to Outer Query .
3. The Outer Query generates the Result.
4. Therefore we can state that 'the Outer Query is dependent on Inner Query' and this is the Execution Principle of Sub Query .

# Why / When Do we use SUB QUERY :-
# CASE 1 :- 
    Whenever we have Unknowns present in the Question We use sub query to find the Unknown .

NOTE :-
1. In the Inner Query / Sub Query we cannot select more than One column .
2. The corresponding columns need not be same , but the datatypes of those has to be same .

# CASE 2 :-
    Whenever the data to be selected and the condition to be executed are present in different tables we use Sub Query . 

# TYPES OF SUB QUERY :-
1. SINGLE ROW SUB QUERY 
2. MULTI ROW SUB QUERY 

1. SINGLE ROW SUB QUERY :-
    If the sub query returns exactly 1 record / value we call it as Single Row Sub Query .
    If it returns only 1 value then we can use the normal operators Or the Special Operators to compare the values .

2. MULTI ROW SUB QUERY :-
    If the sub query returns more than 1 record / value we call it as Multi Row Sub Query .
    If it returns more than 1 value then we cannot use the normal operators We have to use only Special Operators to compare the values .

# Note :-
    It is difficult to identify whether a query Belongs Single or Multi row So , it is always recommended to use Special Operators to Compare The values .

# Sub Query Operators :-
1. ALL :-
    "It is special Op used along with a relational Op ( > , < , > = , <= ) to compare the values present at the RHS ".
    ALL Op returns true if all the values at the RHS have satisfied the condition .

2. ANY :-
    "It is special Op used along with a relational Op ( > , < , > = , <= ) to compare the values present at the RHS ".
    ANY Op returns true if one of the values at the RHS have satisfied the condition .

# NESTED SUB QUERY :-
    " A sub query written inside a sub query is known as Nested Subquery ".

Q.) SUB QUERY :-
1. What is Sub Query ? 
2. Explain ? ( draw )
3. Why ? When ?  
4. Types of Sub Query  
    ▪ Single Row Sub Query 
    ▪ Multi Row Sub Query
5. Sub Query Operators
    ▪ ALL 
    ▪ ANY 
6. Nested Sub Query .

# JOINS :-
    "It is a process of retrieving the data from Multiple tables simultaneously is known as Join".

# Types of JOINS :-
We have 5 types of joins
1. CARTESIAN JOIN / CROSS JOIN 
2. INNER JOIN / EQUI JOIN 
    i.) LEFT OUTER JOIN 
    ii.) RIGHT OUTER JOIN 
    iii.) FULL OUTER JOIN 
3. OUTER JOIN
4. SELF JOIN 
5. NATURAL JOIN .

# CARTESIAN JOIN / CROSS JOIN :-
    In Cartesian Join a record from table 1 will be merged with All the records of table 2 .

1. Number of Columns in the Result table :-
    will be equivalent to the summations of columns present in both the tables .
    Number of Col = Number of Col T1 + Number of Col T2 
                  = 2 + 2 = 4 Columns .
                
2. Number of Rows in the Result table :-
    will be equivalent to the product of number of rows present in the both the tables .
    Number of Rows = Number of Rows T1 x Number of Rows T2 
                   = 3 x 3 = 9 Rows .

# SYNTAX :- 
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 CROSS JOIN Table_Name2 ;

    2.) Oracle 
    SELECT Column_Name 
    FROM Table_Name1 , Table_Name2 ; 

# INNER JOIN :-
    "It is used to Obtain only Matching Records " Or " A records which has a Pair " .
    JOIN Condition :-
        It is a condition on which the two tables are merged .
        Syntax: Table_Name1.Col_Name = Table_Name2.Col_Name
        Join Condition :EMP.DEPTNO = DEPT.DEPTNO 

# SYNTAX :-
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 INNER JOIN Table_Name2 
    ON < JOIN_CONDITION> ;
OR
    SELECT * 
    FROM EMP INNER JOIN DEPT 
    ON EMP.DEPTNO = DEPT.DEPTNO ;

    2.) Oracle 
    SELECT Column_Name 
    FROM Table_Name1 , Table_Name2
    WHERE <JOIN_CONDITION > ;
OR
    SELECT * 
    FROM EMP , DEPT 
    WHERE EMP.DEPTNO = DEPT.DEPTNO ; 

# OUTER JOIN :-
    "It is used to Obtain Un-Matched Records ".

1. Left Outer Join :-
    "It is used to obtain Un-Matched Records of Left Table Along with Matching Records ".

# SYNTAX :- 
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 LEFT [OUTER] JOIN Table_Name2 
    ON < JOIN_CONDITION> ;
OR
    SELECT * 
    FROM EMP LEFT JOIN DEPT 
    ON EMP.DEPTNO = DEPT.DEPTNO ;

    2.) Oracle 
    SELECT Column_Name 
    FROM Table_Name1 , Table_Name2
    WHERE Table1.Col_Name = Table2.Col_Name (+) ;
OR
    SELECT * 
    FROM EMP , DEPT 
    WHERE EMP.DEPTNO = DEPT.DEPTNO (+) ;

2. Right Outer Join :-
    "It is used to obtain Un-Matched Records of Right Table Along with Matching Records ".

# SYNTAX :- 
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 RIGHT[OUTER] JOIN Table_Name2 
    ON < JOIN_CONDITION> ;
OR
    SELECT * 
    FROM EMP RIGHT JOIN DEPT 
    ON EMP.DEPTNO = DEPT.DEPTNO ;
    
    2.) Oracle 
    SELECT Column_Name 
    FROM Table_Name1 , Table_Name2
    WHERE Table1.Col_Name (+) = Table2.Col_Name ;
OR
    SELECT * 
    FROM EMP , DEPT 
    WHERE EMP.DEPTNO(+) = DEPT.DEPTNO ;

3. Full Outer Join :-
    "It is used to obtain Un-Matched Records of both Left & Right Table Along with Matching Records ".

# SYNTAX :- 
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 FULL [OUTER] JOIN Table_Name2 
    ON < JOIN_CONDITION> ;
OR
    SELECT * 
    FROM EMP FULL JOIN DEPT 
    ON EMP.DEPTNO = DEPT.DEPTNO ;

# SELF JOIN :-
    "Joining a table by itself is known as Self Join ".

# Why ? / When ?
    "Whenever the data to select is in the same table but present In different records we use self-join ".

# SYNTAX :-  
    1.) ANSI [ American National Standard Institute ] 
    SELECT Column_Name 
    FROM Table_Name1 JOIN Table_Name2 
    ON < JOIN_CONDITION> ;
OR
    SELECT * 
    FROM EMP E1 JOIN EMP E2
    ON E1.MGR = E2.EID ;

    2.) Oracle 
    SELECT Column_Name 
    FROM Table_Name1T1 , Table_Name2 T2
    WHERE < Join_Condition > ;
OR
    SELECT * 
    FROM EMP E1 , EMP E2 
    WHERE E1.MGR = E2.EID ; 

NOTE :-
    TO join 'N' number of tables we need to write 'N-1' number of join conditions

# NATURAL JOIN :-
    "It behaves as INNER JOIN if there is a relation between the given two tables , else it behaves as CROSS JOIN" .

# SYNTAX :-
    1.) ANSI :-
    SELECT Col_Name 
    FROM Table_Name1 NATURAL JOIN Table_Name2;

# CO - RELATED SUB QUERY :-
    " A query written inside another query such that the outer query and the inner query are Dependent on each other , this is known as Co-Related Sub-Query".

# WORKING PRINCIPLE :-
    Let us consider two queries inner and outer query respectively ,
1. Outer query executes first but partially 
2. The partially executed output is given as an input to the inner Query 
3. The inner query executes completely and generates an output The output of inner query is fed as an input to the Outer query and Outer 
4. Query produces the result . 
5. Therefore, we can state that the outer query and the inner query both are INTERDEPENDENT ( dependent on each other ) . 

# NOTE :-
    1.) In co-related sub query a Join condition is a must , And must be written only in the Inner Query .
    2.) Co-Related sub query works with the principles of both SUB QUERY & JOINS . 

# DIFFERENCE BETWEEN SUB QUERY AND CO RELATED SUB QUERY ?
A.) SUB QUERY :-
1. Inner query executes first 
2. Outer query is dependent on inner query
3. Join condition not mandatory 
4. Outer query executes Once

B.) CO-RELATED SUB QUERY :-
1. Outer query executes first 
2. Both are interdependent
3. Join condition is mandatory and must be written in inner query
4. Outer query executes Twice .

# EXISTS & NOT EXISTS OPERATORS :-
1. EXISTS :-
    " Exists Op is a Unary Op ( One Operand ) which can accept One Operand Towards RHS and that Operand has to be A Co-related Sub Query "
    Exists Op returns true if the Sub Query returns Any value other than Null.

2. NOT EXISTS :-
    " Not Exists Op is a Unary Op ( One Operand ) which can accept One Operand Towards RHS and that Operand has to be A Co-related Sub Query "
    Not Exists Op returns true if the Sub Query returns NULL .

# To find MAXIMUM salary :-
SELECT SAL 
FROM EMP E1 
WHERE ( SELECT COUNT( DISTINCT SAL )
        FROM EMP E2
        WHERE E1.SAL < E2.SAL ) = N-1 ; 

# To find MINIMUM salary :-
SELECT SAL 
FROM EMP E1 
WHERE ( SELECT COUNT( DISTINCT SAL )
        FROM EMP E2
        WHERE E1.SAL > E2.SAL ) = N-1 ; 

# STATEMENTS ARE CLASSIFIED INTO 5 DIFFERENT TYPES :-
1. DATA DEFINITION LANGUAGE ( DDL )
2. DATA MANIPULATION LANGUAGE ( DML )
3. TRANSACTION CONTROL LANGUAGE ( TCL )
4. DATA CONTROL LANGUAGE ( DCL ) 
5. DATA QUERY LANGUAGE ( DQL )

# DATA DEFINITION LANGUAGE ( DDL ) :-
    " DDL is used to construct an object in the database and deals with the Structure of the Object "
It has 5 statements :-
    1. CREATE
    2. RENAME 
    3. ALTER
    4. TRUNCATE
    5. DROP

# CREATE : " IT IS USED TO BUILD / CONSTRUCT AN OBJECT "
    Object / Entity can be a Table or a View ( Virtual Table ) .

# How to Create a Table :-
1. Name of the table 
    I.  Tables cannot have same names .
2. Number of Columns .
3. Names of the columns . 
4. Assign datatypes for the Columns.
5. Assign Constraints [ NOT MANDATORY ] .

# Syntax to create a table :-
CREATE TABLE Table_Name
(
    Column_Name1 datatype constraint_type ,
    Column_Name2 datatype constraint_type ,
    Column_Name3 datatype constraint_type ,
    .
    .
    Column_NameN datatype constraint_type 

    Column_NameN datatype ,
    Constraint Foreign key references Parent_Table_Name(Column_Name)
)

NOTE :-
    TO DESCRIBE THE TABLE
    Syntax: DESC Table_Name ; 

# RENAME : "IT IS USED TO CHANGE THE NAME OF THE OBJECT "
    Syntax: RENAME Table_Name TO New_Name ; 
   
# ALTER :" IT IS USED TO MODIFY THE STRUCTURE OF THE TABLE"
    1.) TO ADD A COLUMN :
    Syntax: ALTER TABLE Table_Name 
            ADD Column_Name Datatype Constraint_type ;

    2.) TO DROP A COLUMN :
    Syntax: ALTER TABLE Table_Name 
            DROP COLUMN Column_Name ; 

    3.) TO RENAME A COLUMN : 
    Syntax: ALTER TABLE Table_Name 
            RENAME COLUMN Column_Name TO new_Column_Name ;

    4.) TO MODIFY THE DATATYPE :
    Syntax: ALTER TABLE Table_Name 
            MODIFY COLUMN_NAME New_Datatype; 

    5.) TO MODIFY NOT NULL CONSTRAINTS :
    Syntax: ALTER TABLE Table_Name 
            MODIFY COLUMN_NAME Existing_datatype [NULL]/NOT NULL;

# TRUNCATE : " IT IS USED TO REMOVE ALL THE RECORDS FROM THE TABLE PREMANENTLY " 
    Syntax: TRUNCATE TABLE Table_Name ;

# DROP :" IT IS USED TO REMOVE THE TABLE FROM THE DATABASE " 
    Syntax: DROP TABLE Table_Name ; 

# TO RECOVER THE TABLE :-
    Syntax: FLASHBACK TABLE Table_Name 
            TO BEFORE DROP ;
        
# TO DELETE THE TABLE FROM BIN FOLDER :-
    Syntax: PURGE TABLE Table_Name ; 

( NOTE : DDL STATEMENTS ARE AUTO-COMMIT STATEMENTS )

# DATA MANIPULATION LANGUAGE ( DML ) :-
    It is used to Manipulate the Object by performing insertion , updating and deletion . 
    1. INSERT 
    2. UPDATE 
    3. DELETE

1. INSERT : It is used to insert / create records in the table .
    Syntax: INSERT INTO Table_Name VALUES( v1 , v2 , v3 …… ) ; 

2. UPDATE :It is used to modify an existing value .
    Syntax: UPDATE Table_Name 
            SET Col_Name = Value , Col_Name = Value ,,,,,
            [WHERE stmt ] ;

3. DELETE : It is used to remove a particular record from the table .
    Syntax: DELETE FROM Table_Name
            [ WHERE stmt ];

# Differentiate between TRUNCATE and DELETE statements ?
A.) TRUNCATE :-
1. Belongs to DDL 
2. Removes all the records from the Table permanently . 
3. Auto COMMIT 

B.) DELETE :-
1. Belongs to DML 
2. Removes a particular record from the Table .
3. Not Auto COMMIT

# TRANSACTION CONTROL LANGUAGE ( TCL ) :-
    "It is used to control the transactions done on the database ".The DML Operations performed on the Database are known as Transactions such as Insertion , Updating and Deletion . 
    We have 3 Statements :

1. COMMIT : "This statement is used to SAVE the transactions into the DB ".
    Syntax: COMMIT ;

2. ROLLBACK :-
    This statement is used to Obtain only the saved data from the DB . 
    It will bring you to the point where you have committed for the last time .
    SYNTAX: ROLLBACK TO Savepoint_Name ;

3. SAVEPOINT :- 
    This statement is used to mark the positions or restoration points . (nothing related to DB ) . 
    SYNTAX: SAVEPOINT Savepoint_Name ; 

# DATA CONTROL LANGUAGE :-
    "This statement is used to control the flow of data between the users ".
    We have 2 statements :

1. GRANT : THIS STATEMENT IS USED TO GIVE PERMISSION TO A USER .
    SYNTAX: GRANT SQL_STATEMENT
            ON TABLE_NAME 
            TO USER_NAME ;
        
2. REVOKE : THIS STATEMENT IS USED TO TAKE BACK THE PERMISSION FROM THE USER .
    SYNTAX: REVOKE SQL_STATEMENT
            ON TABLE_NAME 
            FROM USER_NAME ;

TRY !!!!

SQL> SHOW USER ;
USER is "SCOTT"
SQL> CONNECT
Enter user-name: HR
Enter password: *****
Connected.
SQL> SHOW USER ;
USER is "HR"
SQL> SELECT * 
 2 FROM SCOTT.EMP;
FROM SCOTT.EMP
 *
ERROR at line 2:
ORA-00942: table or view does not exist
SQL> CONNECT
Enter user-name: SCOTT
Enter password: *****
Connected.
SQL> GRANT SELECT ON EMP TO HR;
Grant succeeded.
SQL> CONNECT
Enter user-name: HR
Enter password: *****
Connected.
SQL> SELECT * 
 2 FROM SCOTT.EMP;
 EMPNO    ENAME       JOB        MGR     HIREDATE    SAL    COMM    DEPTNO
------   -------    --------   -------   ---------  -----  ------  ----------
 7369    SMITH      CLERK       7902     17-DEC-80   800             20
 7499    ALLEN      SALESMAN    7698     20-FEB-81   1600   300      30
 7521    WARD       SALESMAN    7698     22-FEB-81   1250   500      30
 7566    JONES      MANAGER     7839     02-APR-81   2975            20
 7654    MARTIN     SALESMAN    7698     28-SEP-81   1250   1400     30
 7698    BLAKE      MANAGER     7839     01-MAY-81   2850            30
 7782    CLARK      MANAGER     7839     09-JUN-81   2450            10
 7788    SCOTT      ANALYST     7566     19-APR-87   3000            20
 7839    KING       PRESIDENT            17-NOV-81   5000            10
 7844    TURNER     SALESMAN    7698     08-SEP-81   1500   0        30
 7876    ADAMS      CLERK       7788     23-MAY-87   1100            20
 7900    JAMES      CLERK       7698     03-DEC-81   950             30
 7902    FORD       ANALYST     7566     03-DEC-81   3000            20
 7934    MILLER     CLERK       7782     23-JAN-82   1300            10

Q.) What is Normalization ? 
    " It is the process of reducing a large table into smaller tables in order to remove redundancies and anomalies by identifying their functional dependencies is known as Normalization . "
OR 
    "The process of decomposing a large table into smaller table is known as Normalization ."
OR
    "Reducing a table to its Normal Form is known as Normalization . "

Q.) What is Normal Form ?
    A table without redundancies and anomalies are said to be in Normal Form .
    Levels of Normal From .

1. First Normal Form ( 1NF ) :
 - No duplicates records .
 - Multivalued data should not be present.

    Single atomic value in each column
    Each row have unique identifier

2. Second Normal Form ( 2NF )
 - Table should be in 1NF 
 - Table should not have Partial Functional Dependency . 

    Satisfy all 1NF conditions
    Partial dependecies must be removed from the table

3. Third Normal Form ( 3NF )
 - Table should be in 2NF .
 - Table should not have Transitive Functional Dependency . 

    Satisfy all 2NF conditons
    Transitive dependency of non-key attributes on key column must be removed 