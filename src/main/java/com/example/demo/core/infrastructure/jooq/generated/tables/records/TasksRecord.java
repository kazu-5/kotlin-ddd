/*
 * This file is generated by jOOQ.
 */
package com.example.demo.core.infrastructure.jooq.generated.tables.records;


import com.example.demo.core.infrastructure.jooq.generated.tables.Tasks;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TasksRecord extends UpdatableRecordImpl<TasksRecord> implements Record5<Integer, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1039731602;

    /**
     * Setter for <code>task_manage.tasks.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>task_manage.tasks.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>task_manage.tasks.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>task_manage.tasks.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>task_manage.tasks.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>task_manage.tasks.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>task_manage.tasks.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>task_manage.tasks.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>task_manage.tasks.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>task_manage.tasks.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Tasks.TASKS.ID;
    }

    @Override
    public Field<String> field2() {
        return Tasks.TASKS.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Tasks.TASKS.USER_ID;
    }

    @Override
    public Field<Timestamp> field4() {
        return Tasks.TASKS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field5() {
        return Tasks.TASKS.UPDATED_ON;
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
    public Integer component3() {
        return getUserId();
    }

    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component5() {
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
    public Integer value3() {
        return getUserId();
    }

    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    @Override
    public TasksRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TasksRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TasksRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public TasksRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TasksRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public TasksRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TasksRecord
     */
    public TasksRecord() {
        super(Tasks.TASKS);
    }

    /**
     * Create a detached, initialised TasksRecord
     */
    public TasksRecord(Integer id, String name, Integer userId, Timestamp createdOn, Timestamp updatedOn) {
        super(Tasks.TASKS);

        set(0, id);
        set(1, name);
        set(2, userId);
        set(3, createdOn);
        set(4, updatedOn);
    }
}