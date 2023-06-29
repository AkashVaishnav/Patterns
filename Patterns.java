import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of Rows : ");
        // int m = sc.nextInt();
        // System.out.print("Enter the no.of Columns :");
        // int n = sc.nextInt();

        // *****
        // *****
        // *****
        // *****
        // *****
        // int n=5,m=5;
        // for (int i=1; i<=m; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // * * * * *
        //  * * * * *
        // * * * * *
        //  * * * * *


    // int n=5;
    
    // for(int i=1;i<=n-1;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i%2==0){
    //             System.out.print(" *");
    //         }else{
    //         System.out.print("* ");
    //         }
    //     }
    //     System.out.println();
    // }


        //Hollow Rectangle
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        // int n = 4;
        // int m = 5;

        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i == 1 || j==1 || i == n || j == m){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Half Pyramid

            // *
            // * *
            // * * *
            // * * * *
            // int n = 4;

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

        // Inverted Half Pyramid

            // * * * *
            // * * * 
            // * * 
            // *
            // int n=4;

            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            //       * 
            //     * *
            //   * * *
            // * * * *
                // int n = 4;
            
            //     for(int i=1;i<=n;i++){
            //         //spaces 
            //         for(int j=1;j<=n-i;j++){
            //             System.out.print("  ");
            //         }
            //         for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // 1 
            // 2 2
            // 3 3 3
            // 4 4 4 4
            // 5 5 5 5 5
            // int n=5;

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }

            // 1 
            // 1 2
            // 1 2 3
            // 1 2 3 4
            // 1 2 3 4 5
            // int n=5;

            // for(int i=1;i<=n;i++){
            //         for(int j=1;j<=i;j++){
            //             System.out.print(j+" ");
            //         }
            //         System.out.println();
            //     }

            // 1 1 1 1 1 
            // 2 2 2 2
            // 3 3 3
            // 4 4
            // 5
            // int n=5;

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }
            
            // 1 2 3 4 5 
            // 1 2 3 4
            // 1 2 3
            // 1 2
            // 1
            // int n=5;

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

            // Floyd's Tringle

            // 1 
            // 2 3
            // 4 5 6
            // 7 8 9 10
            // 11 12 13 14 15

            // int n = 5;
            // int k=1;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(k+" ");
            //         k++;
            //     }
            //     System.out.println();
            // }

            // 1 
            // 0 0
            // 1 1 1
            // 0 0 0 0
            // 1 1 1 1 1
            // int n = 5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         if(i%2==0){
            //             System.out.print("0 ");
            //         }else{
            //             System.out.print("1 ");
            //         }
            //     }
            //     System.out.println();
            // }


            // 0 
            // 1 0
            // 0 1 0
            // 1 0 1 0
            // 0 1 0 1 0
            // int n = 5;
            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=i;j++){
            //         if((i+j)%2==0){
            //             System.out.print("0 ");
            //         }else{
            //             System.out.print("1 ");
            //         }
            //     }
            //     System.out.println();
            // }

            
            // 1 
            // 0 1 
            // 1 0 1
            // 0 1 0 1
            // 1 0 1 0 1

            // int n = 5;
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the no.of rows :");
            // int n = sc.nextInt();
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         if((i+j)%2==0){
            //             System.out.print("1 ");
            //         }
            //         else{
            //             System.out.print("0 ");
            //         }
            //     }
            //     System.out.println();
            // }

            // *             * 
            // * *         * *
            // * * *     * * *
            // * * * * * * * *
            // * * * * * * * *
            // * * *     * * *
            // * *         * *
            // *             *

            // int n = 4;

            // // upper part
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     for(int j=1;j<=2*(n-i);j++){
            //         System.out.print("  ");
            //     }
            //     //2nd part
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // // lower part

            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     for(int j=1;j<=2*(n-i);j++){
            //         System.out.print("  ");
            //     }
            //     //2nd part
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            
            //         * * * * * 
            //       * * * * *
            //     * * * * *
            //   * * * * *
            // * * * * *
            // int n=5;

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=(n-i);j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=1;j<=n;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

        //      1 
        //     1 2
        //    1 2 3 
        //   1 2 3 4 
        //  1 2 3 4 5
            // int n = 5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }


        //      1
        //     212
        //    32123
        //   4321234
        //  543212345
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=i;j>=2;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        // int n=5;

        // upper part
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i)-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // lower part
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // 12345
        // 12345
        // 12345
        // 12345
        // 12345

        // char n=5;

        // for(char i=1;i<=n;i++){
        //     for(char j=1;j<=n;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // ABCDE
        // ABCDE
        // ABCDE
        // ABCDE
        // ABCDE
        // char n='E';

        // for(char i='A';i<=n;i++){
        //     for(char j='A';j<=n;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 54321
        // 54321
        // 54321
        // 54321
        // 54321

        // int n=5;

        // for(int i=n;i>=1;i--){
        //     for(int j=n;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // A
        // AB
        // ABC
        // ABCD
        // ABCDE

        // char n='E';

        // for(char i='A';i<=n;i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 12345
        // 1234
        // 123
        // 12
        // 1
        // int n=5;

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=5;j>=i;j--){
        //         if()
        //     }
        // }


        // int n=5;

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){  
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 1 
        // 1 2 
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2 
        // 1

        // int n=5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // int n=5,m=4;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // * * * * *  * * * * *
        // * * * *      * * * *
        // * * *          * * *
        // * *              * *
        // *                  *
        // *                  *
        // * *              * *
        // * * *          * * *
        // * * * *      * * * *
        // * * * * *  * * * * *

        // int n=5;

        // // upper part 
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // lower part 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // *                          *
        // * *                      * *
        // * * *                  * * *
        // * * * *              * * * *
        // * * * * *          * * * * *
        // * * * * * *      * * * * * *
        // * * * * * * *  * * * * * * *
        // * * * * * * *  * * * * * * *
        // * * * * * *      * * * * * *
        // * * * * *          * * * * *
        // * * * *              * * * *
        // * * *                  * * *
        // * *                      * *
        // *                          *
        

        // int n=7;

        // // upper part
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // lower part
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // 1 
        // 8 2
        // 14 9 3
        // 19 15 10 4
        // 23 20 16 11 5
        // 26 24 21 17 12 6
        // 28 27 25 22 18 13 7

        // int p, m = 1,n=7;
 
        // for (int i = 1; i <= n; i++) {
        //     p = m;
        //      for (int j = 1; j <= i; j++) {
        //         System.out.print(p + " ");
        //         p = p - (n - i + j);
        //     }
        //     System.out.println();
        //     m = m + 1 + (n - i);
        // }

        // * * * * * 
        //  * * * * * 
        //   * * * * * 
        //     * * * * * 
        //       * * * * * 
        // int n=5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


    //      * 
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
        // int n=5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


    
//    * * * * * 
//     * * * *
//      * * *
//       * *
//        *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *

        // int n=5;

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    //      **
    //     *  *
    //    *    *
    //   *      *
        // int n=4;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=1;j++){
        //         System.out.print(" *");
        //     }
        //     for(int j=1;j<((2*i)-1);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=1;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        //     System.out.print("* ");
        // }

        // int n=5;
        // for(int i=0; i<=n; i++){   
        //     for(int j=n; j>=i; j--){
        //         System.out.print(" ");
        //     }
        // int num=1;
        //     for(int j=0; j<=i; j++){
        //         System.out.print(num+ " ");
        //         num = num*(i-j)/(j+1);
        //     }
        //     System.out.print("\n");
        // }

//           1 

//         1 2 3
  
//       1 2 3 4 5
  
//     1 2 3 4 5 6 7
  
//   1 2 3 4 5 6 7 8 9
  
//     1 2 3 4 5 6 7
  
//       1 2 3 4 5
  
//         1 2 3
  
//           1

        // int n=9;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if((i%2)==1){
        //             System.out.print(j+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if((i%2)==1){
        //             System.out.print(j+" ");
        //         }
        //     }
        //     System.out.println();
        // }

//           A 

//         A B C
  
//       A B C D E
  
//     A B C D E F G
  
//   A B C D E F G H I
//   A B C D E F G H I
  
//     A B C D E F G
  
//       A B C D E
  
//         A B C
  
//           A

//         char n='I';
//         for(char i='A';i<=n;i++){
//             for(char j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(char j='A';j<=i;j++){
//                 if((i%2)==1){
//                     System.out.print(j+" ");
//                 }
//             }
//             System.out.println();
//         }

//         for(char i=n;i>='A';i--){
//             for(char j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(char j='A';j<=i;j++){
//                 if((i%2)==1){
//                     System.out.print(j+" ");
//                 }
//             }
//             System.out.println();
//         }


        // 4 
        // 3 3
        // 2 2 2
        // 1 1 1 1

        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int min = i > j ? i : j;
        //         System.out.print(n-min+1+" ");
        //     }
        //     System.out.println();
        // }

        // 4 4 4 4 
        // 4 3 3 3
        // 4 3 2 2
        // 4 3 2 1

        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         int min = i < j ? i : j;
        //         System.out.print(n-min+1+" ");
        //     }
        //     System.out.println();
        // }


    //      A
    //     AB
    //    ABC
    //   ABCD
        // char n='D';
        //     int m=4;
        // for(char i='A';i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     // for(int j=1;j<=m;j++){
        //     //     System.out.print(j);
        //     // }
        //     System.out.println();
        // }


    // \*******/
    // *\*****/*
    // **\***/**
    // ***\*/***
    // ****/****
    // ***/*\***
    // **/***\**
    // */*****\*
    // /*******\
    // int n=9;
    // for (int i = 1; i <= n; i++){
    //     for (int j = 1; j <= n; j++){
    //         if (i == j || i + j == (n + 1)) {
    //             if (i + j == (n + 1)) {
    //                 System.out.print("/");
    //             }
    //             else {
    //                 System.out.print("\\");
    //             }
    //         }
    //             else{
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();
    //         }

    // 7 6 5 4 3 2 1 0 
    // 6 5 4 3 2 1 0   
    // 5 4 3 2 1 0     
    // 4 3 2 1 0       
    // 3 2 1 0         
    // 2 1 0           
    // 1 0             
    // 0


    // int i,j,k, n=8;

    // for(i=1;i<=8;i++){
    //     k=n-i;
    //     for(j=1;j<=8;j++){
    //         if(j<=(n+1)-i){
    //             System.out.print(k+" ");
    //             k--;
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


        // 0
        // 1
        // 2
        // Three
        // 4
        // Five
        // Six
        // 7
        // 8
        // Nine
        // Ten
        // 11
        // Twelve
        // 13
        // 14
        // Fifteen


        // int n=15;

        // for(int i=0;i<=n;i++){
        //     if(i==3)
        //         System.out.println("Three");
        //     else if(i==5)
        //         System.out.println("Five");
        //     else if(i==6)
        //         System.out.println("Six");
        //     else if(i==9)
        //         System.out.println("Nine");
        //     else if(i==10)
        //         System.out.println("Ten");
        //     else if(i==12)
        //         System.out.println("Twelve");
        //     else if(i==15)
        //         System.out.println("Fifteen");
        //     else{
        //         System.out.println(i);
        //     }
        // }

        // int n=4;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j>=(n+1)-i)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


    // \*******/
    // *\*****/*
    // **\***/**
    // ***\*/***
    // ****/****
    // ***/*\***
    // **/***\**
    // */*****\*
    // /*******\

        // int n=9;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         // if(i==j || i+j==n+1){
        //             if(i+j==n+1){
        //                 System.out.print("/");
        //                 }
        //             else if(i==j){
        //                 System.out.print("\\");
        //             }
        //         // }
        //             else{
        //                 System.out.print("*");
        //             }
        //     }
        //     System.out.println();
        // }

        // *******
        //  *     
        //   *    
        //    *   
        //     *  
        //      * 
        // *******
        // int n=7;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j || i==1 || i==n ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // *******
        //      *
        //     *
        //    *
        //   *
        //  *
        // *******

        // int n=7;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j==n+1 || i==1 || i==n ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // char k = 'A';

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(k);
        //         k++;
        //     }
        //     System.out.println();
        // }
            
        // int n=5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=i;j>=2;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n=7;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     int k=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(k+" ");
        //         k = k*(i-j)/j;
        //     }
        //     System.out.println();
        // }
    }
}