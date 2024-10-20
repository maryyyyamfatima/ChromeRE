package defpackage;

import J.N;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.chromium.chrome.browser.compositor.CompositorView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallback2C9576s20 implements SurfaceHolder.Callback2, InterfaceC7861n20 {
    public final C9233r20 a;
    public final C9233r20 g;
    public C9233r20 h;
    public C9233r20 i;
    public final InterfaceC7517m20 j;
    public final ViewGroup k;

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public SurfaceHolderCallback2C9576s20(ViewGroup viewGroup, InterfaceC7517m20 interfaceC7517m20) {
        this.k = viewGroup;
        this.j = interfaceC7517m20;
        this.a = new C9233r20(viewGroup.getContext(), -3, this);
        this.g = new C9233r20(viewGroup.getContext(), -1, this);
    }

    @Override // defpackage.InterfaceC7861n20
    public final void g() {
        this.i = null;
        C9233r20 c9233r20 = this.g;
        k(c9233r20);
        C9233r20 c9233r202 = this.a;
        k(c9233r202);
        c9233r202.b().removeCallback(this);
        c9233r20.b().removeCallback(this);
    }

    @Override // defpackage.InterfaceC7861n20
    public final void h(int i) {
        AbstractC4851eH1.d("CompositorSurfaceMgr", "Transitioning to surface with format: %d", Integer.valueOf(i));
        C9233r20 c9233r20 = i == -3 ? this.a : this.g;
        this.i = c9233r20;
        if (c9233r20.c) {
            return;
        }
        if (!c9233r20.a()) {
            i(this.i);
            return;
        }
        if (this.i.b) {
            return;
        }
        l(this.h, false);
        C9233r20 c9233r202 = this.i;
        if (c9233r202 == null) {
            return;
        }
        this.h = c9233r202;
        Surface surface = c9233r202.b().getSurface();
        CompositorView compositorView = (CompositorView) this.j;
        compositorView.h(surface);
        C9233r20 c9233r203 = this.h;
        if (c9233r203.d != 0) {
            Surface surface2 = c9233r203.b().getSurface();
            C9233r20 c9233r204 = this.h;
            compositorView.g(surface2, c9233r204.d, c9233r204.e, c9233r204.f);
        }
    }

    @Override // defpackage.InterfaceC7861n20
    public final void a() {
        C9233r20 c9233r20 = this.h;
        if (c9233r20 == null) {
            return;
        }
        C9233r20 c9233r202 = this.a;
        if (c9233r20 == c9233r202) {
            c9233r202 = this.g;
        }
        if (this.i == c9233r202) {
            return;
        }
        j(c9233r202);
    }

    @Override // defpackage.InterfaceC7861n20
    public final void d() {
        if (this.h == null) {
            return;
        }
        this.k.post(new RunnableC8205o20(this));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C9233r20 m = m(surfaceHolder);
        if (m == this.h && m == this.i) {
            m.e = i2;
            m.f = i3;
            m.d = i;
            ((CompositorView) this.j).g(surfaceHolder.getSurface(), i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        ((CompositorView) this.j).j(runnable);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C9233r20 m = m(surfaceHolder);
        AbstractC4851eH1.d("CompositorSurfaceMgr", "surfaceCreated format: %d", Integer.valueOf(m.d));
        if (m != this.i) {
            j(m);
            return;
        }
        m.b = false;
        m.d = 0;
        l(this.h, false);
        C9233r20 c9233r20 = this.i;
        this.h = c9233r20;
        ((CompositorView) this.j).h(c9233r20.b().getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C9233r20 m = m(surfaceHolder);
        AbstractC4851eH1.a("CompositorSurfaceMgr", "surfaceDestroyed format : " + m.d, new Object[0]);
        if (!m.c) {
            m.b = true;
        } else if (!m.a()) {
            m.c = false;
        }
        m.d = 0;
        C9233r20 c9233r20 = this.h;
        if (m == c9233r20) {
            l(c9233r20, true);
            return;
        }
        CompositorView compositorView = (CompositorView) this.j;
        N.MVesqb5U(compositorView.k, compositorView);
        if (m != this.i || m.a()) {
            if (m == this.i || !m.a()) {
                return;
            }
            j(m);
            return;
        }
        m.b = true;
        this.k.post(new RunnableC8548p20(this, m));
    }

    @Override // defpackage.InterfaceC7861n20
    public final void e(Drawable drawable) {
        this.a.a.setBackgroundDrawable(drawable);
        this.g.a.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.InterfaceC7861n20
    public final void c(boolean z) {
        this.a.a.setWillNotDraw(z);
        this.g.a.setWillNotDraw(z);
    }

    @Override // defpackage.InterfaceC7861n20
    public final void f(int i) {
        this.a.a.setVisibility(i);
        this.g.a.setVisibility(i);
    }

    @Override // defpackage.InterfaceC7861n20
    public final View b() {
        C9233r20 c9233r20 = this.h;
        if (c9233r20 == null) {
            return null;
        }
        return c9233r20.a;
    }

    public final C9233r20 m(SurfaceHolder surfaceHolder) {
        C9233r20 c9233r20 = this.a;
        if (c9233r20.b() == surfaceHolder) {
            return c9233r20;
        }
        C9233r20 c9233r202 = this.g;
        if (c9233r202.b() == surfaceHolder) {
            return c9233r202;
        }
        return null;
    }

    public final void i(C9233r20 c9233r20) {
        if (c9233r20.a() || c9233r20.c) {
            return;
        }
        c9233r20.b = true;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup = this.k;
        c9233r20.g = viewGroup;
        SurfaceView surfaceView = c9233r20.a;
        viewGroup.addView(surfaceView, layoutParams);
        viewGroup.bringChildToFront(surfaceView);
        viewGroup.postInvalidateOnAnimation();
    }

    public final void l(C9233r20 c9233r20, boolean z) {
        C9233r20 c9233r202 = this.h;
        if (c9233r202 != c9233r20 || c9233r20 == null) {
            return;
        }
        ((CompositorView) this.j).i(c9233r202.b().getSurface(), z);
        this.h = null;
    }

    public final void k(C9233r20 c9233r20) {
        if (c9233r20.a()) {
            Surface surface = c9233r20.b().getSurface();
            boolean isValid = surface == null ? false : surface.isValid();
            c9233r20.c = isValid;
            AbstractC4851eH1.d("CompositorSurfaceMgr", "SurfaceState : detach from parent : %d", Integer.valueOf(c9233r20.d));
            ViewGroup viewGroup = c9233r20.g;
            c9233r20.g = null;
            viewGroup.removeView(c9233r20.a);
            if (isValid) {
                return;
            }
        }
        l(c9233r20, false);
        C9233r20 c9233r202 = this.i;
        if (c9233r20 == c9233r202) {
            i(c9233r202);
        }
    }

    public final void j(C9233r20 c9233r20) {
        if (c9233r20.a()) {
            c9233r20.c = true;
            this.k.post(new RunnableC8891q20(this, c9233r20));
        }
    }
}
