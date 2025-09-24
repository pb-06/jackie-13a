import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JackieService {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public JackieService() {
        setMatrix(new int[1][1]);
    }

    public JackieService(String filename) throws FileNotFoundException {
        // cpunt lines
        int countLines = countLines(filename);
        // init matrix
        setMatrix(new int[countLines][6]);
        // read from file to matrix
        readFromFile(filename);
    }

    private int countLines(String filename) throws FileNotFoundException {
        File fbe = new File(filename);
        Scanner scanner = new Scanner(fbe);
        int result = 0-1;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            result++;
        }
        return result;
    }

    private void readFromFile(String filename) throws FileNotFoundException {
        File fbe = new File(filename);
        Scanner scanner = new Scanner(fbe);
        int i = 0;
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split("\t");
            for (int j=0; j<6; j++) {
                matrix[i][j] = Integer.parseInt(split[j]);

            }
            i++;
        }
    }
}
