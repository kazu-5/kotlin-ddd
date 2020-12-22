/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.X$waitClassesGlobalByLatencyRecord;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE extends TableImpl<X$waitClassesGlobalByLatencyRecord> {

    private static final long serialVersionUID = -743797606;

    /**
     * The reference instance of <code>sys.x$wait_classes_global_by_latency</code>
     */
    public static final X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE X$WAIT_CLASSES_GLOBAL_BY_LATENCY = new X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$waitClassesGlobalByLatencyRecord> getRecordType() {
        return X$waitClassesGlobalByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.event_class</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, String> EVENT_CLASS = createField(DSL.name("event_class"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.total</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, BigInteger> TOTAL = createField(DSL.name("total"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.total_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, BigInteger> TOTAL_LATENCY = createField(DSL.name("total_latency"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.min_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, ULong> MIN_LATENCY = createField(DSL.name("min_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.avg_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, BigDecimal> AVG_LATENCY = createField(DSL.name("avg_latency"), org.jooq.impl.SQLDataType.DECIMAL(46, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.max_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByLatencyRecord, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>sys.x$wait_classes_global_by_latency</code> table reference
     */
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE() {
        this(DSL.name("x$wait_classes_global_by_latency"), null);
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_latency</code> table reference
     */
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(String alias) {
        this(DSL.name(alias), X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_latency</code> table reference
     */
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(Name alias) {
        this(alias, X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    private X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(Name alias, Table<X$waitClassesGlobalByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(Name alias, Table<X$waitClassesGlobalByLatencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(Table<O> child, ForeignKey<O, X$waitClassesGlobalByLatencyRecord> key) {
        super(child, key, X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE as(String alias) {
        return new X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(DSL.name(alias), this);
    }

    @Override
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE as(Name alias) {
        return new X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE rename(String name) {
        return new X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE rename(Name name) {
        return new X$WAIT_CLASSES_GLOBAL_BY_LATENCY_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigInteger, BigInteger, ULong, BigDecimal, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
