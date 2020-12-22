/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.enums.X$sessionTrxAutocommit;
import com.example.demo.infrastructure.jooq.generated.sys.enums.X$sessionTrxState;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.X$sessionRecord;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class X$SESSION_TABLE extends TableImpl<X$sessionRecord> {

    private static final long serialVersionUID = 797385671;

    /**
     * The reference instance of <code>sys.x$session</code>
     */
    public static final X$SESSION_TABLE X$SESSION = new X$SESSION_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$sessionRecord> getRecordType() {
        return X$sessionRecord.class;
    }

    /**
     * The column <code>sys.x$session.thd_id</code>.
     */
    public final TableField<X$sessionRecord, ULong> THD_ID = createField(DSL.name("thd_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$session.conn_id</code>.
     */
    public final TableField<X$sessionRecord, ULong> CONN_ID = createField(DSL.name("conn_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.user</code>.
     */
    public final TableField<X$sessionRecord, String> USER = createField(DSL.name("user"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$session.db</code>.
     */
    public final TableField<X$sessionRecord, String> DB = createField(DSL.name("db"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$session.command</code>.
     */
    public final TableField<X$sessionRecord, String> COMMAND = createField(DSL.name("command"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>sys.x$session.state</code>.
     */
    public final TableField<X$sessionRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$session.time</code>.
     */
    public final TableField<X$sessionRecord, Long> TIME = createField(DSL.name("time"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$session.current_statement</code>.
     */
    public final TableField<X$sessionRecord, String> CURRENT_STATEMENT = createField(DSL.name("current_statement"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$session.statement_latency</code>.
     */
    public final TableField<X$sessionRecord, ULong> STATEMENT_LATENCY = createField(DSL.name("statement_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.progress</code>.
     */
    public final TableField<X$sessionRecord, BigDecimal> PROGRESS = createField(DSL.name("progress"), org.jooq.impl.SQLDataType.DECIMAL(26, 2), this, "");

    /**
     * The column <code>sys.x$session.lock_latency</code>.
     */
    public final TableField<X$sessionRecord, ULong> LOCK_LATENCY = createField(DSL.name("lock_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.rows_examined</code>.
     */
    public final TableField<X$sessionRecord, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.rows_sent</code>.
     */
    public final TableField<X$sessionRecord, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.rows_affected</code>.
     */
    public final TableField<X$sessionRecord, ULong> ROWS_AFFECTED = createField(DSL.name("rows_affected"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.tmp_tables</code>.
     */
    public final TableField<X$sessionRecord, ULong> TMP_TABLES = createField(DSL.name("tmp_tables"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.tmp_disk_tables</code>.
     */
    public final TableField<X$sessionRecord, ULong> TMP_DISK_TABLES = createField(DSL.name("tmp_disk_tables"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.full_scan</code>.
     */
    public final TableField<X$sessionRecord, String> FULL_SCAN = createField(DSL.name("full_scan"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.x$session.last_statement</code>.
     */
    public final TableField<X$sessionRecord, String> LAST_STATEMENT = createField(DSL.name("last_statement"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$session.last_statement_latency</code>.
     */
    public final TableField<X$sessionRecord, ULong> LAST_STATEMENT_LATENCY = createField(DSL.name("last_statement_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.current_memory</code>.
     */
    public final TableField<X$sessionRecord, BigInteger> CURRENT_MEMORY = createField(DSL.name("current_memory"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$session.last_wait</code>.
     */
    public final TableField<X$sessionRecord, String> LAST_WAIT = createField(DSL.name("last_wait"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$session.last_wait_latency</code>.
     */
    public final TableField<X$sessionRecord, String> LAST_WAIT_LATENCY = createField(DSL.name("last_wait_latency"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>sys.x$session.source</code>.
     */
    public final TableField<X$sessionRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$session.trx_latency</code>.
     */
    public final TableField<X$sessionRecord, ULong> TRX_LATENCY = createField(DSL.name("trx_latency"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$session.trx_state</code>.
     */
    public final TableField<X$sessionRecord, X$sessionTrxState> TRX_STATE = createField(DSL.name("trx_state"), org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.example.demo.infrastructure.jooq.generated.sys.enums.X$sessionTrxState.class), this, "");

    /**
     * The column <code>sys.x$session.trx_autocommit</code>.
     */
    public final TableField<X$sessionRecord, X$sessionTrxAutocommit> TRX_AUTOCOMMIT = createField(DSL.name("trx_autocommit"), org.jooq.impl.SQLDataType.VARCHAR(3).asEnumDataType(com.example.demo.infrastructure.jooq.generated.sys.enums.X$sessionTrxAutocommit.class), this, "");

    /**
     * The column <code>sys.x$session.pid</code>.
     */
    public final TableField<X$sessionRecord, String> PID = createField(DSL.name("pid"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>sys.x$session.program_name</code>.
     */
    public final TableField<X$sessionRecord, String> PROGRAM_NAME = createField(DSL.name("program_name"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>sys.x$session</code> table reference
     */
    public X$SESSION_TABLE() {
        this(DSL.name("x$session"), null);
    }

    /**
     * Create an aliased <code>sys.x$session</code> table reference
     */
    public X$SESSION_TABLE(String alias) {
        this(DSL.name(alias), X$SESSION);
    }

    /**
     * Create an aliased <code>sys.x$session</code> table reference
     */
    public X$SESSION_TABLE(Name alias) {
        this(alias, X$SESSION);
    }

    private X$SESSION_TABLE(Name alias, Table<X$sessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$SESSION_TABLE(Name alias, Table<X$sessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$SESSION_TABLE(Table<O> child, ForeignKey<O, X$sessionRecord> key) {
        super(child, key, X$SESSION);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$SESSION_TABLE as(String alias) {
        return new X$SESSION_TABLE(DSL.name(alias), this);
    }

    @Override
    public X$SESSION_TABLE as(Name alias) {
        return new X$SESSION_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$SESSION_TABLE rename(String name) {
        return new X$SESSION_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$SESSION_TABLE rename(Name name) {
        return new X$SESSION_TABLE(name, null);
    }
}