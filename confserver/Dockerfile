FROM maven:3-eclipse-temurin-8-alpine AS build

COPY src/ /tmp/src/
COPY pom.xml /tmp/

ENV NAME config-server
ENV TYPE prod

WORKDIR /tmp

RUN --mount=type=bind,target=/root/.m2,source=/root/.m2,from=smartcommunitylab/config-server:8-alpine-cache mvn clean package -DskipTests


FROM amazoncorretto:8-alpine AS run

RUN addgroup -g 4000 config
RUN adduser -u 4000 -G config -h /home/config -D config

COPY --from=build --chown=config:config /tmp/target/1.1-config-server-0.0.1-SNAPSHOT.jar /tmp/1.1-config-server-0.0.1-SNAPSHOT.jar

USER config

ENTRYPOINT [ "java", "-jar", "/tmp/1.1-config-server-0.0.1-SNAPSHOT.jar" ]