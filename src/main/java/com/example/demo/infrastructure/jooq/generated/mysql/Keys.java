/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql;


import com.example.demo.infrastructure.jooq.generated.mysql.tables.COLUMNS_PRIV_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.DB_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.ENGINE_COST_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.EVENT_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.FUNC_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.GTID_EXECUTED_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.HELP_CATEGORY_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.HELP_KEYWORD_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.HELP_RELATION_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.HELP_TOPIC_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.INNODB_INDEX_STATS_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.INNODB_TABLE_STATS_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.NDB_BINLOG_INDEX_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.PLUGIN_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.PROCS_PRIV_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.PROC_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.PROXIES_PRIV_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.SERVERS_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.SERVER_COST_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.SLAVE_MASTER_INFO_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.SLAVE_RELAY_LOG_INFO_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.SLAVE_WORKER_INFO_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TABLES_PRIV_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_LEAP_SECOND_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_NAME_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_TRANSITION_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.TIME_ZONE_TRANSITION_TYPE_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.USER_TABLE;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ColumnsPrivRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.DbRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.EngineCostRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.EventRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.FuncRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.GtidExecutedRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.HelpCategoryRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.HelpKeywordRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.HelpRelationRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.HelpTopicRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.InnodbIndexStatsRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.InnodbTableStatsRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.NdbBinlogIndexRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.PluginRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ProcRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ProcsPrivRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ProxiesPrivRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ServerCostRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.ServersRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.SlaveMasterInfoRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.SlaveRelayLogInfoRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.SlaveWorkerInfoRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TablesPrivRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneLeapSecondRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneNameRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneTransitionRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.TimeZoneTransitionTypeRecord;
import com.example.demo.infrastructure.jooq.generated.mysql.tables.records.UserRecord;

