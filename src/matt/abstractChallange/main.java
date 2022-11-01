package matt.abstractChallange;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int nr=0;
        Scanner scanner = new Scanner(System.in);


        Contacts myContacts = new Contacts();
        Messages myMesseges = new Messages();


        while (nr < 3) {
            System.out.println(" 1.Contacts. \n 2.Messages. \n 3.Quit. \n-------------- ");
            nr = scanner.nextInt();
            switch (nr) {
                case 1:
                    myContacts.change();
                    break;

                case 2:
                    myMesseges.change();
                    break;

            }
        }
    }
}
