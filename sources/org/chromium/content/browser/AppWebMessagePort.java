package org.chromium.content.browser;

import J.N;
import android.os.Looper;
import defpackage.AbstractC10647v90;
import defpackage.C10924vy;
import defpackage.C11445xV1;
import defpackage.C11608xx2;
import defpackage.C11788yV1;
import defpackage.C1544Lx;
import defpackage.C1674Mx;
import defpackage.C5263fV;
import defpackage.C5953hV1;
import defpackage.C6158i43;
import defpackage.C6500j43;
import defpackage.C7215l90;
import defpackage.C7404lj;
import defpackage.C7873n40;
import defpackage.C8930q83;
import defpackage.C9045qV1;
import defpackage.C9272r83;
import defpackage.C9958t83;
import defpackage.HY1;
import defpackage.HandlerC7060kj;
import defpackage.InterfaceC3506aN0;
import defpackage.VU3;
import defpackage.W14;
import java.nio.ByteBuffer;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.CoreImpl;
import org.chromium.mojo.system.impl.WatcherImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AppWebMessagePort implements MessagePort {
    public static final C5953hV1 h = new C5953hV1(0);
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final CoreImpl e;
    public C7404lj f;
    public C7873n40 g;

    public AppWebMessagePort(C7404lj c7404lj) {
        WatcherImpl watcherImpl;
        CoreImpl coreImpl = AbstractC10647v90.a;
        this.e = coreImpl;
        this.f = c7404lj;
        long MbOQIpGw = N.MbOQIpGw(c7404lj.a);
        coreImpl.getClass();
        C11445xV1 c11445xV1 = new C11445xV1(new W14(coreImpl, MbOQIpGw));
        if (c11445xV1.J0() != null) {
            ((CoreImpl) c11445xV1.J0()).getClass();
            watcherImpl = new WatcherImpl();
        } else {
            watcherImpl = null;
        }
        C7873n40 c7873n40 = new C7873n40(c11445xV1, watcherImpl);
        c7404lj.g = c7873n40;
        c7873n40.j = c7404lj;
        this.g = c7873n40;
    }

    public static AppWebMessagePort[] createFromNativeBlinkMessagePortDescriptors(long[] jArr) {
        int length = jArr.length;
        AppWebMessagePort[] appWebMessagePortArr = new AppWebMessagePort[length];
        for (int i = 0; i < length; i++) {
            appWebMessagePortArr[i] = new AppWebMessagePort(new C7404lj(jArr[i]));
        }
        return appWebMessagePortArr;
    }

    public final long releaseNativeMessagePortDescriptor() {
        this.b = true;
        this.f.a();
        this.g = null;
        C7404lj c7404lj = this.f;
        this.f = null;
        long j = c7404lj.a;
        c7404lj.a = 0L;
        c7404lj.g = null;
        c7404lj.h = false;
        return j;
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final void close() {
        if (this.b) {
            throw new IllegalStateException("Port is already transferred");
        }
        if (this.a) {
            return;
        }
        this.a = true;
        this.f.a();
        C7404lj c7404lj = this.f;
        long j = c7404lj.a;
        if (j != 0) {
            N.MWkkqfl2(j);
            c7404lj.a = 0L;
            c7404lj.g = null;
            c7404lj.h = false;
        }
        this.g.close();
        this.f = null;
        this.g = null;
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final void a(C9045qV1 c9045qV1) {
        if (this.a || this.b) {
            throw new IllegalStateException("Port is already closed or transferred");
        }
        C11788yV1[] c11788yV1Arr = new C11788yV1[0];
        this.c = true;
        VU3 vu3 = new VU3(0);
        C5263fV c5263fV = new C5263fV(0);
        vu3.b = c5263fV;
        byte[] Mk6SEKCp = N.Mk6SEKCp(c9045qV1.a);
        C1544Lx c1544Lx = new C1544Lx();
        if (Mk6SEKCp.length <= 65536) {
            c1544Lx.a = 0;
            c1544Lx.b = Mk6SEKCp;
        } else {
            CoreImpl coreImpl = AbstractC10647v90.a;
            C1674Mx c1674Mx = new C1674Mx(0);
            C8930q83 c8930q83 = C8930q83.c;
            long length = Mk6SEKCp.length;
            ByteBuffer a = coreImpl.a(8);
            a.putInt(0, 8);
            a.putInt(4, c8930q83.a);
            ResultAnd resultAnd = (ResultAnd) N.MZ0nRPS0(coreImpl, a, length);
            if (resultAnd.a != 0) {
                throw new HY1(resultAnd.a);
            }
            C9958t83 c9958t83 = new C9958t83(coreImpl, ((Long) resultAnd.b).longValue());
            c1674Mx.b = c9958t83;
            c1674Mx.c = Mk6SEKCp.length;
            long length2 = Mk6SEKCp.length;
            C9272r83 c9272r83 = C9272r83.c;
            ByteBuffer g = c9958t83.g(length2);
            g.put(Mk6SEKCp);
            c1674Mx.b.K(g);
            c1544Lx.a = 1;
            c1544Lx.c = c1674Mx;
        }
        c5263fV.b = c1544Lx;
        C5263fV c5263fV2 = vu3.b;
        c5263fV2.c = new C6500j43[0];
        c5263fV2.j = new InterfaceC3506aN0[0];
        c5263fV2.d = null;
        vu3.e = new C6158i43[0];
        vu3.f = new C10924vy[0];
        vu3.c = c11788yV1Arr;
        vu3.d = new C11788yV1[0];
        this.g.A(vu3.c(this.e, h));
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final void b(C11608xx2 c11608xx2) {
        if (this.a || this.b) {
            throw new IllegalStateException("Port is already closed or transferred");
        }
        this.c = true;
        if (c11608xx2 == null) {
            this.g.i = null;
        } else {
            this.g.i = new HandlerC7060kj(Looper.getMainLooper(), c11608xx2);
        }
        if (this.d) {
            return;
        }
        C7873n40 c7873n40 = this.g;
        c7873n40.getClass();
        C7215l90 c7215l90 = C7215l90.c;
        c7873n40.h.a(c7873n40.g, c7215l90, c7873n40.a);
        this.d = true;
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final boolean isClosed() {
        return this.a;
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final boolean c() {
        return this.b;
    }

    @Override // org.chromium.content_public.browser.MessagePort
    public final boolean d() {
        return this.c;
    }
}
