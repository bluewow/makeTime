# BackEnd
**JPA**

**RestFul API**

**MySQL**

## 작업일지

1. json 포맷의 날짜를 객체로 변경시 java parsing 이 안되는 문제가 생겼다
2. 2020\. 3. 8 과 같은 공백 또한 parsing 시 문제가 발생한다 

[https://jojoldu.tistory.com/361](https://jojoldu.tistory.com/361) 직렬화 관련 

결과적으로는 2020-03-08 포맷으로 변경 후 서버로 전달
서버쪽에서는 JsonFormat 어노테이션 + LocalDate type 을로 전달받음

------
query 문 디버깅을 위한 properties 옵션 추가

spring.jpa.properties.hibernate.format_sql=true  
spring.jpa.show-sql=true



<!--stackedit_data:
eyJoaXN0b3J5IjpbMzM0NDkxODQyLC0xNzM1MDg3OTIwLC02Nj
IyNTI2OTMsLTIxMDg3MDU3NDUsLTIwODg3NDY2MTJdfQ==
-->