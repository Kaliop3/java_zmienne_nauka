package pl.klaudialason.programy_JAVA.method;

public class Method {
    public static void main(String[] args) {
        sayHi();
        hi();
        hi("Karol");
        hi("Maciek", "Mateusz", "Jakub");

        System.out.println(addition(9, addition(4, 5, 6)));

        System.out.println(checkBy3(8));

        System.out.println(factorial(8));

        System.out.println(firstNumber(41043));
    }

    private static void sayHi() {
        System.out.println("Hi Klaudia");
    }

//    private static void hi(String name) {
//        System.out.println("Hi " + name);
//    }
//
//    private static void hi(String name, String name2) {
//        System.out.println("Hi " + name + ", " + name2);
//}

    private static void hi(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi " + result);
    }

    private static int addition(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    private static boolean checkBy3(int a) {
        return a % 3 == 0;
    }

//    private static void foo(){
//        System.out.println("foo"); //REKUTENCJA
//        foo();
//    }

    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    //--------------------TASK-------------------//
    private static String firstNumber(int num) {
        int result = 0;
        for (int i = num; i > 1; i--) {
            if (num % i == 0) {
                result += 1;
            }

        }
        if (result > 1) {
            return "Liczba nie jest pierwsza";
        } else {
            return "Liczba jest pierwsza";
        }
    }
}

