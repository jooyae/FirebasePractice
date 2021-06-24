
## Facebook Login 

👉🏻 **참고자료** 

 1. https://developers.facebook.com/docs/facebook-login/android#quickstarts-header
 
 3. https://ahsensaeed.com/kotlin-android-firebase-all-social-login/


<img src="https://user-images.githubusercontent.com/58849278/120606919-a5230a00-c48a-11eb-870e-fca896a08f12.gif" width = 50%>


## 💙 Juyae's Calendar 💙

:cloud: **Custom Calendar**

<img src="https://user-images.githubusercontent.com/58849278/120454022-7b0c1200-c3ce-11eb-8f58-c204b05889ef.gif" width = 40%>


## :speaker: Firebase Practice

 1. **FCM + Firebase Push Notification** 
	 
	<img src="https://user-images.githubusercontent.com/58849278/119821583-b372a280-bf2d-11eb-854a-7684d05bfbb0.png" width =40% >
	

 2. **Tools-> Firebase -> Cloud messaging** 
 
	 (1) connect your app to firebase 
	 
	 (2) add FCM to your app 
	 
	 (3) Firebase -> 나의 콘솔로 이동 -> 클라우딩 메세지 -> 기기 추가 -> 연결 
	 
	 
 3. **FirebaseMessagingService class 파일 만들어주기** 
 
 
 
 4. **MainActivity 에서는 getToken**
 
	 <img src ="https://user-images.githubusercontent.com/58849278/119822601-ce91e200-bf2e-11eb-8248-e9f6c8f094f1.png" width =70% >
	 
	 -> 이 부분에서 notification 말고 data를 써줬더니 data title 값부터 넘어오지 않아서 notification으로 바꾸어주었더니 넘어왔다. 
	 

5. **Conclusion**

<img src="https://user-images.githubusercontent.com/58849278/119821714-dac96f80-bf2d-11eb-9d5a-3f8f6403026c.png" width =50% > 
 
## Gallery에서 Image 가져오기 

Image Button Gallery 버튼 클릭 -> 사용자 핸드폰의 갤러리에서 이미지 가져오기 

* 애뮬레이터의 갤러리는 빈칸으로 나옴 ! 


## Coroutine 

Coroutine은 Thread/ AsyncTask/Rx 작업을 대신할 수 있는 Asynchronous/Non-Blocking Programming을 제공하는 *Light-Weight Threads* 로 가볍고 유연한 병렬 프로그래밍을 위한 기술 

## Kotlin 코루틴으로 앱 성능 향상 

코루틴을 왜 사용할까 ? 크게 5가지로 알아보자 

**비동기 코드 작성**

 - 네트워크 호출이나 디스크 작업과 같은 장기 실행 작업을 관리하면서 앱의 응답성을 유지하는 깔끔하고 간소화된 비동기 코드 작성 가능 
 
 **장기 실행 작업 관리**
 
 - 장기 실행 작업을 처리하는 두 작업을 추가하여 일반 함수를 기반으로 빌드 
 - invoke 및 return 외에도 suspend 및 resume 추가 

**스택 프레임**

 - 로컬 변수와 함께 실행 중인 함수 관리 
 - Coroutine 정지하면 현재 스택 프레임이 복사되고 저장되어 재개될 시 저장된 위치에서 다시 복사되고 실행 
 - 일반적인 순차 차단 요청처럼 보일 수도 있지만 네트워크 요청이 기본 스레드를 차단하지 않도록 함 

