JDK - software comes with a Java compiler and Java Runtime Environment (JRE)
JRE - contains JVM (JAVA Virtual machine)	
			and set of APIs
	- JVM uses Just In Time(JIT) compiler to do its works.  

- Java compiler name is javac
- Java compiler converts source code into byte code i.e. .java files to .class file.
- JRE provides an environment for the code to run.
- JRE acts as an duplicate OS for interpreting byte code to underlying OS.
- API (Application programming interface) - provides pre-defined functions and interfaces i.e. libraries

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

Features
--------------
	1. platform independent - 
		- If an application can be executed in multiple platform i.e. known as platform independent application.
		- C/C++ is platform dependent programming.
		- Java is platform independent.
		- The byte code i.e. the .class file can be run on any platform like windows/linux/MacOS
		- But for separate Platforms we have separate JVM installed in them.

OOPs - Object Oriented Programming
----------------------------------------
	- A programming language performing its operation via objects is OOP language.
	- JAVA is a partially OOP language.
	- It is a programming standard.
	- OOPs concept
			1. Inheritance		- Aggregation/Association
			2. Polymorphism		- Concurrency
			3. Abstraction		- Information hiding
			4. Encapsulation		- Typing
			5. Object
			6. class
	- C is not a Object oriented language.
	- Java is an Object oriented programming language (Partially) as it supports primitive data types.

Encapsulation
------------------
	- Wrapping up variables,functions,classes into a single unit is encapsulation.
inheritance
------------------
	- Parent child class concept is inheritance.
	- Re-usability and IS-A relation is inheritance. i.e. BMW and AUDI IS-A CAR
Abstraction
--------------
	- Extracting the data is abstraction
Polymorphism
----------------
	- multiple behaviour of objects with other objects i.e. function over-loading and over-riding

Building blocks of JAVA
--------------------------
 - class 
 - variables
 - Functions/methods
 - blocks
	
variables - identities that we give to a memory locations whereever data is stored.
		- variable name is a pointer which points to the data location in the RAM or in the memory.

Methods - Set of programming instructions that takles an input and produce an output.
		- Method is a collection of java statement which is responsible to perform a specific task.


statics - class level (allocates memory and gets executed during class loading)
		- can be called by directly/class name/object name

non-static - object level (executed during object creation)
		- can be called by object name only
		special case - (directly inside a non-static block)

- Static block executes prior to main function.


Static methods - can be called by directly/class name/object name in main function and in static block.


Datatypes
---------------
 - It says what kind of data a variable can carry.

datatype variable_name ;

- 2 types of datatypes
	- Primitive - byte/short/int/long/char - Integral
				- float/double - decimal
				- boolean - true/false
	- Non primitive/reference
				- class
				- array
				- String

	- reason to have primitive datatype that they carry a certain range of values of data.



Type casting
----------------
	- Implicit - small to large data type - byte to int
										  - int to long

	- Explicit - larger to smaller data type
					- double to float
					- long to int

	- Reference - required inheritance
			child obj. to parent class - implicit
			parent obj. to child class - Explicit

Wrapper Classes
----------------------
- It helps conversion of primitive type to Object type.
- It is needed when we work with collection API.

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



Boxing
	-----------------------------------------
		- Technique to convert primitive datatype into Wrapper class object.
	Unboxing
	-----------------------------------------
		- Technique to convert Wrapper class objects into Primitive datatypes.
	Auto-boxing
	-----------------------------------------
		- In the latest JDK, Boxing and Unboxing both are the job of java compiler i.e. automatically done by javac compiler which is known as Auto-boxing.

Flow Control
-------------------
	- Selection - if..else
				- switch..case
	- Iterative - while
				- do..while
				- for
				- foreach
	- Transfer  - break
				- continue
				- return
				- try..cathch..finally
				- assert

Access modifiers
------------------------
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



Abstraction
-----------------
- Hiding the details of the object is an abstract.


- Interface without any methods is marker interface.

Encapsulation
-----------------------
- It is a process or technique of wrapping of data member and method members into a single entity.

		How to achieve encapsulation
		--------------------------------
			1. Declare all the variables as private.
					: private is for information hiding
			
			2. Design getter and setter method for each data member.

						getter method : To view the values of data members
						setter method : To modify the data member


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


Garbage Collection
--------------------------
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



Nested Class
----------------------
1. static inner class
---------------------------------
package InnerClasses;

public class Outer 
{
	static void f1()
	{
		System.out.println("Outer f1() Static method");
	}
	static class Inner
	{
		static void f2()
		{
			System.out.println("Inner f2() static method");
		}
		void f3()
		{
			System.out.println("Non static method inside Inner Class");
		}
	}
	public static void main(String[] args) 
	{
		Outer.f1();
		Outer.Inner.f2();
		Outer.Inner obj = new Outer.Inner();
		obj.f3();
	}
}


2. Non-static inner class with accessing different members
-------------------------------------------------------------------
package InnerClasses;

public class Outer2 
{
	private static int x = 50;
	private int y;
	
	Outer2(int y) 
	{
		this.y = y;
	}
	
	class Inner
	{
		private int y;
		Inner(int y)
		{
			this.y = y;
		}
		void f2()
		{
			System.out.println("Inner class non-static method f2()");
			System.out.println("Outer class static X "+Outer2.x); //50
			System.out.println("Outer class non-static y "+Outer2.this.y); //80
			System.out.println("Inner Class non-static y "+this.y); //30
			
		}
//		static void f3() //static not allowed inside non-static
//		{}
	}
	public static void main(String[] args) 
	{
		Outer2 outer = new Outer2(80);
		outer.f1();
		
		Outer2.Inner inner = outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y); //30
	}
	
	void f1()
	{
		System.out.println("Outer class non-static method f1()");
	}
}

/*
Outer class non-static method f1()
Inner class non-static method f2()
Outer class static X 50
Outer class non-static y 80
Inner Class non-static y 30
30
*/



3. Local Inner classes
---------------------------------
package InnerClasses;

public class Outer3 
{
	void f1()
	{
		System.out.println("Outer f1()");
		class LocalInner //Class cannot be accessed outside the f1() method
		{
			void f2()
			{
				System.out.println("LocalInner f2()");
			}
		}
		LocalInner li = new LocalInner();
		li.f2();
	}
	public static void main(String[] args) 
	{
		Outer3 o = new Outer3();
		o.f1();
	}
}

4. Anonymous Class
--------------------------
 - Doesnt have a class name of its own
 - doesnt support any constructor

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


Create Connection , DriverManager, and Test the connection by anonymous class
------------------------------------------------------------------------------------
package InnerClassesAnonymous;

public interface Connection 
{
	void createStatement();
}

--------------
package InnerClassesAnonymous;

public class DriverManager 
{
	static Connection getConnection()
	{
		Connection con = new Connection() //Anonymous class 
		{
			public void createStatement() //Over-ridden method
			{
				System.out.println("Anonymous Inner Class method");
			}
		};
		
		return con; //Return Anonymous Class Object
	}
}
----------------------
package InnerClassesAnonymous;

