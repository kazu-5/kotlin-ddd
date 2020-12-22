/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.enums.EventsWaitsHistoryLongNestingEventType;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.EventsWaitsHistoryLongRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class EVENTS_WAITS_HISTORY_LONG_TABLE extends TableImpl<EventsWaitsHistoryLongRecord> {

    private static final long serialVersionUID = -34014314;

    /**
     * The reference instance of <code>performance_schema.events_waits_history_long</code>
     */
    public static final EVENTS_WAITS_HISTORY_LONG_TABLE EVENTS_WAITS_HISTORY_LONG = new EVENTS_WAITS_HISTORY_LONG_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsHistoryLongRecord> getRecordType() {
        return EventsWaitsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.SOURCE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> SOURCE = createField(DSL.name("SOURCE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_START</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_END</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.SPINS</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, UInteger> SPINS = createField(DSL.name("SPINS"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.INDEX_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, EventsWaitsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.example.demo.infrastructure.jooq.generated.performance_schema.enums.EventsWaitsHistoryLongNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OPERATION</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OPERATION = createField(DSL.name("OPERATION"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NUMBER_OF_BYTES</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, Long> NUMBER_OF_BYTES = createField(DSL.name("NUMBER_OF_BYTES"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.FLAGS</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, UInteger> FLAGS = createField(DSL.name("FLAGS"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * Create a <code>performance_schema.events_waits_history_long</code> table reference
     */
    public EVENTS_WAITS_HISTORY_LONG_TABLE() {
        this(DSL.name("events_waits_history_long"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history_long</code> table reference
     */
    public EVENTS_WAITS_HISTORY_LONG_TABLE(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history_long</code> table reference
     */
    public EVENTS_WAITS_HISTORY_LONG_TABLE(Name alias) {
        this(alias, EVENTS_WAITS_HISTORY_LONG);
    }

    private EVENTS_WAITS_HISTORY_LONG_TABLE(Name alias, Table<EventsWaitsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EVENTS_WAITS_HISTORY_LONG_TABLE(Name alias, Table<EventsWaitsHistoryLongRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EVENTS_WAITS_HISTORY_LONG_TABLE(Table<O> child, ForeignKey<O, EventsWaitsHistoryLongRecord> key) {
        super(child, key, EVENTS_WAITS_HISTORY_LONG);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EVENTS_WAITS_HISTORY_LONG_TABLE as(String alias) {
        return new EVENTS_WAITS_HISTORY_LONG_TABLE(DSL.name(alias), this);
    }

    @Override
    public EVENTS_WAITS_HISTORY_LONG_TABLE as(Name alias) {
        return new EVENTS_WAITS_HISTORY_LONG_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_WAITS_HISTORY_LONG_TABLE rename(String name) {
        return new EVENTS_WAITS_HISTORY_LONG_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_WAITS_HISTORY_LONG_TABLE rename(Name name) {
        return new EVENTS_WAITS_HISTORY_LONG_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<ULong, ULong, ULong, String, String, ULong, ULong, ULong, UInteger, String, String, String, String, ULong, ULong, EventsWaitsHistoryLongNestingEventType, String, Long, UInteger> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
