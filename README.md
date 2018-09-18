# java110
비트캠프 **자바 110기** 실습 프로젝트 

## v3.0
-웹서버를 중계 서버로 사용하기
-서블릿 컨테이너 적용


## v2.9
-웹브라우저를 클라이언트로 사용하기
-서버에 HTTP 프로토콜을 처리하는 기능 추가
-Command 패턴으로 분할된 메서드를 한 클래스로 합치기
-관련된 컨트롤러 클래스를 한 클래스로 만든다.
 + ManagerListController, ManagerAddController,ManagerDetailController, ManagerDeleteController 클래스를 ManagerController 로 합친다.
 + 학생 관리와 강사 관리도 마찬가지다.
 + 각각의 컨트롤러가 크지 않을 때는 관리하기 쉽게 한 클래스로 합치기도 한다.

## v2.8
-멀티스레드 적용하기(Connection-Oreinted에서 Stateless 방식으로 요청 처리)


## v2.7
-멀티스레드 적용하기(Connection-Oreinted에서 Stateful 방식으로 요청 처리)
-별도의 스레드를 만들어 Client의 요청을 처리하게 한다.
-즉, 동시에 여러 Client요청을 처리한다.

## v2.6
-Client/Server 구조로 변경
-소켓 프로그래밍 구현
-프로토콜 개념 이해 


## v2.5
-Spring IoC 컨테이너 도입
-기존에 만들었던 ApplicationContext 대신에 Spring Framework에서 제공하는 ApplicationContext 사용하기
-작업
 + Spring IoC 컨테이너 라이브러리 추가 (build.gradle 파일 편집)
   + spring context 로 mvn
   + 명령창에서 gradle eclipse 실행한다
   + 이클립스에서 프로젝트 refres
 + 스프링 설정 파일 추가 application-context.xml
    + bitcamp/java110/cms/conf/application-context.xml 
 +기존의 ApplicationContext 제거 



## v2.4
-DB 커넥션 공유하기
-DB 연결 객체를 재사용하여 가비지를 줄이고, 실행 속도를 높이기 위함 


## v2.3
-DAO에 JDBC적용
-Data Modeling과 forward engineering 수행
-테이블 다루기
-JDBC API활용
-트랙젝션다루기

## v2.2
-예외처리 적용
-예외처리 문법이 없던 시절
 + 리턴 값으로 예외 상황을 호출자에게 알렸다.
 + 특정 타입의 값을 리턴하는 경우 이 방법을 쓰기 곤란하다. 
-예외처리 문법이 등장
 + 리턴 값이 아닌 별도의 경로로 예외 상황을 호출자에게 알린다.
 + 이전 방식에 비해 메서드의 리턴 타입에 영향을 받지 않는다.
 + 예외 상황을 자세하게 호출자에게 알릴 수 있다.

## v2.1
-객체 Serialize(바이트 배열화+클래스정보 파일)/Deserialize(개체화) 적용
-java.io.Serializable 인터페이스 활용
-transient modifier 사용법
*용어 : Serialize = marshaling / Deserialize = Unmarshaling


## v2.0.1
-인터페이스와 구현체를 별도의 패키지로 분리


## v2.0
-DAO에 파일 입출력 도입
-DAO에 인터페이스 적용
-작업
 + 

## v1.9
-IoC 컨테이너가 객체 생성 후 수행하는 작업을 별도의 클래스로 분리한다.
-향후 객체 생성 후에 또 다른 작업을 추가하기 쉽도록 한다.
-작업
 + 

## v1.8
-의존 객체 주입하기 (DI)
-미니 IoC 컨테이너 개선
-작업
 + 의존 객체를 주입받을 수 있도록 setter 준비 
 + IoC 컨테이너가 setter로 자동으로 호출하도록 애노테이션으로 표시한다.

## v1.7
-DAO (Data Access Object)도입하기
 +데이터를 저장하는 방식이 바뀌더라도 기존 클래스에 영향을 주지 않게
 하려면, 데이터를 다루는 부분을 List가 아니라 별도의 클래스로 정의해
 야한다.
 + 즉 List을 통해 데이터를 메모리에 저장하는 대신에 파일이나 데이터베이스에 저장한다면 기존 코드를 변경해야하는 문제가 있다.
 + 이 부분을 해결하기 위함이다.
-작업
 + 학생 관리,강사 관리,매니저 관리 각각에 사용할 DAO클래스를 정의한다.


## v1.6
-Command 디자인 패턴 적용
-컨트롤러 구조 변경
-작업
 + 컨트롤러에서 명령을 처리하는 각가의 메서드를 별도의 클래스로 분리한다.
 

## v1.5
-리플렉션 API 활용2
-애노테이션 활용
-미니 IoC 컨테이너개선
-작업
 + 자동으로 생성되어야 할 객체에 붙일 애노테이션 정의
 + 컨트롤러 객체에 애노테이션 적용
 + 애노테이션이 붙은 클래스만 객체를 생성


## v1.4
-리플렉션 API활용
-미니 IoC(Inversion of Control : 역제어) 컨테이너 작성
-File 클래스로 디렉토리 및 파일 다루기

## v1.3
-인터페이스 활용 
-App 클래스와 Controller들 사이의 사용규칙을 인터페이스로 정의한다.

## v1.2
-자바 컬렉션 API 사용
-직접 제작한 List,  ArrayList, LinkedList 대신에 자바에서
제공하는 API사용

## v1.1
-인터페이스 적용
-데이터 목록을 다룰 때 호출하는 메서드의 규칙을 정의한다.
  1)다양한 방법으로 구현한 객체를 사용할 수 있다.
  2)즉, 규칙을 따르기만 한다면 어떤 객체라도 대체할 수 있다.
-인터페이스의 default 메서드의 활용 
-의존 객체 주입(Dependency Injection: DI)

## v1.0
-LinkedList 구동 원리 및 적용

## v0.9
-제네릭 활용법
-ArrayList에 제네릭 적용하기

## v0.8
-목록을 다루는 클래스들을 리팩토링하기
-StudentList , ManagerList, TeacherList 를 한 클래스로 합친다
-다형적 변수의 사용법
-생성자 사용
-클래스 멤버(변수,메서드,블록)와 인스턴스 멤버의 차이점

## v0.7
-(인스턴스)목록 다루기
-배열에 항목을 추가하고 삭제하는 기능을 추가한다.
-배열의 값 목록을 다루는 기능을 별도의 클래스로 분리한다.


## v0.6
-패키지 활용 및 클래스의 접근 범위

##v0.5
-조건문,반복문 활용
-강사, 학생, 매니저를 구분하여 입력받고 출력

## v0.4
-클래스활용

## v0.3
-메소드 활용하여 리팩토링

## v0.2
-배열 활용

## v0.1
-반복문 활용

## Initial Commit
-자바 프로젝트 디렉토리 구성