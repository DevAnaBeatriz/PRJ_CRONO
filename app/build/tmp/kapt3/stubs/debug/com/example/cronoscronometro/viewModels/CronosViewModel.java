package com.example.cronoscronometro.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/cronoscronometro/viewModels/CronosViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cronoscronometro/repository/CronosRepository;", "(Lcom/example/cronoscronometro/repository/CronosRepository;)V", "_cronosList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/cronoscronometro/model/Cronos;", "cronosList", "Lkotlinx/coroutines/flow/StateFlow;", "getCronosList", "()Lkotlinx/coroutines/flow/StateFlow;", "addCrono", "Lkotlinx/coroutines/Job;", "crono", "deleteCrono", "updateCrono", "app_debug"})
public final class CronosViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cronoscronometro.repository.CronosRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.cronoscronometro.model.Cronos>> _cronosList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.cronoscronometro.model.Cronos>> cronosList = null;
    
    @javax.inject.Inject
    public CronosViewModel(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.repository.CronosRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.cronoscronometro.model.Cronos>> getCronosList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteCrono(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.model.Cronos crono) {
        return null;
    }
}