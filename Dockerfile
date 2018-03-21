FROM 100.125.0.198:20202/hzwy23/java:1.8

MAINTAINER zhanwei_huang hzwy23@163.com

WORKDIR /opt

RUN git clone http://hzwy23:oWCPS-z1fBCvuHN6jXEj@49.4.10.35/hzwy23/basic.git

WORKDIR basic 

RUN mvn clean package -DskipTests=true

EXPOSE 8080

CMD java -jar target/basic-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
