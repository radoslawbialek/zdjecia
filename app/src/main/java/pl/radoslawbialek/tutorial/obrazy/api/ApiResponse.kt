package pl.radoslawbialek.tutorial.obrazy.api

import pl.radoslawbialek.tutorial.obrazy.data.Photo

data class ApiResponse(
    val results: List<Photo>
)
