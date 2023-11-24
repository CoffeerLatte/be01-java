package day04_homework;


import java.util.Scanner;


public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int i=0,j=1; i<2*n; i++) {
            for(int k=0; k<2*n; k++) {
                System.out.print(k>=j && k<2*n-j?" ":"*");
                
                
                
            }
            if(i<n-1)
                j++;
            else
                j--;

            System.out.println();
        }
        sc.close();
    }
}
