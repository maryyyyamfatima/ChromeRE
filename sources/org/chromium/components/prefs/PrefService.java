package org.chromium.components.prefs;

import J.N;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PrefService {
    public long a;

    public static PrefService create(long j) {
        return new PrefService(j);
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }

    public PrefService(long j) {
        this.a = j;
    }

    public final boolean a(String str) {
        return N.MzIXnlkD(this.a, str);
    }

    public final void e(String str, boolean z) {
        N.Mf2ABpoH(this.a, str, z);
    }

    public final int b(String str) {
        return N.MzGf81GW(this.a, str);
    }

    public final String c(String str) {
        return N.Ma80fvz5(this.a, str);
    }

    public final void f(String str, String str2) {
        N.MY13p7Sp(this.a, str, str2);
    }

    public final boolean d(String str) {
        return N.MrEgF7hX(this.a, str);
    }
}
