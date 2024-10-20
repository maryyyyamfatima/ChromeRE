package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WU0 extends Handler {
    public final WeakReference a;

    public WU0(XU0 xu0) {
        this.a = new WeakReference(xu0);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        XU0 xu0;
        Q50 q50;
        if (message == null || (xu0 = (XU0) this.a.get()) == null || xu0.l == null || (q50 = xu0.m) == null) {
            return;
        }
        int systemUiVisibility = q50.getSystemUiVisibility();
        int i = message.what;
        if (i == 1) {
            C3546aV0 c3546aV0 = xu0.o;
            if (!(((systemUiVisibility & 4) != 4) == c3546aV0.b && ((systemUiVisibility & 2) != 2) == c3546aV0.a)) {
                systemUiVisibility = xu0.b(systemUiVisibility);
                q50.setSystemUiVisibility(systemUiVisibility);
            }
            if ((systemUiVisibility & 1024) == 0) {
                return;
            }
            q50.addOnLayoutChangeListener(new VU0(this, q50));
            q50.requestLayout();
            return;
        }
        if (i == 2 && xu0.g()) {
            q50.setSystemUiVisibility(systemUiVisibility & (-1025));
            Window window = xu0.a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i2 = attributes.flags;
            if ((67108864 & i2) != 0) {
                attributes.flags = i2 & (-67108865);
                window.setAttributes(attributes);
            }
        }
    }
}
