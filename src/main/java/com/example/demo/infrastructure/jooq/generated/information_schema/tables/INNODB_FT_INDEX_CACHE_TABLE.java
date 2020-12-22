/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables;


import com.example.demo.infrastructure.jooq.generated.information_schema.InformationSchema;
import com.example.demo.infrastructure.jooq.generated.information_schema.tables.records.InnodbFtIndexCacheRecord;

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
public class INNODB_FT_INDEX_CACHE_TABLE extends TableImpl<InnodbFtIndexCacheRecord> {

    private static final long serialVersionUID = 1602275112;

    /**
     * The reference instance of <code>information_schema.INNODB_FT_INDEX_CACHE</code>
     */
    public static final INNODB_FT_INDEX_CACHE_TABLE INNODB_FT_INDEX_CACHE = new INNODB_FT_INDEX_CACHE_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtIndexCacheRecord> getRecordType() {
        return InnodbFtIndexCacheRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, String> WORD = createField(DSL.name("WORD"), org.jooq.impl.SQLDataType.VARCHAR(337).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> FIRST_DOC_ID = createField(DSL.name("FIRST_DOC_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> LAST_DOC_ID = createField(DSL.name("LAST_DOC_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_COUNT = createField(DSL.name("DOC_COUNT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_ID = createField(DSL.name("DOC_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> POSITION = createField(DSL.name("POSITION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
     */
    public INNODB_FT_INDEX_CACHE_TABLE() {
        this(DSL.name("INNODB_FT_INDEX_CACHE"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
     */
    public INNODB_FT_INDEX_CACHE_TABLE(String alias) {
        this(DSL.name(alias), INNODB_FT_INDEX_CACHE);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
     */
    public INNODB_FT_INDEX_CACHE_TABLE(Name alias) {
        this(alias, INNODB_FT_INDEX_CACHE);
    }

    private INNODB_FT_INDEX_CACHE_TABLE(Name alias, Table<InnodbFtIndexCacheRecord> aliased) {
        this(alias, aliased, null);
    }

    private INNODB_FT_INDEX_CACHE_TABLE(Name alias, Table<InnodbFtIndexCacheRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> INNODB_FT_INDEX_CACHE_TABLE(Table<O> child, ForeignKey<O, InnodbFtIndexCacheRecord> key) {
        super(child, key, INNODB_FT_INDEX_CACHE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public INNODB_FT_INDEX_CACHE_TABLE as(String alias) {
        return new INNODB_FT_INDEX_CACHE_TABLE(DSL.name(alias), this);
    }

    @Override
    public INNODB_FT_INDEX_CACHE_TABLE as(Name alias) {
        return new INNODB_FT_INDEX_CACHE_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_FT_INDEX_CACHE_TABLE rename(String name) {
        return new INNODB_FT_INDEX_CACHE_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public INNODB_FT_INDEX_CACHE_TABLE rename(Name name) {
        return new INNODB_FT_INDEX_CACHE_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}