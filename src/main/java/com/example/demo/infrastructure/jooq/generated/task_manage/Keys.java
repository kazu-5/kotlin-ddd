/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.task_manage;


import com.example.demo.infrastructure.jooq.generated.task_manage.tables.FLYWAY_SCHEMA_HISTORY_TABLE;
import com.example.demo.infrastructure.jooq.generated.task_manage.tables.USERS_TABLE;
import com.example.demo.infrastructure.jooq.generated.task_manage.tables.records.FlywaySchemaHistoryRecord;
import com.example.demo.infrastructure.jooq.generated.task_manage.tables.records.UsersRecord;

import javax.annotation.processing.Generated;

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

    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(USERS_TABLE.USERS, USERS_TABLE.USERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FLYWAY_SCHEMA_HISTORY_TABLE.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FLYWAY_SCHEMA_HISTORY_TABLE.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(USERS_TABLE.USERS, "KEY_users_PRIMARY", USERS_TABLE.USERS.ID);
    }
}