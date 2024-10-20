package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VT0 extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public VT0(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
