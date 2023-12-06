package com.example.cronoscronometro.di;

import com.example.cronoscronometro.room.CronosDatabase;
import com.example.cronoscronometro.room.CronosDatabaseDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvidesCronosDaoFactory implements Factory<CronosDatabaseDao> {
  private final Provider<CronosDatabase> cronoDatabaseProvider;

  public AppModule_ProvidesCronosDaoFactory(Provider<CronosDatabase> cronoDatabaseProvider) {
    this.cronoDatabaseProvider = cronoDatabaseProvider;
  }

  @Override
  public CronosDatabaseDao get() {
    return providesCronosDao(cronoDatabaseProvider.get());
  }

  public static AppModule_ProvidesCronosDaoFactory create(
      Provider<CronosDatabase> cronoDatabaseProvider) {
    return new AppModule_ProvidesCronosDaoFactory(cronoDatabaseProvider);
  }

  public static CronosDatabaseDao providesCronosDao(CronosDatabase cronoDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesCronosDao(cronoDatabase));
  }
}
