/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.performance_schema.tables.records;


import com.example.demo.infrastructure.jooq.generated.performance_schema.tables.REPLICATION_GROUP_MEMBERS_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class ReplicationGroupMembersRecord extends TableRecordImpl<ReplicationGroupMembersRecord> implements Record5<String, String, String, Integer, String> {

    private static final long serialVersionUID = 120402730;

    /**
     * Setter for <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_group_members.MEMBER_ID</code>.
     */
    public void setMemberId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_members.MEMBER_ID</code>.
     */
    public String getMemberId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
     */
    public void setMemberHost(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
     */
    public String getMemberHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
     */
    public void setMemberPort(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
     */
    public Integer getMemberPort() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
     */
    public void setMemberState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
     */
    public String getMemberState() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS.CHANNEL_NAME;
    }

    @Override
    public Field<String> field2() {
        return REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS.MEMBER_ID;
    }

    @Override
    public Field<String> field3() {
        return REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS.MEMBER_HOST;
    }

    @Override
    public Field<Integer> field4() {
        return REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS.MEMBER_PORT;
    }

    @Override
    public Field<String> field5() {
        return REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS.MEMBER_STATE;
    }

    @Override
    public String component1() {
        return getChannelName();
    }

    @Override
    public String component2() {
        return getMemberId();
    }

    @Override
    public String component3() {
        return getMemberHost();
    }

    @Override
    public Integer component4() {
        return getMemberPort();
    }

    @Override
    public String component5() {
        return getMemberState();
    }

    @Override
    public String value1() {
        return getChannelName();
    }

    @Override
    public String value2() {
        return getMemberId();
    }

    @Override
    public String value3() {
        return getMemberHost();
    }

    @Override
    public Integer value4() {
        return getMemberPort();
    }

    @Override
    public String value5() {
        return getMemberState();
    }

    @Override
    public ReplicationGroupMembersRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    @Override
    public ReplicationGroupMembersRecord value2(String value) {
        setMemberId(value);
        return this;
    }

    @Override
    public ReplicationGroupMembersRecord value3(String value) {
        setMemberHost(value);
        return this;
    }

    @Override
    public ReplicationGroupMembersRecord value4(Integer value) {
        setMemberPort(value);
        return this;
    }

    @Override
    public ReplicationGroupMembersRecord value5(String value) {
        setMemberState(value);
        return this;
    }

    @Override
    public ReplicationGroupMembersRecord values(String value1, String value2, String value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationGroupMembersRecord
     */
    public ReplicationGroupMembersRecord() {
        super(REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS);
    }

    /**
     * Create a detached, initialised ReplicationGroupMembersRecord
     */
    public ReplicationGroupMembersRecord(String channelName, String memberId, String memberHost, Integer memberPort, String memberState) {
        super(REPLICATION_GROUP_MEMBERS_TABLE.REPLICATION_GROUP_MEMBERS);

        set(0, channelName);
        set(1, memberId);
        set(2, memberHost);
        set(3, memberPort);
        set(4, memberState);
    }
}
