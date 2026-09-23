# run the application from the command line with ... Maven

```shell
$ ./mvnw spring-boot:run
```

(Either use a web browser or)
Use another terminal window to issue these HTTP request:
```shell
$ curl localhost:8080/greeting
<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p >Hello, World!</p>
</body>
</html>



$ curl 'localhost:8080/greeting?name=Mary'
<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p >Hello, Mary!</p>
</body>
</html>
```

# build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that

build the JAR file with
```shell
./mvnw clean package
```

run the JAR file, as follows:
```
java \
    -jar target/tutorial-about-java-20-0.0.1-SNAPSHOT.jar
```

Issue the above-mentioned HTTP request (either via a web browser or via `curl`).
