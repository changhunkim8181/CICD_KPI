FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/*.jar

COPY build/libs/*.jar cicd.jar
ENTRYPOINT ["java","-jar","/cicd.jar"]

RUN ln -snf /usr/share/zoneinfo/Asia/Seoul /etc/localtime