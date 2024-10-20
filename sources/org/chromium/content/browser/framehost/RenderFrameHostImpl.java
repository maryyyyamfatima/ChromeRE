package org.chromium.content.browser.framehost;

import J.N;
import defpackage.AbstractC10647v90;
import defpackage.AbstractC6754jp1;
import defpackage.C8433oi2;
import defpackage.InterfaceC11102wV1;
import defpackage.InterfaceC7098kp1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RenderFrameHostImpl implements RenderFrameHost {
    public long a;
    public final RenderFrameHostDelegate b;
    public final boolean c;

    public RenderFrameHostImpl(long j, RenderFrameHostDelegate renderFrameHostDelegate, boolean z) {
        this.a = j;
        this.b = renderFrameHostDelegate;
        this.c = z;
        renderFrameHostDelegate.d(this);
    }

    public static RenderFrameHostImpl create(long j, RenderFrameHostDelegate renderFrameHostDelegate, boolean z, int i, int i2) {
        return new RenderFrameHostImpl(j, renderFrameHostDelegate, z);
    }

    public final void clearNativePtr() {
        this.a = 0L;
        this.b.o(this);
    }

    public final long getNativePointer() {
        return this.a;
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final GURL g() {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return (GURL) N.MBg$jIAu(j, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final Origin b() {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return (Origin) N.Mcdslkop(j, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final void h(Callback callback) {
        long j = this.a;
        if (j == 0) {
            callback.onResult(null);
        } else {
            N.MUV0o0vB(j, this, callback);
        }
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final List c() {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList((RenderFrameHost[]) N.MhlVMQ2e(j, this)));
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final boolean m() {
        long j = this.a;
        return j != 0 && N.MqDsGZSU(j, this, 8);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final boolean isIncognito() {
        return this.c;
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final void d() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M$j92GA1(j, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final boolean l() {
        return N.MdnzZzjw(this.a, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final boolean a() {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return N.MtA0PSG$(j, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final InterfaceC7098kp1 e(AbstractC6754jp1 abstractC6754jp1) {
        if (this.a == 0) {
            return null;
        }
        C8433oi2 b = AbstractC10647v90.a.b(null);
        InterfaceC7098kp1 a = abstractC6754jp1.a((InterfaceC11102wV1) b.a, 0);
        N.MXQk8pKb(this.a, this, abstractC6754jp1.e(), ((InterfaceC11102wV1) b.b).g1().E0());
        return a;
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final void k() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MnlCu9CQ(j, this, 241);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final boolean i() {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return N.M6cbowZq(j, this);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final RenderFrameHost.WebAuthSecurityChecksResults j(String str, Origin origin, boolean z) {
        long j = this.a;
        if (j != 0) {
            return (RenderFrameHost.WebAuthSecurityChecksResults) N.M5dgGNo$(j, this, str, origin, z);
        }
        return new RenderFrameHost.WebAuthSecurityChecksResults(23, false);
    }

    public static RenderFrameHost.WebAuthSecurityChecksResults createWebAuthSecurityChecksResults(int i, boolean z) {
        return new RenderFrameHost.WebAuthSecurityChecksResults(i, z);
    }

    @Override // org.chromium.content_public.browser.RenderFrameHost
    public final int f(String str, Origin origin, boolean z) {
        long j = this.a;
        if (j == 0) {
            return 23;
        }
        return N.M2ouq_qG(j, this, str, origin, z);
    }
}
