import java.util.Scanner;

public class StudentExeption {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print ( "Number of subjects: ");
        int subjectNo = inp.nextInt();

        double scores[] = new double[subjectNo];

        for (int i = 0; i < scores.length; i++) {
            System.out.print ("Score of Subject ("+(i+1)+"): ");
            scores[i]= inp.nextDouble();
        }
        double sum=0;
        for (double s : scores) {
            sum+=s;
        }
        System.out.println("Average: "+sum/subjectNo);
    }
}
