package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ns0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780Ns0 {
    public C6161i50 a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean g;
    public int i;
    public int f = 0;
    public C1650Ms0 h = new C1650Ms0();

    public final int hashCode() {
        C6161i50 c6161i50 = this.a;
        int hashCode = (c6161i50 == null ? 0 : c6161i50.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1780Ns0)) {
            return false;
        }
        C1780Ns0 c1780Ns0 = (C1780Ns0) obj;
        C6161i50 c6161i50 = this.a;
        return (c6161i50 == null ? c1780Ns0.a == null : c6161i50.equals(c1780Ns0.a)) && TextUtils.equals(this.b, c1780Ns0.b) && TextUtils.equals(this.c, c1780Ns0.c) && TextUtils.equals(this.d, c1780Ns0.d) && this.e == c1780Ns0.e;
    }
}
