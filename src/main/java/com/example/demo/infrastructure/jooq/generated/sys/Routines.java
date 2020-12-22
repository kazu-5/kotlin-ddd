/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys;


import com.example.demo.infrastructure.jooq.generated.sys.routines.CreateSynonymDb;
import com.example.demo.infrastructure.jooq.generated.sys.routines.Diagnostics;
import com.example.demo.infrastructure.jooq.generated.sys.routines.ExecutePreparedStmt;
import com.example.demo.infrastructure.jooq.generated.sys.routines.ExtractSchemaFromFileName;
import com.example.demo.infrastructure.jooq.generated.sys.routines.ExtractTableFromFileName;
import com.example.demo.infrastructure.jooq.generated.sys.routines.FormatBytes;
import com.example.demo.infrastructure.jooq.generated.sys.routines.FormatPath;
import com.example.demo.infrastructure.jooq.generated.sys.routines.FormatStatement;
import com.example.demo.infrastructure.jooq.generated.sys.routines.FormatTime;
import com.example.demo.infrastructure.jooq.generated.sys.routines.ListAdd;
import com.example.demo.infrastructure.jooq.generated.sys.routines.ListDrop;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsIsAccountEnabled;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsIsConsumerEnabled;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsIsInstrumentDefaultEnabled;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsIsInstrumentDefaultTimed;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsIsThreadInstrumented;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupDisableBackgroundThreads;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupDisableConsumer;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupDisableInstrument;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupDisableThread;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupEnableBackgroundThreads;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupEnableConsumer;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupEnableInstrument;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupEnableThread;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupReloadSaved;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupResetToDefault;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupSave;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowDisabled;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowDisabledConsumers;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowDisabledInstruments;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowEnabled;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowEnabledConsumers;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsSetupShowEnabledInstruments;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsStatementAvgLatencyHistogram;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsThreadAccount;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsThreadId;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsThreadStack;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsThreadTrxInfo;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsTraceStatementDigest;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsTraceThread;
import com.example.demo.infrastructure.jooq.generated.sys.routines.PsTruncateAllTables;
import com.example.demo.infrastructure.jooq.generated.sys.routines.QuoteIdentifier;
import com.example.demo.infrastructure.jooq.generated.sys.routines.StatementPerformanceAnalyzer;
import com.example.demo.infrastructure.jooq.generated.sys.routines.SysGetConfig;
import com.example.demo.infrastructure.jooq.generated.sys.routines.TableExists;
import com.example.demo.infrastructure.jooq.generated.sys.routines.VersionMajor;
import com.example.demo.infrastructure.jooq.generated.sys.routines.VersionMinor;
import com.example.demo.infrastructure.jooq.generated.sys.routines.VersionPatch;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Convenience access to all stored procedures and functions in sys
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>sys.create_synonym_db</code>
     */
    public static void createSynonymDb(Configuration configuration, String inDbName, String inSynonym) {
        CreateSynonymDb p = new CreateSynonymDb();
        p.setInDbName(inDbName);
        p.setInSynonym(inSynonym);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.diagnostics</code>
     */
    public static void diagnostics(Configuration configuration, UInteger inMaxRuntime, UInteger inInterval, String inAutoConfig) {
        Diagnostics p = new Diagnostics();
        p.setInMaxRuntime(inMaxRuntime);
        p.setInInterval(inInterval);
        p.setInAutoConfig(inAutoConfig);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.execute_prepared_stmt</code>
     */
    public static void executePreparedStmt(Configuration configuration, String inQuery) {
        ExecutePreparedStmt p = new ExecutePreparedStmt();
        p.setInQuery(inQuery);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.extract_schema_from_file_name</code>
     */
    public static String extractSchemaFromFileName(Configuration configuration, String path) {
        ExtractSchemaFromFileName f = new ExtractSchemaFromFileName();
        f.setPath(path);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.extract_schema_from_file_name</code> as a field.
     */
    public static Field<String> extractSchemaFromFileName(String path) {
        ExtractSchemaFromFileName f = new ExtractSchemaFromFileName();
        f.setPath(path);

        return f.asField();
    }

    /**
     * Get <code>sys.extract_schema_from_file_name</code> as a field.
     */
    public static Field<String> extractSchemaFromFileName(Field<String> path) {
        ExtractSchemaFromFileName f = new ExtractSchemaFromFileName();
        f.setPath(path);

        return f.asField();
    }

    /**
     * Call <code>sys.extract_table_from_file_name</code>
     */
    public static String extractTableFromFileName(Configuration configuration, String path) {
        ExtractTableFromFileName f = new ExtractTableFromFileName();
        f.setPath(path);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.extract_table_from_file_name</code> as a field.
     */
    public static Field<String> extractTableFromFileName(String path) {
        ExtractTableFromFileName f = new ExtractTableFromFileName();
        f.setPath(path);

        return f.asField();
    }

    /**
     * Get <code>sys.extract_table_from_file_name</code> as a field.
     */
    public static Field<String> extractTableFromFileName(Field<String> path) {
        ExtractTableFromFileName f = new ExtractTableFromFileName();
        f.setPath(path);

        return f.asField();
    }

    /**
     * Call <code>sys.format_bytes</code>
     */
    public static String formatBytes(Configuration configuration, String bytes) {
        FormatBytes f = new FormatBytes();
        f.setBytes(bytes);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.format_bytes</code> as a field.
     */
    public static Field<String> formatBytes(String bytes) {
        FormatBytes f = new FormatBytes();
        f.setBytes(bytes);

        return f.asField();
    }

    /**
     * Get <code>sys.format_bytes</code> as a field.
     */
    public static Field<String> formatBytes(Field<String> bytes) {
        FormatBytes f = new FormatBytes();
        f.setBytes(bytes);

        return f.asField();
    }

    /**
     * Call <code>sys.format_path</code>
     */
    public static String formatPath(Configuration configuration, String inPath) {
        FormatPath f = new FormatPath();
        f.setInPath(inPath);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.format_path</code> as a field.
     */
    public static Field<String> formatPath(String inPath) {
        FormatPath f = new FormatPath();
        f.setInPath(inPath);

        return f.asField();
    }

    /**
     * Get <code>sys.format_path</code> as a field.
     */
    public static Field<String> formatPath(Field<String> inPath) {
        FormatPath f = new FormatPath();
        f.setInPath(inPath);

        return f.asField();
    }

    /**
     * Call <code>sys.format_statement</code>
     */
    public static String formatStatement(Configuration configuration, String statement) {
        FormatStatement f = new FormatStatement();
        f.setStatement(statement);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.format_statement</code> as a field.
     */
    public static Field<String> formatStatement(String statement) {
        FormatStatement f = new FormatStatement();
        f.setStatement(statement);

        return f.asField();
    }

    /**
     * Get <code>sys.format_statement</code> as a field.
     */
    public static Field<String> formatStatement(Field<String> statement) {
        FormatStatement f = new FormatStatement();
        f.setStatement(statement);

        return f.asField();
    }

    /**
     * Call <code>sys.format_time</code>
     */
    public static String formatTime(Configuration configuration, String picoseconds) {
        FormatTime f = new FormatTime();
        f.setPicoseconds(picoseconds);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.format_time</code> as a field.
     */
    public static Field<String> formatTime(String picoseconds) {
        FormatTime f = new FormatTime();
        f.setPicoseconds(picoseconds);

        return f.asField();
    }

    /**
     * Get <code>sys.format_time</code> as a field.
     */
    public static Field<String> formatTime(Field<String> picoseconds) {
        FormatTime f = new FormatTime();
        f.setPicoseconds(picoseconds);

        return f.asField();
    }

    /**
     * Call <code>sys.list_add</code>
     */
    public static String listAdd(Configuration configuration, String inList, String inAddValue) {
        ListAdd f = new ListAdd();
        f.setInList(inList);
        f.setInAddValue(inAddValue);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.list_add</code> as a field.
     */
    public static Field<String> listAdd(String inList, String inAddValue) {
        ListAdd f = new ListAdd();
        f.setInList(inList);
        f.setInAddValue(inAddValue);

        return f.asField();
    }

    /**
     * Get <code>sys.list_add</code> as a field.
     */
    public static Field<String> listAdd(Field<String> inList, Field<String> inAddValue) {
        ListAdd f = new ListAdd();
        f.setInList(inList);
        f.setInAddValue(inAddValue);

        return f.asField();
    }

    /**
     * Call <code>sys.list_drop</code>
     */
    public static String listDrop(Configuration configuration, String inList, String inDropValue) {
        ListDrop f = new ListDrop();
        f.setInList(inList);
        f.setInDropValue(inDropValue);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.list_drop</code> as a field.
     */
    public static Field<String> listDrop(String inList, String inDropValue) {
        ListDrop f = new ListDrop();
        f.setInList(inList);
        f.setInDropValue(inDropValue);

        return f.asField();
    }

    /**
     * Get <code>sys.list_drop</code> as a field.
     */
    public static Field<String> listDrop(Field<String> inList, Field<String> inDropValue) {
        ListDrop f = new ListDrop();
        f.setInList(inList);
        f.setInDropValue(inDropValue);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_is_account_enabled</code>
     */
    public static String psIsAccountEnabled(Configuration configuration, String inHost, String inUser) {
        PsIsAccountEnabled f = new PsIsAccountEnabled();
        f.setInHost(inHost);
        f.setInUser(inUser);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_is_account_enabled</code> as a field.
     */
    public static Field<String> psIsAccountEnabled(String inHost, String inUser) {
        PsIsAccountEnabled f = new PsIsAccountEnabled();
        f.setInHost(inHost);
        f.setInUser(inUser);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_is_account_enabled</code> as a field.
     */
    public static Field<String> psIsAccountEnabled(Field<String> inHost, Field<String> inUser) {
        PsIsAccountEnabled f = new PsIsAccountEnabled();
        f.setInHost(inHost);
        f.setInUser(inUser);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_is_consumer_enabled</code>
     */
    public static String psIsConsumerEnabled(Configuration configuration, String inConsumer) {
        PsIsConsumerEnabled f = new PsIsConsumerEnabled();
        f.setInConsumer(inConsumer);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_is_consumer_enabled</code> as a field.
     */
    public static Field<String> psIsConsumerEnabled(String inConsumer) {
        PsIsConsumerEnabled f = new PsIsConsumerEnabled();
        f.setInConsumer(inConsumer);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_is_consumer_enabled</code> as a field.
     */
    public static Field<String> psIsConsumerEnabled(Field<String> inConsumer) {
        PsIsConsumerEnabled f = new PsIsConsumerEnabled();
        f.setInConsumer(inConsumer);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_is_instrument_default_enabled</code>
     */
    public static String psIsInstrumentDefaultEnabled(Configuration configuration, String inInstrument) {
        PsIsInstrumentDefaultEnabled f = new PsIsInstrumentDefaultEnabled();
        f.setInInstrument(inInstrument);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_is_instrument_default_enabled</code> as a field.
     */
    public static Field<String> psIsInstrumentDefaultEnabled(String inInstrument) {
        PsIsInstrumentDefaultEnabled f = new PsIsInstrumentDefaultEnabled();
        f.setInInstrument(inInstrument);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_is_instrument_default_enabled</code> as a field.
     */
    public static Field<String> psIsInstrumentDefaultEnabled(Field<String> inInstrument) {
        PsIsInstrumentDefaultEnabled f = new PsIsInstrumentDefaultEnabled();
        f.setInInstrument(inInstrument);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_is_instrument_default_timed</code>
     */
    public static String psIsInstrumentDefaultTimed(Configuration configuration, String inInstrument) {
        PsIsInstrumentDefaultTimed f = new PsIsInstrumentDefaultTimed();
        f.setInInstrument(inInstrument);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_is_instrument_default_timed</code> as a field.
     */
    public static Field<String> psIsInstrumentDefaultTimed(String inInstrument) {
        PsIsInstrumentDefaultTimed f = new PsIsInstrumentDefaultTimed();
        f.setInInstrument(inInstrument);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_is_instrument_default_timed</code> as a field.
     */
    public static Field<String> psIsInstrumentDefaultTimed(Field<String> inInstrument) {
        PsIsInstrumentDefaultTimed f = new PsIsInstrumentDefaultTimed();
        f.setInInstrument(inInstrument);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_is_thread_instrumented</code>
     */
    public static String psIsThreadInstrumented(Configuration configuration, ULong inConnectionId) {
        PsIsThreadInstrumented f = new PsIsThreadInstrumented();
        f.setInConnectionId(inConnectionId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_is_thread_instrumented</code> as a field.
     */
    public static Field<String> psIsThreadInstrumented(ULong inConnectionId) {
        PsIsThreadInstrumented f = new PsIsThreadInstrumented();
        f.setInConnectionId(inConnectionId);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_is_thread_instrumented</code> as a field.
     */
    public static Field<String> psIsThreadInstrumented(Field<ULong> inConnectionId) {
        PsIsThreadInstrumented f = new PsIsThreadInstrumented();
        f.setInConnectionId(inConnectionId);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_setup_disable_background_threads</code>
     */
    public static void psSetupDisableBackgroundThreads(Configuration configuration) {
        PsSetupDisableBackgroundThreads p = new PsSetupDisableBackgroundThreads();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_disable_consumer</code>
     */
    public static void psSetupDisableConsumer(Configuration configuration, String consumer) {
        PsSetupDisableConsumer p = new PsSetupDisableConsumer();
        p.setConsumer(consumer);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_disable_instrument</code>
     */
    public static void psSetupDisableInstrument(Configuration configuration, String inPattern) {
        PsSetupDisableInstrument p = new PsSetupDisableInstrument();
        p.setInPattern(inPattern);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_disable_thread</code>
     */
    public static void psSetupDisableThread(Configuration configuration, Long inConnectionId) {
        PsSetupDisableThread p = new PsSetupDisableThread();
        p.setInConnectionId(inConnectionId);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_enable_background_threads</code>
     */
    public static void psSetupEnableBackgroundThreads(Configuration configuration) {
        PsSetupEnableBackgroundThreads p = new PsSetupEnableBackgroundThreads();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_enable_consumer</code>
     */
    public static void psSetupEnableConsumer(Configuration configuration, String consumer) {
        PsSetupEnableConsumer p = new PsSetupEnableConsumer();
        p.setConsumer(consumer);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_enable_instrument</code>
     */
    public static void psSetupEnableInstrument(Configuration configuration, String inPattern) {
        PsSetupEnableInstrument p = new PsSetupEnableInstrument();
        p.setInPattern(inPattern);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_enable_thread</code>
     */
    public static void psSetupEnableThread(Configuration configuration, Long inConnectionId) {
        PsSetupEnableThread p = new PsSetupEnableThread();
        p.setInConnectionId(inConnectionId);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_reload_saved</code>
     */
    public static void psSetupReloadSaved(Configuration configuration) {
        PsSetupReloadSaved p = new PsSetupReloadSaved();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_reset_to_default</code>
     */
    public static void psSetupResetToDefault(Configuration configuration, Byte inVerbose) {
        PsSetupResetToDefault p = new PsSetupResetToDefault();
        p.setInVerbose(inVerbose);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_save</code>
     */
    public static void psSetupSave(Configuration configuration, Integer inTimeout) {
        PsSetupSave p = new PsSetupSave();
        p.setInTimeout(inTimeout);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_disabled</code>
     */
    public static void psSetupShowDisabled(Configuration configuration, Byte inShowInstruments, Byte inShowThreads) {
        PsSetupShowDisabled p = new PsSetupShowDisabled();
        p.setInShowInstruments(inShowInstruments);
        p.setInShowThreads(inShowThreads);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_disabled_consumers</code>
     */
    public static void psSetupShowDisabledConsumers(Configuration configuration) {
        PsSetupShowDisabledConsumers p = new PsSetupShowDisabledConsumers();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_disabled_instruments</code>
     */
    public static void psSetupShowDisabledInstruments(Configuration configuration) {
        PsSetupShowDisabledInstruments p = new PsSetupShowDisabledInstruments();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_enabled</code>
     */
    public static void psSetupShowEnabled(Configuration configuration, Byte inShowInstruments, Byte inShowThreads) {
        PsSetupShowEnabled p = new PsSetupShowEnabled();
        p.setInShowInstruments(inShowInstruments);
        p.setInShowThreads(inShowThreads);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_enabled_consumers</code>
     */
    public static void psSetupShowEnabledConsumers(Configuration configuration) {
        PsSetupShowEnabledConsumers p = new PsSetupShowEnabledConsumers();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_setup_show_enabled_instruments</code>
     */
    public static void psSetupShowEnabledInstruments(Configuration configuration) {
        PsSetupShowEnabledInstruments p = new PsSetupShowEnabledInstruments();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_statement_avg_latency_histogram</code>
     */
    public static void psStatementAvgLatencyHistogram(Configuration configuration) {
        PsStatementAvgLatencyHistogram p = new PsStatementAvgLatencyHistogram();

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_thread_account</code>
     */
    public static String psThreadAccount(Configuration configuration, ULong inThreadId) {
        PsThreadAccount f = new PsThreadAccount();
        f.setInThreadId(inThreadId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_thread_account</code> as a field.
     */
    public static Field<String> psThreadAccount(ULong inThreadId) {
        PsThreadAccount f = new PsThreadAccount();
        f.setInThreadId(inThreadId);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_thread_account</code> as a field.
     */
    public static Field<String> psThreadAccount(Field<ULong> inThreadId) {
        PsThreadAccount f = new PsThreadAccount();
        f.setInThreadId(inThreadId);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_thread_id</code>
     */
    public static ULong psThreadId(Configuration configuration, ULong inConnectionId) {
        PsThreadId f = new PsThreadId();
        f.setInConnectionId(inConnectionId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_thread_id</code> as a field.
     */
    public static Field<ULong> psThreadId(ULong inConnectionId) {
        PsThreadId f = new PsThreadId();
        f.setInConnectionId(inConnectionId);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_thread_id</code> as a field.
     */
    public static Field<ULong> psThreadId(Field<ULong> inConnectionId) {
        PsThreadId f = new PsThreadId();
        f.setInConnectionId(inConnectionId);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_thread_stack</code>
     */
    public static String psThreadStack(Configuration configuration, ULong thdId, Byte debug) {
        PsThreadStack f = new PsThreadStack();
        f.setThdId(thdId);
        f.setDebug(debug);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_thread_stack</code> as a field.
     */
    public static Field<String> psThreadStack(ULong thdId, Byte debug) {
        PsThreadStack f = new PsThreadStack();
        f.setThdId(thdId);
        f.setDebug(debug);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_thread_stack</code> as a field.
     */
    public static Field<String> psThreadStack(Field<ULong> thdId, Field<Byte> debug) {
        PsThreadStack f = new PsThreadStack();
        f.setThdId(thdId);
        f.setDebug(debug);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_thread_trx_info</code>
     */
    public static String psThreadTrxInfo(Configuration configuration, ULong inThreadId) {
        PsThreadTrxInfo f = new PsThreadTrxInfo();
        f.setInThreadId(inThreadId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.ps_thread_trx_info</code> as a field.
     */
    public static Field<String> psThreadTrxInfo(ULong inThreadId) {
        PsThreadTrxInfo f = new PsThreadTrxInfo();
        f.setInThreadId(inThreadId);

        return f.asField();
    }

    /**
     * Get <code>sys.ps_thread_trx_info</code> as a field.
     */
    public static Field<String> psThreadTrxInfo(Field<ULong> inThreadId) {
        PsThreadTrxInfo f = new PsThreadTrxInfo();
        f.setInThreadId(inThreadId);

        return f.asField();
    }

    /**
     * Call <code>sys.ps_trace_statement_digest</code>
     */
    public static void psTraceStatementDigest(Configuration configuration, String inDigest, Integer inRuntime, BigDecimal inInterval, Byte inStartFresh, Byte inAutoEnable) {
        PsTraceStatementDigest p = new PsTraceStatementDigest();
        p.setInDigest(inDigest);
        p.setInRuntime(inRuntime);
        p.setInInterval(inInterval);
        p.setInStartFresh(inStartFresh);
        p.setInAutoEnable(inAutoEnable);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_trace_thread</code>
     */
    public static void psTraceThread(Configuration configuration, ULong inThreadId, String inOutfile, BigDecimal inMaxRuntime, BigDecimal inInterval, Byte inStartFresh, Byte inAutoSetup, Byte inDebug) {
        PsTraceThread p = new PsTraceThread();
        p.setInThreadId(inThreadId);
        p.setInOutfile(inOutfile);
        p.setInMaxRuntime(inMaxRuntime);
        p.setInInterval(inInterval);
        p.setInStartFresh(inStartFresh);
        p.setInAutoSetup(inAutoSetup);
        p.setInDebug(inDebug);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.ps_truncate_all_tables</code>
     */
    public static void psTruncateAllTables(Configuration configuration, Byte inVerbose) {
        PsTruncateAllTables p = new PsTruncateAllTables();
        p.setInVerbose(inVerbose);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.quote_identifier</code>
     */
    public static String quoteIdentifier(Configuration configuration, String inIdentifier) {
        QuoteIdentifier f = new QuoteIdentifier();
        f.setInIdentifier(inIdentifier);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.quote_identifier</code> as a field.
     */
    public static Field<String> quoteIdentifier(String inIdentifier) {
        QuoteIdentifier f = new QuoteIdentifier();
        f.setInIdentifier(inIdentifier);

        return f.asField();
    }

    /**
     * Get <code>sys.quote_identifier</code> as a field.
     */
    public static Field<String> quoteIdentifier(Field<String> inIdentifier) {
        QuoteIdentifier f = new QuoteIdentifier();
        f.setInIdentifier(inIdentifier);

        return f.asField();
    }

    /**
     * Call <code>sys.statement_performance_analyzer</code>
     */
    public static void statementPerformanceAnalyzer(Configuration configuration, String inAction, String inTable, String inViews) {
        StatementPerformanceAnalyzer p = new StatementPerformanceAnalyzer();
        p.setInAction(inAction);
        p.setInTable(inTable);
        p.setInViews(inViews);

        p.execute(configuration);
    }

    /**
     * Call <code>sys.sys_get_config</code>
     */
    public static String sysGetConfig(Configuration configuration, String inVariableName, String inDefaultValue) {
        SysGetConfig f = new SysGetConfig();
        f.setInVariableName(inVariableName);
        f.setInDefaultValue(inDefaultValue);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.sys_get_config</code> as a field.
     */
    public static Field<String> sysGetConfig(String inVariableName, String inDefaultValue) {
        SysGetConfig f = new SysGetConfig();
        f.setInVariableName(inVariableName);
        f.setInDefaultValue(inDefaultValue);

        return f.asField();
    }

    /**
     * Get <code>sys.sys_get_config</code> as a field.
     */
    public static Field<String> sysGetConfig(Field<String> inVariableName, Field<String> inDefaultValue) {
        SysGetConfig f = new SysGetConfig();
        f.setInVariableName(inVariableName);
        f.setInDefaultValue(inDefaultValue);

        return f.asField();
    }

    /**
     * Call <code>sys.table_exists</code>
     */
    public static String tableExists(Configuration configuration, String inDb, String inTable) {
        TableExists p = new TableExists();
        p.setInDb(inDb);
        p.setInTable(inTable);

        p.execute(configuration);
        return p.getOutExists();
    }

    /**
     * Call <code>sys.version_major</code>
     */
    public static UByte versionMajor(Configuration configuration) {
        VersionMajor f = new VersionMajor();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.version_major</code> as a field.
     */
    public static Field<UByte> versionMajor() {
        VersionMajor f = new VersionMajor();

        return f.asField();
    }

    /**
     * Call <code>sys.version_minor</code>
     */
    public static UByte versionMinor(Configuration configuration) {
        VersionMinor f = new VersionMinor();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.version_minor</code> as a field.
     */
    public static Field<UByte> versionMinor() {
        VersionMinor f = new VersionMinor();

        return f.asField();
    }

    /**
     * Call <code>sys.version_patch</code>
     */
    public static UByte versionPatch(Configuration configuration) {
        VersionPatch f = new VersionPatch();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>sys.version_patch</code> as a field.
     */
    public static Field<UByte> versionPatch() {
        VersionPatch f = new VersionPatch();

        return f.asField();
    }
}
