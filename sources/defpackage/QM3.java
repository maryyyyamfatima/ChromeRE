package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QM3 {
    public final Object a;
    public final Vr4 b;
    public final InterfaceC10363uK3 c;
    public volatile long d;
    public volatile boolean e;
    public final ArrayList f;
    public final ArrayList g;

    public QM3(Vr4 vr4) {
        C9677sK3 c9677sK3 = InterfaceC10363uK3.a;
        this.a = new Object();
        this.d = 0L;
        this.e = false;
        this.b = vr4;
        this.c = c9677sK3;
        this.f = new ArrayList(15);
        this.g = new ArrayList(5);
    }

    public final void d() {
        int size;
        if (this.e) {
            return;
        }
        synchronized (this.a) {
            if (!this.e && (size = this.f.size()) < 15 && size % 3 == 0) {
                this.d++;
                this.f.add(Long.valueOf(this.d));
                this.f.add(Long.valueOf(this.b.a()));
                this.g.add(((C9677sK3) this.c).a());
            }
        }
    }

    public final void b() {
        int size;
        if (this.e) {
            return;
        }
        synchronized (this.a) {
            if (!this.e && (size = this.f.size()) < 15 && size % 3 == 2) {
                this.f.add(Long.valueOf(this.b.a()));
            }
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        synchronized (this.a) {
            this.f.clear();
            this.g.clear();
            this.e = true;
        }
    }

    public final ArrayList c(String str, C1370Ko c1370Ko) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.a) {
            arrayList = new ArrayList(this.f);
            arrayList2 = new ArrayList(this.g);
            this.f.clear();
            this.g.clear();
        }
        C1110Io c1110Io = null;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                c1110Io = new C1110Io();
                if (c1370Ko == null) {
                    c1370Ko = new C1370Ko();
                    c1370Ko.c = 1;
                    c1370Ko.d = (byte) (c1370Ko.d | 1);
                    int i3 = AbstractC1472Li1.h;
                    c1370Ko.b(UL2.o);
                }
                c1370Ko.c = ((Long) arrayList.get(i)).intValue();
                c1370Ko.d = (byte) (c1370Ko.d | 1);
            } else if (i2 != 1) {
                c1110Io.a = str;
                c1110Io.c = (Long) arrayList.get(i);
                if (c1370Ko != null) {
                    c1370Ko.b = (C10020tK3) arrayList2.get(i / 3);
                    c1110Io.f = c1370Ko.a();
                }
                arrayList3.add(c1110Io);
            } else {
                c1110Io.b = (Long) arrayList.get(i);
            }
        }
        return arrayList3;
    }
}
