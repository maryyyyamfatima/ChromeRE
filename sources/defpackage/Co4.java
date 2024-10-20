package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Co4 extends Jo4 {
    public final int a;
    public final /* synthetic */ Oo4 b;

    public Co4(Oo4 oo4, int i) {
        this.b = oo4;
        this.a = i != 20 ? i != 35 ? -1 : 19 : 52;
    }

    @Override // defpackage.Jo4
    public final void a() {
        int i = this.a;
        if (i == -1) {
            return;
        }
        Oo4 oo4 = this.b;
        oo4.b.getClass();
        ArrayList arrayList = new ArrayList();
        N.MA5QWuba(oo4.a, i, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5901hL c5901hL = (C5901hL) it.next();
            String str = c5901hL.g;
            if (str != null) {
                oo4.d(str, null).l.add(c5901hL);
            }
        }
    }
}
