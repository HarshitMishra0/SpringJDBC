# SpringJDBC
This is an implementation example of Spring JDBC

Below given is the theory to reffer

Spring JDBC(Java Database Connectivity) is a powerful mechanism to connect the database and execute SQL queries. 

Old JDBC is API to perform operation with database.

Problems of old JDBC:
We need to write a lot of Code.
Exception Handling Problem: Checked Exception
Repeating of all these codes from one to another database logic is a time consuming task.

Spring JDBC
Solution of JDBC problems are provided by Spring JDBC.
Spring JDBC provide class JdbcTemplate which has all the important methods to perform operation with database.

JdbcTemplate Methods

update()-> insert, update, delete etc
execute()-> used to select queries


Row Mapper
It takes resultSet object and converts it into class object.
Implementation of Row Mapper
