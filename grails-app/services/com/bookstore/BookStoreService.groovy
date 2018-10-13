package com.bookstore

import grails.gorm.transactions.Transactional

@Transactional
class BookStoreService {

    def registerOneToManyAuthor(AuthorOneToMany author) {
        return author.save(flush: true, failOnError: true)
    }

    def registerManyToOneAuthor(AuthorManyToOne author) {
        return author.save(flush: true, failOnError: true)
    }

    def registerOneToManyBook(BookOneToMany book) {
        return book.save(flush: true, failOnError: true)
    }

    def registerManyToOneBook(BookManyToOne book) {
        return book.save(flush: true, failOnError: true)
    }
}
