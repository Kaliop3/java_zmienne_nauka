package pl.klaudialason.programy_JAVA.conditionalstatements;

public class Test {

    public static void main(String[] args) {
//        int x = 1;
//        String s = " ";
//        Client client1 = new Client();
//        client1.name = "Michał";
//        s = Client.COMPANY_NAME;
//
//        System.out.println(client1.name);
//
//        Client client2 = null;
//
//        System.out.println(client1);
//
//        if (client2 != null) {
//            System.out.println(client2);
//        }

        Client clientMichael = new Client();

        clientMichael.setFirstName("Michael");
        clientMichael.setLastName("Clombo");

        Address michaelAddress = new Address("Warsaw", "00-001");
//        michaelAddress.setPostCode("00-001");
//        michaelAddress.setPostOffice("Warsaw");

        clientMichael.setAddress(michaelAddress);

        System.out.println(clientMichael.getLastName());
        System.out.println(Client.COMPANY_NAME);

        clientMichael.introduceYourself();

        //-------------------TASK TEST--------------------//

        Invoive clientEd = new Invoive();

        clientEd.setFirstName("Olivier");
        clientEd.setLastName("Break");

        Address clinetEd = new Address("Wieliczka", "32-020");
        Subject clinetEdSub = new Subject("Car", 2, 13000);


    }
}
