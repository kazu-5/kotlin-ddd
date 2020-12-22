/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables.records;


import com.example.demo.infrastructure.jooq.generated.information_schema.tables.SESSION_STATUS_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class SessionStatusRecord extends TableRecordImpl<SessionStatusRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1662096126;

    /**
     * Setter for <code>information_schema.SESSION_STATUS.VARIABLE_NAME</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.SESSION_STATUS.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.SESSION_STATUS.VARIABLE_VALUE</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.SESSION_STATUS.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SESSION_STATUS_TABLE.SESSION_STATUS.VARIABLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return SESSION_STATUS_TABLE.SESSION_STATUS.VARIABLE_VALUE;
    }

    @Override
    public String component1() {
        return getVariableName();
    }

    @Override
    public String component2() {
        return getVariableValue();
    }

    @Override
    public String value1() {
        return getVariableName();
    }

    @Override
    public String value2() {
        return getVariableValue();
    }

    @Override
    public SessionStatusRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public SessionStatusRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public SessionStatusRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionStatusRecord
     */
    public SessionStatusRecord() {
        super(SESSION_STATUS_TABLE.SESSION_STATUS);
    }

    /**
     * Create a detached, initialised SessionStatusRecord
     */
    public SessionStatusRecord(String variableName, String variableValue) {
        super(SESSION_STATUS_TABLE.SESSION_STATUS);

        set(0, variableName);
        set(1, variableValue);
    }
}
