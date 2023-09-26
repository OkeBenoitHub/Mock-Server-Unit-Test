package com.anushka.newsapiclient.domain.usecase

import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.util.Resource
import com.anushka.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(searchQuery:String): Resource<APIResponse>{
         return newsRepository.getSearchedNews(searchQuery)
     }
}