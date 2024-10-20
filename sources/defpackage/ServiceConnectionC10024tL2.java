package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC10024tL2 extends AbstractC5584gQ1 implements ServiceConnection {
    public final ComponentName n;
    public final HandlerC8310oL2 o;
    public final ArrayList p;
    public boolean q;
    public boolean r;
    public C7622mL2 s;
    public boolean t;
    public C10367uL2 u;

    public ServiceConnectionC10024tL2(Context context, ComponentName componentName) {
        super(context, new C4553dQ1(componentName));
        this.p = new ArrayList();
        this.n = componentName;
        this.o = new HandlerC8310oL2();
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC4896eQ1 d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return j(str, null);
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC4896eQ1 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return j(str, str2);
    }

    @Override // defpackage.AbstractC5584gQ1
    public final void f(WP1 wp1) {
        if (this.t) {
            C7622mL2 c7622mL2 = this.s;
            int i = c7622mL2.d;
            c7622mL2.d = i + 1;
            c7622mL2.b(10, i, 0, wp1 != null ? wp1.a : null, null);
        }
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r9, android.os.IBinder r10) {
        /*
            r8 = this;
            boolean r9 = r8.r
            if (r9 == 0) goto L61
            r8.k()
            if (r10 == 0) goto Lf
            android.os.Messenger r9 = new android.os.Messenger
            r9.<init>(r10)
            goto L10
        Lf:
            r9 = 0
        L10:
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L1c
            android.os.IBinder r1 = r9.getBinder()     // Catch: java.lang.NullPointerException -> L1c
            if (r1 == 0) goto L1c
            r1 = r10
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L4b
            mL2 r1 = new mL2
            r1.<init>(r8, r9)
            int r4 = r1.d
            int r9 = r4 + 1
            r1.d = r9
            r1.g = r4
            r3 = 1
            r5 = 4
            r6 = 0
            r7 = 0
            r2 = r1
            boolean r9 = r2.b(r3, r4, r5, r6, r7)
            if (r9 != 0) goto L38
            goto L45
        L38:
            android.os.Messenger r9 = r1.a     // Catch: android.os.RemoteException -> L42
            android.os.IBinder r9 = r9.getBinder()     // Catch: android.os.RemoteException -> L42
            r9.linkToDeath(r1, r0)     // Catch: android.os.RemoteException -> L42
            goto L46
        L42:
            r1.binderDied()
        L45:
            r10 = r0
        L46:
            if (r10 == 0) goto L61
            r8.s = r1
            goto L61
        L4b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r10 = ": Service returned invalid messenger binder"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MediaRouteProviderProxy"
            android.util.Log.e(r10, r9)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ServiceConnectionC10024tL2.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final String toString() {
        return "Service connection " + this.n.flattenToShortString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:            if (r2.p.isEmpty() == false) goto L11;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r2 = this;
            boolean r0 = r2.q
            if (r0 == 0) goto L13
            WP1 r0 = r2.j
            r1 = 1
            if (r0 == 0) goto La
            goto L14
        La:
            java.util.ArrayList r0 = r2.p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L1a
            r2.i()
            goto L1d
        L1a:
            r2.l()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ServiceConnectionC10024tL2.m():void");
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC3866bQ1 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        C5928hQ1 c5928hQ1 = this.l;
        if (c5928hQ1 != null) {
            List list = c5928hQ1.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((TP1) list.get(i)).d().equals(str)) {
                    C9338rL2 c9338rL2 = new C9338rL2(this, str);
                    this.p.add(c9338rL2);
                    if (this.t) {
                        c9338rL2.b(this.s);
                    }
                    m();
                    return c9338rL2;
                }
            }
        }
        return null;
    }

    public final C9681sL2 j(String str, String str2) {
        C5928hQ1 c5928hQ1 = this.l;
        if (c5928hQ1 == null) {
            return null;
        }
        List list = c5928hQ1.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((TP1) list.get(i)).d().equals(str)) {
                C9681sL2 c9681sL2 = new C9681sL2(this, str, str2);
                this.p.add(c9681sL2);
                if (this.t) {
                    c9681sL2.b(this.s);
                }
                m();
                return c9681sL2;
            }
        }
        return null;
    }

    public final void i() {
        if (this.r) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.n);
        try {
            this.r = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final void l() {
        if (this.r) {
            this.r = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void k() {
        if (this.s != null) {
            g(null);
            this.t = false;
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC7966nL2) arrayList.get(i)).c();
            }
            C7622mL2 c7622mL2 = this.s;
            c7622mL2.b(2, 0, 0, null, null);
            c7622mL2.b.a.clear();
            c7622mL2.a.getBinder().unlinkToDeath(c7622mL2, 0);
            c7622mL2.i.o.post(new RunnableC6934kL2(c7622mL2));
            this.s = null;
        }
    }
}
