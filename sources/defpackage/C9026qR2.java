package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
import org.chromium.mojo.system.impl.CoreImpl;
import org.chromium.mojo.system.impl.WatcherImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qR2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9026qR2 implements InterfaceC7652mR2 {
    public final C7873n40 a;
    public EV1 g;
    public long h;
    public final HashMap i;
    public final Executor j;

    public final void b() {
        C7873n40 c7873n40 = this.a;
        c7873n40.getClass();
        C7215l90 c7215l90 = C7215l90.c;
        c7873n40.h.a(c7873n40.g, c7215l90, c7873n40.a);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        return this.a.A(c8697pU1);
    }

    @Override // defpackage.EV1
    public final boolean Y(C8697pU1 c8697pU1, DV1 dv1) {
        C10620v43 a = c8697pU1.a();
        long j = this.h;
        long j2 = j + 1;
        this.h = j2;
        if (j == 0) {
            this.h = 1 + j2;
            j = j2;
        }
        HashMap hashMap = this.i;
        if (!hashMap.containsKey(Long.valueOf(j))) {
            C5953hV1 c5953hV1 = a.d;
            c5953hV1.getClass();
            a.a.putLong(24, j);
            c5953hV1.d = j;
            if (!this.a.A(a)) {
                return false;
            }
            hashMap.put(Long.valueOf(j), dv1);
            return true;
        }
        throw new IllegalStateException("Unable to find a new request identifier.");
    }

    public C9026qR2(InterfaceC11102wV1 interfaceC11102wV1) {
        WatcherImpl watcherImpl;
        if (interfaceC11102wV1.J0() != null) {
            ((CoreImpl) interfaceC11102wV1.J0()).getClass();
            watcherImpl = new WatcherImpl();
        } else {
            watcherImpl = null;
        }
        this.h = 1L;
        this.i = new HashMap();
        C7873n40 c7873n40 = new C7873n40(interfaceC11102wV1, watcherImpl);
        this.a = c7873n40;
        c7873n40.i = new C8340oR2(this);
        InterfaceC7559m90 J0 = interfaceC11102wV1.J0();
        if (J0 != null) {
            this.j = AbstractC9987tE0.a(J0);
        } else {
            this.j = null;
        }
    }

    @Override // defpackage.A51
    public final InterfaceC11102wV1 n0() {
        return this.a.n0();
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
