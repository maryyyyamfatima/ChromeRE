package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1011Hu0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C1141Iu0 a;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1141Iu0 c1141Iu0 = this.a;
        PopupWindow.OnDismissListener onDismissListener = c1141Iu0.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        ViewOnLayoutChangeListenerC0881Gu0 viewOnLayoutChangeListenerC0881Gu0 = c1141Iu0.j;
        View view = c1141Iu0.a;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0881Gu0);
        view.setTag(null);
    }

    public C1011Hu0(C1141Iu0 c1141Iu0) {
        this.a = c1141Iu0;
    }
}
