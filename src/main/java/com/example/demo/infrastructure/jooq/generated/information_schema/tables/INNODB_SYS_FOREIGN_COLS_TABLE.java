/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.InnodbSysForeignColsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class INNODB_SYS_FOREIGN_COLS_TABLE extends TableImpl<InnodbSysForeignColsRecord> {

    private static final long serialVersionUID = 1651741932;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>
     */
    public static final INNODB_SYS_FOREIGN_COLS_TABLE INNODB_SYS_FOREIGN_COLS = new INNODB_SYS_FOREIGN_COLS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysForeignColsRecord> getRecordType() {
        return InnodbSysForeignColsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.ID</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> FOR_COL_NAME = createField(DSL.name("FOR_COL_NAME"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> REF_COL_NAME = createField(DSL.name("REF_COL_NAME"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.POS</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, UInteger> POS = createField(DSL.name("POS"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public INNODB_SYS_FOREIGN_COLS_TABLE() {
        this(DSL.name("INNODB_SYS_FOREIGN_COLS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public INNODB_SYS_FOREIGN_COLS_TABLE(String alias) {
        this(DSL.name(alias), INNODB_SYS_FOREIGN_COLS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public INNODB_SYS_FOREIGN_COLS_TABLE(Name alias) {
        this(alias, INNODB_SYS_FOREIGN_COLS);
    }

    private INNODB_SYS_FOREIGN_COLS_TABLE(Name alias, Table<InnodbSysForeignColsRecord> aliased) {
        this(alias, aliased, null);
    }

    private INNODB_SYS_FOREIGN_COLS_TABLE(Name alias, Table<InnodbSysForeignColsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> INNODB_SYS_FOREIGN_COLS_TABLE(Table<O> child, ForeignKey<O, InnodbSysForeignColsRecord> key) {
        super(child, key, INNODB_SYS_FOREIGN_COLS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public INNODB_SYS_FOREIGN_COLS_TABLE as(String alias) {
        return new INNODB_SYS_FOREIGN_COLS_TABLE(DSL.name(alias), this);
    }

    @Override
    public INNODB_SYS_FOREIGN_COLS_TABLE as(Name alias) {
        return new INNODB_SYS_FOREIGN_COLS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_SYS_FOREIGN_COLS_TABLE rename(String name) {
        return new INNODB_SYS_FOREIGN_COLS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_SYS_FOREIGN_COLS_TABLE rename(Name name) {
        return new INNODB_SYS_FOREIGN_COLS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}