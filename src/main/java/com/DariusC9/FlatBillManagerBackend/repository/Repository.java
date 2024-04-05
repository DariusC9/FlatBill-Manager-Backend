package com.DariusC9.FlatBillManagerBackend.repository;

public interface Repository<T> extends SaveRepository<T>, FetchRepository<T>, UpdateRepository<T>, DeleteRepository<T> {
}
