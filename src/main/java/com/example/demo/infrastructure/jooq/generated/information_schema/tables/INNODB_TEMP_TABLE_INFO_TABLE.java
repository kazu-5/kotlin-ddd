/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.InnodbTempTableInfoRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class INNODB_TEMP_TABLE_INFO_TABLE extends TableImpl<InnodbTempTableInfoRecord> {

    private static final long serialVersionUID = 2021103073;

    /**
     * The reference instance of <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     */
    public static final INNODB_TEMP_TABLE_INFO_TABLE INNODB_TEMP_TABLE_INFO = new INNODB_TEMP_TABLE_INFO_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTempTableInfoRecord> getRecordType() {
        return InnodbTempTableInfoRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(202), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, UInteger> N_COLS = createField(DSL.name("N_COLS"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, UInteger> SPACE = createField(DSL.name("SPACE"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.PER_TABLE_TABLESPACE</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, String> PER_TABLE_TABLESPACE = createField(DSL.name("PER_TABLE_TABLESPACE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.IS_COMPRESSED</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, String> IS_COMPRESSED = createField(DSL.name("IS_COMPRESSED"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table reference
     */
    public INNODB_TEMP_TABLE_INFO_TABLE() {
        this(DSL.name("INNODB_TEMP_TABLE_INFO"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table reference
     */
    public INNODB_TEMP_TABLE_INFO_TABLE(String alias) {
        this(DSL.name(alias), INNODB_TEMP_TABLE_INFO);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table reference
     */
    public INNODB_TEMP_TABLE_INFO_TABLE(Name alias) {
        this(alias, INNODB_TEMP_TABLE_INFO);
    }

    private INNODB_TEMP_TABLE_INFO_TABLE(Name alias, Table<InnodbTempTableInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private INNODB_TEMP_TABLE_INFO_TABLE(Name alias, Table<InnodbTempTableInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> INNODB_TEMP_TABLE_INFO_TABLE(Table<O> child, ForeignKey<O, InnodbTempTableInfoRecord> key) {
        super(child, key, INNODB_TEMP_TABLE_INFO);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public INNODB_TEMP_TABLE_INFO_TABLE as(String alias) {
        return new INNODB_TEMP_TABLE_INFO_TABLE(DSL.name(alias), this);
    }

    @Override
    public INNODB_TEMP_TABLE_INFO_TABLE as(Name alias) {
        return new INNODB_TEMP_TABLE_INFO_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_TEMP_TABLE_INFO_TABLE rename(String name) {
        return new INNODB_TEMP_TABLE_INFO_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_TEMP_TABLE_INFO_TABLE rename(Name name) {
        return new INNODB_TEMP_TABLE_INFO_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<ULong, String, UInteger, UInteger, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
