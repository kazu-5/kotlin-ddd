/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.EventsStatementsSummaryByUserByEventNameRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE extends TableImpl<EventsStatementsSummaryByUserByEventNameRecord> {

    private static final long serialVersionUID = 421403901;

    /**
     * The reference instance of <code>performance_schema.events_statements_summary_by_user_by_event_name</code>
     */
    public static final EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = new EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsSummaryByUserByEventNameRecord> getRecordType() {
        return EventsStatementsSummaryByUserByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, String> USER = createField(DSL.name("USER"), org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_LOCK_TIME = createField(DSL.name("SUM_LOCK_TIME"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ERRORS</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_ERRORS = createField(DSL.name("SUM_ERRORS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_WARNINGS</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_WARNINGS = createField(DSL.name("SUM_WARNINGS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_ROWS_AFFECTED = createField(DSL.name("SUM_ROWS_AFFECTED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_ROWS_SENT = createField(DSL.name("SUM_ROWS_SENT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_ROWS_EXAMINED = createField(DSL.name("SUM_ROWS_EXAMINED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField(DSL.name("SUM_CREATED_TMP_DISK_TABLES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_CREATED_TMP_TABLES = createField(DSL.name("SUM_CREATED_TMP_TABLES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SELECT_FULL_JOIN = createField(DSL.name("SUM_SELECT_FULL_JOIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField(DSL.name("SUM_SELECT_FULL_RANGE_JOIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SELECT_RANGE = createField(DSL.name("SUM_SELECT_RANGE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SELECT_RANGE_CHECK = createField(DSL.name("SUM_SELECT_RANGE_CHECK"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SELECT_SCAN = createField(DSL.name("SUM_SELECT_SCAN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SORT_MERGE_PASSES = createField(DSL.name("SUM_SORT_MERGE_PASSES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SORT_RANGE = createField(DSL.name("SUM_SORT_RANGE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SORT_ROWS = createField(DSL.name("SUM_SORT_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_SORT_SCAN = createField(DSL.name("SUM_SORT_SCAN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_NO_INDEX_USED = createField(DSL.name("SUM_NO_INDEX_USED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByUserByEventNameRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField(DSL.name("SUM_NO_GOOD_INDEX_USED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_statements_summary_by_user_by_event_name</code> table reference
     */
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE() {
        this(DSL.name("events_statements_summary_by_user_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_user_by_event_name</code> table reference
     */
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_user_by_event_name</code> table reference
     */
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(Name alias) {
        this(alias, EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    private EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(Name alias, Table<EventsStatementsSummaryByUserByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(Name alias, Table<EventsStatementsSummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(Table<O> child, ForeignKey<O, EventsStatementsSummaryByUserByEventNameRecord> key) {
        super(child, key, EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE as(String alias) {
        return new EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(DSL.name(alias), this);
    }

    @Override
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE as(Name alias) {
        return new EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE rename(String name) {
        return new EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE rename(Name name) {
        return new EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME_TABLE(name, null);
    }
}
