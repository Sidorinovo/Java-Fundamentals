import java.util.*;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] tokens = scan.nextLine().split("\\s+");
        String command = tokens[0];

        while (!command.equals("end")) {
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= arr.length || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                        arr = exchangeArray(arr, index);
                    }
                    break;

                case "max":
                    if (tokens[1].equals("odd")) {
                        printMaxOddIndex(arr);
                    } else {
                        printMaxEvenIndex(arr);
                    }
                    break;

                case "min":
                    if (tokens[1].equals("odd")) {
                        printMinOddIndex(arr);
                    } else {
                        printMinEvenIndex(arr);
                    }
                    break;

                case "first":
                    int num = Integer.parseInt(tokens[1]);
                    if (tokens[2].equals("odd")) {
                        printFirstNumberOfOdds(arr, num);
                    } else {
                        printFirstNumberOfEvens(arr, num);
                    }
                    break;

                case "last":
                    num = Integer.parseInt(tokens[1]);
                    if (tokens[2].equals("odd")) {
                        printLastNumberOfOdds(arr, num);
                    } else {
                        printLastNumberOfEvens(arr, num);
                    }
                    break;
            }

            tokens = scan.nextLine().split("\\s+");
            command = tokens[0];
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);

    }

    private static int[] exchangeArray(int[] arr, int index) {
        int[] newArr = copyArray(arr);
        for (int i = 0; i <= index; i++) {
            newArr[(arr.length - index - 1) + i] = arr[i];
        }
        int count = 0;
        for (int i = index + 1; i < arr.length; i++) {
            newArr[count] = arr[i];
            count++;
        }
        return newArr;
    }

    private static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    private static void printMaxOddIndex(int[] arr) {
        int maxOdd = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxOdd) {
                maxOdd = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d%n", index);
        }
    }

    private static void printMaxEvenIndex(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxEven) {
                maxEven = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d%n", index);
        }
    }

    private static void printMinOddIndex(int[] arr) {
        int minOdd = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minOdd) {
                minOdd = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d%n", index);
        }
    }

    private static void printMinEvenIndex(int[] arr) {
        int minEven = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minEven) {
                minEven = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d%n", index);
        }
    }

    private static boolean checkLength(int[] arr, int num) {
        if (num > arr.length) {
            System.out.println("Invalid count");
            return false;
        }
        return true;
    }

    private static void printFirstNumberOfOdds(int[] arr, int num) {
        if (checkLength(arr, num)) {
            int counter = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0 && counter < num) {
                    list.add(arr[i]);
                    counter++;
                }
            }
            System.out.println(list);
        }
    }

    private static void printFirstNumberOfEvens(int[] arr, int num) {
        if (checkLength(arr, num)) {

            int counter = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && counter < num) {
                    list.add(arr[i]);
                    counter++;
                }
            }
            System.out.println(list);
        }
    }

    private static void printLastNumberOfOdds(int[] arr, int num) {
        if (checkLength(arr, num)) {

            int counter = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] % 2 != 0 && counter < num) {
                    list.add(arr[i]);
                    counter++;
                }
            }
            Collections.reverse(list);
            System.out.println(list);
        }
    }

    private static void printLastNumberOfEvens(int[] arr, int num) {
        if (checkLength(arr, num)) {

            int counter = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] % 2 == 0 && counter < num) {
                    list.add(arr[i]);
                    counter++;
                }
            }
            Collections.reverse(list);
            System.out.println(list);
        }
    }
}
