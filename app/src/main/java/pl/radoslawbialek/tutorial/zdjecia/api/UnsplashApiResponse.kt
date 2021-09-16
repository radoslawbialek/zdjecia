package pl.radoslawbialek.tutorial.zdjecia.api

import pl.radoslawbialek.tutorial.zdjecia.data.UnsplashPhoto

data class UnsplashApiResponse(
    val results: List<UnsplashPhoto>
)
