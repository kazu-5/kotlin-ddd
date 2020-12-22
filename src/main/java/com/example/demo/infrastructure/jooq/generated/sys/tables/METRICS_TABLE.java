/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.MetricsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class METRICS_TABLE extends TableImpl<MetricsRecord> {

    private static final long serialVersionUID = -826637416;

    /**
     * The reference instance of <code>sys.metrics</code>
     */
    public static final METRICS_TABLE METRICS = new METRICS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetricsRecord> getRecordType() {
        return MetricsRecord.class;
    }

    /**
     * The column <code>sys.metrics.Variable_name</code>.
     */
    public final TableField<MetricsRecord, String> VARIABLE_NAME = createField(DSL.name("Variable_name"), org.jooq.impl.SQLDataType.VARCHAR(193), this, "");

    /**
     * The column <code>sys.metrics.Variable_value</code>.
     */
    public final TableField<MetricsRecord, String> VARIABLE_VALUE = createField(DSL.name("Variable_value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.metrics.Type</code>.
     */
    public final TableField<MetricsRecord, String> TYPE = createField(DSL.name("Type"), org.jooq.impl.SQLDataType.VARCHAR(210), this, "");

    /**
     * The column <code>sys.metrics.Enabled</code>.
     */
    public final TableField<MetricsRecord, String> ENABLED = createField(DSL.name("Enabled"), org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>sys.metrics</code> table reference
     */
    public METRICS_TABLE() {
        this(DSL.name("metrics"), null);
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public METRICS_TABLE(String alias) {
        this(DSL.name(alias), METRICS);
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public METRICS_TABLE(Name alias) {
        this(alias, METRICS);
    }

    private METRICS_TABLE(Name alias, Table<MetricsRecord> aliased) {
        this(alias, aliased, null);
    }

    private METRICS_TABLE(Name alias, Table<MetricsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> METRICS_TABLE(Table<O> child, ForeignKey<O, MetricsRecord> key) {
        super(child, key, METRICS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public METRICS_TABLE as(String alias) {
        return new METRICS_TABLE(DSL.name(alias), this);
    }

    @Override
    public METRICS_TABLE as(Name alias) {
        return new METRICS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public METRICS_TABLE rename(String name) {
        return new METRICS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public METRICS_TABLE rename(Name name) {
        return new METRICS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
