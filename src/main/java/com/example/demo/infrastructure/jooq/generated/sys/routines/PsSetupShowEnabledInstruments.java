/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.routines;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;

import javax.annotation.processing.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Shows all currently enabled instruments.
 *  
 *  Parameters
 *  
 *  None
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_show_enabled_instruments();
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowEnabledInstruments extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1874307059;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowEnabledInstruments() {
        super("ps_setup_show_enabled_instruments", Sys.SYS);
    }
}
