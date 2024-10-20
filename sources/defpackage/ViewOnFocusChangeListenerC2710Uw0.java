package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uw0 */
/* loaded from: classes2.dex */
public final class ViewOnFocusChangeListenerC2710Uw0 implements View.OnFocusChangeListener {
    public final /* synthetic */ boolean a = false;
    public final /* synthetic */ ViewOnClickListenerC2970Ww0 g;

    public ViewOnFocusChangeListenerC2710Uw0(ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0) {
        this.g = viewOnClickListenerC2970Ww0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0 = this.g;
        if (z) {
            if (this.a && !viewOnClickListenerC2970Ww0.m) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            }
            viewOnClickListenerC2970Ww0.m = true;
        } else if (viewOnClickListenerC2970Ww0.m) {
            viewOnClickListenerC2970Ww0.c(!viewOnClickListenerC2970Ww0.a.d());
        }
        if (viewOnClickListenerC2970Ww0.a.B != 0) {
            viewOnClickListenerC2970Ww0.h.k(z);
        }
    }
}
