package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WL3 extends AbstractC10791vb2 implements InterfaceC0316Cl0 {
    public final OfflinePageBridge a;
    public final /* synthetic */ ZL3 b;

    public final void b() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            InterfaceC0263Ca2 interfaceC0263Ca2 = (InterfaceC0263Ca2) it.next();
            interfaceC0263Ca2.getClass();
            c(interfaceC0263Ca2, null);
        }
    }

    @Override // defpackage.InterfaceC0316Cl0
    public final void onDestroy() {
        this.a.c.d(this);
    }

    public final void c(InterfaceC0263Ca2 interfaceC0263Ca2, AbstractC9847sp3 abstractC9847sp3) {
        OfflinePageBridge offlinePageBridge = this.a;
        if (offlinePageBridge.b) {
            N.MR_37z77(offlinePageBridge.a, offlinePageBridge, ((PL3) interfaceC0263Ca2).a.b, 0, new C9504rp3(this, abstractC9847sp3, interfaceC0263Ca2));
        } else if (abstractC9847sp3 != null) {
            int i = abstractC9847sp3.a - 1;
            abstractC9847sp3.a = i;
            if (i == 0) {
                EI2.h(abstractC9847sp3.b, 20, "NewTabPage.ContentSuggestions.CountOnNtpOpenedIfVisible.Articles.Prefetched.Offline2");
            }
        }
    }

    public WL3(ZL3 zl3, OfflinePageBridge offlinePageBridge) {
        this.b = zl3;
        this.a = offlinePageBridge;
        offlinePageBridge.c.a(this);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ZL3 zl3 = this.b;
            if (i >= zl3.h.size()) {
                return arrayList;
            }
            arrayList.addAll((Collection) zl3.h.valueAt(i));
            i++;
        }
    }
}
