/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.FileInstancesRecord;

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
import org.jooq.types.UInteger;


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
public class FILE_INSTANCES_TABLE extends TableImpl<FileInstancesRecord> {

    private static final long serialVersionUID = 327964202;

    /**
     * The reference instance of <code>performance_schema.file_instances</code>
     */
    public static final FILE_INSTANCES_TABLE FILE_INSTANCES = new FILE_INSTANCES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileInstancesRecord> getRecordType() {
        return FileInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.file_instances.FILE_NAME</code>.
     */
    public final TableField<FileInstancesRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.EVENT_NAME</code>.
     */
    public final TableField<FileInstancesRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.OPEN_COUNT</code>.
     */
    public final TableField<FileInstancesRecord, UInteger> OPEN_COUNT = createField(DSL.name("OPEN_COUNT"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.file_instances</code> table reference
     */
    public FILE_INSTANCES_TABLE() {
        this(DSL.name("file_instances"), null);
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table reference
     */
    public FILE_INSTANCES_TABLE(String alias) {
        this(DSL.name(alias), FILE_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table reference
     */
    public FILE_INSTANCES_TABLE(Name alias) {
        this(alias, FILE_INSTANCES);
    }

    private FILE_INSTANCES_TABLE(Name alias, Table<FileInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FILE_INSTANCES_TABLE(Name alias, Table<FileInstancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FILE_INSTANCES_TABLE(Table<O> child, ForeignKey<O, FileInstancesRecord> key) {
        super(child, key, FILE_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public FILE_INSTANCES_TABLE as(String alias) {
        return new FILE_INSTANCES_TABLE(DSL.name(alias), this);
    }

    @Override
    public FILE_INSTANCES_TABLE as(Name alias) {
        return new FILE_INSTANCES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FILE_INSTANCES_TABLE rename(String name) {
        return new FILE_INSTANCES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FILE_INSTANCES_TABLE rename(Name name) {
        return new FILE_INSTANCES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}