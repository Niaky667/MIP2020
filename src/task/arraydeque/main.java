package task.arraydeque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException {

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int m = 3;
        int max = Integer.MIN_VALUE;
// Integer.MIN_VALUE is a constant in the Integer class of java.lang package
// that specifies that stores the minimum possible value for any integer variable in Java. The actual value of this is
// -2^31 = -2147483648
        try (Scanner sc = new Scanner(new File("src/text.txt"))) {
            while (sc.hasNext()) {
                Integer input = Integer.parseInt(sc.next());
                deque.add(input);
                set.add(input);

                if (deque.size() == m) {
                    if (set.size() > max) {
                        max = set.size();
                    }
                    int first = deque.remove();
                    if (!deque.contains(first)) {
                        set.remove(first);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(max);
    }
}
