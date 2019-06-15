public class FizzBuzz {
    public static String fizzBuzz1(int number) {

        String output = "";
        if (number % 3 == 0) {
            output = "Fizz";
        }
        if (number % 5 == 0) {
            output += "Buzz";
        }
        if (number % 3 != 0 && number % 5 != 0) {
            output += "" + number;
        }
        return output;
    }

    public static String fizzBuzz2(int number) {

        String output = "";
        if (number % 3 != 0 && number % 5 != 0) {
            output += "" + number;
        } else {
            if (number % 3 == 0) {
                output = "Fizz";
            }
            if (number % 5 == 0) {
                output += "Buzz";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz1(3));
        System.out.println(fizzBuzz1(5));
        System.out.println(fizzBuzz1(15));
        System.out.println(fizzBuzz1(16));
        System.out.println(fizzBuzz1(2));
        System.out.println("");
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));
        System.out.println(fizzBuzz2(16));
        System.out.println(fizzBuzz2(2));
    }
}