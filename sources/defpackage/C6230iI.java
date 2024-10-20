package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6230iI {
    public static final Object[] c;
    public static final C6230iI d;
    public final Object[] a;
    public final int b;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        d = new C6230iI(objArr);
    }

    public C6230iI(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr);
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6230iI) {
            C6230iI c6230iI = (C6230iI) obj;
            if (this.b == c6230iI.b && Arrays.equals(this.a, c6230iI.a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return Arrays.toString(this.a);
    }
}
