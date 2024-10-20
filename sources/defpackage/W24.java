package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.chrome.browser.omnibox.UrlBarApi26;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W24 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ UrlBarApi26 a;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        UrlBarApi26 urlBarApi26 = this.a;
        InterfaceC3403a34 interfaceC3403a34 = urlBarApi26.v;
        if (interfaceC3403a34 == null) {
            return;
        }
        interfaceC3403a34.o(true);
        urlBarApi26.performLongClick();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        UrlBarApi26 urlBarApi26 = this.a;
        if (urlBarApi26.v == null) {
            return true;
        }
        urlBarApi26.requestFocus();
        urlBarApi26.v.o(false);
        return true;
    }

    public W24(UrlBarApi26 urlBarApi26) {
        this.a = urlBarApi26;
    }
}
