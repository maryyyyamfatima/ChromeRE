package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BW1 {
    public final HashMap a;
    public final HashMap b;
    public final DW1 c;
    public final CW1 d;

    public BW1(AW1 aw1) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(aw1.a);
        hashMap2.putAll(aw1.b);
        this.c = aw1.c;
        this.d = aw1.d;
    }

    public final void a(GW1 gw1, Object obj, C0102Au1 c0102Au1) {
        DW1 dw1 = (DW1) this.a.get(gw1);
        if (dw1 != null) {
            dw1.a(gw1, obj, c0102Au1);
        } else {
            this.c.a(gw1, obj, c0102Au1);
        }
    }

    public final void b(GW1 gw1, Iterator it, C0102Au1 c0102Au1) {
        CW1 cw1 = (CW1) this.b.get(gw1);
        if (cw1 != null) {
            cw1.a(gw1, it, c0102Au1);
            return;
        }
        CW1 cw12 = this.d;
        if (cw12 == null || this.a.containsKey(gw1)) {
            while (it.hasNext()) {
                a(gw1, it.next(), c0102Au1);
            }
        } else {
            cw12.a(gw1, it, c0102Au1);
        }
    }
}
