package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EO0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ HO0 a;

    public EO0(HO0 ho0) {
        this.a = ho0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PostTask.c(QF3.m, new Runnable() { // from class: DO0
            @Override // java.lang.Runnable
            public final void run() {
                HO0 ho0 = EO0.this.a;
                Runnable runnable = ho0.b;
                if (runnable != null) {
                    runnable.run();
                    ho0.b = null;
                }
            }
        });
        HO0 ho0 = this.a;
        if (ho0.a.get() == null) {
            return true;
        }
        ((View) ho0.a.get()).getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
