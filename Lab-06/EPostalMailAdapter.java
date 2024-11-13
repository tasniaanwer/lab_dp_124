class EPostalMailAdapter implements Notification {
    private EPostalMailService ePostalMailService;
    public EPostalMailAdapter(EPostalMailService ePostalMailService) {
        this.ePostalMailService = ePostalMailService;
    }
    @Override
    public void sendNotification(String receiver, String message) {
        String[] receiverDetails = receiver.split(",");
        String name = receiverDetails[0];
        String address = receiverDetails[1];
        String zipCode = receiverDetails[2];

        ePostalMailService.sendPostalMail(name, address, zipCode, message);
    }
}