package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N11 extends AbstractC10600v11 implements InterfaceC10537uq1 {
    public final Lock b;
    public final C11966z01 c;
    public final int e;
    public final Context f;
    public final Looper g;
    public volatile boolean i;
    public final L11 l;
    public final C8543p11 m;
    public V31 n;
    public final Map o;
    public final JU q;
    public final Map r;
    public final AbstractC2609Uc s;
    public final ArrayList u;
    public Integer v;
    public final E04 w;
    public InterfaceC10880vq1 d = null;
    public final LinkedList h = new LinkedList();
    public final long j = 120000;
    public final long k = 5000;
    public Set p = new HashSet();
    public final C3806bE1 t = new C3806bE1();

    public N11(Context context, ReentrantLock reentrantLock, Looper looper, JU ju, C8543p11 c8543p11, Y93 y93, C4317ck c4317ck, ArrayList arrayList, ArrayList arrayList2, C4317ck c4317ck2, int i, int i2, ArrayList arrayList3) {
        this.v = null;
        K11 k11 = new K11(this);
        this.f = context;
        this.b = reentrantLock;
        this.c = new C11966z01(looper, k11);
        this.g = looper;
        this.l = new L11(this, looper);
        this.m = c8543p11;
        this.e = i;
        if (i >= 0) {
            this.v = Integer.valueOf(i2);
        }
        this.r = c4317ck;
        this.o = c4317ck2;
        this.u = arrayList3;
        this.w = new E04();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.a((InterfaceC9914t11) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.c.b((InterfaceC10257u11) it2.next());
        }
        this.q = ju;
        this.s = y93;
    }

    @Override // defpackage.AbstractC10600v11
    public final AbstractC8508ov f(AbstractC8508ov abstractC8508ov) {
        this.o.containsKey(abstractC8508ov.o);
        Lock lock = this.b;
        lock.lock();
        try {
            InterfaceC10880vq1 interfaceC10880vq1 = this.d;
            if (interfaceC10880vq1 == null) {
                this.h.add(abstractC8508ov);
                return abstractC8508ov;
            }
            return interfaceC10880vq1.d(abstractC8508ov);
        } finally {
            lock.unlock();
        }
    }

    public final void o() {
        Lock lock = this.b;
        lock.lock();
        try {
            if (this.e < 0) {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(q(this.o.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = this.v.intValue();
            lock.lock();
            n(intValue);
            this.c.j = true;
            this.d.connect();
            lock.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.AbstractC10600v11
    public final ConnectionResult d(TimeUnit timeUnit) {
        Looper.myLooper();
        Looper.getMainLooper();
        this.b.lock();
        try {
            Integer num = this.v;
            if (num == null) {
                this.v = Integer.valueOf(q(this.o.values()));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            n(this.v.intValue());
            this.c.j = true;
            return this.d.f(timeUnit);
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.AbstractC10600v11
    public final void e() {
        Lock lock = this.b;
        lock.lock();
        try {
            this.w.a();
            InterfaceC10880vq1 interfaceC10880vq1 = this.d;
            if (interfaceC10880vq1 != null) {
                interfaceC10880vq1.c();
            }
            Set<C3462aE1> set = this.t.a;
            for (C3462aE1 c3462aE1 : set) {
                c3462aE1.b = null;
                c3462aE1.c = null;
            }
            set.clear();
            LinkedList<AbstractC8508ov> linkedList = this.h;
            for (AbstractC8508ov abstractC8508ov : linkedList) {
                abstractC8508ov.g.set(null);
                abstractC8508ov.d();
            }
            linkedList.clear();
            if (this.d == null) {
                return;
            }
            r();
            C11966z01 c11966z01 = this.c;
            c11966z01.j = false;
            c11966z01.k.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.AbstractC10600v11
    public final void i() {
        e();
        o();
    }

    @Override // defpackage.AbstractC10600v11
    public final boolean h() {
        InterfaceC10880vq1 interfaceC10880vq1 = this.d;
        return interfaceC10880vq1 != null && interfaceC10880vq1.isConnected();
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void a(int i) {
        if (i == 1 && !this.i) {
            this.i = true;
            if (this.n == null) {
                try {
                    C8543p11 c8543p11 = this.m;
                    Context applicationContext = this.f.getApplicationContext();
                    M11 m11 = new M11(this);
                    c8543p11.getClass();
                    this.n = C8543p11.h(applicationContext, m11);
                } catch (SecurityException unused) {
                }
            }
            L11 l11 = this.l;
            l11.sendMessageDelayed(l11.obtainMessage(1), this.j);
            L11 l112 = this.l;
            l112.sendMessageDelayed(l112.obtainMessage(2), this.k);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.w.a.toArray(new BasePendingResult[0])) {
            basePendingResult.f(E04.c);
        }
        C11966z01 c11966z01 = this.c;
        c11966z01.m.removeMessages(1);
        synchronized (c11966z01.n) {
            c11966z01.l = true;
            ArrayList arrayList = new ArrayList(c11966z01.g);
            int i2 = c11966z01.k.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC9914t11 interfaceC9914t11 = (InterfaceC9914t11) it.next();
                if (!c11966z01.j || c11966z01.k.get() != i2) {
                    break;
                } else if (c11966z01.g.contains(interfaceC9914t11)) {
                    interfaceC9914t11.e(i);
                }
            }
            c11966z01.h.clear();
            c11966z01.l = false;
        }
        C11966z01 c11966z012 = this.c;
        c11966z012.j = false;
        c11966z012.k.incrementAndGet();
        if (i == 2) {
            this.c.j = true;
            this.d.connect();
        }
    }

    public final boolean r() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        V31 v31 = this.n;
        if (v31 != null) {
            v31.a();
            this.n = null;
        }
        return true;
    }

    public final void n(int i) {
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str = "UNKNOWN";
            String str2 = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            int intValue = this.v.intValue();
            if (intValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (intValue == 2) {
                str = "SIGN_IN_MODE_OPTIONAL";
            } else if (intValue == 3) {
                str = "SIGN_IN_MODE_NONE";
            }
            throw new IllegalStateException(IR0.a("Cannot use sign-in mode: ", str2, ". Mode was already set to ", str));
        }
        if (this.d != null) {
            return;
        }
        Map map = this.o;
        Iterator it = map.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((InterfaceC3129Yc) it.next()).requiresSignIn()) {
                z = true;
            }
        }
        int intValue2 = this.v.intValue();
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                Context context = this.f;
                Lock lock = this.b;
                Looper looper = this.g;
                C8543p11 c8543p11 = this.m;
                JU ju = this.q;
                AbstractC2609Uc abstractC2609Uc = this.s;
                C4317ck c4317ck = new C4317ck();
                C4317ck c4317ck2 = new C4317ck();
                for (Map.Entry entry : map.entrySet()) {
                    InterfaceC3129Yc interfaceC3129Yc = (InterfaceC3129Yc) entry.getValue();
                    interfaceC3129Yc.getClass();
                    if (interfaceC3129Yc.requiresSignIn()) {
                        c4317ck.put((C3259Zc) entry.getKey(), interfaceC3129Yc);
                    } else {
                        c4317ck2.put((C3259Zc) entry.getKey(), interfaceC3129Yc);
                    }
                }
                C4317ck c4317ck3 = new C4317ck();
                C4317ck c4317ck4 = new C4317ck();
                Map map2 = this.r;
                for (C3588ad c3588ad : map2.keySet()) {
                    C3259Zc c3259Zc = c3588ad.b;
                    if (c4317ck.containsKey(c3259Zc)) {
                        c4317ck3.put(c3588ad, (Boolean) map2.get(c3588ad));
                    } else if (c4317ck2.containsKey(c3259Zc)) {
                        c4317ck4.put(c3588ad, (Boolean) map2.get(c3588ad));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = this.u.iterator();
                while (it2.hasNext()) {
                    ZT zt = (ZT) it2.next();
                    if (c4317ck3.containsKey(zt.a)) {
                        arrayList.add(zt);
                    } else if (c4317ck4.containsKey(zt.a)) {
                        arrayList2.add(zt);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                }
                this.d = new Q10(context, this, lock, looper, c8543p11, c4317ck, c4317ck2, ju, abstractC2609Uc, arrayList, arrayList2, c4317ck3, c4317ck4);
                return;
            }
        } else if (!z) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.d = new R11(this.f, this, this.b, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this);
    }

    @Override // defpackage.AbstractC10600v11
    public final void j(InterfaceC9914t11 interfaceC9914t11) {
        this.c.a(interfaceC9914t11);
    }

    @Override // defpackage.AbstractC10600v11
    public final void l(InterfaceC9914t11 interfaceC9914t11) {
        C11966z01 c11966z01 = this.c;
        synchronized (c11966z01.n) {
            if (!c11966z01.g.remove(interfaceC9914t11)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + String.valueOf(interfaceC9914t11) + " not found");
            } else if (c11966z01.l) {
                c11966z01.h.add(interfaceC9914t11);
            }
        }
    }

    @Override // defpackage.AbstractC10600v11
    public final void k(InterfaceC10257u11 interfaceC10257u11) {
        this.c.b(interfaceC10257u11);
    }

    @Override // defpackage.AbstractC10600v11
    public final void m(InterfaceC10257u11 interfaceC10257u11) {
        C11966z01 c11966z01 = this.c;
        synchronized (c11966z01.n) {
            if (!c11966z01.i.remove(interfaceC10257u11)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(interfaceC10257u11) + " not found");
            }
        }
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void c(Bundle bundle) {
        while (!this.h.isEmpty()) {
            AbstractC8508ov abstractC8508ov = (AbstractC8508ov) this.h.remove();
            C3588ad c3588ad = abstractC8508ov.p;
            this.o.containsKey(abstractC8508ov.o);
            this.b.lock();
            try {
                InterfaceC10880vq1 interfaceC10880vq1 = this.d;
                if (interfaceC10880vq1 == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.i) {
                    this.h.add(abstractC8508ov);
                    while (!this.h.isEmpty()) {
                        AbstractC8508ov abstractC8508ov2 = (AbstractC8508ov) this.h.remove();
                        E04 e04 = this.w;
                        e04.a.add(abstractC8508ov2);
                        abstractC8508ov2.g.set(e04.b);
                        abstractC8508ov2.n(Status.m);
                    }
                } else {
                    interfaceC10880vq1.b(abstractC8508ov);
                }
            } finally {
                this.b.unlock();
            }
        }
        C11966z01 c11966z01 = this.c;
        synchronized (c11966z01.n) {
            c11966z01.m.removeMessages(1);
            c11966z01.l = true;
            c11966z01.h.isEmpty();
            ArrayList arrayList = new ArrayList(c11966z01.g);
            int i = c11966z01.k.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC9914t11 interfaceC9914t11 = (InterfaceC9914t11) it.next();
                if (!c11966z01.j || !c11966z01.a.isConnected() || c11966z01.k.get() != i) {
                    break;
                } else if (!c11966z01.h.contains(interfaceC9914t11)) {
                    interfaceC9914t11.h(bundle);
                }
            }
            c11966z01.h.clear();
            c11966z01.l = false;
        }
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void b(ConnectionResult connectionResult) {
        C8543p11 c8543p11 = this.m;
        Context context = this.f;
        int i = connectionResult.g;
        c8543p11.getClass();
        if (!X31.e(context, i)) {
            r();
        }
        if (this.i) {
            return;
        }
        C11966z01 c11966z01 = this.c;
        c11966z01.m.removeMessages(1);
        synchronized (c11966z01.n) {
            ArrayList arrayList = new ArrayList(c11966z01.i);
            int i2 = c11966z01.k.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC10257u11 interfaceC10257u11 = (InterfaceC10257u11) it.next();
                if (c11966z01.j && c11966z01.k.get() == i2) {
                    if (c11966z01.i.contains(interfaceC10257u11)) {
                        interfaceC10257u11.M0(connectionResult);
                    }
                }
            }
        }
        C11966z01 c11966z012 = this.c;
        c11966z012.j = false;
        c11966z012.k.incrementAndGet();
    }

    @Override // defpackage.AbstractC10600v11
    public final Looper g() {
        return this.g;
    }

    public final void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.i);
        printWriter.append(" mWorkQueue.size()=").print(this.h.size());
        E04 e04 = this.w;
        e04.getClass();
        printWriter.append(" mUnconsumedApiCalls.size()=").println(e04.a.size());
        InterfaceC10880vq1 interfaceC10880vq1 = this.d;
        if (interfaceC10880vq1 != null) {
            interfaceC10880vq1.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int q(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((InterfaceC3129Yc) it.next()).requiresSignIn()) {
                z = true;
            }
        }
        return z ? 1 : 3;
    }
}
