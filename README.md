# VolunteerHub
Project developed for System development and for reviewing rusted Java related technology stack
## Iteration 1
1. Initial springboot project, create packages.
2. Import required dependencies and plugins. (pom.xml)
3. Config mybatis to connect database. (/src/source/mybatis-config.xml)
4. Use TestController to test if the MVC structure can work, request can get response with test data stored in Test table.
5. Then config mybatis generator to generate entities and examples, mapper class and xml files(used to operate the database)
according to the tables in the sql server.
6. Git init, add, commit, push to remote repository, and then create branches.
7. Integrate frontend project into this project. And push changes to the remote repo.

## Iteration 2
1. add auto-generated api document, can be accessed by url:http://localhost:8080/swagger-ui/index.html#/ after running the project
   reference blog: https://www.cnblogs.com/xiezhr/p/18253311