public class Test 
{
	public static void main(String[] args) 
	{
		Connection con = DriverManager.getConnection();
		con.createStatement();
	}
}


Anonymous Runnable Implementation
=--------------------------------------
package InnerClassesAnonymous;

public class AnonymousRunnable 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Anonymous Runnable Class Implementation");
			}
		});
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}




java.io package
IOStreams
==================
	- Logical handler for an input-output operation
	- 4 types of streams
			1. ByteStreams
			2. CharacterStreams
			3. BufferedStreams
			4. ObjectStreams

	- Reside in java.io package
	- Classes are 
			- InputStream
			- OutputStream
			- FileInputStream
			- FileOutoutStream
			- Reader
			- Writer
			- FileReader
			- FileWriter
			- File
	- They throw checked exception
			1. FileNotFoundException
			2. IOException


Read a file and print it
------------------------------------
package IOPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput 
{
	public static void main(String[] args) //throws FileNotFoundException 
	{
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt"));
			System.out.println("File Opened");
			
			int i;
			while ((i=fis.read()) != -1) 
			{
				System.out.print((char)i);
			}
			
			
		}catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fis.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
		
	}
}



Read a file and copy and paste into another file
-------------------------------------------
package IOPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_Copy 
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try 
		{
			fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\img.png");
			fos = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\NEWimg.png");
			
			int data;
			while ((data=fis.read()) != -1) 
			{
				fos.write(data);
			}
			System.out.println("File Copied");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
}




File reading and writing into another file
--------------------------------------------------------
package IOPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt");
		
		fw = new FileWriter("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\NEWFILE.txt");
		
		int ch;
		while ((ch=fr.read()) != -1) 
		{
			fw.write(ch);
		}
		System.out.println("File Copied");
		fr.close();
		fw.close();
	}
}




StringTokenizer class
----------------------------
- Just like split() method it divides a string into tokens

package stringTokenizer;

import java.util.StringTokenizer;
public class StringTokenizerDemo 
{

	public static void main(String[] args) 
	{
		String s = "You are , the creator , of your destiny";
		String[] s1 =  s.split(" ");
		for(String res : s1)
		{
			System.out.println(res);
		}
		
		System.out.println("-------------------------");
		
//		StringTokenizer st = new StringTokenizer(s); //Divides by space
//		StringTokenizer st = new StringTokenizer(s,","); //By default it is space //, is a delimeter
		//divides by ,
		StringTokenizer st = new StringTokenizer(s,",",true); //true considers , as tokens(Strings) also & false won't
		while(st.hasMoreTokens()) //checks if there are more tokens
		{
			System.out.println(st.nextToken()); //returns the token value
		}
	}
}
	


Reading a file and printing each word and count no of words (using both split() and StringTokenizer Class)
----------------------------------------------------------------------------------------------------------------
package stringTokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BuffReader_FileRead_CountWords 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;
		int cnt = 0;
		
		try {
			fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt");
			br = new BufferedReader(fr);
			
			String line;
			System.out.println("Doint it by split() and StringTokenizer Class");
			while((line=br.readLine()) != null)
			{
				String[] s = line.split(" ");
				for (String res : s) 
				{
					System.out.println(res);
					cnt++;
				}
				
		//-------------------------------------------------------------------------------
				StringTokenizer st = new StringTokenizer(line," ");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("No of words in the file are : "+cnt);
			System.out.println("No of words in the file are : "+count);
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

	

Try with resource block
---------------------------------
- It helps in auto-closing of any connection if the declaration is done inside the try(declaration){}


try (FileReader fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt");
		BufferedReader	br = new BufferedReader(fr);)
	{

	}

-- Do this in previous program
-- Remove the finally block as JVM will automatically close the connection
-- Helpful in JDBC connection




Serialization
-----------------------
	- process of Writing an object to a stream (File system / Network system)
	- It means that the object can be shared through all the sources
	- For an object to be serialize, its class should implement Serializable interface from java.io package
	- Serializable is a markar interface
	
	- transient keyword is used for De-serialization
	- It means, when transient keyword is present before a member, it will not be shared among sources.

	- We use ObjectOutputStream from java.io package to write an object to a stream is called as Serialization

	- ObjectInputStream is used to read an Object from a stream is called as De-Serialization

	- It can happen in same machine as well as on different machine.
	- It is used in Java Messaging Service


package Serialization;

import java.io.Serializable;

public class Employee implements Serializable 
{
	int id;
	String name;
	double salary;
	transient int ssn; //we don't want it to be shared so it will not be printed in the file
	
	public Employee(int id,String name, double salary,int ssn) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}


package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo 
{
	public static void main(String[] args) 
	{
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try 
		{
			fos = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\Emp.ser");  //.ser extension is for serialized files //Emp.ser will be created
			oos = new ObjectOutputStream(fos);
		
			Employee emp = new Employee(1, "john", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee object Serialized");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
}


package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		
		System.out.println("Employee id : "+emp.id);
		System.out.println("Employee name : "+emp.name);
		System.out.println("Employee salary : "+emp.salary);
		System.out.println("employee ssn : "+emp.ssn);
		
	}
}





Over-riding Object Class Methods
-------------------------------------------
package ObjectClassMethods;

public class Passenger 
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	String f_name;
	String l_name;
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	@Override
	public String toString() {
	
		return "Passenger Info is First Name: "+this.f_name+" & Last Name: "+this.l_name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Passenger ps = (Passenger) obj;
		if(ps.getId() == this.id && ps.getF_name().equals(this.f_name) && ps.getL_name().equals(this.l_name))
		{
			return true;
		}
		else
			return false;
	}
}


package ObjectClassMethods;

public class Test 
{
	public static void main(String[] args) 
	{
		Passenger ps = new Passenger();
		ps.setF_name("Debi");
		ps.setL_name("Mishra");
		System.out.println(ps); //ObjectClassMethods.Passenger@1f32e575
		//after over-riding toString() in Passenger class we see the output instead of hashcode
		
		//System.out.println(ps.hashCode()); //523429237
		ps.setId(1234);
		System.out.println(ps.hashCode()); // After override it returns id value i.e. 1234
		
		Passenger ps1 = new Passenger();
		ps1.setF_name("Debi");
		ps1.setL_name("Mishra");
		ps1.setId(1234);
		System.out.println(ps.equals(ps1)); //false //now it checks the contents and returns true as both contents are equal
		
	}
}

============================================================================================

package ObjectClassMethods;

public class ElectricityBill 
{
	int meterno;
	String name;
	String address;
	public int getMeterno() {
		return meterno;
	}
	public void setMeterno(int meterno) {
		this.meterno = meterno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
	
		return "BillInfo :- meterno: "+this.meterno+" Name: "+this.name+" Address: "+this.address;
	}
	
	@Override
	public boolean equals(Object obj) {
	ElectricityBill eb = (ElectricityBill) obj;
		if(eb.meterno == this.meterno)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.meterno;
	}
}


package ObjectClassMethods;

public class TestElectricity 
{
	public static void main(String[] args) 
	{
		ElectricityBill eb = new ElectricityBill();
		eb.setMeterno(123);
		eb.setName("Debi");
		eb.setAddress("BBSR");
		
		ElectricityBill eb1 = new ElectricityBill();
		eb1.setMeterno(1223);
		eb1.setName("Ravi");
		eb1.setAddress("CTC");
		
		System.out.println(eb);
		System.out.println(eb.equals(eb1));
		System.out.println(eb.hashCode());
		System.out.println(eb1.hashCode());
	}
}


================================================================================================



Collection (interface)
	List (interfaces)
		ArrayList - maintains insertion order	(Classes)
		LinkedList - can add or delete anywhere
		Vector
			Stack
	Set (interface)
		HashSet - stores data in random order
			LinkedHashSet - stores data in insertion order
		SortedSet (interface)
			NavigableSet (interface)
				TreeSet (Stores data in ascending order)
	Queue (interface)
		LinkedList
		PriorityQueue (doesnot allow duplicates, insertion order not maintained, default natural sorting order, Null values aren't allowed)
		BlockingQueue (interface)
		Deque (interface)

Map(Interface) - Evaluates list on basis of keys i.e. object stored in keys
	HashMap - Stores data in random order (Duplicate keys gets replaced by new keys and values, Garbage collection doesnot happens)
		LinkedHashMap - maintains the insertion order 
	IdentityHashMap (//Will hold the duplicate keys and respective values)
	WeakHashMap (garbage collection happens if the object reference doesnot refer to any other objects)
	SortedMap (interface)
			NavigableMap (interface)
					Treemap (Class) - Sort the keys and values
	Dictionary (abstract class)
		Hashtable
			Properties


HashMap - LinkedHashMap - IdentityHashMap - WeakHashMap - NavigableMap
=-----------------------------------------------------------------------
package collectionFramework.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Debi", 70); 	//String is key and integer is value
		map.put("Tom", 80);
		map.put("Steve", 90);
		map.put("Raja", 1000);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys : "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values P: "+values);
		
		//Not ordered
		for (String key : keySet) 
		{
			System.out.println("Key : "+key+" With Value : "+map.get(key));
		}
	}
}


package collectionFramework.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Debi", 70); 	//String is key and integer is value
		map.put("Tom", 80);
		map.put("Steve", 90);
		map.put("Raja", 1000);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys : "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values P: "+values);
		
		//Stored in insertion ordered
		for (String key : keySet) 
		{
			System.out.println("Key : "+key+" With Value : "+map.get(key));
		}
	}
}


