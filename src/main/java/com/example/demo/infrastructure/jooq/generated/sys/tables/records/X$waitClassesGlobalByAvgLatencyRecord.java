/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class X$waitClassesGlobalByAvgLatencyRecord extends TableRecordImpl<X$waitClassesGlobalByAvgLatencyRecord> implements Record6<String, BigInteger, BigInteger, ULong, BigDecimal, ULong> {

    private static final long serialVersionUID = -476154701;

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.event_class</code>.
     */
    public void setEventClass(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.event_class</code>.
     */
    public String getEventClass() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.total</code>.
     */
    public void setTotal(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.total</code>.
     */
    public BigInteger getTotal() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public void setTotalLatency(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public BigInteger getTotalLatency() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public void setMinLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public ULong getMinLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public void setAvgLatency(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public BigDecimal getAvgLatency() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sys.x$wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigInteger, BigInteger, ULong, BigDecimal, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, BigInteger, BigInteger, ULong, BigDecimal, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.EVENT_CLASS;
    }

    @Override
    public Field<BigInteger> field2() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.TOTAL;
    }

    @Override
    public Field<BigInteger> field3() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field4() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.MIN_LATENCY;
    }

    @Override
    public Field<BigDecimal> field5() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.AVG_LATENCY;
    }

    @Override
    public Field<ULong> field6() {
        return X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.MAX_LATENCY;
    }

    @Override
    public String component1() {
        return getEventClass();
    }

    @Override
    public BigInteger component2() {
        return getTotal();
    }

    @Override
    public BigInteger component3() {
        return getTotalLatency();
    }

    @Override
    public ULong component4() {
        return getMinLatency();
    }

    @Override
    public BigDecimal component5() {
        return getAvgLatency();
    }

    @Override
    public ULong component6() {
        return getMaxLatency();
    }

    @Override
    public String value1() {
        return getEventClass();
    }

    @Override
    public BigInteger value2() {
        return getTotal();
    }

    @Override
    public BigInteger value3() {
        return getTotalLatency();
    }

    @Override
    public ULong value4() {
        return getMinLatency();
    }

    @Override
    public BigDecimal value5() {
        return getAvgLatency();
    }

    @Override
    public ULong value6() {
        return getMaxLatency();
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value1(String value) {
        setEventClass(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value2(BigInteger value) {
        setTotal(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value3(BigInteger value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value4(ULong value) {
        setMinLatency(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value5(BigDecimal value) {
        setAvgLatency(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord value6(ULong value) {
        setMaxLatency(value);
        return this;
    }

    @Override
    public X$waitClassesGlobalByAvgLatencyRecord values(String value1, BigInteger value2, BigInteger value3, ULong value4, BigDecimal value5, ULong value6) {
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
     * Create a detached X$waitClassesGlobalByAvgLatencyRecord
     */
    public X$waitClassesGlobalByAvgLatencyRecord() {
        super(X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create a detached, initialised X$waitClassesGlobalByAvgLatencyRecord
     */
    public X$waitClassesGlobalByAvgLatencyRecord(String eventClass, BigInteger total, BigInteger totalLatency, ULong minLatency, BigDecimal avgLatency, ULong maxLatency) {
        super(X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY_TABLE.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);

        set(0, eventClass);
        set(1, total);
        set(2, totalLatency);
        set(3, minLatency);
        set(4, avgLatency);
        set(5, maxLatency);
    }
}