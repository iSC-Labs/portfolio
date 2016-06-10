/**
 * $$Id$$
 *
 * @author mribeiro
 * @date 07/06/16 18:05
 * <p/>
 * Copyright (C) 2016 MRibeiro
 * marco.lob@gmail.com
 * <p/>
 * All rights reserved.
 */
package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface TileWMSParams {

    /**
     *
     * @param layers
     */
    @JsProperty(name = "LAYERS")
    void setLayers(String layers);

    /**
     *
     * @param version
     */
    @JsProperty(name = "VERSION")
    void setVersion(String version);

    /**
     *
     * @param tiled
     */
    @JsProperty(name = "TILED")
    void setTiled(boolean tiled);
}