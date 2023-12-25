FROM openjdk:17
LABEL authors="alokkulkarni"
VOLUME /tmp
EXPOSE 9090
COPY build/libs/hvault-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]