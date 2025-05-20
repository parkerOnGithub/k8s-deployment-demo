FROM openjdk:17
EXPOSE 8080
ADD target/k8s-deployment-demo.jar.jar k8s-deployment-demo.jar.jar
ENTRYPOINT [ "java","-jar","/k8s-deployment-demo.jar" ]
