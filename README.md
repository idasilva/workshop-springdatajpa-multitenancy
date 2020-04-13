# Workshop Spring Data JPA | Multitenancy

## Instalação JDK 8
* https://www.oracle.com/java/technologies/javase-jdk8-downloads.html</br>

## Extensões do VS Code:
As seguintes extensões do Visual Studio Code deverão estar instaladas:
* `Maven for Java (Microsoft)`
* `Debugger for Java (Microsoft)`
* `Java Test Runner (Microsoft)`
* `Language Support for Java (Red Hat)`
* `Java Extension Pack (Microsoft)`
* `Java Dependency Viewer (Microsoft)`
* `Spring Boot Extension Pack (Pivotal)`
* `Spring Boot Dashboard (Microsoft)`
* `Lombok Annotations Support`
* `REST Client`

## Instalação do Docker
* `Docker instalado e configurado`
* `Criar o seguinte container Docker: docker run -d -p 1521:1521 -p 8080:8080 wnameless/oracle-xe-11g-r2`

## Instalação driver JDBC Oracle
* `Fazer o download e instalação do seguinte driver JDBC - ojdbc7.jar`
* `mvn install:install-file -Dfile="ojdbc7.jar" -DgroupId="com.oracle" -DartifactId="ojdbc7" -Dversion="12.1.0" -Dpackaging=jar`

## Instalação do Maven

* https://maven.apache.org/download.cgi -> Instalar a versão 3.6.3</br>
* Caso esteja utilizando Windows vc poderá fazer a instalação do Maven via Chocolatey (Package Manager para Windows):</br>
•	https://chocolatey.org/</br>
•	https://chocolatey.org/packages/maven</br>

## Instalar O SQL Developer e fazer o teste de conexão com o Oracle database XE 11G que esta sendo executado no container Docker.
* `hostname: localhost`
* `port: 1521`
* `sid: xe`
* `username: system`
* `password: oracle`

## Criar 2 usuários no Oracle Database
```
CREATE USER tenant1 IDENTIFIED BY 123456;
GRANT CONNECT,RESOURCE,DBA TO tenant1;
GRANT UNLIMITED TABLESPACE TO tenant1;

CREATE USER tenant2 IDENTIFIED BY 123456;
GRANT CONNECT,RESOURCE,DBA TO tenant2;
GRANT UNLIMITED TABLESPACE TO tenant2;
```


