/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;
import com.example.demo.infrastructure.jooq.generated.sys.tables.records.SchemaObjectOverviewRecord;

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
public class SCHEMA_OBJECT_OVERVIEW_TABLE extends TableImpl<SchemaObjectOverviewRecord> {

    private static final long serialVersionUID = 105353052;

    /**
     * The reference instance of <code>sys.schema_object_overview</code>
     */
    public static final SCHEMA_OBJECT_OVERVIEW_TABLE SCHEMA_OBJECT_OVERVIEW = new SCHEMA_OBJECT_OVERVIEW_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaObjectOverviewRecord> getRecordType() {
        return SchemaObjectOverviewRecord.class;
    }

    /**
     * The column <code>sys.schema_object_overview.db</code>.
     */
    public final TableField<SchemaObjectOverviewRecord, String> DB = createField(DSL.name("db"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_object_overview.object_type</code>.
     */
    public final TableField<SchemaObjectOverviewRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_object_overview.count</code>.
     */
    public final TableField<SchemaObjectOverviewRecord, Long> COUNT = createField(DSL.name("count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>sys.schema_object_overview</code> table reference
     */
    public SCHEMA_OBJECT_OVERVIEW_TABLE() {
        this(DSL.name("schema_object_overview"), null);
    }

    /**
     * Create an aliased <code>sys.schema_object_overview</code> table reference
     */
    public SCHEMA_OBJECT_OVERVIEW_TABLE(String alias) {
        this(DSL.name(alias), SCHEMA_OBJECT_OVERVIEW);
    }

    /**
     * Create an aliased <code>sys.schema_object_overview</code> table reference
     */
    public SCHEMA_OBJECT_OVERVIEW_TABLE(Name alias) {
        this(alias, SCHEMA_OBJECT_OVERVIEW);
    }

    private SCHEMA_OBJECT_OVERVIEW_TABLE(Name alias, Table<SchemaObjectOverviewRecord> aliased) {
        this(alias, aliased, null);
    }

    private SCHEMA_OBJECT_OVERVIEW_TABLE(Name alias, Table<SchemaObjectOverviewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> SCHEMA_OBJECT_OVERVIEW_TABLE(Table<O> child, ForeignKey<O, SchemaObjectOverviewRecord> key) {
        super(child, key, SCHEMA_OBJECT_OVERVIEW);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SCHEMA_OBJECT_OVERVIEW_TABLE as(String alias) {
        return new SCHEMA_OBJECT_OVERVIEW_TABLE(DSL.name(alias), this);
    }

    @Override
    public SCHEMA_OBJECT_OVERVIEW_TABLE as(Name alias) {
        return new SCHEMA_OBJECT_OVERVIEW_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_OBJECT_OVERVIEW_TABLE rename(String name) {
        return new SCHEMA_OBJECT_OVERVIEW_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SCHEMA_OBJECT_OVERVIEW_TABLE rename(Name name) {
        return new SCHEMA_OBJECT_OVERVIEW_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}