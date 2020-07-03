18/july/2019
-----------------------
java - Core java / SE ----------------------- technology required to develop - Awt
																			 - Swing
																			 - Javafx   These 3 are for UI

																			 - Event, Threading, Collection Framework, jdbc
	 
	 - Advance java / EE -------------------- Web based application
	 										- Technology used - UI - html, css, javaScript, Angular( High demand in Market)
	 														  - Servlet
	 														  - JSP
	 														  - Filter
	 														  - Jstl
	 														  - jdbc
	 														  - Listener
	 														  - Taglis
	 														  - Framework
	 
	 - Android / ME ------------------------- Android

	 - Framework - Hibernate (for Database)
	 			 - Spring (In market)
	 			 - Struts

	 	In Framework - EE + Transaction + Security (F/W gives these)
	- Java is not suitable for system development but very very suitable for application development.
	
Oriented Programmings / Programming Standard
-----------------------------------------------
	Object Oriented Programming (JAVA)
	Procedure Oriented Programming
	Structure Oriented Programming
	Monolothic Oriented Programming
	Aspect Oriented Programming
 
- Father of java- James Gosling
- was product of Sun Micro system
- Now product of Oracle
- Global examination / certification - Exam name is OCJP (Oracle certified java professional)
- Year of development is 90-91 but got activated in 95.

- Java dpesn't support - system software
					   - Pointer
					   - Address
					   - Structure
					   - Garbage value
					   - Union
					   - Global variable declaration
					   - Memory allocation or de-allocation by you or memory management by programmer
					   - Destructor
					   - goto/const
					   - De-referencing - cannot read from a specific memory location in RAM

==========================================================================================================================

19/july/2019
----------------
1. Java compiler name is javac
2. After compilation byte code is generated i.e. .class file

Features of java
----------------------
	1. Open source
	2. Platform independent
	3. Single file application development
	4. Architecture neutral
	5. Robust
	6. Automatic memory management
	7. Garbage collection
	8. Exception handling
	9. Secure
	10. Portable
	11. Jshell
	12. var
	13. Object oriented
	14. Dynamic
	15. Multithreaded
	16. Distributed
	17. Regular Expression
	18. Lambda Expression
	19. High performance
	20. Vast libraries

	1. Open Source
	--------------------
		Source code of OS - www.kernel.org - UNIX Source code

		- The source code of JDK (Java Development Kit/ Java Libraries) is not restricted within SUN Micro system / Oracle corporation.
		
		- Location of Source code
							c:/program Files/Java/JDK/.../src
							c:/program Files/Java/JDK/.../lib/src


	2. Platform Independent
	------------------------------
		thetechpoint.in

		- If an application can be executed in multiple platform i.e. known as platform independent application.
		- C/C++ is platform dependent programming.
		- Java is platform independent.

		How to set the path :
					set path=;C:\Program Files\Java\jdk1.8.0_20\bin;

22/july/2019
----------------------------------
	Java De-Compiler
	-------------------
			- It is reverse of javac compiler.
			- it is used to convert byte codes to java source code.

	3. Single file application development
	-------------------------------------------
		- It is introduced in jdk 12
		- Here it is not required to compile the java program
		- we can directly execute the java file
					java file_name.java
		- Only first .class file will execute i.e. only first class file will execute.

	4. Architecture Neutral
	--------------------------
		- size of datatypes are fixed for all environment
				In C/C++
					int is 2 byte for TurboC compiler
						is 4 byte for gcc compiler

				In java
					int is 4 byte for windows,linux,for any OS. It is fixed.

		- Memory allocation and de-allocation is same for all environment.

	12. var Concept
	---------------------------
		- var is not keyword.
		- Java support 48 keyword in latest version.
			const
			goto	// Outdated since 1.6 jdk
			
			null	-for reference
			true	boolean
			false	// Literals or pre-defined values

		- var is the replacement of datatypes.
		
		- var only can be used within a block/constructor/method
			In other words, local variable only can be declared with var.

		- var can not be used as function argument.

	11. Jshell
	------------------
		- It is introduced in java to test a function/program.
		- Without writing java program Jshell can test a function.

		D:\JAVA Practice>jshell
		|  Welcome to JShell -- Version 12.0.1
		|  For an introduction type: /help intro

		jshell> "hello"
		$1 ==> "hello"

		jshell> 3+5
		$2 ==> 8

		jshell> Integer.toBinaryString(5)
		$3 ==> "101"

		jshell> Math.sqrt(9)
		$4 ==> 3.0

		jshell>  a = 10
		|  Error:
		|  cannot find symbol
		|    symbol:   variable a
		|   a = 10
		|   ^

		jshell> int a = 10
		a ==> 10

		jshell> int b = 20
		b ==> 20

		jshell> int c = a+b
		c ==> 30

		jshell> /exit
		|  Goodbye

	13. Object Oriented
	------------------------
		- It is a programming standard.
		- OOPs concept
				1. Inheritance		- Aggregation/Association
				2. Polymorphism		- Concurrency
				3. Abstraction		- Information hiding
				4. Encapsulation		- Typing
				5. Object
				6. class
		- C is not a Object oriented language.
		- Java is an Object oriented programming language (Partially)

	6. Automatic memory management
	-------------------------------------
		- JVM (Interpreter in jvm) is responsible to allocate and de-allocate memory.
	
	9. Secure
	------------------
		- Java is a secure program as
				1. It runs within a virtual machine (JVM)
				2. it doesnot support the concept of pointer.
				3. Byte code is not executable

	7. Garbage Collection
	-------------------------
		- Java doesnot support garbage value.
		- gc() is a method of System class , which can be used to collect garbagr value.
		- JVM is responsible to collect garbagr.
		- In java  each thread starting with main() thread is stored in stack memory where all local,primitive types are stored and the Heap memory where all the objects are stored and allocated memory.

		- The process by which JVM clears the memory allocated to an object is called garbage collection.

		- It is Demon Thread that runs within the background and garbage collectes the objects when they are unreachable.

e.g.

Account x = new Account();  //x reference points to 1 memory location in heap memory
Account y = new Account(); //y reference points to 2 memory location in Heap memory
		
		x = new Account(); //x now points to another memory location 3 instead of 1 and the 1 becomes unreachable
		y = x;			// Both points to same memory location 3 and 1 and 2 location becomes unreachable

		x = null;
		y = null; // makes all the memory location free and all the locations are unreachable;

		// and now if the garbage collector runs it can collect all the garbages that are 1,2,3 locations.

		- gc() method in Java is responsible for garbage collection
		- We can not force it to collect the garbage value, it is completely automated by JVM.
		- Or we can make a request by calling gc() like

					System.gc();
		- finalize() is responsible for cleaning up the resources.

package garbageCollection;

public class GCMethod 
{
	GCMethod() 
	{
		System.out.println(this+" Created");
	}
	public static void main(String[] args) 
	{
		new GCMethod();
		new GCMethod();
		
	}
	protected void finalize() // Overridden method of Object Class 
	//protected void finalize() throws java.lang.Throwable;
	//Used to clean up the resources or memory location when JVM is runs out of space
	// Here finalize() will not get evoked
	{
		System.out.println(this+" Finallized/Destructed/Cleaned-Up");
	}
}


// To see finalize in action create 50000000 objects and it will get evoked
package garbageCollection;

public class GCMethod 
{
	int objid;
	GCMethod(int objid) 
	{
		this.objid=objid;
		System.out.println("Created "+this.objid);
	}
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 500000 ; i++)
		{
			new GCMethod(i);
		}
	}
	protected void finalize() // Overridden method of Object Class 
	//protected void finalize() throws java.lang.Throwable;
	//Used to clean up the resources
	{
		System.out.println("Finalized "+objid);
	}
}

Requesting gc()
------------------
package garbageCollection;

public class GCMethod 
{
	int objid;
	GCMethod(int objid) 
	{
		this.objid=objid;
		System.out.println("Created "+this.objid);
	}
	public static void main(String[] args) 
	{
		new GCMethod(1);
		new GCMethod(2);
		for(int i = 1; i <= 100 ; i++)
		{
			
			System.gc();
		}
	}
	protected void finalize() 
	{
		System.out.println("Finalized "+objid);
	}
}


	5. Robust
	------------
		- Java is robust as
			a. It supports memory management automatically
			b. collects the garbag value
			c. Strongly handle the Exception


	Introduction to JAVA
	===========================================

	//public class A 	 class A is public, should be declared in a file named A.java
	public class Test
	{
		public static void main(String[] args) 
		{
			System.out.println("Hello world");

		}
	}
	
		Access specifier in JAVA
		------------------------------------------
			- Access specifiers are also known as Access modifiers.
			- Access modifiers
				1. public
				2. protected
				3. default
				4. private

				5. transient
				6. volatile
				7. static
				8. synchronized
				9. strictfp
				10. final
				11. abstract
				12. native

			- 1-4 Access specifiers
			- All access specifiers are access modifiers but all access modifiers are not access specifiers.
			- Access specifier's job is to specify the boundary of the scope(variable,function,constructor,class).
			
										SCOPE Table
								==============================

								within 			within		Outside
								the 			same		package
								same class		package
					---------------------------------------------------
					public			yes			yes			yes

					protected		yes			yes			yes(by inheritance else No)

					default			yes			yes			No

					private			yes			No 			No

			- JAVA doesnot support global declaration but if the variable is declared as public it behaves like global variable.
			- If a class is public, then the file name and class name should be same.
			- Class within a class is known as Nested class i.e. allowed in java.
			- Private and protected modifiers are not allowed for top level/outer class but allowed for inner/nested class.
			
			public class Test
			{
				public class A {}
				protected class B {}
				class c {}
				private class d {}

			}
			class first
			{

			}
			//protected class x{} modifier protected not allowed here i.e. outer class
			//private class y{}	  modifier private not allowed here i.e. outer class

			After compilation it will generate these files
			first.class
			Test$A.class
			Test$B.class
			Test$c.class
			Test$d.class
			Test.class
			
			- If a .class file name is a word after $ then it is a Nested class.
			- If a .class file name is a number after $ then it is a Annonymous class.

			- A java file can contain N number of classes but maximum one class can be declared as public because if the class name is public then the file name and class name should be equal for which multiple class can not be declared as public as there can not be multiple names of a single file and declaration of public is also optional.

			Example of Access Specifier
			class Test
			{
				static public int a = 10;
				static protected int b = 20;
				static int c = 30;
				static private int d = 40;	
				public static void main(String[] args) 
				{
					System.out.println(Test.a);
					System.out.println(Test.b);	
					System.out.println(Test.c);
					System.out.println(Test.d);  
				}
			}
			class demo
			{
				public static void main(String[] args) 
				{
					System.out.println(Test.a);
					System.out.println(Test.b);	
					System.out.println(Test.c);
					//System.out.println(Test.d);  // d has private access in Test
				}
			}


	Class
	===========
		- Class is a logical container
		- It is a blueprint of object.
		- Object is the physical existance of class.

		How to create Object in java
		--------------------------------
			classname objectname = new classname ();
			Student s1 = new Student();
			Employee e1 = new Employee();
		
		- Class is a collection of 4 types of members and Nested class.
				1. Variable / Data members (6 types of variable)
				2. Function / Method member (6 types of method)
				3. Blocks (2 types)
				4. Constructors (2 types)

			class Test
			{
				int roll = 100;			//variable
				String name = "raja";	//variable

				void getDetails()	//method
				{}
				public static void main(String[] args)  //method
				{}
				static 		//block
				{}
				Test() 		//Constructor
				{}
			}


	Javap
	=========================
	class Test
	{
		public int a = 10;
		protected int b = 20;
		int c = 30;
		private int d = 40;
	}


	D:\JAVA LIT CORE>javac Test.java

	D:\JAVA LIT CORE>javap Test
	Compiled from "Test.java"
	class Test {
	  public int a;
	  protected int b;
	  int c;
	  Test();
	}

	D:\JAVA LIT CORE>javap -private Test
	Compiled from "Test.java"
	class Test {
	  public int a;
	  protected int b;
	  int c;
	  private int d;
	  Test();
	}

	D:\JAVA LIT CORE>javap -protected Test
	Compiled from "Test.java"
	class Test {
	  public int a;
	  protected int b;
	}

	D:\JAVA LIT CORE>javap -public Test
	Compiled from "Test.java"
	class Test {
	  public int a;
	}


	- javap is a jdk tool , which is used to trace the .class file.

	Identifier
	----------------
		- Class name is a Identifier.
			Rules for Identifier
				1. space is not allowed.
				2. digit are not allowed at start
				3. keywords are not allowed
				4. symbols are not allowed except $ and _

	Naming Conventions
	-----------------------
		- class : Each word 1st letter should be capital and no _
		- Method : Each word 1st letter should be capital except 1st word
					toBinaryString()
					toString()
					getBytes()
					equalsIgnoreCase()

		- Constant : Each Letter should be UpperCase
					SIZE
					BOLD

		- Package : Each letter should be lower case
					java
					javax
					lang
					util
					io

	public static void main(String[] args) 
	=============================================
		- The existance of main() does not check at the time of compilation.
		- JVM is responsible to call main() in java at the time of execution.

		JVM
		===================
			- JVM is a software , in-built with the OS.
			- JVM is responsible to execute the byte code or .class file
			- JVM is purely developed in C, so it is platform dependent.
			- Task of JVM
					1. call the main()
					2. Memory management
					3. Garbage collection
					4. File or I/O devices management
					5. Device driver management
					6. Thread management
					7. Socket and process management

			**- JVM makes java platform in-dependent.

		Q. Why main() is public in java
		------------------------------------
			- Test.java is Source code in java
			- After compilation it generates a bytecode which is a .class file with the class names
			- The byte code will execute in respective JVM of OS(Windows, Linux)
			- JVM will call the main() first, main() is the entry point of execution.
			- JVM resides in OS
			- JVM code for respective OS is different
			
			- JVM will call the main() which is in one package, and JVM resides in OS which is in another folder or another package. For calling main() it will be calling from another package for which the access specifier of main() must be public.


			- JVM calls the main() from the OS , so main() should be public.

		Q. Why main() should be static
		--------------------------------
			Calling Procedure : It is decided by static and non-static
			--------------------------
				1. Directly
				2. Class name
				3. Object name

			- If member(variable/Function) is static, then it can be called by 
					1. Directly  (Within same class only)
					2. Class name
					3. Object name
			- If member(variable/Function) is non-static, then it can be called by 
					Object name only

			class Test
			{
				static int a = 10;
				int b = 20;
				
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					
					System.out.println(a); //directly
					System.out.println(Test.a); //class name
					System.out.println(t1.a); // object name

					//System.out.println(b); //directly  //non-static variable b cannot be referenced from a static context
					//System.out.println(Test.b); //class name //non-static variable b cannot be referenced from a static context
					System.out.println(t1.b); // object name 
				}
			}
			class Demo
			{
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					
					//System.out.println(a); //directly //cannot find symbol
					System.out.println(Test.a); //class name
					System.out.println(t1.a); // object name

					//System.out.println(b); //directly  //non-static variable b cannot be referenced from a static context
					//System.out.println(Test.b); //class name //non-static variable b cannot be referenced from a static context
					System.out.println(t1.b); // object name 
				}
			}

	Q. Why to set the path
	---------------------------
		- To access the jdk tools from any location.
		- All the jdk tools are present in following location
				C:\Program Files\Java\jdk-12.0.1\bin

	BigInteger Concept
	----------------------------
		// It can store a number of any number of digits.

		class BigIntegerOperation
		{
			public static void main(String[] args) 
			{
				java.math.BigInteger no = new java.math.BigInteger (args[0]);

				java.math.BigInteger no1 = new java.math.BigInteger (args[1]);

				System.out.println(no.add(no1));
				System.out.println(no.subtract(no1));
				System.out.println(no.multiply(no1));
				System.out.println(no.divide(no1));
			}
		}

		D:\JAVA LIT CORE>java BigInteger.java 100000000000000000000000000 5000000000000000000000000000000000
		5000000100000000000000000000000000
		-4999999900000000000000000000000000
		500000000000000000000000000000000000000000000000000000000000
		0


Number Concept in java
--------------------------------------
/*
	Decimal to binary
	Decimal to Octal
	Decimal to Hexa-Decimal
	Decimal to String
*/
class Number_Ex
{
	public static void main(String[] args) 
	{
		String a = "50";
		int num = Integer.parseInt(a);
		System.out.println(num);	
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toString(num));
			
	}
}

	50
	110010
	62
	32
	50


	Q. Why main() is static
	------------------------------------
		- As JVM always call the main() by class name, so main() should be declared as static.

	Q. Why main() is void
	------------------------------------
		- main() doesnot return any value to JVM so return type only can be void.

	- The prototype of main() is pre-defined but logic is user defined.

	Q. String[] args or Commandline argument
	-----------------------------------------------
		- The argument accepted by main() is known as commandline argument.
		- In java main() always accept array of String as an argument.
		- length is a variable in java which is used to fondout the length of an array.
		- length() is a function in java, which is used to findout the length of a string.

		public class Test
		{
			public static void main(String[] args) 
			{
				int arr[] = {11,22,33};
				System.out.println(arr.length);	 // 3

				String msg = "Hello";
				System.out.println(msg.length()); // 5

				String s[] = {"java is simple", " java is nice"};
				System.out.println(s.length); // 2
			}
		}



		Example of commandline
		--------------------------
			public class Test
			{
				public static void main(String[] args) 
				{
					System.out.println(args.length);

					System.out.println("all the elemets are ");
					for (int i = 0; i < args.length; i++)
					{
						System.out.println(args[i]);	
					}
				}
			}
===============================================================
		public class Test
{
	public static void main(String[] args) 
	{
		System.out.println("10" + 20); //1020
		System.out.println(10 + 20); //30
		System.out.println('A' + 10); // A ascii is 65 and 65 + 10 = 75

		System.out.println(Integer.parseInt("10") + 20); //30

		System.out.println(5+6+"10"+2+3); // 111023

		System.out.println("10" + (2-4)); // 10-2

		System.out.println("10" + 4*2); //108

		//System.out.println("10" + 2-4); //bad operand types for binary operator '-'

		System.out.println(Double.parseDouble(args[0]) + Float.parseFloat(args[1])); //30.0

		System.out.println("ABC" + 20); //ABC20
		System.out.println(20 + "ABC"); //20ABC
		//System.out.println(Integer.parseInt("ABC") + 20); //Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC"
	}
}

		- Commandline args is used as an input technique in java.

		- String is a pre-defined class present in java.lang package.




		System.out.println();
		============================
		System
		------------
		- System is a pre-defined class present in java.lang package.
		- lang is the default package in java i.e. automatically included in each and every java program.

		class Test
		{
			public static void main(String[] args) 
			{
				java.util.Date d = new java.util.Date();	
				System.out.println(d); // Fri Jul 26 18:46:12 IST 2019
			}
		}


		out 
		---------
			- It is a ststic object of java.io.PrintStream class.
			- This object is present in System class.

		println()
		----------
			- It is a non-static method of PrintStream class which is usedto write output into console or Command Promt.


		//Example : Mapping program of System.out.println()
		//==========================================================
		class Test
		{
			void show()
			{
				System.out.println("java is simple");
			}

		}
		class Demo
		{
			static Test t = new Test ();
		}
		class MainClass
		{
			public static void main(String[] args) 
			{
				Demo.t.show();
			}
		}




		class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");	
		System.err.println("Hi");
		System.out.println("Raja");
		System.out.printf ("Devi by printf \n");
		
		System.out.printf("%f",2.232425252);
		System.out.printf("\n%.2f",2.232425252);

		int a = 90;
		System.out.printf ("\n%d\n",a);

		System.out.println("\"Hello\"");
	}
}
------------------------
Hello
Hi
Raja
Devi by printf
2.232425
2.23
90
"Hello"

		javac Test
		java Test
		java Test > a.txt // Create or replace
		java Test >> a.txt //Create or Append


The output generated by System.out can be redirected into file.
The output generated by System.err can NOT be redirected into file.

java Test > or >> a.txt - It will create a txt file automatically and save the output present in System.out



Escape Sequence
--------------------
	\n
	\r
	\v
	\f
	\b
	\f


Datatypes and Wrapper Class
---------------------------------------
	- Like other language, Java support the concept of primitive(Size is already fixed) datatypes
	- Java supports 8 primitive datatypes
										Datatypes
					=======================================================

						Primitive 								Non-Primitive
					---------------------------------------------------------------
				Boolean 		Numeric 						- class
				----------- 	------------					- Array
				-boolean		Integral 	Floating-point 		- Struct
								-Char		-float
								-byte 		-double
								-short
								-int
								-long

				
	- Scripting Languages (Html/Php..etc) doesnot support Datatypes, here we cannot create a new data structure.
	- As java directly support the concept of primitive Datatypes , So it is not a pure Object Oriented ProgrammingLanguage.

	- Uses of Datatypes
	--------------------------
		1. It indicates the Type of data
		2. It allocates sequence set of bytes from RAM memory.

	Wrapper Class
	-------------------
		- For each and every datatype java provides a pre-defined class technically known as Wrapper class in java.
			Uses of Wrapper Class
			--------------------------
				1. Type Conversion
				2. Manipulate datatypes
				3. Create a java application in a pure Object oriented format.

			Note:
				Wrapper Class is the replacement of Datatype.


	Datatype 			Wrapper 			Size 			Default
						class 								value
----------------------------------------------------------------------------------
	byte 				Byte 				8bits 			0

	char 				Chatacter 			16bits 			/u0

	boolean 			Boolean 			1 bit 			false

	short 				Short 				16 bits			0

	int 				Integer 			32 bits			0

	long 				Long 				64 bits 		0L

	float 				Float 				32 bits 		0.0f

	double 				Double 				64bits 			0.0 / 0.0D


	Byte datatype
	-----------------------
	- MAX_VALUE and MIN_VALUE are 2 static constant present in each and every Wrapper class which is used to return the range of datatype.
	- SIZE is a pre-defined static constant present in each and every Wrapper class which is used to return the size of datatype in bit format.


	class Test
	{

		public static void main(String[] args) 
		{

			System.out.println(Byte.MAX_VALUE);
			System.out.println(Byte.MIN_VALUE);

			System.out.println(Short.MAX_VALUE);
			System.out.println(Short.MIN_VALUE);

			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);

			System.out.println(Long.MAX_VALUE);
			System.out.println(Long.MIN_VALUE);

			System.out.println(Float.MAX_VALUE);
			System.out.println(Float.MIN_VALUE);

			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
			System.out.println("================================================");

			System.out.println(Byte.SIZE);
			System.out.println(Short.SIZE);
			System.out.println(Integer.SIZE);
			System.out.println(Long.SIZE);
			System.out.println(Float.SIZE);
			System.out.println(Double.SIZE);
		}
	}
	----------------------------------
	127
	-128
	32767
	-32768
	2147483647
	-2147483648
	9223372036854775807
	-9223372036854775808
	3.4028235E38
	1.4E-45
	1.7976931348623157E308
	4.9E-324
	================================================
	8
	16
	32
	64
	32
	64

toString() : It is a static method of each and every Wrapper Class which is used to convert any datatype to String Format.

parseByte() : it is a static method of Byte class which is used to convert String to Byte type, each wrapper class contains a parse() method.

class Test
{

	public static void main(String[] args) 
	{
		Byte x = 10;
		System.out.println(Byte.parseByte("10") + 3); //13
		System.out.println("10" + 11); //1011
		System.out.println(Byte.toString(x) + 11); //1011
		
	}
}



Type Casting
------------------------
	3 types

	a. Implicit Casting
	-----------------------
			- Small type data to Larger type
				int to long
				float to double

	b. Explicit Casting
	--------------------------	
			- larger type to small
				long to int
				double to float

	c. Boolean Casting
	----------------------
			- Not Possible


	Constant
	----------------
		- '5' Character constant
		- "5" String Constant
		- 5   Integer constant
		- 05  Octal constant
		- 0x5 HexaDecimal constant
		- 0b10 Binary constant
		- 5.0  Double constant
		- 5.0f  Float constant
		- 5L 	Long constant

	class Test
	{

		public static void main(String[] args) 
		{
			short x = 320;
			System.out.println(x);

			byte y = (byte)	x;
			System.out.println(y); //64 , 320 binary is 9 bit, byte is 8 bit, so the last bit will be discarded in binary 									sequence		

			System.out.println('A' + 10); //75
			System.out.println(015 + 25); //38 , In 015 , 15 is in octal form so convert it to decimal and add with 25
			System.out.println(0x15 + 25); //46 , Hexadecimal sequence
			System.out.println(0b10 + 20); //22			

		}
	}


Count the numbers of ones and zeros in a number
----------------------------------------------------------
class Test
{

	public static void main(String[] args) 
	{
		int x = 25;
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.SIZE); //32
		System.out.println(x); //25

		String binary = Integer.toBinaryString(x);

		System.out.println(binary); // Will return the String with value 11001

		int zero = 0, one = 0;
		for (int i = 0; i < binary.length(); i++) 
		{
			char ch = binary.charAt(i) ;
			if (ch == '0')	
				zero ++;
			if (ch == '1')
				one ++;
		}
		System.out.println("Number of zeros in binary of 25 : "+zero); //2
		System.out.println("Number of ones in binary of 25 : "+one); //3

		System.out.println(Integer.toHexString(x)); //19
		System.out.println(Integer.toOctalString(x)); //31
		System.out.println(Integer.toString(x) + 10); //2510
	}
}


Char
----------------
	- In java , char is 2 bytes i.e. 16 bits.
	- java supports 65536 characters.
	- C/C++ support ASCII whereas Java support UNICODE standard

	UNICODE standard : Universal Code
	---------------------------------
		It is the combination of
				ASCII
				Extended ASCII
				Local Language characters

