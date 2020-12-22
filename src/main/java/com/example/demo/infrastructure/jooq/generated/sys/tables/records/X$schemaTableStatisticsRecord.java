/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.X$SCHEMA_TABLE_STATISTICS_TABLE;

import java.math.BigInteger;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$schemaTableStatisticsRecord extends TableRecordImpl<X$schemaTableStatisticsRecord> implements Record19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> {

    private static final long serialVersionUID = 272106854;

    /**
     * Setter for <code>sys.x$schema_table_statistics.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.rows_fetched</code>.
     */
    public void setRowsFetched(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.rows_fetched</code>.
     */
    public ULong getRowsFetched() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.fetch_latency</code>.
     */
    public void setFetchLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.fetch_latency</code>.
     */
    public ULong getFetchLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.rows_inserted</code>.
     */
    public void setRowsInserted(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.rows_inserted</code>.
     */
    public ULong getRowsInserted() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.insert_latency</code>.
     */
    public void setInsertLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.insert_latency</code>.
     */
    public ULong getInsertLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.rows_updated</code>.
     */
    public void setRowsUpdated(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.rows_updated</code>.
     */
    public ULong getRowsUpdated() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.update_latency</code>.
     */
    public void setUpdateLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.update_latency</code>.
     */
    public ULong getUpdateLatency() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.rows_deleted</code>.
     */
    public void setRowsDeleted(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.rows_deleted</code>.
     */
    public ULong getRowsDeleted() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.delete_latency</code>.
     */
    public void setDeleteLatency(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.delete_latency</code>.
     */
    public ULong getDeleteLatency() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_read_requests</code>.
     */
    public void setIoReadRequests(BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_read_requests</code>.
     */
    public BigInteger getIoReadRequests() {
        return (BigInteger) get(11);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_read</code>.
     */
    public void setIoRead(BigInteger value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_read</code>.
     */
    public BigInteger getIoRead() {
        return (BigInteger) get(12);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_read_latency</code>.
     */
    public void setIoReadLatency(BigInteger value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_read_latency</code>.
     */
    public BigInteger getIoReadLatency() {
        return (BigInteger) get(13);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_write_requests</code>.
     */
    public void setIoWriteRequests(BigInteger value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_write_requests</code>.
     */
    public BigInteger getIoWriteRequests() {
        return (BigInteger) get(14);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_write</code>.
     */
    public void setIoWrite(BigInteger value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_write</code>.
     */
    public BigInteger getIoWrite() {
        return (BigInteger) get(15);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_write_latency</code>.
     */
    public void setIoWriteLatency(BigInteger value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_write_latency</code>.
     */
    public BigInteger getIoWriteLatency() {
        return (BigInteger) get(16);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_misc_requests</code>.
     */
    public void setIoMiscRequests(BigInteger value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_misc_requests</code>.
     */
    public BigInteger getIoMiscRequests() {
        return (BigInteger) get(17);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics.io_misc_latency</code>.
     */
    public void setIoMiscLatency(BigInteger value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics.io_misc_latency</code>.
     */
    public BigInteger getIoMiscLatency() {
        return (BigInteger) get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field2() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.TABLE_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field4() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.ROWS_FETCHED;
    }

    @Override
    public Field<ULong> field5() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.FETCH_LATENCY;
    }

    @Override
    public Field<ULong> field6() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.ROWS_INSERTED;
    }

    @Override
    public Field<ULong> field7() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.INSERT_LATENCY;
    }

    @Override
    public Field<ULong> field8() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.ROWS_UPDATED;
    }

    @Override
    public Field<ULong> field9() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.UPDATE_LATENCY;
    }

    @Override
    public Field<ULong> field10() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.ROWS_DELETED;
    }

    @Override
    public Field<ULong> field11() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.DELETE_LATENCY;
    }

    @Override
    public Field<BigInteger> field12() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_READ_REQUESTS;
    }

    @Override
    public Field<BigInteger> field13() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_READ;
    }

    @Override
    public Field<BigInteger> field14() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_READ_LATENCY;
    }

    @Override
    public Field<BigInteger> field15() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_WRITE_REQUESTS;
    }

    @Override
    public Field<BigInteger> field16() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_WRITE;
    }

    @Override
    public Field<BigInteger> field17() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_WRITE_LATENCY;
    }

    @Override
    public Field<BigInteger> field18() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_MISC_REQUESTS;
    }

    @Override
    public Field<BigInteger> field19() {
        return X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS.IO_MISC_LATENCY;
    }

    @Override
    public String component1() {
        return getTableSchema();
    }

    @Override
    public String component2() {
        return getTableName();
    }

    @Override
    public ULong component3() {
        return getTotalLatency();
    }

    @Override
    public ULong component4() {
        return getRowsFetched();
    }

    @Override
    public ULong component5() {
        return getFetchLatency();
    }

    @Override
    public ULong component6() {
        return getRowsInserted();
    }

    @Override
    public ULong component7() {
        return getInsertLatency();
    }

    @Override
    public ULong component8() {
        return getRowsUpdated();
    }

    @Override
    public ULong component9() {
        return getUpdateLatency();
    }

    @Override
    public ULong component10() {
        return getRowsDeleted();
    }

    @Override
    public ULong component11() {
        return getDeleteLatency();
    }

    @Override
    public BigInteger component12() {
        return getIoReadRequests();
    }

    @Override
    public BigInteger component13() {
        return getIoRead();
    }

    @Override
    public BigInteger component14() {
        return getIoReadLatency();
    }

    @Override
    public BigInteger component15() {
        return getIoWriteRequests();
    }

    @Override
    public BigInteger component16() {
        return getIoWrite();
    }

    @Override
    public BigInteger component17() {
        return getIoWriteLatency();
    }

    @Override
    public BigInteger component18() {
        return getIoMiscRequests();
    }

    @Override
    public BigInteger component19() {
        return getIoMiscLatency();
    }

    @Override
    public String value1() {
        return getTableSchema();
    }

    @Override
    public String value2() {
        return getTableName();
    }

    @Override
    public ULong value3() {
        return getTotalLatency();
    }

    @Override
    public ULong value4() {
        return getRowsFetched();
    }

    @Override
    public ULong value5() {
        return getFetchLatency();
    }

    @Override
    public ULong value6() {
        return getRowsInserted();
    }

    @Override
    public ULong value7() {
        return getInsertLatency();
    }

    @Override
    public ULong value8() {
        return getRowsUpdated();
    }

    @Override
    public ULong value9() {
        return getUpdateLatency();
    }

    @Override
    public ULong value10() {
        return getRowsDeleted();
    }

    @Override
    public ULong value11() {
        return getDeleteLatency();
    }

    @Override
    public BigInteger value12() {
        return getIoReadRequests();
    }

    @Override
    public BigInteger value13() {
        return getIoRead();
    }

    @Override
    public BigInteger value14() {
        return getIoReadLatency();
    }

    @Override
    public BigInteger value15() {
        return getIoWriteRequests();
    }

    @Override
    public BigInteger value16() {
        return getIoWrite();
    }

    @Override
    public BigInteger value17() {
        return getIoWriteLatency();
    }

    @Override
    public BigInteger value18() {
        return getIoMiscRequests();
    }

    @Override
    public BigInteger value19() {
        return getIoMiscLatency();
    }

    @Override
    public X$schemaTableStatisticsRecord value1(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value2(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value3(ULong value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value4(ULong value) {
        setRowsFetched(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value5(ULong value) {
        setFetchLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value6(ULong value) {
        setRowsInserted(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value7(ULong value) {
        setInsertLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value8(ULong value) {
        setRowsUpdated(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value9(ULong value) {
        setUpdateLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value10(ULong value) {
        setRowsDeleted(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value11(ULong value) {
        setDeleteLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value12(BigInteger value) {
        setIoReadRequests(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value13(BigInteger value) {
        setIoRead(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value14(BigInteger value) {
        setIoReadLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value15(BigInteger value) {
        setIoWriteRequests(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value16(BigInteger value) {
        setIoWrite(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value17(BigInteger value) {
        setIoWriteLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value18(BigInteger value) {
        setIoMiscRequests(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord value19(BigInteger value) {
        setIoMiscLatency(value);
        return this;
    }

    @Override
    public X$schemaTableStatisticsRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, BigInteger value12, BigInteger value13, BigInteger value14, BigInteger value15, BigInteger value16, BigInteger value17, BigInteger value18, BigInteger value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$schemaTableStatisticsRecord
     */
    public X$schemaTableStatisticsRecord() {
        super(X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS);
    }

    /**
     * Create a detached, initialised X$schemaTableStatisticsRecord
     */
    public X$schemaTableStatisticsRecord(String tableSchema, String tableName, ULong totalLatency, ULong rowsFetched, ULong fetchLatency, ULong rowsInserted, ULong insertLatency, ULong rowsUpdated, ULong updateLatency, ULong rowsDeleted, ULong deleteLatency, BigInteger ioReadRequests, BigInteger ioRead, BigInteger ioReadLatency, BigInteger ioWriteRequests, BigInteger ioWrite, BigInteger ioWriteLatency, BigInteger ioMiscRequests, BigInteger ioMiscLatency) {
        super(X$SCHEMA_TABLE_STATISTICS_TABLE.X$SCHEMA_TABLE_STATISTICS);

        set(0, tableSchema);
        set(1, tableName);
        set(2, totalLatency);
        set(3, rowsFetched);
        set(4, fetchLatency);
        set(5, rowsInserted);
        set(6, insertLatency);
        set(7, rowsUpdated);
        set(8, updateLatency);
        set(9, rowsDeleted);
        set(10, deleteLatency);
        set(11, ioReadRequests);
        set(12, ioRead);
        set(13, ioReadLatency);
        set(14, ioWriteRequests);
        set(15, ioWrite);
        set(16, ioWriteLatency);
        set(17, ioMiscRequests);
        set(18, ioMiscLatency);
    }
}