public class binary {
    
        public static void main(String[] args) {
            String binaryNumber = "101010"; // Example binary number
            
            // Convert binary to decimal
            int decimalNumber = binaryToDecimal(binaryNumber);
            
            // Print the result
            System.out.println("Binary number: " + binaryNumber);
            System.out.println("Decimal equivalent: " + decimalNumber);
        }
    
        public static int binaryToDecimal(String binaryNumber) {
            int decimalNumber = 0;
            int power = 0;
            
            // Iterate over each character of the binary string from right to left
            for (int i = binaryNumber.length() - 1; i >= 0; i--) {
                // If the character at index i is '1', add 2^power to the decimalNumber
                if (binaryNumber.charAt(i) == '1') {
                    decimalNumber += Math.pow(2, power);
                }
                power++; // Increment power for next position
            }
            
            return decimalNumber;
        }
    }
    

