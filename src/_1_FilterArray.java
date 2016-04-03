import java.util.Scanner;
import java.util.Arrays;
import java.util.function.Predicate;

public class _1_FilterArray {

    public  static Predicate<String> isGreaterThanThree(){
        return p -> p.length() <= 3;
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

         Arrays.stream(input)
                 .filter(isGreaterThanThree().negate())
                 .forEach((p) -> System.out.printf("%s ", p));
    }
}
