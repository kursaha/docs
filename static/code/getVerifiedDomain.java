
class Demo {
    private KursahaClient kursahaClient;
    public static void main(String[] args) {
        String apiKey = "<Demo-Api-key>";

        // Create an object of KursahaClient
        kursahaClient = new KursahaClient(apiKey);

        System.out.println(kursahaClient.mk.getVerifiedDomains());
    }
}