package.com.example.demo.model
import lombok.Getter;

public class BankAccount {
    @Getter
    public class BankAccount {
        private String name;
        private String animalType;
        private int balance;
        private boolean isItKing;
        private boolean isItBad;

        public BankAccount(String name, int balance, String animalType, boolean isItKing, boolean isItBad) {
        }
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getBalance() {
        return balance;
    }

    public boolean getIsItKing() {
        return isItKing;
    }

    public boolean isItBad() {
        return isItBad;
    }
}