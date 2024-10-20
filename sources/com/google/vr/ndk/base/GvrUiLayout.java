package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.RemoteException;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.AbstractC8883q04;
import defpackage.InterfaceC1312Kc1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrUiLayout {
    private final InterfaceC1312Kc1 impl;

    public GvrUiLayout(InterfaceC1312Kc1 interfaceC1312Kc1) {
        this.impl = interfaceC1312Kc1;
    }

    public static void launchOrInstallGvrApp(Activity activity) {
        AbstractC8883q04.a(activity);
    }

    public void setCloseButtonListener(Runnable runnable) {
        try {
            this.impl.setCloseButtonListener(new ObjectWrapper(runnable));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTransitionViewEnabled(boolean z) {
        try {
            this.impl.setTransitionViewEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setSettingsButtonListener(Runnable runnable) {
        try {
            this.impl.setSettingsButtonListener(new ObjectWrapper(runnable));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
