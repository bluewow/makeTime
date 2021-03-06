# 작업환경 세팅

**Spring Boot 적용**

## Spring boot

Spring Boot Initializer 사용
- [https://start.spring.io/](https://start.spring.io/) 

추가 Dependencies
- Spring Web
- Spring Security
- Spring Data JPA
- Spring Boot Actuator
- Spring Boot DevTools
- Lombok
- MySQL

## 작업일지
--------
initializer 를 사용하여 압축파일을 내려받고, intellij 에서 import 후 실행시 DB 관련 에러가 발생했다
```text
Consider the following:

If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.

If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
```
이를 해결하기 위해 application.properties 에 mysql 관련 url 을 등록하였다

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.datasource.url=jdbc:mysql://localhost:3306/makeTime?serverTimezone=UTC&characterEncoding=UTF-8  
spring.datasource.username=khkim  
spring.datasource.password=xxxxx

-   driver-class-name
	com.mysql.cj.jdbc.Driver 사용
-   url
	localhost:3306/makeTime (table 명)
-   serverTimezone=UTC
   URL 쿼리 스트링에 serverTimezone을 작성해줘야 에러가 발생하지 않는다

----------

window pc 에 test용 MySQL 설치
- MySQL Server 8.0
- MySQL Workbench 8.0 CE
- mysql.exe 환경변수 추가
	- table 명 변경
-------

mustache dependencies 추가
- implementation 'org.springframework.boot:spring-boot-starter-mustache'

------
build tools -> gradle -> build, run target intellij 로 변경 (gradle default 인 경우 너무 느리다)







<!--stackedit_data:
eyJoaXN0b3J5IjpbNDA2ODg5NzU3LC0xNDU0Mzg4MDcyLC0xND
U4NTI1MDYwLDEwOTQ2NzYzNCw3MzA1MDEzMDUsMTM0NjMzMjYy
NiwtMjE0MDU2ODEzNywxODg3MjM3Mzg4LDg4Njc2NzU3M119
-->