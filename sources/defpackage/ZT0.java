package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZT0 extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public ZT0(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
