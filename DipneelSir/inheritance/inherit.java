// //package inheritance;

// public class test {
//     int num1, num2;

//     int addnum(){
//         int sum 
//         sum = num1 + num2;
//         return sum;
//     }
// }

// class sub extends add{
//     int subnum(){
//         int sub;
//         sub = num1 - num2;
//         return sub;
//     }
// }
// class inherit{
//     public static void main(String[] args) {
//         int a,s;
//         sub subobj = new sub();
//         subobj.num1 = 10;
//         subobj.num2 = 4;
//         a = subobj.addnum();
//         s = subobj.subnum();

//         System.out.println("num1 = " + subobj.num1);
//         System.out.println("num2 = " + subobj.num2);

//         System.out.println("sum = " +a);
//         System.out.println("substraction= " +b);
//     }
// }





class add
{
  int num1, num2;
  int addnum()
  {
    int sum;
	sum = num1 + num2;
	return sum;
  }
}
 
class sub extends add
{
	int subnum()
	{
		int sub;
		sub = num1 - num2;
		return sub;
	}
}
 
class inherit
{
	public static void main(String args[])
	{
		int a,s;
		sub subobj = new sub();
		subobj.num1 = 10;
		subobj.num2 = 4;
		a = subobj.addnum();
		s = subobj.subnum();
		System.out.println("num1 = " + subobj.num1);
		System.out.println("num2 = " + subobj.num2);
		System.out.println("Sum = " +a);
		System.out.println("Subtraction = " +s);
	}
}