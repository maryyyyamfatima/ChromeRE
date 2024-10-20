package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import org.chromium.base.ThreadUtils;
import org.chromium.components.browser_ui.bottomsheet.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5168fC extends GestureDetector.SimpleOnGestureListener {
    public final GestureDetector a;
    public final InterfaceC4824eC b;
    public final VelocityTracker c;
    public boolean d;

    public C5168fC(Context context, InterfaceC4824eC interfaceC4824eC) {
        GestureDetector gestureDetector = new GestureDetector(context, new n(this), ThreadUtils.b());
        this.a = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        this.b = interfaceC4824eC;
        this.c = VelocityTracker.obtain();
    }
}
