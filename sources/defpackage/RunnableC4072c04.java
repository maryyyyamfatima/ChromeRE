package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC4072c04 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C4759e04 g;

    public RunnableC4072c04(C4759e04 c4759e04, Runnable runnable) {
        this.g = c4759e04;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        boolean z = runnable != null;
        C4759e04 c4759e04 = this.g;
        c4759e04.f.setVisibility(C4759e04.b(z));
        View view = c4759e04.e;
        if (view != null) {
            view.setVisibility(C4759e04.b(z));
        }
        CW3 cw3 = c4759e04.h;
        if (cw3 != null) {
            cw3.k = runnable;
            cw3.d();
        }
    }
}
