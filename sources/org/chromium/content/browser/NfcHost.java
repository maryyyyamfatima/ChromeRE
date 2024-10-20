package org.chromium.content.browser;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.SparseArray;
import defpackage.InterfaceC9163qp4;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NfcHost implements InterfaceC9163qp4 {
    public static final SparseArray i = new SparseArray();
    public final WebContents a;
    public final int g;
    public Callback h;

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onAttachedToWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onDetachedFromWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public static void create(WebContents webContents, int i2) {
        new NfcHost(webContents, i2);
    }

    public NfcHost(WebContents webContents, int i2) {
        this.a = webContents;
        this.g = i2;
        i.put(i2, this);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        this.h.onResult(windowAndroid != null ? (Activity) windowAndroid.k().get() : null);
    }
}
