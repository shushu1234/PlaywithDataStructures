package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/28
 */
public interface Merger<E> {
    public E merge(E a, E b);
}
