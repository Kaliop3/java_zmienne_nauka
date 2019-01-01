package pl.klaudialason.programy_JAVA.conditionalstatements;

public class coditionalStatements {
    public static void main(String[] args) {

        int[] ints = {2, 3, 5, 1, 4, 6};

        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println("%2 = " + i);
            } else if (i % 3 == 0) {
                System.out.println("%3 = " + i);
            }
            /*else if (i % 4 == 0) {
                System.out.println("%4 = " + i); Never make it
            }*/
            else {
                System.out.println("nothing");
            }

        }
        for (int i : ints) {
            if ((i % 2 == 0 && i % 3 == 0) || i % 5 == 0) {
                System.out.println("a");
            }
        }

        for (int i : ints) {
            if (i < 3) {
                System.out.println("i<3 " + i);
            } else {
                System.out.println("i>3 " + i);
            }
        }
        //----------------switch case--(can use String)-------------------//

        int menu = 2;
        switch (menu) {
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("end menu");
                break;
            default:
                System.out.println("invalid parameter");
        }

        //--------------task----------------------//
        String result = "";
        for (int i = 1; i < 1000; i++) {
            if (i % 7 == 0 && i % 3 == 0) {
                result += i + ", ";
            }
        }
        result = result.substring(0, result.length() - 2);
        System.out.print(result);
    }
}
