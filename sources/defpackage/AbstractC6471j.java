package defpackage;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6471j extends AbstractC6232iI1 {
    private final String a;

    public AbstractC6471j(String str) {
        this.a = str;
    }

    @Override // defpackage.AbstractC6232iI1
    public String a() {
        return this.a;
    }

    @Override // defpackage.AbstractC6232iI1
    public void b(RuntimeException runtimeException, InterfaceC6913kH1 interfaceC6913kH1) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
