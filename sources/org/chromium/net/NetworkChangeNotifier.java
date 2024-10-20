package org.chromium.net;

import J.N;
import android.net.Network;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.F22;
import defpackage.FL2;
import defpackage.G22;
import defpackage.S22;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NetworkChangeNotifier {
    public static NetworkChangeNotifier f;
    public a c;
    public int d = 0;
    public int e = 0;
    public final ArrayList a = new ArrayList();
    public final C12157za2 b = new C12157za2();

    public static NetworkChangeNotifier init() {
        if (f == null) {
            f = new NetworkChangeNotifier();
        }
        return f;
    }

    public int getCurrentConnectionType() {
        return this.d;
    }

    public int getCurrentConnectionSubtype() {
        a aVar = this.c;
        if (aVar == null) {
            return 0;
        }
        return aVar.d().a();
    }

    public int getCurrentConnectionCost() {
        return this.e;
    }

    public long getCurrentDefaultNetId() {
        Network b;
        a aVar = this.c;
        if (aVar == null || (b = aVar.g.b()) == null) {
            return -1L;
        }
        return b.getNetworkHandle();
    }

    public long[] getCurrentNetworksAndTypes() {
        a aVar = this.c;
        if (aVar == null) {
            return new long[0];
        }
        Network[] c = a.c(aVar.g, null);
        long[] jArr = new long[c.length * 2];
        int i = 0;
        for (Network network : c) {
            int i2 = i + 1;
            jArr[i] = network.getNetworkHandle();
            i = i2 + 1;
            jArr[i2] = r0.a(r6);
        }
        return jArr;
    }

    public void addNativeObserver(long j) {
        this.a.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public boolean registerNetworkCallbackFailed() {
        a aVar = this.c;
        if (aVar == null) {
            return false;
        }
        return aVar.n;
    }

    public static void a(G22 g22) {
        f.b.a(g22);
    }

    public static boolean b() {
        return f.getCurrentConnectionType() != 6;
    }

    public static void g(G22 g22) {
        f.b.d(g22);
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        NetworkChangeNotifier networkChangeNotifier = f;
        FL2 fl2 = new FL2();
        if (!z) {
            a aVar = networkChangeNotifier.c;
            if (aVar != null) {
                aVar.e.a();
                aVar.f();
                networkChangeNotifier.c = null;
                return;
            }
            return;
        }
        if (networkChangeNotifier.c == null) {
            a aVar2 = new a(new F22(networkChangeNotifier), fl2);
            networkChangeNotifier.c = aVar2;
            S22 d = aVar2.d();
            int b = d.b();
            networkChangeNotifier.d = b;
            networkChangeNotifier.e(b, networkChangeNotifier.getCurrentDefaultNetId());
            int i = d.d ? 2 : 1;
            networkChangeNotifier.e = i;
            networkChangeNotifier.c(i);
            networkChangeNotifier.d(d.a());
        }
    }

    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f;
        if ((networkChangeNotifier.d != 6) != z) {
            int i = z ? 0 : 6;
            networkChangeNotifier.d = i;
            networkChangeNotifier.e(i, networkChangeNotifier.getCurrentDefaultNetId());
            networkChangeNotifier.d(!z ? 1 : 0);
        }
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        f.f(i, j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MiJIMrTb(((Long) it.next()).longValue(), networkChangeNotifier, j);
        }
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MDpuHJTB(((Long) it.next()).longValue(), networkChangeNotifier, j);
        }
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MpF$179U(((Long) it.next()).longValue(), networkChangeNotifier, jArr);
        }
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        f.e(i, j);
    }

    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        f.c(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        f.d(i);
    }

    public final void e(int i, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            N.MbPIImnU(((Long) it.next()).longValue(), this, i, j);
        }
        Iterator it2 = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((G22) c11814ya2.next()).b(i);
            }
        }
    }

    public final void c(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            N.Mg0W7eRL(((Long) it.next()).longValue(), this, i);
        }
    }

    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            N.Mt26m31j(((Long) it.next()).longValue(), this, i);
        }
    }

    public final void f(int i, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            N.MBT1i5cd(((Long) it.next()).longValue(), this, j, i);
        }
    }
}
