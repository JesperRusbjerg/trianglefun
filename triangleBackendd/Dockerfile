FROM openjdk:18-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/triangleBackendd-0.0.1-SNAPSHOT.jar trianglebackendd.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar trianglebackendd.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar trianglebackendd.jar
