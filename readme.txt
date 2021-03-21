How to transfer database:
 
 Adding sql file to database
 1. create new database say abc
 2.open cmd in administator mode
 3.change path to C:\Program Files (x86)\MySQL\MySQL Server 5.1\bin
 4.type
    mysql -uroot -p abc<"path name where file is stored"
5.type password	
	
	creating sql file from database
 1. create new database say abc with some tables
 2.open cmd in administator mode
 3.change path to C:\Program Files (x86)\MySQL\MySQL Server 5.1\bin
 4.type
    mysqldump -uroot -p abc>"path name where file to be  stored"
	5.type password