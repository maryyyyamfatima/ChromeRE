package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R11 implements InterfaceC10880vq1, InterfaceC3540aU {
    public final Lock a;
    public final Condition g;
    public final Context h;
    public final C9228r11 i;
    public final Q11 j;
    public final Map k;
    public final JU m;
    public final Map n;
    public final AbstractC2609Uc o;
    public volatile O11 p;
    public int r;
    public final N11 s;
    public final InterfaceC10537uq1 t;
    public final HashMap l = new HashMap();
    public ConnectionResult q = null;

    public R11(Context context, N11 n11, Lock lock, Looper looper, C8543p11 c8543p11, Map map, JU ju, Map map2, AbstractC2609Uc abstractC2609Uc, ArrayList arrayList, InterfaceC10537uq1 interfaceC10537uq1) {
        this.h = context;
        this.a = lock;
        this.i = c8543p11;
        this.k = map;
        this.m = ju;
        this.n = map2;
        this.o = abstractC2609Uc;
        this.s = n11;
        this.t = interfaceC10537uq1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ZT) it.next()).h = this;
        }
        this.j = new Q11(this, looper);
        this.g = lock.newCondition();
        this.p = new J11(this);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final AbstractC8508ov d(AbstractC8508ov abstractC8508ov) {
        abstractC8508ov.i();
        return this.p.d(abstractC8508ov);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final AbstractC8508ov b(AbstractC8508ov abstractC8508ov) {
        abstractC8508ov.i();
        return this.p.b(abstractC8508ov);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void connect() {
        this.p.connect();
    }

    @Override // defpackage.InterfaceC10880vq1
    public final ConnectionResult f(TimeUnit timeUnit) {
        connect();
        long nanos = timeUnit.toNanos(5000L);
        while (this.p instanceof I11) {
            if (nanos <= 0) {
                c();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.g.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.p instanceof C11286x11) {
            return ConnectionResult.j;
        }
        ConnectionResult connectionResult = this.q;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void c() {
        if (this.p.disconnect()) {
            this.l.clear();
        }
    }

    public final void g(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.q = connectionResult;
            this.p = new J11(this);
            this.p.c();
            this.g.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.InterfaceC10880vq1
    public final boolean isConnected() {
        return this.p instanceof C11286x11;
    }

    @Override // defpackage.InterfaceC3540aU
    public final void a(ConnectionResult connectionResult, C3588ad c3588ad, boolean z) {
        this.a.lock();
        try {
            this.p.a(connectionResult, c3588ad, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        this.a.lock();
        try {
            this.p.h(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.C30
    public final void e(int i) {
        this.a.lock();
        try {
            this.p.e(i);
        } finally {
            this.a.unlock();
        }
    }

    public final void i(P11 p11) {
        Q11 q11 = this.j;
        q11.sendMessage(q11.obtainMessage(1, p11));
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String a = AbstractC7848n0.a(str, "  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.p);
        for (C3588ad c3588ad : this.n.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c3588ad.c).println(":");
            ((InterfaceC3129Yc) this.k.get(c3588ad.b)).dump(a, fileDescriptor, printWriter, strArr);
        }
    }
}
