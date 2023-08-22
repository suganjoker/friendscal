class Main {
    private String mode;

    public Main(String mode) {
        this.mode = mode;
    }

    public void setMode(String mode) {
        if (mode.equals("Normal") || mode.equals("Opposite")) {
            this.mode = mode;
        } else {
            System.out.println("Invalid mode. Available modes are 'Normal' and 'Opposite'.");
        }
    }

    public int add(int... numbers) {
        if (numbers.length < 2 || numbers.length > 3) {
            System.out.println("Invalid number of inputs. The calculator accepts 2 or 3 numbers.");
            return 0;
        }

        int result = 0;
        for (int num : numbers) {
            result += num;
        }

        if (mode.equals("Opposite")) {
            result *= -1;
        }

        return result;
    }

    public int subtract(int... numbers) {
        if (numbers.length < 2 || numbers.length > 3) {
            System.out.println("Invalid number of inputs. The calculator accepts 2 or 3 numbers.");
            return 0;
        }

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        if (mode.equals("Opposite")) {
            result *= -1;
        }

        return result;
    }

    public static void main(String[] args) {
        Main calculator = new Main("Normal");


        System.out.println(calculator.add(5, 3));  // Output: 8


        calculator.setMode("Opposite");
        System.out.println(calculator.subtract(10, 3));  // Output: 7
    }
}
