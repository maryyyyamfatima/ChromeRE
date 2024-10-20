package defpackage;

import J.N;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.compositor.CompositorView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1215Jj {
    public C1085Ij a;
    public final C0955Hj b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ SurfaceHolderCallback2C1475Lj f;

    public C1215Jj(SurfaceHolderCallback2C1475Lj surfaceHolderCallback2C1475Lj, boolean z) {
        this.f = surfaceHolderCallback2C1475Lj;
        boolean z2 = surfaceHolderCallback2C1475Lj.n && !z;
        this.c = z2;
        CompositorView compositorView = surfaceHolderCallback2C1475Lj.g.c;
        compositorView.t = true;
        if (z2) {
            N.M$Spxfoj(compositorView.k, compositorView, true);
            compositorView.h = true;
            compositorView.g.h(compositorView.b());
        }
        N.MfNGeyza(compositorView.k, compositorView, true);
        compositorView.g.g();
        compositorView.a();
        C1085Ij c1085Ij = new C1085Ij(this, surfaceHolderCallback2C1475Lj.h);
        this.a = c1085Ij;
        c1085Ij.getHolder().setFormat(-3);
        this.a.getHolder().addCallback(surfaceHolderCallback2C1475Lj);
        this.a.setKeepScreenOn(true);
        this.a.setZOrderMediaOverlay(!z2);
        this.a.setOnTouchListener(surfaceHolderCallback2C1475Lj);
        ViewGroup viewGroup = (ViewGroup) surfaceHolderCallback2C1475Lj.g.a.findViewById(R.id.ar_view_holder);
        surfaceHolderCallback2C1475Lj.g.getClass();
        viewGroup.setVisibility(0);
        viewGroup.addView(this.a);
        C0955Hj c0955Hj = new C0955Hj(this);
        this.b = c0955Hj;
        surfaceHolderCallback2C1475Lj.m.h0(c0955Hj);
    }

    public final void a() {
        C1085Ij c1085Ij = this.a;
        if (c1085Ij == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c1085Ij.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.a);
            this.f.g.getClass();
            viewGroup.setVisibility(8);
        }
        this.a = null;
    }
}
