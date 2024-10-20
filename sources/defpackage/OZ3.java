package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OZ3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ QZ3 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public OZ3(QZ3 qz3) {
        this.a = qz3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c();
    }
}
