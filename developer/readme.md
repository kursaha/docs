---
order: 96
icon: code
tags: [email, mailkeets]
---

# Developers

!!!info :bulb: SDK
SDK stands for **Software Development Kit**, which provides a set of libraries and tools that you can integrate into your application.
!!!

These documentation provides how you can use Kursaha sdk's to seamlessly connect to your system.


+++ Java
```
// build.gradle
dependencies {
    ...
    // https://mavenlibs.com/maven/dependency/com.kursaha/java-sdk
    implementation 'com.kursaha:java-sdk:0.0.16'
}

```

+++ NodeJs
```
  // package.json
  "dependencies": {
    ...
    "kursaha-sdk": "^1.0.8",
  }
```

+++ GoLang
```go
go get github.com/kursaha/go-sdk
```


+++ Rest API
Add these headers
1. **Content-Type** : You must set the content-type header to 'application/json'. Key-pair will look like Content-Type: application/json.
2. **Authorization** : You must set the Authorization header to 'Bearer Your-Api-Key'. Key-pair will look like Authorization: Bearer Your-Api-Key.
+++

