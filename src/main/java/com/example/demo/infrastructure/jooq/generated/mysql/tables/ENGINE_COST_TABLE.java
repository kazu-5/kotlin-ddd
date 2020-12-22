/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables;


import com.example.demo.infrastructure.jooq.generated.mysql.Indexes;
import com.example.demo.infrastructure.jooq.generated.mysql.Keys;
import com.example.demo.infrastructure.jooq.generated.mysql.Mysql;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.EngineCostRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class ENGINE_COST_TABLE extends TableImpl<EngineCostRecord> {

    private static final long serialVersionUID = -1245352442;

    /**
     * The reference instance of <code>mysql.engine_cost</code>
     */
    public static final ENGINE_COST_TABLE ENGINE_COST = new ENGINE_COST_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EngineCostRecord> getRecordType() {
        return EngineCostRecord.class;
    }

    /**
     * The column <code>mysql.engine_cost.engine_name</code>.
     */
    public final TableField<EngineCostRecord, String> ENGINE_NAME = createField(DSL.name("engine_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.device_type</code>.
     */
    public final TableField<EngineCostRecord, Integer> DEVICE_TYPE = createField(DSL.name("device_type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.cost_name</code>.
     */
    public final TableField<EngineCostRecord, String> COST_NAME = createField(DSL.name("cost_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.cost_value</code>.
     */
    public final TableField<EngineCostRecord, Double> COST_VALUE = createField(DSL.name("cost_value"), org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>mysql.engine_cost.last_update</code>.
     */
    public final TableField<EngineCostRecord, Timestamp> LAST_UPDATE = createField(DSL.name("last_update"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.engine_cost.comment</code>.
     */
    public final TableField<EngineCostRecord, String> COMMENT = createField(DSL.name("comment"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>mysql.engine_cost</code> table reference
     */
    public ENGINE_COST_TABLE() {
        this(DSL.name("engine_cost"), null);
    }

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    public ENGINE_COST_TABLE(String alias) {
        this(DSL.name(alias), ENGINE_COST);
    }

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    public ENGINE_COST_TABLE(Name alias) {
        this(alias, ENGINE_COST);
    }

    private ENGINE_COST_TABLE(Name alias, Table<EngineCostRecord> aliased) {
        this(alias, aliased, null);
    }

    private ENGINE_COST_TABLE(Name alias, Table<EngineCostRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ENGINE_COST_TABLE(Table<O> child, ForeignKey<O, EngineCostRecord> key) {
        super(child, key, ENGINE_COST);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ENGINE_COST_PRIMARY);
    }

    @Override
    public UniqueKey<EngineCostRecord> getPrimaryKey() {
        return Keys.KEY_ENGINE_COST_PRIMARY;
    }

    @Override
    public List<UniqueKey<EngineCostRecord>> getKeys() {
        return Arrays.<UniqueKey<EngineCostRecord>>asList(Keys.KEY_ENGINE_COST_PRIMARY);
    }

    @Override
    public ENGINE_COST_TABLE as(String alias) {
        return new ENGINE_COST_TABLE(DSL.name(alias), this);
    }

    @Override
    public ENGINE_COST_TABLE as(Name alias) {
        return new ENGINE_COST_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ENGINE_COST_TABLE rename(String name) {
        return new ENGINE_COST_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ENGINE_COST_TABLE rename(Name name) {
        return new ENGINE_COST_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, Integer, String, Double, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}