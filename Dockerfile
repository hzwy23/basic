FROM hzwy23/java:1.8

MAINTAINER zhanwei_huang hzwy23@163.com

WORKDIR /opt

RUN git clone https://gitee.com/hzwy23/basic.git

WORKDIR basic

RUN mvn clean package -DskipTests=true

EXPOSE 8791

CMD java -jar target/basic-0.0.1-SNAPSHOT.jar
