/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.ReplicationApplierStatusByWorkerRecord;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE extends TableImpl<ReplicationApplierStatusByWorkerRecord> {

    private static final long serialVersionUID = -335258946;

    /**
     * The reference instance of <code>performance_schema.replication_applier_status_by_worker</code>
     */
    public static final REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE REPLICATION_APPLIER_STATUS_BY_WORKER = new REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationApplierStatusByWorkerRecord> getRecordType() {
        return ReplicationApplierStatusByWorkerRecord.class;
    }

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.CHANNEL_NAME</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.WORKER_ID</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, ULong> WORKER_ID = createField(DSL.name("WORKER_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.THREAD_ID</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.SERVICE_STATE</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, ReplicationApplierStatusByWorkerServiceState> SERVICE_STATE = createField(DSL.name("SERVICE_STATE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.example.demo.infrastructure.jooq.generated.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState.class), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_SEEN_TRANSACTION</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, String> LAST_SEEN_TRANSACTION = createField(DSL.name("LAST_SEEN_TRANSACTION"), org.jooq.impl.SQLDataType.CHAR(57).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_NUMBER</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, Integer> LAST_ERROR_NUMBER = createField(DSL.name("LAST_ERROR_NUMBER"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_MESSAGE</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, String> LAST_ERROR_MESSAGE = createField(DSL.name("LAST_ERROR_MESSAGE"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP</code>.
     */
    public final TableField<ReplicationApplierStatusByWorkerRecord, Timestamp> LAST_ERROR_TIMESTAMP = createField(DSL.name("LAST_ERROR_TIMESTAMP"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE() {
        this(DSL.name("replication_applier_status_by_worker"), null);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(Name alias) {
        this(alias, REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    private REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(Name alias, Table<ReplicationApplierStatusByWorkerRecord> aliased) {
        this(alias, aliased, null);
    }

    private REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(Name alias, Table<ReplicationApplierStatusByWorkerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(Table<O> child, ForeignKey<O, ReplicationApplierStatusByWorkerRecord> key) {
        super(child, key, REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE as(String alias) {
        return new REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(DSL.name(alias), this);
    }

    @Override
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE as(Name alias) {
        return new REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE rename(String name) {
        return new REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE rename(Name name) {
        return new REPLICATION_APPLIER_STATUS_BY_WORKER_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, ULong, ULong, ReplicationApplierStatusByWorkerServiceState, String, Integer, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}