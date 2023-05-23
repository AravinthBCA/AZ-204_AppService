FROM openjdk:17-oracle
ADD target/*.jar app.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]