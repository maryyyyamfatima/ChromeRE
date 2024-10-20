package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3860bP0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ InterfaceC0079Ap3 a;
    public final /* synthetic */ View g;

    public ViewTreeObserverOnPreDrawListenerC3860bP0(View view, WO0 wo0) {
        this.a = wo0;
        this.g = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!((Boolean) this.a.get()).booleanValue()) {
            return false;
        }
        this.g.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
