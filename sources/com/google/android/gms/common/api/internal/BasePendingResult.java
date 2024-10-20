package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.AbstractC10600v11;
import defpackage.AbstractC2314Rv;
import defpackage.AbstractC5737gr2;
import defpackage.C2054Pv;
import defpackage.D04;
import defpackage.HandlerC2184Qv;
import defpackage.InterfaceC5393fr2;
import defpackage.QP2;
import defpackage.RP2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends AbstractC5737gr2 {
    public static final C2054Pv n = new C2054Pv();
    public final Object a;
    public final HandlerC2184Qv b;
    public final WeakReference c;
    public final CountDownLatch d;
    public final ArrayList e;
    public RP2 f;
    public final AtomicReference g;
    public QP2 h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private AbstractC2314Rv mResultGuardian;

    public abstract QP2 e(Status status);

    public BasePendingResult(AbstractC10600v11 abstractC10600v11) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new HandlerC2184Qv(abstractC10600v11 != null ? abstractC10600v11.g() : Looper.getMainLooper());
        this.c = new WeakReference(abstractC10600v11);
    }

    public BasePendingResult(Looper looper) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new HandlerC2184Qv(looper);
        this.c = new WeakReference(null);
    }

    public final boolean h() {
        return this.d.getCount() == 0;
    }

    @Override // defpackage.AbstractC5737gr2
    public final QP2 b() {
        try {
            this.d.await();
        } catch (InterruptedException unused) {
            f(Status.l);
        }
        h();
        return g();
    }

    @Override // defpackage.AbstractC5737gr2
    public final QP2 c(long j, TimeUnit timeUnit) {
        try {
            if (!this.d.await(j, timeUnit)) {
                f(Status.n);
            }
        } catch (InterruptedException unused) {
            f(Status.l);
        }
        h();
        return g();
    }

    public final void l(RP2 rp2) {
        boolean z;
        synchronized (this.a) {
            try {
                if (rp2 == null) {
                    this.f = null;
                    return;
                }
                synchronized (this.a) {
                    z = this.k;
                }
                if (z) {
                    return;
                }
                if (h()) {
                    HandlerC2184Qv handlerC2184Qv = this.b;
                    QP2 g = g();
                    handlerC2184Qv.getClass();
                    handlerC2184Qv.sendMessage(handlerC2184Qv.obtainMessage(1, new Pair(rp2, g)));
                } else {
                    this.f = rp2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (!this.k && !this.j) {
                this.k = true;
                k(e(Status.o));
            }
        }
    }

    @Override // defpackage.InterfaceC8851pv
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void a(QP2 qp2) {
        synchronized (this.a) {
            if (this.l || this.k) {
                return;
            }
            h();
            h();
            boolean z = this.j;
            k(qp2);
        }
    }

    public final void f(Status status) {
        synchronized (this.a) {
            if (!h()) {
                a(e(status));
                this.l = true;
            }
        }
    }

    public final void i() {
        this.m = this.m || ((Boolean) n.get()).booleanValue();
    }

    public final QP2 g() {
        QP2 qp2;
        synchronized (this.a) {
            boolean z = this.j;
            h();
            qp2 = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        D04 d04 = (D04) this.g.getAndSet(null);
        if (d04 != null) {
            d04.a.a.remove(this);
        }
        return qp2;
    }

    public final void k(QP2 qp2) {
        this.h = qp2;
        this.i = qp2.S0();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            RP2 rp2 = this.f;
            if (rp2 != null) {
                HandlerC2184Qv handlerC2184Qv = this.b;
                handlerC2184Qv.removeMessages(2);
                handlerC2184Qv.sendMessage(handlerC2184Qv.obtainMessage(1, new Pair(rp2, g())));
            }
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5393fr2) it.next()).a(this.i);
        }
        arrayList.clear();
    }
}
