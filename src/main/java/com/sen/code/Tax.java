package com.sen.code;

@FunctionalInterface
public interface Tax<T,R> {
	R apply(T t);
}

