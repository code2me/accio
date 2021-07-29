package accio.week3;

// https://www.hackerrank.com/challenges/balanced-brackets/problem
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static String isBalanced(String s) {
        // Write your code here\
        Stack<Character> stack = new Stack<>();
        String y = "YES";
        String n = "NO";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return n;
            } else if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return n;
                }

            } else if (ch == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return n;
                }

            } else if (ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return n;
                }

            }
        }
        if (!stack.isEmpty()) {
            return n;
        }
        return y;

    }

}

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