Display Local Language Alplabate or UNICODE
-----------------------------------------------------
	class Test
	{

		public static void main(String[] args) 
		{
			for (int i = 65; i <= 90; i++) 
			{
				System.out.print((char) i +"\t");	
			}
			System.out.println();
			for (int i = 2000; i <= 3000; i++) 
			{
				System.out.print((char) i +"\t");	
			}
		}
	}

Use this program using Eclipse Only else it will show ? in cmd
// right click on Test.java ---> properties ---> Other ---> UTF-8 ---> Apply and close

	class Test
	{

		public static void main(String[] args) 
		{
			char ch = 'A';
			System.out.println(ch); //A
			System.out.println((int) ch); //65
			System.out.println(Character.MAX_VALUE); // ?
			System.out.println(Character.MIN_VALUE);
			System.out.println(Character.SIZE); //16
			System.out.println(Character.isUpperCase(ch)); //true
			System.out.println(Character.isLowerCase(ch)); //false
			System.out.println(Character.isDigit(ch)); //false
			System.out.println(Character.isWhitespace(ch)); //false
			System.out.println(Character.isLetter(ch)); //true
		}
	}


Boolean
----------------
	- In java Boolean means true and false.
	- In C/C++ boolean means 0 and 1.
	- java does not support boolean casting i.e. boolean can not be casted to any other datatype and vice-versa.
	class Test
	{

		public static void main(String[] args) 
		{
			int x = 0;
			int y = (boolean) x; // int cannot be converted to boolean
			System.out.println(y);

			//boolean x = "true"; // String cannot be converted to boolean
			boolean x = true;
			System.out.println(x);
			boolean y = (boolean) 0; // int cannot be converted to boolean
			System.out.println(y);
		}
	}

Example for Long
-----------------------------
class Test
{

	public static void main(String[] args) 
	{

		System.out.println(10 > 2); //true
		long a = 10L;
		System.out.println(a); //10

		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE); //2147483647

		long b = 21474836478L; 
		System.out.println(b);

		long c = 13142;
	}
}


Example for float and double
-----------------------------------------
class Test
{
	public static void main(String[] args) 
	{
		//float a = 1.5; //incompatible types: possible lossy conversion from double to float
		float a = (float)1.5;
		float b = 2.5f;

		System.out.println(Float.SIZE); //32
		System.out.println(Double.SIZE); //64

		System.out.println(5.5 == 5.5f); //true
		System.out.println(5.6 == 5.6f); //false


	}
}

	Note:
		32 bits Recurring binary doesnot equals with 64bits recuring binary.

class Test
{
	public static void main(String[] args) 
	{
		System.out.println(0.1+0.2);
		System.out.println((0.1+0.2)-0.3);

		float a = 0.1f;
		float b = 0.2f;
		float c = 0.3f;
		double d = 0.1;
		double e = 0.2;
		double f = 0.3;
		System.out.println(d+e);
		System.out.println(e+f);
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(a+b-c);
		System.out.println(d+e-f);

		System.out.println(0.2-0.3);
		System.out.println(0.2f-0.3f);
		
	}
}

Java  java Test.java
0.30000000000000004
5.551115123125783E-17
0.30000000000000004
0.5
0.3
0.5
0.0
5.551115123125783E-17
-0.09999999999999998
-0.10000001


	Boxing
	-----------------------------------------
		- Technique to convert primitive datatype into Wrapper class object.
	Unboxing
	-----------------------------------------
		- Technique to convert Wrapper class objects into Primitive datatypes.
	Auto-boxing
	-----------------------------------------
		- In the latest JDK, Boxing and Unboxing both are the job of java compiler i.e. automatically done by javac compiler which is known as Auto-boxing.

	Constructor || Boxing || int into Integer

	valueOf() || Unboxing || Integer into int


Example for Boxing, Unboxing, Auto-Boxing
class Test
{
	public static void main(String[] args) 
	{
		int x1 = 10;
		Integer x2 = new Integer (x1) ; //Boxing
		Integer x3 = x1; // Auto-Boxing
		System.out.println(x1 +"\t"+ x2 +"\t"+ x3);

		Integer y1 = 11;
		int y2 = Integer.valueOf (y1); //Unboxing
		int y3 = y1; //Auto-Boxing
		System.out.println(y1 +"\t"+ y2 +"\t"+ y3);
	}
}
10      10      10
11      11      11
/*
D:\JAVA LIT CORE>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

D:\JAVA LIT CORE>java Test
10      10

D:\JAVA LIT CORE>javac -Xlint Test.java
Test.java:7: warning: [deprecation] Integer(int) in Integer has been deprecated
                Integer x2 = new Integer (x1) ; //Boxing
                             ^
1 warning
*/



Note : 
			Widening and Narrowing


	- Compare to datatype , Wrapper class is slower.
	// Why wrapper class cannot be used in certain situation
	class Test
	{
		public static void main(String[] args) 
		{

			long start , stop;
			start = System.currentTimeMillis ();
			System.out.println();
			int sum1 = 0;
			for(int i = 0; i <= 100000 ; i++)		
				sum1 = sum1 + i;
			stop = System.currentTimeMillis ();
			System.out.println("Time taken by datatype : " +(stop - start));

			Integer sum2 = 0;
			start = System.currentTimeMillis ();
			System.out.println();
			for(Integer i = 0; i <= 100000 ; i++)		
				sum2 = sum2 + i;
			stop = System.currentTimeMillis ();
			System.out.println("Time taken by Wrapper class : " +(stop - start));

		}
	}

	- All the Wrapper class are final, so cannot be inherited i.e. the final class can not be inherited in java i.e. final 		class cannot be a parent class

		class A
		{

		}
		class Test extends A
		{
			public static void main(String[] args) 
			{

			}
		}
		final class C extends Test
		{

		}
		class D extends C //cannot inherit from final C
		{

		}


	- Class is a collection 4 types of member in java
			1. Variable / Data member (6 types)
			2. Block members (2 types)
			3. Methods / Functions (6 types)
			4. Constructors (2 types)

		1. Variable / Data member (6 types)
		---------------------------------------
			- Java supports 6 types of variable
					a. Local
					b. static / Class Level
					c. Non-static / Instance / Object
					d. Final
					e. transient
					f. volatile

		class Test extends A
		{
			static int a = 10;
			int b = 20;
			final int c = 30;
			transient int d = 40;
			volatile int e = 50;
			public static void main(String[] args) 
			{
				int f = 60;	
			}
		}


		a. Local Variable
		-----------------------
			- If the variable is declared within any block but not a part of class directly.
			- Local variable only can be accessed within that block in which it is declared so access specifiers are not allowed.
			- static keyword is not allowed for local variable.
			- Before access/use , the variable should be initialized.

			class Test
			{
				public static void main(String[] args) 
				{
					int x = 10 , e;
					System.out.println(x);
					//System.out.println(e); //variable e might not have been initialized
					e = 91;
					System.out.println(e);
					int a = 10;
					{
						int b = 20;
						{
							//public int c = 30; // illegal start of expression
							//static int c = 30; // illegal start of expression
							//int c; //variable c might not have been initialized
							int c = 30;
							System.out.println(c);
						}
						//System.out.println(c); cannot find symbol
					}	
				}
			}


		b. Static Variable
		----------------------------
			- If the variable is declared with static keyword it is a static variable.

			- It allocates memory at the time of class loading so it is known as class level variable.

			- The default value of static variable is the default value of datatype.

			- It creates a single copy for entire application.
		
		// Static variable
		class Test
		{
			static int x = 10,y;
			public static void main(String[] args) 
			{
				System.out.println(y);
				Test t1 = new Test ();
				Test t2 = new Test ();
				System.out.println(x+"\t"+Test.x+"\t"+t1.x+"\t"+t2.x); //10	10	10

				t2.x = 20;
				Test.x = 90;
				t1.x = 30;
				System.out.println(x+"\t"+Test.x+"\t"+t1.x+"\t"+t2.x);	//30	30	 30	 

			}
		}

		c. Non-static variable
		------------------------------
			- Variables without static keyword
			- Only can be called by Object name
			- It creates different copy/memory for different object.
			- The default vaule of non-static variable is the default value of the datatype

			// Non-Static variable
			class Test
			{
				int x = 10,y;
				public static void main(String[] args) 
				{
					//System.out.println(x); // x cannot be referenced from a static context
					Test t1 = new Test ();
					Test t2 = new Test ();
					System.out.println(t1.y); //0
					System.out.println(t1.x +"\t"+ t2.x); //10	10
					
					t1.x = 90;
					System.out.println(t1.x +"\t"+ t2.x); //90	10

				}
			}

		class Test
		{
			int regdno;
			String name;
			static String Course_name;
			static String inst_name;
			String college;
			static double fees;
		}


		d. Final Variable
		----------------------
			- If the Variable is declared with final keyword i.e. known as constant in java.

			- 2 Restrictions for final Variable
					i. Should be Initialized at the time of declaration
					ii. Cannot be re-assigned or re-initialized

			- Final variable may be static or non-static

			- It is better to declare a final variable as static to avoid memory wastage.

			- Final class cannot be inherited.

			//Final Variable
			class Test
			{
				static final int x = 10;
				final int y = 11;
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					Test t2 = new Test();

					System.out.println(t1.x +"\t"+ t2.y); //10 	11
					System.out.println(t1.y +"\t"+ t2.x); //11 	10

					//t1.x = 90; //cannot assign a value to final variable x
					System.out.println(x); //10
					System.out.println(Test.x); //10
					//t1.y = 20; //cannot assign a value to final variable y
				}
			}

		2. Block members (2 types)
		========================================
			- Java supports 2 types of blocks.
					a. static block
					b. non-static block

				a. static block
				-----------------------------	
					- If the block is declared with static keyword then it is static block.

					- The contents of static block will execute before the main().

					- The existance of main() always check before static block executes.

				class Test
				{
					static
					{
						System.out.println("static block");
					}
					public static void main(String[] args) 
					{
						System.out.println("main() method");	

					}
					static 
					{
						System.out.println("static block 2");
					}
				}

				/*static block
				static block 2
				main() method
				*/
				
				----------------------------------------------

				class Test
				{
					static
					{
						System.out.println("static block"); 
						String arr[] = {"Java"};
						main(arr);
						main(arr);
						main(arr);
						main(arr);
						System.out.println("Hi");
					}
					public static void main(String[] args) 
					{
						System.out.println("Hello");	
					}
					
				}
				/*static block
				Hello
				Hello
				Hello
				Hello
				Hi
				Hello
				*/

				-------------------------------------------

				class Test
				{
					static
					{
						System.out.println("static method");
						Test t1 = new Test();
						t1.show();
					}
					void show()
					{
						System.out.println("show() method");
					}
					public static void main(String[] args) 
					{
						System.out.println("main() method");	
					}
					
				}
				/*
				static method
				show() method
				main() method
				*/

				-------------------------------------------------

				class Test
				{
					static
					{
						System.out.println("static method");
						show();
					}
					static void show()
					{
						System.out.println("show() method");
					}
					public static void main(String[] args) 
					{
						System.out.println("main() method");	
					}
					
				}
				/*
				static method
				show() method
				main() method
				*/

				-----------------------------------------------------


			b. non-static block
			--------------------------
				- If the block is declared without static keyword i.e. non-static block.

				- The contents of the non-static block will execute before object creation.

				- Calling the constructor means Create object.

				- When create the object constructor will be called.

				class Test
				{
					Test()
					{
						System.out.println("Constructor");
					}
					public static void main(String[] args) 
					{
						System.out.println("Hello");	
						Test t1 = new Test() ;
						System.out.println("OK");
					}
					
				}



	//Find Factorial of any number using Function
class Test
{	
	static void fact(int num)
	{
		int x = num,y = 1;
		if (num == 0)
			System.out.println("Factorial is 1");
		else
		{
			for (int i = 1L; i <= num; i++ ) 
			{
				y = y*i;
			}
			System.out.println("Factorial of "+num+" is "+y);
		}
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt ();

		fact(a); //Calling a function

	}
}
----------------------------------------------------------------------------

** It wont even show for a number for 100 so we have to use BigInteger

//Find Factorial of any number using Function using BigInteger
class Test
{	
	static void fact(int num)
	{
		java.math.BigInteger y = new java.math.BigInteger("1");
		if (num == 0)
			System.out.println("Factorial is 1");
		else
		{
			for (int i = 1; i <= num; i++ ) 
			{
				y = y.multiply(new java.math.BigInteger ("" +i)); OR y = y.multiply(new java.math.BigInteger (Integer.toString(i)));
			}
			System.out.println("Factorial of "+num+" is "+y);
		}
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt ();

		fact(a); //Calling a function

	}
}
-------------------------------------------------------------------------------
** This program will do the job for any number



// Example : Check if a number is prime or not using function with best time complexicity
class Test
{
	static boolean checkPrime(int num)
	{
		int cnt = 0,cc = 0;
		for (int i = 2; i <= num/i; i++) 
		{
			if(num%i == 0) {
				//cnt++;
			
			return false; }
			else 
				cc++;
		}	
	System.out.println("The loop will run for "+cc+" times");
		return true;
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt ();	

		boolean result = checkPrime (a);
		if(result == true)
			System.out.println(a+" is Prime");
		else
			System.out.println(a+" is NOT Prime");
	}

}

--------------------------------------------------------------------------

// Example : Findout all the Factors of a number with best time complexicity
class Test
{
	static void displayFactors(int num)
	{
		for (int i = 2; i <= (num/i); i++) 
		{
			if (num%i == 0)	
				System.out.println(i +"\t"+ (num/i));
		}
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt ();	

		displayFactors(a);
	}
}

----------------------------------------------------------------------------


	3. Methods in Java
	-------------------------------
		- Java supports 6 types of method.
			a. Static method
			b. Non-Static method
			c. final method
			d. abstract method
			e. native method
			f. synchronized method

		- Method is a collection of java statement which is responsible to perform a specific task.

		Types of method
		-------------------
			a. Pre-defined method
			b. User-defined method

		Stages of method
		---------------------
			a. Method declaration / prototype
			b. Method design
			c. Method calling

			void show(); //declaration

			void show()
			{
				//logic
			}
			show(); //calling

			Syntax to declare a method
			-------------------------------------------
				Access_Modifier Return_type Function_name (Argument)
				{
					//logic
				}

			- Method within another method i.e. Nested method is not allowed.




							SCOPE TABLE (Static & Non-Static)
						===========================================
								To static member 		To non-static member
								----------------- 		---------------------

			From static 		directly, class_name 	Only by Object_name
			Context 			object_name
			(block/method)

			From non-Static 	directly,class_name 	object_name
			Context 			object_name 			directly possible
			(block/method)



			
			a&b. Static & Non-Static method
			----------------------------------
			class Demo
			{
				int b = 20;
				static int y = 90;
			}
			class Test extends Demo
			{
				static int x = 100;
				int a = 10;

				void show() //From non-static method
				{
					System.out.println("Within Non-Static");
					System.out.println(a); //directly possible
					System.out.println(x);
					System.out.println(b);
					System.out.println(y);
				}
				public static void main(String[] args) //From static method
				{
					//System.out.println(a); //directly not possible
					Test t = new Test();
					System.out.println(t.a); 
					t.show();

				}
				
			}
			/*
			10
			Within Non-Static
			10
			100
			20
			90
			*/


			class Test
			{
				static void add (int a , int b , int c)
				{
					System.out.println("Hi");
				}
				static void add (int a , int b )
				{
					System.out.println("Hello");
				}
				public static void main(String[] args) 
				{
					add(11,22);
					add(11,22,33);
				}
			}


		Va_list (Variable Argument List)
		-----------------------------------------------
			- If the function argument is Va_list then it can accept multiple argument of similar type specified in va_list as well as array of similar type.

			class Test
			{
				static void add (int ...a)
				{
					int sum = 0;
					
					for (int i = 0; i < a.length; i++)
					{
						sum = sum+a[i];
					}
					System.out.println("After add "+sum);
				}
				public static void main(String[] args) 
				{
					add(11,22);
					add(11,22,33);
					add(12,1,12,12,123,14,2412,4,1414,15,51,1232,135,35,41,534,543,56146,3146,3,1636);
					int arr[] = {10,20};
					add(arr);
				}
			}


		- main() argument can be a va_list
		- varargs parameter must be the last parameter.

		c. Final Method
		-------------------------
			- If the method is final , Over-riding is not possible.

				Over-riding
				------------------
				- When the signature of sub-class method is same with the signature of super-class method, It is known as method over-riding

				class Vehicle
				{
					final void run()
					{
						System.out.println("Vehicle is running at speed 50");
					}
				}
				class Cycle extends Vehicle
				{
					/*void run() // run() in Cycle cannot override run() in Vehicle
					{
						System.out.println("Cycle is running at speed 10");
					}*/
					public static void main(String[] args) 
					{
						Cycle c = new Cycle();
						c.run();	
					}
				}


		***
		- If the variable is final and static it can be initialized within static block only
 		- If the variable is final and non-static it can be initialized within non-static block/Constructor only
 			class Test
			{
				static final int x;

				static
				{
					java.util.Scanner sc = new java.util.Scanner(System.in);
					System.out.println("Enter the value");
					x = sc.nextInt();
				}
				public static void main(String[] args) 
				{
					
					System.out.println("Value of x is "+x);
				}
			}
 		***

 		class Test
		{
			final int x;

			
			{
				java.util.Scanner sc = new java.util.Scanner(System.in);
				System.out.println("Enter the value");
				x = sc.nextInt();
			}
			public static void main(String[] args) 
			{
				Test t1 = new Test();
				Test t2 = new Test();
				Test t3 = new Test();

				System.out.println("Value of x for t1 "+t1.x);
				System.out.println("Value of x for t2 "+t2.x);
				System.out.println("Value of x for t2 "+t2.x);

			}
		}
		/*
		Enter the value
		10
		Enter the value
		11
		Enter the value
		12
		Value of x for t1 10
		Value of x for t2 11
		Value of x for t2 11
		*/


		

		d. abstract method
		------------------------------
		- If the method is declared with abstract keyword then it is known as abstract method in java.
		
		- Abstraction is a technique of hiding the implementation details from end user.
		
		- Abstraction can be achieved by 2 ways in java
			1. Abstract class
			2. Interface
		
		- Abstract method is used to declare a function prototype.

		- If any method of a class is abstract, then corresponding class should be declared as abstract class.

		- Abstract class may or maynot contain abstract method

		- If the class is abstract then object cannot be created.

		- Abstract method cannot have a body.

		- Method without body should be declared as abstract.

		- abstract and final/static are illegal combination

		- All the access specifiers are allowed for abstract method except private.
		abstract class Test
		{
			void show() //complete/concrete method
			{
				System.out.println("show() :  	Test");
			}

			// void display(); //missing method body, or declare abstract

			//abstract void display() //abstract methods cannot have a body
			//{}

			//abstract void display(); // Test is not abstract and does not override abstract method display() in Test

			abstract void display(); //abstract method

			abstract final void display(); //illegal combination of modifiers: abstract and final

			public static void main(String[] args) 
			{
				System.out.println("Hello welcome to abstraction");	
			}
			//Test t = new Test(); //Test is abstract; cannot be instantiated

		}


		How to create the object of abstract class
		----------------------------------------------
			1. By implementing Inheritance
			2. By using Anonymous class

		Steps to create the object of abstract class by inheritance
		-----------------------------------------------------------------	
			1. Create a sub-class of abstract class
			2. Override all the abstract method
			3. Create the object of sub-class, that object can be treated as object of abstract class
			4. Call the members of abstract class by sub-class object


	Rules for a complete class
	===============================	
		1. Class should not contain any abstract method
		2. Required to override all the abstract methods of super-class
			

			//create the object of abstract class by inheritance
			abstract class Test
			{
				void show() //complete/concrete method
				{
					System.out.println("show() method in Test Class");
				}

				abstract void display(); //abstract method
			}
			class Demo extends Test
			{
				void display() //abstract method is overridden here
				{
					System.out.println("display() method in Demo class");	
				}
				
				public static void main(String[] args) 
				{
					Demo d = new Demo();	
					d.display();
					d.show();
				}
			}


	Anonymous Class
	============================
		- Class without name i.e. Anonymous class 

		- when a java programmer provide body to an object, automatically create a .class file i.e. known as Anonymous class.

		- It is another way to achieve inheritance

		class Test //javac will create .class file Test
		{
			public static void main(String[] args) 
			{
				Test t1 = new Test ();

				Test t2 = new Test()
				{
				};	//javac will create the anonymous class Test$1
				Test t3 = new Test()
				{
				};	//javac will create the anonymous class Test$2
			}
		}


		-------------------------------------------------------------------------------

		class A
		{
			void show()
			{
				System.out.println("show() in A class");
			}
		}
		class Demo
		{
			public static void main(String[] args) 
			{
				A a0 = new A();

				A a1 = new A() 
				{
				}; //javac will create a anonymous class Demo$1
					//a1 is object of Demo$1
				A a2 = new A()
				{
					void show()
					{
						System.out.println("show() in Demo$2");
					}
				}; //javac will create a anonymous class Demo$2
					//a2 is object of Demo$2

				a0.show(); //will search in Demo , won't find and will get show() in A
				a1.show(); //will search in Demo$1 , won't find and will get show() in A as A is parent of Demo$1
				a2.show(); //will search in Demo$2 , will find and wo't go to A
			}
		}


--------------------------------------------------------------------------------------
	//achieving inheritance through anonymous class
	// Create the object of abstract class with the help of anonymous class
	
			abstract class Test
			{
				abstract void area();

				public static void main(String[] args) 
				{
					//Test t1 = new Test(); //Test is abstract; cannot be instantiated	

					//Test t1 = new Test()
					//{}; // <anonymous Test$1> is not abstract and does not override abstract method area() in Test

					Test t1 = new Test()
					{
						void area()
						{
							System.out.println("area() in Test$1");
						}
					};

					Test t2 = new Test()
					{
						void area()
						{
							System.out.println("area() in Test$2");
						}
					};

					t1.area();
					t2.area();
				}
			}


	//Nested Anonymous class
	class Test
	{
		public static void main(String[] args) 
		{
			Test a = new Test() //Test$1
			{
				Test b = new Test() //Test$1$1
				{
					Test c = new Test() //Test$1$1$1
					{
						Test d = new Test () //Test$1$1$1$1
						{

						};
					};
				};
			};
		}
	}


	e. Native Method
	-----------------------------------------

	- If the method is declared with native keyword then it is known as native method in java.

	- Native method is used to communicate java application with different language like C/C++.

	- 	Java 			--->  Library --->    C/C++
		Application 	<---		  <---    Application


Steps to create native application
---------------------------------------
1. Create a java application
	
	class Test
	{
		native void fact();
		static
		{
			System.loadLibrary("lit");
		}
		public static void main(String[] args) 
		{
			Test t = new Test();
			t.fact();
		}
	}
	Note:	
			- In the above program, fact() is a native method.
			- If the method is native it indicates to java compiler, do not check the method existance at the time of 			compilation but check at runtime.
			- native method also indicates, method present in a different environment (C/C++) but calling from java.

			- loadLibrary() is a static method of System class which is responsible to load the library into JVM.

			- Here "lit" is the library name.


2. Compile the java program
	
		javac  -h  . Test.java

	-h : Create a header file
	.  : In the current directory (instead of . we can write the complete directory name)

	Note:
		The above command will create 2 files
			1. Test.class
			2. Test.h

3. Open header file (Test.h) and copy the function prototype related to fact() method.

4. Design a C program (demo.c) within the copied function prototype.

		#include "Test.h"
		#include "jni.h"
		#include "stdio.h"

		JNIEXPORT void JNICALL Java_Test_fact (JNIEnv *p, jobject q)
		{
			int num , f = 1, i = 1;
			// logic of C program
			printf ("Enter into C environment\n");

			printf ("Enter a number to findout factorial\n");
			scanf("%d",&num);
			for (i = 1; i <= num; i++)
				f = f*i;

			printf ("Fact of is : %d \n",f);
			printf ("Exit from C and enter into Java again..\n\n");
		}

5. Download the C software (MinGw) from www.thetechpoint.in

	Extract MinGw in current folder.

6. set the path of gcc compiler.
	
		set path=;C:\MinGW\bin;

7. Install JDK 1.8 32bits
	Set the path of JDK home

		set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.8.0_25

8. Compile the C program

	gcc -c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" demo.c

	Note: The above command will create demo.o file

9. Create a library (lit.dll) from demo.o file
			dll : dynamic linking library

	gcc -Wl,--add-stdcall-alias -shared -o lit.dll demo.o

10. Compile the Java program by setting the path of javac compiler.
		
		set path=;C:\Program Files (x86)\Java\jdk1.8.0_25\bin;

		javac Test.java

11. Execute the java program
		java Test





D:\JAVA LIT CORE\NativeApplication>javac  -h .  Test.java

D:\JAVA LIT CORE\NativeApplication>set path=;C:\MinGW\bin;

D:\JAVA LIT CORE\NativeApplication>set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.8.0_25

D:\JAVA LIT CORE\NativeApplication>gcc -c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" demo.c

D:\JAVA LIT CORE\NativeApplication>gcc -Wl,--add-stdcall-alias -shared -o lit.dll demo.o

D:\JAVA LIT CORE\NativeApplication>set path=;C:\Program Files (x86)\Java\jdk1.8.0_25\bin;

D:\JAVA LIT CORE\NativeApplication>javac Test.java

