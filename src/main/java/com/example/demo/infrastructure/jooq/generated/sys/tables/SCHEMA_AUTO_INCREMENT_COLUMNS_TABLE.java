/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.SchemaAutoIncrementColumnsRecord;

import java.math.BigDecimal;

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
public class SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE extends TableImpl<SchemaAutoIncrementColumnsRecord> {

    private static final long serialVersionUID = 841005162;

    /**
     * The reference instance of <code>sys.schema_auto_increment_columns</code>
     */
    public static final SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE SCHEMA_AUTO_INCREMENT_COLUMNS = new SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaAutoIncrementColumnsRecord> getRecordType() {
        return SchemaAutoIncrementColumnsRecord.class;
    }

    /**
     * The column <code>sys.schema_auto_increment_columns.table_schema</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.table_name</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.column_name</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.data_type</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> DATA_TYPE = createField(DSL.name("data_type"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.column_type</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_TYPE = createField(DSL.name("column_type"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.is_signed</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_SIGNED = createField(DSL.name("is_signed"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.is_unsigned</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_UNSIGNED = createField(DSL.name("is_unsigned"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.max_value</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, ULong> MAX_VALUE = createField(DSL.name("max_value"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.auto_increment</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, ULong> AUTO_INCREMENT = createField(DSL.name("auto_increment"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, BigDecimal> AUTO_INCREMENT_RATIO = createField(DSL.name("auto_increment_ratio"), org.jooq.impl.SQLDataType.DECIMAL(25, 4), this, "");

    /**
     * Create a <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE() {
        this(DSL.name("schema_auto_increment_columns"), null);
    }

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(String alias) {
        this(DSL.name(alias), SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(Name alias) {
        this(alias, SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    private SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(Name alias, Table<SchemaAutoIncrementColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(Name alias, Table<SchemaAutoIncrementColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(Table<O> child, ForeignKey<O, SchemaAutoIncrementColumnsRecord> key) {
        super(child, key, SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE as(String alias) {
        return new SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(DSL.name(alias), this);
    }

    @Override
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE as(Name alias) {
        return new SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE rename(String name) {
        return new SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE rename(Name name) {
        return new SCHEMA_AUTO_INCREMENT_COLUMNS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, Integer, Integer, ULong, ULong, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}