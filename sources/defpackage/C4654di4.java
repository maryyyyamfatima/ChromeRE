package defpackage;

import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.View;
import org.chromium.chrome.browser.compositor.CompositorView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: di4 */
/* loaded from: classes4.dex */
public final class C4654di4 implements InterfaceC7861n20 {
    public int a = 0;
    public Surface g;
    public int h;
    public int i;
    public int j;
    public final InterfaceC7517m20 k;

    @Override // defpackage.InterfaceC7861n20
    public final void a() {
    }

    @Override // defpackage.InterfaceC7861n20
    public final View b() {
        return null;
    }

    @Override // defpackage.InterfaceC7861n20
    public final void c(boolean z) {
    }

    @Override // defpackage.InterfaceC7861n20
    public final void d() {
    }

    @Override // defpackage.InterfaceC7861n20
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.InterfaceC7861n20
    public final void f(int i) {
    }

    public C4654di4(CompositorView compositorView) {
        this.k = compositorView;
    }

    public final void i(Surface surface, int i, int i2) {
        if (this.a == 2) {
            g();
        }
        this.g = surface;
        this.h = -1;
        this.i = i;
        this.j = i2;
        if (this.a == 1) {
            CompositorView compositorView = (CompositorView) this.k;
            compositorView.h(surface);
            compositorView.g(this.g, this.h, this.i, this.j);
            this.a = 2;
        }
    }

    @Override // defpackage.InterfaceC7861n20
    public final void g() {
        if (this.a == 2) {
            ((CompositorView) this.k).i(this.g, true);
        }
        this.a = 0;
    }

    @Override // defpackage.InterfaceC7861n20
    public final void h(int i) {
        if (this.g == null) {
            this.a = 1;
            return;
        }
        if (this.a == 2) {
            g();
        }
        Surface surface = this.g;
        InterfaceC7517m20 interfaceC7517m20 = this.k;
        ((CompositorView) interfaceC7517m20).h(surface);
        ((CompositorView) interfaceC7517m20).g(this.g, this.h, this.i, this.j);
        this.a = 2;
    }
}
