package com.example.demo.core.infrastructure

import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Tasks
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Users
import com.example.demo.core.domain.IUserRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class UserRepository(private val ctx: DSLContext): IUserRepository {
    override fun isJoin(user_id: Int, groupId: Int):Boolean{
        return ctx.fetchExists(
            (ctx.selectOne().from(Users.USERS)
                .where(Users.USERS.ID.eq(user_id))
                .and(Users.USERS.GROUP_ID.eq(groupId))
                    )
        )
    }
}