package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0761Fw0 implements View.OnTouchListener {
    public final /* synthetic */ C0891Gw0 a;

    public ViewOnTouchListenerC0761Fw0(C0891Gw0 c0891Gw0) {
        this.a = c0891Gw0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        C0891Gw0 c0891Gw0 = this.a;
        c0891Gw0.getClass();
        C11939yv1 c11939yv1 = C11939yv1.g;
        Spinner spinner = c0891Gw0.i;
        c11939yv1.d(spinner);
        ViewGroup viewGroup = (ViewGroup) spinner.getParent();
        if (viewGroup != null) {
            viewGroup.requestChildFocus(spinner, spinner);
        }
        spinner.sendAccessibilityEvent(8);
        return false;
    }
}
