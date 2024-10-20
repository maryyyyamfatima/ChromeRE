package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CG3 implements InterfaceC12058zG3 {
    public final Object b;
    public final int c;
    public final QM3 d;
    public final QM3 e;
    public final QM3 f;
    public final InterfaceC10363uK3 g;
    public final int h;
    public final Executor i;
    public final InterfaceC5862hD0 j;
    public final String k;
    public final ArrayList l;
    public final SM3 m;
    public final AtomicReference n;

    public CG3(int i, String str, int i2, Vr4 vr4, SM3 sm3, Executor executor, InterfaceC5862hD0 interfaceC5862hD0) {
        C9677sK3 c9677sK3 = InterfaceC10363uK3.a;
        this.b = new Object();
        this.h = i2;
        this.i = executor;
        this.j = interfaceC5862hD0;
        this.d = new QM3(vr4);
        this.e = new QM3(vr4);
        this.f = new QM3(vr4);
        this.g = c9677sK3;
        this.l = new ArrayList();
        this.c = i;
        this.m = sm3;
        this.k = str;
        this.n = new AtomicReference();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void f() {
        this.d.b();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void i() {
        this.e.d();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void a() {
        this.e.b();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void e() {
        this.f.d();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void c() {
        this.f.b();
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void h(long j) {
        synchronized (this.b) {
            this.l.add(new BG3(j, ((C9677sK3) this.g).a()));
        }
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void b(String str) {
        if (str != null) {
            AtomicReference atomicReference = this.n;
            while (!atomicReference.compareAndSet(null, str) && atomicReference.get() == null) {
            }
        }
    }

    @Override // defpackage.InterfaceC12058zG3
    public final void clear() {
        synchronized (this.b) {
            this.d.a();
            this.e.a();
            this.f.a();
            this.l.clear();
        }
    }

    @Override // defpackage.InterfaceC12058zG3
    public final synchronized void g(boolean z) {
        if (z) {
            clear();
        } else {
            this.i.execute(new Runnable() { // from class: AG3
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1472Li1 c4629de3;
                    AbstractC0562Ei1 o;
                    CG3 cg3 = CG3.this;
                    int i = cg3.c;
                    String str = (String) cg3.n.get();
                    C1370Ko c1370Ko = new C1370Ko();
                    c1370Ko.c = 1;
                    c1370Ko.d = (byte) (1 | c1370Ko.d);
                    if (str == null) {
                        int i2 = AbstractC1472Li1.h;
                        c4629de3 = UL2.o;
                    } else {
                        int i3 = AbstractC1472Li1.h;
                        c4629de3 = new C4629de3(str);
                    }
                    c1370Ko.b(c4629de3);
                    cg3.j.getClass();
                    ArrayList c = cg3.d.c("ComponentMaterialization", c1370Ko);
                    if (c.isEmpty()) {
                        return;
                    }
                    ((C1110Io) c.get(0)).e = Integer.valueOf(cg3.h);
                    int a = cg3.m.a(i, cg3.k, ((C1110Io) c.get(0)).a());
                    cg3.j.getClass();
                    cg3.j(cg3.e.c("TemplateFetching", c1370Ko), i, a);
                    cg3.j.getClass();
                    cg3.j(cg3.f.c("TemplateResolution", c1370Ko), i, a);
                    cg3.j.getClass();
                    synchronized (cg3.b) {
                        o = !cg3.l.isEmpty() ? AbstractC0562Ei1.o(cg3.l) : null;
                    }
                    if (o != null) {
                        ArrayList arrayList = new ArrayList(o.size());
                        C0172Bi1 listIterator = o.listIterator(0);
                        while (listIterator.hasNext()) {
                            BG3 bg3 = (BG3) listIterator.next();
                            C1110Io c1110Io = new C1110Io();
                            c1110Io.a = "PbToFb";
                            c1110Io.d = Long.valueOf(bg3.a);
                            c1370Ko.b = bg3.b;
                            c1110Io.f = c1370Ko.a();
                            arrayList.add(c1110Io);
                        }
                        cg3.j(arrayList, i, a);
                    }
                }
            });
        }
    }

    public final void j(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1110Io c1110Io = (C1110Io) it.next();
            c1110Io.e = Integer.valueOf(i2);
            this.m.a(i, this.k, c1110Io.a());
        }
    }
}
