/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.SCHEMA_INDEX_STATISTICS_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class SchemaIndexStatisticsRecord extends TableRecordImpl<SchemaIndexStatisticsRecord> implements Record11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> {

    private static final long serialVersionUID = -1562089098;

    /**
     * Setter for <code>sys.schema_index_statistics.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.index_name</code>.
     */
    public void setIndexName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.index_name</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.rows_selected</code>.
     */
    public void setRowsSelected(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.rows_selected</code>.
     */
    public ULong getRowsSelected() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.select_latency</code>.
     */
    public void setSelectLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.select_latency</code>.
     */
    public String getSelectLatency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    public void setRowsInserted(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    public ULong getRowsInserted() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.insert_latency</code>.
     */
    public void setInsertLatency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.insert_latency</code>.
     */
    public String getInsertLatency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.rows_updated</code>.
     */
    public void setRowsUpdated(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.rows_updated</code>.
     */
    public ULong getRowsUpdated() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.update_latency</code>.
     */
    public void setUpdateLatency(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.update_latency</code>.
     */
    public String getUpdateLatency() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    public void setRowsDeleted(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    public ULong getRowsDeleted() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.schema_index_statistics.delete_latency</code>.
     */
    public void setDeleteLatency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.schema_index_statistics.delete_latency</code>.
     */
    public String getDeleteLatency() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field2() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.TABLE_NAME;
    }

    @Override
    public Field<String> field3() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.INDEX_NAME;
    }

    @Override
    public Field<ULong> field4() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.ROWS_SELECTED;
    }

    @Override
    public Field<String> field5() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.SELECT_LATENCY;
    }

    @Override
    public Field<ULong> field6() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.ROWS_INSERTED;
    }

    @Override
    public Field<String> field7() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.INSERT_LATENCY;
    }

    @Override
    public Field<ULong> field8() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.ROWS_UPDATED;
    }

    @Override
    public Field<String> field9() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.UPDATE_LATENCY;
    }

    @Override
    public Field<ULong> field10() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.ROWS_DELETED;
    }

    @Override
    public Field<String> field11() {
        return SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS.DELETE_LATENCY;
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
    public String component3() {
        return getIndexName();
    }

    @Override
    public ULong component4() {
        return getRowsSelected();
    }

    @Override
    public String component5() {
        return getSelectLatency();
    }

    @Override
    public ULong component6() {
        return getRowsInserted();
    }

    @Override
    public String component7() {
        return getInsertLatency();
    }

    @Override
    public ULong component8() {
        return getRowsUpdated();
    }

    @Override
    public String component9() {
        return getUpdateLatency();
    }

    @Override
    public ULong component10() {
        return getRowsDeleted();
    }

    @Override
    public String component11() {
        return getDeleteLatency();
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
    public String value3() {
        return getIndexName();
    }

    @Override
    public ULong value4() {
        return getRowsSelected();
    }

    @Override
    public String value5() {
        return getSelectLatency();
    }

    @Override
    public ULong value6() {
        return getRowsInserted();
    }

    @Override
    public String value7() {
        return getInsertLatency();
    }

    @Override
    public ULong value8() {
        return getRowsUpdated();
    }

    @Override
    public String value9() {
        return getUpdateLatency();
    }

    @Override
    public ULong value10() {
        return getRowsDeleted();
    }

    @Override
    public String value11() {
        return getDeleteLatency();
    }

    @Override
    public SchemaIndexStatisticsRecord value1(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value2(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value3(String value) {
        setIndexName(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value4(ULong value) {
        setRowsSelected(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value5(String value) {
        setSelectLatency(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value6(ULong value) {
        setRowsInserted(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value7(String value) {
        setInsertLatency(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value8(ULong value) {
        setRowsUpdated(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value9(String value) {
        setUpdateLatency(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value10(ULong value) {
        setRowsDeleted(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord value11(String value) {
        setDeleteLatency(value);
        return this;
    }

    @Override
    public SchemaIndexStatisticsRecord values(String value1, String value2, String value3, ULong value4, String value5, ULong value6, String value7, ULong value8, String value9, ULong value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaIndexStatisticsRecord
     */
    public SchemaIndexStatisticsRecord() {
        super(SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS);
    }

    /**
     * Create a detached, initialised SchemaIndexStatisticsRecord
     */
    public SchemaIndexStatisticsRecord(String tableSchema, String tableName, String indexName, ULong rowsSelected, String selectLatency, ULong rowsInserted, String insertLatency, ULong rowsUpdated, String updateLatency, ULong rowsDeleted, String deleteLatency) {
        super(SCHEMA_INDEX_STATISTICS_TABLE.SCHEMA_INDEX_STATISTICS);

        set(0, tableSchema);
        set(1, tableName);
        set(2, indexName);
        set(3, rowsSelected);
        set(4, selectLatency);
        set(5, rowsInserted);
        set(6, insertLatency);
        set(7, rowsUpdated);
        set(8, updateLatency);
        set(9, rowsDeleted);
        set(10, deleteLatency);
    }
}