package collectionFramework.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		IdentityHashMap<Integer, String> ihmap = new IdentityHashMap<Integer, String>(); //Will hold the duplicate keys and respective values
		HashMap<Integer, String> hmap = new HashMap<Integer , String>(); //(Duplicate keys gets replaced by new keys and values)
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
		hmap.put(id1, "Debi");
		hmap.put(id2, "Raja");
		
		ihmap.put(id1, "Debi");
		ihmap.put(id2, "Raja");
		
		System.out.println(hmap);
		System.out.println(ihmap);
	}
}



package collectionFramework.Map;

public class User_WeakHashMap 
{
	@Override
	public String toString() {
		return "User";
	}
	
	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("Finalize() called");
	}
}

package collectionFramework.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		HashMap<User_WeakHashMap, String> hmap = new HashMap<User_WeakHashMap , String>();
		WeakHashMap<User_WeakHashMap, String> whmap = new WeakHashMap<User_WeakHashMap , String>();
		
		User_WeakHashMap u = new User_WeakHashMap();
//		hmap.put(u, "Tom");
		whmap.put(u, "Raja");
		
		System.out.println(whmap);
//		System.out.println(hmap);
		
		u = null;
		
		System.gc();
		Thread.sleep(5000);
		
//		System.out.println(hmap); //garbage collection doesnot happen
		System.out.println(whmap); //garbage collection happens if the object reference doesnot refer to any other objects
	}
}


package collectionFramework.Map;

import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(10, "DEBI");
		map.put(11, "RAJA");
		map.put(12, "RANI");
		map.put(13, "HARI");
		map.put(14, "JOHN");
		map.put(15, "ROCK");
		
		System.out.println(map);
		System.out.println(map.floorKey(12)); //<=
		System.out.println(map.lowerKey(12)); //<
		System.out.println(map.ceilingKey(12)); //=
		System.out.println(map.higherKey(12)); //>
		System.out.println(map.pollFirstEntry()); //Retrieve and remove 1st key & value to enter
		System.out.println(map.pollLastEntry()); //Retrieve and remove last key & value to enter
		System.out.println(map.descendingMap()); //Returns amap in descending order
		System.out.println(map);
		
		
	}
}




Queue
=======================
PriorityQueue
------------------
	- Insertion happens in order but once manipulation starts it gets shuffeled.
package collectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek()); //null
		//System.out.println(q.element()); //if queue is empty throw a NoSuchElementException
		
		for(int i = 20; i <= 30; i++)
		{
			q.offer(i);
		}
		System.out.println(q); 
		System.out.println(q.poll()); //Remove 1st inserted element and return that element //20
		System.out.println(q);
		System.out.println(q.remove()); //removes the 1st element and return it
		System.out.println(q);
	}
}

null
[20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
20
[21, 23, 22, 27, 24, 25, 26, 30, 28, 29]
21
[22, 23, 25, 27, 24, 29, 26, 30, 28]



Collections Class
--------------------------
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
		System.out.println("After sorting : "+list); //Sorting in forward direction
		System.out.println(Collections.binarySearch(list, "Z"));
		Collections.sort(list,new MyComparator());
		System.out.println("After sorting : "+list); //Sorting in reversing direction
		System.out.println(Collections.binarySearch(list, "Z", new MyComparator()));
	}
}


package collectionsClass;

import java.util.Comparator;

public class MyComparator implements Comparator<String> 
{
	@Override
	public int compare(String o1, String o2) 
	{
		return o2.compareTo(o1);
		
	}

}




Generics
------------------
	- Used to avoid type safety and type casting
package generics;

import java.util.ArrayList;

public class TypeCastingProblem 
{
	public static void main(String[] args) 
	{
		String s[] = new String[10];
		s[0] = "John";
		s[1] = "Rob";
//		s[2] = 123;
		
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<>();
		list.add("John");
		list.add("Rob");
//		list.add(123);
		
		String l1 = (String) list.get(0);
		String l2 = (String) list.get(1);
//		String l3 = (String) list.get(2);
		// will show ClassCastException  which is why generics is used
		System.out.println(l1);
		System.out.println(l2);
//		System.out.println(l3);
	}
}



Creating Own Generics class
-------------------------------------
package generics;

