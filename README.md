Overview
---

This error is similar to the one reported here:
https://github.com/grails/grails-core/issues/13486

## Error Message

ERROR --- [nio-8080-exec-7] o.g.web.errors.GrailsExceptionResolver   : GroovyCastException occurred when processing request: [GET] /example/echo - parameters:
person: George Doe
Cannot cast object 'George Doe' with class 'java.lang.String' to class 'brokenBinding.Person'. Stacktrace follows:

## How to reproduce

Run the application:

    ./gradlew bootRun

Browse to:

    http://localhost:8080/example/echo?person=George+Doe

