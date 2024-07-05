FROM openjdk:17
LABEL authors="shaowenhe"
ARG JAR_FILE=target/*.jar
COPY app.jar app.jar
VOLUME /tmp
EXPOSE 8080:8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/app.jar"]