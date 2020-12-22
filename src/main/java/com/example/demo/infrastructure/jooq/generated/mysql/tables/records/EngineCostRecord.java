/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables.records;


import com.example.demo.infrastructure.jooq.generated.mysql.tables.ENGINE_COST_TABLE;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class EngineCostRecord extends UpdatableRecordImpl<EngineCostRecord> implements Record6<String, Integer, String, Double, Timestamp, String> {

    private static final long serialVersionUID = 485946685;

    /**
     * Setter for <code>mysql.engine_cost.engine_name</code>.
     */
    public void setEngineName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.engine_name</code>.
     */
    public String getEngineName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.engine_cost.device_type</code>.
     */
    public void setDeviceType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.device_type</code>.
     */
    public Integer getDeviceType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mysql.engine_cost.cost_name</code>.
     */
    public void setCostName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.cost_name</code>.
     */
    public String getCostName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.engine_cost.cost_value</code>.
     */
    public void setCostValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.cost_value</code>.
     */
    public Double getCostValue() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>mysql.engine_cost.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mysql.engine_cost.comment</code>.
     */
    public void setComment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.comment</code>.
     */
    public String getComment() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, Integer, String, Double, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, Integer, String, Double, Timestamp, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ENGINE_COST_TABLE.ENGINE_COST.ENGINE_NAME;
    }

    @Override
    public Field<Integer> field2() {
        return ENGINE_COST_TABLE.ENGINE_COST.DEVICE_TYPE;
    }

    @Override
    public Field<String> field3() {
        return ENGINE_COST_TABLE.ENGINE_COST.COST_NAME;
    }

    @Override
    public Field<Double> field4() {
        return ENGINE_COST_TABLE.ENGINE_COST.COST_VALUE;
    }

    @Override
    public Field<Timestamp> field5() {
        return ENGINE_COST_TABLE.ENGINE_COST.LAST_UPDATE;
    }

    @Override
    public Field<String> field6() {
        return ENGINE_COST_TABLE.ENGINE_COST.COMMENT;
    }

    @Override
    public String component1() {
        return getEngineName();
    }

    @Override
    public Integer component2() {
        return getDeviceType();
    }

    @Override
    public String component3() {
        return getCostName();
    }

    @Override
    public Double component4() {
        return getCostValue();
    }

    @Override
    public Timestamp component5() {
        return getLastUpdate();
    }

    @Override
    public String component6() {
        return getComment();
    }

    @Override
    public String value1() {
        return getEngineName();
    }

    @Override
    public Integer value2() {
        return getDeviceType();
    }

    @Override
    public String value3() {
        return getCostName();
    }

    @Override
    public Double value4() {
        return getCostValue();
    }

    @Override
    public Timestamp value5() {
        return getLastUpdate();
    }

    @Override
    public String value6() {
        return getComment();
    }

    @Override
    public EngineCostRecord value1(String value) {
        setEngineName(value);
        return this;
    }

    @Override
    public EngineCostRecord value2(Integer value) {
        setDeviceType(value);
        return this;
    }

    @Override
    public EngineCostRecord value3(String value) {
        setCostName(value);
        return this;
    }

    @Override
    public EngineCostRecord value4(Double value) {
        setCostValue(value);
        return this;
    }

    @Override
    public EngineCostRecord value5(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public EngineCostRecord value6(String value) {
        setComment(value);
        return this;
    }

    @Override
    public EngineCostRecord values(String value1, Integer value2, String value3, Double value4, Timestamp value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EngineCostRecord
     */
    public EngineCostRecord() {
        super(ENGINE_COST_TABLE.ENGINE_COST);
    }

    /**
     * Create a detached, initialised EngineCostRecord
     */
    public EngineCostRecord(String engineName, Integer deviceType, String costName, Double costValue, Timestamp lastUpdate, String comment) {
        super(ENGINE_COST_TABLE.ENGINE_COST);

        set(0, engineName);
        set(1, deviceType);
        set(2, costName);
        set(3, costValue);
        set(4, lastUpdate);
        set(5, comment);
    }
}
