public class SmartPhone implements CallFunction, SmsFunction, WebBrowsingFunction, CameraFunction {
    @Override
    public void makeCall(String contactNumber) {
        System.out.println("Calling " + contactNumber + " using SmartPhone...");
    }

    @Override
    public void sendSms(String messageContent) {
        System.out.println("Sending SMS: " + messageContent + " via SmartPhone.");
    }

    @Override
    public void browseWeb() {
        System.out.println("Browsing the internet...");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a high-quality picture...");
    }
}
