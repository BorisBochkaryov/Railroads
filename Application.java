import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * Class for solving the Railroads problem from the company Huawei
 *
 * @author Boris Bochkarev <Boris-Bochkaryov[at]yandex.ru>
 * @version 1.0
 */
class Application {

    public static void main(String[] args) {

        try {
            FileReader inputFile = new FileReader("input.txt");
            FileWriter outputFile = new FileWriter("output.txt", false);
            BufferedReader input = new BufferedReader(inputFile);
            PrintWriter output = new PrintWriter(outputFile);
            String line;

            while ((line = input.readLine()) != null) {
                int N = Integer.parseInt(line);
                if (N == 0)
                    break;

                /*
                  Algorithm:
                  Get the coaches and enter to the dead-end station (to the Stack<Integer> station).
                  On side 'A' the coaches are in the sequence '1, 2, ..., N'.
                  If the first coache on side 'B' should be 'current',
                  then this can be moved into the dead-end all coaches with numbers '1, 2, ..., current',
                  and then moving the coaches with number 'current' to side 'B'.

                 */
                while (true) {
                    Stack<Integer> station = new Stack<>();
                    String lineWithNumbers = input.readLine();

                    if (lineWithNumbers.equals("0"))
                        break;

                    for (int current = 0, i = 0; i < N; i++) {
                        Integer numberFromLine = Character.getNumericValue(lineWithNumbers.charAt(i));
                        while (current < N && current != numberFromLine) {
                            if (station.size() > 0 && station.peek().equals(numberFromLine))
                                break;

                            station.push(++current);
                        }

                        if (station.peek().equals(numberFromLine))
                            station.pop();
                    }

                    output.printf("%s\n", station.size() == 0 ? "Yes" : "No");
                }
                output.printf("\n");
            }
            output.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
