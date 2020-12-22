/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.PluginsRecord;

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
public class PLUGINS_TABLE extends TableImpl<PluginsRecord> {

    private static final long serialVersionUID = 1208747537;

    /**
     * The reference instance of <code>information_schema.PLUGINS</code>
     */
    public static final PLUGINS_TABLE PLUGINS = new PLUGINS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PluginsRecord> getRecordType() {
        return PluginsRecord.class;
    }

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_NAME = createField(DSL.name("PLUGIN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_VERSION = createField(DSL.name("PLUGIN_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_STATUS = createField(DSL.name("PLUGIN_STATUS"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE = createField(DSL.name("PLUGIN_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE_VERSION = createField(DSL.name("PLUGIN_TYPE_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY = createField(DSL.name("PLUGIN_LIBRARY"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY_VERSION = createField(DSL.name("PLUGIN_LIBRARY_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_AUTHOR = createField(DSL.name("PLUGIN_AUTHOR"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_DESCRIPTION = createField(DSL.name("PLUGIN_DESCRIPTION"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LICENSE = createField(DSL.name("PLUGIN_LICENSE"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>information_schema.PLUGINS.LOAD_OPTION</code>.
     */
    public final TableField<PluginsRecord, String> LOAD_OPTION = createField(DSL.name("LOAD_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.PLUGINS</code> table reference
     */
    public PLUGINS_TABLE() {
        this(DSL.name("PLUGINS"), null);
    }

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    public PLUGINS_TABLE(String alias) {
        this(DSL.name(alias), PLUGINS);
    }

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    public PLUGINS_TABLE(Name alias) {
        this(alias, PLUGINS);
    }

    private PLUGINS_TABLE(Name alias, Table<PluginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PLUGINS_TABLE(Name alias, Table<PluginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PLUGINS_TABLE(Table<O> child, ForeignKey<O, PluginsRecord> key) {
        super(child, key, PLUGINS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public PLUGINS_TABLE as(String alias) {
        return new PLUGINS_TABLE(DSL.name(alias), this);
    }

    @Override
    public PLUGINS_TABLE as(Name alias) {
        return new PLUGINS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PLUGINS_TABLE rename(String name) {
        return new PLUGINS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PLUGINS_TABLE rename(Name name) {
        return new PLUGINS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
