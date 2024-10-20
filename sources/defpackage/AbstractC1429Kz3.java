package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kz3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1429Kz3 extends BA0 {
    public final InterfaceC10590uz3 a;
    public final C1299Jz3 g;
    public final SparseArray h = new SparseArray();

    public void V0(int i, Tab tab) {
    }

    public void W0(Tab tab) {
    }

    public void X0(Tab tab) {
    }

    public void Y0(Tab tab, long j) {
    }

    public AbstractC1429Kz3(InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC10590uz3;
        this.g = new C1299Jz3(this, interfaceC10590uz3);
    }

    public void destroy() {
        C1299Jz3 c1299Jz3 = this.g;
        c1299Jz3.a();
        ArrayList arrayList = ((AbstractC11276wz3) this.a).a;
        for (int i = 0; i < arrayList.size(); i++) {
            TabModel tabModel = (TabModel) arrayList.get(i);
            tabModel.i(c1299Jz3);
            InterfaceC1548Lx3 h = tabModel.h();
            for (int i2 = 0; i2 < h.getCount(); i2++) {
                Tab tabAt = h.getTabAt(i2);
                tabAt.w(this);
                if (tabAt.isInitialized()) {
                    C1695Nb0.m(tabAt).y.d(this);
                }
                X0(tabAt);
            }
        }
    }
}
