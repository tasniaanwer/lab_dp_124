class EPostalMailService
{
    public void sendPostalMail(String name, String address, String zipCode, String message) {
        System.out.println("Sending Postal Mail to " + name + " at " + address + ", " + zipCode + " with message: " + message);
    }
}