public class MyGenericClass<T> 
{
	T obj;
	MyGenericClass(T obj) 
	{
		this.obj = obj;
	}
	
	public void displayObjectDetails()
	{
		System.out.println("Type of Object : "+obj.getClass().getName());
	}
	public T getObject()
	{
		return obj;
	}
}


package generics;

public class Test 
{
	public static void main(String[] args) 
	{
		MyGenericClass<String> s = new MyGenericClass<String>("Devi");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i = new MyGenericClass<Integer>(123);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> d = new MyGenericClass<Double>(23.45);
		d.displayObjectDetails();
		System.out.println(d.getObject());
		
	}
}




Restricting Generics Class
-------------------------------------
package generics;

//public class AnyRunnable<T extends Runnable> 
public class AnyRunnable<T extends Thread & Comparable> 
{
	//Restricts to accept type of data that is child of Runnable like Thread, but wont accpet data like String or Integer...
}

package generics;

public class MyClass extends Thread implements Comparable<String>
{
	@Override
	public int compareTo(String o) {
		return 0;
	}
}



package generics;

public class AnyRunnableTest 
{
	public static void main(String[] args) 
	{
//		AnyRunnable<Thread> th = new AnyRunnable<Thread>();
		AnyRunnable<MyClass> th = new AnyRunnable<MyClass>(); //For multiple restrictions CREATE A NEW CLASS that extends and implements respective classes & interfaces and use that inside <>
		
//		AnyRunnable<String> th = new AnyRunnable<>(); //Restricted
		
	}
}





Wild-Card parameters
========================
package generics;

import java.util.ArrayList;

public class WildCardParams 
{
	public void myMethods(ArrayList<?> list)
	{
//		<?> is wild cards and it only will accept null values
		list.add(null);
//		list.add("Debi");
	}
}



package generics;

import java.util.ArrayList;

public class WildCardParams 
{
	public static void main(String[] args) 
	{
		WildCardParams wcp = new WildCardParams();
		wcp.myMethods(new ArrayList<Thread>());
//		wcp.myMethods(new ArrayList<String>()); //Cant be used
		wcp.myMethods(new ArrayList<MyClass>()); //MyClass class extends Thread Class
	}
//	public void myMethods(ArrayList<?> list)
	public void myMethods(ArrayList<? extends Thread> list) //Will now be able to pass a type which is a thread or any class that extends thread
	{
//		<?> is wild cards and it only will accept null values
		list.add(null);
//		list.add("Debi");
		// Now i can only pass an Arraylist of type Thread
	}
}



Methods Level Generics
---------------------------------
package generics;

public class MethodLevelGenerics 
{
	public <T> void method1(T t)
	{
		
	}
	public <T extends Runnable> void method2(T t)
	{
		
	}
	public <T extends Runnable & Comparable<String>> void method3(T t)
	{
		
	}
}




Enums
------------------
	- To define a group of constants in java, enum is used
	- By default JVM takes the enum as a class
	- It is represented by enum keyword
	- internally it extends an abstract class called Enum from java.lang package

			public enum Databases 
			{
				MYSQL,ORACLE,SQL_SERVER;
			}
	- The constants are objects of that class and public,static and final by default
	- It can not extend any other classes as already been extended by Enum but can implement several interfaces.

package Enums;

public enum PaymentType 
{
	DEBITCARD,CREDITCARD,CASH;
}


package Enums;

public class Test 
{
	public static void main(String[] args) 
	{
		PaymentType pt = PaymentType.CREDITCARD;
//		System.out.println(pt);
		
		PaymentType[] val = PaymentType.values(); //Returns the constant values in array of objects format
		for (PaymentType paymentType : val)
		{
			System.out.println(paymentType); 
			System.out.println(paymentType.ordinal()); //Returns the index of the values
		}
			
		
	}
}



Real Time use
-------------------------
package Enums;

public enum PaymentType 
{
	DEBITCARD(5),CREDITCARD(10),CASH(0);
	
	int fee;
	PaymentType(int fee)
	{
		this.fee = fee;
	}
	public int getFee()
	{
		return this.fee;
	}
}


package Enums;

public class Test 
{
	public static void main(String[] args) 
	{
		PaymentType pt = PaymentType.CREDITCARD;
//		System.out.println(pt);
		
		PaymentType[] val = PaymentType.values(); //Returns the constant values in array of objects format
		for (PaymentType paymentType : val)
		{
			System.out.println(paymentType); 
			System.out.println("Index is "+paymentType.ordinal()); //Returns the index of the values
			
			System.out.println("Fee is : "+paymentType.getFee());
		}
	}
}




Lambda Expression
==========================
	- main goal is to introduce the benifits of functional programming in java.
	- It is an anonymous function or closures in java i.e. a function without name,return type and access modifiers

//Complete function
public void display()
{
	sop("Debi");
}

public void multiply(int a,int b)
{
	sop(a*b);
}

It can be represented by
		
		() ->{sop("Debi");}
		(int a, int b) -> sop(a*b);

	benifits
	---------------
		- less Code
		- Easy to implement anonymous inner classes
		- Parameters to other methods


	Functional Interfaces
	----------------------------
		- if an interface has only one abstract method is called as functional interface.
		- without any methods or any fields an interface is known as Marker interface.

	e.g.
		interface MyInterface
		{
			void myMethod();
		}

		- Runnable, Comparator are functional interfaces with run() and compareTo() methods inside them respectively.

package java8Features;

@FunctionalInterface
public interface FunctionalInterfaceDemo 
{	
	void myMethod();
	
	
}


package java8Features;

@FunctionalInterface
public interface B extends FunctionalInterfaceDemo
{
	void myMethod();
	
}


package java8Features;

public class C implements FunctionalInterfaceDemo
{
	public void myMethod() 
	{
		System.out.println("myMethod");
	}
	
}


package java8Features;

public class LambdaDemo 
{
	public static void main(String[] args) 
	{
//		FunctionalInterfaceDemo f = new C();
//		f.myMethod();
		
		FunctionalInterfaceDemo f = ()->System.out.println("Inside myMethod()");
		f.myMethod();
		
	}
}

----------------------------------------------

package java8Features;

public interface SumByLambda 
{	
	void add(int a, int b);
}


package java8Features;

public class SumClass 
{
	public static void main(String[] args) 
	{
		SumByLambda s = (x,y)->System.out.println("Sum is : "+(x+y));
		s.add(10, 20);
		
		
	}
}

------------------------------------------------------

package java8Features;

public class MyRunnableImpl implements Runnable 
{
	public void run() 
	{
		for(int i = 1; i <= 10; i++)
			System.out.println("Child Thread");
		
	}
	
}


package java8Features;

public class ThreadTest 
{
	public static void main(String[] args) 
	{
//		Runnable r = new MyRunnableImpl();
//		Thread t = new Thread(r);
//		t.start();
		
		Runnable r = ()->{
			for(int i =1; i<=10; i++)
				System.out.println("Child Thread");
		};
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 1; i <= 10; i++) 
			System.out.println("Main Thread");
	}
}