D:\JAVA LIT CORE\NativeApplication>java Test
Enter into C environment
Enter a number to findout factorial
5
Fact of is : 120
Exit from C and enter into Java again..




	4. Constructors in java
	------------------------------------------

		- Constructor is used to initialize the object.
		
		- It is very similar to method, but differences are :
			1. Method name may or maynot be same with the class name whereas the class name and constructor name should be equal.

			2. method can be called by class name/object name or directly whereas Constructor can be called by new/this or super keyword.

			3. Modifiers like static/final/native/synchronized/abstract are allowed for method whereas these modifiers are not allowed for Constructor.

			4. Method must hava a return type whereas return type is not allowed for a constructor , If  return type is given to a constructor it behaves like a method.

			5. Method overriding is possible whereas constructor cannot override.

			6. Java supports 6 types of method whereas Constructor only supports 2 types Constructor.

			7. Multiple constructors are not allowed in java.

		class Test
		{
			Test() //constructor
			{
				System.out.println("Test() : constructor");
			}

			/*static Test() //modifier static not allowed here
			{
				System.out.println("Test() : constructor");
			}
			final Test() //modifier final not allowed here
			{
				System.out.println("Test() : constructor");
			}*/

			static void Test() //method
			{
				System.out.println("Test() : method");
			}
			public static void main(String[] args) 
			{
				Test(); //Test() : method
				Test.Test(); //Test() : method
				new Test(); //Test() : constructor
				Test t = new Test(); //Test() : constructor
				t.Test(); //Test() : method  //Will call only the method, never will call the constructor
			}
		}


	Types of Constructor
	-------------------------------
		a. Default constructor
		b. Parameterised constructor

		a. Default Constructor
		------------------------------------ 
			- When java programmer creating a class without designing a constructor, javac compiler automatically provides a constructor for Object creation i.e. technically known as default Constructor.

			- Access specifier of default constructor is always same with the access specifier of Class.

		b. Parameterized Constructor
		-----------------------------------
			- Constructor defined by programmer is known as Parameterized constructor which may or maynot take any argument.

			- More than one constructor in a class known as Constructor overloading.

		public class Test
		{
			Test(int x)
			{
				System.out.println("Test() : with int args");
			}

			/*Test(int y) //constructor Test(int) is already defined in class Test //ambuiguity error
			{
				System.out.println("Test() : with int args");
			}*/
			
			Test(String x)
			{
				System.out.println("Test() : with String args");
			}
			Test (double x)
			{
				System.out.println("Test() : double args");
			}
			public static void main(String[] args) 
			{
				//new Test();//no suitable constructor found for Test(no arguments)	
				new Test(1);
				new Test(1.2);
				new Test("Hello");
				Test t1 = new Test(2.3);
			}
		}



	Object
	=========================================

		- Object is the physical existancce of class

		- Object is the collection of sequence set of bytes from RAM.

		- By default, size of object is 16 bytes.

		- Out of 16 bytes, 12 bytes are alredy used, 4 bytes are alredy free.
		- After 4 bytes gets used, size will increased by 8 bytes.

		- Block size in java is 8 bytes.

		- static and local variables are not part of java object.

		class Test
		{
			int a;
			int b;
			byte c;
			short d;
			short e;
			static long f ;
			public static void main(String[] args) 
			{
				long g;
				Test t = new Test()	;
				System.out.println(Lit.getObjectSize(t));
			}
		}

		- Download Lit.jar
		- copy Lit.jar into current folder
		- set the class path: set classpath=;Lit.jar;
		- compile
		- Run as java -javaagent:Lit.jar Test



		Calling the Constructor
		-----------------------------------
			- Calling the Constructor by new keyword means creating Object.

			- new Test() // Object creation  //Anonymous object

				- Object without any referance is known as Anonymous object

			Reference
			------------------
				- Reference is just like a pointer in java which always refer to base address of object.

				- Base address of object is known as hashcode.

				- Test t1 ; // Here t1 is the reference of Test class

				 	By default t1 holds the null value

					t1 = new Test(); //Here t1 refer to the base of Test class

				class Test
				{
					static Test t1;
					public static void main(String[] args) 
					{
						System.out.println(t1); //null
						t1 = new Test(); 
						System.out.println(t1); // Hashcode //Test@5305068a
						

					}
				}


		Object Linking / LinkedList
		--------------------------------
			- Linking between 2 object is known as LinkedList

			class Student
			{
				int roll;
				Student next;
			}

			class MainClass
			{
				public static void main(String[] args) 
				{
					Student s1 = new Student();	
					Student s2 = new Student();
					Student s3 = new Student();

					s1.roll=11;
					s2.roll=21;
					s3.roll=31;

					s1.next = s2;
					s2.next = s3;
					s3.next = null;

					Student begin = s1;
					System.out.println("LinkedList contains \n-------------------");

					while(begin != null)
					{
						System.out.println(begin.roll);
						begin = begin.next;
					}
				}
			}





Copy Constructor
-----------------------
	- The constructor which responsible to copy contents of one object into another, is known as copy constructor.

class Student
{
	int roll;
	String name;
	Student()
	{

	}
	Student(Student s)
	{
	roll = s.roll;
	name = s.name;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("State of s1 :"+s1.roll+"\t"+s1.name);	
		s1.roll = 100;
		s1.name = "Raja";
		System.out.println("State of s1 :"+s1.roll+"\t"+s1.name);	
		System.out.println("--------------------------------------------");

		Student s2 = new Student(s1);
		System.out.println("State of s12 :"+s2.roll+"\t"+s2.name);	
		s2.roll = 101;
		s2.name = "Rani";
		System.out.println("State of s2 :"+s2.roll+"\t"+s2.name);	
		System.out.println("---------------------------------");

		Student s3 = new Student(s2);
		System.out.println("State of s1 :"+s3.roll+"\t"+s3.name);	
	}
}


Factory Method
----------------------------
	- If return type of a method is a class name, is known as factory method in java.

	- It is used to do object filtering.

	Private Constructor
	------------------------------
		- If a constructor os declared with private, then object cannot be created from outside of that class.

	Singleton Class
	-----------------------
		- If a class can be instantiated (Object Creation) only for a single time, then it is known as Singleton class.

		class Test
		{
			private Test()
			{
				System.out.println("Hello");
			}
		}

		/*
		javac Test.java

		D:\JAVA LIT CORE>javap Test
		Compiled from "Test.java"
		class Test {
		}

		D:\JAVA LIT CORE>javap -private Test
		Compiled from "Test.java"
		class Test {
		  private Test();
		}
		*/



	class Test //Here this class is a Singeton class
	{
		int x = 90;
		static private int cnt = 0;
		private Test()
		{
			System.out.println("Private Constructor..");
		}
		//Return type is class name and it will return the object of that class
		static Test getObject()
		{
			Test t = null;
			if (cnt < 1)
			{
				t = new Test();
				System.out.println("Object created");
			}
			else
			{
				System.out.println("Object already created");
			}
			cnt++;
			return t;
		}
	}
	class Demo
	{
		public static void main(String[] args) 
		{
			//Test t1 = new Test();	//Test() has private access in Test //Object cannot be created

			Test t1 = Test.getObject();
			Test t2 = Test.getObject();
			Test t3 = Test.getObject();

			System.out.println(t1);
			System.out.println(t2);
			System.out.println(t3);


		}
	}
	/*
	Private Constructor..
	Object created
	Object already created
	Object already created
	Test@1f32e575
	null
	null
	*/



Encapsulation
-------------------------------------
	- It is a process or technique of wrapping of data member and method members into a single entity.

		How to achieve encapsulation
		--------------------------------
			1. Declare all the variables as private.
					: private is for information hiding
			
			2. Design getter and setter method for each data member.

						getter method : To view the values of data members
						setter method : To modify the data member

		class Employee
		{
			private int eid;
			private String ename;

			public int getEid()
			{
				return eid;
			}

			public void setEid (int id)
			{
				eid = id;
			}

			public String getEname()
			{
				return ename;
			}

			public void setEname(String name)
			{
				ename = name;
			}
		}

		class Test
		{
			public static void main(String[] args) 
			{
				Employee e = new Employee();
				//e.eid = 100; //eid has private access in Employee		

				e.setEid(100);
				e.setEname("Raja");

				System.out.println("Eid is : "+e.getEid());
				System.out.println("Ename is : "+e.getEname());

			}
		}


Input from Keyboard
-------------------------------------

	1. Command line argument
	2. Scanner class
	3. BufferedReader class
	4. DataInputStream class
	5. Console class

2. Scanner class
------------------------------
	class Test
	{
		public static void main(String[] args) 
		{
			java.util.Scanner sc = new java.util.Scanner(System.in)	;

			System.out.println("Enter name");
			String s = sc.next();
			System.out.println("Name is : "+s);

			System.out.println("Enter roll");
			int x = sc.nextInt();
			System.out.println("Roll is : "+x);

			System.out.println("Enter Branch");
			sc.nextLine(); // else it will just go to next line and wont take any input
			String branch = sc.nextLine(); //Can take multiple string and will take untill nextline has come i.e. till enter is pressed
			System.out.println("Branch is : "+branch);

			System.out.println("Enter College"); //now no need to write sc.nextLine() again, it is written when there is any other calling method before that
			String clg = sc.nextLine(); //Can take multiple string and will take untill nextline has come i.e. till enter is pressed
			System.out.println("Branch is : "+clg);

		}
	}

Yesterday write here
======================================================
Today
------------------------


	class Test
	{
		public static void main(String[] args) 
		{
			// (condition)  ?  (if condition is true do this) : (If condition is false do this)
			int res = 10 > 2 ? 10 : 2;
			System.out.println(res);	//10


		}
	}
	

	dot(.) 		: 		It is used to access
							variable
							Function
							constant
							package
							object
							class


			java.lang.System.out.println (Integer.SIZE);



	comma(,)  :  It is a separator
					int a , b , c ;

	instanceof : It is an opertor which is used to check the object existance and always return boolean value.

		class Demo
		{

		}
		class Test extends Demo
		{
			public static void main(String[] args) 
			{
				Demo d = new Demo();
				Test t = new Test();

				System.out.println(d instanceof Demo); //True
				System.out.println(d instanceof Test); //False
				System.out.println(t instanceof Demo); //True
				System.out.println(t instanceof Test); //True
					
			}
		}

	Note:
		Design a method which will accept 2 arguments and add between them.

		Hint:
			Arguments may be int,char,float,double,object,String.

			After add return the value to caller.


Scanner Class
--------------------------
Diagram refer the image


class Test
{
	public static void main(String[] args) 
	{
		//java.util.Scanner sc = new java.util.Scanner(System.in)	;

		java.io.InputStream hi = System.in;
		java.util.Scanner sc = new java.util.Scanner(hi);

		java.io.PrintStream s = System.out;
		s.println("Enter a Number");
		int no = sc.nextInt();
		s.println("Number is "+no);
	}
}




// How to take Character as an input from KB using DataInputStream
class Test
{
	public static void main(String[] args) throws java.io.Exception
	{
		//java.util.Scanner sc = new java.util.Scanner(System.in)	;

		java.io.DataInputStream dis = new java.io.DataInputStream (System.in);

		java.io.PrintStream s = System.out;
		s.println("Enter a Character");
		char ch = (char) dis.read();
		s.println("U have entered"+ch);

	}
}



D:\JAVA LIT CORE>java Test
Enter a Character
ljbcuysvb
U have entered  l

D:\JAVA LIT CORE>java Test
Enter a Character
2198
U have entered  2

D:\JAVA LIT CORE>java Test
Enter a Character
Tsjfbwedhbv
U have entered  T


** only takes the 1st value as character, rest is ignored

	

	3. BufferedReader
	===============================================

		class Test
		{
			public static void main(String[] args) throws java.io.IOException 
			{
				//java.util.Scanner sc = new java.util.Scanner(System.in)	;

				java.io.InputStreamReader isr = new java.io.InputStreamReader (System.in);
				java.io.BufferedReader br = new java.io.BufferedReader(isr);

				//OR

				java.io.BufferedReader br1 = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));

				System.out.println("Enter your name");
				String name = br.readLine();

				System.out.println("Enter your roll");
				int roll = Integer.parseInt(br.readLine());

				System.out.println("Roll is "+ roll);
				System.out.println("Name is "+ name);

			}
		}

		javap java.io.BufferedReader
		javap java.io.Reader
		javap java.io.InputStreamReader
		javap java.lang.System


	4. Console Class
	-----------------------
		// Input from KB using Console Class
		class Test
		{
			public static void main(String[] args)
			{
				java.io.Console c = System.console();
				System.out.println("Enter a number");
				int num = Integer.parseInt(c.readLine());

				System.out.println("Enter a name");
				String name = c.readLine();

				System.out.println("Name is "+name);
				System.out.println("Number is " +num);
			}
		}

	- Diagram Refer Image



Control Structure using Java : To control the flow of program
-----------------------------------------------
	- Java supports 5 types of control Structure
		1. Conditional
				if
				if...else
				Nested if
				Multiple if
		2. Loop
				for
				while
				do..while
				foreach
		3. Selection
				switch..case
		4. Jump
				break
				continue
				return
				break with label
		5. Sequential


	1. Conditional
	-----------------------
		- It is the replacement of ternary operator (? :)
		class Test
		{
			public static void main(String[] args) 
			{
				if(true)
					System.out.println("Hello");	
					//System.out.println("Java"); //Hanging if or 'else' without 'if' is not allowed so error
				else
					System.out.println("hi");

				int res = 10 > 2 ? 10 : 2;
				System.out.println(res);

				if(10>2)
					System.out.println("10");
				else
					System.out.println("2");
			}
		}
		/*
		if()
		{
			if()
			{
				if()
				{

				}
			}
		}

		if()
		{}
		if()
		{}
		if()
		{}

		According to time complexicity Nested if is more appreciable than multiple if due to it checks less condition
		*/

	2. for loop
	-------------------------
		Suitable if,
				start value,
				step value,
				stop value
			already known.

		for(1st; 2nd; 4th) // All parts are optional
		{
			3rd
		}

		Example:
				Array Traversing


		while() loop
		--------------------------
			Suitable for unknown times loop

		Example : LinkedList Traversing

		while(true/false)
		{
			Logic
		}


		do..while
		---------------------
			Suitable for MenuDriven Program

			Example: Closing Connection

			do
			{

			}while(condition);

		foreach
		------------------
			Suitable for
				Array
				Collection Framework
				Va_list

			for(desination : source)
			{
				Logic
			}

			- foreach loop supports traversing in a forward direction only
			- Update value is always +1.

			- Here start position, step value and condition checking automatically done by compiler.

			class Test
			{
				public static void main(String[] args) 
				{
					int arr[] = {11,22,33};
					System.out.println("Traversing arr by for loop");
					for (int i=0; i<arr.length; i++) 
					{
						System.out.println(arr[i]);	
					}

					System.out.println("Traversing arr by foreach loop");
					for (int i : arr) 
					{
						System.out.println(arr[i]);	
					}
				}
			}

		switch..case
		-------------------
		- It is a replacement if if..else
		- It is suitable for menudriven programe also.

				switch(expression)
				{
					case label:
				}

			- Switch expression and case label can not be float or double.

			- case label only can be a constant i.e. final in java.

			- Duplicate case is not allowed.

			- case without switch is not allowed but switch without case is allowed

			- Nested switch is allowed

			- default is a case which can be placed anywhere, it will execute when no case is satisfied

			- break restricts the control from one case to another.

			- Execution always starts from match case.


		break
		--------------
			- It only can be placed within switch or loop
			- It is used to jump the control outside of current loop / switch.

		break with label
		-------------------
			- It is a replacement of goto in C.
			- It is used to jump the control outside of any loop

		continue
		-------------
			- It only can be placed within loop.
			- It is used to jump the control to the beginning of the loop.

		return
		------------
			- It is used to jump the contol to the caller.


	class Test
	{
		static void show()
		{
			a:
			for (int i = 1; i <= 5; i++) 
			{
				b:
				for (int j = 1; j <= 3; j++) 
				{
					c:
					for (int k =1; k <= 5; k++) 
					{
						System.out.print(k+"\t");	
						if(k==3)
						{
							//break;	//exit from c loop
							//break b; //exit from b loop
							//return 0; // incompatible types: unexpected return value
							//break a; //exit from a loop
							//return; //goes back to the caller or exit from method
							System.exit(0); //Terminate the current running JVM OR Stop execution
						}
					}		
				}	
			}
			System.out.println("java");
			//--50 statements are there
		}
		public static void main(String[] args) 
		{
			System.out.println("hello");
			show();
			System.out.println("Ok");
		}
	}

====================================================

Relation between Classes
-----------------------------------------
	- In java relation can be established by 2 ways
		1. Inheritance (IS-A relation)
		2. Association (HAS-A relation)
				a. Aggregation
				b. Composition

	- Advantages of relation
		1. Code re-usability
		2. Cost cutting
		3. Reduce redundancy

	1. Inheritance
	-------------------------------
		- It is a object oriented technique which is used to create a relation between 2 .class file.
		
		- Out of 2 .class file, one must be super class/base class/parent class whereas another class should be sub-class/derived class/child class

		- Java language support 2 keyword to create a relation between 2 .class file
				1. extends (class-class and interface-interface)
				2. implements (class-interface)

		- Interface to class relation is NOT possible.

	2. Association
	-----------------------
		Aggregation and composition
		-------------------------------
			- No physical relation between 2 .class file but one .class file can access the resources of another.
			
			class student
			{
				int roll;
				String name;
			}

			// Student HAS-A roll number //Association
			// Student HAS-A name //Association 


// Inheritance & Association
---------------------------------------
	class Vehicle
	{
		int speed = 50;
		void run()
		{
			System.out.println("Vehicle is running");
		}
	}
	class Engine
	{
		int modelYear = 2018;
	}
	class Car extends Vehicle
	{
		public static void main(String[] args) 
		{
			Car c = new Car();
			System.out.println("Speed is "+c.speed);	
			//System.out.println(c.modelYear);
			Engine e = new Engine();
			System.out.println("Model Year "+e.modelYear);
			//System.out.println(Engine.modelYear);//modelYear is non-static so cannot be accessed from static context
		}
	}


	- By the reference of a class, access only those resource which is required in java application is the concept of association

	- Association support loose coupling.

	- In inheritance both classes are blood relation i.e. tightly coupled

	- In association both classes are non-blood relation i.e. not tightly coupled or loosely coupled.

	Aggregation
	----------------------
		- It is a form of association support weak bonding.

	Composition
	------------------
		- It is a form of association supports strong bonding.

// Findout size of object in case of inheritance
class Test
{
	int x = 10;
	int y = 20;
}
class Demo extends Test
{
	int a = 11;
	int b = 30;
}
class A extends Demo
{
	int k;
	byte l;
}
class MainClass
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(Lit.getObjectSize(t));	//(12+4) 16(own ob size)+8(y is added)

		Demo d = new Demo();
		System.out.println(Lit.getObjectSize(d)); //(12+4) 16(own)+8(Ob for test)+8(b is added)

		A a = new A();
		System.out.println(Lit.getObjectSize(a)); //(12+4) 16(own)+8(Demo)+8(Test)+8(byte l is added)
	}
}

D:\JAVA LIT CORE>set classpath=;Lit.jar;

D:\JAVA LIT CORE>javac Test.java

D:\JAVA LIT CORE>java -javaagent:Lit.jar MainClass

-----------------------------------
class Car
{

}
class Engine
{

}
class MusicPlayer
{

}

Car HAS-A a MusicPlayer and Car HAS-A Engine.

It may possible MusicPlayer exists without Car and Vice-versa i.e. known as aggregation (Week-Bonding)

It is not possible Car will function without engine and engine exists without Car, this type of relation is known as composition i.e. Strong Bonding



Types of inheritance
----------------------------
	1. Single Inheritance
	2. Multi-level Inheritance
	3. Hierarchical
	4. Multiple
	5. Hybrid


	1. Single Inheritance
	------------------------------
		- By default , class in java supports single inheritance

		e.g., class Test
			  {
				
			  }

			- Here Test class is the sub-class of Object class

		- Object is the super class of each and every class in java.

		- It contains 12 methods
				1.  registerNatives() - Private method
				2. getClass()
				3. hashCode()
				4. equals()
				5. clone()  --Protected
				6. toString()
				7. notify()
				8. notifyAll()
				9. wait()
				10. wait(long)
				11. wait(long , int)
				12. finalize()  -Protected


		//Example
		class Test 
		{
			public static void main(String[] args) 
			{
				Test t = new Test();
				Object ob = new Object();		

				System.out.println(t instanceof Test); //true
				System.out.println(t instanceof Object); //true
				System.out.println(ob instanceof Test); //false
				System.out.println(ob instanceof Object); //true
			}
		}

		/*

		D:\JAVA LIT CORE>javac Test.java

		D:\JAVA LIT CORE>javap Test
		Compiled from "Test.java"
		class Test {
		  Test();
		  public static void main(java.lang.String[]);
		}

		D:\JAVA LIT CORE>set path=;C:\Program Files\Java\jdk1.6.0_43\bin;

		D:\JAVA LIT CORE>javap Test
		Compiled from "Test.java"
		class Test extends java.lang.Object{
		    Test();
		    public static void main(java.lang.String[]);
		}

		*/

	Note:
		- The object of sub-class can be treated as parent-class object But the parent-class object can NOT be treated s the child-class object.



	2. Multilevel Inheritance
	===============================
		- When a .class file behaves like parent as well as sub-class, it is known as multi-level inheritance.

		- Object always created on the basis of parent to child.

		- Member searching always from child class to parent class.

	// Multi level inheritance
	class X
	{
		int a = 10;
		X()
		{
			System.out.println("Constructor X");
		}
	}
	class Y extends X
	{
		int b = 20;
		Y()
		{
			System.out.println("Constructor Y");
		}
	}
	class Z extends Y
	{
		int c = 30;
		Z()
		{
			System.out.println("Constructor Z");
		}
		public static void main(String[] args) 
		{
			Z z1 = new Z();
			System.out.println(z1.a);
			System.out.println(z1.b);
			System.out.println(z1.c);
		
		}
	}

	Constructor X
	Constructor Y
	Constructor Z
	10
	20
	30

	3. Multiple Inheritance
	==========================
		- More than one .class file behaves like super-class.

		- Java doesnot support multiple inheritance with the help of classes.

		- Java support multiple inheritance with the help of Interface.
	class Test
	{

	}
	class Demo
	{

	}
	class MainClass extends Test,Demo
	{

	}

	Note :
		More than 1 class cannot be extended



	Interface
	=====================
		- It is a blue print of class
		- Abstraction can be achieved by 2 ways in java
				1. Abstract class
				2. Interface

			Both abstract class and interface cannot be instantiated directly.
		
		- To create the object of abstract class and interface the following technique are available
				1. Inheritance
				2. Anonymous class

		- Differences between abstract class & interface

		1. Variable : Abstract class support all types of variable declaration, whereas variable within interface by default public, static and final.
	interface Test
	{
	 	int a = 10;
	}
	abstract class Demo
	{
		int x = 100;
	}


	D:\JAVA LIT CORE>javap Test
	Compiled from "Test.java"
	interface Test {
	  public static final int a;
	}

	D:\JAVA LIT CORE>javap Demo
	Compiled from "Test.java"
	abstract class Demo {
	  int x;
	  Demo();
	}


		2. Method : All types of method can be designed within abstract class whereas method within interface by default public and abstract.

	interface Test
	{
	 	int a = 10;
	 	void show();	 
	 	//void show(){}// interface abstract methods cannot have body
	 	
	}
	abstract class Demo
	{
		int x = 100;
		void display()
		{
			System.out.println("display() method");
		}
		abstract void fun();
	}

	/*
	Compiled from "Test.java"
	interface Test {
	  public static final int a;
	  public abstract void show();
	}

	Compiled from "Test.java"
	abstract class Demo {
	  int x;
	  Demo();
	  void display();
	  abstract void fun();
	}
	*/



		3. Abstraction : Abstract class support 0-100 % abstraction whereas interface supports 100% abstraction from the object point of view.

		4. Constructor : Constructor can be designed within abstract class whereas Constructor is not allowed within interface.

	interface Test
	{
	 	//Test(){} // <identifier> expected//error
	}
	abstract class Demo
	{
		Demo()
		{
			System.out.println("Demo() constuctor");
		}
	}

	/*
	Compiled from "Test.java"
	abstract class Demo {
	  Demo();
	}

	D:\JAVA LIT CORE>javap Test
	Compiled from "Test.java"
	interface Test {
	}
	*/


		5. Multiple inheritance : Abstract class doesnot support multiple inheritance whereas it can be achieved by interface directly.

	interface Test
	{
	 	void show();
	}
	abstract class Demo
	{
		void display()
		{
			System.out.println("display() : Demo");
		}
		Demo()
		{
			System.out.println("Demo() constuctor");
		}
		abstract void fun();
	}
	class MainClass extends Demo implements Test
	{
		void fun()
		{
			System.out.println("fun() : MainClass");
		}
		public void show()
		{
			System.out.println("show() : MainClass");
		}
		MainClass()
		{
			System.out.println("MainClass() constuctor");
		}

		public static void main(String[] args) 
		{
			//Test t = new Test(); //Test is abstract; cannot be instantiated
			//Demo d = new Demo(); // Demo is abstract; cannot be instantiated

			MainClass m = new MainClass();	

			m.show();
			m.display();
			m.fun();

		}
	}

	/*
	Demo() constuctor
	MainClass() constuctor
	show() : MainClass
	display() : Demo
	fun() : MainClass

	*/




	//Example : Multiple Innheritance
	interface Test
	{
		void show();
	}
	interface Demo
	{
		void show();
	}
	class MainClass implements Test,Demo
	{
		public void show()
		{
			System.out.println("show() : MainClass");
		}
		public static void main(String[] args) 
		{
			MainClass mc = new MainClass();
			mc.show();
		}	
	}


		6. Loose coupling : Abstraction doesnot support loose coupling but it can be achieved by Interface.



	- Generally interface contains abstract method, but in latest JDK it is possible to design method within interface.

	- To design a method in interface , that method should be static/default/private.

		interface Test
		{
			public static void main(String[] args) 
			{
				System.out.println("Hello welcome");	
				show();
			}
			static void show()
			{
				System.out.println("show() in Interface");
			}
		}

	Hello welcome
	show() in Interface



	Default method within interface
	========================================
		- To enhance the facility of interface, Java support default method implementation.

		// Default method within interface
		interface Test
		{
			default void show()
			{
				System.out.println("show() : Test");
			}
		}
		class Demo implements Test
		{
			public static void main(String[] args) 
			{
				Demo d = new Demo();
				d.show();	
			}
		}


	- Method within interface can be declared as private.


		//Calling a variable and Overridden method in interface

		interface Test
		{
			int x = 10,y=91;
			private void show()
			{
				System.out.println("private show() : Test");
			}
			static void display()
			{
				System.out.println("static display() : Test");
			}
		}
		interface Demo
		{
			int x = 30;
			static void display()
			{
				System.out.println("display() : Demo");
			}
		}
		class MainClass implements Test,Demo
		{
			public static void main(String[] args) 
			{
				MainClass mc = new MainClass();
				//mc.display(); //Will show cannot find symbol
				//mc.display();

				Test.display(); //only can be called by ClassName
				Demo.display();	

				//System.out.println(mc.x); //reference to x is ambiguous

				System.out.println(mc.y); //91
				System.out.println(Test.x); //10
				System.out.println(Demo.x); //30
			}
		}


	4. Hierarchical Inheritance
	===============================
		- More than one .class file inherited from a single class.

			class Test extends Object
			{}
			class Demo extends Object
			{}

	5. Hybrid Inheritance
	==============================
		- Combination of more than one type of inheritance is hybrid inheritance.

			class Test extends Object
			{}
			class Demo extends Object
			{}
			class X extends Demo
			{}

	*** SPECIAL CASE
		class Test
		{}
		interface Demo{}
		//class MainClass implements Demo extends Test //not possible
		class MainClass extends Test implements Demo
		{

		}



	Object Cloning
	==========================
		- It is a technique to create a clone of an object.

		clone() 	: 	it is a method of Object class, which is responsible to create a clone.
				  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;

		- The object to be cloned, corresponding class should be sub-class of Cloneable interface.

		- Cloneable is a marker interface in java.

			- The interface without any member is known as marker interface.

				e.g., Cloneable
						Serializable

		- Marker interface indicates to JVM, object is created for a very special purpose.

		Functional interface
		----------------------------
			- The interface with a single method i.e. Functional interface.

			e.g, Runnable



