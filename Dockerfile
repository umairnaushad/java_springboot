FROM tomcat:9.0-slim

COPY ./target/spring-hello-1.0.0.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh","run"]
