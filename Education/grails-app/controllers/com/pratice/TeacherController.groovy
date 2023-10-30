package com.pratice.grails

class TeacherController {

    def TeacherService

    def index() {
        respond TeacherService.list()
    }

    def show(Long id) {
        respond TeacherService.get(id)
    }

    def create() {         
        respond new Teacher(params)
    }

    def save(Teacher Teacher) {
        TeacherService.save(Teacher)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        TeacherService.delete(id)
        redirect action:"index", method:"GET"
        
    }
}