class Demo
{
	static Object show() //// If a return type of a method is Object, It can return anything
	{
		//return 10;
		//return 1.0;
		//return "Hello";
		return new Demo();
		// It can retrn anything.

	}
	public static void main(String[] args) 
	{
		//Demo d = show();// Object cannot be converted to demo
		Demo d = (Demo) show(); //Class Casting
		System.out.println(show());	
	}
}



class Employee implements Cloneable
{
	int eid;
	String ename;
	double salary;

	public static void main(String[] args) throws Exception
	{
		Employee e1 = new Employee();	
		e1.eid = 100;
		e1.ename = "Raja";
		e1.salary = 10000;
		System.out.println(e1.eid+"\t"+e1.ename+"\t"+e1.salary);

		Employee e2 = new Employee();
		System.out.println(e2.eid+"\t"+e2.ename+"\t"+e2.salary);

		//Employee e3 = e1.clone(); // incompatible types: Object cannot be converted to Employee
		Employee e3 = (Employee) e1.clone(); //Class Casting // unreported exception CloneNotSupportedException; must be caught or declared to be thrown
		System.out.println(e3.eid+"\t"+e3.ename+"\t"+e3.salary);
		//Now wil compile but wont run, will show .CloneNotSupportedException: Employee
		//Must do implements Cloneable to run the program
	}
}

/*
100     Raja    10000.0
0       null    0.0
100     Raja    10000.0

*/





Polymorphism
=========================
	- It is an object oriented concept, which is used to create a different form of a single resource.

	- It can be achieved by 2 ways
			1. Overloading i.e. Compile-time Polymorphism
			2. Overriding i.e. Run-time Polymorphism

	1. Overlading
	===================
		- it is possible by 2 ways
			a. method overloading
			b. constructor overloading

		- Java doesnot support operator overloading

		a. Method Overloading
		===========================
			- More than one method 
			- with the same name
			- within a single class
			- with different argument
					If these 4 conditions satisfies then only method overloading occurs


		class Test
		{
			static Object show()
			{
				System.out.println("show() : object return type");
				return new Demo();
			}
			static void show(int x)
			{
				System.out.println("show() : void return type");
			}
			public static void main(String[] args) 
			{
				Demo d = (Demo) show();
				System.out.println(d);	
				show(1223);
			}
		}

		/*
		show() : object return type
		Demo@1f32e575
		show() : void return type
		*/


Note:
	main() method can be overloaded.
	final method can be overloaded.
	static method can be overloaded.
	return type doesnot play any role at the time of overloading
	Only by different argument the method overloading can happen.




		a. Constructor Overloading
		===========================
			- More than one Constructor 
			- within a single class
			- with different argument
					If these 4 conditions satisfies then only Constructor overloading occurs


		http://thetechpoint.in/join-bishnu-sir.html

			class Test
			{
				Test(String s)
				{
					System.out.println("Test() : String");
				}
				Test()
				{
					System.out.println("Test() : void");
				}
				Test(int x)
				{
					System.out.println("Test() : int");
				}
				public static void main(String[] args) 
				{
					new Test();
					new Test(100);
					new Test("Hello");
				}
			}


Working with this keyword
-------------------------------------
	- this is a keyword in java, which always refers to current object.

	- this keyword only can be placed within non-staic content.

	Uses of this keyword
	---------------------------------
		1. It is used to call the constructor from another constructor without creating a new object
			this() statement must be the first statement within constructor.

		// Use -1
		--------------------
		class Test
		{
			Test(String s)
			{
				this();
				System.out.println("Test() : String");
			}
			Test()
			{
				this(123);
				System.out.println("Test() : void");
			}
			Test(int x)
			{
				System.out.println("Test() : int");
			}
			public static void main(String[] args) 
			{
				new Test("Hello");
			}
		}

		/*
		Test() : int
		Test() : void
		Test() : String
		*/
	Note:
		Call a constructor from another constructor is known as constructor chaining.

		//Use - 2
		--------------------------
		- this is used to diaplay current object hashcode.

		class Test
		{
			void show()
			{
				System.out.println(this); //Test@5305068a
			}
			public static void main(String[] args) 
			{
				new Test().show();	
			}
		}

		//Use - 3
		------------------
			- when local and instance variable is same, then this keyword is used to create a difference betweeen them.
			- Here this refers to the instance variable.
		class Test
		{
			int x = 10,y = 20;
			void show()
			{
				int x = 30;
				System.out.println(x); //30
				System.out.println(y); //20
				System.out.println(this.x); //10
			}
			public static void main(String[] args) 
			{
				new Test().show();
			}
		}

		Use - 4
		----------------
			- this keyword can be used as a function argument.

		Use - 5
		----------------
			- this keyword can be used as a constructor argument.

		Use - 6
		------------------
			- this keyword can be used as a return value.

class Demo
{
	Demo get()
	{
		return this;
	}
	int x = 100;
	Demo(Test t)
	{
		int x = 200;
		System.out.println(x); 			//200
		System.out.println(this.x);		//100
		System.out.println(t.x);		//10
		System.out.println(get());		//Demo@1f32e575
	}
}
class Test
{
	int x = 10;
	void show()
	{
		new Demo(this);
	}
	public static void main(String[] args) 
	{
		new Test().show();	
	}
}

	

2. Overriding
===========================
	- When signature of the sub-class method is same with the signature of super-class method i.e. called as method over-riding.
		
		Restrictions	
		-----------------
			- Final method cannot override.
			- static method can override with static implementation.
			- Access specifier of the sub-class method should be same or less restricted than parent class method.

	class Test
	{
		String s;
		public String toString() //you have not written public --> attempting to assign weaker access privilages.
		{
			return s;
		}
		Test(String s)
		{
			this . s = s;
		}
		public static void main(String[] args) 
		{
			Test t = new Test("Hi")	;
			System.out.println(t); 				//Hi
			System.out.println(t.toString());	//Hi
			String s = new String("Hello");
			System.out.println(s);				//Hello
			System.out.println("Ok");			//Ok
		}
	}




Working with super keyword
======================================
	- The super keyword always refers to parent class objects.
	- super keyword only can bbe placed within a non-static context.

	//Use-1
	1. When the variable of the super-class & sub-class is same then super refers to super-class variable.

class Demo
{
	int x = 10;
}
class Test extends Demo
{
	int x = 20;
	void show()
	{
		int x = 30;
		System.out.println(x);			//30
		System.out.println(this.x);		//20
		System.out.println(super.x);	//10
	}
	public static void main(String[] args) throws Exception
	{
		// System.out.println(super.x);	//variable super cannot be referenced from a static context
		new Test().show();
	}
}


	//Use-2
	2. In case of method overriding, super always refers to parent class method.

class Test
{
	public String toString()
	{
		return "Hello";
	}
	void show()
	{
		System.out.println(this);				//Hello
		System.out.println(toString());			//Hello
		System.out.println(super.toString()); 	//Test@5305068a
	}
	public static void main(String[] args) 
	{
		new Test().show();	
	}
}



	//Use-3
	3. To call the constructor of parent-class from child-class constructor, "super" can be used.
		- Here super must be the first statement within constructor.

class Demo
{
	Demo(int x)
	{
		System.out.println("Demo : constructor");
	}
}
class Test extends Demo
{
	Test()
	{
		super(123);
		System.out.println("Test : constructor");	
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}
// Demo : constructor
// Test : constructor




	Practical - Website ru Class Diagram 1
	------------------------------------------
		Created Person.java
		Created Student.java
		Created Emoloyee.java
		Created MainClass.java



abstract class Person
{
	private String name;
	private String address;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}

	abstract void printInfo();
}



class Student extends Person
{	
	private int roll;
	private double cgpa;

	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	public double getCgpa()
	{
		return cgpa;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}

	public void printInfo()
	{
		System.out.println("Student Details \n ---------------------------------");
		System.out.println("Roll : "+getRoll());
		System.out.println("Cgpa : "+getCgpa());
		System.out.println("Student Name : "+getName());
		System.out.println("Student Address : "+getAddress());
	}

}


class Employee extends Person
{	
	private int empId;
	private double salary;

	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public void printInfo()
	{
		System.out.println("Employee Details \n ---------------------------------");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Address : "+getAddress());
	}

}


class MainClass 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Student s = new Student(); //Object Created Student Class

		System.out.println("Enter the roll :");
		s.setRoll(sc.nextInt());

		System.out.println("Enter the name :");
		s.setName(sc.next());

		System.out.println("Enter the cgpa :");
		s.setCgpa(sc.nextDouble());

		System.out.println("Enter the Address :");
		s.setAddress(sc.next());

		//Either write all this
		System.out.println("Student Details \n ---------------------------------");
		System.out.println("Roll : "+s.getRoll());
		System.out.println("Cgpa : "+s.getCgpa());
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student Address : "+s.getAddress());

		//OR write this method and design this method in Student class
		s.printInfo();



		Employee e = new Employee(); //Object Created Employee Class

		System.out.println("Enter the Employee Id :");
		e.setEmpId(sc.nextInt());

		System.out.println("Enter the name :");
		e.setName(sc.next());

		System.out.println("Enter the Salary :");
		e.setSalary(sc.nextDouble());

		System.out.println("Enter the Address :");
		e.setAddress(sc.next());


		//Either write all this
		System.out.println("Employee Details \n ---------------------------------");
		System.out.println("Employee Id : "+e.getEmpId());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee Address : "+e.getAddress());


		//OR write this method and design this method in Employee class
		e.printInfo();
	}
}






Dynamic Method Dispatching / Dynamic Binding
===================================================
	- It is possible by 2 ways.
			1. Upcasting
			2. DownCasting

		1. Upcasting
		----------------------------
			- When super-class reference refer to child class object.

	class Test
	{
		void fun1()
		{
			System.out.println("fun1() : Test");
		}
		void fun2()
		{
			System.out.println("fun2() : Test");
		}
	}
	class Demo extends Test
	{
		void fun1()
		{
			System.out.println("fun1() : Demo");
		}

		void fun3()
		{
			System.out.println("fun3() : Demo");
		}
		public static void main(String[] args) 
		{
			//Demo d = new Demo();
			//d.fun1(); //fun1() : Demo	

			Test t = new Demo(); //Object will be created for Demo with the reference of Test Class
			//Test t will be at Compile time
			//new Demo() will be at run time
			t.fun1(); //fun1() : Demo
			t.fun2(); //will check in Test during compiling time, will get. At runtime new Demo() is created and will check in Demo, not found , 
						//will go to Test, will found and print O/P
			//t.fun3(); During Compiling t will check method in Test class as t is reference of Test, if exist then okey, else error //cannot find symbol
		}
	}



	// UpCasting Real time Implementation

	interface Connection
	{
		void getConnection();
	}
	class OracleConnection implements Connection
	{
		public void getConnection()
		{
			System.out.println("Connection Estblished With Oracle Database");
		}
		public void requestProcessing()
		{
			System.out.println("Process Request");
		}
	}
	class MySqlConnection implements Connection
	{
		public void getConnection()
		{
			System.out.println("Connection Estblished With MySql Database");
		}
	}
	class Test
	{
		public static void main(String[] args) 
		{
			Connection con1 = new OracleConnection();
			con1.getConnection();
			//con1.requestProcessing();//error//Cannot find symbol
			Connection con2 = new MySqlConnection();
			con2.getConnection();
		}
	}


		2. DownCasting
		---------------------
			- When child/sub-class reference refer to parent/super class object.			



Q. Why "super" must be first statement within Constructor
=================================================================
	Before create the object of Child java always create the object of Parent class.

Q. Why "this" must be first statement within Constructor
===============================================================
	To avoid memory Wastage.


	class Demo
	{
		Demo()
		{
			System.out.println("Demo() method");
		}
	}
	class Test extends Demo
	{
		Test()
		{
			//Here by-default super keyword is there //will create parent class object first
			System.out.println("no args");
		}
		Test(int x)
		{
			this(); //Will call default constructor by this()
			System.out.println("int args");
			//this(); //call to this must be first statement in constructor
		}
		public static void main(String[] args) 
		{
			new Test(123);	
		}
	}
	/*
	Demo() method
	no args
	int args
	*/


Package in Java
==============================	
	- It is a collection of classes and interfaces.
	- Package is a container just like a folder, package within another package is known as sub-package.

	- Package is used to solve following problems
		1. Encapsulation
		2. Avoid class name ambiguity
		3. Searching will be faster

	- Types of package
		1. Pre-defined package
		2. User-defines package

	- pre-definded package : The packages which are in-built with the standard JDK provides sun microsystem or Oracle

	- User defined package : Packages which are created by java programmer accordiing to requirement of application.

	- Package is a keyword in java, which is used to create a package in java.

	- rt.jar / jrt-fs.jar is the container for all the packages related to core-java/J2SE.

	- Location of rt.jar / jrt-fs.jar is
			C:/program files/java/jre/lib/rt.jar  (for old jdk)
			C:/program files/java/jdk/lib/jrt-fs.jar (for new jdk)

	- Example to create an user-definde pakckage
	-------------------------------------------------
		package lit.core.java;
		class Test
		{
			public static void main(String[] args) 
			{
				System.out.println("Welcome to user-defined package");	
			}
		}
	
	- Note:
		package should be the very first statement within java program.


D:\JAVA LIT CORE>javac -d . Test.java

D:\JAVA LIT CORE>java lit.core.java.Test
Welcome to user-defined package



	How to compile a package program
	------------------------------------------
		javac 	-d 		E:/ 	Test.java (package created in E drive)
		javac 	-d 		. 		Test.java (package created in current folder)
		javac 	-d 		.. 		Test.java (package created in previous folder)
		javac 	-d 		d:/ 	Test.java (package created in D drive)


	How to run a package program
	------------------------------------------
		java lit.core.java.Test


	-d <directory> 	:  Specify where to place generated .class file

	E:/  :  Specify where to place generated main package.

	Note: To execute the package program, we have to be present in that location where main package is available.


	***To execute the package application/program from any location, it is required to set the classpath.


	How to set the class path
	------------------------------
		2 ways
			1. Temporary (using Cmd)
			2. permanent (using Env. variables)

	path vs classpath
	---------------------------------
		set path : It is used to set the path of .exe file

		set classpath : It is used to set the path of .class file / .jar file

				set classpath=;D:/JAVA LIT CORE;


		D:\JAVA LIT CORE>java lit.core.java.Test
		Welcome to user-defined package

		D:\JAVA LIT CORE>cd..

		D:\>java lit.core.java.Test
		Error: Could not find or load main class lit.core.java.Test
		Caused by: java.lang.ClassNotFoundException: lit.core.java.Test

		D:\>set classpath=;D:/JAVA LIT CORE;

		D:\>java lit.core.java.Test
		Welcome to user-defined package

		D:\>c:

		C:\>java lit.core.java.Test
		Welcome to user-defined package

 



- Members of a .class file (in package program) can be accessed by 2 ways
		1. Fully qualified name/path
				java.util.Scanner sc = new java.util.Scanner(System.in);
		2. import statement

	1. Fully qualified name/path : We have to specify the full path of package.


	2. import statement : 
				import a single class
				import a package
				static import

			import java.io.BufferedReader; //Single class import
			import java.util.*; // import all the .class file of util can be accessed
			import java.sql.*;

			import java.awt.*;
			import java.awt.event.*; //import a package doesnot means import its sub packages

			import static java.lang.System.out; //import a single static member

			import static java.util.Scanner.*; //import all static member 

			class Test
			{
				public static void main(String[] args) 
				{
					java.util.Scanner sc = new java.util.Scanner(System.in);

					//Date d = new Date(); // reference to Date is ambiguous // Date is a .class file present in both util and sql package of java so error
							// to avoid this must use fully qualified name.
					java.util.Date d = new java.util.Date();
					System.out.println(d);

					out.println("Hello Java");
				}
			}




Access Specifiers
==================================================

					Within 			Within 			Within 			Outside 	  Outside
					same pkg		same 			same 			pkg  		  pkg
					base			pkg 			pkg 			sub-class 	  Inde-class
					class			sub-class 		inde-class
--------------------------------------------------------------------------------------------------------
					Sbc.java 		Ssc.java 		Sic.java 		Osc.java 		Oic.java
--------------------------------------------------------------------------------------------------------
lit 				j2se 			j2se 			j2se 			j2ee 			j2me
--------------------------------------------------------------------------------------------------------
public 				true 			true 			true 			true 			true
--------------------------------------------------------------------------------------------------------
protected 			true 			true 			true 			true 			false
--------------------------------------------------------------------------------------------------------
default 			true 			true 			true 			false 			false
--------------------------------------------------------------------------------------------------------
private 			true 			false 			false 			false 			false
--------------------------------------------------------------------------------------------------------



//Sbc.java
package lit.j2se;
public class Sbc
{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;

	public void display()
	{
		System.out.println("With respect to Sbc");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		System.out.println("-------------------------------------");
	}

}


//javac  	-d 		. 		Sbc.java




//Ssc.java
package lit.j2se;
public class Ssc extends Sbc
{
	public void display()
	{
		System.out.println("With respect to Ssc");
		System.out.println(a+"\t"+b+"\t"+c);//+"\t"+d); // d has private access in Sbc
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Ssc.java




//Sic.java
package lit.j2se;
public class Sic
{
	public void display()
	{
		Sbc ob = new Sbc();
		System.out.println("With respect to Sic");
		System.out.println(ob.a+"\t"+ob.b+"\t"+ob.c);//+"\t"+d); // d has private access in Sbc
		System.out.println("-------------------------------------");
	}
}

//javac  	-d 		. 		Sic.java



//Osc.java
package lit.j2ee;
public class Osc extends lit.j2se.Sbc
{
	public void display()
	{
		System.out.println("With respect to Sic");
		System.out.println(a+"\t"+b);//+"\t"+c); //c is not public in Sbc; cannot be accessed from outside package
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Osc.java




//Oic.java
package lit.j2me;
import lit.j2se.*;
public class Oic
{
	public void display()
	{
		lit.j2se.Sbc ob = new lit.j2se.Sbc();
		System.out.println("With respect to Sic");
		System.out.println(ob.a);//+"\t"+ob.b); // b has protected access in Sbc
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Oic.java





//AccessTest
package core.java.Student;
import lit.j2se.*;
import lit.j2ee.Osc;
import lit.j2me.Oic;

public class AccessTest
{
	public static void main(String[] args) 
	{
		new Sbc() . display();
		new Ssc() . display();
		new Sic() . display();	
		new Osc() . display();
		new Oic() . display();

	}
}


//javac 	-d 	. 	AccessTest.java
//java core.java.Student.AccessTest




D:\JAVA LIT CORE>javac -d . Sbc.java

D:\JAVA LIT CORE>javac -d . Ssc.java

D:\JAVA LIT CORE>javac -d . Sic.java

D:\JAVA LIT CORE>javac -d . Osc.java

D:\JAVA LIT CORE>javac -d . Oic.java

D:\JAVA LIT CORE>javac -d . AccessTest.java

D:\JAVA LIT CORE>java core.java.Student.AccessTest
With respect to Sbc
10      20      30      40
-------------------------------------
With respect to Ssc
10      20      30
-------------------------------------
With respect to Sic
10      20      30
-------------------------------------
With respect to Osc
10      20
-------------------------------------
With respect to Oic
10
-------------------------------------



Important Program
Enter a class name
Findout all the variables/fields
		all the methods/functions
		all the constructors
-------------------------------------------

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class FindOut
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class name with pacgage name");
		//Eg:java.lang.Object
		String input=sc.nextLine();
		Class c=Class.forName(input);
		Field field[]=c.getDeclaredFields();
		System.out.println("Fileds are...");
		System.out.println("------------------------------");
		for(Field s:field)
			System.out.println(s);
		Method method[]=c.getDeclaredMethods();
		System.out.println("Method are...");
		System.out.println("------------------------------");
		for(Method s:method)
			System.out.println(s);
		Constructor constructor[]=c.getDeclaredConstructors();
		System.out.println("Constructor are...");
		System.out.println("------------------------------");
		for(Constructor s:constructor)
			System.out.println(s);
		
		
		
	}

}

- Class is a pre-defined class in java.lang package.
- This class contains all the information about each and every .class file in java
- forName() : it is a static method of Class class to load .class file into JVM. which throws classNotFoundException
- Object can be created by 5 different ways in java.
		1. new keyword
		2. Factory method
		3. object cloning
		4. newInstance() method
		5. De-serializtion

	4. newInstance() method
	-----------------------------
		- It is a method of Class class which is responsible to create the object of that class which is loaded into JVM.

	class Test
	{
		int x = 90;
		static int y = 10;
		Test()
		{
			System.out.println("Test() : Constructor");
		}
		Test(int x)
		{
			System.out.println("Test() : Constructor int args");
		}
		void show()
		{
			System.out.println("show() method");
		}
		public static void main(String[] args) throws Exception
		{
			Class c = Class.forName("Test");
			// Test t = c.newInstance();	//incompatible types: Object cannot be converted to Test
			Test t = (Test)c.newInstance(); //Child class reference pointing to parent class which is Downcasting so do classCasting
				//It will give Warning
					// Note: Test.java uses or overrides a deprecated API.
					// Note: Recompile with -Xlint:deprecation for details.

			// javac -Xlint Test.java
			// Test.java:10: warning: [rawtypes] found raw type: Class
			//                 Class c = Class.forName("Test");
			//                 ^
			//   missing type arguments for generic class Class<T>
			//   where T is a type-variable:
			//     T extends Object declared in class Class
			// Test.java:12: warning: [deprecation] newInstance() in Class has been deprecated
			//                 Test t = (Test)c.newInstance(); //Child class reference pointing to parent class which is Downcasting so do classCasting
			//                                 ^
			//   where T is a type-variable:
			//     T extends Object declared in class Class
			// 2 warnings

			System.out.println(t.x);
		}
	}




Array in Java
=======================
	- Array is a collection of similar types of data stored in a sequential order and it is used to create a list.

	- List can be created by 2 ways
			1. Array
			2. LinkedList

	- Array is static in nature i.e. size cannot be changed at runtime

	- LinkedList is dynamic i.e. can be expanded as well as shrinked.

	- LinkedList also holds similar types of data like array.

	- Array is suitable if size is known.

	- LinkedList is suitable is size is unknown.

	Types of array
	--------------------
		1. single dimensional array
		2. Multi dimensional array

	- Array can be constructed by 3 steps
		1. Declaration :
				int   arr[];
				int   []arr;
				int[]   arr;

				//int arr[10]; //Error
			Note:
				Size is not allowed at the time of declaration.

		2. Memory allocation :
				arr = new int[3];
				//arr = new int[]; // Error // Size is compulsory

		3. Initialization : 
				//arr = new int[3] {11,22,33}; //error //size is not allowed if array already initialized.

				arr = new int[] {11,22,33};


	import java.util.Arrays;
	import java.util.Scanner;

	public class Test 
	{
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) 
		{
			
			System.out.println("Enter the size");
			int size = sc.nextInt();
			int arr[] = new int [size];
			
			input(arr);
			display(arr);
			
			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("After sort : "+Arrays.toString(arr));
			int index = Arrays.binarySearch(arr, 11);
			if(index >= 0)
				System.out.println("Found at "+index);
			else
				System.out.println("Not Found");
			
			int brr[] = Arrays.copyOfRange(arr, 1, 3);
			System.out.println("After copy : "+Arrays.toString(brr));
			
			System.out.println(Arrays.equals(arr, brr));
		}
		private static void display(int[] arr) 
		{
			System.out.println("Display array elements");
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		private static void input(int arr[]) 
		{
			System.out.println("Enter the elements");
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i] = sc.nextInt();
			}
			
		}
	}



Arrays class
-------------------
	- Arrays is a pre-defined class present in java.util package
	- This class is used to manipulate array like searching , sorting .. etc.


2D
--------------
	- 2D is the collection of 1D.

import java.util.Scanner;

public class Array_2D 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter no of rows");
		int row = sc.nextInt();
		System.out.println("Enter no of Columns");
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		
		System.out.println("Rows : "+arr.length);
		System.out.println("Cols : "+arr[0].length);
		input(arr);
		display(arr);
	}

