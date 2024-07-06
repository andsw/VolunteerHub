# check the subnet of the sql server container so java app can connect the sql container
# 1. print the ids of all containers
docker container ls
# 2. get subnet ip
docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' f0dda83f1c4e
# Then change host in the value of spring.datasource.url in the application-prod.properties file!!!
# After this
# package the project
cd ..
mvn clean package

# move jar package from target to dockerfiles directory
mv ./target/VolunteerHub-0.0.1-SNAPSHOT.jar ./dockerfiles/app.jar
# if there is only docker (no java and maven) in your computer, you can ask for the latest jar file, and copy it to the ./dockerfile directory manually
# -----------------------------------------------------------------------------------------------------------------------------------------------------
cd dockerfiles
# Create docker image named team4/volunteer-hub:latest based on the Dockerfile
docker build . -t team4/volunteer-hub
# use this command to see all images
docker images -a
# run image to create a container in which the app is running, exposing the port 8080, connecting the database in the other container
docker run --hostname=712d771ec9d2 \
  --env=PATH=/usr/java/openjdk-17/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin \
  --env=JAVA_HOME=/usr/java/openjdk-17 --env=LANG=C.UTF-8 --env=JAVA_VERSION=17.0.2 --workdir=/app \
  -p 8080:8080 --label='authors=Shaowen He' --runtime=runc -t -d team4/volunteer-hub:latest
