FROM openjdk:11-jre-slim

COPY target/kraftwerke-1.0.0.jar /app/kraftwerke-1.0.0.jar

ENTRYPOINT exec java $JAVA_OPTS -jar app/kraftwerke-1.0.0.jar

EXPOSE 8080