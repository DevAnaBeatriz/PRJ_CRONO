package com.example.cronoscronometro.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u001dJ\u0006\u0010\'\u001a\u00020\u001dR/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/example/cronoscronometro/viewModels/CronometroViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cronoscronometro/repository/CronosRepository;", "(Lcom/example/cronoscronometro/repository/CronosRepository;)V", "<set-?>", "Lkotlinx/coroutines/Job;", "cronoJob", "getCronoJob", "()Lkotlinx/coroutines/Job;", "setCronoJob", "(Lkotlinx/coroutines/Job;)V", "cronoJob$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/example/cronoscronometro/state/CronoState;", "state", "getState", "()Lcom/example/cronoscronometro/state/CronoState;", "setState", "(Lcom/example/cronoscronometro/state/CronoState;)V", "state$delegate", "", "tiempo", "getTiempo", "()J", "setTiempo", "(J)V", "tiempo$delegate", "cronos", "", "det", "detener", "getCronoById", "id", "iniciar", "onValue", "value", "", "pausar", "showTextField", "app_debug"})
public final class CronometroViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cronoscronometro.repository.CronosRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState cronoJob$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tiempo$delegate = null;
    
    @javax.inject.Inject
    public CronometroViewModel(@org.jetbrains.annotations.NotNull
    com.example.cronoscronometro.repository.CronosRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.cronoscronometro.state.CronoState getState() {
        return null;
    }
    
    private final void setState(com.example.cronoscronometro.state.CronoState p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job getCronoJob() {
        return null;
    }
    
    private final void setCronoJob(kotlinx.coroutines.Job p0) {
    }
    
    public final long getTiempo() {
        return 0L;
    }
    
    private final void setTiempo(long p0) {
    }
    
    public final void getCronoById(long id) {
    }
    
    public final void onValue(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void iniciar() {
    }
    
    public final void pausar() {
    }
    
    public final void det() {
    }
    
    public final void detener() {
    }
    
    public final void showTextField() {
    }
    
    public final void cronos() {
    }
}