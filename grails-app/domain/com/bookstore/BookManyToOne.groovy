package com.bookstore

class BookManyToOne {

    String title

//    static belongsTo = AuthorManyToOne //TODO: enable this line to turn the relationship between AuthorManyToOne and BookManyToOne unidirectional
    static belongsTo = [author: AuthorManyToOne]
    // TODO: enable this line to turn the relationship between AuthorManyToOne and BookManyToOne bidirectional

    static constraints = {
    }
}
