package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Pv4 implements Js4 {
    public final /* synthetic */ Hs4 c;

    public /* synthetic */ Pv4(Hs4 hs4) {
        this.c = hs4;
    }

    @Override // defpackage.Js4
    public final void b(C10907vu4 c10907vu4) {
        C5769gw4 c5769gw4 = this.c.d0;
        synchronized (c5769gw4) {
            Iterator it = new HashSet(c5769gw4.a).iterator();
            while (it.hasNext()) {
                ((Js4) it.next()).b(c10907vu4);
            }
        }
    }
}
