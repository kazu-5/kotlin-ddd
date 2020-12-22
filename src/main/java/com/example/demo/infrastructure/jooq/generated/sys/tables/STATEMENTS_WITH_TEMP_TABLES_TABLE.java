/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.StatementsWithTempTablesRecord;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class STATEMENTS_WITH_TEMP_TABLES_TABLE extends TableImpl<StatementsWithTempTablesRecord> {

    private static final long serialVersionUID = -894695159;

    /**
     * The reference instance of <code>sys.statements_with_temp_tables</code>
     */
    public static final STATEMENTS_WITH_TEMP_TABLES_TABLE STATEMENTS_WITH_TEMP_TABLES = new STATEMENTS_WITH_TEMP_TABLES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatementsWithTempTablesRecord> getRecordType() {
        return StatementsWithTempTablesRecord.class;
    }

    /**
     * The column <code>sys.statements_with_temp_tables.query</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, String> QUERY = createField(DSL.name("query"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.db</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, String> DB = createField(DSL.name("db"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.exec_count</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, ULong> EXEC_COUNT = createField(DSL.name("exec_count"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.total_latency</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.memory_tmp_tables</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, ULong> MEMORY_TMP_TABLES = createField(DSL.name("memory_tmp_tables"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.disk_tmp_tables</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, ULong> DISK_TMP_TABLES = createField(DSL.name("disk_tmp_tables"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.avg_tmp_tables_per_query</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, BigInteger> AVG_TMP_TABLES_PER_QUERY = createField(DSL.name("avg_tmp_tables_per_query"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.tmp_tables_to_disk_pct</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, BigInteger> TMP_TABLES_TO_DISK_PCT = createField(DSL.name("tmp_tables_to_disk_pct"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(24).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.first_seen</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, Timestamp> FIRST_SEEN = createField(DSL.name("first_seen"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.last_seen</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, Timestamp> LAST_SEEN = createField(DSL.name("last_seen"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.statements_with_temp_tables.digest</code>.
     */
    public final TableField<StatementsWithTempTablesRecord, String> DIGEST = createField(DSL.name("digest"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>sys.statements_with_temp_tables</code> table reference
     */
    public STATEMENTS_WITH_TEMP_TABLES_TABLE() {
        this(DSL.name("statements_with_temp_tables"), null);
    }

    /**
     * Create an aliased <code>sys.statements_with_temp_tables</code> table reference
     */
    public STATEMENTS_WITH_TEMP_TABLES_TABLE(String alias) {
        this(DSL.name(alias), STATEMENTS_WITH_TEMP_TABLES);
    }

    /**
     * Create an aliased <code>sys.statements_with_temp_tables</code> table reference
     */
    public STATEMENTS_WITH_TEMP_TABLES_TABLE(Name alias) {
        this(alias, STATEMENTS_WITH_TEMP_TABLES);
    }

    private STATEMENTS_WITH_TEMP_TABLES_TABLE(Name alias, Table<StatementsWithTempTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private STATEMENTS_WITH_TEMP_TABLES_TABLE(Name alias, Table<StatementsWithTempTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> STATEMENTS_WITH_TEMP_TABLES_TABLE(Table<O> child, ForeignKey<O, StatementsWithTempTablesRecord> key) {
        super(child, key, STATEMENTS_WITH_TEMP_TABLES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public STATEMENTS_WITH_TEMP_TABLES_TABLE as(String alias) {
        return new STATEMENTS_WITH_TEMP_TABLES_TABLE(DSL.name(alias), this);
    }

    @Override
    public STATEMENTS_WITH_TEMP_TABLES_TABLE as(Name alias) {
        return new STATEMENTS_WITH_TEMP_TABLES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public STATEMENTS_WITH_TEMP_TABLES_TABLE rename(String name) {
        return new STATEMENTS_WITH_TEMP_TABLES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public STATEMENTS_WITH_TEMP_TABLES_TABLE rename(Name name) {
        return new STATEMENTS_WITH_TEMP_TABLES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, ULong, String, ULong, ULong, BigInteger, BigInteger, Timestamp, Timestamp, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
