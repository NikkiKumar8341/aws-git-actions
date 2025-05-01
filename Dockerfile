FROM openjdk:17-jdk-alpine

# Set the working directory inside the container

# Copy the application's jar to the container
ADD target/springboot-aws-exe.jar springboot-aws-exe.jar

# Expose port 8081 to the outside world
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "/springboot-aws-exe.jar"]


VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]