	static void display(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}

	static void input(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the elements for row "+i);
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
	}
}


Enter no of rows
3
Enter no of Columns
2
Rows : 3
Cols : 2
Enter the elements for row 0
11
22
Enter the elements for row 1
11
22
Enter the elements for row 2
11
22

11	22	
11	22	
11	22	



Jagged/Wragged Array
--------------------------------
	- Column size for each row is different


import java.util.Scanner;

public class Jagged_Array 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter no of rows");
		int row = sc.nextInt();
		
		int arr[][] = new int [row][];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the column size for row "+i);
			int col = sc.nextInt();
			arr[i] = new int[col];
		}
		
		input(arr);
		display(arr);
	}
	//input and display method is same as 2D program

	static void display(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}

	static void input(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the elements for row "+i);
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
	}
}


Enter no of rows
3
Enter the column size for row 0
1
Enter the column size for row 1
2
Enter the column size for row 2
4
Enter the elements for row 0
1
Enter the elements for row 1
12
123
Enter the elements for row 2
11
22
33
44

1	
12	123	
11	22	33	44	




3-D Array
=========================
	- 3D is the collection of 2D.

public class Array_3D 
{
	public static void main(String[] args) 
	{
		char arr[][][] = new char [2][3][2];
		char ch = 'A';
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				for (int k = 0; k < arr[i][j].length; k++) 
				{
					arr[i][j][k] = ch++;
					System.out.print(arr[i][j][k] +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}


A	B	
C	D	
E	F	

G	H	
I	J	
K	L	



Array Of Objects
------------------------
import java.util.Scanner;
class Student
{
	 int roll;
	 String name;
	 double cgpa;
}

public class ArrayOfObjects 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		Student s[] = new Student[size];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			
			s[i] = new Student();
			System.out.println("Enter Details");
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].cgpa = sc.nextDouble();
			
		}
		System.out.println("All Student Details");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			System.out.println(s[i].roll);
			System.out.println(s[i].name);
			System.out.println(s[i].cgpa);
		}
	}
}

//Sort the array of the objects based on roll (use interfaces comparator and comparable)
//Sort the array of the objects based on roll,name,cgpa



Enter the size
3
null
Enter Details
1
D
1.1
null
Enter Details
2
E
2.2
null
Enter Details
3
W
3.3

All Student Details
Student@7b23ec81
1
D
1.1
Student@5f184fc6
2
E
2.2
Student@3feba861
3
W
3.3



String in Java
=====================================
	- String is not a character array in java.

	- String is a pre-defined class present in java.lang package.

	- String is final class so cannot be inherited

	- String can be constructed by 2 ways.
			1. Using literal i.e. String s = "Hello";
			
			2. By new keyword i.e. String s = new String ("Hello");

	- If string is created by string literal it allocates memory from string pool.

	- String pool is a temporary memory which cannot store any duplicate string.

	- String which is created by new, it allocates a different memory in heap memory or RAM.

	- "==" always check the hashcode in case of string

	- equals() method always check the contents.

import java.util.Scanner;

public class String_Example 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1 == s2); //true
		System.out.println(s2 == s3); //false
		System.out.println(s3 == s4); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //true
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1.hashCode()); //69609650
		System.out.println(s3.hashCode()); //69609650
		
		System.out.println(s1 == s3); //false

		String s5 = new String("Java");
		
		System.out.println(s1.hashCode()); //69609650
		System.out.println(s5.hashCode()); //2301506
	}
}





import java.util.Scanner;

public class String_Example2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		System.out.println(s1.length()); //5
		System.out.println(s1.charAt(0)); //H
		System.out.println(s1.indexOf('l')); //2
		System.out.println(s1.lastIndexOf('l')); //3
		System.out.println(s1.substring(2)); //llo
		System.out.println(s1.substring(2, 4)); //ll
		System.out.println(s1.codePointAt(0)); //72
		System.out.println(s1.concat(" Welcome")); //Hello Welcome
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.contains("l")); //true
		System.out.println(s1.replace("l", "k")); //Hekko
		System.out.println(s1.equals("Hello")); //true
		System.out.println(s1.equals("hello")); //false
		System.out.println(s1.equalsIgnoreCase("hello")); //true
		System.out.println(s1.compareTo("hello")); //-32
		System.out.println(s1.compareToIgnoreCase("hello")); //0
		
	}
}





import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		System.out.println(s1);
		String s2[] = s1.split(" ");
		
		int count=0;
		for (String s : s2) 
		{
			System.out.println(s+"\t"+s.length());
			if(!s.isEmpty())
				count++;
		}
		System.out.println("No of words : "+count);
	} 
}

/*
Enter a string
Hello    Hi   Hy
Hello    Hi   Hy
Hello	5
	0
	0
	0
Hi	2
	0
	0
Hy	2
No of words : 3
*/




StringBuffer
----------------------------
	- It is very similar to string
	- Difference is String is immutable whereas StringBuffer is mutable & faster.

	- Like String , StringBuffer is also a final class.

	- immutable : Contents of object connot be changed.

	- mutuable : contents of object cn be changed.

StringBuilder
--------------------------
	- It is also a final class present in lang package

	- Like StringBuffer, StringBuilder is mutable.

		Difference is String and StringBuffer, both are synchronized whereas StringBuilder is not synchronized

	synchronized : It is thread-safe.
			- Can be used in multi-threading
			- support locking



public class String_Example4 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		System.out.println(s1.concat(" Welcome"));
		System.out.println(s1);
		
		System.out.println("--------------------------");
		
		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println(sb1);
		System.out.println(sb1.append(" welcome"));
		System.out.println(sb1);
	}
}





public class String_Example6 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		char arr[] = s1.toCharArray(); //String to char array
		for (char ch : arr) 
		{
			System.out.println(ch);
		}
		arr[0] = 'H';
		String s2 = new String(arr); //char array to string
		System.out.println(s2);
	}
}





public class String_Example7 
{
	public static void main(String[] args) 
	{
		String s1 = "";
		System.out.println(s1); //Print just a new line
		System.out.println(s1.length()); //0
		
		String s2 = null;
		System.out.println(s2); //print null
		System.out.println(s2.length()); //NullPointerException
	}
}






Immutable Class
------------------------
	//An Immutable class
	 final class Student
	{
		 final String name;
		 final int regno;
		 public Student(String name,int regno)
		 {
			 this.name=name;
			 this.regno=regno;
		 }
		 public String getName()
		 {
			 return name;
		 }
		 public int getRegNo()
		 {
			 return regno;
		 }
		
	}

	public class MainMethod 
	{
		public static void main(String[] args)
		{
			Student s=new Student("ABC",102);
			System.out.println(s.getName());
			System.out.println(s.getRegNo());
			//final varible not reinstalized
			//s.regno=102;
			
		}

	}




class Test
{
	public static void main(String[] args) 
	{
		Thread.sleep(1000);
		Runtime rt = Runtime.getRuntime();
		rt.exec("calc.exe");
		rt.exec("mspaint.exe");
		rt.exec("notepad.exe");	
	}
}





Collection Framework using java / Data Structure using Java
--------------------------------------------------------------------
	Framework : It provides a pre-defined/readymade architecture

			Framework provides pre-defined classes & interfaces to do a particular task.

	Collection:
	-------------------
		- It represents a single unit of object.

	Collection Framework
	----------------------------
		- It provides an architecture for storing and manipulating group of objects programmatically.


	Tree structure of collection classes and interfaces
	-------------------------------------------------------------
											Collection (interface)
												 |
												 |
												 |^
				 List 							Set 				Queue   (upto these only)		Map (all are interfaces in this line)
				  |								 |					  |								  |
				  | 							 |^					  | 							  |
				  | 					HashSet 	  TreeSet 		  | 							  |^
				  | 												  |^					HashMap   TreeMap   Hashtable
 				  ^ 												Deque (interface)
LinkedList 		ArrayList 		Stack
								  |
								  |^
								Vector 				Rest are classes


List - allows duplicate objects
Set - doesn't allows duplicate objects
Queue - FIFO structure




LinkedList
----------------------------
	- It is a pre-defined class present in java.util package.
	
	- This class internally uses double LinkedList.
	
	- It is used to create and manipulate LinkedList using pre-defined methods.
	
	- It follows insertion order

	- It is not synchronized



import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Example 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		list.addFirst(11);
		list.addFirst(22);
		list.addLast(33);
		list.add(1, 44);
		list.add(1, 11);
		System.out.println(list);
		
		for (Integer x : list) 
		{
			System.out.print(x+"\t");
		}
		
		System.out.println("\n"+list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(3));
		
		Collections.sort(list);
		System.out.println("\nAfter sort "+list);
		Collections.reverse(list);
		System.out.println("After Reverse "+list);
		
		System.out.println(list.contains(22));
		System.out.println(list.indexOf(22));
		System.out.println(list.lastIndexOf(22));
		System.out.println(list.size());
		System.out.println(list.hashCode());
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println(list1);
		list.addAll(list1);
		list.addAll(2, list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.removeLast();
		list.removeFirst();
		System.out.println(list);
	
		Object arr[] = list.toArray();
		for(Object obj:arr)
			System.out.print(obj+"\t");
		
		Object string = list.toString();
		System.out.println(string);
		
		
	}
}


[]
true
[22, 11, 44, 11, 33]
22	11	44	11	33	
22
33
11

After sort [11, 11, 22, 33, 44]
After Reverse [44, 33, 22, 11, 11]
true
2
2
5
70268672
[100, 200, 300]
[44, 33, 100, 200, 300, 22, 11, 11, 100, 200, 300]
[44, 33, 22, 11, 11]
[44, 33, 11, 11]
[33, 11]
33	11	[33, 11]



Note :
	In the above program LinkedList can store only Integer objects as generics is specified.

	<Integer> : It is generics

	- Generics has been there since Jdk 5

	- it provides stronger type safety.(means it can huge no of objects but only of a single type object)

	- It allows a collection can store only a specific objects.


Collections Class
--------------------------
	- A class present in java.util package
	- provides various methods for sorting a list, binarySearch, reverse a list, etc
package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortedList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");
		
		System.out.println("Before Sorting : "+list);
		Collections.sort(list);
		System.out.println("After sorting : "+list);
		System.out.println(Collections.binarySearch(list, "Z"));
		Collections.reverse(list);
		System.out.println(list);
	}
}




ArrayList
--------------------------------------------
	- It is a per-defined class present in java.util package.

	- This class is known as dynamic array in java.

	Array & ArrayList (Similarities)
	--------------------------------------
		- Both are sequential
		- Both follow insertion order
		- Index starts with 0

	Array & ArrayList (Difference)
	--------------------------------------
		- Array is static but ArrayList os dynamic

	ArrayList & LinkedList (Similarities)
	------------------------------------------
		- Both are dynamic
		- Not synchronized
		- Duplicate elements are allowed

	ArrayList & LinkedList (Difference)
	------------------------------------------
		- ArrayList is sequential but LinkedList is not sequential

	Note :
			ArrayList is faster than LinkedList in case of searching and sorting but  slower in case of insertion and deletion.

	add() vs addAll()
	------------------------
		add() is used to add an object but addAll() is used to merge a Collection in another collection.

	remove() vs removeAll()
	--------------------------
		remove() is used to delete an object but removeAll() is used to remove a collection from another collection.


	- add() and addLast() both are same.

	- It can store any type of data but in real time it may cause problem like when we pass the object into another method it may cause ClassCastException
	- Hence using of generics is is better to restrict a particular data to be stored inside the list.


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list);
		
		list.add(0,11);
		list.add(0, 21);
		list.add(1, 31);
		list.add(41);
		System.out.println(list);
		
		System.out.println("Traversing using get()");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.print(list.get(i)+"\t");
		}
		
		list.remove(0);
		System.out.println("\n"+list);
		
//		list.removeAll(list);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
		
		System.out.println("Traversing using Iterator");
		Iterator<Integer> itr1 = list.iterator();
		while (itr1.hasNext()) 
		{
			System.out.print(itr1.next()+"\t");
		}
		
	}
}


[]
[21, 31, 11, 41]
Traversing using get()
21	31	11	41	
[31, 11, 41]
Traversing using Iterator
31	11	41	





Ways to taverse a collection
----------------------------------------
	1. Print the object.
			System.out.println(list);
	2. foreach loop
	3. get() method
	4. After convert to array
			toArray()
	5. Iterator
	6. ListIterator
	7. Enumeration


5. Iterator
----------------
Iterator<Integer> itr1 = list.iterator();
while (itr1.hasNext()) 
	{
		System.out.print(itr1.next()+"\t");
	}



Iterator : it is used to traverse the collection

iterator() : it returns the collection

hasNext() : Check the next element existance

next() : It returns the next element and move the crusor pointer / references to the next object




6. ListIterator
-----------------------
	Iterator support forward traversing only whereas ListIterator supports forward & backward traversing.

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Example2 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list = new ArrayList<Character>();
		
		System.out.println(list);
		
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		System.out.println(list);
		
		ListIterator<Character> itr = list.listIterator();
		
		System.out.println("Traversing using ListIterator by forward :");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Traversing using ListIterator by backward :");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}



[]
[A, B, C, D]
Traversing using ListIterator by forward :
A
B
C
D
Traversing using ListIterator by backward :
D
C
B
A



All Ways of traversing a list
--------------------------------------
package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class TraversingList 	
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random obj = new Random();
		for (int i = 1; i <= 10 ; i++)
		{
			int no = obj.nextInt(20);
			list.add(no);
			System.out.print(no+"\t");
		}
		System.out.println("\nNow Traversing");
		
		System.out.println(list);
		for(int i = 0; i < list.size() ; i++)
			System.out.print(list.get(i)+"\t");
System.out.println();
		for (Integer res : list) 
			System.out.print(res+"\t");
System.out.println();
		Iterator<Integer> itr = list.iterator(); //Can Only go in forward
		while (itr.hasNext()) 
			System.out.print(itr.next()+"\t");
System.out.println();
		ListIterator<Integer> ltr = list.listIterator(); //Can go forward and Backward
		while (ltr.hasNext()) 
			System.out.print(ltr.next()+"\t");
System.out.println();
		while (ltr.hasNext()) 
			System.out.print(ltr.previous()+"\t");		
System.out.println();
		Enumeration e = Collections.enumeration(list);
		while (e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
		
	}
}




Comparator interface
--------------------------------
	- It prints the objects in natural order
	- we can change the natural order by creating our own Comparator class


package collectionFramework.ComparatorComparable;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer>
{
	public int compare(StringBuffer o1, StringBuffer o2) 
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2);
		//compareTo() returns
		// +ve value if s1 comes first
		// -ve vaule if s2 comes forst
		// 0 if both are same
	}
	
}


package collectionFramework.ComparatorComparable;

import java.util.TreeSet;

public class StringBuffTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>(new StringBufferComparator()); //Orders the string set in alphabetical order
		set.add(new StringBuffer("ABC"));
		set.add(new StringBuffer("XYZ"));
		set.add(new StringBuffer("KJH"));
		set.add(new StringBuffer("DTR"));
		
		for (StringBuffer res : set) 
			System.out.println(res);
	}
}




-------------------------------------------------------------------------------
package collectionFramework.ComparatorComparable;

import java.util.Comparator;

public class StringComparator implements Comparator<String>
{
	public int compare(String o1, String o2) 
	{
		int l1 = o1.length();
		int l2 = o2.length();
		
		if(l1 < l2)
			return -1;
		else if(l1 > l2)
			return 1;
		else
			return o1.compareTo(o2);
	}
	
}

package collectionFramework.ComparatorComparable;

import java.util.TreeSet;

public class StringTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>(new StringComparator()); //Orders the string set in alphabetical order
		set.add("ABCVDC");
		set.add("XYFFZ");
		set.add("KJHHRFSHFS");
		set.add("DTRF");
		for (String res : set) 
			System.out.println(res); //It will print in the min-max length order 
	}
}




Comparable Interface
---------------------------------------
	- based on id of employee sort the objects

package collectionFramework.ComparatorComparable;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
	int id;
	String name;
	
	EmployeeComparable(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeComparable o) 
	{
		int id1 = this.id;
		int id2 = o.id;
		
		if(id1 < id2)
			return -1;
		else if(id1 > id2)
			return 1;
		else
			return 0;
		
	}
}

package collectionFramework.ComparatorComparable;

import java.util.TreeSet;

public class Employee 
{
	public static void main(String[] args) 
	{
		// TreeSet<EmployeeComparable> set = new TreeSet<EmployeeComparable>(); //To compare with id 
		TreeSet<EmployeeComparable> set = new TreeSet<EmployeeComparable>(new EmployeeNameComparator()); // to compare with name
		set.add(new EmployeeComparable(100, "Obama"));
		set.add(new EmployeeComparable(400, "Debi"));
		set.add(new EmployeeComparable(200, "Raja"));
		set.add(new EmployeeComparable(500, "Rani"));
		
		for (EmployeeComparable ec : set) 
		{
			System.out.println(ec.id);
			System.out.println(ec.name);
		}
	}
}


To Sort based on the names use comparator for above program
--------------------------------------------------------------------
package collectionFramework.ComparatorComparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeComparable> 
{
	public int compare(EmployeeComparable o1, EmployeeComparable o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		
		return s1.compareTo(s2);
	}

}




Stack DataStructure
==================================
	- It is a collection which store & manipulation object in LIFO (Last In First Out) basis.

	- Stack is a pre-defined class present in java.util package

	- Index of stack always starts with 1.

	- It is not synchronized (it doesnot support locking and unlocking)

	- Duplicate elements are allowed

	- Insertion and deletion are always happens from top as it follows LIFO structure

import java.util.Stack;

public class Stack_Example 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(11);
		st.push(21);
		st.push(11);
		st.push(31);
		st.push(11);
		st.push(41);
		st.push(51);
		st.push(11);
		
		System.out.println(st);
		System.out.println(st.peek()); //print very first element
		System.out.println(st.search(11)); //search, where 1st time got, print the index
		System.out.println(st.pop()); //delete very first elements
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
	}
}


[11, 21, 11, 31, 11, 41, 51, 11]
11
1
11
[11, 21, 11, 31, 11, 41, 51]
false
7
[]




Queue and Deque
========================
	- Both are pre-defined interfaces present in java.util package

	- Both support FIFO order.

	- Insert at Last & Delete from first.

	- it is not synchronized

	- Duplicate elements are allowed.

	- Deque : double ended queue (i.e. Insert and Delete operation from both side)

	- We cannot create the object the Queue as it is a interface so create object by annonymous class of downcasting(create method of child class).

								Queue
								  |
								  | parentof
								  ^
								Deque
								  |
								  | parentof
								  ^
								LinkedList


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(11);
		q.add(12);
		q.add(14);
		q.add(15);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		dq.add(11);
		dq.addLast(12);
		dq.addFirst(14);
		dq.add(15);
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		dq.remove();
		System.out.println(dq);
	}
}



[11, 12, 14, 15]
[12, 14, 15]
[14, 11, 12, 15]
[12]



Random Class
-----------------
	- It is a class present in java.util package.
	- it is used to generate Random numbers.
package collectionFramework.Random;

import java.util.Random;

public class RandomDemo 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		
		int x = obj.nextInt(); //Generate a random number
		System.out.println("x : "+x);
		int y = obj.nextInt(100); //Generate a random number b/w 100
		System.out.println("y : "+y);
	}
	
	
}



HashSet & TreeSet
=================================
	- Both are pre-defined classes present in java.util package

	- Both can not store duplicate object.

	- Evaluation based on object not on the basis of index.
			remove(1);  //1 is a value

	- HashSet implements Set interface
	- SortedSet interface extends Set interface and SortedSet is extended by NavigableSet which is implemented by TreeSet 
	
	Difference
	---------------------
		- HashSet store objects in random order
		- LinkedHashSet maintains a insertion order
		- TreeSet store objects in an ascending order.

		Remove all the duplicate elements from array/LinkedList & sort in ascending order.

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Example 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		int arr[] = {11,22,22,11,2,1,23,1,11,22};
		
		for (int x : arr) 
		{
			set1.add(x);
			set2.add(x);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(set1);
		System.out.println(set2);
		
		set2.remove(22);
		System.out.println(set2);
		System.out.println(set2.size());
	}
}


Set vs List
----------------------
package collectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++)
		{
			int no = obj.nextInt(5);
			list.add(no);
		}
		System.out.println("List : "+list);
		
		HashSet<Integer> set = new HashSet<Integer>(list); //Doesn't allow duplicate values
		System.out.println("Set : "+set);
		
		
	}
}




HashSet - LinkedHasSet - TreeSet
---------------------------------------------
package collectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Diff_Sets 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		
		HashSet<Integer> set1 = new HashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		TreeSet<Integer> set3 = new TreeSet<>();
		
		for(int i=1; i <= 5; i++)
		{
			int no = obj.nextInt(100);
			set1.add(no);
			set2.add(no);
			set3.add(no);
			System.out.print(no+"\t");
		}
		System.out.println("\n HashSet elements : "+set1); //Order is not maintained
		//Overcome by LinkedHashset
		System.out.println("LinkedHashSet elements : "+set2); //Insertion Order maintained
		System.out.println("TreeSet elements : "+set3); //Stored in ascending order
		
	}
}
/*
 52	22	90	85	92	
 HashSet elements : [52, 85, 22, 90, 92]
LinkedHashSet elements : [52, 22, 90, 85, 92]
TreeSet elements : [22, 52, 85, 90, 92]
 */






HashMap, TreeMap, Hastable
=========================================
	HashMap : It is a pre-defined class present in java.util package

		- It evaluate the list on the basis of kyes.

		- Duplicate key will be replaced with latest/new object.

		- key can be any type of object & value also can be any tyoe of objects.

		- Here key store in a random order.

	- All the above three are pre-defined classes present in java.util package.

	Common
	------------
		- Store object on the basis of key
		- Duplicate key will be replaced with new object
		- Duplicate objects are allowed
		- key and value can be any type of object

	Difference
	----------------
		- HashMap : Not synchronized
					Store keys in a random order

		- TreeMap : Not synchronized
					Store keys in ascending order

		- Hashtable : synchronized
					  Store keys in a random order


import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMap_TreeMap_Hashtable 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> map1 = new HashMap<Integer , String> ();
		map1.put(100, "Raja");
		map1.put(100, "Rani");
		map1.put(10, "Hi");
		map1.put(11, "Hi");
		map1.put(1, "Z");
		System.out.println(map1);
		
		Hashtable<Integer , String> map2 = new Hashtable<Integer , String> ();
		map2.put(100, "Raja");
		map2.put(100, "Rani");
		map2.put(10, "Hi");
		map2.put(11, "Hi");
		map2.put(1, "Z");
		System.out.println(map2);
		
		TreeMap<Character , String> map3 = new TreeMap<Character , String> ();
		map3.put('J', "Java");
		map3.put('O', "Oracle");
		map3.put('S', "Spring");
		map3.put('H', "Hibernate");
		map3.put('A', "Advance Java");
		System.out.println(map3);
		
		System.out.println(map3.firstEntry());
		System.out.println(map3.lastEntry());
		System.out.println(map3.keySet());
		System.out.println(map3.values());
		System.out.println(map3.entrySet());
		System.out.println(map3.containsKey('H'));
		System.out.println(map3.containsValue("Java"));
		System.out.println(map3.size());
		System.out.println(map3.get('J'));
		map3.remove('J');
		System.out.println(map3);
	}
}



{1=Z, 100=Rani, 10=Hi, 11=Hi}
{10=Hi, 1=Z, 100=Rani, 11=Hi}
{A=Advance Java, H=Hibernate, J=Java, O=Oracle, S=Spring}
A=Advance Java
S=Spring
[A, H, J, O, S]
[Advance Java, Hibernate, Java, Oracle, Spring]
[A=Advance Java, H=Hibernate, J=Java, O=Oracle, S=Spring]
true
true
5
Java
{A=Advance Java, H=Hibernate, O=Oracle, S=Spring}




Program
----------------------
	
	class Student : TreeMap (roll,Student)
		roll : key

		values
		---------
			name
			age
			cgpa

			courses : Array
			phone_no : HashSet
			email : ArrayList
			address : LinkedList
			reference : HashMap

import java.util.*;
class Students
{
	String name;
	int age;
	double cgpa;
	String courses[];
	Set<Long> phone_nos;
	List<String> emails;
	List<String> addresses;
	Map<String,Long> refs;
	
