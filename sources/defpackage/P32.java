package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P32 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ View g;

    public P32(long j, C11046wK0 c11046wK0) {
        this.a = j;
        this.g = c11046wK0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        EI2.n((System.nanoTime() - this.a) / 1000000, "NewTabPage.TimeToFirstDraw2");
        this.g.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
