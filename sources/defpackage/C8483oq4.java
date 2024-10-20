package defpackage;

import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oq4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8483oq4 extends AbstractC8826pq4 {
    public final WindowInsetsController a;
    public final Window b;

    public C8483oq4(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.AbstractC8826pq4
    public final void c(int i) {
        Window window = this.b;
        if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 32) {
            ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
        }
        this.a.show(i);
    }

    @Override // defpackage.AbstractC8826pq4
    public final void a(int i) {
        this.a.hide(i);
    }

    @Override // defpackage.AbstractC8826pq4
    public final void b(int i) {
        this.a.setSystemBarsBehavior(i);
    }
}
