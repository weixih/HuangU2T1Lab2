public class ChatBotRunner {
    public static void main(String[]args){
        ChatBot debbie = new ChatBot("Debbie", 5);
        debbie.greeting("Wei Xi");
        debbie.weather();
        System.out.println("50 feet is equal to " + debbie.convertFeetToMeters(50) + " meters.");
        debbie.favoriteNumber(5);
        System.out.println("The sum of 5, 5, and 5 is " + debbie.addNumbers(5,5,5));
        System.out.println("5 times 5 is " + debbie.multiplication(5,5));
        debbie.money(50);
        System.out.println(debbie.goodbye());
    }
}
