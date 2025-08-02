Overview
---

https://github.com/apache/grails-core/issues/14947

Probably related to #13486

## Error Message

ERROR --- [nio-8080-exec-7] o.g.web.errors.GrailsExceptionResolver   : GroovyCastException occurred when processing request: [GET] /example/echo - parameters:
person: George Doe
Cannot cast object 'George Doe' with class 'java.lang.String' to class 'brokenBinding.Person'. Stacktrace follows:

## How to reproduce

Run the application:

    ./gradlew bootRun

Browse to:

    http://localhost:8080/example/echo?person=George+Doe

