package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cm */
/* loaded from: classes.dex */
public final class C4329cm extends AbstractC7159l implements InterfaceC9091qd4 {
    public final CS d;
    public final HashMap e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ C4673dm i;

    @Override // defpackage.InterfaceC9091qd4
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9091qd4
    public final /* synthetic */ void e(int i, int i2) {
    }

    @Override // defpackage.InterfaceC9091qd4
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void d(int i, int i2) {
        h(new Cdo(6), new G74(i, i2, this.i.c));
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void f() {
        h(new Cdo(3), null);
        this.g = false;
    }

    public final void i() {
        Cdo cdo = new Cdo(5);
        C4673dm c4673dm = this.i;
        h(cdo, new C4636df4(c4673dm.c.getWidth(), c4673dm.c.getHeight()));
        if (this.h) {
            return;
        }
        this.h = true;
        Cdo cdo2 = new Cdo(7);
        SD0 sd0 = (SD0) TD0.n.j();
        VD0 vd0 = (VD0) this.d.a.e.get();
        if (sd0.h) {
            sd0.l();
            sd0.h = false;
        }
        TD0 td0 = (TD0) sd0.g;
        td0.getClass();
        vd0.getClass();
        td0.k = vd0;
        td0.j = 1 | td0.j;
        h(cdo2, new C11411xO2((TD0) sd0.j()));
    }

    public C4329cm(C4673dm c4673dm, CS cs, boolean z) {
        this.i = c4673dm;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.f = false;
        this.h = false;
        this.d = cs;
        this.g = z;
        C3304Zl c3304Zl = new C3304Zl(this);
        C9961t90 c9961t90 = this.a;
        if (c9961t90 != null) {
            c9961t90.f = c3304Zl;
            c9961t90.b.b = c3304Zl;
        }
        if (c9961t90 != null) {
            if (c9961t90.f == null) {
                Log.e("t90", "Cannot initialize event listeners without executor.");
            } else {
                c9961t90.a(new Cdo(4), new C8933q90(c9961t90));
                c9961t90.a(new Cdo(5), new C9275r90(c9961t90));
                c9961t90.a(new Cdo(3), new C8247o90(c9961t90));
                c9961t90.a(new Cdo(8), new C9618s90(c9961t90));
                c9961t90.a(new Cdo(7), new C8590p90(c9961t90));
            }
        }
        C3986bm c3986bm = new C3986bm(this, cs);
        C7580mD0 c7580mD0 = this.b;
        if (c7580mD0 != null) {
            c7580mD0.b = c3986bm;
        }
        RecyclerView recyclerView = c4673dm.c;
        C2394Sl c2394Sl = new C2394Sl(recyclerView, hashMap);
        c2394Sl.a = this.c;
        C9961t90 c9961t902 = this.a;
        if (c9961t902 != null && c9961t902.e == null) {
            c9961t902.e = c2394Sl;
            c9961t902.d = new F74(c9961t902.a, c2394Sl);
            c9961t902.a(new Cdo(2), c9961t902.d);
            c9961t902.a(new Cdo(6), c9961t902.d);
        }
        C9961t90 c9961t903 = this.a;
        if (c9961t903 != null && recyclerView != null) {
            recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7903n90(c9961t903));
        }
        c4673dm.e.a.add(this);
        if (z) {
            i();
        }
    }

    public final void j() {
        if (this.g) {
            h(new Cdo(3), null);
        }
        this.i.a.execute(new Runnable() { // from class: am
            @Override // java.lang.Runnable
            public final void run() {
                C4329cm c4329cm = C4329cm.this;
                C9961t90 c9961t90 = c4329cm.a;
                for (Map.Entry entry : c9961t90.c.entrySet()) {
                    for (AbstractC3219Yu abstractC3219Yu : (List) entry.getValue()) {
                        XD0 xd0 = c9961t90.b;
                        Cdo cdo = (Cdo) entry.getKey();
                        synchronized (xd0) {
                            Collection collection = (Collection) xd0.a.a().get(cdo);
                            if (collection != null) {
                                collection.remove(abstractC3219Yu);
                            }
                        }
                    }
                    ((List) entry.getValue()).clear();
                }
                c9961t90.c.clear();
                c9961t90.d = null;
                c9961t90.e = null;
                c4329cm.a = null;
                c4329cm.c = null;
                C7580mD0 c7580mD0 = c4329cm.b;
                c7580mD0.a = false;
                c7580mD0.e();
                c7580mD0.f = null;
                c7580mD0.g = null;
                c7580mD0.b = null;
                c4329cm.b = null;
                c4329cm.i.e.a.remove(c4329cm);
                c4329cm.g = false;
                c4329cm.e.clear();
            }
        });
    }

    public final void h(Cdo cdo, InterfaceC9040qU1 interfaceC9040qU1) {
        C9961t90 c9961t90;
        if (this.g && (c9961t90 = this.a) != null) {
            c9961t90.b.a(cdo, interfaceC9040qU1);
        }
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void c() {
        this.g = true;
        i();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.i.a.execute(new RunnableC3044Xl(this));
    }
}
