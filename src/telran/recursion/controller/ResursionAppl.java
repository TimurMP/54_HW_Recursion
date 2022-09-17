package telran.recursion.controller;

public class ResursionAppl {

    public static void main(String[] args) {
        int cgd = cgd(40, 50);
        System.out.println("CDG is: " + cgd);
        System.out.println("Sqrt: " + sqrt(35, 0.0001));
        print100();


    }

    public static int cgd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return cgd(b, a % b);
    }


    public static void print100(){
        int from = 0;
        int to = 100;
        System.out.println(from);
        print100();


    }




    public static double sqrt(double x, double precision){

        double b = x;
        double h = 0;
        b = (h + b) / 2;
        h = x / b;
        if (b - h <= precision){
            return b;
        }else {
            System.out.println(b);
            return sqrt(b, precision);

        }
//        boolean prec = String.valueOf(x).replaceAll(".*\\.", "").length() == precision;
    }

//    public static int cgd (int a, int b){
//        ArrayList<Integer> resA = new ArrayList<>();
//        ArrayList<Integer> resB = new ArrayList<>();
//
//
//        int dividerA = 2;
//        int dividerB = 2;
//        int resultA = 1;
//        int resultB = 1;
//        while (a!=1){
//            if (a%dividerA==0){
//                a/=dividerA;
//                resA.add(dividerA);
//                System.out.println(a);
//
//            }else {
//                dividerA+=1;
//            }
//        }
//        System.out.println("Finish A");
//        while (b!=1){
//            if (b%dividerB==0){
//                b/=dividerB;
//                resB.add(dividerB);
//                System.out.println(b);
//
//            }else {
//            dividerB+=1;
//        }
//        }
//        resA.retainAll(resB);
//        Set<Integer> resSet = new HashSet<Integer>(resA);
//        for (Integer integer : resSet) {
//            resultA*=integer;
//        }
//
//        return resultA;
//    }
}
