package _00_tasks;

import java.util.Scanner;

public class C03_factorialPermutationCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n, r;
        while (true) {
            try {
                System.out.print("Combination of n and r = C(n,r)\nPermutation of n and r = P(n,r)\nn : ");
                n = scan.nextInt();
                if(n>23) {
                    System.out.println("Number is too big to calculate");
                    continue;
                }
                System.out.print("Combination of n and r = C(n,r)\nPermutation of n and r = P(n,r)\nr : ");
                r = scan.nextInt();
                if (r<0) System.out.println("Please enter a positive number");
                if (r > n) System.out.println("The value of r cannot be greater than the value of n.");
                if (r>23) {
                    System.out.println("Number is too big to calculate");
                }
                else break;
            } catch (Exception e) {
                System.out.println("Please enter a positive number.");
                scan.nextLine();
            }
        }
        System.out.println("Factorial of n = n! = " + factorial(n));
        System.out.println("Factorial of r = r! = " + factorial(r));
        System.out.println("Combination of n and r = C(n,r) = " + combination(n, r));
        System.out.println("Permutation of n and r = P(n,r) = " + permutation(n, r));
    }


    private static long factorial(long num) {
        if (num <= 0) return 1;
        return num * factorial(num - 1);
    }

    public static long combination(long n, long r) {
        if (r > 0) {
            return (factorial(n) / (factorial(n - r) * factorial(r)));
        } else {
            return 1;
        }
    }

    public static long permutation(long n, long r) {
        if (r > 0) {
            return (factorial(n) / factorial(n - r));
        } else  {
            return 1;
        }
    }
}

