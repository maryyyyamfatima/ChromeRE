package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Oc4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ InterfaceC0079Ap3 a;
    public final /* synthetic */ View g;

    public Oc4(View view, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = interfaceC0079Ap3;
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
