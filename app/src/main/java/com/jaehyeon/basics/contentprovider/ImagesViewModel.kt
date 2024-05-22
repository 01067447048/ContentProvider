package com.jaehyeon.basics.contentprovider

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * Created by jaehyeon.
 * Date: 5/22/24
 */
class ImagesViewModel : ViewModel() {

    var images by mutableStateOf(emptyList<Image>())
        private set

    fun updateImages(images: List<Image>) {
        this.images = images
    }
}