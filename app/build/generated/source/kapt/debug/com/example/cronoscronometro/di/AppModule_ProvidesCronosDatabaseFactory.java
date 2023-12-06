package com.example.cronoscronometro.di;

import android.content.Context;
import com.example.cronoscronometro.room.CronosDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvidesCronosDatabaseFactory implements Factory<CronosDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvidesCronosDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CronosDatabase get() {
    return providesCronosDatabase(contextProvider.get());
  }

  public static AppModule_ProvidesCronosDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvidesCronosDatabaseFactory(contextProvider);
  }

  public static CronosDatabase providesCronosDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesCronosDatabase(context));
  }
}
