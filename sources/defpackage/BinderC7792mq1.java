package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mq1 */
/* loaded from: classes.dex */
public final class BinderC7792mq1 extends AbstractBinderC0392Da1 {
    public final /* synthetic */ C8136nq1 a;

    public BinderC7792mq1(C8136nq1 c8136nq1) {
        this.a = c8136nq1;
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void j(final int i) {
        C8136nq1.f(this.a).post(new Runnable() { // from class: iq1
            @Override // java.lang.Runnable
            public final void run() {
                BinderC7792mq1 binderC7792mq1 = BinderC7792mq1.this;
                int i2 = i;
                C8136nq1 c8136nq1 = binderC7792mq1.a;
                c8136nq1.y = -1;
                c8136nq1.z = -1;
                c8136nq1.u = null;
                c8136nq1.v = null;
                c8136nq1.w = 0.0d;
                c8136nq1.i();
                c8136nq1.x = false;
                c8136nq1.A = null;
                C8136nq1 c8136nq12 = binderC7792mq1.a;
                c8136nq12.m = 1;
                synchronized (c8136nq12.F) {
                    Iterator it = binderC7792mq1.a.F.iterator();
                    while (it.hasNext()) {
                        ((PH) it.next()).d(i2);
                    }
                }
                binderC7792mq1.a.l();
                C8136nq1 c8136nq13 = binderC7792mq1.a;
                BinderC7792mq1 binderC7792mq12 = c8136nq13.k;
                new HandlerC10413uU3(c8136nq13.f);
                c8136nq13.e(new YD1(binderC7792mq12, "castDeviceControllerListenerKey"), 8415);
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void p0(final int i) {
        C8136nq1.f(this.a).post(new Runnable() { // from class: lq1
            @Override // java.lang.Runnable
            public final void run() {
                BinderC7792mq1 binderC7792mq1 = BinderC7792mq1.this;
                int i2 = i;
                if (i2 == 0) {
                    C8136nq1 c8136nq1 = binderC7792mq1.a;
                    c8136nq1.m = 2;
                    c8136nq1.n = true;
                    c8136nq1.o = true;
                    synchronized (c8136nq1.F) {
                        Iterator it = binderC7792mq1.a.F.iterator();
                        while (it.hasNext()) {
                            ((PH) it.next()).a();
                        }
                    }
                    return;
                }
                C8136nq1 c8136nq12 = binderC7792mq1.a;
                c8136nq12.m = 1;
                synchronized (c8136nq12.F) {
                    Iterator it2 = binderC7792mq1.a.F.iterator();
                    while (it2.hasNext()) {
                        ((PH) it2.next()).b(i2);
                    }
                }
                binderC7792mq1.a.l();
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void d1(final int i) {
        C8136nq1.f(this.a).post(new Runnable() { // from class: jq1
            @Override // java.lang.Runnable
            public final void run() {
                BinderC7792mq1 binderC7792mq1 = BinderC7792mq1.this;
                int i2 = i;
                C8136nq1 c8136nq1 = binderC7792mq1.a;
                c8136nq1.m = 3;
                synchronized (c8136nq1.F) {
                    Iterator it = binderC7792mq1.a.F.iterator();
                    while (it.hasNext()) {
                        ((PH) it.next()).c(i2);
                    }
                }
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void N(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C8136nq1 c8136nq1 = this.a;
        c8136nq1.u = applicationMetadata;
        c8136nq1.v = str;
        C7255lH c7255lH = new C7255lH(new Status(0, null, 0), applicationMetadata, str, str2, z);
        synchronized (c8136nq1.s) {
            C6905kF3 c6905kF3 = c8136nq1.p;
            if (c6905kF3 != null) {
                c6905kF3.b(c7255lH);
            }
            c8136nq1.p = null;
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void A(int i) {
        C8136nq1 c8136nq1 = this.a;
        synchronized (c8136nq1.s) {
            C6905kF3 c6905kF3 = c8136nq1.p;
            if (c6905kF3 != null) {
                c6905kF3.a(AbstractC10800vd.a(new Status(i, null)));
            }
            c8136nq1.p = null;
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void C0(int i) {
        C8136nq1.h(this.a, i);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void O0(int i) {
        C8136nq1.h(this.a, i);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void T0(final int i) {
        C8136nq1 c8136nq1 = this.a;
        C8136nq1.h(c8136nq1, i);
        if (c8136nq1.E != null) {
            C8136nq1.f(c8136nq1).post(new Runnable() { // from class: gq1
                @Override // java.lang.Runnable
                public final void run() {
                    BinderC7792mq1.this.a.E.b(i);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void k() {
        C8136nq1.G.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void R(final DeviceStatus deviceStatus) {
        C8136nq1.f(this.a).post(new Runnable() { // from class: hq1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                C8136nq1 c8136nq1 = BinderC7792mq1.this.a;
                c8136nq1.getClass();
                DeviceStatus deviceStatus2 = deviceStatus;
                ApplicationMetadata applicationMetadata = deviceStatus2.i;
                boolean a = WH.a(applicationMetadata, c8136nq1.u);
                YG yg = c8136nq1.E;
                if (!a) {
                    c8136nq1.u = applicationMetadata;
                    yg.c(applicationMetadata);
                }
                double d = deviceStatus2.a;
                if (Double.isNaN(d) || Math.abs(d - c8136nq1.w) <= 1.0E-7d) {
                    z = false;
                } else {
                    c8136nq1.w = d;
                    z = true;
                }
                boolean z4 = c8136nq1.x;
                boolean z5 = deviceStatus2.g;
                if (z5 != z4) {
                    c8136nq1.x = z5;
                    z = true;
                }
                Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(c8136nq1.n)};
                C4856eI1 c4856eI1 = C8136nq1.G;
                c4856eI1.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
                if (yg != null && (z || c8136nq1.n)) {
                    yg.f();
                }
                Double.isNaN(deviceStatus2.l);
                int i = c8136nq1.y;
                int i2 = deviceStatus2.h;
                if (i2 != i) {
                    c8136nq1.y = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                c4856eI1.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c8136nq1.n));
                if (yg != null && (z2 || c8136nq1.n)) {
                    yg.a(c8136nq1.y);
                }
                int i3 = c8136nq1.z;
                int i4 = deviceStatus2.j;
                if (i4 != i3) {
                    c8136nq1.z = i4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4856eI1.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c8136nq1.n));
                if (yg != null && (z3 || c8136nq1.n)) {
                    yg.e(c8136nq1.z);
                }
                EqualizerSettings equalizerSettings = c8136nq1.A;
                EqualizerSettings equalizerSettings2 = deviceStatus2.k;
                if (!WH.a(equalizerSettings, equalizerSettings2)) {
                    c8136nq1.A = equalizerSettings2;
                }
                c8136nq1.n = false;
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void y(final ApplicationStatus applicationStatus) {
        C8136nq1.f(this.a).post(new Runnable() { // from class: fq1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C8136nq1 c8136nq1 = BinderC7792mq1.this.a;
                c8136nq1.getClass();
                String str = applicationStatus.a;
                if (WH.a(str, c8136nq1.v)) {
                    z = false;
                } else {
                    c8136nq1.v = str;
                    z = true;
                }
                C8136nq1.G.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c8136nq1.o));
                YG yg = c8136nq1.E;
                if (yg != null && (z || c8136nq1.o)) {
                    yg.d();
                }
                c8136nq1.o = false;
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void A0(final String str, final String str2) {
        C8136nq1.G.a("Receive (type=text, ns=%s) %s", str, str2);
        C8136nq1.f(this.a).post(new Runnable() { // from class: kq1
            @Override // java.lang.Runnable
            public final void run() {
                ZG zg;
                BinderC7792mq1 binderC7792mq1 = BinderC7792mq1.this;
                String str3 = str;
                String str4 = str2;
                synchronized (binderC7792mq1.a.D) {
                    zg = (ZG) binderC7792mq1.a.D.get(str3);
                }
                if (zg != null) {
                    zg.a(binderC7792mq1.a.B, str3, str4);
                } else {
                    C8136nq1.G.a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void c1(String str, byte[] bArr) {
        C8136nq1.G.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void f0(int i, long j) {
        C8136nq1.g(this.a, j, i);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void z0(long j) {
        C8136nq1.g(this.a, j, 0);
    }
}
