package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y14, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11632y14 {
    public final int a;
    public final byte[] b;

    public C11632y14(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11632y14)) {
            return false;
        }
        C11632y14 c11632y14 = (C11632y14) obj;
        return this.a == c11632y14.a && Arrays.equals(this.b, c11632y14.b);
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + Arrays.hashCode(this.b);
    }
}
