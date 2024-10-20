package defpackage;

import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ig1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6357ig1 extends AbstractC8763pg1 {
    public final /* synthetic */ C9106qg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6357ig1(C9106qg1 c9106qg1, T11 t11) {
        super(c9106qg1, t11);
        this.j = c9106qg1;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        T11 t11 = (T11) zn;
        C9106qg1 c9106qg1 = this.j;
        c9106qg1.i.set(false);
        c9106qg1.m.set(false);
        SharedPreferences sharedPreferences = c9106qg1.a;
        if (sharedPreferences.getBoolean("com.google.android.apps.chrome.icing.IcingController.DATA_CLEARED", false) && t11.b()) {
            sharedPreferences.edit().putInt("com.google.android.apps.chrome.icing.IcingController.VERSION", 2).apply();
            sharedPreferences.edit().putBoolean("com.google.android.apps.chrome.icing.IcingController.DATA_CLEARED", false).apply();
        }
    }
}
