
## Facebook Login 

๐๐ป **์ฐธ๊ณ ์๋ฃ** 

 1. https://developers.facebook.com/docs/facebook-login/android#quickstarts-header
 
 3. https://ahsensaeed.com/kotlin-android-firebase-all-social-login/


<img src="https://user-images.githubusercontent.com/58849278/120606919-a5230a00-c48a-11eb-870e-fca896a08f12.gif" width = 50%>


## ๐ Juyae's Calendar ๐

:cloud: **Custom Calendar**

<img src="https://user-images.githubusercontent.com/58849278/120454022-7b0c1200-c3ce-11eb-8f58-c204b05889ef.gif" width = 40%>


## :speaker: Firebase Practice

 1. **FCM + Firebase Push Notification** 
	 
	<img src="https://user-images.githubusercontent.com/58849278/119821583-b372a280-bf2d-11eb-854a-7684d05bfbb0.png" width =40% >
	

 2. **Tools-> Firebase -> Cloud messaging** 
 
	 (1) connect your app to firebase 
	 
	 (2) add FCM to your app 
	 
	 (3) Firebase -> ๋์ ์ฝ์๋ก ์ด๋ -> ํด๋ผ์ฐ๋ฉ ๋ฉ์ธ์ง -> ๊ธฐ๊ธฐ ์ถ๊ฐ -> ์ฐ๊ฒฐ 
	 
	 
 3. **FirebaseMessagingService class ํ์ผ ๋ง๋ค์ด์ฃผ๊ธฐ** 
 
 
 
 4. **MainActivity ์์๋ getToken**
 
	 <img src ="https://user-images.githubusercontent.com/58849278/119822601-ce91e200-bf2e-11eb-8248-e9f6c8f094f1.png" width =70% >
	 
	 -> ์ด ๋ถ๋ถ์์ notification ๋ง๊ณ  data๋ฅผ ์จ์คฌ๋๋ data title ๊ฐ๋ถํฐ ๋์ด์ค์ง ์์์ notification์ผ๋ก ๋ฐ๊พธ์ด์ฃผ์๋๋ ๋์ด์๋ค. 
	 

5. **Conclusion**

<img src="https://user-images.githubusercontent.com/58849278/119821714-dac96f80-bf2d-11eb-9d5a-3f8f6403026c.png" width =50% > 
 
## Gallery์์ Image ๊ฐ์ ธ์ค๊ธฐ 

Image Button Gallery ๋ฒํผ ํด๋ฆญ -> ์ฌ์ฉ์ ํธ๋ํฐ์ ๊ฐค๋ฌ๋ฆฌ์์ ์ด๋ฏธ์ง ๊ฐ์ ธ์ค๊ธฐ 

* ์ ๋ฎฌ๋ ์ดํฐ์ ๊ฐค๋ฌ๋ฆฌ๋ ๋น์นธ์ผ๋ก ๋์ด ! 


## Coroutine 

Coroutine์ Thread/ AsyncTask/Rx ์์์ ๋์ ํ  ์ ์๋ Asynchronous/Non-Blocking Programming์ ์ ๊ณตํ๋ *Light-Weight Threads* ๋ก ๊ฐ๋ณ๊ณ  ์ ์ฐํ ๋ณ๋ ฌ ํ๋ก๊ทธ๋๋ฐ์ ์ํ ๊ธฐ์  

## Kotlin ์ฝ๋ฃจํด์ผ๋ก ์ฑ ์ฑ๋ฅ ํฅ์ 

์ฝ๋ฃจํด์ ์ ์ฌ์ฉํ ๊น ? ํฌ๊ฒ 5๊ฐ์ง๋ก ์์๋ณด์ 

