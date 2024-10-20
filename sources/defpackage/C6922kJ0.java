package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kJ0 */
/* loaded from: classes.dex */
public final class C6922kJ0 extends DK2 implements InterfaceC7610mJ0 {
    public static final TL2 s;
    public final C6622jS a;
    public boolean h;
    public int i;
    public int j;
    public C2800Vo0 k;
    public int l;
    public C1495Ln m;
    public final C12114zS o;
    public C6578jJ0 p;
    public long q;
    public int r;
    public final HashMap g = new HashMap();
    public final ArrayList n = new ArrayList();

    static {
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        Integer valueOf = Integer.valueOf(AbstractC2629Ug.a.b());
        C3019Xg c3019Xg = AbstractC2629Ug.b;
        c0822Gi1.b(valueOf, new C4629de3(Integer.valueOf(c3019Xg.b())));
        C3019Xg c3019Xg2 = AbstractC2629Ug.s;
        c0822Gi1.b(Integer.valueOf(c3019Xg2.b()), new C4629de3(Integer.valueOf(c3019Xg2.b())));
        Integer valueOf2 = Integer.valueOf(c3019Xg.b());
        C3019Xg c3019Xg3 = AbstractC2629Ug.c;
        Integer valueOf3 = Integer.valueOf(c3019Xg3.b());
        C2889Wg c2889Wg = AbstractC2629Ug.g;
        c0822Gi1.b(valueOf2, AbstractC1472Li1.r(valueOf3, Integer.valueOf(c2889Wg.a())));
        Integer valueOf4 = Integer.valueOf(c3019Xg3.b());
        C3019Xg c3019Xg4 = AbstractC2629Ug.d;
        Integer valueOf5 = Integer.valueOf(c3019Xg4.b());
        C3019Xg c3019Xg5 = AbstractC2629Ug.e;
        c0822Gi1.b(valueOf4, AbstractC1472Li1.s(valueOf5, Integer.valueOf(c3019Xg5.b()), Integer.valueOf(c2889Wg.a())));
        Integer valueOf6 = Integer.valueOf(c3019Xg4.b());
        C3019Xg c3019Xg6 = AbstractC2629Ug.j;
        c0822Gi1.b(valueOf6, AbstractC1472Li1.r(Integer.valueOf(c3019Xg6.b()), Integer.valueOf(c2889Wg.a())));
        Integer valueOf7 = Integer.valueOf(c3019Xg6.b());
        C3019Xg c3019Xg7 = AbstractC2629Ug.k;
        c0822Gi1.b(valueOf7, AbstractC1472Li1.r(Integer.valueOf(c3019Xg7.b()), Integer.valueOf(c2889Wg.a())));
        c0822Gi1.b(Integer.valueOf(c3019Xg7.b()), AbstractC1472Li1.r(Integer.valueOf(c3019Xg5.b()), Integer.valueOf(c2889Wg.a())));
        Integer valueOf8 = Integer.valueOf(c3019Xg5.b());
        C3019Xg c3019Xg8 = AbstractC2629Ug.f;
        Integer valueOf9 = Integer.valueOf(c3019Xg8.b());
        C3019Xg c3019Xg9 = AbstractC2629Ug.h;
        c0822Gi1.b(valueOf8, AbstractC1472Li1.s(valueOf9, Integer.valueOf(c3019Xg9.b()), Integer.valueOf(c2889Wg.a())));
        c0822Gi1.b(Integer.valueOf(c3019Xg8.b()), AbstractC1472Li1.r(Integer.valueOf(c3019Xg9.b()), Integer.valueOf(c2889Wg.a())));
        Integer valueOf10 = Integer.valueOf(c3019Xg9.b());
        C3019Xg c3019Xg10 = AbstractC2629Ug.i;
        c0822Gi1.b(valueOf10, AbstractC1472Li1.r(Integer.valueOf(c3019Xg10.b()), Integer.valueOf(c2889Wg.a())));
        c0822Gi1.b(Integer.valueOf(c3019Xg10.b()), new C4629de3(Integer.valueOf(c2889Wg.a())));
        s = c0822Gi1.a(true);
    }

    public C6922kJ0(C6622jS c6622jS, C12114zS c12114zS) {
        this.a = c6622jS;
        this.o = c12114zS;
    }

