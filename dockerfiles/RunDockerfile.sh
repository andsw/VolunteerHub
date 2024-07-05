# check the subnet of the sql container so java app can connect the sql container
# 1. get the network id of all container
docker network ls
# 2. get subnet ip
docker inspect e78b18260865

# then change host in the value of spring.datasource.url in the application.properties file

# generate jar package file
maven package

# move jar package from target to dockerfiles directory
mv ./target/VolunteerHub-0.0.1-SNAPSHOT.jar ./dockerfiles/app.jar

# generate image
docker build Dockerfile

# run container