package com.corutine.graphqlpractice.service

import com.corutine.graphqlpractice.entity.user.User
import com.corutine.graphqlpractice.input.AddUserInput
import com.corutine.graphqlpractice.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun getUsers(): MutableList<User> {
        val findAll = userRepository.findAll()
        val createdAt = findAll.firstOrNull { it.id == 1 }?.createdAt
        println("생성일 ${createdAt}")
        return findAll
    }

    @Transactional
    fun addUser(addUserInput: AddUserInput): User {
        val user = User(addUserInput.name,addUserInput.email)
        println("user = ${user}")
        val save = userRepository.save(user)
        println("[저장 유저${save}]")
        return save

    }
}