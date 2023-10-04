---
order: 98
icon: log
tags: [template, engage data drive]
---

## How to Create a Mail or Message Template

This document provides instructions on how to create a template for emails or messages. Before creating a template, make sure that you have a valid datasource and query.

### Creating a Template

To create a template, follow these steps:

1. Give the template a name.
2. Choose the type of template you want to create, such as mail or message.

### Placeholder Format

When writing a template, it is important to use proper placeholders. The format for placeholders should be as follows: `[(${value})]`. Here, `value` is the query mapping name that you have given to build the query.

### Mail Template

We use [Thymeleaf](https://www.thymeleaf.org/index.html) for mail templating. When creating a mail template, you need to:

1. Choose the type of template you want to create, such as text or HTML.
2. Write your template, and include placeholders where you want dynamic content to appear.

#### Sample with Default Value

Consider the following sample template:

```
Dear [(${name != null ? name : 'Valuable Customer'})],
Please find attached the results of the report you requested.

Sincerely,
Kursaha Tech.
```

In this template, we have used the `name` placeholder, and given it a default value of `Valuable Customer`. When you provide the JSON data `{'name': 'Josh'}`, the output will be:

```
Dear Josh,
Please find attached the results of the report you requested.

Sincerely,
Kursaha Tech.
```

By using proper placeholders, you can create dynamic templates that can be filled with data for multiple users.


#### Sample with Array Value

Suppose we have an array of names in our JSON data, like this:

```
{
    "names": ["John", "Jane", "Joe"]
}
```

We can use this array in our template like so:

```
Dear [(${name})],

Here are the names you requested:
<ul>
    <li th:each="name : ${names}">
        <span th:text="${name}"></span>
    </li>
</ul>

Sincerely,
Kursaha Tech.


JSON Data: {"name": "Josh", "names": ["John", "Jane", "Joe"]}

```

Output:

```
Dear Josh,

Here are the names you requested:
<ul>
    <li>John</li>
    <li>Jane</li>
    <li>Joe</li>
</ul>

Sincerely,
Kursaha Tech.

```

In the above example, we use Thymeleaf's th:each attribute to iterate over the names array and create an HTML list of names. We also include a placeholder for the name of the person we are addressing the email to `[(${name})]`. This placeholder will be replaced with the value of the name property in the JSON data.

### Text To Speech Template

**Creating a Text-to-Speech Template:**

1. Navigate to Templates -> Create New Template -> Text To Speech.

2. During template creation, ensure you:
   - Provide a meaningful name.
   - Input the text message for audio conversion, supporting dynamic placeholders for personalized content and accommodating multiple messages in different languages.
   - Choose a wrapper ID, currently only supported in WhatsApp. For calls with this message, no wrapper ID selection is necessary; direct calling through the channel is available.

![Sample Text To Speech](/static/videos/Text_to_speech.mp4)

### Text To Video Template

**Creating a Text-to-Video Template:**

1. Navigate to Templates -> Create New Template -> Text To Video.

2. During template creation, ensure you:
   - Provide a meaningful name.
   - Input the text message for video conversion, supporting dynamic placeholders for personalized content and accommodating multiple messages in different languages.
   - Choose a wrapper ID, currently only supported in WhatsApp. A wrapper ID selection is necessary by which you can send video to Whatsapp.