    public final void u() {
        this.g.clear();
        this.n.clear();
        this.h = false;
        this.m = null;
        C12114zS c12114zS = this.o;
        synchronized (c12114zS) {
            c12114zS.a = null;
        }
        this.p = null;
        this.q = 0L;
        this.r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [Rg] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Rg] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Sg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kJ0] */
    @Override // defpackage.InterfaceC7610mJ0
    public final void n(int i, int i2) {
        this.j = i;
        this.l = i2;
        int i3 = this.i;
        C6492j31 c6492j31 = C6622jS.b;
        C2410So0 c2410So0 = (C2410So0) C2800Vo0.m.j();
        int i4 = 3;
        int i5 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 0 : 3 : 2 : 1;
        if (c2410So0.h) {
            c2410So0.l();
            c2410So0.h = false;
        }
        C2800Vo0 c2800Vo0 = (C2800Vo0) c2410So0.g;
        c2800Vo0.getClass();
        c2800Vo0.k = AbstractC2373Sg3.b(i5);
        c2800Vo0.j |= 1;
        if (i == 0) {
            i4 = 1;
        } else if (i == 1) {
            i4 = 2;
        } else if (i != 2) {
            i4 = 0;
        }
        if (c2410So0.h) {
            c2410So0.l();
            c2410So0.h = false;
        }
        C2800Vo0 c2800Vo02 = (C2800Vo0) c2410So0.g;
        c2800Vo02.getClass();
        c2800Vo02.l = AbstractC2373Sg3.b(i4);
        c2800Vo02.j |= 2;
        this.k = (C2800Vo0) c2410So0.j();
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ?? r0 = (InterfaceC2239Rg) it.next();
            C2369Sg c2369Sg = (C2369Sg) r0;
            if (c2369Sg.a.a.a == AbstractC2629Ug.a.b()) {
                if (this.j == 2) {
                    r0 = AbstractC2629Ug.t.a();
                    r0.j = c2369Sg.j;
                    r0.i = true;
                }
            }
            v(r0);
        }
        arrayList.clear();
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final boolean g() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void p(long j) {
        C2369Sg a;
        if (!this.h) {
            w();
        }
        if (this.j == 2) {
            a = AbstractC2629Ug.u.a();
        } else {
            a = AbstractC2629Ug.s.a();
        }
        t(a, j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void k(long j) {
        C2369Sg a;
        if (this.h) {
            return;
        }
        w();
        if (this.j == 2) {
            a = AbstractC2629Ug.v.a();
        } else {
            a = AbstractC2629Ug.b.a();
        }
        t(a, j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void b(int i, long j) {
        C2369Sg a;
        if (this.h) {
            return;
        }
        w();
        this.j = i;
        if (i == 2) {
            a = AbstractC2629Ug.w.a();
        } else {
            a = AbstractC2629Ug.x.a();
        }
        t(a, j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void d(long j) {
        if (this.h) {
            return;
        }
        w();
        t(AbstractC2629Ug.c.a(), j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void o(long j) {
        t(AbstractC2629Ug.j.a(), j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void q(long j, int i) {
        C2369Sg c2369Sg = new C2369Sg(AbstractC2629Ug.k.a);
        c2369Sg.e = new C3242Yy2(Integer.valueOf(i));
        c2369Sg.f = new C3242Yy2("DISCOVER_CACHE_READ");
        t(c2369Sg, j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void h(long j) {
        t(AbstractC2629Ug.d.a(), j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void a(long j) {
        t(AbstractC2629Ug.e.a(), j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void e(int i, long j) {
        C2369Sg c2369Sg = new C2369Sg(AbstractC2629Ug.f.a);
        c2369Sg.e = new C3242Yy2(Integer.valueOf(i));
        c2369Sg.f = new C3242Yy2("DISCOVER_ATF_RENDER");
        t(c2369Sg, j);
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final BJ0 m(int i) {
        HashMap hashMap = this.g;
        AJ0 aj0 = (AJ0) hashMap.get(Integer.valueOf(i));
        if (aj0 != null) {
            return aj0;
        }
        AJ0 aj02 = new AJ0(this.a, i, this.k);
        hashMap.put(Integer.valueOf(i), aj02);
        return aj02;
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void c(int i, long j) {
        int i2 = this.r;
        if (i2 != 0) {
            j = this.q;
            i = AbstractC3060Xo0.a(i2);
            j();
        }
        C2369Sg c2369Sg = new C2369Sg(AbstractC2629Ug.g.a);
        c2369Sg.e = new C3242Yy2(Integer.valueOf(i));
        c2369Sg.f = new C3242Yy2("DISCOVER_LAUNCH");
        for (AJ0 aj0 : this.g.values()) {
            aj0.getClass();
            C6492j31 c6492j31 = C6622jS.b;
            c2369Sg.c("request_id", Integer.toString(aj0.b));
        }
        t(c2369Sg, j);
        u();
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void f(int i, long j) {
        int i2;
        if (this.r == 0) {
            this.q = j;
            switch (i) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = 4;
                    break;
                case 4:
                case 45:
                default:
                    i2 = 0;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i2 = 21;
                    break;
                case 6:
                    i2 = 43;
                    break;
                case 7:
                    i2 = 22;
                    break;
                case 8:
                    i2 = 23;
                    break;
                case 9:
                    i2 = 42;
                    break;
                case 10:
                    i2 = 24;
                    break;
                case 11:
                    i2 = 38;
                    break;
                case 12:
                    i2 = 25;
                    break;
                case 13:
                    i2 = 26;
                    break;
                case 14:
                    i2 = 5;
                    break;
                case 15:
                    i2 = 6;
                    break;
                case 16:
                    i2 = 7;
                    break;
                case 17:
                    i2 = 8;
                    break;
                case 18:
                    i2 = 9;
                    break;
                case 19:
                    i2 = 10;
                    break;
                case 20:
                    i2 = 11;
                    break;
                case 21:
                    i2 = 12;
                    break;
                case 22:
                    i2 = 13;
                    break;
                case 23:
                    i2 = 14;
                    break;
                case 24:
                    i2 = 15;
                    break;
                case 25:
                    i2 = 16;
                    break;
                case 26:
                    i2 = 17;
                    break;
                case 27:
                    i2 = 18;
                    break;
                case 28:
                    i2 = 19;
                    break;
                case 29:
                    i2 = 20;
                    break;
                case 30:
                    i2 = 37;
                    break;
                case 31:
                    i2 = 27;
                    break;
                case 32:
                    i2 = 28;
                    break;
                case 33:
                    i2 = 29;
                    break;
                case 34:
                    i2 = 30;
                    break;
                case 35:
                    i2 = 44;
                    break;
                case 36:
                    i2 = 45;
                    break;
                case 37:
                    i2 = 46;
                    break;
                case 38:
                    i2 = 47;
                    break;
                case 39:
                    i2 = 48;
                    break;
                case 40:
                    i2 = 49;
                    break;
                case 41:
                    i2 = 50;
                    break;
                case 42:
                    i2 = 51;
                    break;
                case 43:
                    i2 = 39;
                    break;
                case 44:
                    i2 = 41;
                    break;
                case 46:
                    i2 = 31;
                    break;
                case 47:
                    i2 = 32;
                    break;
                case 48:
                    i2 = 33;
                    break;
                case 49:
                    i2 = 34;
                    break;
                case 50:
                    i2 = 35;
                    break;
                case 51:
                    i2 = 36;
                    break;
                case 52:
                    i2 = 40;
                    break;
            }
            this.r = i2;
        }
    }

    @Override // defpackage.InterfaceC7610mJ0
    public final void j() {
        this.q = 0L;
        this.r = 0;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        C6578jJ0 c6578jJ0;
        if (this.h && (c6578jJ0 = this.p) != null && i == 1) {
            c6578jJ0.d = c6578jJ0.b.isEmpty();
        }
    }

    public final void w() {
        this.h = true;
        C6578jJ0 c6578jJ0 = new C6578jJ0(this);
        this.p = c6578jJ0;
        C12114zS c12114zS = this.o;
        synchronized (c12114zS) {
            c12114zS.a = c6578jJ0;
        }
    }

    public final void t(C2369Sg c2369Sg, long j) {
        C1495Ln b = c2369Sg.b();
        C1495Ln c1495Ln = this.m;
        this.a.getClass();
        C6622jS.a(c1495Ln, b, s);
        this.m = b;
        c2369Sg.j = j;
        c2369Sg.i = true;
        if (this.j != 0) {
            v(c2369Sg);
        } else {
            this.n.add(c2369Sg);
        }
    }

    public final void v(InterfaceC2239Rg interfaceC2239Rg) {
        C2369Sg c2369Sg = (C2369Sg) interfaceC2239Rg;
        c2369Sg.c("flow_id", this.l + "," + this.j);
        this.a.b(c2369Sg, this.k);
    }
}
