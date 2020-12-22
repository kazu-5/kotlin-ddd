/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.InnodbCmpmemRecord;

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
public class INNODB_CMPMEM_TABLE extends TableImpl<InnodbCmpmemRecord> {

    private static final long serialVersionUID = 120806309;

    /**
     * The reference instance of <code>information_schema.INNODB_CMPMEM</code>
     */
    public static final INNODB_CMPMEM_TABLE INNODB_CMPMEM = new INNODB_CMPMEM_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpmemRecord> getRecordType() {
        return InnodbCmpmemRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMPMEM.page_size</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGE_SIZE = createField(DSL.name("page_size"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> BUFFER_POOL_INSTANCE = createField(DSL.name("buffer_pool_instance"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_used</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_USED = createField(DSL.name("pages_used"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_free</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_FREE = createField(DSL.name("pages_free"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
     */
    public final TableField<InnodbCmpmemRecord, Long> RELOCATION_OPS = createField(DSL.name("relocation_ops"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> RELOCATION_TIME = createField(DSL.name("relocation_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public INNODB_CMPMEM_TABLE() {
        this(DSL.name("INNODB_CMPMEM"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public INNODB_CMPMEM_TABLE(String alias) {
        this(DSL.name(alias), INNODB_CMPMEM);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public INNODB_CMPMEM_TABLE(Name alias) {
        this(alias, INNODB_CMPMEM);
    }

    private INNODB_CMPMEM_TABLE(Name alias, Table<InnodbCmpmemRecord> aliased) {
        this(alias, aliased, null);
    }

    private INNODB_CMPMEM_TABLE(Name alias, Table<InnodbCmpmemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> INNODB_CMPMEM_TABLE(Table<O> child, ForeignKey<O, InnodbCmpmemRecord> key) {
        super(child, key, INNODB_CMPMEM);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public INNODB_CMPMEM_TABLE as(String alias) {
        return new INNODB_CMPMEM_TABLE(DSL.name(alias), this);
    }

    @Override
    public INNODB_CMPMEM_TABLE as(Name alias) {
        return new INNODB_CMPMEM_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_CMPMEM_TABLE rename(String name) {
        return new INNODB_CMPMEM_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_CMPMEM_TABLE rename(Name name) {
        return new INNODB_CMPMEM_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}