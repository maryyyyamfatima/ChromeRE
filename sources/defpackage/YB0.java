package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YB0 implements DV0 {
    public final int a;
    public final AbstractC0952Hi1 b;
    public final C7188l43 c;

    @Override // defpackage.DV0
    public final Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        C14 it = ((AbstractC0952Hi1) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put(Integer.valueOf(((Integer) this.b.get(entry.getKey())).intValue()), new XB0((AbstractC9095qe2) entry.getValue()));
        }
        DV h = DV.h(this.c.c(), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = KV.b;
        JV jv = new JV(4096, byteArrayOutputStream);
        for (int i = 0; i < 13; i++) {
            jv.x((byte) 0);
        }
        while (!h.e()) {
            int B = h.B();
            int i2 = B >>> 3;
            int i3 = B & 7;
            if (i3 == 0) {
                jv.R(i2, h.D());
            } else if (i3 == 1) {
                jv.E(i2, h.q());
            } else if (i3 == 2) {
                XB0 xb0 = (XB0) hashMap.remove(Integer.valueOf(i2));
                if (xb0 == null) {
                    jv.A(i2, h.m());
                } else {
                    h.E(B);
                    AbstractC9095qe2 abstractC9095qe2 = xb0.a;
                    if (abstractC9095qe2.c()) {
                        jv.c0(i2, (byte[]) abstractC9095qe2.b());
                    }
                }
            } else if (i3 == 5) {
                jv.C(i2, h.p());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            XB0 xb02 = (XB0) entry2.getValue();
            int intValue = (((Integer) entry2.getKey()).intValue() << 3) | 2;
            AbstractC9095qe2 abstractC9095qe22 = xb02.a;
            if (abstractC9095qe22.c()) {
                jv.c0(intValue >>> 3, (byte[]) abstractC9095qe22.b());
            }
        }
        jv.Z();
        int i4 = jv.f - 13;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        JV jv2 = new JV(4096, byteArrayOutputStream2);
        jv2.O(this.a, 2);
        jv2.Q(i4);
        jv2.Z();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        int length = 13 - byteArray.length;
        System.arraycopy(byteArray, 0, byteArray2, length, byteArray.length);
        ByteBuffer wrap = ByteBuffer.wrap(byteArray2, length, i4 + byteArray.length);
        if (wrap == null) {
            return C7188l43.e;
        }
        return new C7188l43(wrap, false);
    }

    public YB0(int i, TL2 tl2, C7188l43 c7188l43) {
        this.a = i;
        this.b = tl2;
        this.c = c7188l43;
    }
}
