import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public void add(Amount other) throws Exception {
        if (!this.currency.equals(other.currency)) {
            throw new Exception("Currency doesn't match");
        }
        this.amount += other.amount;
    }
}

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            String[] parts1 = input1.split(" ");
            String[] parts2 = input2.split(" ");

            String currency1 = parts1[0];
            int amount1 = Integer.parseInt(parts1[1]);

            String currency2 = parts2[0];
            int amount2 = Integer.parseInt(parts2[1]);

            Amount amountObj1 = new Amount(currency1, amount1);
            Amount amountObj2 = new Amount(currency2, amount2);

            try {
                amountObj1.add(amountObj2);
                System.out.println(amountObj1.getAmount());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}