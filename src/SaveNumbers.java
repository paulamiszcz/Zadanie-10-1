import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveNumbers {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić??");
        int liczby = scanner.nextInt();
        scanner.nextLine();

        double[] tab = new double[liczby];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj iliczbę: ");
            tab[i] = scanner.nextDouble();
            bufferedWriter.write(" " + tab[i] + "\n");
        }

        bufferedWriter.close();
    }
}
