package matt.abstractChallange;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;


public class Contacts<i> implements menu,menu2{

    int nr;
    String name;
    String number;
    String searchName;

    public ArrayList<ClassContact> cont = new ArrayList<ClassContact>();
    //Iterator<ClassContact> itr = cont.iterator();






    public void showList() {
        System.out.println("List of contacts \n-------------- ");
        for (int i=0;i<cont.size();i++){
            System.out.println(" Name: " + cont.get(i).name + "\n Number: " + cont.get(i).number);
        }
    }

    public void addList(){
        System.out.println("Add Contact");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert NAME of new contact: ");
        name = scanner.next();
        System.out.println("Insert NUMBER of new contact: ");
        number = scanner.next();
        cont.add(new ClassContact(name, number));
    }

    public void search(){
        System.out.println("Search contact. \n Please enter the name: ");
        Scanner scanner = new Scanner(System.in);
        searchName = scanner.next();
        if (searchName.equals("")){
            System.out.println("Please, enter the name again: ");
            search();
        }else {
            boolean doesExist = false;
            for (ClassContact n : cont) {
                if (n.getName().equals(searchName)) {
                    doesExist = true;
                    n.getDetails();
                }
            }
            if (!doesExist){
                System.out.println("Contact doesn't exist.");
            }
        }

    }

    public void delete() {
        System.out.println("Delete contact. \n Please enter name of contact: ");
        Scanner scanner = new Scanner(System.in);
        String deleteContact = scanner.next();
        if (deleteContact.equals("")){
            System.out.println("Enter the name agian.");
            delete();
        }else {

            boolean doesExist=false;
            ClassContact toRemove = null;
            for (ClassContact n:cont){
                if (n.getName().equals(deleteContact)){
                    doesExist=true;
                    toRemove = n;
                    break;

                }
            }
            cont.remove(toRemove);

            if (!doesExist){
                System.out.println("There is not such contact to remove.");

            }
        }
    }

    private void InitialContacts() {
        cont.add(new ClassContact("Matt", "8888888"));
        cont.add(new ClassContact("Ale", "5234234"));
    }

    public void change() {
        this.InitialContacts();
        while (nr<5){
            Scanner scanner=new Scanner(System.in);
            System.out.println("-------------- \n 1.List of contacts. \n 2.Add contact.\n 3.Search contact \n 4.Delete contact \n 5.Main menu");
        nr=scanner.nextInt();
        switch (nr) {
            case 1:
                this.showList();
                break;
            case 2:
                this.addList();
                break;
            case 3:
                this.search();
                break;
            case 4:
                this.delete();
                break;
        }
        }
    }
}

