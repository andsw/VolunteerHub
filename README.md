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
1. Add auto-generated api document, can be accessed by url:http://localhost:8080/swagger-ui/index.html#/ after running the project
   (reference blog: https://www.cnblogs.com/xiezhr/p/18253311), so frontend and backend developer can collaborate better.
   The api document website also can be used as api test tool.
2. Add dockerfile so the project can be deployed on the docker container.
3. Add all tables' CURD(create/update/read/delete) api which is present as the controller classes in the controller directory.
4. Add all frontend code into resource directory, so they can be accessed by springboot.
5. Add mockup data into the database tables, used for testing.
6. implement sign in/up, listing activities, present activities' detail info, activity join in features