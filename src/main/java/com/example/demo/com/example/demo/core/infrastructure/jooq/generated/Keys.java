/*
 * This file is generated by jOOQ.
 */
package com.example.demo.com.example.demo.core.infrastructure.jooq.generated;


import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.FlywaySchemaHistory;
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Tasks;
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Users;
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.records.FlywaySchemaHistoryRecord;
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.records.TasksRecord;
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.records.UsersRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>task_manage</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TasksRecord, Integer> IDENTITY_TASKS = Identities0.IDENTITY_TASKS;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<TasksRecord> KEY_TASKS_PRIMARY = UniqueKeys0.KEY_TASKS_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TasksRecord, UsersRecord> TASKS_IBFK_1 = ForeignKeys0.TASKS_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TasksRecord, Integer> IDENTITY_TASKS = Internal.createIdentity(Tasks.TASKS, Tasks.TASKS.ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<TasksRecord> KEY_TASKS_PRIMARY = Internal.createUniqueKey(Tasks.TASKS, "KEY_tasks_PRIMARY", Tasks.TASKS.ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, "KEY_users_PRIMARY", Users.USERS.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<TasksRecord, UsersRecord> TASKS_IBFK_1 = Internal.createForeignKey(com.example.demo.com.example.demo.core.infrastructure.jooq.generated.Keys.KEY_USERS_PRIMARY, Tasks.TASKS, "tasks_ibfk_1", Tasks.TASKS.USER_ID);
    }
}
