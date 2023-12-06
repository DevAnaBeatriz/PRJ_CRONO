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
public final class CronosViewModel_Factory implements Factory<CronosViewModel> {
  private final Provider<CronosRepository> repositoryProvider;

  public CronosViewModel_Factory(Provider<CronosRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CronosViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CronosViewModel_Factory create(Provider<CronosRepository> repositoryProvider) {
    return new CronosViewModel_Factory(repositoryProvider);
  }

  public static CronosViewModel newInstance(CronosRepository repository) {
    return new CronosViewModel(repository);
  }
}
