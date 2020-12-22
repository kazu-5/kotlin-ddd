/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables;


import com.example.demo.infrastructure.jooq.generated.performance_schema.PerformanceSchema;
import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records.ReplicationGroupMemberStatsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class REPLICATION_GROUP_MEMBER_STATS_TABLE extends TableImpl<ReplicationGroupMemberStatsRecord> {

    private static final long serialVersionUID = -1994895284;

    /**
     * The reference instance of <code>performance_schema.replication_group_member_stats</code>
     */
    public static final REPLICATION_GROUP_MEMBER_STATS_TABLE REPLICATION_GROUP_MEMBER_STATS = new REPLICATION_GROUP_MEMBER_STATS_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationGroupMemberStatsRecord> getRecordType() {
        return ReplicationGroupMemberStatsRecord.class;
    }

    /**
     * The column <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> VIEW_ID = createField(DSL.name("VIEW_ID"), org.jooq.impl.SQLDataType.CHAR(60).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> MEMBER_ID = createField(DSL.name("MEMBER_ID"), org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_IN_QUEUE = createField(DSL.name("COUNT_TRANSACTIONS_IN_QUEUE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_CHECKED = createField(DSL.name("COUNT_TRANSACTIONS_CHECKED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_CONFLICTS_DETECTED = createField(DSL.name("COUNT_CONFLICTS_DETECTED"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_ROWS_VALIDATING = createField(DSL.name("COUNT_TRANSACTIONS_ROWS_VALIDATING"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> TRANSACTIONS_COMMITTED_ALL_MEMBERS = createField(DSL.name("TRANSACTIONS_COMMITTED_ALL_MEMBERS"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> LAST_CONFLICT_FREE_TRANSACTION = createField(DSL.name("LAST_CONFLICT_FREE_TRANSACTION"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public REPLICATION_GROUP_MEMBER_STATS_TABLE() {
        this(DSL.name("replication_group_member_stats"), null);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public REPLICATION_GROUP_MEMBER_STATS_TABLE(String alias) {
        this(DSL.name(alias), REPLICATION_GROUP_MEMBER_STATS);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public REPLICATION_GROUP_MEMBER_STATS_TABLE(Name alias) {
        this(alias, REPLICATION_GROUP_MEMBER_STATS);
    }

    private REPLICATION_GROUP_MEMBER_STATS_TABLE(Name alias, Table<ReplicationGroupMemberStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private REPLICATION_GROUP_MEMBER_STATS_TABLE(Name alias, Table<ReplicationGroupMemberStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> REPLICATION_GROUP_MEMBER_STATS_TABLE(Table<O> child, ForeignKey<O, ReplicationGroupMemberStatsRecord> key) {
        super(child, key, REPLICATION_GROUP_MEMBER_STATS);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public REPLICATION_GROUP_MEMBER_STATS_TABLE as(String alias) {
        return new REPLICATION_GROUP_MEMBER_STATS_TABLE(DSL.name(alias), this);
    }

    @Override
    public REPLICATION_GROUP_MEMBER_STATS_TABLE as(Name alias) {
        return new REPLICATION_GROUP_MEMBER_STATS_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public REPLICATION_GROUP_MEMBER_STATS_TABLE rename(String name) {
        return new REPLICATION_GROUP_MEMBER_STATS_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public REPLICATION_GROUP_MEMBER_STATS_TABLE rename(Name name) {
        return new REPLICATION_GROUP_MEMBER_STATS_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, ULong, ULong, ULong, ULong, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
