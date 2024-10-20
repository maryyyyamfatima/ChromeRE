package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ft2 */
/* loaded from: classes.dex */
public final class C0748Ft2 {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final CV0 h;

    public C0748Ft2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, CV0 cv0) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z4;
        this.h = cv0;
    }

    public final void b(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = AbstractC0878Gt2.g;
        new C12271zt2(this, str, valueOf, true);
    }

    public final C0098At2 a(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = AbstractC0878Gt2.g;
        return new C0098At2(this, str, valueOf, true);
    }

    public final void c(String str, double d) {
        Double valueOf = Double.valueOf(d);
        Object obj = AbstractC0878Gt2.g;
        new C0228Bt2(this, str, valueOf);
    }
}
