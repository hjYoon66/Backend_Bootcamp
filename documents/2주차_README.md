# 2주차 과제 💻
## 인터페이스 가이드 문서 작성 📓
* SW활용률(접속자 수, 부서별 접속자 수, 로그인 요청 수, 게시글 작성 수)에 필요한 데이터가 무엇일 지 고민해보고 해당 내용에 맞게 문서를 작성(요청 파라미터 생각, 응답 데이터 포맷 고려)
  
- [SW 활용 현황 API.docx 보기](./SW활용현황API.docx)

## REST API ⚡
* REST(Representational State Transfer)의 약자로 자원을 이름으로 구분하여 해당 자원의 상태를 주고 받는 모든 것
* HTTP URI를 통해 자원을 명시하고, HTTP Method(POST, GET, PUT, DELETE, PATCH 등)을 통해 해당 자원에 대한 CRUD Operation을 적용하는 것
* CRUD(Create, Read, Update, Delete)
### REST 구성 요소
  1. 자원(Resources) : HTTP URI
  2. 자원에 대한 행위(Verb) : HTTP Method
  3. 자원에 대한 행위의 내용(Representations) : HTTP Message Payload
### REST 특징
1. Server-Client(서버-클라이언트 구조)
2. Stateless(무상태)
3. Cacheable(캐시 처리 가능)
4. Layered System(계층화)
5. Uniform Interface(인터페이스 일관성)

### REST의 장점
* HTTP 프로토콜의 인프라를 그대로 사용하므로 REST API 사용을 위한 별도의 인프라 구축 필요 X
* HTTP 표준 프로토콜에 따르는 모든 플랫폼에서 사용 가능
* REST API 메시지에 의도하는 바를 명확하게 나타냄
* 여러 가지 서비스 디자인에서 생길 수 있는 문제를 최소화
* 서버와 클라이언트의 역할을 명확히 분리

### REST의 단점
* 표준이 존재하지 않아 정의 필요
* HTTP Method가 제한적
* 구형 브라우저에서 호환이 되지 않아 지원해주지 못하는 동작이 많음

### REST API 설계 
1. URI는 동사보다는 명사, 대문자보다는 소문자 사용
2. 마지막에 슬래시(/)를 포함하지 않음
3. 언더바(_) 대신 하이픈(-)을 사용
4. 파일 확장자는 URI에 포함 X
5. 행위를 포함하지 않음

### REST가 필요한 이유
> 애플리케이션 분리 및 통합
> 
> 다양한 클라이언트의 등장
> 
> 서버의 다양화, 다양한 브라우저

## HTTP 통신 ⭐
* HTTP는 HTML 문서와 같은 리소스들을 가져올 수 있도록 해주는 프로토콜
* 클라이언트와 서버들은 개별적인 메시지 교환에 의해 통신함
* 클라이언트에 의해 전송되는 메시지를 요청(Request)라고 부르며, 서버에서 응답으로 전송되는 메시지를 응답(Response)라고 부름
* 비연결성 : 클라이언트와 서버가 한 번 연결을 맺은 후, 클라이어트 요청에 대해 서버가 응답을 마치면 맺었던 연결을 끊어 버리는 성질
* 무상태 프로토콜 : 서버가 클라이언트의 상태를 보존하지 않음

### 상태 코드
* 1XX(정보) : 요청을 받았으며 프로세스를 계속 진행
* 2XX(성공) : 요청을 성공적으로 받았으며 인식하고 수용
* 3XX(리다이렉션) : 요청 완료를 위해 추가 작업 조치가 필요
* 4XX(클라이언트 오류) : 요청의 문법이 잘못되었거나 요청을 처리 X
* 5XX(서버 오류) : 서버가 명백히 유효한 요청에 대한 충족 실패

### HTTP 메시지
* 요청 메시지
  
![요청](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/7a04af76-5911-41eb-a970-957a54188482)

* 응답 메시지
  
![응답](https://github.com/hjYoon66/Backend_Bootcamp/assets/101798354/c8cb8ec7-772b-4bc8-8cad-b0c2e8d7580f)


## 브라우저 흐름 💧
1. 주소창에 URL 입력
   
   * 주소를 치고 엔터를 누름과 동시에 URL 해석하는 과정 거침
   
2. DNS를 조회하여 IP 탐색
 
   * URL과 연결된 DNS 서버로 이동하여 URL에 할당된 IP 주소를 찾음
   
3. IP를 찾아 해당 IP가 존재하는 서버로 이동
 
   * 기기 고유의 값인 MAC 주소를 활용하고 여러 라우터를 거쳐서 호스트를 찾음. 이 때 ARP(Address Resolution Protocol) 사용

4. ARP를 이용하여 MAC 주소 반환
 
   * ARP는 수신지의 IP 주소를 바탕으로 MAC 주소를 조사

5. 웹 서버와 TCP 연결 시도

   * 클라이언트와 서버가 TCP 연결(3-way handshake)을 시도하여 성공하면, 통신 준비를 마쳤고 현재 통신이 연결되어 있음을 보장.
   * 3-way handshake : SYN -> SYN-ACK -> ACK
     
6. 클라이언트가 요청 후, 서버는 응답

   * 클라이언트는 GET, POST, PUT, DELETE 요청을 서버로 요청하면, 서버는 그에 맞는 데이터와 상태를 클라이언트에 응답

7. 통신 종료

   * 4-way handshake 절차를 통해 TCP 통신 종료

8. 웹 브라우저가 웹 문서를 출력

   * 브라우저 렌더링




