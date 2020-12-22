/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.METRICS_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetricsRecord extends TableRecordImpl<MetricsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 2122446687;

    /**
     * Setter for <code>sys.metrics.Variable_name</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.metrics.Variable_name</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.metrics.Variable_value</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.metrics.Variable_value</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.metrics.Type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.metrics.Type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.metrics.Enabled</code>.
     */
    public void setEnabled(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.metrics.Enabled</code>.
     */
    public String getEnabled() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return METRICS_TABLE.METRICS.VARIABLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return METRICS_TABLE.METRICS.VARIABLE_VALUE;
    }

    @Override
    public Field<String> field3() {
        return METRICS_TABLE.METRICS.TYPE;
    }

    @Override
    public Field<String> field4() {
        return METRICS_TABLE.METRICS.ENABLED;
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
    public String component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getEnabled();
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
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getEnabled();
    }

    @Override
    public MetricsRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public MetricsRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public MetricsRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public MetricsRecord value4(String value) {
        setEnabled(value);
        return this;
    }

    @Override
    public MetricsRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached MetricsRecord
     */
    public MetricsRecord() {
        super(METRICS_TABLE.METRICS);
    }

    /**
     * Create a detached, initialised MetricsRecord
     */
    public MetricsRecord(String variableName, String variableValue, String type, String enabled) {
        super(METRICS_TABLE.METRICS);

        set(0, variableName);
        set(1, variableValue);
        set(2, type);
        set(3, enabled);
    }
}