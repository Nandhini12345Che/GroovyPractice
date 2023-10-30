package com.pratice.grails

import grails.transaction.Transactional

@Transactional
class TeacherService {

     def get(id){
        Teacher.get(id)
    }

    def list() {
        Teacher.list()
    }

    def save(Teacher){
        Teacher.save()
    }

    def delete(id){
        Teacher.get(id).delete()
    }
}
