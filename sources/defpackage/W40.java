package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class W40 {
    public static final AtomicInteger a = new AtomicInteger(1);

    public static int a(UF0 uf0) {
        int i;
        int i2;
        short s;
        boolean z;
        if (uf0 == null) {
            return 1;
        }
        AbstractC7895n74.d();
        ByteBuffer j = RP0.j(uf0, 168772996);
        if (j != null) {
            i2 = j.position() + TW1.a(j, ByteOrder.LITTLE_ENDIAN);
            i = i2 - j.getInt(i2);
            s = j.getShort(i);
            z = true;
        } else {
            j = null;
            i = 0;
            i2 = 0;
            s = 0;
            z = false;
        }
        if (!z) {
            return 1;
        }
        short s2 = 22 < s ? j.getShort(i + 22) : (short) 0;
        int i3 = s2 != 0 ? j.getInt(s2 + i2) : 0;
        if (i3 == 1) {
            return 3;
        }
        if (i3 != 2) {
            return i3 != 4 ? 1 : 2;
        }
        return 4;
    }
}
