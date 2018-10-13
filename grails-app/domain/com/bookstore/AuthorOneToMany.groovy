package com.bookstore

class AuthorOneToMany {

    String name

    static hasMany = [books: BookOneToMany]

    static constraints = {
    }
}
