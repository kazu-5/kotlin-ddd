/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.MemoryByThreadByCurrentBytesRecord;

import java.math.BigInteger;

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
public class MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE extends TableImpl<MemoryByThreadByCurrentBytesRecord> {

    private static final long serialVersionUID = -120407487;

    /**
     * The reference instance of <code>sys.memory_by_thread_by_current_bytes</code>
     */
    public static final MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE MEMORY_BY_THREAD_BY_CURRENT_BYTES = new MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemoryByThreadByCurrentBytesRecord> getRecordType() {
        return MemoryByThreadByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, ULong> THREAD_ID = createField(DSL.name("thread_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> USER = createField(DSL.name("user"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, BigInteger> CURRENT_COUNT_USED = createField(DSL.name("current_count_used"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_ALLOCATED = createField(DSL.name("current_allocated"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_MAX_ALLOC = createField(DSL.name("current_max_alloc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> TOTAL_ALLOCATED = createField(DSL.name("total_allocated"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE() {
        this(DSL.name("memory_by_thread_by_current_bytes"), null);
    }

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(String alias) {
        this(DSL.name(alias), MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(Name alias) {
        this(alias, MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    private MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(Name alias, Table<MemoryByThreadByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(Name alias, Table<MemoryByThreadByCurrentBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(Table<O> child, ForeignKey<O, MemoryByThreadByCurrentBytesRecord> key) {
        super(child, key, MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE as(String alias) {
        return new MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(DSL.name(alias), this);
    }

    @Override
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE as(Name alias) {
        return new MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE rename(String name) {
        return new MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE rename(Name name) {
        return new MEMORY_BY_THREAD_BY_CURRENT_BYTES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, BigInteger, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
