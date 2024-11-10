package com.corutine.graphqlpractice.entity.user

import com.corutine.graphqlpractice.audit.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id

@Entity
data class User(
    var name: String,
    var email: String,
): BaseEntity() {
    @Id @GeneratedValue(strategy = IDENTITY)
    var id: Int? = null
}