package com.DariusC9.FlatBillManagerBackend.repository;

import java.util.List;

public interface FetchRepository<T> {
    public List<T> fetchAll();
}
