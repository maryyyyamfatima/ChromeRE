package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Do4 extends Jo4 {
    public final int a;
    public final /* synthetic */ Oo4 b;

    @Override // defpackage.Jo4
    public final void a() {
        Oo4 oo4 = this.b;
        oo4.b.getClass();
        ArrayList<L50> arrayList = new ArrayList();
        BrowserContextHandle browserContextHandle = oo4.a;
        int i = this.a;
        N.MI$w5f76(browserContextHandle, i, arrayList);
        if (N.MnAiqOhu(browserContextHandle, i)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                L50 l50 = (L50) it.next();
                if (l50.j.equals("policy")) {
                    arrayList2.add(l50);
                }
            }
            arrayList = arrayList2;
        }
        for (L50 l502 : arrayList) {
            String str = l502.g;
            if (str != null) {
                String str2 = l502.h;
                if (!str.equals(str2) || !str.equals("*")) {
                    oo4.d(str, str2).l(i, l502);
                }
            }
        }
    }

    public Do4(Oo4 oo4, int i) {
        this.b = oo4;
        this.a = i;
    }
}
