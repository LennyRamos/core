package hackerrank.interviewprep.warmupchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Lenny Ramos (solution)
 * <p>
 * This challenge requires returning the minimum number of jumps required, as an integer.
 * <p>
 * Input format from StandardInput
 * The first line contains an integer n, the total number of clouds.
 * The second line contains n space-separated binary integers describing clouds c[i] where 0 <= i < n.
 * <p>
 * Constraints
 * <p>
 * 2 <= n <= 100
 * c[i] can only be 1 or 0
 * c[0] = c[n-1] = 0
 */
public class JumpingOnClouds {

    private static int jumpingOnClouds(int[] clouds) {
        int numberOfStep = 0;

        for (int i = 0; i < clouds.length - 2; ) {

            if (clouds[i + 1] == 0) {
                i++;

                if (clouds[i + 2] == 0) {
                    i++;
                }

                numberOfStep++;
            } else {
                i += 2;
                numberOfStep++;
            }


        }

        return numberOfStep;
    }

    /**
     * From hackerrank
     *
     * @throws IOException thrown by Scanners underlying readable
     */
    public void run() throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
