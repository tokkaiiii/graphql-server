package com.corutine.graphqlpractice.repository

import com.corutine.graphqlpractice.entity.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}