package defpackage;

import android.content.Context;
import androidx.appcompat.app.a;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q04 implements InterfaceC0679Ff3 {
    public final Context a;
    public final InterfaceC10590uz3 g;
    public final ViewOnClickListenerC1069If3 h;
    public final M04 i;
    public final N04 j;
    public final O04 k;

    @Override // defpackage.InterfaceC0679Ff3
    public final /* synthetic */ void a(Object obj) {
    }

    public Q04(a aVar, InterfaceC10590uz3 interfaceC10590uz3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.a = aVar;
        this.g = interfaceC10590uz3;
        this.h = viewOnClickListenerC1069If3;
        M04 m04 = new M04(this);
        this.i = m04;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        ((C1024Hw3) abstractC11276wz3.c.e(false)).Q(m04);
        ((C1024Hw3) abstractC11276wz3.c.e(true)).Q(m04);
        N04 n04 = new N04(this);
        this.j = n04;
        abstractC11276wz3.c(n04);
        this.k = new O04(this, interfaceC10590uz3);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        List list = (List) obj;
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) this.g).c.d();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            P04 p04 = (P04) list.get(size);
            Tab tab = p04.a;
            c1024Hw3.getClass();
            if (tab.isInitialized()) {
                int id = tab.getId();
                TabModel tabModel = c1024Hw3.a;
                int d = AbstractC1558Lz3.d(tabModel, id);
                C1024Hw3.j0(p04.c, tab);
                int i = p04.b;
                if (d == i) {
                    c1024Hw3.Y(i, d, tab);
                } else {
                    if (d < i) {
                        i++;
                    }
                    tabModel.t(tab.getId(), i);
                }
            }
        }
    }
}