**기본 안전**

 - Kotlin에서 모든 코루틴은 기본 스레드에서 실행 중인 경우에도 디스패처에서 실행 
 - Kotlin에서 자체적 정지될 수 있으며 디스패처는 Coroutine 재개를 담당 
	 -   **Dispatchers.Main**  - 이 디스패처를 사용하여 기본 Android 스레드에서 코루틴을 실행합니다. 이 디스패처는 UI와 상호작용하고 빠른 작업을 실행하기 위해서만 사용해야 합니다. 예를 들어  `suspend`  함수를 호출하고 Android UI 프레임워크 작업을 실행하며  [`LiveData`](https://developer.android.com/topic/libraries/architecture/livedata?hl=ko)  객체를 업데이트함 
	-   **Dispatchers.IO**  - 이 디스패처는 기본 스레드 외부에서 디스크 또는 네트워크 I/O를 실행하도록 최적화되어 있음 예를 들어  [회의실 구성요소](https://developer.android.com/topic/libraries/architecture/room?hl=ko)를 사용하고 파일에서 읽거나 파일에 쓰며 네트워크 작업을 실행
	
	-   **Dispatchers.Default**  - 이 디스패처는 CPU를 많이 사용하는 작업을 기본 스레드 외부에서 실행하도록 최적화되어 있습니다. 예를 들어 목록을 정렬하고 JSON을 파싱

**Background Task가 필요한 대표적인 경우** 

 - 네트워크 Request (Retrofit, OkHttp3, UrlConnection 등) 
 - 내부 DataBase (Room, SQLite 등) 

## Thread와 차이점 

  Thread 
 -   OS의 Native Thread에 직접 링크되어 동작하므로 많은 시스템 자원을 사용
    
 -   Thread간 전환 시에도 CPU의 상태 체크가 필요하므로 그만큼의 비용이 발생
 
	 <img src="https://user-images.githubusercontent.com/58849278/122152297-09d36100-ce9c-11eb-9c29-151bce0c4cfd.png" width =50%>

 Coroutine

 -   Coroutine은 즉시 실행하는게 아니며, Thread와 다르게 OS의 영향을 받지않기 때문에 그만큼의 비용 절약
    
 -   Coroutine 전환 시 Context Switch가 발생하지 않음
    
 -   개발자가 직접 루틴을 언제 실행할지, 언제 종료할지 모두 지정이 가능
    
 -   이렇게 생성한 루틴은 작업 전환 시에 시스템의 영향을 받지 않아, 그에 따른 비용이 발생하지 않음

	 <img src="https://user-images.githubusercontent.com/58849278/122152391-2d96a700-ce9c-11eb-939e-13610472feea.png" width =50%>
	
	


**CoroutineScope& GlobalScope**
	

 - CoroutineScope는 코루틴의 범위, 블록을 묶음으로 제어할 수 있는 단위 
 - GlobalScope는 CoroutineScope의 한 종류로 Top-level Coroutine, Application의 생명주기에 종속적으로 존재 

**CoroutineContext**

 - CoroutineContext는 코루틴을 어떻게 처리할 것인지에 대한 정보 집합 , 주요 요소로는 Job & Dispatcher 존재 

**Dispatcher**

 - Dispatcher는 CoroutineContext의 주요 요소
 - 위에서 말했던 CoroutineContext를 상속 받아 어떤 스레드를 어떻게 동작할 것인가에 대한 정의 

## Coroutine 권장사항 

**디스패처 삽입**
새 코루틴을 만들거나 withContext 를 호출할 때 Dispatchers 를 하드코딩 하지 말 것 ! 

```
// DO inject Dispatchersclass NewsRepository(    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default) {    suspend fun loadNews() = withContext(defaultDispatcher) { /* ... */ }}// DO NOT hardcode Dispatchersclass NewsRepository {    // DO NOT use Dispatchers.Default directly, inject it instead    suspend fun loadNews() = withContext(Dispatchers.Default) { /* ... */ }}
```


**정지 함수는 기본 스레드에서 호출하기에 안전해야 함**

정지 함수는 기본 스레드에서 호출하기에 안전한 기본 안전 함수여야 함 

<img src="https://user-images.githubusercontent.com/58849278/122151195-15258d00-ce9a-11eb-9bdf-20f688540345.png" width =50%>

다음과 같은 패턴을 통해 앱의 **확장 가능성**이 높아지는데 
이는 정지 함수를 호출하는 클래스가 작업 유형에 어떤 Dispatcher 를 사용할 지 걱정할 필요가 없음 . 작업을 실행하는 클래스에 책임이 있음 


**ViewModel은 코루틴을 만들어야 함**

 - 뷰는 코루틴을 직접 트리거하여 비즈니스 로직을 실행하면 안 되고 이 책임을 ViewModel에 맡겨 비즈니스 로직을 더 쉽게 테스트 가능
 - 또한 작업이 viewModelScope에서 시작되면 코루틴이 구성 변경에도 자동 유지 

**예외에 주의**

 - 코루틴에서 발생하는 예외를 잘못 처리하면 앱이 **비정상 종료** 될 수 있음  
	 <img src="https://user-images.githubusercontent.com/58849278/122152025-90d40980-ce9b-11eb-8059-b516f28f36c9.png" width = 50%>


