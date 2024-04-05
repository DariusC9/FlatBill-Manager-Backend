package com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces;

public interface SaveRepository<T> {
    public void save(T object);
}
