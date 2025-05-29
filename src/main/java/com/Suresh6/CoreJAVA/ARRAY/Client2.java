package com.Suresh6.CoreJAVA.ARRAY;

public class Client2 {
    public static void main(String[] args) {
        int[] A= {1,2,3,4};
        int B=7;
        System.out.println(checkSumExist(A, B));
        int[] A1= {1,2,4};
        int B1=4;
        System.out.println(checkSumExist(A1, B1));
        System.out.println("============================");
        int[] A2={1,2,3,4};
        int B2=2;
        int C2=3;
        int[] result =reverseGivenIntegersInArray(A2, B2, C2);
        System.out.println();
        System.out.println("The result Array is:");
        for (int e: result){
            System.out.print(e + " ");

        }
    }
    static int checkSumExist(int[] A, int B){
        for(int i=0; i < A.length-1; i++){
            for (int j=i; j<A.length-1; j++){
                if(B==(A[i] + A[j+1])){
                    return 1;
                }
            }
        }
        return 0;
    }
    //
    /*
Example Input 1:
A = [1, 2, 3, 4]
B = 2
C = 3

Output 1:
[1, 2, 4, 3]


     */

    static  int[] reverseGivenIntegersInArray(int[] A, int B, int C){
        System.out.println("Original Array is:");
        for(int e : A){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.print(A[B] +" " + A[C]);
        System.out.println();
        int temp= A[B];
        A[B] = A[C];
        A[C] = temp;
        for(int e: A){
            System.out.print(e + " ");
        }

        return A;
    }

    /*
    Input 1:
A = [1, 2, 3, 4]
B = 2
Return the array A after rotating it B times to the right
Output 1:
A= [3, 4, 1, 2]
     */

    static int[] rotateArrayClockwise(int[] A, int B){

        int[] resutArray = new int[A.length];
       /* for(int i=0; i < A.length; i++){
            if(A[i])
        }*/

        return resutArray;
    }
}
