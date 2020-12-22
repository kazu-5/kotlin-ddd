/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables.records;


import com.example.demo.infrastructure.jooq.generated.mysql.enums.ProcsPrivRoutineType;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.PROCS_PRIV_TABLE;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Procedure privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcsPrivRecord extends UpdatableRecordImpl<ProcsPrivRecord> implements Record8<String, String, String, String, ProcsPrivRoutineType, String, String, Timestamp> {

    private static final long serialVersionUID = -1030699862;

    /**
     * Setter for <code>mysql.procs_priv.Host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.procs_priv.Db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.procs_priv.User</code>.
     */
    public void setUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.User</code>.
     */
    public String getUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.procs_priv.Routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.procs_priv.Routine_type</code>.
     */
    public void setRoutineType(ProcsPrivRoutineType value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Routine_type</code>.
     */
    public ProcsPrivRoutineType getRoutineType() {
        return (ProcsPrivRoutineType) get(4);
    }

    /**
     * Setter for <code>mysql.procs_priv.Grantor</code>.
     */
    public void setGrantor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Grantor</code>.
     */
    public String getGrantor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mysql.procs_priv.Proc_priv</code>.
     */
    public void setProcPriv(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Proc_priv</code>.
     */
    public String getProcPriv() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mysql.procs_priv.Timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.procs_priv.Timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, String, String, String, ProcsPrivRoutineType> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, ProcsPrivRoutineType, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, ProcsPrivRoutineType, String, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.HOST;
    }

    @Override
    public Field<String> field2() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.DB;
    }

    @Override
    public Field<String> field3() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.USER;
    }

    @Override
    public Field<String> field4() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.ROUTINE_NAME;
    }

    @Override
    public Field<ProcsPrivRoutineType> field5() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.ROUTINE_TYPE;
    }

    @Override
    public Field<String> field6() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.GRANTOR;
    }

    @Override
    public Field<String> field7() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.PROC_PRIV;
    }

    @Override
    public Field<Timestamp> field8() {
        return PROCS_PRIV_TABLE.PROCS_PRIV.TIMESTAMP;
    }

    @Override
    public String component1() {
        return getHost();
    }

    @Override
    public String component2() {
        return getDb();
    }

    @Override
    public String component3() {
        return getUser();
    }

    @Override
    public String component4() {
        return getRoutineName();
    }

    @Override
    public ProcsPrivRoutineType component5() {
        return getRoutineType();
    }

    @Override
    public String component6() {
        return getGrantor();
    }

    @Override
    public String component7() {
        return getProcPriv();
    }

    @Override
    public Timestamp component8() {
        return getTimestamp();
    }

    @Override
    public String value1() {
        return getHost();
    }

    @Override
    public String value2() {
        return getDb();
    }

    @Override
    public String value3() {
        return getUser();
    }

    @Override
    public String value4() {
        return getRoutineName();
    }

    @Override
    public ProcsPrivRoutineType value5() {
        return getRoutineType();
    }

    @Override
    public String value6() {
        return getGrantor();
    }

    @Override
    public String value7() {
        return getProcPriv();
    }

    @Override
    public Timestamp value8() {
        return getTimestamp();
    }

    @Override
    public ProcsPrivRecord value1(String value) {
        setHost(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value2(String value) {
        setDb(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value3(String value) {
        setUser(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value4(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value5(ProcsPrivRoutineType value) {
        setRoutineType(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value6(String value) {
        setGrantor(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value7(String value) {
        setProcPriv(value);
        return this;
    }

    @Override
    public ProcsPrivRecord value8(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public ProcsPrivRecord values(String value1, String value2, String value3, String value4, ProcsPrivRoutineType value5, String value6, String value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcsPrivRecord
     */
    public ProcsPrivRecord() {
        super(PROCS_PRIV_TABLE.PROCS_PRIV);
    }

    /**
     * Create a detached, initialised ProcsPrivRecord
     */
    public ProcsPrivRecord(String host, String db, String user, String routineName, ProcsPrivRoutineType routineType, String grantor, String procPriv, Timestamp timestamp) {
        super(PROCS_PRIV_TABLE.PROCS_PRIV);

        set(0, host);
        set(1, db);
        set(2, user);
        set(3, routineName);
        set(4, routineType);
        set(5, grantor);
        set(6, procPriv);
        set(7, timestamp);
    }
}