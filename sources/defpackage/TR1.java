package defpackage;

import com.google.android.gms.cast.CastDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TR1 {
    public final String a;
    public final String b;

    public TR1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TR1)) {
            return false;
        }
        TR1 tr1 = (TR1) obj;
        return this.a.equals(tr1.a) && this.b.equals(tr1.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return String.format("MediaSink: %s, %s", this.a, this.b);
    }

    public static TR1 a(DQ1 dq1) {
        String str = dq1.c;
        String str2 = dq1.d;
        CastDevice.t1(dq1.r);
        return new TR1(str, str2);
    }
}
