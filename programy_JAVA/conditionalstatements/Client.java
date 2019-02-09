package pl.klaudialason.programy_JAVA.conditionalstatements;

public class Client {
    public final static String COMPANY_NAME = "XEROX";// const

    private String firstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;//this poza  metoda te same nazwy zmiennych
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduceYourself(){
        System.out.println("Hello, I am "+firstName+" "+lastName+".");
    }
}
