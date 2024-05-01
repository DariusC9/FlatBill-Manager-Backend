package com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces;

import java.util.List;
import java.util.UUID;

public interface FetchRepository<T> {
    public List<T> fetchAll();
    public T findById(UUID id);
}
