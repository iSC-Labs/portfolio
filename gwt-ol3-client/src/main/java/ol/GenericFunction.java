/**
 * $$Id$$
 *
 * @author mribeiro
 * @date 07/06/16 16:45
 * <p/>
 * Copyright (C) 2016 MRibeiro
 * marco.lob@gmail.com
 * <p/>
 * All rights reserved.
 */
package ol;

import jsinterop.annotations.JsFunction;

/**
 * @author mribeiro
 *         19-05-2016.
 */
@JsFunction
public interface GenericFunction<T, E> {
    E call(T object);
}