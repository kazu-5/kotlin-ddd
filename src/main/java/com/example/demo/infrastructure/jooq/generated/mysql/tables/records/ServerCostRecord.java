/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables.records;


import com.example.demo.infrastructure.jooq.generated.mysql.tables.SERVER_COST_TABLE;

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
public class ServerCostRecord extends UpdatableRecordImpl<ServerCostRecord> implements Record4<String, Double, Timestamp, String> {

    private static final long serialVersionUID = 2012465444;

    /**
     * Setter for <code>mysql.server_cost.cost_name</code>.
     */
    public void setCostName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.server_cost.cost_name</code>.
     */
    public String getCostName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.server_cost.cost_value</code>.
     */
    public void setCostValue(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.server_cost.cost_value</code>.
     */
    public Double getCostValue() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>mysql.server_cost.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.server_cost.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>mysql.server_cost.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.server_cost.comment</code>.
     */
    public String getComment() {
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
    public Row4<String, Double, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Double, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SERVER_COST_TABLE.SERVER_COST.COST_NAME;
    }

    @Override
    public Field<Double> field2() {
        return SERVER_COST_TABLE.SERVER_COST.COST_VALUE;
    }

    @Override
    public Field<Timestamp> field3() {
        return SERVER_COST_TABLE.SERVER_COST.LAST_UPDATE;
    }

    @Override
    public Field<String> field4() {
        return SERVER_COST_TABLE.SERVER_COST.COMMENT;
    }

    @Override
    public String component1() {
        return getCostName();
    }

    @Override
    public Double component2() {
        return getCostValue();
    }

    @Override
    public Timestamp component3() {
        return getLastUpdate();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public String value1() {
        return getCostName();
    }

    @Override
    public Double value2() {
        return getCostValue();
    }

    @Override
    public Timestamp value3() {
        return getLastUpdate();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public ServerCostRecord value1(String value) {
        setCostName(value);
        return this;
    }

    @Override
    public ServerCostRecord value2(Double value) {
        setCostValue(value);
        return this;
    }

    @Override
    public ServerCostRecord value3(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public ServerCostRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public ServerCostRecord values(String value1, Double value2, Timestamp value3, String value4) {
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
     * Create a detached ServerCostRecord
     */
    public ServerCostRecord() {
        super(SERVER_COST_TABLE.SERVER_COST);
    }

    /**
     * Create a detached, initialised ServerCostRecord
     */
    public ServerCostRecord(String costName, Double costValue, Timestamp lastUpdate, String comment) {
        super(SERVER_COST_TABLE.SERVER_COST);

        set(0, costName);
        set(1, costValue);
        set(2, lastUpdate);
        set(3, comment);
    }
}
