package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d21 */
/* loaded from: classes.dex */
public final class C4425d21 implements InterfaceC9914t11, InterfaceC10257u11, InterfaceC3540aU {
    public final InterfaceC3129Yc g;
    public final C0540Ee h;
    public final V30 i;
    public final int l;
    public final BinderC5292fa3 m;
    public boolean n;
    public final /* synthetic */ C5800h21 r;
    public final LinkedList a = new LinkedList();
    public final HashSet j = new HashSet();
    public final HashMap k = new HashMap();
    public final ArrayList o = new ArrayList();
    public ConnectionResult p = null;
    public int q = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C4425d21(C5800h21 c5800h21, AbstractC7856n11 abstractC7856n11) {
        this.r = c5800h21;
        Looper looper = c5800h21.s.getLooper();
        IU a = abstractC7856n11.a();
        Account account = a.a;
        C5348fk c5348fk = a.b;
        String str = a.c;
        String str2 = a.d;
        C5636ga3 c5636ga3 = C5636ga3.b;
        InterfaceC3129Yc b = abstractC7856n11.c.a.b(abstractC7856n11.a, looper, new JU(account, c5348fk, null, str, str2, c5636ga3), abstractC7856n11.d, this, this);
        String str3 = abstractC7856n11.b;
        if (str3 != null && (b instanceof BaseGmsClient)) {
            ((BaseGmsClient) b).x = str3;
        }
        this.g = b;
        this.h = abstractC7856n11.e;
        this.i = new V30();
        this.l = abstractC7856n11.g;
        if (b.requiresSignIn()) {
            Context context = c5800h21.j;
            HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
            IU a2 = abstractC7856n11.a();
            this.m = new BinderC5292fa3(context, handlerC10413uU3, new JU(a2.a, a2.b, null, a2.c, a2.d, c5636ga3));
            return;
        }
        this.m = null;
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        C5800h21 c5800h21 = this.r;
        if (myLooper == c5800h21.s.getLooper()) {
            l();
        } else {
            c5800h21.s.post(new Y11(this));
        }
    }

