package org.sopt.firebasepractice

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.lang.Exception
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        printHashKey(requireContext())
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun printHashKey(pContext: Context) : Unit{
        try{
            val info : PackageInfo =
                pContext.getPackageManager().getPackageInfo(pContext.getPackageName(),
                PackageManager.GET_SIGNATURES)
            for (signature in info.signatures){
                val md : MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val hashKey = String(Base64.encode(md.digest(),0))
                println("printHashKey() Hash Key : $hashKey")
            }
        }
        catch (e: NoSuchAlgorithmException){

        }catch (e: Exception){

        }
    }



}