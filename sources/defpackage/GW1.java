package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GW1 {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public GW1(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        char charAt = str.charAt(0);
        if (!(('a' <= charAt && charAt <= 'z') || ('A' <= charAt && charAt <= 'Z'))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (!(('a' <= charAt2 && charAt2 <= 'z') || ('A' <= charAt2 && charAt2 <= 'Z')) && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Object obj, C0102Au1 c0102Au1) {
        c0102Au1.a(obj, this.a);
    }

    public void b(Iterator it, C0102Au1 c0102Au1) {
        while (it.hasNext()) {
            a(it.next(), c0102Au1);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final String toString() {
        return getClass().getName() + "/" + this.a + "[" + this.b.getName() + "]";
    }
}
