/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records;


import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
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
public class EventsStagesSummaryByThreadByEventNameRecord extends TableRecordImpl<EventsStagesSummaryByThreadByEventNameRecord> implements Record7<ULong, String, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1824245255;

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.THREAD_ID;
    }

    @Override
    public Field<String> field2() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.COUNT_STAR;
    }

    @Override
    public Field<ULong> field4() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field5() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field6() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field7() {
        return EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    @Override
    public ULong component1() {
        return getThreadId();
    }

    @Override
    public String component2() {
        return getEventName();
    }

    @Override
    public ULong component3() {
        return getCountStar();
    }

    @Override
    public ULong component4() {
        return getSumTimerWait();
    }

    @Override
    public ULong component5() {
        return getMinTimerWait();
    }

    @Override
    public ULong component6() {
        return getAvgTimerWait();
    }

    @Override
    public ULong component7() {
        return getMaxTimerWait();
    }

    @Override
    public ULong value1() {
        return getThreadId();
    }

    @Override
    public String value2() {
        return getEventName();
    }

    @Override
    public ULong value3() {
        return getCountStar();
    }

    @Override
    public ULong value4() {
        return getSumTimerWait();
    }

    @Override
    public ULong value5() {
        return getMinTimerWait();
    }

    @Override
    public ULong value6() {
        return getAvgTimerWait();
    }

    @Override
    public ULong value7() {
        return getMaxTimerWait();
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value3(ULong value) {
        setCountStar(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value4(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value5(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value6(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord value7(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    @Override
    public EventsStagesSummaryByThreadByEventNameRecord values(ULong value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsStagesSummaryByThreadByEventNameRecord
     */
    public EventsStagesSummaryByThreadByEventNameRecord() {
        super(EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised EventsStagesSummaryByThreadByEventNameRecord
     */
    public EventsStagesSummaryByThreadByEventNameRecord(ULong threadId, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
        super(EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME_TABLE.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);

        set(0, threadId);
        set(1, eventName);
        set(2, countStar);
        set(3, sumTimerWait);
        set(4, minTimerWait);
        set(5, avgTimerWait);
        set(6, maxTimerWait);
    }
}
