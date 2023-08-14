//---Rectangular pattern---//
//  public class PatternProblems{
//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
//             for(int j=1;j<=6;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }

//---HOLLOW SQUARE---//
// public class PatternProblems{
//     public static void main(String[] args) {
//         for(int i=0;i<=2;i++){
//             for(int j=0;j<=2;j++){
//                 if(i==0 || j==0 ||i==2 || j==2){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//          }
//          System.out.println();
//      }
//  }
// }

//---HOLLOW RECTANGULAR PATTERN---//
// public class PatternProblems{
//     public static void main(String[] args) {
//         for(int i=0;i<=3;i++){
//             for(int j=0;j<=5;j++){
//                 if(i==0 || j==0 || i==3 || j==5 ){
//                     System.out.print("*"+" ");
//                 }else
//                     System.out.print ("  ");
        
//             }
//             System.out.println();
//         }
//     }
// }  

//---TRIANGULAR PATTERN---//
// public class PatternProblems{
//     public static void main(String[] args) {
//         for(int i=0;i<=3;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//----REVERSE TRIANGULAR PATTERN---//
// public class PatternProblems{
//     public static void main(String[] args) {
//         for(int i=3;i>=0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//---PYRAMID PRINTING---//
// import java.util.*;
// public class PatternProblems{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r= sc.nextInt();

//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=r-i;j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=2*i-1;k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }   
// }
// }

//---NUMERICAL RECTANGULAR PATTERN---//
// import java.util.*;
// public class PatternProblems{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int r=sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=i;j<=r;j++){
//                 System.out.print(j);
//             }
//             for(int k=1;k<=i-1;k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//         }
//     }

//---PRINT THE PATTERN GIVEN BELOW---//
    // 121212
    // 212121
    // 121212
    // 212121

// import java.util.*;
// public class PatternProblems{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int r=sc.nextInt();
//         System.out.println("Enter number of columms");
//         int c=sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if((i+j) % 2==0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(2);
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

//---PRINT THE PATTERN---//
        //       1
        //      121
        //     12321
        //    1234321

/* import java.util.*;
public class PatternProblems{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
               System.out.print(l); 
            }
            System.out.println( );
        }
    }
}*/

///---TRY THIS---///
        //     1
        //    2 2
        //   3   3
        //  4444444 
import java.util.*;
public class PatternProblems{   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        for(int i=0;i<r-1;i++){
            for(int j=0;j<2*r-1;j++){
                if(i==1|| i==r || j==1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }}     