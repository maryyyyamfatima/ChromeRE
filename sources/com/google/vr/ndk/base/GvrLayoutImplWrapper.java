package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.AbstractBinderC0792Gc1;
import defpackage.InterfaceC1312Kc1;
import defpackage.InterfaceC9094qe1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrLayoutImplWrapper extends AbstractBinderC0792Gc1 {
    private final GvrLayoutImpl impl;

    public GvrLayoutImplWrapper(GvrLayoutImpl gvrLayoutImpl) {
        this.impl = gvrLayoutImpl;
    }

    @Override // defpackage.InterfaceC0922Hc1
    public long getNativeGvrContext() {
        return this.impl.getGvrApi().getNativeGvrContext();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public InterfaceC9094qe1 getRootView() {
        return new ObjectWrapper(this.impl);
    }

    @Override // defpackage.InterfaceC0922Hc1
    public InterfaceC1312Kc1 getUiLayout() {
        return this.impl.getUiLayoutImpl();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void onPause() {
        this.impl.onPause();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void onResume() {
        this.impl.onResume();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void onBackPressed() {
        this.impl.onBackPressed();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void shutdown() {
        this.impl.shutdown();
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void setPresentationView(InterfaceC9094qe1 interfaceC9094qe1) {
        this.impl.setPresentationView((View) ObjectWrapper.a(interfaceC9094qe1, View.class));
    }

    @Override // defpackage.InterfaceC0922Hc1
    public boolean enableAsyncReprojection(int i) {
        return this.impl.enableAsyncReprojection(i);
    }

    @Override // defpackage.InterfaceC0922Hc1
    public boolean enableCardboardTriggerEmulation(InterfaceC9094qe1 interfaceC9094qe1) {
        return this.impl.enableCardboardTriggerEmulation((Runnable) ObjectWrapper.a(interfaceC9094qe1, Runnable.class));
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void setStereoModeEnabled(boolean z) {
        this.impl.setStereoModeEnabled(z);
    }

    @Override // defpackage.InterfaceC0922Hc1
    public void setReentryIntent(InterfaceC9094qe1 interfaceC9094qe1) {
        this.impl.setReentryIntent((PendingIntent) ObjectWrapper.a(interfaceC9094qe1, PendingIntent.class));
    }

    @Override // defpackage.InterfaceC0922Hc1
    public boolean setOnDonNotNeededListener(InterfaceC9094qe1 interfaceC9094qe1) {
        return this.impl.setOnDonNotNeededListener((Runnable) ObjectWrapper.a(interfaceC9094qe1, Runnable.class));
    }
}
