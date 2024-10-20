package defpackage;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xW0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class TextureViewSurfaceTextureListenerC11449xW0 extends TextureView implements TextureView.SurfaceTextureListener, AW0 {
    public final WeakReference a;
    public C11792yW0 g;
    public InterfaceC10034tN2 h;
    public boolean i;
    public InterfaceC1276Jv0 j;
    public C10837vj0 k;
    public C2780Vk0 l;
    public int m;
    public boolean n;

    @Override // defpackage.AW0
    public final void f() {
    }

    @Override // defpackage.AW0
    public final void o() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC11449xW0(Activity activity) {
        super(activity);
        this.a = new WeakReference(this);
        setSurfaceTextureListener(this);
    }

    public final void finalize() {
        try {
            C11792yW0 c11792yW0 = this.g;
            if (c11792yW0 != null) {
                c11792yW0.h();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.AW0
    public final void l() {
        this.n = true;
    }

    @Override // defpackage.AW0
    public final boolean g() {
        return this.g.a();
    }

    @Override // defpackage.AW0
    public final void c() {
        this.g.i(0);
    }

    @Override // defpackage.AW0
    public final void e() {
        C11792yW0 c11792yW0 = this.g;
        c11792yW0.getClass();
        C12135zW0 c12135zW0 = C11792yW0.y;
        synchronized (c12135zW0) {
            c11792yW0.s = true;
            c12135zW0.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.g.l();
        this.g.f(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.g.m();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.g.f(i, i2);
    }

    @Override // defpackage.AW0
    public final void onPause() {
        this.g.d();
    }

    @Override // defpackage.AW0
    public final void onResume() {
        this.g.e();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        C11792yW0 c11792yW0;
        boolean z;
        int i;
        super.onAttachedToWindow();
        if (this.i && this.h != null && (c11792yW0 = this.g) != null) {
            C12135zW0 c12135zW0 = C11792yW0.y;
            synchronized (c12135zW0) {
                z = c11792yW0.g;
            }
            if (z) {
                C11792yW0 c11792yW02 = this.g;
                if (c11792yW02 != null) {
                    synchronized (c12135zW0) {
                        i = c11792yW02.r;
                    }
                } else {
                    i = 1;
                }
                C11792yW0 c11792yW03 = new C11792yW0(this.a);
                this.g = c11792yW03;
                if (i != 1) {
                    c11792yW03.i(i);
                }
                this.g.start();
            }
        }
        this.i = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C11792yW0 c11792yW0 = this.g;
        if (c11792yW0 != null) {
            c11792yW0.h();
        }
        this.i = true;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.AW0
    public final void j(C3306Zl1 c3306Zl1) {
        if (this.g == null) {
            this.j = c3306Zl1;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    @Override // defpackage.AW0
    public final void k(InterfaceC10034tN2 interfaceC10034tN2) {
        if (this.g == null) {
            if (this.j == null) {
                this.j = new C1828Ob3(this.m);
            }
            if (this.k == null) {
                this.k = new C10837vj0(this.m);
            }
            if (this.l == null) {
                this.l = new C2780Vk0();
            }
            this.h = interfaceC10034tN2;
            C11792yW0 c11792yW0 = new C11792yW0(this.a);
            this.g = c11792yW0;
            c11792yW0.start();
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    @Override // defpackage.AW0
    public final void n() {
        if (this.g == null) {
            this.m = 2;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    @Override // defpackage.AW0
    public final InterfaceC10034tN2 i() {
        return this.h;
    }

    @Override // defpackage.AW0
    public final InterfaceC1276Jv0 h() {
        return this.j;
    }

    @Override // defpackage.AW0
    public final C10837vj0 d() {
        return this.k;
    }

    @Override // defpackage.AW0
    public final C2780Vk0 b() {
        return this.l;
    }

    @Override // defpackage.AW0
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.AW0
    public final Object a() {
        return getSurfaceTexture();
    }
}
