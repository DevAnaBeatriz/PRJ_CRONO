package com.example.cronoscronometro.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/cronoscronometro/repository/CronosRepository;", "", "cronosDatabaseDao", "Lcom/example/cronoscronometro/room/CronosDatabaseDao;", "(Lcom/example/cronoscronometro/room/CronosDatabaseDao;)V", "addCrono", "", "crono", "Lcom/example/cronoscronometro/model/Cronos;", "(Lcom/example/cronoscronometro/model/Cronos;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCrono", "getAllCronos", "Lkotlinx/coroutines/flow/Flow;", "", "getCronoById", "id", "", "updateCrono", "app_debug"})
public final class CronosRepository {
    private final com.example.cronoscronometro.room.CronosDatabaseDao cronosDatabaseDao = null;
    
    @javax.inject.Inject
    public CronosRepository(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.room.CronosDatabaseDao cronosDatabaseDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.cronoscronometro.model.Cronos>> getAllCronos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.cronoscronometro.model.Cronos> getCronoById(long id) {
        return null;
    }
}