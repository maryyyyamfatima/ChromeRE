package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QB0 implements DV0 {
    public final int a;
    public final AbstractC0952Hi1 b;
    public final RB0 c;

    @Override // defpackage.DV0
    public final Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        C14 it = ((AbstractC0952Hi1) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put(Integer.valueOf(((Integer) this.b.get(entry.getKey())).intValue()), new OB0((byte[]) entry.getValue()));
        }
        byte[] bArr = this.c.a;
        AV f = DV.f(bArr, 0, bArr.length, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = KV.b;
        JV jv = new JV(4096, byteArrayOutputStream);
        while (!f.e()) {
            int B = f.B();
            int i = B >>> 3;
            int i2 = B & 7;
            if (i2 == 0) {
                jv.R(i, f.I());
            } else if (i2 == 1) {
                jv.E(i, f.H());
            } else if (i2 == 2) {
                OB0 ob0 = (OB0) hashMap.remove(Integer.valueOf(i));
                if (ob0 == null) {
                    jv.A(i, f.m());
                } else {
                    f.E(B);
                    jv.c0(i, ob0.a);
                }
            } else if (i2 == 5) {
                jv.C(i, f.G());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            jv.c0(((((Integer) entry2.getKey()).intValue() << 3) | 2) >>> 3, ((OB0) entry2.getValue()).a);
        }
        jv.Z();
        return new RB0(byteArrayOutputStream.toByteArray()).b(this.a);
    }

    public QB0(int i, TL2 tl2, RB0 rb0) {
        this.a = i;
        this.b = tl2;
        this.c = rb0;
    }
}
