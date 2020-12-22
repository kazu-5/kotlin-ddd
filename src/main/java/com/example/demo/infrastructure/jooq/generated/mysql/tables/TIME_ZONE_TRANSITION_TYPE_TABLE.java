/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.tables;


import com.example.demo.infrastructure.jooq.generated.mysql.Indexes;
import com.example.demo.infrastructure.jooq.generated.mysql.Keys;
import com.example.demo.infrastructure.jooq.generated.mysql.Mysql;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneTransitionTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIME_ZONE_TRANSITION_TYPE_TABLE extends TableImpl<TimeZoneTransitionTypeRecord> {

    private static final long serialVersionUID = 420603733;

    /**
     * The reference instance of <code>mysql.time_zone_transition_type</code>
     */
    public static final TIME_ZONE_TRANSITION_TYPE_TABLE TIME_ZONE_TRANSITION_TYPE = new TIME_ZONE_TRANSITION_TYPE_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeZoneTransitionTypeRecord> getRecordType() {
        return TimeZoneTransitionTypeRecord.class;
    }

    /**
     * The column <code>mysql.time_zone_transition_type.Time_zone_id</code>.
     */
    public final TableField<TimeZoneTransitionTypeRecord, UInteger> TIME_ZONE_ID = createField(DSL.name("Time_zone_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Transition_type_id</code>.
     */
    public final TableField<TimeZoneTransitionTypeRecord, UInteger> TRANSITION_TYPE_ID = createField(DSL.name("Transition_type_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Offset</code>.
     */
    public final TableField<TimeZoneTransitionTypeRecord, Integer> OFFSET = createField(DSL.name("Offset"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Is_DST</code>.
     */
    public final TableField<TimeZoneTransitionTypeRecord, UByte> IS_DST = createField(DSL.name("Is_DST"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Abbreviation</code>.
     */
    public final TableField<TimeZoneTransitionTypeRecord, String> ABBREVIATION = createField(DSL.name("Abbreviation"), org.jooq.impl.SQLDataType.CHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>mysql.time_zone_transition_type</code> table reference
     */
    public TIME_ZONE_TRANSITION_TYPE_TABLE() {
        this(DSL.name("time_zone_transition_type"), null);
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition_type</code> table reference
     */
    public TIME_ZONE_TRANSITION_TYPE_TABLE(String alias) {
        this(DSL.name(alias), TIME_ZONE_TRANSITION_TYPE);
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition_type</code> table reference
     */
    public TIME_ZONE_TRANSITION_TYPE_TABLE(Name alias) {
        this(alias, TIME_ZONE_TRANSITION_TYPE);
    }

    private TIME_ZONE_TRANSITION_TYPE_TABLE(Name alias, Table<TimeZoneTransitionTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TIME_ZONE_TRANSITION_TYPE_TABLE(Name alias, Table<TimeZoneTransitionTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Time zone transition types"));
    }

    public <O extends Record> TIME_ZONE_TRANSITION_TYPE_TABLE(Table<O> child, ForeignKey<O, TimeZoneTransitionTypeRecord> key) {
        super(child, key, TIME_ZONE_TRANSITION_TYPE);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TIME_ZONE_TRANSITION_TYPE_PRIMARY);
    }

    @Override
    public UniqueKey<TimeZoneTransitionTypeRecord> getPrimaryKey() {
        return Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
    }

    @Override
    public List<UniqueKey<TimeZoneTransitionTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<TimeZoneTransitionTypeRecord>>asList(Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY);
    }

    @Override
    public TIME_ZONE_TRANSITION_TYPE_TABLE as(String alias) {
        return new TIME_ZONE_TRANSITION_TYPE_TABLE(DSL.name(alias), this);
    }

    @Override
    public TIME_ZONE_TRANSITION_TYPE_TABLE as(Name alias) {
        return new TIME_ZONE_TRANSITION_TYPE_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TIME_ZONE_TRANSITION_TYPE_TABLE rename(String name) {
        return new TIME_ZONE_TRANSITION_TYPE_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TIME_ZONE_TRANSITION_TYPE_TABLE rename(Name name) {
        return new TIME_ZONE_TRANSITION_TYPE_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UInteger, UInteger, Integer, UByte, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}