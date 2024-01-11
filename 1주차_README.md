# 1주차 과제  💻
## 개발 환경
* `Java 8`
* `Jdk 1.8`

![java-version](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/b5c139d0-6b28-42b5-acea-5206c489e275)

* IDE : `Eclipse 21.03`
* STS : `Spring Tools 3 Add-On for Spring Tools 4 3.9.22.RELEASE`
  
  ![sts](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/6fdbb918-7ae0-4e21-9388-7a90250d6cc6)

* WAS : `Tomcat 9.0`

  ![server](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/f5f05ad9-bdff-424c-9e7c-3080c10f16cf)

* DB : `MariaDB`
* Movie 테이블
  
![table](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/5ad00eb7-f57f-4e7c-bd71-28281aeba09e)


## 과제
* Theater 테이블에 데이터 넣기 및 조회
* Spring Legacy Project로 기본 설정
* `dao`, `service`, `vo` 단으로 나눠 MyBatis를 통해 DB에 연결 후 SQL을 보내 결과를 출력
* `MovieVO.java` 파일을 작성
  
![MovieVO](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/ff1fa0f8-39ee-445b-a206-45c9894622f2)

  
### 실행 화면

![실행화면](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/f08f7d9f-e8d2-4b8a-95bd-5d46969fc5f8)

* Tomcat에서 Path 설정 후 실행 화면

![홈](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/2d2ff14e-84f3-492c-92d1-de64b12a0bf5)


## API 추가
* name을 Parameter로 받아 영화의 정보를 얻어오는 API
* URL : http://localhost:8080/movie?name={movieName}

  ![아이언맨](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/c2efe5fb-5ae9-453d-b9dc-e6f22738184a)
![라이언킹](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/9a6040e4-69c8-4ccf-9a7f-d40ac2acf5fc)

