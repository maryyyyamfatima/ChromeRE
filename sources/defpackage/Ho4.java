package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Ho4 extends Jo4 {
    public final int a;
    public final /* synthetic */ Oo4 b;

    @Override // defpackage.Jo4
    public final void a() {
        Oo4 oo4 = this.b;
        oo4.b.getClass();
        ArrayList arrayList = new ArrayList();
        BrowserContextHandle browserContextHandle = oo4.a;
        int i = this.a;
        N.MexN59P3(browserContextHandle, i, arrayList, (i == 4 || i == 8 || i == 9) ? !N.MB23OvTV(browserContextHandle, i) : false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1128Ir2 c1128Ir2 = (C1128Ir2) it.next();
            String str = c1128Ir2.h;
            if (str != null) {
                oo4.d(str, i == 32 ? null : c1128Ir2.g).i.put(Integer.valueOf(c1128Ir2.i), c1128Ir2);
            }
        }
    }

    public Ho4(Oo4 oo4, int i) {
        this.b = oo4;
        this.a = i;
    }
}
