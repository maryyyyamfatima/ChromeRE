package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class D42 implements InterfaceC3906bY1 {
    public ZX1 a;
    public WindowAndroid g;
    public Runnable h;

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 1) {
            this.a.c(2, propertyModel);
            return;
        }
        try {
            this.g.B(new Intent(Build.VERSION.SDK_INT >= 29 ? "android.settings.panel.action.NFC" : "android.settings.NFC_SETTINGS"), new C42(this, propertyModel), null);
        } catch (ActivityNotFoundException unused) {
            this.a.c(1, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        this.h = null;
    }
}
