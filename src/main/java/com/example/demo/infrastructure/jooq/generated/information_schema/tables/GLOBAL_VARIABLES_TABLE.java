/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.GlobalVariablesRecord;

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
public class GLOBAL_VARIABLES_TABLE extends TableImpl<GlobalVariablesRecord> {

    private static final long serialVersionUID = -677143007;

    /**
     * The reference instance of <code>information_schema.GLOBAL_VARIABLES</code>
     */
    public static final GLOBAL_VARIABLES_TABLE GLOBAL_VARIABLES = new GLOBAL_VARIABLES_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalVariablesRecord> getRecordType() {
        return GlobalVariablesRecord.class;
    }

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GLOBAL_VARIABLES_TABLE() {
        this(DSL.name("GLOBAL_VARIABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GLOBAL_VARIABLES_TABLE(String alias) {
        this(DSL.name(alias), GLOBAL_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GLOBAL_VARIABLES_TABLE(Name alias) {
        this(alias, GLOBAL_VARIABLES);
    }

    private GLOBAL_VARIABLES_TABLE(Name alias, Table<GlobalVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GLOBAL_VARIABLES_TABLE(Name alias, Table<GlobalVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GLOBAL_VARIABLES_TABLE(Table<O> child, ForeignKey<O, GlobalVariablesRecord> key) {
        super(child, key, GLOBAL_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public GLOBAL_VARIABLES_TABLE as(String alias) {
        return new GLOBAL_VARIABLES_TABLE(DSL.name(alias), this);
    }

    @Override
    public GLOBAL_VARIABLES_TABLE as(Name alias) {
        return new GLOBAL_VARIABLES_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GLOBAL_VARIABLES_TABLE rename(String name) {
        return new GLOBAL_VARIABLES_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GLOBAL_VARIABLES_TABLE rename(Name name) {
        return new GLOBAL_VARIABLES_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
