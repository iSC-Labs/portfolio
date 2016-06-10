/**
 * $$Id$$
 *
 * @author mribeiro
 * @date 08/06/16 10:30
 * <p/>
 * Copyright (C) 2016 MRibeiro
 * marco.lob@gmail.com
 * <p/>
 * All rights reserved.
 */
package ol;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class Executor {

    private final GenericFunction function;

    public Executor(GenericFunction function) {
        this.function = function;
    }

    public void action(JavaScriptObject object){
        function.call(object);
    }
}