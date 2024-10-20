package defpackage;

import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7025kd0 implements InterfaceC0548Ef2 {
    public final /* synthetic */ C8057nd0 a;

    @Override // defpackage.InterfaceC0548Ef2
    public final void a() {
        C8057nd0 c8057nd0 = this.a;
        ViewGroup viewGroup = c8057nd0.n;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
        c8057nd0.n.animate().alpha(1.0f).setInterpolator(InterpolatorC0485Dt.c).setDuration(400L).start();
    }

    @Override // defpackage.InterfaceC0548Ef2
    public final void b() {
        ViewGroup viewGroup = this.a.n;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().alpha(0.0f).setInterpolator(InterpolatorC0485Dt.c).setDuration(400L).withEndAction(new Runnable() { // from class: jd0
            @Override // java.lang.Runnable
            public final void run() {
                C7025kd0.this.a.n.setVisibility(8);
            }
        }).start();
    }

    public C7025kd0(C8057nd0 c8057nd0) {
        this.a = c8057nd0;
    }
}
