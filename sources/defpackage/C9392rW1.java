package defpackage;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9392rW1 {
    public static final BitSet b;
    public final String a;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        b = bitSet;
    }

    public C9392rW1(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("connection")) {
            int i = AbstractC9735sW1.a;
            Level level = Level.WARNING;
            new RuntimeException("exception to show backtrace");
            throw null;
        }
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            b.get(lowerCase.charAt(i2));
        }
        this.a = lowerCase;
        lowerCase.getBytes(AbstractC4172cJ.a);
        str.endsWith("-bin");
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9392rW1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C9392rW1) obj).a);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return Y5.a(new StringBuilder("Key{name='"), this.a, "'}");
    }
}
