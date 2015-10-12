package org.phphub.app.common.internal.di.component;

import org.phphub.app.common.Navigator;
import org.phphub.app.common.internal.di.module.AppModule;
import org.phphub.app.ui.view.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(LoginActivity loginActivity);

    Navigator navigator();
}
