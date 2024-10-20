package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JW1 {
    public static final HW1 a = new HW1();
    public static final IW1 b = new IW1();

    public static BW1 a(Set set) {
        AW1 aw1 = new AW1();
        aw1.d = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            GW1 gw1 = (GW1) it.next();
            AbstractC5203fJ.a(gw1, "key");
            HashMap hashMap = aw1.a;
            HashMap hashMap2 = aw1.b;
            boolean z = gw1.c;
            if (z) {
                C12136zW1 c12136zW1 = AW1.f;
                if (!z) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                hashMap.remove(gw1);
                hashMap2.put(gw1, c12136zW1);
            } else {
                C11793yW1 c11793yW1 = AW1.e;
                hashMap2.remove(gw1);
                hashMap.put(gw1, c11793yW1);
            }
        }
        return new BW1(aw1);
    }
}
