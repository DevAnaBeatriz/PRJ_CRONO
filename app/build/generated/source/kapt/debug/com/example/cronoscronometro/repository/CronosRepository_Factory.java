package com.example.cronoscronometro.repository;

import com.example.cronoscronometro.room.CronosDatabaseDao;
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
public final class CronosRepository_Factory implements Factory<CronosRepository> {
  private final Provider<CronosDatabaseDao> cronosDatabaseDaoProvider;

  public CronosRepository_Factory(Provider<CronosDatabaseDao> cronosDatabaseDaoProvider) {
    this.cronosDatabaseDaoProvider = cronosDatabaseDaoProvider;
  }

  @Override
  public CronosRepository get() {
    return newInstance(cronosDatabaseDaoProvider.get());
  }

  public static CronosRepository_Factory create(
      Provider<CronosDatabaseDao> cronosDatabaseDaoProvider) {
    return new CronosRepository_Factory(cronosDatabaseDaoProvider);
  }

  public static CronosRepository newInstance(CronosDatabaseDao cronosDatabaseDao) {
    return new CronosRepository(cronosDatabaseDao);
  }
}
