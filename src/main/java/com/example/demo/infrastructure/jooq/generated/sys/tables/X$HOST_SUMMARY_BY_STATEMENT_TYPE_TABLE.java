/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.X$hostSummaryByStatementTypeRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE extends TableImpl<X$hostSummaryByStatementTypeRecord> {

    private static final long serialVersionUID = -1279994657;

    /**
     * The reference instance of <code>sys.x$host_summary_by_statement_type</code>
     */
    public static final X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE X$HOST_SUMMARY_BY_STATEMENT_TYPE = new X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByStatementTypeRecord> getRecordType() {
        return X$hostSummaryByStatementTypeRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_statement_type.host</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, String> HOST = createField(DSL.name("host"), org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.statement</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, String> STATEMENT = createField(DSL.name("statement"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.total</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> TOTAL = createField(DSL.name("total"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> LOCK_LATENCY = createField(DSL.name("lock_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField(DSL.name("rows_affected"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField(DSL.name("full_scans"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>sys.x$host_summary_by_statement_type</code> table reference
     */
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE() {
        this(DSL.name("x$host_summary_by_statement_type"), null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_type</code> table reference
     */
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_type</code> table reference
     */
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    private X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(Name alias, Table<X$hostSummaryByStatementTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(Name alias, Table<X$hostSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(Table<O> child, ForeignKey<O, X$hostSummaryByStatementTypeRecord> key) {
        super(child, key, X$HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE as(String alias) {
        return new X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(DSL.name(alias), this);
    }

    @Override
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE as(Name alias) {
        return new X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE rename(String name) {
        return new X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE rename(Name name) {
        return new X$HOST_SUMMARY_BY_STATEMENT_TYPE_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}