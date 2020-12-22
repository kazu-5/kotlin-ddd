/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.HostSummaryRecord;

import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class HOST_SUMMARY_TABLE extends TableImpl<HostSummaryRecord> {

    private static final long serialVersionUID = 253446972;

    /**
     * The reference instance of <code>sys.host_summary</code>
     */
    public static final HOST_SUMMARY_TABLE HOST_SUMMARY = new HOST_SUMMARY_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryRecord> getRecordType() {
        return HostSummaryRecord.class;
    }

    /**
     * The column <code>sys.host_summary.host</code>.
     */
    public final TableField<HostSummaryRecord, String> HOST = createField(DSL.name("host"), org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.host_summary.statements</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> STATEMENTS = createField(DSL.name("statements"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.host_summary.statement_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> STATEMENT_LATENCY = createField(DSL.name("statement_latency"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.statement_avg_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> STATEMENT_AVG_LATENCY = createField(DSL.name("statement_avg_latency"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.table_scans</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> TABLE_SCANS = createField(DSL.name("table_scans"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(65), this, "");

    /**
     * The column <code>sys.host_summary.file_ios</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> FILE_IOS = createField(DSL.name("file_ios"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.host_summary.file_io_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> FILE_IO_LATENCY = createField(DSL.name("file_io_latency"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.current_connections</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> CURRENT_CONNECTIONS = createField(DSL.name("current_connections"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.host_summary.total_connections</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> TOTAL_CONNECTIONS = createField(DSL.name("total_connections"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.host_summary.unique_users</code>.
     */
    public final TableField<HostSummaryRecord, Long> UNIQUE_USERS = createField(DSL.name("unique_users"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.host_summary.current_memory</code>.
     */
    public final TableField<HostSummaryRecord, String> CURRENT_MEMORY = createField(DSL.name("current_memory"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.total_memory_allocated</code>.
     */
    public final TableField<HostSummaryRecord, String> TOTAL_MEMORY_ALLOCATED = createField(DSL.name("total_memory_allocated"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.host_summary</code> table reference
     */
    public HOST_SUMMARY_TABLE() {
        this(DSL.name("host_summary"), null);
    }

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    public HOST_SUMMARY_TABLE(String alias) {
        this(DSL.name(alias), HOST_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    public HOST_SUMMARY_TABLE(Name alias) {
        this(alias, HOST_SUMMARY);
    }

    private HOST_SUMMARY_TABLE(Name alias, Table<HostSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private HOST_SUMMARY_TABLE(Name alias, Table<HostSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> HOST_SUMMARY_TABLE(Table<O> child, ForeignKey<O, HostSummaryRecord> key) {
        super(child, key, HOST_SUMMARY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public HOST_SUMMARY_TABLE as(String alias) {
        return new HOST_SUMMARY_TABLE(DSL.name(alias), this);
    }

    @Override
    public HOST_SUMMARY_TABLE as(Name alias) {
        return new HOST_SUMMARY_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HOST_SUMMARY_TABLE rename(String name) {
        return new HOST_SUMMARY_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HOST_SUMMARY_TABLE rename(Name name) {
        return new HOST_SUMMARY_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
