package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnKeyListenerC10567uv1 implements View.OnKeyListener {
    public abstract View a();

    public abstract View b();

    public boolean c() {
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        View a;
        if (i == 61 && keyEvent.getAction() == 0) {
            if (keyEvent.hasNoModifiers()) {
                View b = b();
                if (b != null) {
                    return b.requestFocus();
                }
                return false;
            }
            if (!keyEvent.isShiftPressed() || (a = a()) == null) {
                return false;
            }
            return a.requestFocus();
        }
        if (i == 66 && keyEvent.getAction() == 1) {
            return c();
        }
        return false;
    }
}