	Scanner sc = new Scanner(System.in);
	public Students()
	{
		System.out.println("Enter the name");
		name = sc.next();
		
		System.out.println("Enter the age");
		age = sc.nextInt();
		
		System.out.println("Enter the cgpa");
		cgpa = sc.nextDouble();
		
		System.out.println("Enter the no of courses");
		int size = sc.nextInt();
		courses = new String[size];
		for (int i = 0; i < courses.length; i++) 
		{
			System.out.println("Enter a new course");
			courses[i] = sc.next();
		}
		
		phone_nos = new HashSet<Long>();
		String choice = "";
		do 
		{
			System.out.println("Enter a Phone number");
			phone_nos.add(sc.nextLong());
			System.out.println("Do you want to add another Phone number");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		emails = new ArrayList<String>();
		do 
		{
			System.out.println("Enter new email id");
			emails.add(sc.next());
			System.out.println("Do you want to add another email-Id");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		addresses = new LinkedList<String>();
		do 
		{
			System.out.println("Enter new Address");
			addresses.add(sc.next());
			System.out.println("Do you want to add a new Address");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		refs = new HashMap<String , Long>();
		do 
		{
			System.out.println("Enter new reference");
			refs.put(sc.next(),sc.nextLong());
			System.out.println("Do you want to add a new reference");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));	
	}
	public String toString()
	{
		return  name+" "+age+" "+cgpa+" "+Arrays.toString(courses)+" "+phone_nos+" "+emails+" "+addresses+" "+refs+"\n";
	}
}
public class Collection_Program 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String choice = "";
		TreeMap<Integer , Students> map = new TreeMap<Integer , Students> ();
		do 
		{
			System.out.println("Enter a new Roll number");
			map.put(sc.nextInt(), new Students());
			System.out.println("Do you want to add another student");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		System.out.println("All the Student details");
		System.out.println(map);
	}
}


Enter a new Roll number
100
Enter the name
Debi
Enter the age
21
Enter the cgpa
3.3
Enter the no of courses
2
Enter a new course
Java
Enter a new course
Oracle
Enter a Phone number
198168451685
Do you want to add another Phone number
no
Enter new email id
kjebgchbnwchbwiahrvi@gmail.com
Do you want to add another email-Id
no
Enter new Address
jcbehbcihlfbwhfby
Do you want to add a new Address
no
Enter new reference
hcbehcb
121
Do you want to add a new reference
no
Do you want to add another student
no
All the Student details
{100=Debi 21 3.3 [Java, Oracle] [198168451685] [kjebgchbnwchbwiahrvi@gmail.com] [jcbehbcihlfbwhfby] {hcbehcb=121}
}








Vector & Enumeration
=======================
	- It is a pre-defined class present in java.util package

	- Vector evaluate list on the basis of index and value

	- Can store duplicate

	- Follows insertion order

	- synchronized (Can be used in multi-threading)

	import java.util.*;
	public class Vector_Example 
	{
		public static void main(String[] args) 
		{
			Vector<Integer> v = new Vector<Integer>();
			
			v.addElement(11);
			v.addElement(21);
			v.addElement(31);
			v.addElement(11);
			v.add(1,100);
			v.add(2,200);
			v.add(3,300);
			System.out.println(v);
			
			v.remove(0);
			v.removeElement(200);
			System.out.println(v);
			
			Enumeration e = v.elements();
			while(e.hasMoreElements())
				System.out.println(e.nextElement());
		}
	}


[11, 100, 200, 300, 21, 31, 11]
[100, 300, 21, 31, 11]
100	300	21	31	11	


Enumeration : It is used to traverse the collection
hasMoreElements() : Check the element existance
nextElement() : return the element





Exception Handing in Java
-----------------------------------
	- It is a particular situation where program terminates abnormally.
	
	- Exception may occur at the time of compilation or at execution time.

	Types of Exception
	-----------------------------
		1. Checked Exception / Compile-time Exception
		2. Unchecked Exception / Run-time Exception 

	Tree Structure of Exception
	-----------------------------------------

	Throwable
			Error
				AssertionError
				StackOverflowError
				UnsupportedClassVersionError
				NoClassDefinitionFound
				OutOfMemoryError
				NoSuchMethodError
				..............................
			Exception (These are Unchecked Exception)
				IOException
						EOFException
						FileNotFoundException
				RuntimeException (RuntimeException & its all sub-classes are known as Unchecked Exception)
						InputMismatchException
						NumberFormatException
						NullPointerException
						IndexOutOfBoundsException
								ArrayIndexOutOfBoundsException
								StringIndexOutOfBoundsException
						ArithmeticException
						ArrayStoreException
						...............................
				UnknownHostException (These 2 are Checked Exception)
				InterruptedException
				............................


Note:
	Each and every Exception is a pre-defined class in java.
	Exception is the super-class of  all the exception.

	- Java support 5 keywords to work with the Exception
		1. try
		2. catch
		3. throw
		4. throws
		5. finally

	try-block
	---------------
		- The java code which may generate exception in future should be placed within try-block.
		- This block is compulsory executed.
		- try-block is not an independent block.
		- It depends on catch/finally or resources

	catch-block
	-------------
		- It is known as Exception handler or Exception handled block.
		- Execution of this block is optional, it executes after satisfying 2 conditions
				1. Code within try-block should generate Exception.
				2. The corresponding Exception handler should be available in catch.

		- catch-block contains exception handled code

	syntax
	---------------
		try
		{
			Exception generating code
		}
		catch (Throwable t)
		{
			Exception handle codes
		}

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println(args[0]);
			// System.out.println("Java"); 
			// should not write which doesnot produce a exception, it will skip after the exception is produced.
		}
		catch(ArrayIndexOutOfBoundsException are)
		{
			System.out.println("Enter argument from commandline");
			System.out.println(are);
		}

		System.out.println("Terminates Normally");
	}
}


try with multiple catch
-------------------------------
	- Multiple catch blocks are allowed for a single try but only single catch block will execute at a particular time.

	- JVM is responsible to generate the Exception & throws to user for handling.

	- Generating Exception : Creating the Object of corresponding class & pass to user.

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		}
		catch(ArrayIndexOutOfBoundsException are)
		{
			System.out.println("Enter input from command line");
		}
		catch(NumberFormatException num)
		{
			System.out.println("Do not enter Character from commandline, enter a number");
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Do not divide by zero");
		}

		//catch(ArrayIndexOutOfBoundsException jc)
		// {
		// 	System.out.println("Again Written");
		// }
		
		// D:\JAVA LIT CORE>javac Test.java
		// Test.java:24: error: exception ArrayIndexOutOfBoundsException has already been caught
  		// catch(ArrayIndexOutOfBoundsException jc)


		System.out.println("Terminates Normally");
	}
}

D:\JAVA LIT CORE>java Test 12 0
Hello
Do not divide by zero
Terminates Normally

D:\JAVA LIT CORE>java Test 12
Hello
Enter input from command line
Terminates Normally

D:\JAVA LIT CORE>java Test 12 hvqwvh
Hello
Do not enter Character from commandline, enter a number
Terminates Normally

D:\JAVA LIT CORE>java Test 12 12
Hello
1
Terminates Normally




*** More than one exception in a single catch block

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException are)
		{
			System.out.println("Exception Handled");
		}
		

		System.out.println("Terminates Normally");
	}
}



- As Exception is the super class of all types of Exception in java, it can able to handle any type of exception according to rule of upcasting.

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("Exception Handled by child");
		}
		// No Error
		catch(Exception e)
		{
			System.out.println("Exception Handled by parent");
		}
		
		// catch(ArrayIndexOutOfBoundsException arr)
		// {
		// 	System.out.println("Exception Handled by child");
		// }
		// error: exception ArrayIndexOutOfBoundsException has already been caught
  //               catch(ArrayIndexOutOfBoundsException arr)

		System.out.println("Terminates Normally");
	}
}



- The sub-class handler should be handled before super-class Handler.




class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			System.out.println(e.getMessage()); //Why
			System.out.println(e); //Why and which type
			e.printStackTrace(); // Details about exception
		}
		
		System.out.println("Terminates Normally");
	}
}

Hello
Exception Handled
Index 0 out of bounds for length 0
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Test.main(Test.java:9)
Terminates Normally



throw keyword
--------------------------------------
	- It is a keyword in java which is used to generate the exception.

	- The statement after throw statement is unreachable if throw statement is not properly handled.

	syntax
	------------
			throw 	Throwable_object

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Caught....");
		}
		
		System.out.println("Terminates Normally");
	}
}

Hello
Caught....
Terminates Normally

	

	User-Defined Exception / Custom Exception
	----------------------------------------------
		- Exception declared, generate and handled by user i.e. user-defined.

		- User-defined class should be sub-class of any type of Exception.

// Nested Exception and User-defined Exception

import java.util.*;
class EvenException extends Exception
{

}
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int num = sc.nextInt();

			try
			{
				if(num%2 == 0)
				{
					throw new EvenException();
				}
				else
					System.out.println("Odd Number");
			}
			catch(EvenException e)
			{
				System.out.println(e);
				e.printStackTrace();
				System.out.println("User-defined Exception handled");
			}
		}
		catch(Exception e1)
		{
			System.out.println("Enter a Number only, Handled by Generics");
		}

		System.out.println("Terminates Normally");
	}
	
}


D:\JAVA LIT CORE>java Test
Hello
Enter a Number
1
Odd Number
Terminates Normally

D:\JAVA LIT CORE>java Test
Hello
Enter a Number
2
User-defined Exception handled
Terminates Normally

D:\JAVA LIT CORE>java Test
Hello
Enter a Number
12a
Enter a Number only, Handled by Generics
Terminates Normally




throws keyword
=======================
	- It is a keyword in java which is used to forward the exception to caller.

	throw vs throws
	----------------------
		- throw can be placed within function/constructor body whereas throws can be placed within function prototype.

//Exception Propagation : Process to pass Exception object from called method/constructor to caller

//Unchecked Exception automatically Propagates
class Test
{
	void show() throws Exception
	{
		System.out.println("show() : Test");
		throw new Exception();
	}
	void display() throws Exception
	{
		System.out.println("display() : Test");
		show();
		System.out.println("Ok");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			new Test().display();
		}
		catch(Exception e)
		{
			System.out.println("Handled by caller");
		}
		System.out.println("Terminates Normally");
	}
	
}


// D:\JAVA LIT CORE>javac Test.java

// D:\JAVA LIT CORE>java Test
// Hello
// display() : Test
// show() : Test
// Ok
// Terminates Normally

// D:\JAVA LIT CORE>javac Test.java
// Test.java:6: error: unreported exception Exception; must be caught or declared to be thrown
//                 throw new Exception();
//                 ^
// 1 error

// D:\JAVA LIT CORE>javac Test.java
// Test.java:11: error: unreported exception Exception; must be caught or declared to be thrown
//                 show();
//                     ^
// 1 error

// D:\JAVA LIT CORE>javac Test.java
// Test.java:18: error: unreported exception Exception; must be caught or declared to be thrown
//                 new Test().display();
//                                   ^
// 1 error

// D:\JAVA LIT CORE>javac Test.java

// D:\JAVA LIT CORE>java Test
// Hello
// display() : Test
// show() : Test
// Handled by caller
// Terminates Normally



//If not handled by anyone
class Test
{
	void show() throws Exception
	{
		System.out.println("show() : Test");
		throw new Exception();
	}
	void display() throws Exception
	{
		System.out.println("display() : Test");
		show();
		System.out.println("Ok");
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello");
		
		new Test().display();

		System.out.println("Terminates Normally");
	}
	
}
Hello
display() : Test
show() : Test
Exception in thread "main" java.lang.Exception
        at Test.show(Test.java:6)
        at Test.display(Test.java:11)
        at Test.main(Test.java:19)



//Unchecked Exception automatically Propagates
class Test
{
	void show()
	{
		System.out.println("show() : Test");
		throw new RuntimeException();
	}
	void display()
	{
		System.out.println("display() : Test");
		show();
		System.out.println("Ok");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		try
		{
			new Test().display();
		}
		catch(Exception e)
		{
			System.out.println("Handled by caller");
		}

		System.out.println("Terminates Normally");
	}
	
}
Hello
display() : Test
show() : Test
Handled by caller
Terminates Normally


finally keyword
=======================	
	- It is a block which is very similar to catch block.

	catch vs finally
	-------------------
		- catch is used to handle exception whereas finally is used to handle unreachable statement.

		- catch block execution is optional whereas finally is compulsory executed.

		- More than one catch blocks are allowed for a single try whereas only single finally is allowed.

		class Test
		{
			public static void main(String[] args)
			{
				System.out.println("Hello");
				
				try
				{
					System.out.println("try-block");
					System.exit(0); //Only statement in java which will Terminate the program without executing finallly.
					throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("catch - block");
				}

				finally
				{
					System.out.println("Finally - Block");
				}
				System.out.println("Terminates Normally");
			}
			
		}

		exit() : This method always accept an integer as an argument
				 0 - Normal Termination (First child process will die then parent process)
				 non-zero - Abnormal Termination (Anything can happen)




//Example : Pass Exception to JVM
			// Handle Unreachable Statement
class Test
{
	int x = 100;
	int show() throws Exception
	{
		System.out.println("I am in show() : Test");
		
		try
		{
			System.out.println("try - block");
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("catch - block");
			throw new Exception(); //Either write this Exception inside try and handle with a catch block, OR throw exception to caller by throws keyword
		}
		finally
		{
			System.out.println("finally - block");
			x++;
			return x;
		}
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello");
		
		int res = new Test().show();
		System.out.println("Value from show is "+res);

		System.out.println("Terminates Normally");
	}
	
}



Rules of throws keywords in case of method Over-riding
------------------------------------------------------------
	1. When a method within super class already throws Exception then method of sub-class may or mey not throws the Exception.

class Test
{
	void show() throws Exception
	{

	}
}
class Demo extends Test
{
	void show() throws Exception //May or maynot write throws Exception
	{

	}
}



	2. If super-class method doesnot throws any checked Exception then sub-class method cannot throws.
class Test
{
	void show()
	{

	}
}
class Demo extends Test
{
	void show() throws Exception 
	{

	}
}

// Test.java:1: error: error while writing Test: D:\JAVA LIT CORE\Test.class
// class Test
// ^
// Test.java:10: error: show() in Demo cannot override show() in Test
//         void show() throws Exception //May or maynot write
//              ^
//   overridden method does not throw Exception
// 2 errors




	3. Method within sub-class can throws only that Exception or its sub-class which already throws by super-class method.
class Test
{
	void show() throws java.io.IOException
	{

	}
}
class Demo extends Test
{
	void show() throws Exception 
	{

	}
}

// Test.java:10: error: show() in Demo cannot override show() in Test
//         void show() throws Exception
//              ^
//   overridden method does not throw Exception
// 1 error



=====================================================================================

Graphics in Java
------------------------------------
	- To create a Graphical User Interface (GUI), Java provides following packages
			1. java.awt
			2. javax.swing
			3. javafx
			4. java.applet(Deprecated)

	- Generally application are two types
		1. CUI (Command User Interface) : Here end user interact with application by Command, which is not flexible

		2. GUI (Graphical User Interface) : Here end-user interact with application by UI, which is very interactive / flexible.


java.awt (Abstract Window Toolkit)
====================================	
	- It provides some pre-defined classes and interfaces to create an UI.

	Tree Structure of classes & interfaces of awt
	--------------------------------------------------
		java.awt
		---------
			Font
			Color
			Graphics
			LayoutManager
					BorderLayout
					FlowLayout
					GridLayout
			Component
					Container
							Frame
							Dialog
							Window
							Panel
					List
					Label
					Canvas
					Choice
					Checkbox
					TextComponent
							TextField
							TextArea
					Scrollbar
					...........

------------------------------------------------------

Frame
=========	
	- It is a container which can contain UI components.
	- Frame can be constructed by 2 ways
			1. By inheritance
			2. by Association

// Create Frame using Association
import java.awt.*;
class Test
{
	public static void main(String[] args) 
	{
		Frame f1 = new Frame();
		f1.setVisible(true);
		f1.setSize(300,300);
		f1.setBackground(Color.red);
		f1.setLocation(300,300);
		f1.setTitle("My Frame");
		f1.setResizable(false);
	}
}

// Create Frame using Inheritance
import java.awt.*;
class Test extends Frame
{
	Test()
	{
		setVisible(true);
		setSize(300,300);
		setBackground(Color.red);
		setLocation(300,300);
		setTitle("My Frame");
		setResizable(false);	
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}


===================================================================

javax.swing
------------------------
	- It is the advanced of awt.
	- All the UI components of awt share the resources of Operating System, so UI is platform dependent.

	- Awt resources are known as heavyweight components.
	- All the components of swing starts with capital "J".

	swing
	-----------
		- support platform independent UI, as all the UI components of swing are purely developed in java.
		- swing support lightweight UI.

javafx
================
	- It is a framework
	- It is the advanced of swing.
	- Here we can use the web-components (like html,css,bootstrap) in window based application.

//Example : JFrame, JDialog, JWindow
------------------------------------------
package Graphics;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class JFrame_JDialogue_JWindow 
{
	public static void main(String[] args) 
	{
		JFrame f1 = new JFrame();
		f1.setSize(200,200);
		f1.setVisible(true);
		f1.setLocation(100, 200);
		
		JDialog d1 = new JDialog();
		d1.setSize(200,200);
		d1.setVisible(true);
		d1.setLocation(350, 200);
		
		JWindow w1 = new JWindow();
		w1.setSize(200,200);
		w1.setVisible(true);
		w1.setLocation(600, 200);
		
	}
}



BorderLayout
--------------------
	- Frame,Dialogue,Window by default support BorderLayout
	- BorderLayout divides the container into 5 different part
		1. EAST
		2. WEST
		3. NORTH
		4. SOUTH
		5. CENTER (By default)
package Graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Test  extends JFrame
{
	Test()
	{
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Button b1 = new Button("Button-1");
		Button b2 = new Button("Button-2");
		Button b3 = new Button("Button-3");
		Button b4 = new Button("Button-4");
		Button b5 = new Button("Button-5");
		
		add(b1 , BorderLayout.EAST); //to add the buttons into frames
		add(b2 , BorderLayout.WEST);
		add(b3 , BorderLayout.SOUTH);
		add(b4 , BorderLayout.NORTH);
		add(b5 , BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}



FlowLayout
-----------------------
	- Applet,Panel container by default support FlowLayout
	- FlowLayout add UI component into center of first row.

		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setVisible(true);

		Only add setLayout line to previous program


GridLayout
--------------------------------
	- No container by default supports GridLayout
	- This Layout divides the container into number of rows & columns

	setLayout() : It is a method which is used to assign a layout to a container.

package Graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Buttons_Layouts  extends JFrame
{
	Buttons_Layouts()
	{
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setLayout(new GridLayout(3,2));
		setLayout(null);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Button b1 = new Button("Button-1");
		Button b2 = new Button("Button-2");
		Button b3 = new Button("Button-3");
		Button b4 = new Button("Button-4");
		Button b5 = new Button("Button-5");
		
		add(b1 , BorderLayout.EAST); //to add the buttons into frames
		add(b2 , BorderLayout.WEST);
		add(b3 , BorderLayout.SOUTH);
		add(b4 , BorderLayout.NORTH);
		add(b5 , BorderLayout.CENTER);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
		
	}
	public static void main(String[] args) 
	{
		new Buttons_Layouts();
	}
}



Event Handling
==============================================
	- Something happening with the UI component is known as Event, like click on Button, Write into TextField, Drag the Mouse etc.

	- Each & every Event is a class & event handle by Listener, each & every Listener is an pre-defined interface .

	- Java supports 2 types of UI component
			1. Active Component : it can generate Event like Button
			2. passive Component : it cannot generate event like Label

	Ways to handle event : 
	===============================
		1. within the same class
		2. within a different class
		3. By Anonymous class

	Steps to handle the event
	==============================
		1. Implements the required Listener
		2. Override the abstract method
		3. Register the UI components with event
		4. Write the event handling code


	- All the event classes and listener interfaces present in java.awt.event package.

	- For each event 1 or more listener interfaces are available
	Example :

			ActionEvent
			ActionListener

			ItemEvent
			ItemListener

			AdjustmentEvent
			AdjustmentListener

			MouseEvent
			MouseListener
			MouseMotionListener

			WindowEvent
			WindowListener

------------------------------------------------------------------------------------

ActionEvent & ActionListener
======================================
	- Button,Menu,TextField ...etc can generate ActionEvent.

	actionPerformed() : It is a pre-defined method of ActionListener which is required to override & contains event handling 						codes.
package Graphics;
import java.awt.event.*;
import javax.swing.*;

public class ActionListener_Example  extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	JButton b2;
	JButton b3;
	ActionListener_Example()
	{
		setLayout(null);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JButton("Button-1");
		b2 = new JButton("Button-2");
		b3 = new JButton("Button-3");
		l1 = new JLabel();
	
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
		
		l1.setBounds(100, 160, 120, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(new Demo());
		b3.addActionListener
		(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println("Button-3 : Anonymous Class");
						l1.setText("Button-3 : Anonymous Class");
					}
				}
		);
	}
	public static void main(String[] args) 
	{
		new ActionListener_Example();
	}
	public void actionPerformed(ActionEvent e) 
	{	
		System.out.println("Button-1 : Same Class");
		l1.setText("Button-1 : Same Class");
	}
}
class Demo implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		ActionListener_Example t = new ActionListener_Example();
		System.out.println("Button-2 : Different class");
		t.l1.setText("Button-2 : Different Class");
		
	}
}




ItemEvent & ItemListener
===============================
	- CheckBox , ComboBox , RadioButton generate ItemEvent

	itemStateChanged() : It is a pre-defined method of ItemListener interface which is required to override.
	
package Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ItemListener_Example  extends JFrame implements ItemListener
{
	JComboBox cb1;
	ItemListener_Example()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","ORANGE"};
		cb1 = new JComboBox(c);
		add(cb1);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cb1.addItemListener(this);
		
	}
	public static void main(String[] args) 
	{
		new ItemListener_Example();
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		int index = cb1.getSelectedIndex();
		if(index==0)
		{
			Container c = getContentPane();
			c.setBackground(Color.red);
		}
		
		if(index==1)
			getContentPane().setBackground(Color.yellow);
		if(index==2)
			getContentPane().setBackground(Color.orange);
	}
	
	
}




WindowEvent & WindowListener
================================
	- This event is generated by Window Component, window closing...etc

package Graphics;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class WindowListener_Example  extends JFrame implements WindowListener
{
	WindowListener_Example()
	{
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(300,300);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(this);
		
	}
	public static void main(String[] args) 
	{
		new WindowListener_Example();
	}
	
	public void windowOpened(WindowEvent e) 
	{
	}
	public void windowClosing(WindowEvent e) 
	{
		System.out.println("Window is Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) 
	{
	}
	public void windowIconified(WindowEvent e) 
	{
	}
	public void windowDeiconified(WindowEvent e) 
	{
	}
	public void windowActivated(WindowEvent e) 
	{
	}
	public void windowDeactivated(WindowEvent e) 
	{
	}
	
}




Adapter Class
=======================
	- It is a technique introduced in JDK 1.5
	
	- As all the Listeners are pre-definded interfaces , it is compulsory to override all the abstract method which may or maynot 	be required
	
	- To avoid that drawback JAVA introduced the concept of Adapter Class
	
	- Adapter Class available for those Listener which contains more than 1 abstract methods.
	
	- Each Adapter Class is the sub-class of corresponding Listener and already override all the abstract methods.

package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdapterClass_Example_WindowEvent extends Frame 
{
	AdapterClass_Example_WindowEvent()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","GREEN"};

		setVisible(true);
		setSize(300, 300);
		
		addWindowListener
		(
				new WindowAdapter()
				{
					public void windowClosing (WindowEvent we)
					{
						System.out.println("Now window is closing ....:( ");
						System.exit(0);
					}
				}
		);
		
		
	}
	public static void main(String[] args) 
	{
		new AdapterClass_Example_WindowEvent();
	}
}



MouseListener
========================
package Graphics;

import java.awt.*;
import java.awt.event.*;

public class MouseListener_Example  extends Frame 
{
	MouseListener_Example()
	{
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(300,300);
		
		addMouseListener
		(
			new MouseAdapter() 
			{
				public void mouseExited(MouseEvent e) 
				{
					setBackground(Color.green);
				}
				public void mouseEntered(MouseEvent e) 
				{
					setBackground(Color.red);
				}
			}
		);
		
		addMouseMotionListener
		(
			new MouseMotionAdapter() 
			{
				public void mouseDragged(MouseEvent e) 
				{
					Graphics g = getGraphics();
					g.setColor(Color.blue);
					setBounds(e.getX(), e.getY(), 10, 10);
				}
			}
		);
	}
	public static void main(String[] args) 
	{
		new MouseListener_Example();
	}
	
}




NotePad
-------------------

Steps to create Menu Application
------------------------------------------
	1. Create a Menu bar
	2. add Menubar to Frame
	3. Create Menu
	4. Add Menu to Menubar
	5. create Menu item
	6. add Menu item to Menu
	7. Event handling


package Graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad  extends JFrame implements ActionListener
{
	JTextArea ta1; //Create a textarea
	JScrollPane p1; //To add a scrollbar into Textarea
	Notepad()
	{
		ta1 = new JTextArea();
		add(ta1);
		
		p1 = new JScrollPane(ta1);
		add(p1);
		
		JMenuBar mbr = new JMenuBar();
		add(mbr,BorderLayout.NORTH);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		mbr.add(file);
		mbr.add(edit);
		
		JMenuItem copy = new JMenuItem("COPY");
		JMenuItem paste = new JMenuItem("PASTE");
		JMenuItem selectall = new JMenuItem("SELECT ALL");
		JMenuItem cut = new JMenuItem("CUT");
		JMenuItem today = new JMenuItem("TODAY");
		
		edit.add(copy);
		edit.add(paste);
		edit.add(selectall);
		edit.add(cut);
		edit.add(today);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the Frame
		setVisible(true);
		setSize(300,300);
		
		//Register Event with UI components
		cut.addActionListener(this);
		copy.addActionListener(this);
		selectall.addActionListener(this);
		paste.addActionListener(this);
		today.addActionListener(this);
		
	}	
	public static void main(String[] args) 
	{
		new Notepad();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String text = e.getActionCommand();//return the text of the button
		if(text.equals("COPY"))
			ta1.copy();
		if(text.equals("CUT"))
			ta1.cut();
		if(text.equals("PASTE"))
			ta1.paste();
		if(text.equals("SELECT ALL"))
			ta1.selectAll();
		if(text.equals("TODAY"))
			ta1.setText(new Date().toString());
		
	}
	
}




Applet in Java
---------------------------------
	- It is a container like Frame, but the difference is the UI developed by applet can be executed in web-browser.

	- Like Frame, Applet is also a pre-defined class

	- Applet application doesnot containes main() method and constructor.

	- User-defined Applet class should be sub-class of Applet & must be declared as public.

	Life cycle of Applet
	-------------------------------
				init()
				  |
				  |
				  ^
				start()<<<<<----<
				  |				|
				  |				|
				  ^				|
				paint()			|
				  |				|
				  |				|
				  ^				|
				stop()------->>>^	then points to start()
				  |
				  |
				  ^
				destroy()

init() : To initialize the applet
start() : Active the applet application
paint() : Draw graphics components
stop() : To pause the applet
destroy() : To release the applet consumed memory.

Note : 	
		init() and destroy() only execute for a single time.


import java.applet.*;
import java.awt.*;
public class Applet_Ex extends Applet
{

	public void init()
	{
		System.out.println("init() called");
	}
	public void start()
	{
		System.out.println("start() called");
	}
	public void stop()
	{
		System.out.println("stop() called");
	}
	public void paint(Graphics g)
	{
			System.out.println("paint() called");
	}
	public void destroy()
	{
		System.out.println("destroy() called");
	}
}
//<applet code="Applet_Ex.class" width=300 height=300> </applet>  --> Must Write for applet



On CMD
-----------------
// D:\JAVA LIT CORE>javac Applet_Ex.java
// Note: Applet_Ex.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

// D:\JAVA LIT CORE>set path=;C:\Program Files\Java\jdk1.8.0_20\bin;

// D:\JAVA LIT CORE>javac Applet_Ex.java

// D:\JAVA LIT CORE>appletviewer Applet_Ex.java
// init() called
// start() called
// paint() called
// paint() called
// paint() called
// paint() called
// paint() called
// paint() called
// stop() called
// start() called
// paint() called
// stop() called
// start() called
// paint() called
// stop() called
// start() called
// paint() called
// stop() called
// start() called
// paint() called
// stop() called
// destroy() called

// D:\JAVA LIT CORE>



Graphics Class
--------------------
	- It is a pre-defined abstract class present in java.awt package.
	- It is used to draw graphics component.

import java.applet.*;
import java.awt.*;
public class Applet_Ex extends Applet
{

	public void init()
	{
		System.out.println("init() called");
	}
	public void start()
	{
		System.out.println("start() called");
	}
	public void stop()
	{
		System.out.println("stop() called");
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,50,400,50);
		g.drawString("Hello",100,70);
		g.drawRect(100,90,40,50);
		g.setColor(Color.red);
		g.fillRect(150,90,40,50);
		g.drawOval(100,150,40,50);
		g.setColor(Color.blue);
		g.fillOval(100,190,40,50);
		g.fillArc(100,150,250,300,350,70);
	}
	public void destroy()
	{
		System.out.println("destroy() called");
	}
}


