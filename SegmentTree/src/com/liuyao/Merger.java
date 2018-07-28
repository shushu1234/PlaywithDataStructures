package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/28
 */
public interface Merger<E> {
    public E merger(E a, E b);
}
