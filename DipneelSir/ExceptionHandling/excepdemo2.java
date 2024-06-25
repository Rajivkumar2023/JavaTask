// class excepdemo2 {
//     public static void main(String[] args) {
//         try{
//             int a = 4, b= 0, c;
//             c = a/b;
//             System.err.println("c = " +c);
//         }
//         catch(Exception obj){
//             System.out.println(obj.toString()); // for error print
//             return;
//                 System.err.println("End of program.");
//         }
//     }
// }

// class excepdemo2
// {
// 	public static void main(String args[])
// 	{
// 		try
// 		{
// 			int val = 0;
// 			val = Integer.parseInt(args[0]);
// 			System.out.println("No exception raised.");
// 		}
// 		catch(NumberFormatException ne)
// 		{
// 			System.out.println("Exception is catched.");
// 		}
// 		finally
// 		{
// 			System.out.println("Executing finally block rrrrrrr.");
// 		}
// 	}
// }

////////

public class excepdemo2 {

    public static void main(String[] args) {
        try{
            int val=0;
            val=Integer.parseInt(args[0]);
            System.out.println("No Exception raised" +val);
        }catch(NumberFormatException ne){
            System.out.println("Exception is catched.");
        }
        finally{
            System.out.println("Exception finnaly block.");
        }
}
}
