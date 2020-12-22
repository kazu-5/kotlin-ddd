/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.X$userSummaryByFileIoRecord;

import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class X$USER_SUMMARY_BY_FILE_IO_TABLE extends TableImpl<X$userSummaryByFileIoRecord> {

    private static final long serialVersionUID = 1336358893;

    /**
     * The reference instance of <code>sys.x$user_summary_by_file_io</code>
     */
    public static final X$USER_SUMMARY_BY_FILE_IO_TABLE X$USER_SUMMARY_BY_FILE_IO = new X$USER_SUMMARY_BY_FILE_IO_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$userSummaryByFileIoRecord> getRecordType() {
        return X$userSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_file_io.user</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, String> USER = createField(DSL.name("user"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io.ios</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, BigInteger> IOS = createField(DSL.name("ios"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io.io_latency</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, BigInteger> IO_LATENCY = createField(DSL.name("io_latency"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * Create a <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$USER_SUMMARY_BY_FILE_IO_TABLE() {
        this(DSL.name("x$user_summary_by_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$USER_SUMMARY_BY_FILE_IO_TABLE(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$USER_SUMMARY_BY_FILE_IO_TABLE(Name alias) {
        this(alias, X$USER_SUMMARY_BY_FILE_IO);
    }

    private X$USER_SUMMARY_BY_FILE_IO_TABLE(Name alias, Table<X$userSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$USER_SUMMARY_BY_FILE_IO_TABLE(Name alias, Table<X$userSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$USER_SUMMARY_BY_FILE_IO_TABLE(Table<O> child, ForeignKey<O, X$userSummaryByFileIoRecord> key) {
        super(child, key, X$USER_SUMMARY_BY_FILE_IO);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$USER_SUMMARY_BY_FILE_IO_TABLE as(String alias) {
        return new X$USER_SUMMARY_BY_FILE_IO_TABLE(DSL.name(alias), this);
    }

    @Override
    public X$USER_SUMMARY_BY_FILE_IO_TABLE as(Name alias) {
        return new X$USER_SUMMARY_BY_FILE_IO_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$USER_SUMMARY_BY_FILE_IO_TABLE rename(String name) {
        return new X$USER_SUMMARY_BY_FILE_IO_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$USER_SUMMARY_BY_FILE_IO_TABLE rename(Name name) {
        return new X$USER_SUMMARY_BY_FILE_IO_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, BigInteger, BigInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}