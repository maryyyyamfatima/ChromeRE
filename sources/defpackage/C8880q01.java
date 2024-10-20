package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8880q01 {
    public final int a;
    public final int b;

    public C8880q01(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8880q01)) {
            return false;
        }
        C8880q01 c8880q01 = (C8880q01) obj;
        return this.a == c8880q01.a && this.b == c8880q01.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
