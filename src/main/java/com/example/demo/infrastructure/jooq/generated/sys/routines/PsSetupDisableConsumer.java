/*
 * This file is generated by jOOQ.
 */
package com.example.demo.infrastructure.jooq.generated.sys.routines;


import com.example.demo.infrastructure.jooq.generated.sys.Sys;

import javax.annotation.processing.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * 
 *  Description
 *  
 *  Disables consumers within Performance Schema 
 *  matching the input pattern.
 *  
 *  Parameters
 *  
 *  consumer (VARCHAR(128)):
 *  A LIKE pattern match (using "%consumer%") of consumers to disable
 *  
 *  Example
 *  
 *  To disable all consumers:
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_consumer('');
 *  +--------------------------+
 *  | summary                  |
 *  +--------------------------+
 *  | Disabled 15 consumers    |
 *  +--------------------------+
 *  1 row in set (0.02 sec)
 *  
 *  To disable just the event_stage consumers:
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_comsumers('stage');
 *  +------------------------+
 *  | summary                |
 *  +------------------------+
 *  | Disabled 3 consumers   |
 *  +------------------------+
 *  1 row in set (0.00 sec)
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
public class PsSetupDisableConsumer extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1804279933;

    /**
     * The parameter <code>sys.ps_setup_disable_consumer.consumer</code>.
     */
    public static final Parameter<String> CONSUMER = Internal.createParameter("consumer", org.jooq.impl.SQLDataType.VARCHAR(128), false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupDisableConsumer() {
        super("ps_setup_disable_consumer", Sys.SYS);

        addInParameter(CONSUMER);
    }

    /**
     * Set the <code>consumer</code> parameter IN value to the routine
     */
    public void setConsumer(String value) {
        setValue(CONSUMER, value);
    }
}