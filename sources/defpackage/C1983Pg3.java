package defpackage;

import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983Pg3 {
    public int a;
    public int b;
    public final c c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final k h;

    public C1983Pg3(int i, int i2, k kVar, QF qf) {
        c cVar = kVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = cVar;
        qf.a(new C2113Qg3(this));
        this.h = kVar;
    }

    public final void d() {
        int i = this.b;
        k kVar = this.h;
        if (i != 2) {
            if (i == 3) {
                kVar.c.C0().clearFocus();
                return;
            }
            return;
        }
        c cVar = kVar.c;
        View findFocus = cVar.L.findFocus();
        if (findFocus != null) {
            cVar.I().m = findFocus;
        }
        View C0 = this.c.C0();
        if (C0.getParent() == null) {
            kVar.b();
            C0.setAlpha(0.0f);
        }
        if (C0.getAlpha() == 0.0f && C0.getVisibility() == 0) {
            C0.setVisibility(4);
        }
        NS0 ns0 = cVar.O;
        C0.setAlpha(ns0 == null ? 1.0f : ns0.l);
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(this.e).iterator();
        while (it.hasNext()) {
            QF qf = (QF) it.next();
            synchronized (qf) {
                if (!qf.a) {
                    qf.a = true;
                    qf.c = true;
                    PF pf = qf.b;
                    if (pf != null) {
                        try {
                            pf.onCancel();
                        } catch (Throwable th) {
                            synchronized (qf) {
                                qf.c = false;
                                qf.notifyAll();
                                throw th;
                            }
                        }
                    }
                    synchronized (qf) {
                        qf.c = false;
                        qf.notifyAll();
                    }
                }
            }
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC2503Tg3.d(this.a) + "} {mLifecycleImpact = " + AbstractC2243Rg3.a(this.b) + "} {mFragment = " + this.c + "}";
    }

    public final void c(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            if (this.a != 1) {
                this.a = i;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.a = 1;
                this.b = 3;
                return;
            }
            if (this.a == 1) {
                this.a = 2;
                this.b = 2;
            }
        }
    }

    public final void b() {
        if (!this.g) {
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }
}
