/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.CondInstancesRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class COND_INSTANCES_TABLE extends TableImpl<CondInstancesRecord> {

    private static final long serialVersionUID = -559374372;

    /**
     * The reference instance of <code>performance_schema.cond_instances</code>
     */
    public static final COND_INSTANCES_TABLE COND_INSTANCES = new COND_INSTANCES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CondInstancesRecord> getRecordType() {
        return CondInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.cond_instances.NAME</code>.
     */
    public final TableField<CondInstancesRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.cond_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<CondInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.cond_instances</code> table reference
     */
    public COND_INSTANCES_TABLE() {
        this(DSL.name("cond_instances"), null);
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table reference
     */
    public COND_INSTANCES_TABLE(String alias) {
        this(DSL.name(alias), COND_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table reference
     */
    public COND_INSTANCES_TABLE(Name alias) {
        this(alias, COND_INSTANCES);
    }

    private COND_INSTANCES_TABLE(Name alias, Table<CondInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private COND_INSTANCES_TABLE(Name alias, Table<CondInstancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> COND_INSTANCES_TABLE(Table<O> child, ForeignKey<O, CondInstancesRecord> key) {
        super(child, key, COND_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public COND_INSTANCES_TABLE as(String alias) {
        return new COND_INSTANCES_TABLE(DSL.name(alias), this);
    }

    @Override
    public COND_INSTANCES_TABLE as(Name alias) {
        return new COND_INSTANCES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public COND_INSTANCES_TABLE rename(String name) {
        return new COND_INSTANCES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public COND_INSTANCES_TABLE rename(Name name) {
        return new COND_INSTANCES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, ULong> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