import javax.annotation.processing.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>mysql</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TimeZoneRecord, UInteger> IDENTITY_TIME_ZONE = Identities0.IDENTITY_TIME_ZONE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = UniqueKeys0.KEY_COLUMNS_PRIV_PRIMARY;
    public static final UniqueKey<DbRecord> KEY_DB_PRIMARY = UniqueKeys0.KEY_DB_PRIMARY;
    public static final UniqueKey<EngineCostRecord> KEY_ENGINE_COST_PRIMARY = UniqueKeys0.KEY_ENGINE_COST_PRIMARY;
    public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = UniqueKeys0.KEY_EVENT_PRIMARY;
    public static final UniqueKey<FuncRecord> KEY_FUNC_PRIMARY = UniqueKeys0.KEY_FUNC_PRIMARY;
    public static final UniqueKey<GtidExecutedRecord> KEY_GTID_EXECUTED_PRIMARY = UniqueKeys0.KEY_GTID_EXECUTED_PRIMARY;
    public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = UniqueKeys0.KEY_HELP_CATEGORY_PRIMARY;
    public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = UniqueKeys0.KEY_HELP_CATEGORY_NAME;
    public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = UniqueKeys0.KEY_HELP_KEYWORD_PRIMARY;
    public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = UniqueKeys0.KEY_HELP_KEYWORD_NAME;
    public static final UniqueKey<HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = UniqueKeys0.KEY_HELP_RELATION_PRIMARY;
    public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = UniqueKeys0.KEY_HELP_TOPIC_PRIMARY;
    public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_NAME = UniqueKeys0.KEY_HELP_TOPIC_NAME;
    public static final UniqueKey<InnodbIndexStatsRecord> KEY_INNODB_INDEX_STATS_PRIMARY = UniqueKeys0.KEY_INNODB_INDEX_STATS_PRIMARY;
    public static final UniqueKey<InnodbTableStatsRecord> KEY_INNODB_TABLE_STATS_PRIMARY = UniqueKeys0.KEY_INNODB_TABLE_STATS_PRIMARY;
    public static final UniqueKey<NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = UniqueKeys0.KEY_NDB_BINLOG_INDEX_PRIMARY;
    public static final UniqueKey<PluginRecord> KEY_PLUGIN_PRIMARY = UniqueKeys0.KEY_PLUGIN_PRIMARY;
    public static final UniqueKey<ProcRecord> KEY_PROC_PRIMARY = UniqueKeys0.KEY_PROC_PRIMARY;
    public static final UniqueKey<ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = UniqueKeys0.KEY_PROCS_PRIV_PRIMARY;
    public static final UniqueKey<ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = UniqueKeys0.KEY_PROXIES_PRIV_PRIMARY;
    public static final UniqueKey<ServersRecord> KEY_SERVERS_PRIMARY = UniqueKeys0.KEY_SERVERS_PRIMARY;
    public static final UniqueKey<ServerCostRecord> KEY_SERVER_COST_PRIMARY = UniqueKeys0.KEY_SERVER_COST_PRIMARY;
    public static final UniqueKey<SlaveMasterInfoRecord> KEY_SLAVE_MASTER_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_MASTER_INFO_PRIMARY;
    public static final UniqueKey<SlaveRelayLogInfoRecord> KEY_SLAVE_RELAY_LOG_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_RELAY_LOG_INFO_PRIMARY;
    public static final UniqueKey<SlaveWorkerInfoRecord> KEY_SLAVE_WORKER_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_WORKER_INFO_PRIMARY;
    public static final UniqueKey<TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = UniqueKeys0.KEY_TABLES_PRIV_PRIMARY;
    public static final UniqueKey<TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_PRIMARY;
    public static final UniqueKey<TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY;
    public static final UniqueKey<TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_NAME_PRIMARY;
    public static final UniqueKey<TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_PRIMARY;
    public static final UniqueKey<TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TimeZoneRecord, UInteger> IDENTITY_TIME_ZONE = Internal.createIdentity(TIME_ZONE_TABLE.TIME_ZONE, TIME_ZONE_TABLE.TIME_ZONE.TIME_ZONE_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = Internal.createUniqueKey(COLUMNS_PRIV_TABLE.COLUMNS_PRIV, "KEY_columns_priv_PRIMARY", COLUMNS_PRIV_TABLE.COLUMNS_PRIV.HOST, COLUMNS_PRIV_TABLE.COLUMNS_PRIV.DB, COLUMNS_PRIV_TABLE.COLUMNS_PRIV.USER, COLUMNS_PRIV_TABLE.COLUMNS_PRIV.TABLE_NAME, COLUMNS_PRIV_TABLE.COLUMNS_PRIV.COLUMN_NAME);
        public static final UniqueKey<DbRecord> KEY_DB_PRIMARY = Internal.createUniqueKey(DB_TABLE.DB, "KEY_db_PRIMARY", DB_TABLE.DB.HOST, DB_TABLE.DB.DB_, DB_TABLE.DB.USER);
        public static final UniqueKey<EngineCostRecord> KEY_ENGINE_COST_PRIMARY = Internal.createUniqueKey(ENGINE_COST_TABLE.ENGINE_COST, "KEY_engine_cost_PRIMARY", ENGINE_COST_TABLE.ENGINE_COST.COST_NAME, ENGINE_COST_TABLE.ENGINE_COST.ENGINE_NAME, ENGINE_COST_TABLE.ENGINE_COST.DEVICE_TYPE);
        public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = Internal.createUniqueKey(EVENT_TABLE.EVENT, "KEY_event_PRIMARY", EVENT_TABLE.EVENT.DB, EVENT_TABLE.EVENT.NAME);
        public static final UniqueKey<FuncRecord> KEY_FUNC_PRIMARY = Internal.createUniqueKey(FUNC_TABLE.FUNC, "KEY_func_PRIMARY", FUNC_TABLE.FUNC.NAME);
        public static final UniqueKey<GtidExecutedRecord> KEY_GTID_EXECUTED_PRIMARY = Internal.createUniqueKey(GTID_EXECUTED_TABLE.GTID_EXECUTED, "KEY_gtid_executed_PRIMARY", GTID_EXECUTED_TABLE.GTID_EXECUTED.SOURCE_UUID, GTID_EXECUTED_TABLE.GTID_EXECUTED.INTERVAL_START);
        public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = Internal.createUniqueKey(HELP_CATEGORY_TABLE.HELP_CATEGORY, "KEY_help_category_PRIMARY", HELP_CATEGORY_TABLE.HELP_CATEGORY.HELP_CATEGORY_ID);
        public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = Internal.createUniqueKey(HELP_CATEGORY_TABLE.HELP_CATEGORY, "KEY_help_category_name", HELP_CATEGORY_TABLE.HELP_CATEGORY.NAME);
        public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = Internal.createUniqueKey(HELP_KEYWORD_TABLE.HELP_KEYWORD, "KEY_help_keyword_PRIMARY", HELP_KEYWORD_TABLE.HELP_KEYWORD.HELP_KEYWORD_ID);
        public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = Internal.createUniqueKey(HELP_KEYWORD_TABLE.HELP_KEYWORD, "KEY_help_keyword_name", HELP_KEYWORD_TABLE.HELP_KEYWORD.NAME);
        public static final UniqueKey<HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = Internal.createUniqueKey(HELP_RELATION_TABLE.HELP_RELATION, "KEY_help_relation_PRIMARY", HELP_RELATION_TABLE.HELP_RELATION.HELP_KEYWORD_ID, HELP_RELATION_TABLE.HELP_RELATION.HELP_TOPIC_ID);
        public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = Internal.createUniqueKey(HELP_TOPIC_TABLE.HELP_TOPIC, "KEY_help_topic_PRIMARY", HELP_TOPIC_TABLE.HELP_TOPIC.HELP_TOPIC_ID);
        public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_NAME = Internal.createUniqueKey(HELP_TOPIC_TABLE.HELP_TOPIC, "KEY_help_topic_name", HELP_TOPIC_TABLE.HELP_TOPIC.NAME);
        public static final UniqueKey<InnodbIndexStatsRecord> KEY_INNODB_INDEX_STATS_PRIMARY = Internal.createUniqueKey(INNODB_INDEX_STATS_TABLE.INNODB_INDEX_STATS, "KEY_innodb_index_stats_PRIMARY", INNODB_INDEX_STATS_TABLE.INNODB_INDEX_STATS.DATABASE_NAME, INNODB_INDEX_STATS_TABLE.INNODB_INDEX_STATS.TABLE_NAME, INNODB_INDEX_STATS_TABLE.INNODB_INDEX_STATS.INDEX_NAME, INNODB_INDEX_STATS_TABLE.INNODB_INDEX_STATS.STAT_NAME);
        public static final UniqueKey<InnodbTableStatsRecord> KEY_INNODB_TABLE_STATS_PRIMARY = Internal.createUniqueKey(INNODB_TABLE_STATS_TABLE.INNODB_TABLE_STATS, "KEY_innodb_table_stats_PRIMARY", INNODB_TABLE_STATS_TABLE.INNODB_TABLE_STATS.DATABASE_NAME, INNODB_TABLE_STATS_TABLE.INNODB_TABLE_STATS.TABLE_NAME);
        public static final UniqueKey<NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = Internal.createUniqueKey(NDB_BINLOG_INDEX_TABLE.NDB_BINLOG_INDEX, "KEY_ndb_binlog_index_PRIMARY", NDB_BINLOG_INDEX_TABLE.NDB_BINLOG_INDEX.EPOCH, NDB_BINLOG_INDEX_TABLE.NDB_BINLOG_INDEX.ORIG_SERVER_ID, NDB_BINLOG_INDEX_TABLE.NDB_BINLOG_INDEX.ORIG_EPOCH);
        public static final UniqueKey<PluginRecord> KEY_PLUGIN_PRIMARY = Internal.createUniqueKey(PLUGIN_TABLE.PLUGIN, "KEY_plugin_PRIMARY", PLUGIN_TABLE.PLUGIN.NAME);
        public static final UniqueKey<ProcRecord> KEY_PROC_PRIMARY = Internal.createUniqueKey(PROC_TABLE.PROC, "KEY_proc_PRIMARY", PROC_TABLE.PROC.DB, PROC_TABLE.PROC.NAME, PROC_TABLE.PROC.TYPE);
        public static final UniqueKey<ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = Internal.createUniqueKey(PROCS_PRIV_TABLE.PROCS_PRIV, "KEY_procs_priv_PRIMARY", PROCS_PRIV_TABLE.PROCS_PRIV.HOST, PROCS_PRIV_TABLE.PROCS_PRIV.DB, PROCS_PRIV_TABLE.PROCS_PRIV.USER, PROCS_PRIV_TABLE.PROCS_PRIV.ROUTINE_NAME, PROCS_PRIV_TABLE.PROCS_PRIV.ROUTINE_TYPE);
        public static final UniqueKey<ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = Internal.createUniqueKey(PROXIES_PRIV_TABLE.PROXIES_PRIV, "KEY_proxies_priv_PRIMARY", PROXIES_PRIV_TABLE.PROXIES_PRIV.HOST, PROXIES_PRIV_TABLE.PROXIES_PRIV.USER, PROXIES_PRIV_TABLE.PROXIES_PRIV.PROXIED_HOST, PROXIES_PRIV_TABLE.PROXIES_PRIV.PROXIED_USER);
        public static final UniqueKey<ServersRecord> KEY_SERVERS_PRIMARY = Internal.createUniqueKey(SERVERS_TABLE.SERVERS, "KEY_servers_PRIMARY", SERVERS_TABLE.SERVERS.SERVER_NAME);
        public static final UniqueKey<ServerCostRecord> KEY_SERVER_COST_PRIMARY = Internal.createUniqueKey(SERVER_COST_TABLE.SERVER_COST, "KEY_server_cost_PRIMARY", SERVER_COST_TABLE.SERVER_COST.COST_NAME);
        public static final UniqueKey<SlaveMasterInfoRecord> KEY_SLAVE_MASTER_INFO_PRIMARY = Internal.createUniqueKey(SLAVE_MASTER_INFO_TABLE.SLAVE_MASTER_INFO, "KEY_slave_master_info_PRIMARY", SLAVE_MASTER_INFO_TABLE.SLAVE_MASTER_INFO.CHANNEL_NAME);
        public static final UniqueKey<SlaveRelayLogInfoRecord> KEY_SLAVE_RELAY_LOG_INFO_PRIMARY = Internal.createUniqueKey(SLAVE_RELAY_LOG_INFO_TABLE.SLAVE_RELAY_LOG_INFO, "KEY_slave_relay_log_info_PRIMARY", SLAVE_RELAY_LOG_INFO_TABLE.SLAVE_RELAY_LOG_INFO.CHANNEL_NAME);
        public static final UniqueKey<SlaveWorkerInfoRecord> KEY_SLAVE_WORKER_INFO_PRIMARY = Internal.createUniqueKey(SLAVE_WORKER_INFO_TABLE.SLAVE_WORKER_INFO, "KEY_slave_worker_info_PRIMARY", SLAVE_WORKER_INFO_TABLE.SLAVE_WORKER_INFO.CHANNEL_NAME, SLAVE_WORKER_INFO_TABLE.SLAVE_WORKER_INFO.ID);
        public static final UniqueKey<TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = Internal.createUniqueKey(TABLES_PRIV_TABLE.TABLES_PRIV, "KEY_tables_priv_PRIMARY", TABLES_PRIV_TABLE.TABLES_PRIV.HOST, TABLES_PRIV_TABLE.TABLES_PRIV.DB, TABLES_PRIV_TABLE.TABLES_PRIV.USER, TABLES_PRIV_TABLE.TABLES_PRIV.TABLE_NAME);
        public static final UniqueKey<TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = Internal.createUniqueKey(TIME_ZONE_TABLE.TIME_ZONE, "KEY_time_zone_PRIMARY", TIME_ZONE_TABLE.TIME_ZONE.TIME_ZONE_ID);
        public static final UniqueKey<TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = Internal.createUniqueKey(TIME_ZONE_LEAP_SECOND_TABLE.TIME_ZONE_LEAP_SECOND, "KEY_time_zone_leap_second_PRIMARY", TIME_ZONE_LEAP_SECOND_TABLE.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME);
        public static final UniqueKey<TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = Internal.createUniqueKey(TIME_ZONE_NAME_TABLE.TIME_ZONE_NAME, "KEY_time_zone_name_PRIMARY", TIME_ZONE_NAME_TABLE.TIME_ZONE_NAME.NAME);
        public static final UniqueKey<TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = Internal.createUniqueKey(TIME_ZONE_TRANSITION_TABLE.TIME_ZONE_TRANSITION, "KEY_time_zone_transition_PRIMARY", TIME_ZONE_TRANSITION_TABLE.TIME_ZONE_TRANSITION.TIME_ZONE_ID, TIME_ZONE_TRANSITION_TABLE.TIME_ZONE_TRANSITION.TRANSITION_TIME);
        public static final UniqueKey<TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = Internal.createUniqueKey(TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE, "KEY_time_zone_transition_type_PRIMARY", TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID, TIME_ZONE_TRANSITION_TYPE_TABLE.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(USER_TABLE.USER, "KEY_user_PRIMARY", USER_TABLE.USER.HOST, USER_TABLE.USER.USER_);
    }
}