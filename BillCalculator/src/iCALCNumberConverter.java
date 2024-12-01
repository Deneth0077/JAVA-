import java.util.Scanner;
public class iCALCNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = getValidChoice(scanner);
            switch (choice) {
                case 1:
                    decimalConverter(scanner);
                    break;
                case 2:
                    binaryConverter(scanner);
                    break;
                case 3:
                    octalConverter(scanner);
                    break;
                case 4:
                    hexadecimalConverter(scanner);
                    break;
                case 5:
                    romanNumberConverter(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (!exit) {
                exit = askToReturnToHomepage(scanner);
            }
        }
        scanner.close();
    }

    private static void displayMainMenu() {
        System.out.println("\nHome Page");
        System.out.println("1. Decimal Converter");
        System.out.println("2. Binary Converter");
        System.out.println("3. Octal Converter");
        System.out.println("4. Hexadecimal Converter");
        System.out.println("5. Roman Number Converter");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                if (choice >= 1 && choice <= 6) {
                    break;
                }
            } else {
                System.out.print("Invalid input. Please try again: ");
                scanner.nextLine(); // Consume the invalid input
            }
            System.out.print("Invalid choice. Please try again: ");
        }
        return choice;
    }

    private static boolean askToReturnToHomepage(Scanner scanner) {
        System.out.print("\nDo you want to go to the homepage? (Y/N) ");
        char homeChoice = scanner.nextLine().trim().toUpperCase().charAt(0);
        return homeChoice != 'Y';
    }

    private static void decimalConverter(Scanner scanner) {
        System.out.print("\nEnter a decimal number: ");
        int decimal = getValidDecimalNumber(scanner);

        if (decimal != -1) {
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            System.out.println("\nDecimal: " + decimal);
            System.out.println("Binary: " + binary);
            System.out.println("Octal: " + octal);
            System.out.println("Hexadecimal: " + hexadecimal);
        }
    }

    private static int getValidDecimalNumber(Scanner scanner) {
        int number = 0;
        boolean validNumber = false;

        while (!validNumber) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                if (number >= 0) {
                    validNumber = true;
                } else {
                    System.out.print("Invalid input. Please enter a positive number: ");
                }
            } else {
                System.out.print("Invalid input. Please try again: ");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        if (validNumber) {
            return number;
        } else {
            System.out.println("Invalid input. Returning to the homepage.");
            return -1;
        }
    }

    private static void binaryConverter(Scanner scanner) {
        System.out.print("\nEnter a binary number: ");
        String binary = getValidBinaryNumber(scanner);

        if (!binary.isEmpty()) {
            int decimal = Integer.parseInt(binary, 2);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            System.out.println("\nBinary: " + binary);
            System.out.println("Decimal: " + decimal);
            System.out.println("Octal: " + octal);
            System.out.println("Hexadecimal: " + hexadecimal);
        }
    }

    private static String getValidBinaryNumber(Scanner scanner) {
        String number = scanner.nextLine().trim();
        boolean validNumber = true;

        for (char c : number.toCharArray()) {
            if (c != '0' && c != '1') {
                validNumber = false;
                break;
            }
        }

        if (!validNumber) {
            System.out.print("Invalid binary number. Please try again: ");
            return getValidBinaryNumber(scanner);
        }

        return number;
    }

    private static void octalConverter(Scanner scanner) {
        System.out.print("\nEnter an octal number: ");
        String octal = getValidOctalNumber(scanner);

        if (!octal.isEmpty()) {
            int decimal = Integer.parseInt(octal, 8);
            String binary = Integer.toBinaryString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            System.out.println("\nOctal: " + octal);
            System.out.println("Decimal: " + decimal);
            System.out.println("Binary: " + binary);
            System.out.println("Hexadecimal: " + hexadecimal);
        }
    }

    private static String getValidOctalNumber(Scanner scanner) {
        String number = scanner.nextLine().trim();
        boolean validNumber = true;

        for (char c : number.toCharArray()) {
            if (c < '0' || c > '7') {
                validNumber = false;
                break;
            }
        }

        if (!validNumber) {
            System.out.print("Invalid octal number. Please try again: ");
            return getValidOctalNumber(scanner);
        }

        return number;
    }

    private static void hexadecimalConverter(Scanner scanner) {
        System.out.print("\nEnter a hexadecimal number: ");
        String hexadecimal = getValidHexadecimalNumber(scanner);

        if (!hexadecimal.isEmpty()) {
            int decimal = Integer.parseInt(hexadecimal, 16);
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);

            System.out.println("\nHexadecimal: " + hexadecimal);
            System.out.println("Decimal: " + decimal);
            System.out.println("Binary: " + binary);
            System.out.println("Octal: " + octal);
        }
    }

    private static String getValidHexadecimalNumber(Scanner scanner) {
        String number = scanner.nextLine().trim().toUpperCase();
        boolean validNumber = true;

        for (char c : number.toCharArray()) {
            if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                validNumber = false;
                break;
            }
        }

        if (!validNumber) {
            System.out.print("Invalid hexadecimal number. Please try again: ");
            return getValidHexadecimalNumber(scanner);
        }

        return number;
    }

    private static void romanNumberConverter(Scanner scanner) {
        System.out.println("\nRoman Number Converter");
        System.out.println("1. Decimal to Roman Number");
        System.out.println("2. Roman Number to Decimal");
        System.out.print("Enter your choice: ");
    }

}