**๋น๋๊ธฐ ์ฝ๋ ์์ฑ**

 - ๋คํธ์ํฌ ํธ์ถ์ด๋ ๋์คํฌ ์์๊ณผ ๊ฐ์ ์ฅ๊ธฐ ์คํ ์์์ ๊ด๋ฆฌํ๋ฉด์ ์ฑ์ ์๋ต์ฑ์ ์ ์งํ๋ ๊น๋ํ๊ณ  ๊ฐ์ํ๋ ๋น๋๊ธฐ ์ฝ๋ ์์ฑ ๊ฐ๋ฅ 
 
 **์ฅ๊ธฐ ์คํ ์์ ๊ด๋ฆฌ**
 
 - ์ฅ๊ธฐ ์คํ ์์์ ์ฒ๋ฆฌํ๋ ๋ ์์์ ์ถ๊ฐํ์ฌ ์ผ๋ฐ ํจ์๋ฅผ ๊ธฐ๋ฐ์ผ๋ก ๋น๋ 
 - invoke ๋ฐ return ์ธ์๋ suspend ๋ฐ resume ์ถ๊ฐ 

**์คํ ํ๋ ์**

 - ๋ก์ปฌ ๋ณ์์ ํจ๊ป ์คํ ์ค์ธ ํจ์ ๊ด๋ฆฌ 
 - Coroutine ์ ์งํ๋ฉด ํ์ฌ ์คํ ํ๋ ์์ด ๋ณต์ฌ๋๊ณ  ์ ์ฅ๋์ด ์ฌ๊ฐ๋  ์ ์ ์ฅ๋ ์์น์์ ๋ค์ ๋ณต์ฌ๋๊ณ  ์คํ 
 - ์ผ๋ฐ์ ์ธ ์์ฐจ ์ฐจ๋จ ์์ฒญ์ฒ๋ผ ๋ณด์ผ ์๋ ์์ง๋ง ๋คํธ์ํฌ ์์ฒญ์ด ๊ธฐ๋ณธ ์ค๋ ๋๋ฅผ ์ฐจ๋จํ์ง ์๋๋ก ํจ 

