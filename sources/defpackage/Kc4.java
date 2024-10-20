package defpackage;

import J.N;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ViewConfiguration;
import org.chromium.ui.gfx.ViewConfigurationHelper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Kc4 implements ComponentCallbacks {
    public final /* synthetic */ ViewConfigurationHelper a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ViewConfigurationHelper viewConfigurationHelper = this.a;
        viewConfigurationHelper.getClass();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(V60.a);
        if (viewConfigurationHelper.a == viewConfiguration) {
            return;
        }
        viewConfigurationHelper.a = viewConfiguration;
        viewConfigurationHelper.b = V60.a.getResources().getDisplayMetrics().density;
        N.MtrEpb2R(viewConfigurationHelper, viewConfigurationHelper.getMaximumFlingVelocity(), viewConfigurationHelper.getMinimumFlingVelocity(), viewConfigurationHelper.getTouchSlop(), viewConfigurationHelper.getDoubleTapSlop(), viewConfigurationHelper.getMinScalingSpan());
    }

    public Kc4(ViewConfigurationHelper viewConfigurationHelper) {
        this.a = viewConfigurationHelper;
    }
}