//<applet code="Applet_Ex.class" width=300 height=300> </applet>

On CMD
------------
D:\JAVA LIT CORE>set path=;C:\Program Files\Java\jdk1.8.0_20\bin;

D:\JAVA LIT CORE>javac Applet_Ex.java

D:\JAVA LIT CORE>appletviewer Applet_Ex.java
init() called
start() called
stop() called
destroy() called







JDBC(Java Database Connectivity) : 
===================================================
	- It is a technique which is used to communicate with database server from java application

	- Database is used to store data permanently.

	- All the Databases follows a standard i.e. SQL.

	SQL (Structured Query Language)
	----------------------------------------------
		Syntax to create a table
		-----------------------------
			Create table table_name (Student)
			(
				Roll Number(4),
				Name Varchar(20),
				Cgpa Number(3,1)
			);

		Syntax to insert Record
		----------------------------
			Insert into table_name values (100,'Raja',6.5);
			Insert into table_name values (101,'Rani',7.8);

		Syntax to update the record
		-----------------------------
			Update Student set name='xyz',cgpa=9.0 where roll=100;

		Syntax to delete the record
		----------------------------------
			Delete from table_name where roll=100;

		Syntax to display the record
		----------------------------------
			Select roll,name,cgpa from table_name;

		Syntax to drop the table
		-----------------------------
			Drop table table_name;



Steps to communicate with Database
-----------------------------------------------
	- There are 5 steps to communicate with any database server.
		1. Load the driver
		2. Establish the Connection
		3. Create request / statement Object
		4. Execute request / statement Object
		5. Close the connection

	1. Load the driver
	---------------------------
		Class.forName("oracle.jdbc.OracleDriver");

		forName() : it is a static method of Class class which is used to load the driver into JVM.

	2. Establish the Connection
	------------------------------------
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sipusipu18");

		getConnection() : It is a factory method present in java.sql.DriverMagager class which is used to return the object of the Connection interface.

						  - This method is used to establish the connection between Java and database server.

	3. Create request / statement Object
	-------------------------------------------
		Statement st = con.createStatement();

	createStatement() : It is a factory method of Connection interface which is used to create the request object.

	4. Execute request / statement Object
	-----------------------------------------------
		int status = st.executeUpdate(sql); //DDL, DML (Create, insert, delete, update, drop)
		ResultSet rs = st.executeQuery(sql); //DQL (select)

		The above 2 methods are used to execute the request object.

	5. Close the connection
	----------------------------
		con.close();

import java.sql.*;
class Test
{
	static String sql;
	static int status;
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sipusipu18");

		if (con != null) 
			System.out.println("Connection Established");	
		else
			System.out.println("Not Connected");

		Statement st = con.createStatement();
		
		//To drop a table Debi
		sql = "drop table Debi";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To create a table Debi
		sql = "Create table Debi (id number(4) , name varchar2(20))";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To insert into table Debi
		sql = "Insert into Debi values (100,'Debi')";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To update records in table Debi
		sql = "update Debi set name='Alpu' where id=100";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//See the table
		String sql = "Select * from Debi";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Id : "+rs.getInt(1)+"\nName : "+rs.getString("name"));
		}

		//To delete records from table Debi
		sql = "delete Debi";
		status = st.executeUpdate(sql);
		System.out.println(status);
		
		con.close();
	}
}


/*

D:\JAVA LIT CORE\Database>javac Test.java

D:\JAVA LIT CORE\Database>java Test
Connection Established
0
0
1
1
Id : 100
Name : Alpu
1

D:\JAVA LIT CORE\Database>
*/







MultiThreading
===========================

	- Thread is a light weight process.
	- light weight : All the threads share a common process memory.
	process : Running programme.

	- Multiple task at a single time, known as Multithreading / Multitasking.

	- Multithreading is very suitable for game & network application.

	- Each thread having a life cycle in java from new born to dead.

	Life cycle of thread
	-----------------------------

			New Born ----------------------------stop()------------------------------
			State 																	|
				|																	|
				|			sleep() , suspend()										|
				|			wait() , join()											v
			start()			----------------------->>Block state----stop()---->>Dead state
				|			|								v 						^
				|			|								|						|
				v			|								|						|
			Active state----^								|						|
			|	^											|						|
			v	|	resume() , notify() , notifyAll()		|						|
			|	---------------------------------------------						|
			|																		|
			|--------------------------stop()----------------------------------------



	- Threads is a pre-defined class in java, which is responsible to create and manipulate the thread using pre-defined members.

	Constructors
	-------------------------
		Thread()
		Thread(String Thread_name)
		Thread(Runnable object)
		Thread(Runnable object , String Thread_name)

	Methods
	----------------
		static Thread currentThread() : it is used to return the object of current running Thread.

		void start() : It is used to active the thread.

		String geName() : It returns the thread name.

		void setName(String name) : It assigns name to thread

		static void sleep(long millisecond) : it is used to block thread for a specific period of times.

		void join() : Block the thread until job finished by another Thread.

		void suspend() : Block the thread until resume() is called.
		void resume() : It is used to re-active the suspended Thread.

		void wait() : Block the thread until notify() or notifyAll() is called.
		void notify() : re-active the first waited Thread
		void notifyAll() : re-active all waited Thread

		void stop() : Move thread to dead state

		boolean isAlive() : check the Thread existance live or dead.

		void run() : In java , logic of the thread application should be placed within run() method
					- run() method is automatically called by start() method.


Ways to create a thread
----------------------------
	- Thread can be created by 2 ways in Java.
		1. By extends Thread class
		2. By implements Runnable interface

	- Note : 
			implements Runnable is always a better choice to create a Thread as Java doesnot support multiple inheritance with the help of classes.

	Steps to create Thread by extends Thread class
	---------------------------------------------------------
		1. Create a class which extends Thread
		2. Create the object of user-defined class and that object can be treated as Thread class object.
		3. Call the start() method to active the Thread.
		4. Design run() method to implement logic of Thread.


	Steps to create Thread by implements Runnable interface
	---------------------------------------------------------
		1. Create a class which implements runnable
		2. Create the object of user-defined class and that object can be treated as Runnable interface object.
		3. Create the object of Thread class by passing Runnable object as an argument.
		4. Call the start() method to active the Thread.
		5. Design run() method to implement logic of Thread.


// main() is the default Thread in java
-----------------------------------------------
class Test1
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());	
	}
}
/*
D:\JAVA LIT CORE\Threading>javac Test.java

D:\JAVA LIT CORE\Threading>java Test
main
*/





// Thread application by extends Thread class
//Multiple thread with single job
------------------------------------------------------
class Test extends Thread
{
	public void run() //Everything written inside run() is the job of Thread0
	{
		System.out.println("Hi : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) //main() is by default a Thread with name main
	{
		System.out.println("Hello : "+Thread.currentThread().getName());
		Test t1 = new Test(); //Thread Created by creating the object as Test is child of Thread class
		t1.start(); //Thread activated with name Thread-0 (by default)

		Test t2 = new Test(); //Thread created with name Thread1
		t2.start();

		Test t3 = new Test(); //Thread created with name Thread2
		t3.start();
	}
}
/*

D:\JAVA LIT CORE\Threading>javac Test.java

D:\JAVA LIT CORE\Threading>java Test
Hello : main
Hi : Thread-1
Hi : Thread-2
Hi : Thread-0

*/





// Thread application by implements Runnable
//Multiple thread with multiple job in a single/multiple class
------------------------------------------------------------------------
class Test implements Runnable
{
	public void run() 
	{
		String name = Thread.currentThread().getName();
		if (name.equals("Thread-0")) 
			System.out.println("Prime() : "+name);
		if (name.equals("Thread-1")) 
			System.out.println("sort() : "+name);
		
	}
	public static void main(String[] args) //main() is by default a Thread with name main
	{
		System.out.println("Hello : "+Thread.currentThread().getName());
		
		Test t1 = new Test(); 
		Thread th1 = new Thread(t1);
		th1.start();

		Thread th2 = new Thread(new Demo());
		th2.start();

		Thread th3 = new Thread(t1);
		th3.start();

	}
}

class Demo implements Runnable
{
	public void run()
	{
		System.out.println("Fact() : by "+Thread.currentThread().getName());
	}
}


/*
D:\JAVA LIT CORE\Threading>javac Test.java

D:\JAVA LIT CORE\Threading>java Test
Hello : main
Prime() : Thread-0
sort() : Thread-2
Fact() : by Thread-1

*/





Method Implementation
--------------------------------
class Test implements Runnable
{
	public void run() 
	{ 
		for (int i=1; i<=15; i++) 
		{
			System.out.println(Thread.currentThread().getName());	
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		//System.out.println(Thread.currentThread().getName());
		
		Test t1 = new Test(); 
		Thread th1 = new Thread(t1);
		th1.setName("Lit");
		th1.start();

		for (int i=1; i<=5; i++) 
		{
			System.out.println(Thread.currentThread().getName());	
			Thread.sleep(1000);
			// th1.setName("Lit"); //Not a good approach
		}
		System.out.println("Thread LIT suspend...");
		th1.suspend();
		Thread.sleep(3000);
		th1.resume();
		System.out.println("Thread Lit now reactive");

		if (th1.isAlive()) 
		{
			System.out.println("Thread main is waiting for Lit thread");
			th1.join();
			System.out.println("Lit Thread job is done, now can exit");	
		}
		System.out.println("Terminated");
		System.exit(0);
	}
}

/*
D:\JAVA LIT CORE\Threading>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

D:\JAVA LIT CORE\Threading>java Test
main
Lit
Lit
main
Lit
main
main
Lit
Lit
main
Lit
Thread LIT suspend...
Thread Lit now reactive
Thread main is waiting for Lit thread
Lit
Lit
Lit
Lit
Lit
Lit
Lit
Lit
Lit
Lit Thread job is done, now can exit
Terminated

*/



Thread synchronization
-----------------------------------------
	- synchronized is a keyword in java which is used to declare a method as synchronized method.

	- If the method is synchronized it cannot be accessed by more than one thread at a single time.

	- In other words, synchronized method support the concept of locking.

class Table
{
	synchronized public void printTable(int num)
	{
		for (int i=1; i <= 5; i++) 
		{
			System.out.println(num * i);
			try
			{
				Thread.sleep(1000);
			}	
			catch(Exception e)
			{				
			}
		}
	}
}

class User1 implements Runnable
{
	Table t;
	User1(Table t)
	{
		this.t = t;
		new Thread(this).start();
	}
	public void run()
	{
		t.printTable(5);
	}
}

class User2 implements Runnable
{
	Table t;
	User2(Table t)
	{
		this.t = t;
		new Thread(this).start();
	}
	public void run()
	{
		t.printTable(6);
	}
}

class User3 implements Runnable
{
	Table t;
	User3(Table t)
	{
		this.t = t;
		new Thread(this).start();
	}
	public void run()
	{
		t.printTable(7);
	}
}

class Test
{
	public static void main(String[] args) 
	{
		Table t = new Table();
		new User1(t) ;
		new User2(t) ;	
		new User3(t) ;
	}
}

/*
without Locking - without synchronized - anything is executed any time
D:\JAVA LIT CORE\Threading>javac Test.java

D:\JAVA LIT CORE\Threading>java Test
5
6
7
12
10
14
15
18
21
20
28
24
25
30
35

with Locking - with synchronized - a single process is executed at a single time
D:\JAVA LIT CORE\Threading>javac Test.java

D:\JAVA LIT CORE\Threading>java Test
5
10
15
20
25
7
14
21
28
35
6
12
18
24
30

*/







Producer & Consumer Problem
-----------------------------------------
class Product
{
	int value = 0;
	boolean status = false;
	synchronized public void produce(int v)
	{
		if (status)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		value = v;
		System.out.println("Prodecued : "+value);
		notify();
		status = true;
	}
	synchronized public void consume()
	{
		if (!status) 
		{
			try
			{
				wait();
			}	
			catch(Exception e)
			{
			}
		}
		System.out.println("Consumed : "+value);
		notify();
		status = false;
	}
}
class Producer implements Runnable
{
	Product p;
	Producer (Product p)
	{
		this.p = p;
		new Thread(this).start();
	}
	public void run()
	{
		int v=1;
		while(true)
		{
			p.produce(v++);
		}
	}
}
class Consumer implements Runnable
{
	Product p;
	Consumer (Product p)
	{
		this.p = p;
		new Thread(this).start();
	}
	public void run()
	{
		int v=1;
		while(true)
		{
			p.consume();
		}
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Product p = new Product();
		new Producer(p) ;
		new Consumer(p) ;	
	}
}

/*
D:\JAVA LIT CORE\Threading>java Test
Prodecued : 1
Consumed : 1
Prodecued : 2
Consumed : 2
Prodecued : 3
Consumed : 3
Prodecued : 4
Consumed : 4
Prodecued : 5
Consumed : 5
Prodecued : 6
Consumed : 6
Prodecued : 7
Consumed : 7
Prodecued : 8
Consumed : 8
Prodecued : 9
Consumed : 9
Prodecued : 10
Consumed : 10
D:\JAVA LIT CORE\Threading>
*/





Thread Priority
==========================
	- It decides the order of execution
	- Priority value is an integer, which range is from 1 to 10.
	
	- By default priority of each Thread is 5.

	- int getPriority() : It returns the priority of Thread
	void setPriority(int) : It assigns the priority.

	- MAX_PRIORITY : It is used to get the maximum priority.

	- MIN_PRIORITY : It is used to get the minimum priority.

	- NORM_PRIORITY : It is used to get the normal priority.

class Test implements Runnable
{
	public void run()
	{
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		Thread th1 = new Thread();
		th1.start();

		th1.setPriority(1);
		System.out.println(th1.getPriority()); //5 after setPriority() the argument value becomes the priority of thread i.e. from 1-10
		System.out.println(Thread.MAX_PRIORITY); //10
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5

	}
}



Limitations of multi-threading
-----------------------------------
	- Time Consuming
	- Poor Resource Management
	- Not Robust

- Executor Framework overcomes these limitations

Executor Framework
---------------------------
	- introduced in 1.5 version
	- overcomes the limitations by giving us a ThreadPool()

			Executor e = Executors.newCachedThreadPool();

	- It allows to create a pool of working threads which can be assigned to do a particular task.
	- When the thread is done with the task, instead of dying out it goes back to ThreadPool so that it can be re-used.

	syntax
	----------
		Executor e = Executors.newCachedThreadPool();
		Runnable/Thread task = new Class_Name();
		e.execute(task);

package ExecutorThreadPool;

public class CheckProcessorTask implements Runnable
{
	String name;
	
	public CheckProcessorTask(String name) 
	{
		this.name = name;
	}
	public void run() 
	{
		System.out.println(name+" CheckProcessor Has Began Processing the check "+Thread.currentThread().getName());
		
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(name+" CheckProcessor has completed processing the check "+Thread.currentThread().getName());
	}
	
}

package ExecutorThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo 
{
	public static void main(String[] args) 
	{
		CheckProcessorTask[] cps = {new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"), new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web")};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask checkProcessorTask : cps) 
		{
			service.submit(checkProcessorTask);
		}
		
		service.shutdown();
		
		
	}
}

Callable & Future Framework
--------------------------------------------
- Runnable interface's void run() can not return any value
- For that we can use Callable interface and call() method to return any value
-Callable interface is a generic interface i.e. Callable<Value_Type>
- implemented method is Value_Type run();
- We pass a callable instance to the Executor framework
- Then the ExecutorService a Future interface object
		
		Future f = service.submit(MyCallable); // MyCallable is the class_name implements Callable interface

- f.get() - retrieve the result
- get() throws 3 exceptions	
				- InterruptedException
				- ExecutionException
				- CancellionException

package ExecutorThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> 
{
	int num;
	MyCallable(int num) 
	{
		this.num=num;
	}
	
	public Integer call() throws Exception 
	{
		System.out.println(Thread.currentThread().getName()+" is the current thread name and is calculating sum upto "+num);
		
		int sum = 0;
		for (int i = 1; i <= num; i++) 
		{
			sum = sum+i;
		}
		return sum;
	}

}

package ExecutorThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo 
{
	public static void main(String[] args) 
	{
		MyCallable[] callable = {new MyCallable(10) , new MyCallable(20) , new MyCallable(30) , new MyCallable(40) , new MyCallable(50) , new MyCallable(60)};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (MyCallable myCallable : callable) 
		{
			Future<Integer> future = service.submit(myCallable);
			
			try 
			{
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) 
			{
				e.printStackTrace();
			}
		}
		service.shutdown();
	}
}





File Handling using Java / java.io package
=======================================================
	- File is a container, which store data permanently. 
	- Data can be stored permanently by 2 ways
		1. Using File (java.io)
		2. Using Database (java.sql)

	- Compare to File , Database is secure & faster.

	- In java, File is a pre-defined class present in java.lang package.

	- This class is used to create and manipulate the File using pre-defined methods & constructors.

	constructor
	-----------------
		File (String file_name) 	//Without path means points to current folder
		File (String path , String file_name)

	- File class is not useful to do read and write operation.

package File_Handling;
import java.io.*;
public class Test 
{
	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(4000);
		File f1 = new File("hello.txt");
		System.out.println(f1.createNewFile());
		System.out.println("Done....");
		
		File f2 = new File("D:/devi","hello.mp4");
		System.out.println(f2.createNewFile());
		System.out.println("Done....");
		
		File f3 = new File("a");
		System.out.println(f3.mkdir());
		System.out.println("Done....");
		
		File f4 = new File("raja/rani/hello/hi");
		System.out.println(f4.mkdirs());
		System.out.println("Done....");
		
		Thread.sleep(4000);
		File f5 = new File("hi.mp4");
		System.out.println(f1.renameTo(f5));
		
		Thread.sleep(4000);
		System.out.println(f1.delete());
		System.out.println(f2.delete());
		System.out.println(f3.delete());
	}
}




//Operation with file
package File_Handling;
import java.io.*;
import java.util.Date;
public class Test2 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); //f1 refers to location only
		System.out.println(f1.createNewFile());
		
		System.out.println(f1.length());
		System.out.println(f1.lastModified()); //epoch time, time from jan1 1970 to till now in milisecond format
		System.out.println(new Date(f1.lastModified()));
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		System.out.println(f1.isHidden());
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		
		f1.setWritable(false);
		System.out.println(f1.canWrite());
		f1.setWritable(true);
		System.out.println(f1.canWrite());
	}
}




Read and write operation with File in Character Format
===========================================================
	- To do so, java.io package provides 2 different class
		1. FileInputStream
		2. FileOutputStream

	1. FileInputStream
	===========================
		- It is pre-defined class present in java.io package & read data from a file in character format with the help of read() method.

		Restrictions
		----------------------
			Before read it checks the file existance, if file not available then terminate the program abnormally by throwing FileNotFoundException.

		Constructor
		--------------------
			FileInputStream(String file_name / File object)
	
	1. FileOutputStream
	===========================
		- It is pre-defined class present in java.io package & write data into a file in character format with the help of write() method.

		Restrictions
		----------------------
			Before read it checks the file existance, if file not available then create a new File otherwise replace or append into existing file.

		Constructor
		-------------------------
			FileOutputStream(String Filename / File object) //Create or replace
			FileOutputStream(String Filename / File object , true) //Create or append

package File_Handling;
import java.io.*;
import java.util.Date;
public class Test3 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); 
		System.out.println(f1.createNewFile());
		
		FileInputStream fis = new FileInputStream("hello.txt");
		//FileOutputStream fos = new FileOutputStream("hi.txt"); Create or replace the content
		FileOutputStream fos = new FileOutputStream("hi.txt" , true); //Create or append the content
		
		int ch;
		while((ch=fis.read()) != -1) //-1 indicates end of file
		{
			//Thread.sleep(1000);
			//System.out.print((char)ch);
			fos.write(ch); //write character into hi.txt
		}
		
		fis.close();
		fos.close();
		
		System.out.println("Done...:)");
	}
}






Read and write operation with File in String Format
===========================================================
	- To do so, java.io package provides 2 different class
		1. BufferedReader : with the help of readLine() method
		2. BufferedWriter : with the help of write() method

package File_Handling;
import java.io.*;
import java.util.Date;
public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); 
		System.out.println(f1.createNewFile());
		
		BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt")); //Create or replace the content/
		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt" , true));
		
		String text;
		while((text=br.readLine()) != null)
		{
//			Thread.sleep(1000);
//			System.out.println(text);
			
			bw.write(text);
		}
		br.close();
		bw.close();
		System.out.println("Done...:)");
	}
}






package File_Handling;
import java.io.*;
import java.util.Date;
public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); 
		System.out.println(f1.createNewFile());
		
		BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt")); //Create or replace the content/
		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt" , true));
		
		String text;
		int count = 0;
		while((text=br.readLine()) != null)
		{
//			Thread.sleep(1000);
//			System.out.println(text);
			
			bw.write(text +"\n");
			String s[] = text.split(" ");
			for (String x : s) 
			{
				if(x.equalsIgnoreCase("Java"))
					count++;
				String s1[] = x.split(".");
				for (String x1 : s) 
				{
					count++;
				}
			}
			
		}
		System.out.println(count +" times java");
		br.close();
		bw.close();
		System.out.println("Done...:)");
	}
}






Assertion
-------------------
	- Assertions were introduced in 1.4 JDK
	- Used for testing and debugging purpose
	- Instead of using System.out.println() we use assertion statement

		assert expression;
		assert expression1 : expression2;
			expression2 - can be any data/datatype/function call/String Message
			expression1 - returns true or false

	- run by CMD -ea/-da/-esa/-dsa class_name 
	- run by Eclipse - Run > run config > arguments > under VM arguments apply any of these 4 > apply > Run

	-ea - enable
	-da - disable
	-esa - enable system level assertions
	-dsa - disable system level assertions

	- It will return a boolean value
	- If true it will go on.
	- If false it will throw a AssertionError

	- Should not check public method arguments
	- Should be used in testing,and in Frameworks like JUnit/Spring

package assertion;

public class Assertion 
{
	public static void main(String[] args) 
	{
		int withdrawal = 100;
		int current = 60; //Will show Withdrawal is More Than Current
//		int current = 600; //Will Pass and won't show anything as it is correct
//		assert(withdrawal < current);
		assert(withdrawal < current) : "Withdrawal is More Than Current";
		
	}
}


synchronized block
-----------------------
- if we need synchronized code or few lines of code and not entire method then we can use synchronized block inside the method instead of making the method synchronized.

- Advantage is Multiple threads can enter the method and execute the code before the synchronized block , but once one thread enters this block, no other thread will be able to execute the synchronized block untill the first thread finishes.

- It will make the wait time go down and will improve the performance because the threads can atleast start running the codes prior to the synchronized block.

- It can be defined by 3 ways 

1. by passing current object
	synchronized(this){

	}

2. by passing any object
	synchronized(x){

	}
3. by passing a class name
	synchronized(Display.class){

	}

package synchronizatiom.blocks;

public class DisplayMessage 
{
	public void sayHello(String name) throws InterruptedException
	{
		//Any code can go here
//		synchronized (this) 
//		synchronized (DisplayMessage.class)
		synchronized(new DisplayMessage())
		{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println("How are you "+name);
				Thread.sleep(1000);
			}
		}
	}
}

