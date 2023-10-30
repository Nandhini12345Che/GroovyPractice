package com.pratice.grails

class Student {
    String firstName
    String lastName
    String Subject
    static hasMany = [Teachers: Teacher]
}