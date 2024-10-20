package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class SV3 extends AbstractC6096hu {
    public final C11647y41 c;

    public abstract void f(GO2 go2);

    public SV3() {
        if (C4294cg0.f == null) {
            C5557gL c5557gL = new C5557gL();
            C4294cg0 c4294cg0 = new C4294cg0(c5557gL);
            C4294cg0.f = c4294cg0;
            c5557gL.c = c4294cg0;
        }
        C11647y41 c11647y41 = new C11647y41(C4294cg0.f);
        this.c = c11647y41;
        RV3 rv3 = new RV3(this);
        if (c11647y41.d != null) {
            throw new RuntimeException("Overriding existing listener!");
        }
        c11647y41.d = rv3;
    }

    @Override // defpackage.AbstractC6096hu
    public final void d(GO2 go2) {
        int i;
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                z = true;
                break;
            } else {
                if (!((InterfaceC12166zc) copyOnWriteArrayList.get(size)).e(this)) {
                    z = false;
                    break;
                }
                size--;
            }
        }
        if (!z) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.a;
            int size2 = copyOnWriteArrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    ((InterfaceC12166zc) copyOnWriteArrayList2.get(size2)).d(this);
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.a;
            int size3 = copyOnWriteArrayList3.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                } else {
                    ((InterfaceC12166zc) copyOnWriteArrayList3.get(size3)).b(this);
                }
            }
            f(go2);
            C11647y41 c11647y41 = this.c;
            C11304x41 c11304x41 = c11647y41.b;
            while (true) {
                ArrayList arrayList = c11304x41.a;
                if (i >= arrayList.size()) {
                    break;
                }
                M74 m74 = (M74) arrayList.get(i);
                M74 m742 = (M74) c11304x41.b.get(i);
                String str = (String) c11304x41.c.get(i);
                LinkedHashMap linkedHashMap = m742.a;
                M74 m743 = linkedHashMap == null ? null : (M74) linkedHashMap.get(str);
                if (m743 != null) {
                    C11304x41.a(m743, m742, str);
                }
                if (m74.b == null) {
                    m74.b = new ArrayList();
                }
                m74.b.add(m742);
                if (m742.a == null) {
                    m742.a = new LinkedHashMap();
                }
                m742.a.put(str, m74);
                i++;
            }
            c11647y41.f = true;
            c11647y41.e = true;
            C4294cg0 c4294cg0 = c11647y41.a;
            synchronized (c4294cg0) {
                if (!c11647y41.e) {
                    throw new RuntimeException("Expected added GraphBinding to be active: ".concat(String.valueOf(c11647y41)));
                }
                c4294cg0.b.add(c11647y41);
                c4294cg0.b(c11647y41);
                if (c4294cg0.b.size() == 1) {
                    C5557gL c5557gL = (C5557gL) c4294cg0.a;
                    if (c5557gL.c == null) {
                        throw new RuntimeException("Must set a binding graph first.");
                    }
                    if (c5557gL.d) {
                        throw new RuntimeException("Tried to start but was already running.");
                    }
                    c5557gL.d = true;
                    if (!c5557gL.e) {
                        ((C3839bL) c5557gL.a).b(c5557gL.b);
                        c5557gL.e = true;
                    }
                }
                c4294cg0.e = true;
            }
        }
    }

    @Override // defpackage.AbstractC6096hu
    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC12166zc) copyOnWriteArrayList.get(size)).a(this);
            }
        }
    }

    @Override // defpackage.AbstractC6096hu
    public final boolean b() {
        return this.c.e;
    }

    @Override // defpackage.AbstractC6096hu
    public final void e() {
        C11647y41 c11647y41 = this.c;
        if (c11647y41.e) {
            c11647y41.b();
        }
    }
}
