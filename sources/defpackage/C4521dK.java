package defpackage;

import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4521dK implements UJ {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5896hK c;

    @Override // defpackage.UJ
    public final void c() {
    }

    public C4521dK(C5896hK c5896hK, boolean z, boolean z2) {
        this.c = c5896hK;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.UJ
    public final void b(VJ vj) {
        AbstractC4851eH1.a("ChildProcLauncher", "ChildProcessConnection.start failed, trying again", new Object[0]);
        this.c.a.post(new RunnableC4177cK(this));
    }

    @Override // defpackage.UJ
    public final void a(VJ vj) {
        C5896hK c5896hK = this.c;
        VJ vj2 = c5896hK.g;
        if ((vj2 == null ? 0 : vj2.o) != 0) {
            C8645pK c8645pK = (C8645pK) c5896hK.b;
            c8645pK.getClass();
            int i = vj2.o;
            if (i == 0 || ((ChildProcessLauncherHelperImpl) ChildProcessLauncherHelperImpl.r.remove(Integer.valueOf(i))) == null) {
                return;
            }
            ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = c8645pK.a.b;
            if (componentCallbacks2C2974Wx != null && componentCallbacks2C2974Wx.a.remove(vj2)) {
                if (vj2 == componentCallbacks2C2974Wx.i) {
                    componentCallbacks2C2974Wx.i = null;
                } else {
                    vj2.j();
                }
            }
            ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = c8645pK.a;
            C11045wK c11045wK = childProcessLauncherHelperImpl.a;
            if (c11045wK != null) {
                int size = (c11045wK.h.size() - 1) - c11045wK.b(vj2);
                synchronized (childProcessLauncherHelperImpl.k) {
                    childProcessLauncherHelperImpl.l = size;
                }
                C11045wK c11045wK2 = c8645pK.a.a;
                c11045wK2.h.remove(c11045wK2.b(vj2));
                ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx2 = c8645pK.a.b;
                if (componentCallbacks2C2974Wx2 != null) {
                    componentCallbacks2C2974Wx2.b();
                }
            }
            if (c8645pK.a.c) {
                C3490aK.a().c.remove(vj2);
            }
        }
    }
}
