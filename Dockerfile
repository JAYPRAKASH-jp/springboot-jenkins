FROM openjdk:8
EXPOSE 8080
ADD target/springboot-jenkins-docker-integration.jar springboot-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-docker-integration.jar"]