public class ArrayFunction {

    // 1. Split numbers into ODD and EVEN boxes
    public static int[][] splitOddEven(int[] nums) {
        int oddCount = 0;
        int evenCount = 0;

        // Step 1: Count how many odd and even numbers we have
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }

        int[] oddNumber = new int[oddCount];
        int[] evenNumber = new int[evenCount];

        int oddSpot = 0;
        int evenSpot = 0;

        
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] % 2 == 0) {
                evenNumber[evenSpot] = nums[count];
                evenSpot = evenSpot + 1;
            } else {
                oddNumber[oddSpot] = nums[count];
                oddSpot = oddSpot + 1;
            }
        }

        return new int[][]{oddNumber, evenNumber};
    }

    // 2. Check if numbers read the same forward and backward
public static boolean checkPalindrome(int[] nums) {
        boolean isSame = true;

        for (int count = 0; count < nums.length / 2; count++) {
            int leftNumber = nums[count];
            int rightNumber = nums[nums.length - 1 - count];

            if (leftNumber!= rightNumber) {
                isSame = false;
            }
        }

        return isSame;
    }

   
public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        
        for (int count = 0; count * count <= num; count++) {
            if (count * count == num) {
                return true;
            }
        }
        return false;
    }

    // 3. Pick out only the perfect square numbers
public static int[] findPerfectSquares(int[] nums) {
        int squareCount = 0;

        
        for (int count = 0; count < nums.length; count++) {
            if (isPerfectSquare(nums[count])) {
                squareCount = squareCount + 1;
            }
        }

        int[] squareBox = new int[squareCount];
        int spot = 0;

        
        for (int count = 0; count < nums.length; count++) {
            if (isPerfectSquare(nums[count])) {
                squareBox[spot] = nums[count];
                spot = spot + 1;
            }
        }

        return squareBox;
    }

    // 4. Change non-perfect squares to -1
public static int[] replaceNonPerfectSquares(int[] nums) {
        int[] newNumbers = new int[nums.length];

        for (int count = 0; count < nums.length; count++) {
            if (isPerfectSquare(nums[count])) {
                newNumbers[count] = nums[count];
            } else {
                newNumbers[count] = -1; 
            }
        }

        return newNumbers; 
    }

    public static void main(String[] args) {
        int[] numbers = {45, 60, 3, 10, 9, 22};

        System.out.println("1. Split odd and even:");
        int[][] split = splitOddEven(numbers);
        System.out.print("OddNumber: ");
        for (int index = 0; index < split[0].length; index++) {
            System.out.print(split[0][index] + " ");
        }
        System.out.print("\nEvenNumber: ");
        for (int index = 0; index < split[1].length; index++) {
            System.out.print(split[1][index] + " ");
        }

        System.out.println("\n\n2. Check palindrome:");
        boolean palindrome = checkPalindrome(new int[]{45, 0, 8, 0, 45});
        System.out.println("Is palindrome? " + palindrome);

        System.out.println("\n3. Find perfect squares:");
        int[] squares = findPerfectSquares(new int[]{4, 7, 9, 10, 16, 18});
        System.out.print("Perfect squares: ");
        for (int index = 0; index < squares.length; index++) {
            System.out.print(squares[index] + " ");
        }

        System.out.println("\n\n4. Replace non-perfect squares:");
        int[] replaced = replaceNonPerfectSquares(new int[]{4, 7, 9, 10, 49, 6});
        System.out.print("NewNumbers: ");
        for (int index = 0; index < replaced.length; index++) {
            System.out.print(replaced[index] + " ");
        }
    }
}
