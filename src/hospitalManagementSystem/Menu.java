package hospitalManagementSystem;

import java.util.Scanner;

/*
 * Menu class to help the user to use the system
 *
 * @author ms
 */
public class Menu {

    /*
     * Global variables 
     */
    char choice;
    Scanner sC = new Scanner(System.in);
    List list = new List();

    /*
     * Menu Constructor
     */
    public Menu() {
        /*
         * Do While loop to keep the menu available to the user
         */
        do {
            System.out.println("********* WELCOME TO HOSPITAL SYSTEM ***********");
            System.out.println("Choose one of the following options: ");
            System.out.println("[1] Add Patient to the list");
            System.out.println("[2] Update Patient record");
            System.out.println("[3] Remove Patient from the list");
            System.out.println("[4] Check list");
            System.out.println("[5] Exit");
            System.out.print("Enter choice [1-4]: ");
            choice = sC.next().charAt(0);
            System.out.println();

            switch (choice) {
                case '1':
                    add();
                    break;
                case '2':
                    update();
                    break;
                case '3':
                    remove();
                    break;
                case '4':
                    checkList();
                    break;
                case '5':
                    break;
                default:
                    System.out.println("Enter a number option [1-5]");
            }

        } while (choice != '5');
        System.out.println("Thanks! Have a good day.");
    }/////////// end of Menu() Constructor\\\\\\


    /*
     * Method to add a Patient to the list
     */
    public void add() {
        /*
         * Method adds a new Patient to records
         */
        System.out.print("enter patient's PPS number: ");
        String pPs = sC.next();
        System.out.print("enter patient's first Name: ");
        String fN = sC.next();
        System.out.print("enter patient's last Name: ");
        String lN = sC.next();
        System.out.print("enter patient's mobile number: ");
        String mB = sC.next();
        System.out.print("enter patient's email address: ");
        String eM = sC.next();
        System.out.print("enter patient's city: ");
        String cT = sC.next();
        System.out.println();
        System.out.println("Choose one of the following options ");
        System.out.println("[1]add as priority or urgency ");
        System.out.println("[2]add patient between positions in the list ");
        System.out.println("[3]add patient  ");
        char option = sC.next().charAt(0);
        switch (option) {

            case '1':
                /////////////////// add  patient as priority \\\\\\\\\\\\\\\\\\\\\

                list.addFirst(new Patient(pPs, fN, lN, mB, eM, cT));
                break;
            case '2':
                /////////////////// adding patient to a specific position \\\\\\\\\\\\\\\\\\\\\

                System.out.println("enter position in the list: ");
                int position = sC.nextInt();

                list.addAt(new Patient(pPs, fN, lN, mB, eM, cT), position - 1);

                break;
            case '3':
                list.add(new Patient(pPs, fN, lN, mB, eM, cT));
                break;

            default:
                System.out.print("please enter options 1 to 3");
                break;
        }

    }/////////// end of add() method\\\\\\


    /*
     * Method to update a Patient record
     */
    public void update() {

        System.out.print("enter patient's position: ");
        int index = sC.nextInt();
        if (index <= 0 || index > list.size()) { // check if the index is valid
            System.out.print("The index is not valid, please start again");
            System.exit(0);
        } else { // if the index is valid
            /*
         * Method adds a new Patient to records
             */
            System.out.print("enter patient's PPS number: ");
            String pPs = sC.next();
            System.out.print("enter patient's first Name: ");
            String fN = sC.next();
            System.out.print("enter patient's last Name: ");
            String lN = sC.next();
            System.out.print("enter patient's mobile number: ");
            String mB = sC.next();
            System.out.print("enter patient's email address: ");
            String eM = sC.next();
            System.out.print("enter patient's city: ");
            String cT = sC.next();

            list.update(index, new Patient(pPs, fN, lN, mB, eM, cT));
        }
    }/////////// end of update() method\\\\\\


    /*
     * Method to remove a Patient to the list
     */
    public void remove() {

        System.out.println("[1] remove last patient from the list ");
        System.out.println("[2] remove first patient from the list ");
        System.out.println("[3] remove patient by position ");
        System.out.println("[4] remove more then one patient from the list ");
        char choice = sC.next().charAt(0);

        switch (choice) {

            case '1':
                /////////////////// remove last patient \\\\\\\\\\\\\\\\\\\\\
                int size = list.size();
                list.remove(size - 1);
                break;
            case '2':
                /////////////////// remove from the top \\\\\\\\\\\\\\\\\\\\\
                list.removeFirst();
                break;
            case '3':
                /////////////////// remove patient by position \\\\\\\\\\\\\\\\\\\\\
                System.out.println("enter patient position");
                int position = sC.nextInt();
                list.remove(position - 1);
                break;
            case '4':
                /////////////////// remove N patients \\\\\\\\\\\\\\\\\\\\\
                System.out.println("enter number of patients to be removed: ");
                int n = sC.nextInt();
                list.removeN(n);
                break;
            default:
                System.out.print("please enter options 1 to 4");
                break;
        }

    }/////////// end of cremove() method\\\\\\

    /*
     * Method to check the patients who are in the list
     */
    public void checkList() {

        System.out.println("[1] check full list ");
        System.out.println("[2] check by position ");
        char option = sC.next().charAt(0);

        switch (option) {
            case '1':
                /////////////////// see full list \\\\\\\\\\\\\\\\\\\\\\\\\\\
                System.out.println(list.toString());
                break;
            case '2':
                ////////////////////// check by position \\\\\\\\\\\\\\\\\\\\\\\\\\\\
                System.out.print("enter patient's position: ");
                int pos = sC.nextInt();
                System.out.println(list.getNode(pos).getData());
                break;
        }

    }//////////// end of checkList() method\\\\\\

} //// end of Menu class\\\\\\
