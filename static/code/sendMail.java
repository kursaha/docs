
class Demo {
    private KursahaClient kursahaClient;

    private MailRequestDto requestDto;

    // Create a random UUID
    private final String requestIdentifier = UUID.randomUUID().toString();

    public static void main(String[] args) {
        String apiKey = "<replace-me-with-api-key>";

        // Create an object of KursahaClient
        kursahaClient = new KursahaClient(apiKey);

        /**
         * Create a MailRequestDto object
         * If you don't want to send unsubscribedList, you can add empty string.
         */
        requestDto = new MailRequestDto(
            "John", // fromName
            "john@doe.com", // fromAddress
            "hello@test.com", // to
            "This is test subject", // subject
            "This is test body", // body
            requestIdentifier, // requestIdentifier
            "<mailto:unsubscribe@example.com>, <http://www.unsubscribe.example.com/>" // unsubscribedList
    );

        MailResponseDto responseDto = kursahaClient.mk.sendMail(requestDto);
        System.out.println("got trace Id as: ", responseDto.getTraceId());
    }
}
