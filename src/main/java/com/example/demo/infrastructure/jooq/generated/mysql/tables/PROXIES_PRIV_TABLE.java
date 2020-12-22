/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables;


import com.example.demo.infrastructure.jooq.generated.mysql.Indexes;
import com.example.demo.infrastructure.jooq.generated.mysql.Keys;
import com.example.demo.infrastructure.jooq.generated.mysql.Mysql;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ProxiesPrivRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * User proxy privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PROXIES_PRIV_TABLE extends TableImpl<ProxiesPrivRecord> {

    private static final long serialVersionUID = -896936180;

    /**
     * The reference instance of <code>mysql.proxies_priv</code>
     */
    public static final PROXIES_PRIV_TABLE PROXIES_PRIV = new PROXIES_PRIV_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProxiesPrivRecord> getRecordType() {
        return ProxiesPrivRecord.class;
    }

    /**
     * The column <code>mysql.proxies_priv.Host</code>.
     */
    public final TableField<ProxiesPrivRecord, String> HOST = createField(DSL.name("Host"), org.jooq.impl.SQLDataType.CHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.User</code>.
     */
    public final TableField<ProxiesPrivRecord, String> USER = createField(DSL.name("User"), org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Proxied_host</code>.
     */
    public final TableField<ProxiesPrivRecord, String> PROXIED_HOST = createField(DSL.name("Proxied_host"), org.jooq.impl.SQLDataType.CHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Proxied_user</code>.
     */
    public final TableField<ProxiesPrivRecord, String> PROXIED_USER = createField(DSL.name("Proxied_user"), org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.With_grant</code>.
     */
    public final TableField<ProxiesPrivRecord, Byte> WITH_GRANT = createField(DSL.name("With_grant"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Grantor</code>.
     */
    public final TableField<ProxiesPrivRecord, String> GRANTOR = createField(DSL.name("Grantor"), org.jooq.impl.SQLDataType.CHAR(93).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Timestamp</code>.
     */
    public final TableField<ProxiesPrivRecord, Timestamp> TIMESTAMP = createField(DSL.name("Timestamp"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mysql.proxies_priv</code> table reference
     */
    public PROXIES_PRIV_TABLE() {
        this(DSL.name("proxies_priv"), null);
    }

    /**
     * Create an aliased <code>mysql.proxies_priv</code> table reference
     */
    public PROXIES_PRIV_TABLE(String alias) {
        this(DSL.name(alias), PROXIES_PRIV);
    }

    /**
     * Create an aliased <code>mysql.proxies_priv</code> table reference
     */
    public PROXIES_PRIV_TABLE(Name alias) {
        this(alias, PROXIES_PRIV);
    }

    private PROXIES_PRIV_TABLE(Name alias, Table<ProxiesPrivRecord> aliased) {
        this(alias, aliased, null);
    }

    private PROXIES_PRIV_TABLE(Name alias, Table<ProxiesPrivRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("User proxy privileges"));
    }

    public <O extends Record> PROXIES_PRIV_TABLE(Table<O> child, ForeignKey<O, ProxiesPrivRecord> key) {
        super(child, key, PROXIES_PRIV);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROXIES_PRIV_GRANTOR, Indexes.PROXIES_PRIV_PRIMARY);
    }

    @Override
    public UniqueKey<ProxiesPrivRecord> getPrimaryKey() {
        return Keys.KEY_PROXIES_PRIV_PRIMARY;
    }

    @Override
    public List<UniqueKey<ProxiesPrivRecord>> getKeys() {
        return Arrays.<UniqueKey<ProxiesPrivRecord>>asList(Keys.KEY_PROXIES_PRIV_PRIMARY);
    }

    @Override
    public PROXIES_PRIV_TABLE as(String alias) {
        return new PROXIES_PRIV_TABLE(DSL.name(alias), this);
    }

    @Override
    public PROXIES_PRIV_TABLE as(Name alias) {
        return new PROXIES_PRIV_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PROXIES_PRIV_TABLE rename(String name) {
        return new PROXIES_PRIV_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PROXIES_PRIV_TABLE rename(Name name) {
        return new PROXIES_PRIV_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Byte, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}