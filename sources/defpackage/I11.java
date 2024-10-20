package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I11 implements O11 {
    public final R11 a;
    public final Lock b;
    public final Context c;
    public final C9228r11 d;
    public ConnectionResult e;
    public int f;
    public int h;
    public InterfaceC3918ba3 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public InterfaceC7008ka1 o;
    public boolean p;
    public boolean q;
    public final JU r;
    public final Map s;
    public final AbstractC2609Uc t;
    public int g = 0;
    public final Bundle i = new Bundle();
    public final HashSet j = new HashSet();
    public final ArrayList u = new ArrayList();

    @Override // defpackage.O11
    public final void connect() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:            if ((r5.s1() || r4.d.a(r5.g) != null) == false) goto L116;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.gms.common.ConnectionResult r5, defpackage.C3588ad r6, boolean r7) {
        /*
            r4 = this;
            Uc r0 = r6.a
            r0.getClass()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L23
            boolean r7 = r5.s1()
            if (r7 == 0) goto L13
            goto L1d
        L13:
            r11 r7 = r4.d
            int r3 = r5.g
            android.content.Intent r7 = r7.a(r3)
            if (r7 == 0) goto L1f
        L1d:
            r7 = r1
            goto L20
        L1f:
            r7 = r2
        L20:
            if (r7 != 0) goto L23
            goto L2e
        L23:
            com.google.android.gms.common.ConnectionResult r7 = r4.e
            if (r7 == 0) goto L2d
            int r7 = r4.f
            if (r0 >= r7) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L34
            r4.e = r5
            r4.f = r0
        L34:
            R11 r7 = r4.a
            java.util.HashMap r7 = r7.l
            Zc r6 = r6.b
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.m(com.google.android.gms.common.ConnectionResult, ad, boolean):void");
    }

    public I11(R11 r11, JU ju, Map map, C9228r11 c9228r11, AbstractC2609Uc abstractC2609Uc, Lock lock, Context context) {
        this.a = r11;
        this.r = ju;
        this.s = map;
        this.d = c9228r11;
        this.t = abstractC2609Uc;
        this.b = lock;
        this.c = context;
    }

    @Override // defpackage.O11
    public final void c() {
        Map map;
        R11 r11 = this.a;
        r11.l.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        Map map2 = this.s;
        Iterator it = map2.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = r11.k;
            if (!hasNext) {
                break;
            }
            C3588ad c3588ad = (C3588ad) it.next();
            InterfaceC3129Yc interfaceC3129Yc = (InterfaceC3129Yc) map.get(c3588ad.b);
            c3588ad.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(c3588ad)).booleanValue();
            if (interfaceC3129Yc.requiresSignIn()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(c3588ad.b);
                } else {
                    this.l = false;
                }
            }
            hashMap.put(interfaceC3129Yc, new C11972z11(this, c3588ad, booleanValue));
        }
        if (this.m) {
            N11 n11 = r11.s;
            n11.getClass();
            Integer valueOf = Integer.valueOf(System.identityHashCode(n11));
            JU ju = this.r;
            ju.j = valueOf;
            G11 g11 = new G11(this);
            this.k = (InterfaceC3918ba3) this.t.b(this.c, n11.g, ju, ju.h, g11, g11);
        }
        this.h = map.size();
        this.u.add(S11.a.submit(new C11(this, hashMap)));
    }

    public final boolean l() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        R11 r11 = this.a;
        if (i < 0) {
            N11 n11 = r11.s;
            n11.getClass();
            StringWriter stringWriter = new StringWriter();
            n11.p("", null, new PrintWriter(stringWriter), null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            k(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.e;
        if (connectionResult == null) {
            return true;
        }
        r11.r = this.f;
        k(connectionResult);
        return false;
    }

    public final void n() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            R11 r11 = this.a;
            this.h = r11.k.size();
            Map map = r11.k;
            for (C3259Zc c3259Zc : map.keySet()) {
                if (r11.l.containsKey(c3259Zc)) {
                    if (l()) {
                        j();
                    }
                } else {
                    arrayList.add((InterfaceC3129Yc) map.get(c3259Zc));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(S11.a.submit(new D11(this, arrayList)));
        }
    }

    @Override // defpackage.O11
    public final void h(Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (l()) {
                j();
            }
        }
    }

    @Override // defpackage.O11
    public final void a(ConnectionResult connectionResult, C3588ad c3588ad, boolean z) {
        if (g(1)) {
            m(connectionResult, c3588ad, z);
            if (l()) {
                j();
            }
        }
    }

    public final void j() {
        R11 r11 = this.a;
        r11.a.lock();
        try {
            r11.s.r();
            r11.p = new C11286x11(r11);
            r11.p.c();
            r11.g.signalAll();
            r11.a.unlock();
            S11.a.execute(new RunnableC11629y11(this));
            InterfaceC3918ba3 interfaceC3918ba3 = this.k;
            if (interfaceC3918ba3 != null) {
                if (this.p) {
                    InterfaceC7008ka1 interfaceC7008ka1 = this.o;
                    boolean z = this.q;
                    C4261ca3 c4261ca3 = (C4261ca3) interfaceC3918ba3;
                    try {
                        InterfaceC12186zf1 interfaceC12186zf1 = (InterfaceC12186zf1) c4261ca3.m();
                        int intValue = c4261ca3.I.intValue();
                        C11500xf1 c11500xf1 = (C11500xf1) interfaceC12186zf1;
                        Parcel a = c11500xf1.a();
                        AbstractC11786yV.c(a, interfaceC7008ka1);
                        a.writeInt(intValue);
                        a.writeInt(z ? 1 : 0);
                        c11500xf1.h(9, a);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                i(false);
            }
            Iterator it = this.a.l.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC3129Yc) this.a.k.get((C3259Zc) it.next())).disconnect();
            }
            this.a.t.c(this.i.isEmpty() ? null : this.i);
        } catch (Throwable th) {
            r11.a.unlock();
            throw th;
        }
    }

    @Override // defpackage.O11
    public final AbstractC8508ov d(AbstractC8508ov abstractC8508ov) {
        this.a.s.h.add(abstractC8508ov);
        return abstractC8508ov;
    }

    @Override // defpackage.O11
    public final AbstractC8508ov b(AbstractC8508ov abstractC8508ov) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.O11
    public final void e(int i) {
        k(new ConnectionResult(8, null));
    }

    public final void f() {
        this.m = false;
        R11 r11 = this.a;
        r11.s.p = Collections.emptySet();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            C3259Zc c3259Zc = (C3259Zc) it.next();
            HashMap hashMap = r11.l;
            if (!hashMap.containsKey(c3259Zc)) {
                hashMap.put(c3259Zc, new ConnectionResult(17, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(boolean z) {
        InterfaceC3918ba3 interfaceC3918ba3 = this.k;
        if (interfaceC3918ba3 != 0) {
            if (((BaseGmsClient) interfaceC3918ba3).isConnected() && z) {
                C4261ca3 c4261ca3 = (C4261ca3) interfaceC3918ba3;
                try {
                    InterfaceC12186zf1 interfaceC12186zf1 = (InterfaceC12186zf1) c4261ca3.m();
                    int intValue = c4261ca3.I.intValue();
                    C11500xf1 c11500xf1 = (C11500xf1) interfaceC12186zf1;
                    Parcel a = c11500xf1.a();
                    a.writeInt(intValue);
                    c11500xf1.h(7, a);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            interfaceC3918ba3.disconnect();
            if (this.r.i) {
                this.k = null;
            }
            this.o = null;
        }
    }

    @Override // defpackage.O11
    public final boolean disconnect() {
        ArrayList arrayList = this.u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.a.g(null);
        return true;
    }

    public final void k(ConnectionResult connectionResult) {
        ArrayList arrayList = this.u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        arrayList.clear();
        i(!connectionResult.s1());
        R11 r11 = this.a;
        r11.g(connectionResult);
        r11.t.b(connectionResult);
    }

    public final boolean g(int i) {
        if (this.g == i) {
            return true;
        }
        N11 n11 = this.a.s;
        n11.getClass();
        StringWriter stringWriter = new StringWriter();
        n11.p("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(String.valueOf(this)));
        Log.w("GACConnecting", "mRemainingConnections=" + this.h);
        int i2 = this.g;
        String str = "UNKNOWN";
        String str2 = i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        if (i == 0) {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        } else if (i == 1) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        }
        Log.e("GACConnecting", IR0.a("GoogleApiClient connecting is in step ", str2, " but received callback for step ", str), new Exception());
        k(new ConnectionResult(8, null));
        return false;
    }
}
