package defpackage;

import android.graphics.Typeface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VW1 {
    public final KW1 a;
    public final char[] b;
    public final UW1 c = new UW1(1024);
    public final Typeface d;

    public VW1(Typeface typeface, KW1 kw1) {
        int i;
        int i2;
        this.d = typeface;
        this.a = kw1;
        int a = kw1.a(6);
        if (a != 0) {
            int i3 = a + kw1.a;
            i = kw1.b.getInt(kw1.b.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a2 = kw1.a(6);
        if (a2 != 0) {
            int i4 = a2 + kw1.a;
            i2 = kw1.b.getInt(kw1.b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C0646Ez0 c0646Ez0 = new C0646Ez0(this, i5);
            FW1 c = c0646Ez0.c();
            int a3 = c.a(4);
            Character.toChars(a3 != 0 ? c.b.getInt(a3 + c.a) : 0, this.b, i5 * 2);
            c0646Ez0.b();
            this.c.a(c0646Ez0, 0, c0646Ez0.b() - 1);
        }
    }

    public static VW1 a(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        LW1 lw1 = new LW1(duplicate);
        lw1.b(4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        lw1.b(6);
        int i2 = 0;
        while (true) {
            byteBuffer = lw1.a;
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            lw1.b(4);
            j = lw1.a();
            lw1.b(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            lw1.b((int) (j - duplicate.position()));
            lw1.b(12);
            long a = lw1.a();
            for (int i4 = 0; i4 < a; i4++) {
                int i5 = byteBuffer.getInt();
                long a2 = lw1.a();
                lw1.a();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (a2 + j));
                    KW1 kw1 = new KW1();
                    kw1.b(duplicate.position() + TW1.a(duplicate, ByteOrder.LITTLE_ENDIAN), duplicate);
                    return new VW1(typeface, kw1);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
