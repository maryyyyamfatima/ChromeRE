package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Lr implements ComponentCallbacks {
    public final /* synthetic */ PopupWindow a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public Lr(PopupWindow popupWindow) {
        this.a = popupWindow;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        PopupWindow popupWindow;
        if (configuration.orientation != 2 || (popupWindow = this.a) == null) {
            return;
        }
        popupWindow.dismiss();
    }
}
