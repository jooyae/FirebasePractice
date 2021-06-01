package org.sopt.firebasepractice.gallery

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import org.sopt.firebasepractice.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {
    lateinit var binding : ActivityGalleryBinding
    private var imageUri : Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        uploadImageGallery()
    }

    fun uploadImageGallery(){
        binding.imageviewGallery.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, PICK_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data?.data
            var bitmap = binding.imageviewGallery as BitmapDrawable
            binding.imageviewGallery.setBackgroundResource(imageUri.hashCode())
        }
    }

    companion object {
        private const val PICK_IMAGE = 100
    }
}