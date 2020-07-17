FROM adoptopenjdk/openjdk11

ARG APP_HOME=/app

WORKDIR $APP_HOME

COPY target/*.jar $APP_HOME/app.jar

ENTRYPOINT java $JAVA_OPTS -jar app.jar $JAVA_ARGS