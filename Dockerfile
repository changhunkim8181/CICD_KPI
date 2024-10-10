FROM openjdk:17-jdk
COPY build/libs/*.war demo-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.war"]

RUN ln -snf /usr/share/zoneinfo/Asia/Seoul /etc/localtime