package telran.recursion.controller;

import java.util.HashSet;
import java.util.Set;

public class ResursionAppl {

    public static void main(String[] args) {
        System.out.println(40%2);
        int cgd = cgd(222, 333);
        System.out.println("CDG is: " + cgd);


    }

    public static int cgd (int a, int b){
        Set<Integer> resA = new HashSet<Integer>();
        Set<Integer> resB = new HashSet<Integer>();


        int dividerA = 2;
        int dividerB = 2;
        int resultA = 1;
        int resultB = 1;
        while (a!=1){
            if (a%dividerA==0){
                a/=dividerA;
                resA.add(dividerA);
                System.out.println(a);

            }else {
                dividerA+=1;
            }
        }
        System.out.println("Finish A");
        while (b!=1){
            if (b%dividerB==0){
                b/=dividerB;
                resB.add(dividerB);
                System.out.println(b);

            }else {
            dividerB+=1;
        }
        }
        resA.retainAll(resB);

        for (Integer integer : resA) {
            resultA*=integer;

        }

        return resultA;
    }
}
