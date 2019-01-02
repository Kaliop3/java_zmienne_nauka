package pl.klaudialason.programy_JAVA.conditionalstatements;

public class Subject {
    private String name;
    private int number;
    private int costBeforeTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCostBeforeTax() {
        return costBeforeTax;
    }

    public void setCostBeforTax(int costBeforeTax) {
        this.costBeforeTax = costBeforeTax;
    }


    private int calculateTax() {
        int tax = 23;
        return (costBeforeTax * tax /100);
    }

    public Subject(String name, int number, int costBeforeTax) {
        this.name = name;
        this.number = number;
        this.costBeforeTax = costBeforeTax;
        System.out.println(name+ " Amount: "+number+ " cost: "+ costBeforeTax+" tax: "+calculateTax()+". ");
    }
}
