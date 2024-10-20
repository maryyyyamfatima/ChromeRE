package defpackage;

import J.N;
import java.util.ArrayList;
import org.chromium.chrome.browser.offlinepages.ClientId;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nb2 */
/* loaded from: classes.dex */
public final class C1697Nb2 extends AbstractC0909Gz3 {
    public static final C1957Pb2 i = new C1957Pb2();
    public final InterfaceC10590uz3 h;

    public C1697Nb2(AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.h = abstractC11276wz3;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i2, int i3, Tab tab) {
        tab.v(i);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        WebContents b;
        OfflinePageBridge a = OfflinePageBridge.a(((AbstractC11276wz3) this.h).j(tab.isIncognito()).b());
        if (a == null || (b = tab.b()) == null) {
            return;
        }
        N.MIDiWOi_(a.a, a, b);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        OfflinePageBridge a = OfflinePageBridge.a(((AbstractC11276wz3) this.h).j(tab.isIncognito()).b());
        if (a == null) {
            return;
        }
        ClientId clientId = new ClientId("last_n", Integer.toString(tab.getId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(clientId);
        C1567Mb2 c1567Mb2 = new C1567Mb2();
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = ((ClientId) arrayList.get(i2)).a;
            strArr2[i2] = ((ClientId) arrayList.get(i2)).b;
        }
        N.Mwp3hyBt(a.a, a, strArr, strArr2, c1567Mb2);
    }
}
