package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6161i50 {
    public String a;
    public String b;

    public C6161i50() {
    }

    public C6161i50(String str, String str2) {
        this.a = str == null ? "" : str;
        this.b = str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6161i50)) {
            return false;
        }
        C6161i50 c6161i50 = (C6161i50) obj;
        return TextUtils.equals(this.a, c6161i50.a) && TextUtils.equals(this.b, c6161i50.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (1891 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return this.a + "_" + this.b;
    }
}
