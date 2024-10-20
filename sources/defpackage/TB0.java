package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TB0 {
    public static X82 a(RB0 rb0, int i, TL2 tl2, InterfaceC9790sg0 interfaceC9790sg0, X82 x82) {
        if (tl2.isEmpty()) {
            return C1025Hx.j(rb0.b(i));
        }
        try {
            C0822Gi1 a = AbstractC0952Hi1.a();
            HashMap hashMap = new HashMap();
            byte[] bArr = rb0.a;
            AV f = DV.f(bArr, 0, bArr.length, false);
            while (!f.e()) {
                int B = f.B();
                int i2 = B >>> 3;
                if ((B & 7) == 2) {
                    hashMap.put(Integer.valueOf(i2), f.l());
                } else {
                    f.E(B);
                }
            }
            C14 it = tl2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                byte[] bArr2 = (byte[]) hashMap.get(Integer.valueOf(((Integer) entry.getValue()).intValue()));
                if (bArr2 == null) {
                    bArr2 = AbstractC8868py0.a;
                }
                a.b(str, bArr2);
            }
            TL2 a2 = a.a(true);
            RL2 rl2 = (RL2) tl2.keySet();
            ArrayList arrayList = new ArrayList(rl2.size());
            C14 it2 = rl2.iterator();
            while (true) {
                AbstractC11277x abstractC11277x = (AbstractC11277x) it2;
                if (abstractC11277x.hasNext()) {
                    final String str2 = (String) abstractC11277x.next();
                    DV0 dv0 = new DV0() { // from class: MB0
                        @Override // defpackage.DV0
                        public final Object apply(Object obj) {
                            return Pair.create(str2, (AbstractC9095qe2) obj);
                        }
                    };
                    if (x82 != null && "/environment".equals(str2)) {
                        arrayList.add(new O92(new O92(x82, new NB0()), dv0));
                    } else {
                        C5499g92 a3 = interfaceC9790sg0.a(str2);
                        a3.getClass();
                        arrayList.add(new O92(a3, dv0));
                    }
                } else {
                    return new O92(X82.f(arrayList, new SB0(a2)), new QB0(i, tl2, rb0));
                }
            }
        } catch (IOException e) {
            throw new C10239ty0("Failed to process default model", e);
        }
    }
}
