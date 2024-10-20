package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleBytesProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EmptyJSEnvironment extends JSEnvironment {
    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public JSModuleBytesProvider getBytesProvider() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSController getController() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final ControllerModuleLoader getModuleLoader() {
        return null;
    }
}
