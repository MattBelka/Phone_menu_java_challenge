package matt.abstractChallange;
import java.util.Scanner;

public class Messages<i> implements menu{

        int nr;
        Scanner scanner = new Scanner(System.in);

        public void showList() {System.out.println("-------------- \n List of mesages: ");}
        public void addList() {System.out.println("Create new message: ");}



        public void change(){
                while (nr<3) {
                        System.out.println(" 1.List of mesages \n 2.Create new message \n 3.Main menu");
                        nr = scanner.nextInt();
                        switch (nr) {
                                case 1:
                                        this.showList();
                                        break;
                                case 2:
                                        this.addList();
                                        break;
                        }
                }
        }

}
