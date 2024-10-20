package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6312iY1 {
    public static final ArrayDeque d;
    public int a;
    public int b;
    public Object c;

    static {
        char[] cArr = AbstractC10296u74.a;
        d = new ArrayDeque(0);
    }

    public static C6312iY1 a(Object obj) {
        C6312iY1 c6312iY1;
        ArrayDeque arrayDeque = d;
        synchronized (arrayDeque) {
            c6312iY1 = (C6312iY1) arrayDeque.poll();
        }
        if (c6312iY1 == null) {
            c6312iY1 = new C6312iY1();
        }
        c6312iY1.c = obj;
        c6312iY1.b = 0;
        c6312iY1.a = 0;
        return c6312iY1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6312iY1)) {
            return false;
        }
        C6312iY1 c6312iY1 = (C6312iY1) obj;
        return this.b == c6312iY1.b && this.a == c6312iY1.a && this.c.equals(c6312iY1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }
}
