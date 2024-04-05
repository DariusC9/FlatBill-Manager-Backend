package com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces;

public interface Repository<T> extends SaveRepository<T>, FetchRepository<T>, UpdateRepository<T>, DeleteRepository<T> {
}
