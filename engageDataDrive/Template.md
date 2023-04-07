---
order: 95
icon: log
tags: [template, engage data drive]
---

This document describes How to create a mail or message Template. There are some prerequisite for creating a template. Make sure that you have created a valid **Datasource** and **Query**.

## How to create a Template
- Give a name of that Template.
- Choose the Template type. For example, If you want to send email via this template, you can choose **mail** template.

### Mail Template
In **Mail Template** you have to
- choose type of the Template, like *text* or *html*.
- write your template. Please give the proper placeholder value so that we can fill your template correctly for multiple user. 

### Give Proper Placeholder in Template
When you are writing a template you should give proper placeholder. The format of the palceholder must be like this [!badge [($\{value\})\]]() where *value* is the query mapping name which we have given to build Query.