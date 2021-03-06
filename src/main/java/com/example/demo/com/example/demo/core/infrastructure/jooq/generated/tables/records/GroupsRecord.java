/*
 * This file is generated by jOOQ.
 */
package com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.records;


import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Groups;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class GroupsRecord extends UpdatableRecordImpl<GroupsRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -211614828;

    /**
     * Setter for <code>task_manage.groups.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>task_manage.groups.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>task_manage.groups.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>task_manage.groups.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>task_manage.groups.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>task_manage.groups.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>task_manage.groups.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>task_manage.groups.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Groups.GROUPS.ID;
    }

    @Override
    public Field<String> field2() {
        return Groups.GROUPS.NAME;
    }

    @Override
    public Field<Timestamp> field3() {
        return Groups.GROUPS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field4() {
        return Groups.GROUPS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component4() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    @Override
    public GroupsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GroupsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GroupsRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public GroupsRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public GroupsRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupsRecord
     */
    public GroupsRecord() {
        super(Groups.GROUPS);
    }

    /**
     * Create a detached, initialised GroupsRecord
     */
    public GroupsRecord(Integer id, String name, Timestamp createdOn, Timestamp updatedOn) {
        super(Groups.GROUPS);

        set(0, id);
        set(1, name);
        set(2, createdOn);
        set(3, updatedOn);
    }
}
