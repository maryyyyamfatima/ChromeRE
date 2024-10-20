package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11046wK0 extends FrameLayout {
    public final /* synthetic */ C12075zK0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11046wK0(C12075zK0 c12075zK0, Context context) {
        super(context);
        this.a = c12075zK0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.n.c();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        C12075zK0 c12075zK0 = this.a;
        SK0 sk0 = c12075zK0.f;
        if (sk0 == null || sk0.v) {
            return c12075zK0.e.h(motionEvent);
        }
        return true;
    }
}
