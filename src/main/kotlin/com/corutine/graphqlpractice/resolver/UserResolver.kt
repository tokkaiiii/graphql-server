package com.corutine.graphqlpractice.resolver

import com.corutine.graphqlpractice.entity.user.User
import com.corutine.graphqlpractice.input.AddUserInput
import com.corutine.graphqlpractice.service.UserService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class UserResolver(
    private val userService: UserService
) {

    @QueryMapping
    fun getUsers(): MutableList<User> {
        return userService.getUsers()
    }

    @MutationMapping
    fun addUser(
        @Argument addUserInput: AddUserInput): User {
        println("[이름: ${addUserInput.name} 이메일: ${addUserInput.email}]")
        return userService.addUser(addUserInput)
    }

}