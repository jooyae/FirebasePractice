package org.sopt.firebasepractice.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.facebook.*
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailabilityLight
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging
import org.sopt.firebasepractice.R
import org.sopt.firebasepractice.base.BaseActivity
import org.sopt.firebasepractice.base.BaseViewModel
import org.sopt.firebasepractice.databinding.ActivityMainBinding
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.firebase.auth.FacebookAuthProvider
import org.sopt.firebasepractice.login.LoginFragment


class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_main
    override val viewModel: BaseViewModel by viewModels()
    private lateinit var loginManager: LoginManager
    private var callbackManager: CallbackManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        callbackManager = CallbackManager.Factory.create()
        FacebookSdk.sdkInitialize(getApplicationContext())
        AppEventsLogger.activateApp(this)

        FacebookSdk.setApplicationId(getString(R.string.facebook_app_id))

        FacebookSdk.sdkInitialize(this)

        if (BuildConfig.DEBUG) {

            FacebookSdk.setIsDebugEnabled(true)

            FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS)

        }

        setContentView(R.layout.activity_main)
        checkgooglePlayServices()
        loginFacebook()
        facebookLogin()

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w(
                    "FirebasePractice.TAG",
                    "Fetching FCM registration token failed",
                    task.exception
                )
                return@OnCompleteListener
            } else {
                val token = task.result
                val msg = getString(R.string.msg_token_fmt, token)
                Log.d("fbPractice.Success", msg)
            }
        })
    }

    private fun checkgooglePlayServices() : Boolean{
        val status =  GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this)
        return if (status != ConnectionResult.SUCCESS) {
            Log.e("error","error")
            false
        }  else {
            Log.e("updated", "updated")
            true
        }
    }

//    fun setCalendarFragment(){
//        val calendarFragment = CalendarFragment()
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.calendar_fragment, calendarFragment)
//        transaction.commit()
//    }

    fun loginFacebook(){
        val loginFragment = LoginFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.facebook_fragment, loginFragment)
        transaction.commit()
    }

    private fun facebookLogin() {
        LoginManager.getInstance()
            .logInWithReadPermissions(this, listOf("email", "public_profile"))

        LoginManager.getInstance()
            .registerCallback(callbackManager, object: FacebookCallback<LoginResult> {
                override fun onSuccess(result: LoginResult?) {
                    if (result?.accessToken != null) {
                        // facebook 계정 정보를 firebase 서버에게 전달(로그인)
                        val accessToken = result.accessToken
                        firebaseAuthWithFacebook(result?.accessToken)
                    } else {
                        Log.d("Facebook", "Fail Facebook Login")
                    }
                }

                override fun onCancel() {
                    //취소가 된 경우 할일
                }

                override fun onError(error: FacebookException?) {
                    //에러가 난 경우 할일
                }
            })
    }

    private fun firebaseAuthWithFacebook(accessToken: AccessToken?) {
        // AccessToken 으로 Facebook 인증
        val credential = FacebookAuthProvider.getCredential(accessToken?.token!!)

         //성공 시 Firebase 에 유저 정보 보내기 (로그인)
//        auth?.signInWithCredential(credential)
//            ?.addOnCompleteListener{
//                    task ->
//                if(task.isSuccessful){ // 정상적으로 email, password 가 전달된 경우
//                    // 로그인 처리
//
//                } else {
//                    // 예외 발생 시 메시지 출력
//                    Toast.makeText(this, task.exception?.message, Toast.LENGTH_LONG).show()
//                }
//            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager?.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun initStartView() {
        TODO("Not yet implemented")
    }

    override fun initDataBinding() {
        TODO("Not yet implemented")
    }

    override fun initAfterBinding() {
        TODO("Not yet implemented")
    }
}