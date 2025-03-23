public class BasicPhone implements CallFunction, SmsFunction {
    @Override
    public void makeCall(String contactNumber) {
        System.out.println("Calling " + contactNumber + "...");
    }

    @Override
    public void sendSms(String messageContent) {
        System.out.println("Sending SMS: " + messageContent);
    }
}
