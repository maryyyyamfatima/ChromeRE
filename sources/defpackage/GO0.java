package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GO0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ HO0 a;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        HO0 ho0 = this.a;
        if (ho0.c) {
            return;
        }
        ho0.c = true;
        Runnable runnable = ho0.b;
        if (runnable != null) {
            runnable.run();
            ho0.b = null;
        }
        PostTask.c(AbstractC5103f04.b, new Runnable() { // from class: FO0
            @Override // java.lang.Runnable
            public final void run() {
                GO0 go0 = GO0.this;
                HO0 ho02 = go0.a;
                if (ho02.a.get() == null) {
                    return;
                }
                ((View) ho02.a.get()).getViewTreeObserver().removeOnDrawListener(go0);
            }
        });
    }

    public GO0(HO0 ho0) {
        this.a = ho0;
    }
}
