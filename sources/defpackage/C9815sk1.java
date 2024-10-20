package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sk1 */
/* loaded from: classes.dex */
public final class C9815sk1 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C10501uk1 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C9815sk1(C10501uk1 c10501uk1) {
        this.a = c10501uk1;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        boolean isIncognito = tabModel.isIncognito();
        Iterator it = this.a.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC10158tk1) c11814ya2.next()).b(isIncognito);
            }
        }
    }
}
