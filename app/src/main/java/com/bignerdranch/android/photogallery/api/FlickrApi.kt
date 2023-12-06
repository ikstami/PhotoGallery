package com.bignerdranch.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET


interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
        "&api_key=784fef2a6f7234e136379c1e01c44983" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}
