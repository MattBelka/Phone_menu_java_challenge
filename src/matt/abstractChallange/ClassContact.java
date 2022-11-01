package matt.abstractChallange;

public class ClassContact {


    String name;
    String number;

    public ClassContact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return name+" "+number;
    }
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Number: " + this.getNumber());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
