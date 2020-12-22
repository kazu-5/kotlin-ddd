/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.tables.records;


import com.example.demo.infrastructure.jooq.generated.sys.tables.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SchemaTablesWithFullTableScansRecord extends TableRecordImpl<SchemaTablesWithFullTableScansRecord> implements Record4<String, String, ULong, String> {

    private static final long serialVersionUID = 2054826293;

    /**
     * Setter for <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.schema_tables_with_full_table_scans.object_name</code>.
     */
    public void setObjectName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.schema_tables_with_full_table_scans.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public void setRowsFullScanned(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public ULong getRowsFullScanned() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.schema_tables_with_full_table_scans.latency</code>.
     */
    public void setLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.schema_tables_with_full_table_scans.latency</code>.
     */
    public String getLatency() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, ULong, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, ULong, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field2() {
        return SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.ROWS_FULL_SCANNED;
    }

    @Override
    public Field<String> field4() {
        return SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.LATENCY;
    }

    @Override
    public String component1() {
        return getObjectSchema();
    }

    @Override
    public String component2() {
        return getObjectName();
    }

    @Override
    public ULong component3() {
        return getRowsFullScanned();
    }

    @Override
    public String component4() {
        return getLatency();
    }

    @Override
    public String value1() {
        return getObjectSchema();
    }

    @Override
    public String value2() {
        return getObjectName();
    }

    @Override
    public ULong value3() {
        return getRowsFullScanned();
    }

    @Override
    public String value4() {
        return getLatency();
    }

    @Override
    public SchemaTablesWithFullTableScansRecord value1(String value) {
        setObjectSchema(value);
        return this;
    }

    @Override
    public SchemaTablesWithFullTableScansRecord value2(String value) {
        setObjectName(value);
        return this;
    }

    @Override
    public SchemaTablesWithFullTableScansRecord value3(ULong value) {
        setRowsFullScanned(value);
        return this;
    }

    @Override
    public SchemaTablesWithFullTableScansRecord value4(String value) {
        setLatency(value);
        return this;
    }

    @Override
    public SchemaTablesWithFullTableScansRecord values(String value1, String value2, ULong value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaTablesWithFullTableScansRecord
     */
    public SchemaTablesWithFullTableScansRecord() {
        super(SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create a detached, initialised SchemaTablesWithFullTableScansRecord
     */
    public SchemaTablesWithFullTableScansRecord(String objectSchema, String objectName, ULong rowsFullScanned, String latency) {
        super(SCHEMA_TABLES_WITH_FULL_TABLE_SCANS_TABLE.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);

        set(0, objectSchema);
        set(1, objectName);
        set(2, rowsFullScanned);
        set(3, latency);
    }
}
