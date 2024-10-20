package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.components.thinwebview.internal.CompositorViewImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kK3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6930kK3 extends FrameLayout implements InterfaceC6244iK3 {
    public final CompositorViewImpl a;
    public final WindowAndroid g;
    public long h;
    public WebContents i;
    public View j;
    public WebContentsDelegateAndroid k;

    public C6930kK3(Context context, C6586jK3 c6586jK3, C2021Po1 c2021Po1) {
        super(context);
        if (V60.a(context) != null) {
            this.g = new C10285u6(context, c2021Po1);
        } else {
            this.g = new WindowAndroid(context);
        }
        CompositorViewImpl compositorViewImpl = new CompositorViewImpl(context, this.g, c6586jK3);
        this.a = compositorViewImpl;
        addView(compositorViewImpl.a, new FrameLayout.LayoutParams(-1, -1));
        this.h = N.M$XqDO$W(this, compositorViewImpl, this.g);
    }

    public final void a(WebContents webContents, Q50 q50, WebContentsDelegateAndroid webContentsDelegateAndroid) {
        if (this.h == 0) {
            return;
        }
        this.i = webContents;
        this.k = webContentsDelegateAndroid;
        View view = this.j;
        if (view != q50) {
            if (view != null) {
                removeViewAt(1);
            }
            this.j = q50;
            if (q50 != null) {
                addView(q50, 1);
            }
        }
        N.M9Q7LfVV(this.h, this, webContents, webContentsDelegateAndroid);
        webContents.T0();
    }

    public final void b() {
        if (this.h == 0) {
            return;
        }
        View view = this.j;
        if (view != null) {
            removeView(view);
            this.j = null;
        }
        CompositorViewImpl compositorViewImpl = this.a;
        long j = compositorViewImpl.b;
        if (j != 0) {
            N.M_L66GG1(j, compositorViewImpl);
            compositorViewImpl.b = 0L;
        }
        N.Mi0zHYZ4(this.h, this);
        this.h = 0L;
        this.g.destroy();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        CompositorViewImpl compositorViewImpl = this.a;
        if (compositorViewImpl.b == 0) {
            return;
        }
        compositorViewImpl.a.setAlpha(f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        long j = this.h;
        if (j == 0) {
            return;
        }
        if (i == i3 && i2 == i4) {
            return;
        }
        N.MgG98$5a(j, this, i, i2);
    }
}
