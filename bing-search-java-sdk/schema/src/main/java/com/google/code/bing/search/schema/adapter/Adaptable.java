/**
 *
 */
package com.google.code.bing.search.schema.adapter;

/**
 * @author nmukhtar
 *
 *
 * @param <Adapter>
 * @param <Adaptee>
 */
public interface Adaptable<Adapter, Adaptee> {

    /**
     * Method description
     *
     *
     * @param adaptee
     *
     * @return
     */
    public Adapter toAdapter(Adaptee adaptee);

    /**
     * Method description
     *
     *
     * @param adapter
     *
     * @return
     */
    public Adaptee toAdaptee(Adapter adapter);
}
