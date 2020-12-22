/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables.records;


import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_TRANSITION_TYPE_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionTypeRecord extends UpdatableRecordImpl<TimeZoneTransitionTypeRecord> implements Record5<UInteger, UInteger, Integer, UByte, String> {

    private static final long serialVersionUID = -161537222;

    /**
     * Setter for <code>mysql.time_zone_transition_type.Time_zone_id</code>.
     */
    public void setTimeZoneId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition_type.Time_zone_id</code>.
     */
    public UInteger getTimeZoneId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.time_zone_transition_type.Transition_type_id</code>.
     */
    public void setTransitionTypeId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition_type.Transition_type_id</code>.
     */
    public UInteger getTransitionTypeId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>mysql.time_zone_transition_type.Offset</code>.
     */
    public void setOffset(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition_type.Offset</code>.
     */
    public Integer getOffset() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mysql.time_zone_transition_type.Is_DST</code>.
     */
    public void setIsDst(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition_type.Is_DST</code>.
     */
    public UByte getIsDst() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>mysql.time_zone_transition_type.Abbreviation</code>.
     */
    public void setAbbreviation(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition_type.Abbreviation</code>.
     */
    public String getAbbreviation() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UInteger, UInteger> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UInteger, UInteger, Integer, UByte, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UInteger, UInteger, Integer, UByte, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.OFFSET;
    }

    @Override
    public Field<UByte> field4() {
        return TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.IS_DST;
    }

    @Override
    public Field<String> field5() {
        return TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.ABBREVIATION;
    }

    @Override
    public UInteger component1() {
        return getTimeZoneId();
    }

    @Override
    public UInteger component2() {
        return getTransitionTypeId();
    }

    @Override
    public Integer component3() {
        return getOffset();
    }

    @Override
    public UByte component4() {
        return getIsDst();
    }

    @Override
    public String component5() {
        return getAbbreviation();
    }

    @Override
    public UInteger value1() {
        return getTimeZoneId();
    }

    @Override
    public UInteger value2() {
        return getTransitionTypeId();
    }

    @Override
    public Integer value3() {
        return getOffset();
    }

    @Override
    public UByte value4() {
        return getIsDst();
    }

    @Override
    public String value5() {
        return getAbbreviation();
    }

    @Override
    public TimeZoneTransitionTypeRecord value1(UInteger value) {
        setTimeZoneId(value);
        return this;
    }

    @Override
    public TimeZoneTransitionTypeRecord value2(UInteger value) {
        setTransitionTypeId(value);
        return this;
    }

    @Override
    public TimeZoneTransitionTypeRecord value3(Integer value) {
        setOffset(value);
        return this;
    }

    @Override
    public TimeZoneTransitionTypeRecord value4(UByte value) {
        setIsDst(value);
        return this;
    }

    @Override
    public TimeZoneTransitionTypeRecord value5(String value) {
        setAbbreviation(value);
        return this;
    }

    @Override
    public TimeZoneTransitionTypeRecord values(UInteger value1, UInteger value2, Integer value3, UByte value4, String value5) {
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
     * Create a detached TimeZoneTransitionTypeRecord
     */
    public TimeZoneTransitionTypeRecord() {
        super(TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE);
    }

    /**
     * Create a detached, initialised TimeZoneTransitionTypeRecord
     */
    public TimeZoneTransitionTypeRecord(UInteger timeZoneId, UInteger transitionTypeId, Integer offset, UByte isDst, String abbreviation) {
        super(TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE);

        set(0, timeZoneId);
        set(1, transitionTypeId);
        set(2, offset);
        set(3, isDst);
        set(4, abbreviation);
    }
}