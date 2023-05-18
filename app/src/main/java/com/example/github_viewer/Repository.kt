package com.example.github_viewer

data class RepositoryDetails(
    val name: String,
    val description: String,
    val language: String,
    val forks: Int,
    val stars: Int,
    val watchers: Int,
    val html_url: String,
    val license: License?,
    val readme: String
)

data class License(
    val name: String,
    val url: String
)