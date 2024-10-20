package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IW1 implements CW1 {
    @Override // defpackage.CW1
    public final void a(GW1 gw1, Iterator it, C0102Au1 c0102Au1) {
        if (!gw1.c) {
            throw new IllegalStateException("non repeating key");
        }
        if (gw1.d && AbstractC2312Ru2.j() > 20) {
            while (it.hasNext()) {
                c0102Au1.a(it.next(), gw1.a);
            }
        } else {
            gw1.b(it, c0102Au1);
        }
    }
}
