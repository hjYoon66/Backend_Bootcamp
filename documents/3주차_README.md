# 3주차 과제 💻
## 간단한 Restful API 구현 💎
* SpringBoot, RestController를 이용하여 백엔드를 이해
* 간단한 RestController 구현 (20년도 접속자 리스트 출력)
## 스프링부트로 개발 환경 설정하기
* SpringBoot를 이용해 test
* http://localhost:8031/test
  
![설정 test](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/da5bd2d3-ca07-40a2-b9e6-ea13a4d1ef37)


## 통계 API를 위한 DB table 생성
- `statistic DB`
  
![db](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/5c880ed7-2f32-4e67-a1a7-777e6a290f92)  

- `requsetInfo 테이블`
  
![requestinfo](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/b96aa724-3a15-4328-9e31-6a2dee836f94)

- `resquestCode 테이블`

  ![requestCode](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/be2e1173-4b11-4ced-ac15-9f2d24ec1448)

- `user 테이블`

   ![user](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/89d2dd00-5576-4910-b7ea-d167ceec8e24)

## 스프링부트, Mybatis, mariadb 연동
* 20년도 접속자 리스트를 출력하는 URL
* http://localhost:8031/sqlyear-statistic?year=20
* Json 형식으로 받아옴

  ![json](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/72d3b08b-00b2-4a20-9398-dedbf3525a8a)

## 통계 API 구축 SQL 
1. 년월별 접속자 수
   
   ![년월별 접속자 수](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/1c4dd771-b71f-4e10-b250-e0276d5e0dec)
2. 년월일자별 접속자 수

   ![년월일별접속자수](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/70fd9164-93c4-405c-9039-c723c04d02f7)
3. 평균 하루 로그인 수

   ![평균 하루 로그인 수](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/c316125b-b656-41d3-a954-822c86800204)

4. 부서별 월별 로그인 수

    ![부서별 년월별 로그인 수](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/dd7fbe57-fcc0-499a-b729-b0286c38843c)

