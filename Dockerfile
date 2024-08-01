FROM openjdk:17-jdk-slim

# Install necessary dependencies
RUN apt-get update && apt-get install -y wget

# Download Cloud SQL Auth Proxy
RUN wget https://dl.google.com/cloudsql/cloud_sql_proxy.linux.amd64 -O /cloud_sql_proxy \
    && chmod +x /cloud_sql_proxy \
    && mv /cloud_sql_proxy /usr/local/bin/cloud_sql_proxy

VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# add proxy so it can connect the database running on the Google Cloud SQL via localhost
#ENTRYPOINT ["/cloud_sql_proxy", "-instances=circular-unity-429020-n1:us-central1:volunteer-hub-database=tcp:1433", "&", "java", "-Dspring.profiles.active=prod", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["sh", "-c", "/usr/local/bin/cloud_sql_proxy -instances=verdant-upgrade-431200-i7:us-central1:volunteer-hub=tcp:1433 & java -Dspring.profiles.active=prod -Djava.security.egd=file:/dev/./urandom -jar app.jar"]
# Then use below commands deploy this project on the Google Cloud Run.
# mvn clean package
# docker build --platform linux/amd64 -t gcr.io/circular-unity-429020-n1/volunteer-hub:1.0 .
# docker push gcr.io/circular-unity-429020-n1/volunteer-hub:1.0
# gcloud run deploy --image gcr.io/circular-unity-429020-n1/volunteer-hub:1.0 --platform managed



# easier way is deploy the jar package:
# gcloud init
# gcloud app deploy app.jar