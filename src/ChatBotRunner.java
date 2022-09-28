public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("debbie", 7);

        debbie.greeting("test");
        debbie.weather();
        debbie.favoriteNumber(8);
        double convert = debbie.convertFeetToMeters(12);
        int add = debbie.addNumbers(5,7,11);
        System.out.print("Here are some quick facts I already know: There are " + convert + " meters in 12 feet.");
        System.out.print(" I also know that 5 + 7 + 11 is equal to " + add);
        int multiply = debbie.multiplyNumbers(5,7,11);
        System.out.println(" Oh! And finally, I also know that 5 * 7 * 11 is " + multiply);
        debbie.message("You can do this!");
        String goodbye = debbie.goodbye();
        System.out.println(goodbye);
    }
}
