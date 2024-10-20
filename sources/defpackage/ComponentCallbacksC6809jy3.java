package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jy3 */
/* loaded from: classes.dex */
public final class ComponentCallbacksC6809jy3 implements ComponentCallbacks {
    public final /* synthetic */ GridLayoutManager a;
    public final /* synthetic */ C1553Ly3 g;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public ComponentCallbacksC6809jy3(C1553Ly3 c1553Ly3, GridLayoutManager gridLayoutManager) {
        this.g = c1553Ly3;
        this.a = gridLayoutManager;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        int i2 = configuration.screenWidthDp;
        C1553Ly3 c1553Ly3 = this.g;
        c1553Ly3.q(this.a, i, i2);
        if (c1553Ly3.f != 0 || c1553Ly3.u == 0) {
            return;
        }
        c1553Ly3.p();
    }
}
