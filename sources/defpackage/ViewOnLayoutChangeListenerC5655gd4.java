package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gd4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC5655gd4 implements View.OnLayoutChangeListener {
    public final C8748pd4 a;

    public ViewOnLayoutChangeListenerC5655gd4(C8748pd4 c8748pd4) {
        this.a = c8748pd4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.e(i3 - i, i4 - i2);
    }
}
