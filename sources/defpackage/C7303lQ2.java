package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7303lQ2 extends AbstractC0185Bl {
    public final /* synthetic */ C7991nQ2 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return C7991nQ2.b(Uri.withAppendedPath(this.h.e, "peek"), null, null, null);
    }

    public C7303lQ2(C7991nQ2 c7991nQ2) {
        this.h = c7991nQ2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String str = (String) obj;
        this.h.e(str);
        T60.a.edit().putString("com.google.android.apps.chrome.rlz.RLZ_STRING", str).apply();
    }
}
