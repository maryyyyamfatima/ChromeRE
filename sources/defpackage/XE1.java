package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XE1 implements Runnable {
    public final /* synthetic */ LoadingView a;

    @Override // java.lang.Runnable
    public final void run() {
        LoadingView loadingView = this.a;
        if (loadingView.i) {
            loadingView.a = SystemClock.elapsedRealtime();
            loadingView.setVisibility(0);
            loadingView.setAlpha(1.0f);
            Iterator it = loadingView.g.iterator();
            while (it.hasNext()) {
                ((InterfaceC3467aF1) it.next()).P();
            }
        }
    }

    public XE1(LoadingView loadingView) {
        this.a = loadingView;
    }
}
