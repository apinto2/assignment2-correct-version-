import java.util.Scanner;
import java.util.regex.Matcher;
import java.lang.Object;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Student {
    private String sfirstName;
    private String slastName;
    private String speopleSoft;
    private String sclassStanding;
    private String semail;
    private String saddress;
    private String scity;
    private String sstate;
    private String szipCode;
    private static int scount = 0;

    public void getValues() {

        sfirstName=JOptionPane.showInputDialog("\nEnter First name:");

        while (!sfirstName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid entry! Try again!");
            sfirstName=JOptionPane.showInputDialog("\nEnter First name:");

        }



        slastName=JOptionPane.showInputDialog("\nEnter Last name:");
        while (!slastName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid entry! Try again!");

        }

//        //

        speopleSoft=JOptionPane.showInputDialog("\nEnter PeopleSoft Id:");
        int peoplesoftlength = String.valueOf(speopleSoft).length();
        String peoplesoftstring = String.valueOf(speopleSoft);
        while (!(peoplesoftlength <= 7 || peoplesoftstring.matches("[0-9]"))) {
            System.out.println("Invalid entry! Try again!");
            speopleSoft=JOptionPane.showInputDialog("\nEnter PeopleSoft Id:");

            peoplesoftlength = String.valueOf(speopleSoft).length();
        }


        //

        sclassStanding=JOptionPane.showInputDialog("\nEnter Class Standing: Freshmen,Sophomore,Junior or Senior");


        while (!(sclassStanding.equals("freshmen") || sclassStanding.equals("sophomore") || sclassStanding.equals("junior") || sclassStanding.equals("senior"))) {
            System.out.println("Invalid entry! Try again!");
            sclassStanding=JOptionPane.showInputDialog("\nEnter Class Standing: Freshmen,Sophomore,Junior or Senior");


        }
       //
        semail=JOptionPane.showInputDialog("\nEnter Email Id:");

        while (!semail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
            System.out.println("Invalid entry! Try again!");
            semail=JOptionPane.showInputDialog("\nEnter Email Id:");

        }


        //
        saddress=JOptionPane.showInputDialog("\nEnter Address:");



        while (!saddress.matches("^(?:[Pp][Oo]\\s[Bb][Oo][Xx]|[0-9]+)\\s(?:[0-9A-Za-z\\.'#]|[^\\S\\r\\n])+")) {
            System.out.println("Invalid entry! Try again!");
            saddress=JOptionPane.showInputDialog("\nEnter Address:");

        }


        //
        scity=JOptionPane.showInputDialog("\nEnter City:");


        while(!scity.matches("[a-zA-Z]+")) {
            System.out.println("Invalid entry! Try again!");
            scity=JOptionPane.showInputDialog("\nEnter City:");


        }

       //
        sstate=JOptionPane.showInputDialog("\nEnter State capitalized:");



        boolean firstloop=true;
        while(firstloop){
            String[]stateArray={"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE",
                    "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA","MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND",
                    "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
            boolean verify=Arrays.stream(stateArray).anyMatch(sstate::equals);
            while(!(verify)){
                System.out.println("Invalid entry! Try again!");
                sstate=JOptionPane.showInputDialog("\nEnter State capitalized:");
//                System.out.println("Enter State:");
//                Scanner inputState = new Scanner(System.in);
//                state = inputState.nextLine().toUpperCase();
                verify=Arrays.stream(stateArray).anyMatch(sstate::equals);
            }
            break;
        }


       //
        szipCode=JOptionPane.showInputDialog("\nEnter Zipcode:");

        int zipcodelength = String.valueOf(szipCode).length();
        String zipcodestring = String.valueOf(szipCode);
        while (!(zipcodelength == 9 || zipcodestring.matches("[0-9]"))) {
            System.out.println("Invalid entry! Try again!");
            szipCode=JOptionPane.showInputDialog("\nEnter Zipcode:");

            zipcodelength = String.valueOf(szipCode).length();

        }
    }
        public void displayValues () {
            System.out.println("\nStudents Details, Department of ILT");
            System.out.println("First name: " + sfirstName);
            System.out.println("Last name: " + slastName);
            System.out.println("PeopleSoft Id: " + speopleSoft);
            System.out.println("Class Standing: " + sclassStanding);
            System.out.println("Email Id: " + semail);
            System.out.println("Address line: " + saddress+ " "+scity +" "+ sstate +" "+ szipCode);
            System.out.println("Number of students:" + Student.Count());
        }
        public static int Count () {
            scount = scount + 1;
            return scount;
        }


}
