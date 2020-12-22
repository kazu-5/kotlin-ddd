/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.information_schema.tables.records;


import com.example.demo.infrastructure.jooq.generated.information_schema.tables.INNODB_SYS_DATAFILES_TABLE;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class InnodbSysDatafilesRecord extends TableRecordImpl<InnodbSysDatafilesRecord> implements Record2<UInteger, String> {

    private static final long serialVersionUID = -1740316300;

    /**
     * Setter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
     */
    public void setSpace(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
     */
    public void setPath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
     */
    public String getPath() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UInteger, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UInteger, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return INNODB_SYS_DATAFILES_TABLE.INNODB_SYS_DATAFILES.SPACE;
    }

    @Override
    public Field<String> field2() {
        return INNODB_SYS_DATAFILES_TABLE.INNODB_SYS_DATAFILES.PATH;
    }

    @Override
    public UInteger component1() {
        return getSpace();
    }

    @Override
    public String component2() {
        return getPath();
    }

    @Override
    public UInteger value1() {
        return getSpace();
    }

    @Override
    public String value2() {
        return getPath();
    }

    @Override
    public InnodbSysDatafilesRecord value1(UInteger value) {
        setSpace(value);
        return this;
    }

    @Override
    public InnodbSysDatafilesRecord value2(String value) {
        setPath(value);
        return this;
    }

    @Override
    public InnodbSysDatafilesRecord values(UInteger value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysDatafilesRecord
     */
    public InnodbSysDatafilesRecord() {
        super(INNODB_SYS_DATAFILES_TABLE.INNODB_SYS_DATAFILES);
    }

    /**
     * Create a detached, initialised InnodbSysDatafilesRecord
     */
    public InnodbSysDatafilesRecord(UInteger space, String path) {
        super(INNODB_SYS_DATAFILES_TABLE.INNODB_SYS_DATAFILES);

        set(0, space);
        set(1, path);
    }
}