----------------------------------------------




Predicate
-----------------
	- A function with single argument and returns boolean value.
	- It is a functional interface with one abstract method which can take any argument and returns only boolean value.

	interface Predicate<T>
	{
		public boolean test (T t)
	}

package java8Features;

import java.util.function.Predicate;

public class GreaterThanTwentyPredicate 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p = (i)->(i>20);
		System.out.println(p.test(15)); //false
		System.out.println(p.test(25)); //true
		System.out.println(p.test(30)); //true
		
	}
}

-------------------------

package java8Features;

import java.util.function.Predicate;

public class LengthOfStringPredicate 
{
	public static void main(String[] args) 
	{
		Predicate<String> p = (s)->(s.length() > 5);
		System.out.println(p.test("Debi")); //false
		System.out.println(p.test("HGUHVGF")); //true
		System.out.println(p.test("KKDDKDKDKDKD")); //true
		
	}
}

-----------------------------------

greater than 10
-----------

package java8Features;

import java.util.function.Predicate;

public class PredicateJoins 
{
	public static void main(String[] args) 
	{
		int x[] = {0,10,20,30,40,50,60,70,7,73};
		
		Predicate<Integer> p = (i)->(i > 10);
		System.out.println("Greater than 10 : ");
		method(p, x);
	}
	static void method(Predicate<Integer> p , int x[])
	{
		for (int eachValue : x) 
		{
			if(p.test(eachValue))
				System.out.print(eachValue+"\t");
		}
	}
}

-----------------------------------------

package java8Features;

import java.util.function.Predicate;

public class PredicateJoins 
{
	public static void main(String[] args) 
	{
		int x[] = {0,10,20,30,40,50,60,70,7,73};
		
		Predicate<Integer> p = (i)->(i > 10); //Check if i > 10
		Predicate<Integer> p2 = (i)->(i%2 == 0); // Check if even
		
		System.out.println("Greater than 10 : ");
		method(p, x);
		
		System.out.println("\nEven numbers : ");
		method(p2,x);
		
		System.out.println("\nNot Greater than 10 : ");
		method(p.negate(), x);
		
		System.out.println("\nGreater than 10 AND even");
		method(p.and(p2), x);
		
		System.out.println("\nGreater than 10 OR even");
		method(p.or(p2), x);
	}
	static void method(Predicate<Integer> p , int x[])
	{
		for (int eachValue : x) 
		{
			if(p.test(eachValue))
				System.out.print(eachValue+"\t");
		}
	}
}


Function
------------------
	- It is a functional interface Similar to Predicate except they can return any type of result.
	- It has only one abtract method i.e. apply() which can take any type of parameters and can return any type
	
	interface Function(T,R)
	{
		R apply(T t);
	}


package java8Features;

import java.util.function.Function;

public class FunctionTest 	
{	
	public static void main(String[] args) 
	{
		Function<String, Integer> f = (s)->s.length();
		System.out.println(f.apply("Debi"));
		System.out.println(f.apply("Hello"));
	}
}



Method Referencing (::)
----------------------
package java8Features;

public class MethodReferencing 
{
	public static void myMethod()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) 
	{
		Runnable r = MethodReferencing::myMethod;
		
		Thread t = new Thread(r);
		t.start();

		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Parent Thread");
		}
	}
}




Streams
------------------
	- It is a interface present in java.util.stream.Stream 
	- Helpful in workinng with collection
	- We can get a Stream on a Collection by invoking stream() method which was added to collection interface in JDK8.
	- Once we have a stream to process the collection , it is done by 2 ways

	1. Cofiguration
			2 ways
				Filtering - invoke the filter() method
					public Stream filter (Predicate<T> p)
				Map - using map() method
					public Stream map(Function f)

	2. Processing the data itself
		collect() , count() , sorted() , min() , max()



Filter all even numbers in list
----------------------------------------
package java8Features.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++)
			list.add(i);
		System.out.println(list);
//		System.out.println("Filter by traditional method");
//		ArrayList<Integer> list2 = new ArrayList<>();
//		for (Integer i : list) 
//		{
//			if(i%2 == 0)
//				list2.add(i);
//		}
		
		System.out.println("Filtering by Streams");
		List<Integer> list2 = list.stream().filter((i)->i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
	}
}



Map all the elements from Uppercase to Lowercase
------------------------------------------------------------
package java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("JOHN");
		list.add("DEVI");
		list.add("JIM");
		list.add("LIKE");
		System.out.println(list);
		
		List<String> list2 = list.stream().map((s)->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}




All Methods in one of Stream
--------------------------------------
package java8Features.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++)
			list.add(i);
		System.out.println(list);
//		System.out.println("Filter by traditional method");
//		ArrayList<Integer> list2 = new ArrayList<>();
//		for (Integer i : list) 
//		{
//			if(i%2 == 0)
//				list2.add(i);
//		}
		
		System.out.println("Filtering by Streams");
		List<Integer> list2 = list.stream().filter((i)->i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
		long count = list.stream().filter((i)->i%2 == 0).count();
		System.out.println("Mo of even numbers are : "+count);
		
//		Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1);// For Descending
//		List<Integer> list3 = list.stream().sorted(comp).collect(Collectors.toList());
		
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);//For ascending which is natural order of sorting
		List<Integer> list3 = list.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(list3);
		
		Integer max = list.stream().max(comp).get();
		System.out.println(max);
		
		Integer min = list.stream().min(comp).get();
		System.out.println(min);
		
		list.stream().forEach(i->System.out.print(i+"\t"));
			
		
	}
}


[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Filtering by Streams
[0, 2, 4, 6, 8, 10]
Mo of even numbers are : 6
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
10
0
0	1	2	3	4	5	6	7	8	9	10	






Display methods inside a class
------------------------------------------
package classLoadingManual;

public class Users 
{
	public String name()
	{
		return "Debi";
	}
	public String email()
	{
		return "d@gmail.com";
	}
}


package classLoadingManual;

import java.lang.reflect.Method;

public class MethodsInUsers 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c = Class.forName("classLoadingManual.Users");
		
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) 
		{
			System.out.println(method.getName());
		}
		System.out.println(methods.length);
		
	}
}


package classLoadingManual;

public class MultipleObjects 
{
	public static void main(String[] args) 
	{ //Proof of class is loaded into JVM only once
		Users u1 = new Users();
		Class c1 = u1.getClass();
		
		Users u2 = new Users();
		Class c2 = u1.getClass();
		
		System.out.println(c1.hashCode()); //1392838282
		System.out.println(c2.hashCode()); //1392838282
		System.out.println(c1==c2); //true
		
		System.out.println(c1.getClassLoader()); //jdk.internal.loader.ClassLoaders$AppClassLoader@c387f44
		System.out.println(String.class.getClassLoader()); //String or inbuilt classes gets loaded by JRE i.e. by rt.jar which is known as bootstrap class loading, that's why null is returned
	}
}

