package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cA3 */
/* loaded from: classes.dex */
public final class C4131cA3 implements InterfaceC8876pz3 {
    public final /* synthetic */ C9284rA3 a;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void R(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Z(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void a0(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    public C4131cA3(C9284rA3 c9284rA3) {
        this.a = c9284rA3;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        C8942qA3 c8942qA3;
        HashMap hashMap = AbstractC4368cs2.m;
        tab.E(false);
        C10307u93 c10307u93 = (C10307u93) tab.F().b(C10307u93.class);
        if (c10307u93 != null) {
            c10307u93.s.p(Boolean.FALSE);
        }
        C9284rA3 c9284rA3 = this.a;
        c9284rA3.f.remove(tab);
        ArrayDeque arrayDeque = c9284rA3.h;
        int id = tab.getId();
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8942qA3 = null;
                break;
            } else {
                c8942qA3 = (C8942qA3) it.next();
                if (c8942qA3.a == id) {
                    break;
                }
            }
        }
        arrayDeque.remove(c8942qA3);
        if (C9284rA3.i() || C9284rA3.h()) {
            c9284rA3.g.remove(tab);
        }
        C8256oA3 c8256oA3 = c9284rA3.j;
        if (c8256oA3 != null && c8256oA3.a.a == tab.getId()) {
            C8256oA3 c8256oA32 = c9284rA3.j;
            C6536jA3 c6536jA3 = c8256oA32.b;
            if (c6536jA3 != null) {
                c6536jA3.a(false);
            }
            c8256oA32.c.a();
            c9284rA3.j = null;
            c9284rA3.k();
        }
        C7568mA3 c7568mA3 = c9284rA3.k;
        if (c7568mA3 != null && c7568mA3.i == tab.getId()) {
            c9284rA3.k.a(false);
            c9284rA3.k = null;
            c9284rA3.r();
        }
        c9284rA3.d(QA3.a(tab.getId(), tab.isIncognito()), false);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        this.a.s();
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void V(boolean z) {
        C9284rA3 c9284rA3 = this.a;
        if (z) {
            c9284rA3.o = true;
        } else {
            c9284rA3.n = true;
        }
    }
}
