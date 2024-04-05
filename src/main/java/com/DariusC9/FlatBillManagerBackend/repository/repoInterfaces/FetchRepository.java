package com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces;

import java.util.List;

public interface FetchRepository<T> {
    public List<T> fetchAll();
}
