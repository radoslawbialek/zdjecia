package pl.radoslawbialek.tutorial.obrazy.data

import pl.radoslawbialek.tutorial.obrazy.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}