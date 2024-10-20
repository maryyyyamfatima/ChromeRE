package defpackage;

import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lP1 */
/* loaded from: classes.dex */
public final class C7297lP1 extends AbstractC6958kQ1 {
    public final /* synthetic */ MediaRouteButton a;

    public C7297lP1(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void d(DQ1 dq1) {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void f(DQ1 dq1) {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void e(MQ1 mq1, DQ1 dq1) {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void g(DQ1 dq1) {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void i() {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void c() {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void l(C5245fR1 c5245fR1) {
        boolean z = c5245fR1 != null ? c5245fR1.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.l != z) {
            mediaRouteButton.l = z;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
