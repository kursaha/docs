curl --location 'https://mailkeets.kursaha.com/api/mail-send' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <replace-with-api-key>' \
--data-raw '{
    "fromName": "John",
    "fromAddress": "john@doe.com",
    "to": "hello@test.com",
    "subject": "This is test subject",
    "body": "This is test subject",
    "requestIdentifier": "800367b7-3b3a-423c-8006-eb63cc34c13c",
    "unsubscribedList": "<mailto:unsubscribe@example.com>, <http://www.unsubscribe.example.com/>"
}'