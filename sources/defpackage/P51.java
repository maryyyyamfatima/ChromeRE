package defpackage;

import android.view.View;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P51 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ X51 a;

    public P51(X51 x51) {
        this.a = x51;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        TraceEvent.f("HardwareDraw::ViewAttachedToWindow");
        view.removeOnAttachStateChangeListener(this);
        this.a.c = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TraceEvent.f("HardwareDraw::ViewDetachedFromWindow");
    }
}
