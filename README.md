========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "CS_IA.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Note: To run the application, all libraries should be added and a database named ‘csia’ needs to be present in MySQL. In this
database, there needs to be a table called ‘login’ which should be structured as mentioned
above. (username- root, password- root@123). The command for creating the ‘login’ table is: create table login (first_name varchar(100), last_name varchar(100), username varchar(100), password varchar(100),
contact varchar(100));

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
