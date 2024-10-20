package defpackage;

import org.chromium.components.browser_ui.widget.ViewResourceFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6046hl3 implements Runnable {
    public final /* synthetic */ C6732jl3 a;
    public final /* synthetic */ ViewResourceFrameLayout g;

    public /* synthetic */ RunnableC6046hl3(C6732jl3 c6732jl3, ViewResourceFrameLayout viewResourceFrameLayout) {
        this.a = c6732jl3;
        this.g = viewResourceFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.removeOnLayoutChangeListener(this.a.a);
    }
}
