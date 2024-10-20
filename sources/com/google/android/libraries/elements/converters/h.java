package com.google.android.libraries.elements.converters;

import android.util.SparseArray;
import defpackage.BY;
import defpackage.C10200tr1;
import defpackage.C10223tv0;
import defpackage.C11606xx0;
import defpackage.C3975bk0;
import defpackage.C5872hF0;
import defpackage.C7262lI1;
import defpackage.C7849n00;
import defpackage.EnumC8123no0;
import defpackage.IX;
import defpackage.InterfaceC6457ix0;
import defpackage.InterfaceC6801jx0;
import defpackage.InterfaceC7145kx0;
import defpackage.InterfaceC7489lx0;
import defpackage.InterfaceC7833mx0;
import defpackage.InterfaceC8177nx0;
import defpackage.KX;
import defpackage.QX;
import defpackage.RX;
import defpackage.SV;
import defpackage.TL2;
import defpackage.TZ;
import defpackage.WZ;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class h implements InterfaceC8177nx0 {
    public static final boolean w = Boolean.getBoolean("force_elements_view_materialization");
    public final boolean b;
    public final boolean c;
    public TZ d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public C5872hF0 p;
    public SparseArray q;
    public EnumMap r;
    public final Object a = new Object();
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;

    public h(C7262lI1 c7262lI1, boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final TZ l() {
        return this.d;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final WZ r(C7849n00 c7849n00) {
        TZ tz;
        WZ d;
        synchronized (this.a) {
            v();
            this.u = true;
            if (!this.v || this.b) {
                TZ tz2 = this.d;
                C5872hF0 c5872hF0 = this.p;
                tz = tz2;
                if (c5872hF0 != null) {
                    boolean z = tz2 instanceof SV;
                    tz = tz2;
                    if (z) {
                        ((SV) tz2).i.L = c5872hF0;
                        tz = tz2;
                    }
                }
            } else {
                TZ tz3 = this.d;
                C5872hF0 c5872hF02 = this.p;
                if (c5872hF02 != null && (tz3 instanceof SV)) {
                    ((SV) tz3).i.L = c5872hF02;
                }
                ArrayList arrayList = this.i;
                if (arrayList != null && !arrayList.isEmpty() && (tz3 instanceof SV)) {
                    ((SV) tz3).i.M = true;
                }
                int i = j.T;
                C11606xx0 c11606xx0 = new C11606xx0();
                j jVar = new j();
                c11606xx0.m(c7849n00, 0, 0, jVar);
                c11606xx0.i = jVar;
                c11606xx0.k.clear();
                c11606xx0.i.D = tz3 == null ? null : tz3.d();
                c11606xx0.k.set(0);
                ArrayList arrayList2 = this.e;
                j jVar2 = c11606xx0.i;
                jVar2.N = arrayList2;
                jVar2.M = this.g;
                jVar2.G = this.h;
                jVar2.S = this.i;
                jVar2.L = this.c;
                jVar2.R = this.k;
                jVar2.P = this.l;
                jVar2.Q = this.m;
                jVar2.O = this.n;
                jVar2.I = this.j;
                jVar2.H = null;
                jVar2.E = this.o;
                jVar2.F = this.f;
                jVar2.f11500J = this.s;
                jVar2.K = this.t;
                tz = c11606xx0;
            }
            if (w) {
                ((BY) tz.h.b0()).m = true;
                tz.k();
            }
            SparseArray sparseArray = this.q;
            if (sparseArray != null) {
                C3975bk0 U1 = ((BY) tz.h.b0()).U1();
                U1.N |= 4;
                U1.i = sparseArray;
                tz.k();
            }
            d = tz.d();
        }
        return d;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 b(InterfaceC7145kx0 interfaceC7145kx0) {
        synchronized (this.a) {
            v();
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(interfaceC7145kx0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 i(KX kx) {
        synchronized (this.a) {
            v();
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(kx);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 e(InterfaceC6801jx0 interfaceC6801jx0) {
        synchronized (this.a) {
            v();
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(interfaceC6801jx0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 c(InterfaceC7833mx0 interfaceC7833mx0) {
        synchronized (this.a) {
            v();
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(interfaceC7833mx0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 h(InterfaceC7833mx0 interfaceC7833mx0) {
        synchronized (this.a) {
            v();
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(interfaceC7833mx0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 d(InterfaceC6457ix0 interfaceC6457ix0) {
        synchronized (this.a) {
            v();
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.add(interfaceC6457ix0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 p(QX qx) {
        synchronized (this.a) {
            v();
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(qx);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 a(InterfaceC7489lx0 interfaceC7489lx0) {
        synchronized (this.a) {
            v();
            if (this.l == null) {
                this.l = new ArrayList();
            }
            this.l.add(interfaceC7489lx0);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 k(RX rx) {
        synchronized (this.a) {
            v();
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(rx);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 t(IX ix) {
        synchronized (this.a) {
            v();
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(ix);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 q(C10200tr1 c10200tr1) {
        synchronized (this.a) {
            v();
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(c10200tr1);
            this.v = true;
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 g(int i, String str) {
        synchronized (this.a) {
            v();
            if (this.q == null) {
                this.q = new SparseArray();
            }
            this.q.put(i, str);
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 m(EnumC8123no0 enumC8123no0, C10223tv0 c10223tv0) {
        synchronized (this.a) {
            v();
            if (this.r == null) {
                this.r = new EnumMap(EnumC8123no0.class);
            }
            this.r.put((EnumMap) enumC8123no0, (EnumC8123no0) c10223tv0);
        }
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 o() {
        this.s = true;
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 setChecked(boolean z) {
        this.t = z;
        return this;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final InterfaceC8177nx0 j(C5872hF0 c5872hF0) {
        this.p = c5872hF0;
        return this;
    }

    public final void v() {
        if (this.u) {
            throw new IllegalStateException("Element already built!");
        }
    }

    @Override // defpackage.InterfaceC8177nx0
    public final boolean f() {
        ArrayList arrayList = this.e;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final boolean n() {
        ArrayList arrayList = this.f;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final boolean s() {
        ArrayList arrayList = this.g;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // defpackage.InterfaceC8177nx0
    public final Map u() {
        EnumMap enumMap = this.r;
        return enumMap == null ? TL2.l : enumMap;
    }
}
