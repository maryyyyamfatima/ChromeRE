package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qH */
/* loaded from: classes.dex */
public final class BinderC8973qH extends AbstractBinderC0392Da1 {
    public final AtomicReference a;
    public final HandlerC10413uU3 g;

    @Override // defpackage.InterfaceC0522Ea1
    public final void d1(int i) {
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void p0(int i) {
    }

    public BinderC8973qH(C9315rH c9315rH) {
        this.a = new AtomicReference(c9315rH);
        this.g = new HandlerC10413uU3(c9315rH.i);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void j(int i) {
        C9315rH c9315rH = null;
        C9315rH c9315rH2 = (C9315rH) this.a.getAndSet(null);
        if (c9315rH2 != null) {
            c9315rH2.S = -1;
            c9315rH2.T = -1;
            c9315rH2.F = null;
            c9315rH2.M = null;
            c9315rH2.Q = 0.0d;
            c9315rH2.z();
            c9315rH2.N = false;
            c9315rH2.R = null;
            c9315rH = c9315rH2;
        }
        if (c9315rH == null) {
            return;
        }
        C9315rH.Z.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            int i2 = c9315rH.B.get();
            HandlerC5758gv handlerC5758gv = c9315rH.k;
            handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(6, i2, 2));
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void N(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        c9315rH.F = applicationMetadata;
        c9315rH.U = applicationMetadata.a;
        c9315rH.V = str2;
        c9315rH.M = str;
        synchronized (C9315rH.a0) {
            try {
                InterfaceC8851pv interfaceC8851pv = c9315rH.Y;
                if (interfaceC8851pv != null) {
                    interfaceC8851pv.a(new C7255lH(new Status(0, null, 0), applicationMetadata, str, str2, z));
                    c9315rH.Y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void A(int i) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        synchronized (C9315rH.a0) {
            InterfaceC8851pv interfaceC8851pv = c9315rH.Y;
            if (interfaceC8851pv != null) {
                interfaceC8851pv.a(new C7255lH(new Status(i, null, 0), null, null, null, false));
                c9315rH.Y = null;
            }
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void C0(int i) {
        if (((C9315rH) this.a.get()) == null) {
            return;
        }
        synchronized (C9315rH.b0) {
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void O0(int i) {
        if (((C9315rH) this.a.get()) == null) {
            return;
        }
        synchronized (C9315rH.b0) {
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void T0(int i) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        c9315rH.U = null;
        c9315rH.V = null;
        synchronized (C9315rH.b0) {
        }
        if (c9315rH.H != null) {
            this.g.post(new RunnableC7599mH(c9315rH, i));
        }
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void k() {
        C9315rH.Z.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void R(DeviceStatus deviceStatus) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        C9315rH.Z.a("onDeviceStatusChanged", new Object[0]);
        this.g.post(new RunnableC7943nH(c9315rH, deviceStatus));
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void y(ApplicationStatus applicationStatus) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        C9315rH.Z.a("onApplicationStatusChanged", new Object[0]);
        this.g.post(new RunnableC8287oH(c9315rH, applicationStatus));
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void A0(String str, String str2) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        C9315rH.Z.a("Receive (type=text, ns=%s) %s", str, str2);
        this.g.post(new RunnableC8630pH(c9315rH, str, str2));
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void c1(String str, byte[] bArr) {
        if (((C9315rH) this.a.get()) == null) {
            return;
        }
        C9315rH.Z.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void f0(int i, long j) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        C9315rH.y(c9315rH, j, i);
    }

    @Override // defpackage.InterfaceC0522Ea1
    public final void z0(long j) {
        C9315rH c9315rH = (C9315rH) this.a.get();
        if (c9315rH == null) {
            return;
        }
        C9315rH.y(c9315rH, j, 0);
    }
}
