package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HO0 {
    public final WeakReference a;
    public Runnable b;
    public boolean c;

    public HO0(View view, Runnable runnable) {
        this.a = new WeakReference(view);
        this.b = runnable;
    }

    public static void a(View view, Runnable runnable) {
        HO0 ho0 = new HO0(view, runnable);
        EO0 eo0 = new EO0(ho0);
        GO0 go0 = new GO0(ho0);
        WeakReference weakReference = ho0.a;
        ((View) weakReference.get()).getViewTreeObserver().addOnPreDrawListener(eo0);
        ((View) weakReference.get()).getViewTreeObserver().addOnDrawListener(go0);
    }
}
