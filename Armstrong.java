public class Armstrong {
    
    public static void main(String[] args) {
        int number = 153; // Example number to check
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of the number of digits and add to sum
            num /= 10; // Remove the last digit
        }

        return sum == originalNum; // Check if the sum equals the original number
    }
}
