public class Main {
    public static void main(String[] args) {
        // Single Responsibility Principle (SRP) - Pet and Dog
        Pet myPet = new Dog("Bogart", "Deen");
        Dog myDog = (Dog) myPet; 

        System.out.println("1. ");
        System.out.println("Pet Name: " + myDog.getPetName());
        System.out.println("Owner Name: " + myDog.getOwnerName());
        System.out.println("Pet Sound: " + myDog.makeSound());
        System.out.println("Pet Eating: " + myDog.eat());

        System.out.println("\n----------------------------\n");

        Customer student = new Customer("Jake", new StudentDiscount());
        Customer senior = new Customer("Robert", new SeniorCitizenDiscount());
        Customer regular = new Customer("Sarah", new RegularCustomerDiscount());

        double amount = 100.0;

        System.out.println("2. ");
        System.out.println("Original Price: $" + amount);
        System.out.println("Student Price: $" + student.getDiscountedPrice(amount));
        System.out.println("Senior Price: $" + senior.getDiscountedPrice(amount));
        System.out.println("Regular Price: $" + regular.getDiscountedPrice(amount));

        System.out.println("\n----------------------------\n");

        BasicPhone nokia = new BasicPhone();
        SmartPhone iphone = new SmartPhone();

        System.out.println("3. ");
        nokia.makeCall("123-4567");
        nokia.sendSms("Hello!");

        System.out.println();

        iphone.makeCall("987-6543");
        iphone.sendSms("Hi there!");
        iphone.browseWeb();
        iphone.takePicture();

        System.out.println("\n----------------------------\n");

        PaymentProcessor ewalletProcessor = new PaymentProcessor(new EWalletPayment());
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());

        System.out.println("4. ");
        double paymentAmount = 50.0;
        ewalletProcessor.executePayment(paymentAmount);
        creditCardProcessor.executePayment(paymentAmount);
        cashProcessor.executePayment(paymentAmount);
    }
}
