/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.StatisticsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class STATISTICS_TABLE extends TableImpl<StatisticsRecord> {

    private static final long serialVersionUID = 1997557372;

    /**
     * The reference instance of <code>information_schema.STATISTICS</code>
     */
    public static final STATISTICS_TABLE STATISTICS = new STATISTICS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatisticsRecord> getRecordType() {
        return StatisticsRecord.class;
    }

    /**
     * The column <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public final TableField<StatisticsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public final TableField<StatisticsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public final TableField<StatisticsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public final TableField<StatisticsRecord, Long> NON_UNIQUE = createField(DSL.name("NON_UNIQUE"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public final TableField<StatisticsRecord, String> INDEX_SCHEMA = createField(DSL.name("INDEX_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public final TableField<StatisticsRecord, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public final TableField<StatisticsRecord, Long> SEQ_IN_INDEX = createField(DSL.name("SEQ_IN_INDEX"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public final TableField<StatisticsRecord, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public final TableField<StatisticsRecord, String> COLLATION = createField(DSL.name("COLLATION"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public final TableField<StatisticsRecord, Long> CARDINALITY = createField(DSL.name("CARDINALITY"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public final TableField<StatisticsRecord, Long> SUB_PART = createField(DSL.name("SUB_PART"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.STATISTICS.PACKED</code>.
     */
    public final TableField<StatisticsRecord, String> PACKED = createField(DSL.name("PACKED"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public final TableField<StatisticsRecord, String> NULLABLE = createField(DSL.name("NULLABLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public final TableField<StatisticsRecord, String> INDEX_TYPE = createField(DSL.name("INDEX_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public final TableField<StatisticsRecord, String> COMMENT = createField(DSL.name("COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public final TableField<StatisticsRecord, String> INDEX_COMMENT = createField(DSL.name("INDEX_COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.STATISTICS</code> table reference
     */
    public STATISTICS_TABLE() {
        this(DSL.name("STATISTICS"), null);
    }

    /**
     * Create an aliased <code>information_schema.STATISTICS</code> table reference
     */
    public STATISTICS_TABLE(String alias) {
        this(DSL.name(alias), STATISTICS);
    }

    /**
     * Create an aliased <code>information_schema.STATISTICS</code> table reference
     */
    public STATISTICS_TABLE(Name alias) {
        this(alias, STATISTICS);
    }

    private STATISTICS_TABLE(Name alias, Table<StatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private STATISTICS_TABLE(Name alias, Table<StatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> STATISTICS_TABLE(Table<O> child, ForeignKey<O, StatisticsRecord> key) {
        super(child, key, STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public STATISTICS_TABLE as(String alias) {
        return new STATISTICS_TABLE(DSL.name(alias), this);
    }

    @Override
    public STATISTICS_TABLE as(Name alias) {
        return new STATISTICS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public STATISTICS_TABLE rename(String name) {
        return new STATISTICS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public STATISTICS_TABLE rename(Name name) {
        return new STATISTICS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
