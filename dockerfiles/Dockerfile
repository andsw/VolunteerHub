FROM --platform=linux/arm64 openjdk:17
ARG PLATFORM=linux/amd64
LABEL authors="Shaowen He"
WORKDIR /app
# copy app.jar from the host to the container
COPY app.jar app.jar
# doesn’t affect our Docker image’s ability to build or run. include it since it serves as a way of documenting
# and of informing the container’s user about which ports are to be published.
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/app/app.jar"]

