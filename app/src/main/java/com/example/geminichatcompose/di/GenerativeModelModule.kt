package com.example.geminichatcompose.di

import android.content.Context
import com.example.geminichatcompose.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.generationConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ViewModelComponent::class)
object GenerativeModelModule {

    @Provides
    fun provideGenerativeModel(@ApplicationContext context: Context): GenerativeModel {
        val config = generationConfig {
            temperature = 0.7f
        }
        return GenerativeModel(
            modelName = "gemini-1.5-flash-latest",
            apiKey = BuildConfig.geminiApiKey,
            generationConfig = config
        )
    }
}