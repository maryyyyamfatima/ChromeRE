package defpackage;

import J.N;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4779e40 implements G22 {
    public InterfaceC4436d40 a;
    public final String h;
    public String k;
    public int m;
    public RunnableC3749b40 o;
    public int i = 0;
    public int j = 0;
    public int l = 0;
    public final C4092c40 g = new C4092c40();
    public final Handler n = new Handler();

    public C4779e40(InterfaceC4436d40 interfaceC4436d40, String str) {
        this.a = interfaceC4436d40;
        this.h = str;
        NetworkChangeNotifier.a(this);
        b(NetworkChangeNotifier.f.getCurrentConnectionType());
    }

    @Override // defpackage.G22
    public final void b(int i) {
        boolean z = this.i != i;
        this.i = i;
        AbstractC4851eH1.d("OfflineIndicator", "onConnectionTypeChanged " + this.i, new Object[0]);
        if (this.i == 6) {
            f(1);
            g();
        } else if (z || this.l == 0) {
            g();
            c();
        }
    }

    public final void c() {
        int i = 1;
        this.l = 1;
        this.m = 0;
        SystemClock.elapsedRealtime();
        this.g.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            i = 0;
        } else {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks.length != 0) {
                int length = allNetworks.length;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 < length) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i2]);
                        if (networkCapabilities != null) {
                            AbstractC4851eH1.d("OfflineIndicator", "Reported by system: " + networkCapabilities.toString(), new Object[0]);
                            if (networkCapabilities.hasCapability(16) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(13)) {
                                i = 4;
                                break;
                            } else if (networkCapabilities.hasCapability(17)) {
                                z = true;
                            }
                        }
                        i2++;
                    } else {
                        i = z ? 3 : 2;
                    }
                }
            }
        }
        if (i != 0) {
            f(i);
            d();
        } else {
            if (this.k == null) {
                this.k = N.M5LbL2nl();
            }
            this.l = 2;
            a();
        }
    }

    public final void g() {
        if (this.l == 0) {
            return;
        }
        RunnableC3749b40 runnableC3749b40 = this.o;
        if (runnableC3749b40 != null) {
            this.n.removeCallbacks(runnableC3749b40);
            this.o = null;
        }
        this.l = 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Z30] */
    public final void a() {
        this.g.getClass();
        boolean z = this.l == 2;
        new C3405a40(this, z ? "https://www.google.com/generate_204" : "http://connectivitycheck.gstatic.com/generate_204", new Callback() { // from class: Z30
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:            if (r9 != 5) goto L20;     */
            @Override // org.chromium.base.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onResult(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    e40 r0 = defpackage.C4779e40.this
                    r0.getClass()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "sendHttpProbe returned with result="
                    r1.<init>(r2)
                    r1.append(r9)
                    java.lang.String r2 = " and mConnectivityCheckingStage="
                    r1.append(r2)
                    int r2 = r0.l
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r2 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    java.lang.String r4 = "OfflineIndicator"
                    defpackage.AbstractC4851eH1.d(r4, r1, r3)
                    int r1 = r0.l
                    r3 = 6
                    java.lang.String r5 = r0.h
                    r6 = 2
                    if (r1 != r6) goto L3d
                    java.lang.String r1 = "ConnectivityDetector.DefaultHttpProbeResult."
                    java.lang.String r1 = defpackage.AbstractC4809e90.a(r1, r5)
                    int r7 = r9.intValue()
                    defpackage.EI2.h(r7, r3, r1)
                    goto L4a
                L3d:
                    java.lang.String r1 = "ConnectivityDetector.FallbackHttpProbeResult."
                    java.lang.String r1 = defpackage.AbstractC4809e90.a(r1, r5)
                    int r7 = r9.intValue()
                    defpackage.EI2.h(r7, r3, r1)
                L4a:
                    int r1 = r0.i
                    if (r1 != r3) goto L4f
                    goto L8a
                L4f:
                    int r9 = r9.intValue()
                    int r1 = r0.j
                    java.lang.String r3 = "updateConnectionStatePerProbeResult result="
                    java.lang.String r3 = defpackage.AbstractC9076qb1.a(r3, r9)
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    defpackage.AbstractC4851eH1.d(r4, r3, r2)
                    r2 = 5
                    if (r9 == 0) goto L70
                    r3 = 3
                    if (r9 == r6) goto L6e
                    r6 = 4
                    if (r9 == r3) goto L70
                    if (r9 == r6) goto L70
                    if (r9 == r2) goto L70
                    goto L71
                L6e:
                    r1 = r3
                    goto L71
                L70:
                    r1 = r6
                L71:
                    r0.f(r1)
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r1 = "ConnectivityDetector.ConnectionState."
                    r9.<init>(r1)
                    r9.append(r5)
                    java.lang.String r9 = r9.toString()
                    int r1 = r0.j
                    defpackage.EI2.h(r1, r2, r9)
                    r0.d()
                L8a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Z30.onResult(java.lang.Object):void");
            }
        }).c(AbstractC0185Bl.e);
    }

    public final void d() {
        AbstractC4851eH1.d("OfflineIndicator", "processConnectivityCheckResult mConnectionState=" + this.j + " mConnectivityCheckingStage=" + this.l, new Object[0]);
        if (this.j == 4) {
            g();
            return;
        }
        int i = this.l;
        if (i == 1) {
            e();
            return;
        }
        if (i == 2) {
            this.l = 3;
            a();
        } else {
            if (i != 3) {
                return;
            }
            this.l = 2;
            e();
        }
    }

    public final void e() {
        AbstractC4851eH1.d("OfflineIndicator", "scheduleNextConnectivityCheck", new Object[0]);
        int i = this.m;
        if (i == 0) {
            this.m = 5000;
        } else {
            this.m = i * 2;
        }
        if (this.m >= 120000) {
            this.m = 120000;
            AbstractC4851eH1.d("OfflineIndicator", "No more retry after exceeding 120000ms", new Object[0]);
            if (this.j == 0) {
                f(2);
                return;
            }
            return;
        }
        AbstractC4851eH1.d("OfflineIndicator", AbstractC8207o22.a(new StringBuilder("Retry after "), this.m, "ms"), new Object[0]);
        RunnableC3749b40 runnableC3749b40 = new RunnableC3749b40(this);
        this.o = runnableC3749b40;
        this.n.postDelayed(runnableC3749b40, this.m);
    }

    public final void f(int i) {
        AbstractC4851eH1.d("OfflineIndicator", AbstractC9076qb1.a("setConnectionState connectionState=", i), new Object[0]);
        if (this.j == i) {
            return;
        }
        this.j = i;
        InterfaceC4436d40 interfaceC4436d40 = this.a;
        if (interfaceC4436d40 != null) {
            interfaceC4436d40.c(i);
        }
    }
}
