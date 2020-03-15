# NOTE: This Dockerfile is used to deploy CVMicroservice
#
# NOTE: It's based on alpine image instead of alpine/git
#       I prefered this official image over the alpine/git
#   
FROM alpine

# JAVA_HOME, M2_HOME and other env will be set here
ENV JAVA_HOME /usr/lib/jvm/default-jvm/

WORKDIR /CVMicroservice

# Install JDK 8
RUN apk update
RUN apk fetch openjdk8
RUN apk add openjdk8

# Install maven
RUN apk fetch maven
RUN apk add maven

EXPOSE 8080
# expose these ports on the docker virtual network
# you still need to use -p or -P to open/forward these ports on host

COPY . /CVMicroservice

RUN cd /CVMicroservice && mvn package
RUN cp /CVMicroservice/target/CVMicroservice-0.0.1-SNAPSHOT.jar /
RUN rm -rf /CVMicroservice

ENTRYPOINT ["java","-jar", "/CVMicroservice-0.0.1-SNAPSHOT.jar"]
# CMD ["/bin/bash"]
# required: run this command when container is launched
# only one CMD allowed, so if there are multiple, last one wins