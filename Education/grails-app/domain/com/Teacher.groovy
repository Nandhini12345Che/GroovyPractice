package com.pratice.grails

class Teacher {
    String Name
    String subject
    Student student

    static constraints = {
        student nullable: true
    }
    
}