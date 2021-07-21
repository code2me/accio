package accio.week1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return ((arr.size() | 1) > arr.size()) ? arr.get(arr.size() / 2) + arr.get((arr.size() / 2) + 1)
                : arr.get(arr.size() / 2);
    }
}

public class N {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        int result = Result.findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
