# 작업환경 세팅

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

## 일지
initializer 를 사용하여 압축파일을 내려받고, intellij 에서 import 후 실행시 DB 관련 에러가 발생했다
```text
Consider the following:

If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.

If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
```
이를 해결하기 위해 application.properties 에 mysql 관련 url 을 등록하였다

----------
window pc 에 test용 MySQL 서버 설치

-------







<!--stackedit_data:
eyJoaXN0b3J5IjpbLTIxNDA1NjgxMzcsMTg4NzIzNzM4OCw4OD
Y3Njc1NzNdfQ==
-->