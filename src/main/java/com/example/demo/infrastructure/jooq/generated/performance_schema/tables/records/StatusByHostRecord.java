/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records;


import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.STATUS_BY_HOST_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class StatusByHostRecord extends TableRecordImpl<StatusByHostRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 390502868;

    /**
     * Setter for <code>performance_schema.status_by_host.HOST</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.status_by_host.HOST</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.status_by_host.VARIABLE_NAME</code>.
     */
    public void setVariableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.status_by_host.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.status_by_host.VARIABLE_VALUE</code>.
     */
    public void setVariableValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.status_by_host.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return STATUS_BY_HOST_TABLE.STATUS_BY_HOST.HOST;
    }

    @Override
    public Field<String> field2() {
        return STATUS_BY_HOST_TABLE.STATUS_BY_HOST.VARIABLE_NAME;
    }

    @Override
    public Field<String> field3() {
        return STATUS_BY_HOST_TABLE.STATUS_BY_HOST.VARIABLE_VALUE;
    }

    @Override
    public String component1() {
        return getHost();
    }

    @Override
    public String component2() {
        return getVariableName();
    }

    @Override
    public String component3() {
        return getVariableValue();
    }

    @Override
    public String value1() {
        return getHost();
    }

    @Override
    public String value2() {
        return getVariableName();
    }

    @Override
    public String value3() {
        return getVariableValue();
    }

    @Override
    public StatusByHostRecord value1(String value) {
        setHost(value);
        return this;
    }

    @Override
    public StatusByHostRecord value2(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public StatusByHostRecord value3(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public StatusByHostRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatusByHostRecord
     */
    public StatusByHostRecord() {
        super(STATUS_BY_HOST_TABLE.STATUS_BY_HOST);
    }

    /**
     * Create a detached, initialised StatusByHostRecord
     */
    public StatusByHostRecord(String host, String variableName, String variableValue) {
        super(STATUS_BY_HOST_TABLE.STATUS_BY_HOST);

        set(0, host);
        set(1, variableName);
        set(2, variableValue);
    }
}