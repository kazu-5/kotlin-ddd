/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.mysql.enums;


import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum UserCreateRoutinePriv implements EnumType {

    N("N"),

    Y("Y");

    private final String literal;

    private UserCreateRoutinePriv(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "user_Create_routine_priv";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
