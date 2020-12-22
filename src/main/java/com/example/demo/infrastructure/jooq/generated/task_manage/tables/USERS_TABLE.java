/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.task_manage.tables;


import com.example.demo.infrastructure.jooq.generated.task_manage.Indexes;
import com.example.demo.infrastructure.jooq.generated.task_manage.Keys;
import com.example.demo.infrastructure.jooq.generated.task_manage.TaskManage;
import com.example.demo.infrastructure.jooq.generated.task_manage.tables.records.UsersRecord;

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
import org.jooq.Row6;
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
public class USERS_TABLE extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = -226274682;

    /**
     * The reference instance of <code>task_manage.users</code>
     */
    public static final USERS_TABLE USERS = new USERS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>task_manage.users.id</code>.
     */
    public final TableField<UsersRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>task_manage.users.name</code>.
     */
    public final TableField<UsersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>task_manage.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>task_manage.users.is_deleted</code>.
     */
    public final TableField<UsersRecord, Byte> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>task_manage.users.created_on</code>.
     */
    public final TableField<UsersRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>task_manage.users.updated_on</code>.
     */
    public final TableField<UsersRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>task_manage.users</code> table reference
     */
    public USERS_TABLE() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>task_manage.users</code> table reference
     */
    public USERS_TABLE(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>task_manage.users</code> table reference
     */
    public USERS_TABLE(Name alias) {
        this(alias, USERS);
    }

    private USERS_TABLE(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private USERS_TABLE(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> USERS_TABLE(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return TaskManage.TASK_MANAGE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_PRIMARY);
    }

    @Override
    public Identity<UsersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    @Override
    public USERS_TABLE as(String alias) {
        return new USERS_TABLE(DSL.name(alias), this);
    }

    @Override
    public USERS_TABLE as(Name alias) {
        return new USERS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public USERS_TABLE rename(String name) {
        return new USERS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public USERS_TABLE rename(Name name) {
        return new USERS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
