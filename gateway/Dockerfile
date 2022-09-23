FROM maven:3-eclipse-temurin-11-alpine AS build

COPY src/ /tmp/src/
COPY pom.xml /tmp/

ENV NAME gateway
ENV TYPE prod

WORKDIR /tmp

RUN mvn clean package -DskipTests

#ENTRYPOINT [ "/bin/bash" ]
FROM amazoncorretto:11-alpine AS run

RUN addgroup -g 4000 config
RUN adduser -u 4000 -G config -h /home/config -D config

COPY --from=build --chown=config:config /tmp/target/gateway-0.0.1-SNAPSHOT.jar /tmp/gateway-0.0.1-SNAPSHOT.jar
EXPOSE 9999
USER config

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/tmp/gateway-0.0.1-SNAPSHOT.jar" ]