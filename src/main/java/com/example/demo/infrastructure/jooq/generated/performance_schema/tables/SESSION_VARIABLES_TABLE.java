/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.SessionVariablesRecord;

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
public class SESSION_VARIABLES_TABLE extends TableImpl<SessionVariablesRecord> {

    private static final long serialVersionUID = 610763153;

    /**
     * The reference instance of <code>performance_schema.session_variables</code>
     */
    public static final SESSION_VARIABLES_TABLE SESSION_VARIABLES = new SESSION_VARIABLES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionVariablesRecord> getRecordType() {
        return SessionVariablesRecord.class;
    }

    /**
     * The column <code>performance_schema.session_variables.VARIABLE_NAME</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_variables.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>performance_schema.session_variables</code> table reference
     */
    public SESSION_VARIABLES_TABLE() {
        this(DSL.name("session_variables"), null);
    }

    /**
     * Create an aliased <code>performance_schema.session_variables</code> table reference
     */
    public SESSION_VARIABLES_TABLE(String alias) {
        this(DSL.name(alias), SESSION_VARIABLES);
    }

    /**
     * Create an aliased <code>performance_schema.session_variables</code> table reference
     */
    public SESSION_VARIABLES_TABLE(Name alias) {
        this(alias, SESSION_VARIABLES);
    }

    private SESSION_VARIABLES_TABLE(Name alias, Table<SessionVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SESSION_VARIABLES_TABLE(Name alias, Table<SessionVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SESSION_VARIABLES_TABLE(Table<O> child, ForeignKey<O, SessionVariablesRecord> key) {
        super(child, key, SESSION_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public SESSION_VARIABLES_TABLE as(String alias) {
        return new SESSION_VARIABLES_TABLE(DSL.name(alias), this);
    }

    @Override
    public SESSION_VARIABLES_TABLE as(Name alias) {
        return new SESSION_VARIABLES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SESSION_VARIABLES_TABLE rename(String name) {
        return new SESSION_VARIABLES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SESSION_VARIABLES_TABLE rename(Name name) {
        return new SESSION_VARIABLES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}