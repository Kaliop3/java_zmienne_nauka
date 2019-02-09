package pl.klaudialason.programy_JAVA;

public class Table {
    public static void main(String[] args) {
        int[] ints;
        ints = new int[3];
        ints[0] = 6;//pierwszy element
        ints[1] = 3;// drugi element
        ints[2] = 766;//trzeci elemet

        System.out.println(ints[2]);

        String strings[] = {"element", "inny elemet"};
        System.out.println(strings[0]);

        //multidimensional array

        String[][] strings2 = {{"q", "w", "e"}, {"a"},
                {"element", "inny elemet", "element", "inny elemet", "element", "inny elemet"}};

        System.out.println(strings2[0][2]);

        int[][][] inst3 = new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][] inst2 = inst3[0];
        System.out.println(inst2[0][0]);

        //----------------  exercise task  -----------//
        System.out.println("==================");

        int table[]={5,2,6};

        int sum=table[0]+table[1]+table[2];
        int multipy=table[0]*table[1]*table[2];

        System.out.println(sum);
        System.out.println(multipy);


    }
}

