/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.X$memoryGlobalByCurrentBytesRecord;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE extends TableImpl<X$memoryGlobalByCurrentBytesRecord> {

    private static final long serialVersionUID = -513193166;

    /**
     * The reference instance of <code>sys.x$memory_global_by_current_bytes</code>
     */
    public static final X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE X$MEMORY_GLOBAL_BY_CURRENT_BYTES = new X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$memoryGlobalByCurrentBytesRecord> getRecordType() {
        return X$memoryGlobalByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.event_name</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, String> EVENT_NAME = createField(DSL.name("event_name"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_count</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> CURRENT_COUNT = createField(DSL.name("current_count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> CURRENT_ALLOC = createField(DSL.name("current_alloc"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, BigDecimal> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_count</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> HIGH_COUNT = createField(DSL.name("high_count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> HIGH_ALLOC = createField(DSL.name("high_alloc"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, BigDecimal> HIGH_AVG_ALLOC = createField(DSL.name("high_avg_alloc"), org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>sys.x$memory_global_by_current_bytes</code> table reference
     */
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE() {
        this(DSL.name("x$memory_global_by_current_bytes"), null);
    }

    /**
     * Create an aliased <code>sys.x$memory_global_by_current_bytes</code> table reference
     */
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(String alias) {
        this(DSL.name(alias), X$MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.x$memory_global_by_current_bytes</code> table reference
     */
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(Name alias) {
        this(alias, X$MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    private X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(Name alias, Table<X$memoryGlobalByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(Name alias, Table<X$memoryGlobalByCurrentBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(Table<O> child, ForeignKey<O, X$memoryGlobalByCurrentBytesRecord> key) {
        super(child, key, X$MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE as(String alias) {
        return new X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(DSL.name(alias), this);
    }

    @Override
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE as(Name alias) {
        return new X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE rename(String name) {
        return new X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE rename(Name name) {
        return new X$MEMORY_GLOBAL_BY_CURRENT_BYTES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Long, Long, BigDecimal, Long, Long, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}