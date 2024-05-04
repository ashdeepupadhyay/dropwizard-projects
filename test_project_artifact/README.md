# test_project

How to start the test_project application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/test_project_artifact-1.0.0.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

#docker cmds

1. docker init 
2. docker build -t test_project_atrifact . 
3. mvn wrapper:wrapper 
4. docker build -t test_project_atrifact .
5. docker run -p 8080:8080 test_project_artifact
6. `http://localhost:8080` you will get 404 currently 
7. docker run -p 8081:8081 test_project_artifact
8. run this url `http://localhost:8081/healthcheck`

