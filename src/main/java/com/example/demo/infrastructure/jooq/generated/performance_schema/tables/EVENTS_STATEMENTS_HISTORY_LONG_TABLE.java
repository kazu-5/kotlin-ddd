/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.enums.EventsStatementsHistoryLongNestingEventType;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.EventsStatementsHistoryLongRecord;

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
public class EVENTS_STATEMENTS_HISTORY_LONG_TABLE extends TableImpl<EventsStatementsHistoryLongRecord> {

    private static final long serialVersionUID = 1632119539;

    /**
     * The reference instance of <code>performance_schema.events_statements_history_long</code>
     */
    public static final EVENTS_STATEMENTS_HISTORY_LONG_TABLE EVENTS_STATEMENTS_HISTORY_LONG = new EVENTS_STATEMENTS_HISTORY_LONG_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsHistoryLongRecord> getRecordType() {
        return EventsStatementsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SOURCE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SOURCE = createField(DSL.name("SOURCE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_START</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_END</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> LOCK_TIME = createField(DSL.name("LOCK_TIME"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SQL_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SQL_TEXT = createField(DSL.name("SQL_TEXT"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST = createField(DSL.name("DIGEST"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST_TEXT = createField(DSL.name("DIGEST_TEXT"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CURRENT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> CURRENT_SCHEMA = createField(DSL.name("CURRENT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MYSQL_ERRNO</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, Integer> MYSQL_ERRNO = createField(DSL.name("MYSQL_ERRNO"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.RETURNED_SQLSTATE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> RETURNED_SQLSTATE = createField(DSL.name("RETURNED_SQLSTATE"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MESSAGE_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> MESSAGE_TEXT = createField(DSL.name("MESSAGE_TEXT"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ERRORS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ERRORS = createField(DSL.name("ERRORS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.WARNINGS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> WARNINGS = createField(DSL.name("WARNINGS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_AFFECTED = createField(DSL.name("ROWS_AFFECTED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_SENT = createField(DSL.name("ROWS_SENT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_EXAMINED = createField(DSL.name("ROWS_EXAMINED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_DISK_TABLES = createField(DSL.name("CREATED_TMP_DISK_TABLES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_TABLES = createField(DSL.name("CREATED_TMP_TABLES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_JOIN = createField(DSL.name("SELECT_FULL_JOIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_RANGE_JOIN = createField(DSL.name("SELECT_FULL_RANGE_JOIN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE = createField(DSL.name("SELECT_RANGE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE_CHECK = createField(DSL.name("SELECT_RANGE_CHECK"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_SCAN = createField(DSL.name("SELECT_SCAN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_MERGE_PASSES = createField(DSL.name("SORT_MERGE_PASSES"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_RANGE = createField(DSL.name("SORT_RANGE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_ROWS = createField(DSL.name("SORT_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_SCAN = createField(DSL.name("SORT_SCAN"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_INDEX_USED = createField(DSL.name("NO_INDEX_USED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_GOOD_INDEX_USED = createField(DSL.name("NO_GOOD_INDEX_USED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, EventsStatementsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.example.demo.infrastructure.jooq.generated.performance_schema.enums.EventsStatementsHistoryLongNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_LEVEL</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, Integer> NESTING_EVENT_LEVEL = createField(DSL.name("NESTING_EVENT_LEVEL"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE() {
        this(DSL.name("events_statements_history_long"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE(Name alias) {
        this(alias, EVENTS_STATEMENTS_HISTORY_LONG);
    }

    private EVENTS_STATEMENTS_HISTORY_LONG_TABLE(Name alias, Table<EventsStatementsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EVENTS_STATEMENTS_HISTORY_LONG_TABLE(Name alias, Table<EventsStatementsHistoryLongRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EVENTS_STATEMENTS_HISTORY_LONG_TABLE(Table<O> child, ForeignKey<O, EventsStatementsHistoryLongRecord> key) {
        super(child, key, EVENTS_STATEMENTS_HISTORY_LONG);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE as(String alias) {
        return new EVENTS_STATEMENTS_HISTORY_LONG_TABLE(DSL.name(alias), this);
    }

    @Override
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE as(Name alias) {
        return new EVENTS_STATEMENTS_HISTORY_LONG_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE rename(String name) {
        return new EVENTS_STATEMENTS_HISTORY_LONG_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EVENTS_STATEMENTS_HISTORY_LONG_TABLE rename(Name name) {
        return new EVENTS_STATEMENTS_HISTORY_LONG_TABLE(name, null);
    }
}