**๊ธฐ๋ณธ ์์ **

 - Kotlin์์ ๋ชจ๋  ์ฝ๋ฃจํด์ ๊ธฐ๋ณธ ์ค๋ ๋์์ ์คํ ์ค์ธ ๊ฒฝ์ฐ์๋ ๋์คํจ์ฒ์์ ์คํ 
 - Kotlin์์ ์์ฒด์  ์ ์ง๋  ์ ์์ผ๋ฉฐ ๋์คํจ์ฒ๋ Coroutine ์ฌ๊ฐ๋ฅผ ๋ด๋น 
	 -   **Dispatchers.Main**  - ์ด ๋์คํจ์ฒ๋ฅผ ์ฌ์ฉํ์ฌ ๊ธฐ๋ณธ Android ์ค๋ ๋์์ ์ฝ๋ฃจํด์ ์คํํฉ๋๋ค. ์ด ๋์คํจ์ฒ๋ UI์ ์ํธ์์ฉํ๊ณ  ๋น ๋ฅธ ์์์ ์คํํ๊ธฐ ์ํด์๋ง ์ฌ์ฉํด์ผ ํฉ๋๋ค. ์๋ฅผ ๋ค์ด  `suspend`  ํจ์๋ฅผ ํธ์ถํ๊ณ  Android UI ํ๋ ์์ํฌ ์์์ ์คํํ๋ฉฐ  [`LiveData`](https://developer.android.com/topic/libraries/architecture/livedata?hl=ko)  ๊ฐ์ฒด๋ฅผ ์๋ฐ์ดํธํจ 
	-   **Dispatchers.IO**  - ์ด ๋์คํจ์ฒ๋ ๊ธฐ๋ณธ ์ค๋ ๋ ์ธ๋ถ์์ ๋์คํฌ ๋๋ ๋คํธ์ํฌ I/O๋ฅผ ์คํํ๋๋ก ์ต์ ํ๋์ด ์์ ์๋ฅผ ๋ค์ด  [ํ์์ค ๊ตฌ์ฑ์์](https://developer.android.com/topic/libraries/architecture/room?hl=ko)๋ฅผ ์ฌ์ฉํ๊ณ  ํ์ผ์์ ์ฝ๊ฑฐ๋ ํ์ผ์ ์ฐ๋ฉฐ ๋คํธ์ํฌ ์์์ ์คํ
	
	-   **Dispatchers.Default**  - ์ด ๋์คํจ์ฒ๋ CPU๋ฅผ ๋ง์ด ์ฌ์ฉํ๋ ์์์ ๊ธฐ๋ณธ ์ค๋ ๋ ์ธ๋ถ์์ ์คํํ๋๋ก ์ต์ ํ๋์ด ์์ต๋๋ค. ์๋ฅผ ๋ค์ด ๋ชฉ๋ก์ ์ ๋ ฌํ๊ณ  JSON์ ํ์ฑ

**Background Task๊ฐ ํ์ํ ๋ํ์ ์ธ ๊ฒฝ์ฐ** 

 - ๋คํธ์ํฌ Request (Retrofit, OkHttp3, UrlConnection ๋ฑ) 
 - ๋ด๋ถ DataBase (Room, SQLite ๋ฑ) 

## Thread์ ์ฐจ์ด์  

  Thread 
 -   OS์ Native Thread์ ์ง์  ๋งํฌ๋์ด ๋์ํ๋ฏ๋ก ๋ง์ ์์คํ ์์์ ์ฌ์ฉ
    
 -   Thread๊ฐ ์ ํ ์์๋ CPU์ ์ํ ์ฒดํฌ๊ฐ ํ์ํ๋ฏ๋ก ๊ทธ๋งํผ์ ๋น์ฉ์ด ๋ฐ์
 
	 <img src="https://user-images.githubusercontent.com/58849278/122152297-09d36100-ce9c-11eb-9c29-151bce0c4cfd.png" width =50%>

 Coroutine

 -   Coroutine์ ์ฆ์ ์คํํ๋๊ฒ ์๋๋ฉฐ, Thread์ ๋ค๋ฅด๊ฒ OS์ ์ํฅ์ ๋ฐ์ง์๊ธฐ ๋๋ฌธ์ ๊ทธ๋งํผ์ ๋น์ฉ ์ ์ฝ
    
 -   Coroutine ์ ํ ์ Context Switch๊ฐ ๋ฐ์ํ์ง ์์
    
 -   ๊ฐ๋ฐ์๊ฐ ์ง์  ๋ฃจํด์ ์ธ์  ์คํํ ์ง, ์ธ์  ์ข๋ฃํ ์ง ๋ชจ๋ ์ง์ ์ด ๊ฐ๋ฅ
    
 -   ์ด๋ ๊ฒ ์์ฑํ ๋ฃจํด์ ์์ ์ ํ ์์ ์์คํ์ ์ํฅ์ ๋ฐ์ง ์์, ๊ทธ์ ๋ฐ๋ฅธ ๋น์ฉ์ด ๋ฐ์ํ์ง ์์

	 <img src="https://user-images.githubusercontent.com/58849278/122152391-2d96a700-ce9c-11eb-939e-13610472feea.png" width =50%>
	
	


**CoroutineScope& GlobalScope**
	

 - CoroutineScope๋ ์ฝ๋ฃจํด์ ๋ฒ์, ๋ธ๋ก์ ๋ฌถ์์ผ๋ก ์ ์ดํ  ์ ์๋ ๋จ์ 
 - GlobalScope๋ CoroutineScope์ ํ ์ข๋ฅ๋ก Top-level Coroutine, Application์ ์๋ช์ฃผ๊ธฐ์ ์ข์์ ์ผ๋ก ์กด์ฌ 

**CoroutineContext**

 - CoroutineContext๋ ์ฝ๋ฃจํด์ ์ด๋ป๊ฒ ์ฒ๋ฆฌํ  ๊ฒ์ธ์ง์ ๋ํ ์ ๋ณด ์งํฉ , ์ฃผ์ ์์๋ก๋ Job & Dispatcher ์กด์ฌ 

**Dispatcher**

 - Dispatcher๋ CoroutineContext์ ์ฃผ์ ์์
 - ์์์ ๋งํ๋ CoroutineContext๋ฅผ ์์ ๋ฐ์ ์ด๋ค ์ค๋ ๋๋ฅผ ์ด๋ป๊ฒ ๋์ํ  ๊ฒ์ธ๊ฐ์ ๋ํ ์ ์ 

## Coroutine ๊ถ์ฅ์ฌํญ 

**๋์คํจ์ฒ ์ฝ์**
์ ์ฝ๋ฃจํด์ ๋ง๋ค๊ฑฐ๋ withContext ๋ฅผ ํธ์ถํ  ๋ Dispatchers ๋ฅผ ํ๋์ฝ๋ฉ ํ์ง ๋ง ๊ฒ ! 

```
// DO inject Dispatchersclass NewsRepository(    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default) {    suspend fun loadNews() = withContext(defaultDispatcher) { /* ... */ }}// DO NOT hardcode Dispatchersclass NewsRepository {    // DO NOT use Dispatchers.Default directly, inject it instead    suspend fun loadNews() = withContext(Dispatchers.Default) { /* ... */ }}
```


**์ ์ง ํจ์๋ ๊ธฐ๋ณธ ์ค๋ ๋์์ ํธ์ถํ๊ธฐ์ ์์ ํด์ผ ํจ**

์ ์ง ํจ์๋ ๊ธฐ๋ณธ ์ค๋ ๋์์ ํธ์ถํ๊ธฐ์ ์์ ํ ๊ธฐ๋ณธ ์์  ํจ์์ฌ์ผ ํจ 

<img src="https://user-images.githubusercontent.com/58849278/122151195-15258d00-ce9a-11eb-9bdf-20f688540345.png" width =50%>

๋ค์๊ณผ ๊ฐ์ ํจํด์ ํตํด ์ฑ์ **ํ์ฅ ๊ฐ๋ฅ์ฑ**์ด ๋์์ง๋๋ฐ 
์ด๋ ์ ์ง ํจ์๋ฅผ ํธ์ถํ๋ ํด๋์ค๊ฐ ์์ ์ ํ์ ์ด๋ค Dispatcher ๋ฅผ ์ฌ์ฉํ  ์ง ๊ฑฑ์ ํ  ํ์๊ฐ ์์ . ์์์ ์คํํ๋ ํด๋์ค์ ์ฑ์์ด ์์ 


**ViewModel์ ์ฝ๋ฃจํด์ ๋ง๋ค์ด์ผ ํจ**

 - ๋ทฐ๋ ์ฝ๋ฃจํด์ ์ง์  ํธ๋ฆฌ๊ฑฐํ์ฌ ๋น์ฆ๋์ค ๋ก์ง์ ์คํํ๋ฉด ์ ๋๊ณ  ์ด ์ฑ์์ ViewModel์ ๋งก๊ฒจ ๋น์ฆ๋์ค ๋ก์ง์ ๋ ์ฝ๊ฒ ํ์คํธ ๊ฐ๋ฅ
 - ๋ํ ์์์ด viewModelScope์์ ์์๋๋ฉด ์ฝ๋ฃจํด์ด ๊ตฌ์ฑ ๋ณ๊ฒฝ์๋ ์๋ ์ ์ง 

**์์ธ์ ์ฃผ์**

 - ์ฝ๋ฃจํด์์ ๋ฐ์ํ๋ ์์ธ๋ฅผ ์๋ชป ์ฒ๋ฆฌํ๋ฉด ์ฑ์ด **๋น์ ์ ์ข๋ฃ** ๋  ์ ์์  
	 <img src="https://user-images.githubusercontent.com/58849278/122152025-90d40980-ce9b-11eb-8059-b516f28f36c9.png" width = 50%>