------------------------------



Annotations
-------------------

package annotation;

@Deprecated
public class A 	
{	
	@Deprecated
	public int a;
	@Deprecated
	public void fun()
	{
		
	}
	public void show()
	{
		
	}
}

package annotation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class B extends A 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		A a = new A();
//		System.out.println(a); // IF object is not used
		
		a.fun();
		a.show();
		System.out.println(a.a);
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		System.out.println(list);
		
	}
}

-------------------

package annotation;

public class MyParent 
{
	void fun()
	{
		System.out.println("Parent fun");
	}
}

package annotation;

public class MyChild extends MyParent
{
	public static void main(String[] args) 
	{
		MyChild m = new MyChild();
		m.fun();
	}
	//@Override //To ensure that the over-riding is actually done or not
	void fun(int a)
	{
		System.out.println("Child fun()");
	}
}

---------------------
User Defined Annotation
---------------------------
package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation 
{
	
}

package annotation;

public class AnnotationTest 
{
	@MyAnnotation
	public void fun()
	{
		
	}
}


-----------------------------------------



Reflection API
---------------------------
	- It is an API using which we can Inspect and modify the behaviour of a class dynamically at runtime
	- We can 
			- Create an object
			- invoke methods
			- access private fields directly without using setter methods
		using Relfection API.

	- Key classes are
			java.lang.Class
				java.lang.reflect.Constructors
				java.lang.reflect.Methods
				java.lang.reflect.Field
				java.lang.reflect.Annotation
											... etc

package reflectionAPI;

public class Calculator 
{
	private double num1;
	private double num2;
	
	public Calculator() {
		System.out.println("Default constructor in Calculator");
	}
	public Calculator(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double sum(int n1, int n2)
	{
		return n1 + n2;
	}
	
}



package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Class<?> myclass = Class.forName(Calculator.class.getName());
		System.out.println(myclass.getName());
		
		Constructor<?>[] constructors = myclass.getConstructors();
		System.out.println(Arrays.toString(constructors));
		System.out.println(Arrays.toString(myclass.getMethods()));
		
		//Create Object and access particular constructors
		Constructor<?> constructor = myclass.getConstructor(null);
		System.out.println(constructor.newInstance(null));
		
		Constructor<?> constructor2 = myclass.getConstructor(double.class , double.class);
//		System.out.println(constructor2.newInstance(5.2 , 6.2)); //Print hashcodes of newly created objects, parameterized constructor invoked
		Object myObj = constructor2.newInstance(5.2 , 6.2);
		
		//access setter methods
		Method setNum1 = myclass.getMethod("setNum1", double.class);
		setNum1.invoke(myObj, 3.2);
		
		Method setNum2 = myclass.getMethod("setNum2", double.class);
		setNum2.invoke(myObj, 8.3);
		
		//Making private field accessible
		Field num1Field = myclass.getDeclaredField("num1");
		num1Field.setAccessible(true);
		num1Field.set(myObj, 80.23); //new value assigned to private


		//Access method getter methods
		Method method = myclass.getMethod("getNum1", null);
		System.out.println(method.invoke(myObj, null)); //returns 3.2
				
		Method method2 = myclass.getMethod("getNum2", null);
		System.out.println(method2.invoke(myObj, null)); //returns 8.3
		
		//Access sum() from calculator
		Method sumMethod = myclass.getMethod("sum", int.class, int.class);
		System.out.println(sumMethod.invoke(myObj, 2,3)); //return 2+3
	}
}



--------------------------------------------------------------



JAVA-9
==================
	- Private methods inside interface
	- These methods can be static

package JDK9Features;

public interface SendNotifications 
{
	default void sendNotifications()
	{
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
	default void sendNotification()
	{
		establishConnection();
		System.out.println("Sending single notifications");
	}
	private static void establishConnection()
	{
		System.out.println("Establishing a connection");
	}
}


package JDK9Features;

public class SendNotificationImpl implements SendNotifications
{
	public static void main(String[] args) 
	{
		SendNotifications sendNotification = new SendNotificationImpl();
		sendNotification.sendNotification();
		sendNotification.sendNotifications();
		
		
	}
}



- Improved Try with resource block
----------------------------------------
	- Resources can be defined outside the resource block i.e. outside try(){}

package JDK9Features;

public class TryWithResource implements AutoCloseable 
{
	public TryWithResource() {
		System.out.println("Creating the resource");
	}
	
	public void doSomething()
	{
		System.out.println("Doing Something");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the resource");
	}
	
}

package JDK9Features;

public class TryWithResourceTest 
{
	public static void main(String[] args) 
	{
		TryWithResource t = new TryWithResource();
		
		try(t){
			t.doSomething();
		}catch (Exception e) 
		{
		}
	}
}



Immutable Collection
==============================
	- colelctions that can not be modified later on
	- It can not store null values
	- It can be a List/Set/Map/Queue

package JDK9Features;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class ImmutableClassEx 
{
	public static void main(String[] args) 
	{
		List<String> list = List.of("abc", "xyz" , "123");
		System.out.println(list);
//		list.add("HRH");
//		list.add(null);

//		Set<String> set = Set.of("abc", "xyz", "abc"); //cant add duplicate element
		Set<String> set = Set.of("abc", "XYZ", "123");
		System.out.println(set);
		
//		Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
//		Map.ofEntries(entries);
		
	}
}




StreamAPI new methods
----------------------------
takeWhile() , dropWhile() , ofNullable()

package JDK9Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamingAPI 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,20,3,70,52,25,null);
//		List<Integer> multipleOfFive = list.stream().filter((x)-> x%5 == 0).collect(Collectors.toList());
//		System.out.println(multipleOfFive);
		
		List<Integer> takewhile = list.stream().takeWhile((x)-> x%5==0).collect(Collectors.toList());
		System.out.println(takewhile); //takeWhile() will take the element till it matches the condition and stop checking there where the predicate returns false and return upto that of the list
		
		List<Integer> dropwhile = list.stream().dropWhile((x)-> x%5==0).collect(Collectors.toList());
		System.out.println(dropwhile); //dropWhile() skip the elements that matches the condition and will stop checking there where the predicate returns true and return rest of the list
		
		List<Integer> ofnullable = list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()); //Doesnt take null values and returns the list
		System.out.println(ofnullable);
	}
}

---------------------



JSHELL
-----------
	- it is a REPL tool
	- Read Evaluate Print Loop tool
	- Helpful with Without writing any java codes in a class we can find an output of a code.
	- Used for Checking purpose


C:\Users\HP>JShell
|  Welcome to JShell -- Version 12.0.1
|  For an introduction type: /help intro

