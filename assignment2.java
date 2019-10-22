import java.util.Scanner;
import javax.swing.JOptionPane;
public class assignment2 {
    public static void main(String[] args){

        String var1= JOptionPane.showInputDialog("How many students data do you want to enter:");
        int N = Integer.parseInt(var1);

        Student[] s= new Student[N];
        for (int w=0; w<N; w++){
            s[w]=new Student();



            s[w].getValues();
            s[w].displayValues();
        }


    }
}
