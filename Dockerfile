# Pull base image
From tomcat:8-jre8

# Copy to images tomcat path
ADD /target/FoodStory-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
