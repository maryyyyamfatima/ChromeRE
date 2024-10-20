package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Xt4 {
    public Bundle a;
    public final boolean b;
    public final Ew4 c;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public Aw4 f;
    public Tt4 g;
    public Tt4 h;
    public Tt4 i;
    public Tt4 j;
    public Tt4 k;
    public Tt4 l;
    public Cv4 m;

    public Xt4(boolean z, Ew4 ew4) {
        Qt4 qt4 = Tt4.a;
        this.g = qt4;
        this.h = qt4;
        this.i = qt4;
        this.j = qt4;
        this.k = qt4;
        this.l = qt4;
        this.m = new Cv4(Boolean.class);
        this.b = z;
        this.c = ew4;
    }

    public final void a(int i) {
        C10215tt4 c10215tt4 = new C10215tt4(this, i);
        this.h = c10215tt4;
        if (this.f != null) {
            try {
                c10215tt4.a();
                this.h = Tt4.a;
            } catch (RemoteException unused) {
                Pu4.a("Problem communicating with YouTube service.", new Object[0]);
            }
        }
    }

    public final void b(Aw4 aw4) {
        this.f = aw4;
        if (aw4 != null) {
            if (this.b) {
                try {
                    ww4 ww4Var = (ww4) aw4;
                    ww4Var.h(11, ww4Var.a());
                } catch (RemoteException unused) {
                    Pu4.a("Problem setting fullscreen.", new Object[0]);
                }
            }
            Ew4 ew4 = this.c;
            if (ew4 != null) {
                try {
                    ww4 ww4Var2 = (ww4) aw4;
                    Parcel a = ww4Var2.a();
                    int i = AbstractC5419fv4.a;
                    a.writeStrongBinder(ew4.asBinder());
                    ww4Var2.h(12, a);
                } catch (RemoteException unused2) {
                    Pu4.a("Problem setting client.", new Object[0]);
                }
            }
            if (this.f != null) {
                ArrayDeque arrayDeque = this.d;
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    try {
                        ((Tt4) it.next()).a();
                    } catch (RemoteException unused3) {
                        Pu4.a("Problem communicating with YouTube service when changing sign in status.", new Object[0]);
                    }
                }
                arrayDeque.clear();
            }
            c();
            Aw4 aw42 = this.f;
            Qt4 qt4 = Tt4.a;
            if (aw42 != null) {
                try {
                    this.k.a();
                    this.k = qt4;
                } catch (RemoteException unused4) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
            e();
            if (this.f != null) {
                try {
                    this.j.a();
                    this.j = qt4;
                } catch (RemoteException unused5) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
            if (this.f != null) {
                try {
                    this.h.a();
                    this.h = qt4;
                } catch (RemoteException unused6) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
            if (this.f != null) {
                try {
                    this.l.a();
                    this.l = qt4;
                } catch (RemoteException unused7) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
            if (this.f != null) {
                ArrayDeque arrayDeque2 = this.e;
                try {
                    Iterator it2 = arrayDeque2.iterator();
                    while (it2.hasNext()) {
                        Cv4 cv4 = (Cv4) it2.next();
                        ww4 ww4Var3 = (ww4) this.f;
                        Parcel a2 = ww4Var3.a();
                        int i2 = AbstractC5419fv4.a;
                        a2.writeStrongBinder(cv4 != null ? cv4.asBinder() : null);
                        ww4Var3.h(23, a2);
                    }
                    arrayDeque2.clear();
                } catch (RemoteException unused8) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
        }
    }

    public final void c() {
        if (this.f != null) {
            try {
                this.g.a();
                this.g = Tt4.a;
                this.m = new Cv4(Boolean.class);
            } catch (RemoteException unused) {
                Pu4.a("Problem communicating with YouTube service.", new Object[0]);
            }
        }
    }

    public final void d() {
        this.g = Tt4.a;
        Cv4 cv4 = this.m;
        synchronized (cv4) {
            if (cv4.j == Boolean.class) {
                cv4.e(Boolean.FALSE);
            }
        }
        this.m = new Cv4(Boolean.class);
    }

    public final void e() {
        if (this.f != null) {
            try {
                this.i.a();
                this.i = Tt4.a;
            } catch (RemoteException unused) {
                Pu4.a("Problem communicating with YouTube service.", new Object[0]);
            }
        }
    }

    public final void f() {
        ArrayDeque arrayDeque = this.e;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Cv4 cv4 = (Cv4) it.next();
            synchronized (cv4) {
                if (cv4.j == Long.class) {
                    cv4.e(0L);
                }
            }
        }
        arrayDeque.clear();
    }
}
