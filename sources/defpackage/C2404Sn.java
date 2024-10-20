package defpackage;

import j$.util.Optional;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2404Sn {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Optional e;

    public C2404Sn(String str, String str2, boolean z, boolean z2, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null clientInstanceId");
        }
        this.b = str2;
        this.c = z;
        this.d = z2;
        if (optional == null) {
            throw new NullPointerException("Null rootEventId");
        }
        this.e = optional;
    }

    public final String toString() {
        return "Values{accountName=" + this.a + ", clientInstanceId=" + this.b + ", loggingEnabled=" + this.c + ", viewActionsEnabled=" + this.d + ", rootEventId=" + String.valueOf(this.e) + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2404Sn)) {
            return false;
        }
        C2404Sn c2404Sn = (C2404Sn) obj;
        return this.a.equals(c2404Sn.a) && this.b.equals(c2404Sn.b) && this.c == c2404Sn.c && this.d == c2404Sn.d && this.e.equals(c2404Sn.e);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode();
    }
}
