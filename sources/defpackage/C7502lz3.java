package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lz3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7502lz3 implements InterfaceC0259Bz3 {
    public List a = Collections.emptyList();
    public final ArrayList g = new ArrayList();

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
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

    public final void b(InterfaceC8876pz3 interfaceC8876pz3) {
        if (this.a.isEmpty()) {
            this.g.add(interfaceC8876pz3);
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            ((AbstractC7158kz3) this.a.get(i)).g.a(interfaceC8876pz3);
        }
    }

    public final void f(InterfaceC8876pz3 interfaceC8876pz3) {
        if (this.a.isEmpty()) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                arrayList.remove(interfaceC8876pz3);
                return;
            }
        }
        for (int i = 0; i < this.a.size(); i++) {
            ((AbstractC7158kz3) this.a.get(i)).g.d(interfaceC8876pz3);
        }
    }

    public final AbstractC7158kz3 e(boolean z) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((AbstractC7158kz3) this.a.get(i)).isIncognito() == z) {
                return (AbstractC7158kz3) this.a.get(i);
            }
        }
        return null;
    }

    public final AbstractC7158kz3 d() {
        for (int i = 0; i < this.a.size(); i++) {
            if (((AbstractC7158kz3) this.a.get(i)).a.isActiveModel()) {
                return (AbstractC7158kz3) this.a.get(i);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC7158kz3) it.next()).i = true;
        }
    }
}
