package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Du0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0491Du0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C0621Eu0 a;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0621Eu0 c0621Eu0 = this.a;
        c0621Eu0.l.b();
        ViewOnLayoutChangeListenerC0361Cu0 viewOnLayoutChangeListenerC0361Cu0 = c0621Eu0.j;
        View view = c0621Eu0.g;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0361Cu0);
        view.setTag(null);
    }

    public C0491Du0(C0621Eu0 c0621Eu0) {
        this.a = c0621Eu0;
    }
}
