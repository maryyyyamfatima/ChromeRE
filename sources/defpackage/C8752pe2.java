package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pe2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8752pe2 {
    public static final C8065ne2 e = new C8065ne2();
    public final Object a;
    public final InterfaceC8409oe2 b;
    public final String c;
    public volatile byte[] d;

    public static C8752pe2 a(Object obj, String str) {
        return new C8752pe2(str, obj, e);
    }

    public C8752pe2(String str, Object obj, InterfaceC8409oe2 interfaceC8409oe2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = obj;
        this.b = interfaceC8409oe2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8752pe2) {
            return this.c.equals(((C8752pe2) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return Y5.a(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
