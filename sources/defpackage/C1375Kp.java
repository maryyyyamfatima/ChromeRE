package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1375Kp {
    public final String a;
    public final boolean b;

    public C1375Kp(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b ? 1023 : 0) ^ (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1375Kp)) {
            return false;
        }
        C1375Kp c1375Kp = (C1375Kp) obj;
        return this.b == c1375Kp.b && TextUtils.equals(this.a, c1375Kp.a);
    }
}
