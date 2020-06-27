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