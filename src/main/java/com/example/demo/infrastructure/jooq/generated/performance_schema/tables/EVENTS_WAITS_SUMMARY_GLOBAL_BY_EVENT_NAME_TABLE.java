/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord;

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
public class EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE extends TableImpl<EventsWaitsSummaryGlobalByEventNameRecord> {

    private static final long serialVersionUID = 738630165;

    /**
     * The reference instance of <code>performance_schema.events_waits_summary_global_by_event_name</code>
     */
    public static final EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = new EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryGlobalByEventNameRecord> getRecordType() {
        return EventsWaitsSummaryGlobalByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
     */
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE() {
        this(DSL.name("events_waits_summary_global_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
     */
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
     */
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(Name alias) {
        this(alias, EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    private EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(Name alias, Table<EventsWaitsSummaryGlobalByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(Name alias, Table<EventsWaitsSummaryGlobalByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(Table<O> child, ForeignKey<O, EventsWaitsSummaryGlobalByEventNameRecord> key) {
        super(child, key, EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE as(String alias) {
        return new EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(DSL.name(alias), this);
    }

    @Override
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE as(Name alias) {
        return new EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE rename(String name) {
        return new EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE rename(Name name) {
        return new EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
