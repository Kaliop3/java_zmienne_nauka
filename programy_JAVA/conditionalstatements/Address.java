package pl.klaudialason.programy_JAVA.conditionalstatements;

public class Address {
    private String postOffice;
    private String postCode;

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Address(String postOffice, String postCode) {
        this.postOffice = postOffice;
        this.postCode = postCode;
        System.out.println("Creat new Address: "+ postOffice);
    }
}
