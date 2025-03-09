package com.taihuynh.bookstore.domain

data class Book (
    var isbn: Long,
    var title: String,
    var author: Author,
    var description: String,
    var image: String,
)