//multithereading

// class threaddemo extends Thread {
//     public static void main(String[] args) {
//         threaddemo th1 = new threaddemo();
//         threaddemo th2 = new threaddemo();
//         th1.start();
//         th2.start();

//         System.err.println("Code runnig outside thread. ");

//     }
//     public void run()
//     {
//         System.out.println("code runnig in thread. ");
//     }
// }

// Multithreading
 
class threaddemo extends Thread

{

	public static void main(String args[])

	{

		threaddemo th1 = new threaddemo();

		threaddemo th2 = new threaddemo();

		th1.start();

		th2.start();

		System.out.println("Code running outside thread.");

	}

	public void run()

	{

		System.out.println("Code running in a thread.");

	}

}