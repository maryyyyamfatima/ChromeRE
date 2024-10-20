package defpackage;

import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hc1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0922Hc1 extends IInterface {
    boolean enableAsyncReprojection(int i);

    boolean enableCardboardTriggerEmulation(InterfaceC9094qe1 interfaceC9094qe1);

    long getNativeGvrContext();

    InterfaceC9094qe1 getRootView();

    InterfaceC1312Kc1 getUiLayout();

    void onBackPressed();

    void onPause();

    void onResume();

    boolean setOnDonNotNeededListener(InterfaceC9094qe1 interfaceC9094qe1);

    void setPresentationView(InterfaceC9094qe1 interfaceC9094qe1);

    void setReentryIntent(InterfaceC9094qe1 interfaceC9094qe1);

    void setStereoModeEnabled(boolean z);

    void shutdown();
}
