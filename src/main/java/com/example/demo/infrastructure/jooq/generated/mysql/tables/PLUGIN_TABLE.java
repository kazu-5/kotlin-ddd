/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables;


import com.example.demo.infrastructure.jooq.generated.mysql.Indexes;
import com.example.demo.infrastructure.jooq.generated.mysql.Keys;
import com.example.demo.infrastructure.jooq.generated.mysql.Mysql;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.PluginRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * MySQL plugins
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PLUGIN_TABLE extends TableImpl<PluginRecord> {

    private static final long serialVersionUID = 942784388;

    /**
     * The reference instance of <code>mysql.plugin</code>
     */
    public static final PLUGIN_TABLE PLUGIN = new PLUGIN_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PluginRecord> getRecordType() {
        return PluginRecord.class;
    }

    /**
     * The column <code>mysql.plugin.name</code>.
     */
    public final TableField<PluginRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.plugin.dl</code>.
     */
    public final TableField<PluginRecord, String> DL = createField(DSL.name("dl"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mysql.plugin</code> table reference
     */
    public PLUGIN_TABLE() {
        this(DSL.name("plugin"), null);
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public PLUGIN_TABLE(String alias) {
        this(DSL.name(alias), PLUGIN);
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public PLUGIN_TABLE(Name alias) {
        this(alias, PLUGIN);
    }

    private PLUGIN_TABLE(Name alias, Table<PluginRecord> aliased) {
        this(alias, aliased, null);
    }

    private PLUGIN_TABLE(Name alias, Table<PluginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("MySQL plugins"));
    }

    public <O extends Record> PLUGIN_TABLE(Table<O> child, ForeignKey<O, PluginRecord> key) {
        super(child, key, PLUGIN);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PLUGIN_PRIMARY);
    }

    @Override
    public UniqueKey<PluginRecord> getPrimaryKey() {
        return Keys.KEY_PLUGIN_PRIMARY;
    }

    @Override
    public List<UniqueKey<PluginRecord>> getKeys() {
        return Arrays.<UniqueKey<PluginRecord>>asList(Keys.KEY_PLUGIN_PRIMARY);
    }

    @Override
    public PLUGIN_TABLE as(String alias) {
        return new PLUGIN_TABLE(DSL.name(alias), this);
    }

    @Override
    public PLUGIN_TABLE as(Name alias) {
        return new PLUGIN_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PLUGIN_TABLE rename(String name) {
        return new PLUGIN_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PLUGIN_TABLE rename(Name name) {
        return new PLUGIN_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
