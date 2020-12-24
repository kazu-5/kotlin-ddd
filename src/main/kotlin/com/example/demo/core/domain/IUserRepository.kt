package com.example.demo.core.domain

interface IUserRepository {
    fun isJoin(user_id: Int, groupId: Int): Boolean
}