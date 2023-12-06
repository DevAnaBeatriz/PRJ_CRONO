package com.example.cronoscronometro.viewModels;

import com.example.cronoscronometro.repository.CronosRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CronometroViewModel_Factory implements Factory<CronometroViewModel> {
  private final Provider<CronosRepository> repositoryProvider;

  public CronometroViewModel_Factory(Provider<CronosRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CronometroViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CronometroViewModel_Factory create(Provider<CronosRepository> repositoryProvider) {
    return new CronometroViewModel_Factory(repositoryProvider);
  }

  public static CronometroViewModel newInstance(CronosRepository repository) {
    return new CronometroViewModel(repository);
  }
}
