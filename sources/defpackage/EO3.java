package defpackage;

import android.view.Menu;
import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EO3 implements Runnable {
    public final /* synthetic */ JO3 a;

    public EO3(JO3 jo3) {
        this.a = jo3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JO3 jo3 = this.a;
        Window.Callback callback = jo3.b;
        Menu t = jo3.t();
        BS1 bs1 = t instanceof BS1 ? (BS1) t : null;
        if (bs1 != null) {
            bs1.w();
        }
        try {
            t.clear();
            if (!callback.onCreatePanelMenu(0, t) || !callback.onPreparePanel(0, null, t)) {
                t.clear();
            }
        } finally {
            if (bs1 != null) {
                bs1.v();
            }
        }
    }
}
