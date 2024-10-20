package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;
import org.chromium.chrome.browser.toolbar.top.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: se2 */
/* loaded from: classes2.dex */
public final class C9780se2 {
    public final Q44 a;
    public final HashMap b;
    public InterfaceC9295rD c;
    public final List d;
    public final d e;
    public final InterfaceC0079Ap3 f;

    public C9780se2(List list, Q44 q44, d dVar, C11089wS3 c11089wS3) {
        this.d = list;
        this.a = q44;
        this.e = dVar;
        this.f = c11089wS3;
        this.b = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final InterfaceC9295rD interfaceC9295rD = (InterfaceC9295rD) it.next();
            InterfaceC8953qD interfaceC8953qD = new InterfaceC8953qD() { // from class: re2
                @Override // defpackage.InterfaceC8953qD
                public final void b(boolean z) {
                    C9780se2 c9780se2 = C9780se2.this;
                    InterfaceC9295rD interfaceC9295rD2 = c9780se2.c;
                    InterfaceC9295rD interfaceC9295rD3 = interfaceC9295rD;
                    if (interfaceC9295rD3 != interfaceC9295rD2) {
                        if (z) {
                            c9780se2.a();
                            return;
                        }
                        return;
                    }
                    C8610pD h = interfaceC9295rD3.h((Tab) c9780se2.f.get());
                    d dVar2 = c9780se2.e;
                    if (h != null && h.a) {
                        c9780se2.c = interfaceC9295rD3;
                        dVar2.a0(h);
                        C12180ze1 c12180ze1 = h.c.f;
                        if (c12180ze1 == null || (dVar2 instanceof ToolbarPhone)) {
                            return;
                        }
                        c9780se2.a.a(c12180ze1.a());
                        return;
                    }
                    dVar2.m();
                    c9780se2.c = null;
                    c9780se2.a();
                }
            };
            interfaceC9295rD.j(interfaceC8953qD);
            this.b.put(interfaceC9295rD, interfaceC8953qD);
        }
    }

    public final void a() {
        List list = this.d;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d dVar = this.e;
            if (hasNext) {
                InterfaceC9295rD interfaceC9295rD = (InterfaceC9295rD) it.next();
                C8610pD h = interfaceC9295rD.h((Tab) this.f.get());
                if (h != null && h.a) {
                    if (interfaceC9295rD == this.c) {
                        return;
                    }
                    this.c = interfaceC9295rD;
                    dVar.a0(h);
                    C12180ze1 c12180ze1 = h.c.f;
                    if (c12180ze1 == null || (dVar instanceof ToolbarPhone)) {
                        return;
                    }
                    this.a.a(c12180ze1.a());
                    return;
                }
            } else {
                dVar.m();
                this.c = null;
                return;
            }
        }
    }
}
