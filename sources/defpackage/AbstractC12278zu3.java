package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zu3 */
/* loaded from: classes.dex */
public abstract class AbstractC12278zu3 extends AbstractC11935yu3 implements ZQ1 {
    public abstract boolean x(C11249wu3 c11249wu3);

    public AbstractC12278zu3(Context context, C11420xQ1 c11420xQ1) {
        super(context, c11420xQ1);
    }

    @Override // defpackage.AbstractC11935yu3
    public void o(C11249wu3 c11249wu3, SP1 sp1) {
        Display display;
        super.o(c11249wu3, sp1);
        Object obj = c11249wu3.a;
        boolean isEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
        Bundle bundle = sp1.a;
        if (!isEnabled) {
            bundle.putBoolean("enabled", false);
        }
        if (x(c11249wu3)) {
            bundle.putInt("connectionState", 1);
        }
        try {
            display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            display = null;
        }
        if (display != null) {
            bundle.putInt("presentationDisplayId", display.getDisplayId());
        }
    }
}