package synchronizatiom.blocks;

public class MyThread extends Thread 
{
	DisplayMessage ds;
	String name;
	
	MyThread(DisplayMessage ds , String name)
	{
		//this.instance/class variable = local/argument variable
		this.ds = ds;
		this.name = name;
	}
	public void run()
	{
		try 
		{
			ds.sayHello(name);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

package synchronizatiom.blocks;

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
		DisplayMessage ds = new DisplayMessage();
		MyThread t1 = new MyThread(ds, "Debi");
		MyThread t2 = new MyThread(ds, "Mark");
		
		t1.start();
		t2.start();
	}
}




















































ADDED LATER
==============================================================



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student
{
	String name;
	double cgpa;
	int age;
	String courses[];
	Set<Long> phoneNo;
	List<String> emails;
	List<String> adress;
	Map<String, Long> refs;
	static Scanner sc=new Scanner(System.in);
	Student()
	{
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the cgpa");
		cgpa=sc.nextDouble();
		System.out.println("enter the age");
		age=sc.nextInt();
		System.out.println("enter the number of courses");
		int size=sc.nextInt();
		courses=new String[size];
		for(int i=0;i<courses.length;i++)
		{
			System.out.println("enter the new Course");
			courses[i]=sc.next();
		}
		phoneNo=new HashSet<Long>();
		
		
		String choice="" ;
		do
		{
			System.out.println("enter the phone number");
			phoneNo.add(sc.nextLong());
			System.out.println("Do u want add  phone number choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		emails=new ArrayList<String>();
		
		do
		{
			System.out.println("enter the email number");
			emails.add(sc.next());
			System.out.println("Do u want add emailNumber choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		adress=new LinkedList<String>();
		
		do
		{
			System.out.println("enter the adress number");
			adress.add(sc.next());
			System.out.println("Do u want add adress choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	
		refs=new HashMap<String, Long>();
		
		do
		{
			System.out.println("enter the new  refers");
			refs.put(sc.next(), sc.nextLong());
			System.out.println("Do u want add references choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + ", age=" + age + ", courses=" + Arrays.toString(courses)
				+ ", phoneNo=" + phoneNo + ", emails=" + emails + ", adress=" + adress + ", refs=" + refs + "]";
	}
	
	
}
public class CollectionEx
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		TreeMap<Integer, Student> map=new TreeMap<Integer, Student>();
		String choice ;
		do
		{
			System.out.println("enter the a new Roll number");
			map.put(sc.nextInt(), new Student());
			System.out.println("Do u want add new student choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	
		System.out.println(map);
		
	}

}



========================================================================================================




import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>
{

	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student o) 
	{
		if(age==o.age)
		return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(101,"java",23));
		list.add(new Student(102,"c++",22));
		list.add(new Student(103,"c",20));
		list.add(new Student(104,"html",15));
		Collections.sort(list);
		for(Student s:list)
			System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}



===============================================================================================================



package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student 
{

	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator implements Comparator
{


	public int compare(Object o1, Object o2)
	{
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		if(s1.age==s2.age)
		    return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator
{


	public int compare(Object o1, Object o2)
	{
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		return s1.name.compareTo(s2.name);
	}
	
}
public class ComparatorExample
{
	
	public static void main(String[] args)
	{
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Java",23));  
		al.add(new Student(106,"c",27));  
		al.add(new Student(105,"html",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator<Student> itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator<Student> itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student st=itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
	}

}



===================================================================================================================



























Example:	Layout
====================================================
import java.awt.*;
import javax.swing.*;
public class Test extends JFrame 
{
	Test()
	{
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setLayout(new GridLayout(3,2));
		setLayout(null);
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the Frame
		
		JButton b1 = new JButton("Button-1");
		JButton b2 = new JButton("Button-2");
		JButton b3 = new JButton("Button-3");
		JButton b4 = new JButton("Button-4");
		JButton b5 = new JButton("Button-5");
		add(b1 , BorderLayout.EAST); // to add button into frame
		add(b2, BorderLayout.WEST);
		add(b3, BorderLayout.SOUTH);
		add(b4, BorderLayout.NORTH);
		add(b5, BorderLayout.CENTER);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}


Event Handling 
=================================================
	Something happening with UI components is known as event like click on Button, Write into TextField , Drag the Mouse etc. 

	Each & every Event is a class & event handle by Listener, each & every Listener is an inteface

	Java support two types of UI components 
		1.	Active Component :	It can generate event like Button
		2.	Passive component :	It cannot generate any event  like Label

	Ways to handle the event 
	===============================	
		1.	Within the same class 
		2.	Within a different class 
		3.	By Anonymous class 

	Steps to handle the event 
	=============================
		1.	Implements the required Listener 
		2.	Override the abstract method 
		3.	Register the UI components with Event 
		4.	Write the event handling codes


All the event classes & listener interfaces present in java.awt.event package.
For each event one or more listener interfaces are available. 
Example :
			
			ActionEvent 
			ActionListener 

			ItemEvent 
			ItemListener 

			AdjustmentEvent 
			AdjustmentListener 

			MouseEvent 
			MouseListener 
			MouseMotionListener 

			WindowEvent 
			WindowListener 

			--------------------------------------------------------------
ActionEvent & ActionListener 
=================================
	Button,Menu,TextField ....etc can generate ActionEvent.
	actionPerformed() :	It is a pre-defined method of ActionListener which is required to override & contains event handling codes. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	JButton b2;
	JButton b3;
	Test()
	{
		setLayout(null);
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the Frame
		
		 b1 = new JButton("Button-1");
		 b2 = new JButton("Button-2");
		 b3 = new JButton("Button-3");
		 l1 = new JLabel();
		
		add(b1 ); // to add button into frame
		add(b2);
		add(b3);
		add(l1);
		
		b1.setBounds(100, 50, 120, 30);
		b2.setBounds(100, 100, 120, 30);
		b3.setBounds(240, 100, 120, 30);
		l1.setBounds(100, 160, 120, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(new Demo());
		b3.addActionListener
		(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println("LIT");
						l1.setText("LIT");
					}
				}
		);
		
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("OK");
		l1.setText("OK");
	}
}
class Demo implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Java");
	}
	
}

ItemEvent & ItemListener 
========================================
	CheckBox , ComboBox , RadioButton  generate ItemEvent. 
	itemStateChanged() :	It is a pre-defined method of ItemListener interface which is required to override. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test extends JFrame implements ItemListener
{
	JComboBox cb1;
	Test()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","GREEN"};
		cb1=new JComboBox(c);
		add(cb1);
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the Frame
		
		cb1.addItemListener(this);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	public void itemStateChanged(ItemEvent e) 
	{
		int index = cb1.getSelectedIndex();
		if(index == 0)
		{
			Container c = getContentPane();
			c.setBackground(Color.red);
		}
		if(index == 1)
			getContentPane().setBackground(Color.yellow);
		if(index == 2)
			getContentPane().setBackground(Color.green);
	}
}
WindowEvent & WindowListener
===============================
	This event generate by Window Component. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test extends Frame  implements WindowListener
{
	Test()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","GREEN"};

		setVisible(true);
		setSize(300, 300);
		addWindowListener(this);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	public void windowOpened(WindowEvent e) {
	}
	public void windowClosing(WindowEvent e) 
	{
		System.out.println("Widnow is Closing ...:) ");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}
}


Adapter class 
=======================
	It is a technique introduced in JDK 1.5. 
	
	As all the Listeners are pre-defined interfaces , it is compulsory to override all the abstract which may or maynot required. 
	
	To avoid that drawback, JAVA introduced the concept of Adapter class. 
	
	Adapter class only available for those listener which contains more than one abstract methods. 
	
	Each Adapter class is the sub-class of coresponding Listener & already override all the abstract methods. 
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test extends Frame 
{
	Test()
	{
		setLayout(new FlowLayout());
		String c[] = {"RED","YELLOW","GREEN"};

		setVisible(true);
		setSize(300, 300);
		
		addWindowListener
		(
				new WindowAdapter()
				{
					public void windowClosing (WindowEvent we)
					{
						System.out.println("Now window is closing ....:( ");
						System.exit(0);
					}
				}
		);
		
		
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}































Important Programs
============================================
// Enter Specific Values with Regular Expression
import java.util.Scanner;

public class EnteringSpecificValue {
	static Scanner sc = new Scanner(System.in);
	static String choice;
	private final static String regex = "[0-9]";
	
	public static void main(String[] args) {
		EnteringSpecificValue.input();
	}

	private static void input() {
		System.out.println("Enter a number");
		choice = sc.next();
	
		if(choice.matches(regex))
		{
			System.out.println(choice);
		}
		else {
			System.out.println("Please Enter a valid Number");
			EnteringSpecificValue.input();
		}
	}
}



// public interface Test 
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Interface Test : main()");
		
// 		Test t = new Test(){
// 			public void display(){

// 			}
// 		};
// 		t.show();
// 	}
	
// 	public default void show() {
// 		System.out.println("Interface Test : show()");
// 	}

// 	void display();
// }

public class Test
{
	public static void main(String[] args) 
	{
		String s = new String("A");
		String s1 = "A";

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode() == s1.hashCode());
		
			
	}
}


------------------------------------------------------------------------------------------------------


package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class A
{
	A() 
	{
			
	}
	void show() //throws Exception
	{
		
	}
}
public class Test extends A 
{
	Test() //throws Exception
	{
		
	}
//	void show() throws Exception
	{
		
	}
	public static void main(String[] args) 
	{
//		new Test();
//		try {
//			new A();
//			new Test();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}





------------------------------------------------------------------------------------------------------




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rough {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [2];
        int sum [] = new int [2];
        int str [] = new int [2];
        int x=0,y=0,b=0;
        System.out.println("Enter numbers for A");
        for (int i = 0; i < 2; i++) 
        {
        	arr[i] = sc.nextInt();
	        for (int j = 1; j <= arr[i]; j++) 
	        {
				if(arr[i]%j == 0)
				{
					y = j;
					// System.out.println(y);
					sum[i] = sum[i]+y;
				}
				
			}
	      //  System.out.println(sum[0]);
	      //  System.out.println(sum[1]);
	       
	        
	       // System.out.println("enter another number for B");
	        }
        	if(sum[0] > sum[1])
        		System.out.println("A win");
        	else if(sum[1] > sum[0])
        		System.out.println("B win");
        	else
        		System.out.println("Draw");

       	
        }

    }










---------------------------------------------------------------------------------------------------------







BLocks.java
========================
package test;

public class Blocks 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	Blocks()
	{
		System.out.println("Constructor");
	}
	void show()
	{
		
	}
	void display()
	{
		System.out.println("display() in Test");
		show();
//		System.out.println("OK");
		{
			System.out.println("non-static inside display()");
		}
	}
	static{
		System.out.println("Inside Static block");
		new Blocks().display();
		
		{
			System.out.println("non-static block inside static block");
		}
	}
	
	{
		System.out.println("Outside non-static block ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Inside main()");
//		System.out.println("Program Started");
//		
//		System.out.println("Program Termminated Successfully");
//		
		{
			System.out.println("Inside non-static block");
			new Blocks().display();
		}
	}
}





---------------------------------------------------------------------------------------------------------------------



ExceptionHandling.java
===================================
package test;

public class ExceptionHandling 
{
	void show() throws Exception 
	{
		System.out.println("show()");
		try{
			
			try{
				throw new Exception();
			}catch (Exception e) {
				System.out.println("User-defined exception");
			}
			
			try {
				throw new RuntimeException();
			}
			catch (Exception e) {
				System.out.println("Runtime Exception");
			}
			
			 throw new Exception(); //No one is catching this
		}
		catch (Exception e) {
			System.out.println("Exception handled by show()");
			try{
				throw e;
			}
//			catch (Exception ee) {
//				System.out.println("throw exception of show() handled here only");
//			}
			finally {
				System.out.println("finally inside show");
			}
		}
	}
	void display() throws Exception
	{
		System.out.println("display() method");
		show();
		System.out.println("Ok");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Program started");
//		try
//		{
//			new Test().display();
//		}
//		catch (Exception e) {
//			System.out.println("Exception handled by main");
//		}
		try{
			new ExceptionHandling().display();
		}
		catch(Exception e)
		{
			System.out.println("show() Exception handled in main");
			System.out.println("exception thrown again");
			throw e; //Exception generation code
		}
		
		finally{
			System.out.println("finally block started");
			System.exit(0);
			System.out.println("Program Terminated Normally");
		}
	}
}




-----------------------------------------------------------------------------------------------------------------





Finally Block / Limitation in Java
=============================================
package test;

//class A
//{
//	public static void show() {
//		System.out.println("show in A");
//	}
//}
public class LimitationInJava
{
//	public static void show()
//	{
//		System.out.println("show in Test");
//	}
	public static void main(String[] args) throws Exception 
	{
//		A a = new Test();
//		a.show();
		
//		
		System.out.println("Program started");
		
		try{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main");
			System.out.println("exception thrown again");
			throw e; //Exception generation code
		}
		finally
		{
			System.out.println("finally block started");
			System.exit(0);
			System.out.println("Program Terminated Normally");
		}
//		System.out.println("Unreachable statement");
		
//		System.out.println("No compilation error");
	}
}




-----------------------------------------------------------------------------------------------------------
















Tricky Programs
=============================


import java.math.BigDecimal;
import java.math.RoundingMode;

//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		System.out.println("In run method : thread name is "+Thread.currentThread().getName());
//	}
//}
public class Test {
	public static void main(String[] args) 
	{
//		int x,y,z;
//		for (x = 0; x <= 3; x++) 
//			for(y = 1; y < 4; y++)
//				for(z=2; z < 5; z++)
//					if((x==y) && (y==z))
//						System.out.println((x/x)*x);
// ===================================================================================		
//		Thread thread = new MyThread();
////		thread.run();
//		thread.start();
//		thread.run();
//		System.out.println("In main method : thread name is "+Thread.currentThread().getName());
// ===============================================================================		
//		int a = 10_0_0;
//		double b = 10_0.0__0_1;
//		System.out.println(a+"\t"+b);
//		System.out.println(a*b);
//		System.out.println((int)b*a);
//		System.out.println((int)(b*a));
//		System.out.println((byte)(b*a));
// ========================================================================================		
//		BigDecimal pi = BigDecimal.ZERO;
//		for (int k = 0; k < 50.01; k++) {
//		    BigDecimal a0 = new BigDecimal(16).pow(k);
//		    BigDecimal a1 = new BigDecimal(4).divide(new BigDecimal(8*k+1), 20, RoundingMode.HALF_UP);
//		    BigDecimal a2 = new BigDecimal(2).divide(new BigDecimal(8*k+4), 20, RoundingMode.HALF_UP);
//		    BigDecimal a3 = new BigDecimal(1).divide(new BigDecimal(8*k+5), 20, RoundingMode.HALF_UP);
//		    BigDecimal a4 = new BigDecimal(1).divide(new BigDecimal(8*k+6), 20, RoundingMode.HALF_UP);
//		    BigDecimal a5 = a1.subtract(a2).subtract(a3).subtract(a4);
//		    BigDecimal a6 = BigDecimal.ONE.divide(a0, 20, RoundingMode.HALF_UP);
//		    pi.add(a5.multiply(a6));
//		    System.out.println(pi);
//		}
//	========================================================================================
//		int sum = 4;
//		for (int i = 0; i <= 5; i++) {
//			if(i == 3) {
//				break;//continue;
//				sum = sum * i; // Unreacheble Code
//			}
//			System.out.println(sum);
//		}
//	=========================================================================================
//		if(args.length > 0)
//			System.out.println(args.length);
//	} // main() ending
//		String args[] = {"1","2"}; // class variable
//	=========================================================================================
//		class Super{
//			public int index = 1;
//		}
//
//		public class App extends Super{
//			public App(int index) { // To get 10 as O/P, either use this.index = index OR change the local variable name in the constructor signature 
//				index = index;
//			}
//			
//			public static void main(String[] args) {
//				App myApp = new App(10);
//				System.out.println(myApp.index); // 1
//			}
//		}
//	=========================================================================================
//		System.out.println(test());
//	}
//		static float test() {
//			static float x = 0.0f; // Illegal modifiers, local variable can not anthing else except final.
//			return ++x;
//	}
//	=========================================================================================		
//		System.out.println(args[1] + args[2] + args[3]); // Pass the argument 1 2 3 4 5
//	=========================================================================================
		
		
	}
}




=========================================================================================================================









import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test 
{ 
//	private int i;
//	public Test(int i) {
//		this.i = i;
//	}
//	
//	Either Override or use your own custom methods
//@Override
//	public int hashCode() {
//		final int prime = 2;
//		int result = 1;
//		result = prime * result + i;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Test other = (Test) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}

	//	public int hashCode() {
//		return 10;
//	}
//	
//	public boolean equals(Test obj) {
//		return this==obj;
//	}
	public static void main(String[] args) 
	{
//		First 3 sections are gonna use the things in the top
//		Test t = new Test(10); // Test@a // value representation in hexa-decimals
//		Test t1 = new Test(15); // Test@f
//		System.out.println(t);
//		System.out.println(t1);
//		Test t2 = new Test(16); // Test@10
//		System.out.println(t2);
// =======================================================================================================
//		
//		Test t = new Test(10);
//		System.out.println(t.hashCode());
//		Test t1 = new Test(10);
//		System.out.println(t1.hashCode());
//		System.out.println(t == t1);
//		System.out.println(t.equals(t1));
// =====================================================================================================
		
//		 String s = new String("Raja");
//		 String a = new String("Raja");
////		 String s = "Raja";
////		 String a = "Raja";
//		
//		 System.out.println(s.hashCode());
//		 System.out.println(a.hashCode());
//		
//		 System.out.println(System.identityHashCode(s));
//		 System.out.println(System.identityHashCode(a));
//		 System.out.println(s == a);
// ==============================================================
//		System.out.println(count());
//		Test.count();
// ==============================================================
//		LocalDate date = LocalDate.of(2020, 04, 02);
//		System.out.println(date);
//		System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now()));
//	=============================================================
//		byte n = 1;
//		for (byte i = 0;; i++) {
//			if (i < 3)
//				System.out.println("Hi" + i);
////			n++;
//		}
//	=============================================================================
//		int n = 1, i;
//		for(i = 1; i <= 5; i++);
//		System.out.println(i*n);
//	=============================================================================
		
		
	}
//	public static int count() // int or void
//	{
//		try {
//			System.out.println("count()");
//			return 1;
//		}catch (Exception e) {
//			return 2;
//		}
//		finally {
//			System.out.println("Finally Block");
//		}
//		System.out.println("Hello"); // Unreachable Code
//	}
}

//public class Test
//{
//	static void show()
//	{
//		System.out.println("show in Test");
//	}
//	protected class A
//	{
//		public void show()
//		{
//			System.out.println("show in A");
//		}
//	}
//	public static void main(String[] args) 
//	{
//		new Test().new A().show();
//	}
//}
//class Demo
//{
//	public static void main(String[] args) {
//		new Test().new A().show();
//	}
//}
//
//// javac Test.java
//// java Test
//// java Demo











=============================================================================================================================








import java.util.Arrays;

//public class Test {
//	public static void main(String[] args) {
//		int [] a = {1,2,3,4};
//		int [] b = {2,3,1,0};
//
//		System.out.println(a==b);
//		System.out.println(a.hashCode()+"\t"+b.hashCode());
//		System.out.println(a.equals(b)); // Reference Checked
//		
//		boolean equals = Arrays.equals(a, b); // Array Elements check
//		System.out.println(equals);
//		
//		System.out.println(a[(a=b)[3]]+" "+a[3]); // assign b reference to a, get the b[] value, then print a[], then assign b values to a, which is why everything was true, based on associativity and precedence concept
////		System.out.println(a[(a=b)[0]]);
////		System.out.println(a[(a=b)[1]]);
////		System.out.println(a[(a=b)[2]]);
//		
//		for (int i : a) {
//			System.out.print(i+"\t"); // 2	 3	 1	 0	
//		}
//		
//		System.out.println("\n"+(a==b));
//		System.out.println(a.hashCode()+"\t"+b.hashCode());
//		System.out.println(a.equals(b)); // Reference Checked
//		
//		boolean equals1 = Arrays.equals(a, b); // Array Elements check
//		System.out.println(equals1);
//		
//		System.out.println(Arrays.hashCode(a));
//	}
//}

//public class Test {
//	final int a ;
//	public Test() {
//		a = 2;
//	}
//	public Test(int x) {
//		this.a = x;
//	}
//	
//	public static void main(String[] args) {
//		Test t = new Test();
//		System.out.println(t.a);
//		
//		Test t1 = new Test(10);
//		System.out.println(t1.a);
//		
//		Test t2 = new Test(15);
//		System.out.println(t2.a);
//	}
//}
// ========================================================================================
//class C {
//	int m1() {
//		System.out.println("C m1");
//		return 50;
//	}
//}
//class A extends C{
//	int x = super.m1();
//	int m1() {
//		System.out.println("A m1");
//		return 50;
//	}
//}
//class B extends A {
//	int y = super.m1();
//	int m1() {
//		System.out.println("B m1");
//		return 60;
//	}
//}
//public class Test {
//	public static void main(String[] args) {
//		B b = new B();
//		System.out.println("x: "+b.x);
//		System.out.println("y: "+b.y);
//	}
//}

public class Test {
	public static void main(String[] args) {
		
	}
}








================================================================================================================================










public class Test 
{ 
	

	public static void main(String[] args) 
	{
// ==============================================================================================
//		System.out.println(Math.floor(Math.PI));
//		System.out.println(Math.abs(Math.ceil(-2.5)));
//		double d = Math.pow(2.5, 2.5);
//		System.out.println(d);
//		double res = Math.pow(Math.abs(Math.ceil(-2.5)), Math.floor(Math.PI));
//		System.out.println(res);
		
		String s = "FB";
		String s1 = "Ea";
		System.out.println(s.hashCode()==s1.hashCode());
		
		String s2 = "ABC";
		System.out.println(s2.hashCode()); //64578 // 65*31^2 + 66*31^1 + 67*31^0 = 64578
		// Hashcode is based on formula s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] for String
// ===================================================================================================
		
	}
}







=================================================================================================================================









import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test 
{
//	private int id;
//	private final String name ;
//	
//	public Test() {
//		name = "Debi";
//	}
//	
//	public Test(String name) {
//		this.name = name;
//	}
//	
////	{
////		name = "Debi";
////	}
	public static void main(String[] args) throws IOException 
	{
		
//		int a = 1, b = 1;
//		boolean c;
//		c = (++a==2)&&(++b==2);
//		System.out.println(a+" "+b+" "+c);
//		
//		a=b=1; 
//		c = (++a==1)&&(++b==1);
//		System.out.println(a+" "+b+" "+c);
// =================================================================================================
//		int a = 1, b = 2 ;
////		String res = a>b ? "Hello" : "Hi";
////		System.out.println(res);

//		System.out.println( val ? "Hello." : "Hi ); // val has to be a boolean
		
//		for(System.out.println("Java");a>b?true:false;System.exit(0)) // a>b can happen as we can manipulate variable, but no constants, if we do 1>2 no error, but if we do 2>1, error, Unreacheble statement
//		{
//			System.out.println("Hello");
//		}
// run the program again without exit(0) and make the 1 as 3 so that it won't satisfy the 1st expression
		
// =============================================================================================
		// printing a message withour println()
		
//		System.out.write("Hello\n".getBytes());
//		System.out.format("%s", "Hello Java\n");
//		
//		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
//        myout.print("i love Java");
        
// =============================================================================================
		
//		Test t = new Test(10);
//		Test t1 = new Test(10);
//		System.out.println(t.hashCode()+"\t"+t1.hashCode());
//		System.out.println(t == t1);
//		System.out.println(t.equals(t1));
// ==============================================================================================
		
		
	}
//	private int i;
//	public Test(int i){
//		this.i = i;
//	}
//	public int hashCode() {
//		return 10;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + i;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Test other = (Test) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}
	
}








==============================================================================================================================








import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test 
{
//	private int id;
//	private final String name ;
//	
//	public Test() {
//		name = "Debi";
//	}
//	
//	public Test(String name) {
//		this.name = name;
//	}
//	
////	{
////		name = "Debi";
////	}
	public static void main(String[] args) throws IOException 
	{
		
//		int a = 1, b = 1;
//		boolean c;
//		c = (++a==2)&&(++b==2);
//		System.out.println(a+" "+b+" "+c);
//		
//		a=b=1; 
//		c = (++a==1)&&(++b==1);
//		System.out.println(a+" "+b+" "+c);
// =================================================================================================
//		int a = 1, b = 2 ;
////		String res = a>b ? "Hello" : "Hi";
////		System.out.println(res);

//		System.out.println( val ? "Hello." : "Hi ); // val has to be a boolean
		
//		for(System.out.println("Java");a>b?true:false;System.exit(0)) // a>b can happen as we can manipulate variable, but no constants, if we do 1>2 no error, but if we do 2>1, error, Unreacheble statement
//		{
//			System.out.println("Hello");
//		}
// run the program again without exit(0) and make the 1 as 3 so that it won't satisfy the 1st expression
		
// =============================================================================================
		// printing a message withour println()
		
//		System.out.write("Hello\n".getBytes());
//		System.out.format("%s", "Hello Java\n");
//		
//		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
//        myout.print("i love Java");
        
// =============================================================================================
		
//		Test t = new Test(10);
//		Test t1 = new Test(10);
//		System.out.println(t.hashCode()+"\t"+t1.hashCode());
//		System.out.println(t == t1);
//		System.out.println(t.equals(t1));
// ==============================================================================================
		
		
	}
//	private int i;
//	public Test(int i){
//		this.i = i;
//	}
//	public int hashCode() {
//		return 10;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + i;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Test other = (Test) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}
	
}






















