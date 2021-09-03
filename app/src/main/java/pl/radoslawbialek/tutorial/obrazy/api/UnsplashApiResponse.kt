package pl.radoslawbialek.tutorial.obrazy.api

import pl.radoslawbialek.tutorial.obrazy.data.UnsplashPhoto

data class UnsplashApiResponse(
    val results: List<UnsplashPhoto>
)
