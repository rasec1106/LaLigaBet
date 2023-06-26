# We select our OS with openjdk
FROM openjdk:17-alpine 
# Say which port we are exposing
EXPOSE 8080
# Declaring and assigning a variable
ARG JAR_FILE=target/ApiGateway-0.0.1-SNAPSHOT.jar
# Add this file to the route
ADD ${JAR_FILE} app.jar
# Command to execute the jar in java
# java -jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]