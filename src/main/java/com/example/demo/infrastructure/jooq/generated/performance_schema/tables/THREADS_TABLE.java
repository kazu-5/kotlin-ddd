/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ThreadsHistory;
import com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ThreadsInstrumented;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.ThreadsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class THREADS_TABLE extends TableImpl<ThreadsRecord> {

    private static final long serialVersionUID = 1063167161;

    /**
     * The reference instance of <code>performance_schema.threads</code>
     */
    public static final THREADS_TABLE THREADS = new THREADS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThreadsRecord> getRecordType() {
        return ThreadsRecord.class;
    }

    /**
     * The column <code>performance_schema.threads.THREAD_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.NAME</code>.
     */
    public final TableField<ThreadsRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.TYPE</code>.
     */
    public final TableField<ThreadsRecord, String> TYPE = createField(DSL.name("TYPE"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> PROCESSLIST_ID = createField(DSL.name("PROCESSLIST_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_USER</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_USER = createField(DSL.name("PROCESSLIST_USER"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_HOST</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_HOST = createField(DSL.name("PROCESSLIST_HOST"), org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_DB</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_DB = createField(DSL.name("PROCESSLIST_DB"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_COMMAND = createField(DSL.name("PROCESSLIST_COMMAND"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_TIME</code>.
     */
    public final TableField<ThreadsRecord, Long> PROCESSLIST_TIME = createField(DSL.name("PROCESSLIST_TIME"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_STATE</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_STATE = createField(DSL.name("PROCESSLIST_STATE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_INFO</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_INFO = createField(DSL.name("PROCESSLIST_INFO"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.threads.PARENT_THREAD_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> PARENT_THREAD_ID = createField(DSL.name("PARENT_THREAD_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.ROLE</code>.
     */
    public final TableField<ThreadsRecord, String> ROLE = createField(DSL.name("ROLE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.INSTRUMENTED</code>.
     */
    public final TableField<ThreadsRecord, ThreadsInstrumented> INSTRUMENTED = createField(DSL.name("INSTRUMENTED"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ThreadsInstrumented.class), this, "");

    /**
     * The column <code>performance_schema.threads.HISTORY</code>.
     */
    public final TableField<ThreadsRecord, ThreadsHistory> HISTORY = createField(DSL.name("HISTORY"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ThreadsHistory.class), this, "");

    /**
     * The column <code>performance_schema.threads.CONNECTION_TYPE</code>.
     */
    public final TableField<ThreadsRecord, String> CONNECTION_TYPE = createField(DSL.name("CONNECTION_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>performance_schema.threads.THREAD_OS_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> THREAD_OS_ID = createField(DSL.name("THREAD_OS_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>performance_schema.threads</code> table reference
     */
    public THREADS_TABLE() {
        this(DSL.name("threads"), null);
    }

    /**
     * Create an aliased <code>performance_schema.threads</code> table reference
     */
    public THREADS_TABLE(String alias) {
        this(DSL.name(alias), THREADS);
    }

    /**
     * Create an aliased <code>performance_schema.threads</code> table reference
     */
    public THREADS_TABLE(Name alias) {
        this(alias, THREADS);
    }

    private THREADS_TABLE(Name alias, Table<ThreadsRecord> aliased) {
        this(alias, aliased, null);
    }

    private THREADS_TABLE(Name alias, Table<ThreadsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> THREADS_TABLE(Table<O> child, ForeignKey<O, ThreadsRecord> key) {
        super(child, key, THREADS);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public THREADS_TABLE as(String alias) {
        return new THREADS_TABLE(DSL.name(alias), this);
    }

    @Override
    public THREADS_TABLE as(Name alias) {
        return new THREADS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public THREADS_TABLE rename(String name) {
        return new THREADS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public THREADS_TABLE rename(Name name) {
        return new THREADS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<ULong, String, String, ULong, String, String, String, String, Long, String, String, ULong, String, ThreadsInstrumented, ThreadsHistory, String, ULong> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
