/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.InnodbSysFieldsRecord;

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
public class INNODB_SYS_FIELDS_TABLE extends TableImpl<InnodbSysFieldsRecord> {

    private static final long serialVersionUID = 1340350055;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FIELDS</code>
     */
    public static final INNODB_SYS_FIELDS_TABLE INNODB_SYS_FIELDS = new INNODB_SYS_FIELDS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysFieldsRecord> getRecordType() {
        return InnodbSysFieldsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbSysFieldsRecord, ULong> INDEX_ID = createField(DSL.name("INDEX_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public final TableField<InnodbSysFieldsRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public final TableField<InnodbSysFieldsRecord, UInteger> POS = createField(DSL.name("POS"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public INNODB_SYS_FIELDS_TABLE() {
        this(DSL.name("INNODB_SYS_FIELDS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public INNODB_SYS_FIELDS_TABLE(String alias) {
        this(DSL.name(alias), INNODB_SYS_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public INNODB_SYS_FIELDS_TABLE(Name alias) {
        this(alias, INNODB_SYS_FIELDS);
    }

    private INNODB_SYS_FIELDS_TABLE(Name alias, Table<InnodbSysFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private INNODB_SYS_FIELDS_TABLE(Name alias, Table<InnodbSysFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> INNODB_SYS_FIELDS_TABLE(Table<O> child, ForeignKey<O, InnodbSysFieldsRecord> key) {
        super(child, key, INNODB_SYS_FIELDS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public INNODB_SYS_FIELDS_TABLE as(String alias) {
        return new INNODB_SYS_FIELDS_TABLE(DSL.name(alias), this);
    }

    @Override
    public INNODB_SYS_FIELDS_TABLE as(Name alias) {
        return new INNODB_SYS_FIELDS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_SYS_FIELDS_TABLE rename(String name) {
        return new INNODB_SYS_FIELDS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_SYS_FIELDS_TABLE rename(Name name) {
        return new INNODB_SYS_FIELDS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}