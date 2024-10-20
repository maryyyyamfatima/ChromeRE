package defpackage;

import android.view.View;
import org.chromium.chrome.browser.infobar.TranslateCompactInfoBar;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JW3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ TranslateCompactInfoBar a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public JW3(TranslateCompactInfoBar translateCompactInfoBar) {
        this.a = translateCompactInfoBar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TranslateCompactInfoBar translateCompactInfoBar = this.a;
        RW3 rw3 = translateCompactInfoBar.u;
        if (rw3 != null) {
            rw3.b();
        }
        RW3 rw32 = translateCompactInfoBar.v;
        if (rw32 != null) {
            rw32.b();
        }
        WindowAndroid windowAndroid = translateCompactInfoBar.y;
        if (AbstractC1329Kf3.a(windowAndroid) == null || translateCompactInfoBar.z == null) {
            return;
        }
        AbstractC1329Kf3.a(windowAndroid).a(translateCompactInfoBar.z);
    }
}
