/*
 * This file is generated by jOOQ.
 */
package com.example.demo.com.example.demo.infrastructure.jooq.generated;


import com.example.demo.com.example.demo.infrastructure.jooq.generated.tables.FlywaySchemaHistory;
import com.example.demo.com.example.demo.infrastructure.jooq.generated.tables.Tasks;
import com.example.demo.com.example.demo.infrastructure.jooq.generated.tables.Users;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in task_manage
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>task_manage.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>task_manage.tasks</code>.
     */
    public static final Tasks TASKS = Tasks.TASKS;

    /**
     * The table <code>task_manage.users</code>.
     */
    public static final Users USERS = Users.USERS;
}
