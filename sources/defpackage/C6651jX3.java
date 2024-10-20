package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jX3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6651jX3 implements Z40, InterfaceC9536rv {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final C4552dQ0 d;
    public final C4552dQ0 e;
    public final C4552dQ0 f;

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
    }

    public C6651jX3(AbstractC11937yv abstractC11937yv, C11318x63 c11318x63) {
        c11318x63.getClass();
        this.a = c11318x63.e;
        this.c = c11318x63.a;
        AbstractC11251wv a = c11318x63.b.a();
        this.d = (C4552dQ0) a;
        AbstractC11251wv a2 = c11318x63.c.a();
        this.e = (C4552dQ0) a2;
        AbstractC11251wv a3 = c11318x63.d.a();
        this.f = (C4552dQ0) a3;
        abstractC11937yv.e(a);
        abstractC11937yv.e(a2);
        abstractC11937yv.e(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC9536rv) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(InterfaceC9536rv interfaceC9536rv) {
        this.b.add(interfaceC9536rv);
    }
}