    public final void l() {
        InterfaceC3129Yc interfaceC3129Yc = this.g;
        C5800h21 c5800h21 = this.r;
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        this.p = null;
        b(ConnectionResult.j);
        if (this.n) {
            HandlerC10413uU3 handlerC10413uU32 = c5800h21.s;
            C0540Ee c0540Ee = this.h;
            handlerC10413uU32.removeMessages(11, c0540Ee);
            c5800h21.s.removeMessages(9, c0540Ee);
            this.n = false;
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            C6590jL2 c6590jL2 = (C6590jL2) it.next();
            if (k(c6590jL2.a.b) != null) {
                it.remove();
            } else {
                try {
                    AL2 al2 = c6590jL2.a;
                    al2.e.a.accept(interfaceC3129Yc, new C6905kF3());
                } catch (DeadObjectException unused) {
                    e(3);
                    interfaceC3129Yc.a("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        j();
        o();
    }

    @Override // defpackage.C30
    public final void e(int i) {
        Looper myLooper = Looper.myLooper();
        C5800h21 c5800h21 = this.r;
        if (myLooper == c5800h21.s.getLooper()) {
            n(i);
        } else {
            c5800h21.s.post(new Z11(this, i));
        }
    }

    public final boolean q(ConnectionResult connectionResult) {
        synchronized (C5800h21.w) {
            C5800h21 c5800h21 = this.r;
            if (c5800h21.p == null || !c5800h21.q.contains(this.h)) {
                return false;
            }
            this.r.p.j(this.l, connectionResult);
            return true;
        }
    }

    @Override // defpackage.InterfaceC3540aU
    public final void a(ConnectionResult connectionResult, C3588ad c3588ad, boolean z) {
        Looper myLooper = Looper.myLooper();
        C5800h21 c5800h21 = this.r;
        if (myLooper != c5800h21.s.getLooper()) {
            c5800h21.s.post(new RunnableC3394a21(this, connectionResult));
        } else {
            m(connectionResult, null);
        }
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        m(connectionResult, null);
    }

    public final void m(ConnectionResult connectionResult, RuntimeException runtimeException) {
        InterfaceC3918ba3 interfaceC3918ba3;
        HandlerC10413uU3 handlerC10413uU3 = this.r.s;
        BinderC5292fa3 binderC5292fa3 = this.m;
        if (binderC5292fa3 != null && (interfaceC3918ba3 = binderC5292fa3.k) != null) {
            interfaceC3918ba3.disconnect();
        }
        C5800h21 c5800h21 = this.r;
        HandlerC10413uU3 handlerC10413uU32 = c5800h21.s;
        this.p = null;
        c5800h21.l.a.clear();
        b(connectionResult);
        if ((this.g instanceof C8629pG3) && connectionResult.g != 24) {
            C5800h21 c5800h212 = this.r;
            c5800h212.g = true;
            HandlerC10413uU3 handlerC10413uU33 = c5800h212.s;
            handlerC10413uU33.sendMessageDelayed(handlerC10413uU33.obtainMessage(19), 300000L);
        }
        if (connectionResult.g == 4) {
            g(C5800h21.v);
            return;
        }
        if (this.a.isEmpty()) {
            this.p = connectionResult;
            return;
        }
        if (runtimeException == null) {
            if (!this.r.t) {
                g(C5800h21.h(this.h, connectionResult));
                return;
            }
            i(C5800h21.h(this.h, connectionResult), null, true);
            if (this.a.isEmpty() || q(connectionResult) || this.r.g(this.l, connectionResult)) {
                return;
            }
            if (connectionResult.g == 18) {
                this.n = true;
            }
            if (this.n) {
                HandlerC10413uU3 handlerC10413uU34 = this.r.s;
                Message obtain = Message.obtain(handlerC10413uU34, 9, this.h);
                this.r.getClass();
                handlerC10413uU34.sendMessageDelayed(obtain, 5000L);
                return;
            }
            g(C5800h21.h(this.h, connectionResult));
            return;
        }
        HandlerC10413uU3 handlerC10413uU35 = this.r.s;
        i(null, runtimeException, false);
    }

    public final void j() {
        LinkedList linkedList = this.a;
        Iterator it = new ArrayList(linkedList).iterator();
        while (it.hasNext()) {
            AbstractC5994hd abstractC5994hd = (AbstractC5994hd) it.next();
            if (!((BaseGmsClient) this.g).isConnected()) {
                return;
            }
            if (c(abstractC5994hd)) {
                linkedList.remove(abstractC5994hd);
            }
        }
    }

    public final void f(AbstractC5994hd abstractC5994hd) {
        HandlerC10413uU3 handlerC10413uU3 = this.r.s;
        boolean isConnected = ((BaseGmsClient) this.g).isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (c(abstractC5994hd)) {
                o();
                return;
            } else {
                linkedList.add(abstractC5994hd);
                return;
            }
        }
        linkedList.add(abstractC5994hd);
        ConnectionResult connectionResult = this.p;
        if (connectionResult != null && connectionResult.s1()) {
            m(this.p, null);
        } else {
            d();
        }
    }

    public final void p() {
        C5800h21 c5800h21 = this.r;
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        Status status = C5800h21.u;
        g(status);
        V30 v30 = this.i;
        v30.getClass();
        v30.a(status, false);
        for (YD1 yd1 : (YD1[]) this.k.keySet().toArray(new YD1[0])) {
            f(new C5650gd(yd1, new C6905kF3()));
        }
        b(new ConnectionResult(4));
        BaseGmsClient baseGmsClient = (BaseGmsClient) this.g;
        if (baseGmsClient.isConnected()) {
            C4081c21 c4081c21 = new C4081c21(this);
            baseGmsClient.getClass();
            c5800h21.s.post(new RunnableC3738b21(c4081c21));
        }
    }

    public final void n(int i) {
        HandlerC10413uU3 handlerC10413uU3 = this.r.s;
        this.p = null;
        this.n = true;
        V30 v30 = this.i;
        String str = ((BaseGmsClient) this.g).f;
        v30.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        v30.a(new Status(20, sb.toString(), 0), true);
        HandlerC10413uU3 handlerC10413uU32 = this.r.s;
        Message obtain = Message.obtain(handlerC10413uU32, 9, this.h);
        this.r.getClass();
        handlerC10413uU32.sendMessageDelayed(obtain, 5000L);
        HandlerC10413uU3 handlerC10413uU33 = this.r.s;
        Message obtain2 = Message.obtain(handlerC10413uU33, 11, this.h);
        this.r.getClass();
        handlerC10413uU33.sendMessageDelayed(obtain2, 120000L);
        this.r.l.a.clear();
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            ((C6590jL2) it.next()).c.run();
        }
    }

    public final boolean c(AbstractC5994hd abstractC5994hd) {
        if (abstractC5994hd instanceof AbstractC3932bd) {
            AbstractC3932bd abstractC3932bd = (AbstractC3932bd) abstractC5994hd;
            Feature k = k(abstractC3932bd.f(this));
            if (k != null) {
                Log.w("GoogleApiManager", this.g.getClass().getName() + " could not execute call because it requires feature (" + k.a + ", " + k.r1() + ").");
                if (this.r.t && abstractC3932bd.g(this)) {
                    C4768e21 c4768e21 = new C4768e21(this.h, k);
                    ArrayList arrayList = this.o;
                    int indexOf = arrayList.indexOf(c4768e21);
                    C5800h21 c5800h21 = this.r;
                    if (indexOf >= 0) {
                        C4768e21 c4768e212 = (C4768e21) arrayList.get(indexOf);
                        c5800h21.s.removeMessages(15, c4768e212);
                        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
                        handlerC10413uU3.sendMessageDelayed(Message.obtain(handlerC10413uU3, 15, c4768e212), 5000L);
                        return false;
                    }
                    arrayList.add(c4768e21);
                    HandlerC10413uU3 handlerC10413uU32 = c5800h21.s;
                    handlerC10413uU32.sendMessageDelayed(Message.obtain(handlerC10413uU32, 15, c4768e21), 5000L);
                    HandlerC10413uU3 handlerC10413uU33 = c5800h21.s;
                    handlerC10413uU33.sendMessageDelayed(Message.obtain(handlerC10413uU33, 16, c4768e21), 120000L);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (q(connectionResult)) {
                        return false;
                    }
                    c5800h21.g(this.l, connectionResult);
                    return false;
                }
                abstractC3932bd.c(new T14(k));
                return true;
            }
            InterfaceC3129Yc interfaceC3129Yc = this.g;
            abstractC5994hd.e(this.i, interfaceC3129Yc.requiresSignIn());
            try {
                abstractC5994hd.d(this);
            } catch (DeadObjectException unused) {
                e(1);
                interfaceC3129Yc.a("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        InterfaceC3129Yc interfaceC3129Yc2 = this.g;
        abstractC5994hd.e(this.i, interfaceC3129Yc2.requiresSignIn());
        try {
            abstractC5994hd.d(this);
        } catch (DeadObjectException unused2) {
            e(1);
            interfaceC3129Yc2.a("DeadObjectException thrown while running ApiCallRunner.");
        }
        return true;
    }

    public final void i(Status status, RuntimeException runtimeException, boolean z) {
        HandlerC10413uU3 handlerC10413uU3 = this.r.s;
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC5994hd abstractC5994hd = (AbstractC5994hd) it.next();
            if (!z || abstractC5994hd.a == 2) {
                if (status != null) {
                    abstractC5994hd.b(status);
                } else {
                    abstractC5994hd.c(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        HandlerC10413uU3 handlerC10413uU3 = this.r.s;
        i(status, null, false);
    }

    public final void o() {
        C5800h21 c5800h21 = this.r;
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        C0540Ee c0540Ee = this.h;
        handlerC10413uU3.removeMessages(12, c0540Ee);
        HandlerC10413uU3 handlerC10413uU32 = c5800h21.s;
        handlerC10413uU32.sendMessageDelayed(handlerC10413uU32.obtainMessage(12, c0540Ee), c5800h21.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        C5800h21 c5800h21 = this.r;
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        InterfaceC3129Yc interfaceC3129Yc = this.g;
        BaseGmsClient baseGmsClient = (BaseGmsClient) interfaceC3129Yc;
        if (baseGmsClient.isConnected() || baseGmsClient.r()) {
            return;
        }
        try {
            int a = c5800h21.l.a(c5800h21.j, interfaceC3129Yc);
            if (a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(a, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC3129Yc.getClass().getName() + " is not available: " + String.valueOf(connectionResult));
                m(connectionResult, null);
                return;
            }
            C5456g21 c5456g21 = new C5456g21(c5800h21, interfaceC3129Yc, this.h);
            if (interfaceC3129Yc.requiresSignIn()) {
                BinderC5292fa3 binderC5292fa3 = this.m;
                InterfaceC3918ba3 interfaceC3918ba3 = binderC5292fa3.k;
                if (interfaceC3918ba3 != null) {
                    interfaceC3918ba3.disconnect();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(binderC5292fa3));
                JU ju = binderC5292fa3.j;
                ju.j = valueOf;
                AbstractC2609Uc abstractC2609Uc = binderC5292fa3.h;
                Context context = binderC5292fa3.a;
                Handler handler = binderC5292fa3.g;
                binderC5292fa3.k = (InterfaceC3918ba3) abstractC2609Uc.b(context, handler.getLooper(), ju, ju.h, binderC5292fa3, binderC5292fa3);
                binderC5292fa3.l = c5456g21;
                Set set = binderC5292fa3.i;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC4605da3(binderC5292fa3));
                } else {
                    C4261ca3 c4261ca3 = (C4261ca3) binderC5292fa3.k;
                    c4261ca3.getClass();
                    c4261ca3.o = new C7132kv(c4261ca3);
                    c4261ca3.w(2, null);
                }
            }
            try {
                BaseGmsClient baseGmsClient2 = (BaseGmsClient) interfaceC3129Yc;
                baseGmsClient2.o = c5456g21;
                baseGmsClient2.w(2, null);
            } catch (SecurityException e) {
                m(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new ConnectionResult(10), e2);
        }
    }

    public final void b(ConnectionResult connectionResult) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            if (W82.a(connectionResult, ConnectionResult.j)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) this.g;
                if (!baseGmsClient.isConnected() || baseGmsClient.g == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw null;
        }
        hashSet.clear();
    }

    public final Feature k(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            ConnectionInfo connectionInfo = ((BaseGmsClient) this.g).A;
            Feature[] featureArr2 = connectionInfo == null ? null : connectionInfo.g;
            if (featureArr2 == null) {
                featureArr2 = new Feature[0];
            }
            C4317ck c4317ck = new C4317ck(featureArr2.length);
            for (Feature feature : featureArr2) {
                c4317ck.put(feature.a, Long.valueOf(feature.r1()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c4317ck.get(feature2.a);
                if (l == null || l.longValue() < feature2.r1()) {
                    return feature2;
                }
            }
        }
        return null;
    }
}
