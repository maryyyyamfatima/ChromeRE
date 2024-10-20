package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q10 implements InterfaceC10880vq1 {
    public final N11 a;
    public final R11 g;
    public final R11 h;
    public final Map i;
    public Bundle l;
    public final Lock p;
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult m = null;
    public ConnectionResult n = null;
    public boolean o = false;
    public int q = 0;
    public final InterfaceC3129Yc k = null;

    @Override // defpackage.InterfaceC10880vq1
    public final AbstractC8508ov b(AbstractC8508ov abstractC8508ov) {
        if (((R11) this.i.get(abstractC8508ov.o)).equals(this.h)) {
            if (!h()) {
                R11 r11 = this.h;
                r11.getClass();
                abstractC8508ov.i();
                return r11.p.b(abstractC8508ov);
            }
            if (this.k == null) {
                abstractC8508ov.n(new Status(4, null, 0));
                return abstractC8508ov;
            }
            N11 n11 = this.a;
            n11.getClass();
            System.identityHashCode(n11);
            throw new UnsupportedOperationException("Not a sign in API");
        }
        R11 r112 = this.g;
        r112.getClass();
        abstractC8508ov.i();
        return r112.p.b(abstractC8508ov);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final AbstractC8508ov d(AbstractC8508ov abstractC8508ov) {
        if (((R11) this.i.get(abstractC8508ov.o)).equals(this.h)) {
            if (!h()) {
                R11 r11 = this.h;
                r11.getClass();
                abstractC8508ov.i();
                return r11.p.d(abstractC8508ov);
            }
            if (this.k == null) {
                abstractC8508ov.n(new Status(4, null, 0));
                return abstractC8508ov;
            }
            N11 n11 = this.a;
            n11.getClass();
            System.identityHashCode(n11);
            throw new UnsupportedOperationException("Not a sign in API");
        }
        R11 r112 = this.g;
        r112.getClass();
        abstractC8508ov.i();
        return r112.p.d(abstractC8508ov);
    }

    public Q10(Context context, N11 n11, Lock lock, Looper looper, C8543p11 c8543p11, C4317ck c4317ck, C4317ck c4317ck2, JU ju, AbstractC2609Uc abstractC2609Uc, ArrayList arrayList, ArrayList arrayList2, C4317ck c4317ck3, C4317ck c4317ck4) {
        this.a = n11;
        this.p = lock;
        this.g = new R11(context, n11, lock, looper, c8543p11, c4317ck2, null, c4317ck4, null, arrayList2, new O10(this));
        this.h = new R11(context, n11, lock, looper, c8543p11, c4317ck, ju, c4317ck3, abstractC2609Uc, arrayList, new P10(this));
        C4317ck c4317ck5 = new C4317ck();
        Iterator it = ((C3164Yj) c4317ck2.keySet()).iterator();
        while (it.hasNext()) {
            c4317ck5.put((C3259Zc) it.next(), this.g);
        }
        Iterator it2 = ((C3164Yj) c4317ck.keySet()).iterator();
        while (it2.hasNext()) {
            c4317ck5.put((C3259Zc) it2.next(), this.h);
        }
        this.i = Collections.unmodifiableMap(c4317ck5);
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void connect() {
        this.q = 2;
        this.o = false;
        this.n = null;
        this.m = null;
        this.g.connect();
        this.h.connect();
    }

    @Override // defpackage.InterfaceC10880vq1
    public final ConnectionResult f(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void c() {
        this.n = null;
        this.m = null;
        this.q = 0;
        this.g.c();
        this.h.c();
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:            if (r2.q == 1) goto L73;     */
    @Override // defpackage.InterfaceC10880vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isConnected() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.p
            r0.lock()
            R11 r0 = r2.g     // Catch: java.lang.Throwable -> L28
            O11 r0 = r0.p     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof defpackage.C11286x11     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L21
            R11 r0 = r2.h     // Catch: java.lang.Throwable -> L28
            O11 r0 = r0.p     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof defpackage.C11286x11     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 != 0) goto L22
            boolean r0 = r2.h()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.q     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.p
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.p
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q10.isConnected():boolean");
    }

    public static void a(Q10 q10) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2 = q10.m;
        boolean z = connectionResult2 != null && connectionResult2.t1();
        R11 r11 = q10.g;
        if (z) {
            ConnectionResult connectionResult3 = q10.n;
            if (!(connectionResult3 != null && connectionResult3.t1()) && !q10.h()) {
                ConnectionResult connectionResult4 = q10.n;
                if (connectionResult4 != null) {
                    if (q10.q == 1) {
                        q10.g();
                        return;
                    } else {
                        q10.e(connectionResult4);
                        r11.c();
                        return;
                    }
                }
                return;
            }
            int i = q10.q;
            if (i != 1) {
                if (i == 2) {
                    q10.a.c(q10.l);
                } else {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    q10.q = 0;
                    return;
                }
            }
            q10.g();
            q10.q = 0;
            return;
        }
        ConnectionResult connectionResult5 = q10.m;
        R11 r112 = q10.h;
        if (connectionResult5 != null) {
            ConnectionResult connectionResult6 = q10.n;
            if (connectionResult6 != null && connectionResult6.t1()) {
                r112.c();
                q10.e(q10.m);
                return;
            }
        }
        ConnectionResult connectionResult7 = q10.m;
        if (connectionResult7 == null || (connectionResult = q10.n) == null) {
            return;
        }
        if (r112.r < r11.r) {
            connectionResult7 = connectionResult;
        }
        q10.e(connectionResult7);
    }

    public final void e(ConnectionResult connectionResult) {
        int i = this.q;
        if (i != 1) {
            if (i == 2) {
                this.a.b(connectionResult);
            } else {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.q = 0;
            }
        }
        g();
        this.q = 0;
    }

    public final void g() {
        Set set = this.j;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        set.clear();
    }

    public final boolean h() {
        ConnectionResult connectionResult = this.n;
        return connectionResult != null && connectionResult.g == 4;
    }

    @Override // defpackage.InterfaceC10880vq1
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.h.dump(str + "  ", fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.g.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }
}
