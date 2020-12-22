/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.SYS_CONFIG_TABLE;

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
public class SysConfigRecord extends UpdatableRecordImpl<SysConfigRecord> implements Record4<String, String, Timestamp, String> {

    private static final long serialVersionUID = -1670908315;

    /**
     * Setter for <code>sys.sys_config.variable</code>.
     */
    public void setVariable(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.sys_config.variable</code>.
     */
    public String getVariable() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.sys_config.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.sys_config.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.sys_config.set_time</code>.
     */
    public void setSetTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.sys_config.set_time</code>.
     */
    public Timestamp getSetTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sys.sys_config.set_by</code>.
     */
    public void setSetBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.sys_config.set_by</code>.
     */
    public String getSetBy() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SYS_CONFIG_TABLE.SYS_CONFIG.VARIABLE;
    }

    @Override
    public Field<String> field2() {
        return SYS_CONFIG_TABLE.SYS_CONFIG.VALUE;
    }

    @Override
    public Field<Timestamp> field3() {
        return SYS_CONFIG_TABLE.SYS_CONFIG.SET_TIME;
    }

    @Override
    public Field<String> field4() {
        return SYS_CONFIG_TABLE.SYS_CONFIG.SET_BY;
    }

    @Override
    public String component1() {
        return getVariable();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public Timestamp component3() {
        return getSetTime();
    }

    @Override
    public String component4() {
        return getSetBy();
    }

    @Override
    public String value1() {
        return getVariable();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public Timestamp value3() {
        return getSetTime();
    }

    @Override
    public String value4() {
        return getSetBy();
    }

    @Override
    public SysConfigRecord value1(String value) {
        setVariable(value);
        return this;
    }

    @Override
    public SysConfigRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SysConfigRecord value3(Timestamp value) {
        setSetTime(value);
        return this;
    }

    @Override
    public SysConfigRecord value4(String value) {
        setSetBy(value);
        return this;
    }

    @Override
    public SysConfigRecord values(String value1, String value2, Timestamp value3, String value4) {
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
     * Create a detached SysConfigRecord
     */
    public SysConfigRecord() {
        super(SYS_CONFIG_TABLE.SYS_CONFIG);
    }

    /**
     * Create a detached, initialised SysConfigRecord
     */
    public SysConfigRecord(String variable, String value, Timestamp setTime, String setBy) {
        super(SYS_CONFIG_TABLE.SYS_CONFIG);

        set(0, variable);
        set(1, value);
        set(2, setTime);
        set(3, setBy);
    }
}
