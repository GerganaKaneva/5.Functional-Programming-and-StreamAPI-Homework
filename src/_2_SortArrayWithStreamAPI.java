import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String sorter = sc.nextLine();

        if (sorter.equals("Ascending")) {

            List<Integer> numbers = Arrays.stream(input)
                    .map(Integer::parseInt)
                    .sorted((x, y) -> Integer.compare(x, y))
                    .collect(Collectors.toList());

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        } else {

            List<Integer> numbers = Arrays.stream(input)
                    .map(Integer::parseInt)
                    .sorted((x, y) -> Integer.compare(y, x))
                    .collect(Collectors.toList());

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
