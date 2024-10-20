package defpackage;

import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZE1 implements Runnable {
    public final /* synthetic */ LoadingView a;

    public ZE1(LoadingView loadingView) {
        this.a = loadingView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = LoadingView.k;
        this.a.animate().alpha(0.0f).setInterpolator(InterpolatorC0485Dt.c).setListener(new YE1(this));
    }
}
