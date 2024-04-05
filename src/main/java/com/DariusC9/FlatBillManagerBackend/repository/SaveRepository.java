package com.DariusC9.FlatBillManagerBackend.repository;

public interface SaveRepository<T> {
    public void save(T object);
}
