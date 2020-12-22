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
 *  Disables instruments within Performance Schema 
 *  matching the input pattern.
 *  
 *  Parameters
 *  
 *  in_pattern (VARCHAR(128)):
 *  A LIKE pattern match (using "%in_pattern%") of events to disable
 *  
 *  Example
 *  
 *  To disable all mutex instruments:
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_instrument('wait/synch/mutex');
 *  +--------------------------+
 *  | summary                  |
 *  +--------------------------+
 *  | Disabled 155 instruments |
 *  +--------------------------+
 *  1 row in set (0.02 sec)
 *  
 *  To disable just a specific TCP/IP based network IO instrument:
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_instrument('wait/io/socket/sql/server_tcpip_socket');
 *  +------------------------+
 *  | summary                |
 *  +------------------------+
 *  | Disabled 1 instruments |
 *  +------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  To disable all instruments:
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_instrument('');
 *  +--------------------------+
 *  | summary                  |
 *  +--------------------------+
 *  | Disabled 547 instruments |
 *  +--------------------------+
 *  1 row in set (0.01 sec)
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
public class PsSetupDisableInstrument extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1150389232;

    /**
     * The parameter <code>sys.ps_setup_disable_instrument.in_pattern</code>.
     */
    public static final Parameter<String> IN_PATTERN = Internal.createParameter("in_pattern", org.jooq.impl.SQLDataType.VARCHAR(128), false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupDisableInstrument() {
        super("ps_setup_disable_instrument", Sys.SYS);

        addInParameter(IN_PATTERN);
    }

    /**
     * Set the <code>in_pattern</code> parameter IN value to the routine
     */
    public void setInPattern(String value) {
        setValue(IN_PATTERN, value);
    }
}
