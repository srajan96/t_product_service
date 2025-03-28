# Use a JDK 17 base image
FROM openjdk:17-jdk-slim

# Copy the JAR file into the container
COPY target/prodmgmtapi.jar prodmgmtapi.jar

# Expose the port your application will run on
EXPOSE 8092

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "prodmgmtapi.jar"]