jshell> /help intro
|
|                                   intro
|                                   =====
|
|  The jshell tool allows you to execute Java code, getting immediate results.
|  You can enter a Java definition (variable, method, class, etc), like:  int x = 8
|  or a Java expression, like:  x + x
|  or a Java statement or import.
|  These little chunks of Java code are called 'snippets'.
|
|  There are also the jshell tool commands that allow you to understand and
|  control what you are doing, like:  /list
|
|  For a list of commands: /help

jshell> /help
|  Type a Java language expression, statement, or declaration.
|  Or type one of the following commands:
|  /list [<name or id>|-all|-start]
|       list the source you have typed
|  /edit <name or id>
|       edit a source entry
|  /drop <name or id>
|       delete a source entry
|  /save [-all|-history|-start] <file>
|       Save snippet source to a file
|  /open <file>
|       open a file as source input
|  /vars [<name or id>|-all|-start]
|       list the declared variables and their values
|  /methods [<name or id>|-all|-start]
|       list the declared methods and their signatures
|  /types [<name or id>|-all|-start]
|       list the type declarations
|  /imports
|       list the imported items
|  /exit [<integer-expression-snippet>]
|       exit the jshell tool
|  /env [-class-path <path>] [-module-path <path>] [-add-modules <modules>] ...
|       view or change the evaluation context
|  /reset [-class-path <path>] [-module-path <path>] [-add-modules <modules>]...
|       reset the jshell tool
|  /reload [-restore] [-quiet] [-class-path <path>] [-module-path <path>]...
|       reset and replay relevant history -- current or previous (-restore)
|  /history [-all]
|       history of what you have typed
|  /help [<command>|<subject>]
|       get information about using the jshell tool
|  /set editor|start|feedback|mode|prompt|truncation|format ...
|       set configuration information
|  /? [<command>|<subject>]
|       get information about using the jshell tool
|  /!
|       rerun last snippet -- see /help rerun
|  /<id>
|       rerun snippets by ID or ID range -- see /help rerun
|  /-<n>
|       rerun n-th previous snippet -- see /help rerun
|
|  For more information type '/help' followed by the name of a
|  command or a subject.
|  For example '/help /list' or '/help intro'.
|
|  Subjects:
|
|  intro
|       an introduction to the jshell tool
|  keys
|       a description of readline-like input editing
|  id
|       a description of snippet IDs and how use them
|  shortcuts
|       a description of keystrokes for snippet and command completion,
|       information access, and automatic code generation
|  context
|       a description of the evaluation context options for /env /reload and /reset
|  rerun
|       a description of ways to re-evaluate previously entered snippets

jshell> 8+10
$1 ==> 18

jshell> int x=10,y=5;
x ==> 10
y ==> 5

jshell> +y
$4 ==> 5

jshell> x+y
$5 ==> 15

jshell> Math.sqrt(9)
$6 ==> 3.0

jshell> /imports
|    import java.io.*
|    import java.math.*
|    import java.net.*
|    import java.nio.file.*
|    import java.util.*
|    import java.util.concurrent.*
|    import java.util.function.*
|    import java.util.prefs.*
|    import java.util.regex.*
|    import java.util.stream.*

jshell> /exit
|  Goodbye

------------------------------

C:\Users\HP>JShell
|  Welcome to JShell -- Version 12.0.1
|  For an introduction type: /help intro

jshell> /list

jshell> int x=10,y=30
x ==> 10
y ==> 30

jshell> x+y
$3 ==> 40

jshell> Math.sqrt(9)
$4 ==> 3.0

jshell> /import
|    import java.io.*
|    import java.math.*
|    import java.net.*
|    import java.nio.file.*
|    import java.util.*
|    import java.util.concurrent.*
|    import java.util.function.*
|    import java.util.prefs.*
|    import java.util.regex.*
|    import java.util.stream.*

jshell> 8+10
$5 ==> 18

jshell> /list

   1 : int x=10,y=30;
   2 : int x=10,y=30;
   3 : x+y
   4 : Math.sqrt(9)
   5 : 8+10

jshell> ArrayList<String> list = new ArrayList<>()
list ==> []

jshell> list.add("abc")
$7 ==> true

jshell> list.add("xyz")
$8 ==> true

jshell> list.isEmpty()
$9 ==> false

jshell> if(list.isEmpty()) System.out.println("Empty");else System.out.println("Not Empty");
Not Empty

jshell> for(int i = 0; i <= 10; i++)
   ...> System.out.println(i)
0
1
2
3
4
5
6
7
8
9
10

jshell> /exit
|  Goodbye
-------------------------------




JAVA 10 Features
------------------------
	- var concept
	- Collectors API - Un-modifiable list and Set

var concept
--------------------
	- useful in Collections
	- wont accept null value
	- Only local members can be accepted for var, class variables will show an compilation error
	- Can be used inside lambda expressions but not as a target for it.


package JAVA10Features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarConcept 
{
	public static void main(String[] args) 
	{
		int x = 10;
		float f = 20.0f;
		String s = "ABF";
		
		var i = 10;
		var a = 20.0f;
		var l = "ABF";
		
		System.out.println(x);
		System.out.println(f);
		System.out.println(s);
		System.out.println(i);
		System.out.println(a);
		System.out.println(l);
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		var map1 = new HashMap<String, List<String>>(); //Both are equal
		
		for(Map.Entry<String, List<String>> entry:map.entrySet()) {}
		for(var entry:map.entrySet()) { //Both are equal
			var value = entry.getValue();
		}
		
		
	}
}



Collectors API update
--------------------------

package JAVA10Features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(15, 20, 27, 30);
		List<Integer> newList = list.stream().filter((i)-> i%3 ==0 ).collect(Collectors.toUnmodifiableList());

		//Collectors.toList() was able to add or modify new list further but this wont
//		newList.add(40);//UnsupportedOperationException //No compilation issue but run time exception 
		
		/*
		 * For List - Collectors.toUnmodifiableList()
		 * For Map - Collectors.toUnmodifiableMap()
		 * For Set - Collectors.toUnmodifiableSet()
		 */
		
		
	}
}

------------------------



JAVA 11 Features
===========================
	- String Updates
		- isBlank() - return if the string is blank
		- lines() - split wherever there is a new line escape sequence i.e. \n
		- strip() - 
		- repeat(int count) - will repeat a particular string no of times


package JAVA11Features;

import java.util.stream.Collectors;

public class StringUpdates 
{
	public static void main(String[] args) 
	{
		String s = "                           ";
		System.out.println(s);
		System.out.println(s.isBlank()); //true
		s = "Hello\n I \n am \n debi";
		System.out.println(s);
		System.out.println(s.lines().collect(Collectors.toList()));
		
		s = "Debi is nice";
		System.out.println(s);
		char c = '\u2000';
		s = s+c;
		System.out.println(s);
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
		
		System.out.println("-".repeat(20));
	}
}

Output ---->
                           
true
Hello
 I 
 am 
 debi
[Hello,  I ,  am ,  debi]
Debi is nice
Debi is nice?
Debi is nice
Debi is nice?
Debi is nice
--------------------



	- Files Updates
