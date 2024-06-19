
 //*  *  *  *  * 
 //*  *  *  *  *
 //*  *  *  *  *
 //*  *  *  *  *

// public class StarPattern {
//     public static void main(String[] args){
//         ////first method 
//         // for (int i = 1; i<=4; i++){
//         //     System.out.print(" * ");
//         //     System.out.print(" * ");
//         //     System.out.print(" * ");
//         //     System.out.print(" * ");
//         //     System.out.println( " * ");
//         // }


//         ///second method using nested loopps
//         ////Nested looop using....
//         ///outer loop
//         for( int i = 1; i<=4; i++){
//                 ////innner looop
//             for(int j= 1; j<=5; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
       
//     }
// }


/////Questions:- print  Hollow rectangle below .
//*****
//*   *
//*   *
//*****
// public class StarPattern{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;
//        for ( int i = 1; i<=n; i++){
//         for(int j = 1; j<=m; j++){
//             if(i == 1 || j == 1 || i == n || j == m){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
            
//         }
//         System.out.println();
//        }
//     }
// }


/////Q3.  print Half Pyramidn like below.
//*
//**
//***
//****
// public class StarPattern{
//     public static void main(String[] args){
//         int n = 4;
//         for ( int i = 1; i<=n; i++){
//             for( int j=1; j<=i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

//////Q4. Print the below pattern;
//****
//***
//**
//*
///Ans:- 
// class StarPattern {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = n; i>=1; i--){
//             for (int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }   
// }


//////Q5. Print the pattern inverted Half pyramid(rotated by 180 deg)
