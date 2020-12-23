/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.tables;


import com.example.demo.infrastructure.jooq.generated.Indexes;
import com.example.demo.infrastructure.jooq.generated.Keys;
import com.example.demo.infrastructure.jooq.generated.TaskManage;
import com.example.demo.infrastructure.jooq.generated.tables.records.TasksRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tasks extends TableImpl<TasksRecord> {

    private static final long serialVersionUID = 1050462260;

    /**
     * The reference instance of <code>task_manage.tasks</code>
     */
    public static final Tasks TASKS = new Tasks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TasksRecord> getRecordType() {
        return TasksRecord.class;
    }

    /**
     * The column <code>task_manage.tasks.id</code>.
     */
    public final TableField<TasksRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>task_manage.tasks.name</code>.
     */
    public final TableField<TasksRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>task_manage.tasks.user_id</code>.
     */
    public final TableField<TasksRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>task_manage.tasks.created_on</code>.
     */
    public final TableField<TasksRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>task_manage.tasks.updated_on</code>.
     */
    public final TableField<TasksRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>task_manage.tasks</code> table reference
     */
    public Tasks() {
        this(DSL.name("tasks"), null);
    }

    /**
     * Create an aliased <code>task_manage.tasks</code> table reference
     */
    public Tasks(String alias) {
        this(DSL.name(alias), TASKS);
    }

    /**
     * Create an aliased <code>task_manage.tasks</code> table reference
     */
    public Tasks(Name alias) {
        this(alias, TASKS);
    }

    private Tasks(Name alias, Table<TasksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tasks(Name alias, Table<TasksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tasks(Table<O> child, ForeignKey<O, TasksRecord> key) {
        super(child, key, TASKS);
    }

    @Override
    public Schema getSchema() {
        return TaskManage.TASK_MANAGE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TASKS_FK_USERS, Indexes.TASKS_PRIMARY);
    }

    @Override
    public Identity<TasksRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TASKS;
    }

    @Override
    public UniqueKey<TasksRecord> getPrimaryKey() {
        return Keys.KEY_TASKS_PRIMARY;
    }

    @Override
    public List<UniqueKey<TasksRecord>> getKeys() {
        return Arrays.<UniqueKey<TasksRecord>>asList(Keys.KEY_TASKS_PRIMARY);
    }

    @Override
    public List<ForeignKey<TasksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TasksRecord, ?>>asList(Keys.TASKS_IBFK_1);
    }

    public Users users() {
        return new Users(this, Keys.TASKS_IBFK_1);
    }

    @Override
    public Tasks as(String alias) {
        return new Tasks(DSL.name(alias), this);
    }

    @Override
    public Tasks as(Name alias) {
        return new Tasks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tasks rename(String name) {
        return new Tasks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tasks rename(Name name) {
        return new Tasks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
