package pl.klaudialason.programy_JAVA.loops;

public class loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.println("nr# " + i);// ctrl+f2 stop program
        }

//        for (; ; ) {
//            System.out.println("p");
//        }

        int l = 20;
        for (; l > 10; l--) {
            System.out.println(l);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.println(j + ", ");
            }
            System.out.println("");
        }

        int[] ints = {4, 3, 65, 123, 2, 90, 15};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        //---------------------Foreach-----------------//
        System.out.println("");
        for (int i : ints) {
            System.out.println(i * 2);
        }
        //------------------while---------------------//

        System.out.println("");
        int z = 200;
        while (z % 3 != 0) {
            z--;
            System.out.println(z);
        }
        //------------------do while---------------------//
        System.out.println("");

        do {
            System.out.println(false);
        }
        while (false);
        //------------------labels---------- pure read code -----

        LABEL:
        for (int i = 0; i < 10; i++) {

            System.out.println("i= " + i);
            for (int j = 0; j < 100; j++) {
                System.out.println("j= " + j);
                //continue LABEL;
                break LABEL;
            }
        }
        System.out.println("");
        //-----------------task----------------------

        int[] taskInts = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int f : taskInts) {
            System.out.print(f + " ");
            sum = f + f;
        }
        System.out.println("\n" + sum);

    }
}

