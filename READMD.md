# gRPC [Java] Master Class: Build Modern API and Microservices 



# Instroduction

> Note. 본 튜토리얼은 OReiliy 의 Video 강의인 "()[https://learning.oreilly.com/videos/grpc-java-master/9781838558048/]"의 내용을 간단한 설명과 코드로 구현한 것이다. 좀더 자세한 내용을 원하면 해당 강의를 듣기를 권장한다. 

# Pre-Installation
Java SDK
IntelliJ Community Edition


# 환경 구성하기
gradle에 Defendency 추가
https://github.com/grpc/grpc-java

build.gradle

라이브러리를 추가한다. 
implementation 'io.grpc:grpc-netty-shaded:1.41.0'
implementation 'io.grpc:grpc-protobuf:1.41.0'
implementation 'io.grpc:grpc-stub:1.41.0'
compileOnly 'org.apache.tomcat:annotations-api:6.0.53' // necessary for Java 9+


plugin을 추가한다.
Repository
ProtocolBuffer셋팅을 한다.
Build시 .proto 파일을 Genertate 한다.
Gralde -> Tasks -> Others -> 

IntelliJ IDEA -> Preferences -> Builds, Excutions, Development -> Build Tools -> Gradle -> Build and run using, Run test using: 
IntelliJ IDEA
Shtutdown 시그널을 받아서 처리한다.

# Tutorial Concepts
Unary
Client Streaming
Server Streaming
Bi Directional Streaming


# Greeting Server (Unary)
proto 

Server

Client

# Client Streming
proto

Server

Client

# Server Streaming 
proto

Server

Client

# Bi-direction Streaming
proto

Server

Client

