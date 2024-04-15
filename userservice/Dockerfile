# ###### V2 without build, hardcoded package file. ########
FROM amazoncorretto:17-alpine-jdk

COPY target/userservice-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