----------------------------------
package JAVA11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdate 
{
	public static void main(String[] args) throws IOException 
	{
		Path path = Files.writeString(Files.createTempFile("text", ".txt"), "Java 11 id cool");
		System.out.println(path);
		String str = Files.readString(path);
		System.out.println(str);
		
	}
}
/*
 * C:\Users\HP\AppData\Local\Temp\text528861596508664644.txt
Java 11 id cool
*/



	- isEmpty() on Optional class
	-------------------------------------
package JAVA11Features;

import java.util.Optional;

public class OptionalUpdate 
{
	public static void main(String[] args) 
	{
		Optional<String> str = Optional.empty(); //Create a empty optional string
//		if(str.isPresent()) {
//		}else { }
		//To replace this
		System.out.println(str.isEmpty()); //true
		Optional<String> str1 = Optional.of("test");
		System.out.println(str1.isEmpty()); //false
	}
}



Connect on LinkedIn:

https://www.linkedin.com/in/thippireddybharath/

Subscribe to my YouTube Channel:

https://www.youtube.com/user/thippireddybharath

Follow my adventures and course updates on Instagram:

https://www.instagram.com/bharaththippireddy/

Like and connect on my facebook page:

https://www.facebook.com/Bharath-Thippireddy-Net-114548718634098/


Maximum Discounts on my Other TOP Courses:

Spring Boot Fundamentals:

https://www.udemy.com/springbootfundamentals/?couponCode=YOUARETHECREATOR

Angular 6 Crash Course(HOT and NEW):

https://www.udemy.com/angular-6-crash-course/?couponCode=YOUARETHECREATOR

TypeScript for Beginners

https://www.udemy.com/typescript-for-beginners/?couponCode=YOUARETHECREATOR

End To End Java Project Development Using Spring Boot:

https://www.udemy.com/end-to-end-java-project-development-using-spring-boot/?couponCode=YOUARETHECREATOR

Java Design Patterns:

https://www.udemy.com/java-design-patterns/?couponCode=YOUARETHECREATOR

Java Web Services:

https://www.udemy.com/java-web-services/?couponCode=YOUARETHECREATOR

Java Web Services Part 2:

https://www.udemy.com/javawebservicespart2/?couponCode=YOUARETHECREATOR

Spring Data REST:

https://www.udemy.com/microservices-rest-apis-using-spring-data-rest/?couponCode=YOUARETHECREATOR

Spring Framework in easy steps:

https://www.udemy.com/springframeworkineasysteps/?couponCode=YOUARETHECREATOR

Spring Data JPA Using Hibernate:

https://www.udemy.com/spring-data-jpa-using-hibernate/?couponCode=YOUARETHECREATOR

JDBC Servlets and JSP:

https://www.udemy.com/jdbcservletsandjsp/?couponCode=YOUARETHECREATOR

Junit and Mockito Crash Course:

https://www.udemy.com/junitandmockitocrashcourse/?couponCode=YOUARETHECREATOR

Core Java Made Easy:

https://www.udemy.com/corejavamadeeasy/?couponCode=YOUARETHECREATOR

XML and XML Schema Definition:

https://www.udemy.com/xml-and-xml-schema-definition-in-easy-steps/?couponCode=YOUARETHECREATOR

XSLT XPATH and XQUERY:

https://www.udemy.com/xslt-xpath-and-xquery-fundamentals/?couponCode=YOUARETHECREATOR

Maven Crash Course:

https://www.udemy.com/mavencrashcourse/?couponCode=YOUARETHECREATOR

Java Script Fundamentals: (FREE)

https://www.udemy.com/javascriptfundamentals

Advanced and Object Oriented JavaScript and ES6 (FREE)

https://www.udemy.com/advanced-and-object-oriented-javascript

Python Core and Advanced: (FREE)

https://www.udemy.com/python-core-and-advanced/







Maven And JUnit
==========================

Maven
----------
	- It looks for Convention over Configuration
	- used in web projects
	- Plugin based architecture
	- config file here is pom.xml

JUnit Framework
----------------------
	- Easy to use API to write tests
	- Diff ways to assert the results
	- Run and report out the results

	- In JUnit3 all test classes Should extend junit.framework.TestCase class
	- In JUnit4 it uses Annotations
			@Test - used before test methods
			@Before - used to mark set up methods
			@After - the methods mark with this will run after every test method
			@BeforeClass - the method will run for once for entire test class
			@Ignore - te methods will be ignored from test class
	
	- provides static methods from Assert Class i.e. in import static org.junit.Assert.*;
	- methods are
		assertNull() - take an object, if object is null, assertion will fail as well as our test also fail
		assertEquals() - checks values for two objects
		assertSame() - checks references of two objects
			... etc

	- JUnit provides a BlovkJunit4ClassRunner.class, which takes test classes as arguments which will scan through test class for the annotations , run all the setup,cleanup,test methods and will report out the result of pass or fail.
	- It is used in CommandLine
	
1. Create a new Maven project
2. Run as Maven Install
3. Added latest JUnit Version as dependecy in pom.xml file
4. Codes written in App.java and AppTest.java and AppTest.java is run for Testing purpose


package com.devi.maven.mavendemo;

/**
 * Hello world!
 *
 */
public class App 
{
	public String hello(String name)
	{
		return "Hello "+name;//null;//"Hello "+name;
	}
//    public static void main( String[] args ) //Not needed
//    {
//        System.out.println( "Hello World!" );
//    }
}

package com.devi.maven.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest    
{
	@Test
    public void givenANameWhenHelloIsCalledThenReturnHelloName()
    {
    	App app = new App();
    	String result = app.hello("Debi");
    	Assert.assertNotNull(result);
    	Assert.assertEquals("Hello Debi", result); //(expected , returned_value)
    	
    	
    }
}
//If its green Test is pass, if its red, Test is fail
//Will fail for return of null value in App.java


<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.devi.maven</groupId>
  <artifactId>mavendemo</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>mavendemo</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
<!-- 
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>  -->
  
  <!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependencies>
	  <dependency>
    	<groupId>junit</groupId>
    	<artifactId>junit</artifactId>
    	<version>4.12</version>
    	<scope>test</scope>
	  </dependency>
    </dependencies>
</project>


----------------------------------------------------------
















Lambda Expression.java
=========================================
// Moreover Lambda expresson is replacement of Anonymous Class in Java
interface A
{
	void show();
}
interface B //extends A
{
	// void show();
	void multiply(int a , int b);
}
class Test 
{
	// public void show()
	// {
	// 	System.out.println("show() in Test");
	// }
	public static void main(String[] args) 
	{
		// A a = new A(){
		// 	public void show()
		// 	{
		// 		System.out.println("show in Test$1");
		// 	}
		// };
		// a.show();
		// new Test().show();
		A x = () -> System.out.println("show using Lambda");
		x.show();

		
		B mul = (a , b) -> System.out.println(a*b); 
		mul.multiply(10 , 20);
	}
}




























