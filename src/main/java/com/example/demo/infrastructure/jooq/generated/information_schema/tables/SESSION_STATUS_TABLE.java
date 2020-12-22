/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.SessionStatusRecord;

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
public class SESSION_STATUS_TABLE extends TableImpl<SessionStatusRecord> {

    private static final long serialVersionUID = 1919725477;

    /**
     * The reference instance of <code>information_schema.SESSION_STATUS</code>
     */
    public static final SESSION_STATUS_TABLE SESSION_STATUS = new SESSION_STATUS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionStatusRecord> getRecordType() {
        return SessionStatusRecord.class;
    }

    /**
     * The column <code>information_schema.SESSION_STATUS.VARIABLE_NAME</code>.
     */
    public final TableField<SessionStatusRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.SESSION_STATUS.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionStatusRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>information_schema.SESSION_STATUS</code> table reference
     */
    public SESSION_STATUS_TABLE() {
        this(DSL.name("SESSION_STATUS"), null);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_STATUS</code> table reference
     */
    public SESSION_STATUS_TABLE(String alias) {
        this(DSL.name(alias), SESSION_STATUS);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_STATUS</code> table reference
     */
    public SESSION_STATUS_TABLE(Name alias) {
        this(alias, SESSION_STATUS);
    }

    private SESSION_STATUS_TABLE(Name alias, Table<SessionStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private SESSION_STATUS_TABLE(Name alias, Table<SessionStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SESSION_STATUS_TABLE(Table<O> child, ForeignKey<O, SessionStatusRecord> key) {
        super(child, key, SESSION_STATUS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SESSION_STATUS_TABLE as(String alias) {
        return new SESSION_STATUS_TABLE(DSL.name(alias), this);
    }

    @Override
    public SESSION_STATUS_TABLE as(Name alias) {
        return new SESSION_STATUS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SESSION_STATUS_TABLE rename(String name) {
        return new SESSION_STATUS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SESSION_STATUS_TABLE rename(Name name) {
        return new SESSION_STATUS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}