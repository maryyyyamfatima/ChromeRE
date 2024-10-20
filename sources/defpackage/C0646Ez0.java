package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ez0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646Ez0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final VW1 b;
    public volatile int c = 0;

    public C0646Ez0(VW1 vw1, int i) {
        this.b = vw1;
        this.a = i;
    }

    public final FW1 c() {
        ThreadLocal threadLocal = d;
        FW1 fw1 = (FW1) threadLocal.get();
        if (fw1 == null) {
            fw1 = new FW1();
            threadLocal.set(fw1);
        }
        KW1 kw1 = this.b.a;
        int a = kw1.a(6);
        if (a != 0) {
            int i = a + kw1.a;
            int i2 = (this.a * 4) + kw1.b.getInt(i) + i + 4;
            fw1.b(kw1.b.getInt(i2) + i2, kw1.b);
        }
        return fw1;
    }

    public final int a(int i) {
        FW1 c = c();
        int a = c.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c.b;
        int i2 = a + c.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        FW1 c = c();
        int a = c.a(16);
        if (a == 0) {
            return 0;
        }
        int i = a + c.a;
        return c.b.getInt(c.b.getInt(i) + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        FW1 c = c();
        int a = c.a(4);
        sb.append(Integer.toHexString(a != 0 ? c.b.getInt(a + c.a) : 0));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
