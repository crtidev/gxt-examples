FROM tomcat:9.0.70-jdk11-corretto-al2
ADD target/ROOT.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]