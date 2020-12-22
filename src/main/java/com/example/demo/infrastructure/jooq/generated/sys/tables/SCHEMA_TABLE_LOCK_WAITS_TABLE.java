/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.SchemaTableLockWaitsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class SCHEMA_TABLE_LOCK_WAITS_TABLE extends TableImpl<SchemaTableLockWaitsRecord> {

    private static final long serialVersionUID = 79317542;

    /**
     * The reference instance of <code>sys.schema_table_lock_waits</code>
     */
    public static final SCHEMA_TABLE_LOCK_WAITS_TABLE SCHEMA_TABLE_LOCK_WAITS = new SCHEMA_TABLE_LOCK_WAITS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaTableLockWaitsRecord> getRecordType() {
        return SchemaTableLockWaitsRecord.class;
    }

    /**
     * The column <code>sys.schema_table_lock_waits.object_schema</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.object_name</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_thread_id</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_THREAD_ID = createField(DSL.name("waiting_thread_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_pid</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_PID = createField(DSL.name("waiting_pid"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_account</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_ACCOUNT = createField(DSL.name("waiting_account"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_lock_type</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_LOCK_TYPE = createField(DSL.name("waiting_lock_type"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_LOCK_DURATION = createField(DSL.name("waiting_lock_duration"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_QUERY = createField(DSL.name("waiting_query"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_secs</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, Long> WAITING_QUERY_SECS = createField(DSL.name("waiting_query_secs"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_AFFECTED = createField(DSL.name("waiting_query_rows_affected"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_EXAMINED = createField(DSL.name("waiting_query_rows_examined"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_thread_id</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> BLOCKING_THREAD_ID = createField(DSL.name("blocking_thread_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_pid</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> BLOCKING_PID = createField(DSL.name("blocking_pid"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_account</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_ACCOUNT = createField(DSL.name("blocking_account"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_lock_type</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_LOCK_TYPE = createField(DSL.name("blocking_lock_type"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_LOCK_DURATION = createField(DSL.name("blocking_lock_duration"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField(DSL.name("sql_kill_blocking_query"), org.jooq.impl.SQLDataType.VARCHAR(31), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField(DSL.name("sql_kill_blocking_connection"), org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * Create a <code>sys.schema_table_lock_waits</code> table reference
     */
    public SCHEMA_TABLE_LOCK_WAITS_TABLE() {
        this(DSL.name("schema_table_lock_waits"), null);
    }

    /**
     * Create an aliased <code>sys.schema_table_lock_waits</code> table reference
     */
    public SCHEMA_TABLE_LOCK_WAITS_TABLE(String alias) {
        this(DSL.name(alias), SCHEMA_TABLE_LOCK_WAITS);
    }

    /**
     * Create an aliased <code>sys.schema_table_lock_waits</code> table reference
     */
    public SCHEMA_TABLE_LOCK_WAITS_TABLE(Name alias) {
        this(alias, SCHEMA_TABLE_LOCK_WAITS);
    }

    private SCHEMA_TABLE_LOCK_WAITS_TABLE(Name alias, Table<SchemaTableLockWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SCHEMA_TABLE_LOCK_WAITS_TABLE(Name alias, Table<SchemaTableLockWaitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> SCHEMA_TABLE_LOCK_WAITS_TABLE(Table<O> child, ForeignKey<O, SchemaTableLockWaitsRecord> key) {
        super(child, key, SCHEMA_TABLE_LOCK_WAITS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SCHEMA_TABLE_LOCK_WAITS_TABLE as(String alias) {
        return new SCHEMA_TABLE_LOCK_WAITS_TABLE(DSL.name(alias), this);
    }

    @Override
    public SCHEMA_TABLE_LOCK_WAITS_TABLE as(Name alias) {
        return new SCHEMA_TABLE_LOCK_WAITS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_TABLE_LOCK_WAITS_TABLE rename(String name) {
        return new SCHEMA_TABLE_LOCK_WAITS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_TABLE_LOCK_WAITS_TABLE rename(Name name) {
        return new SCHEMA_TABLE_LOCK_WAITS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
