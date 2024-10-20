package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5946hU {
    public final int a;
    public final EnumC6203iC2 b;

    public C5946hU(int i, EnumC6203iC2 enumC6203iC2) {
        this.a = i;
        this.b = enumC6203iC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5946hU)) {
            return false;
        }
        C5946hU c5946hU = (C5946hU) obj;
        return this.a == c5946hU.a && this.b == c5946hU.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i != 0) {
            sb.append("app ID: ");
            sb.append(i);
        }
        EnumC6203iC2 enumC6203iC2 = EnumC6203iC2.g;
        EnumC6203iC2 enumC6203iC22 = this.b;
        if (enumC6203iC22 != enumC6203iC2) {
            sb.append("product ID: ");
            sb.append(enumC6203iC22.name());
            sb.append(" (ID ");
            sb.append(enumC6203iC22.a);
            sb.append(")");
        }
        return sb.toString();
    }
}
