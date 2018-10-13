package com.bookstore


import grails.rest.*
import grails.converters.*

class BookStoreController {
    def bookStoreService
	static responseFormats = ['json', 'xml']
	
    def registerOneToManyAuthor(AuthorOneToMany author) {
        respond bookStoreService.registerOneToManyAuthor(author)
    }

    def registerManyToOneAuthor(AuthorManyToOne author) {
        respond bookStoreService.registerManyToOneAuthor(author)
    }

    def registerOneToManyBook(BookOneToMany book) {
        respond bookStoreService.registerOneToManyBook(book)
    }

    def registerManyToOneBook(BookManyToOne book) {
        respond bookStoreService.registerManyToOneBook(book)
    }
}
