public class Praktikum {
    public static void main(String[] args) {

        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Name: [" + name + "] is Valid.");
        } else {
            System.out.println("Name: [" + name + "] is Invalid.");
        }
    }
}