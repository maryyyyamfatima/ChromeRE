package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC7903n90 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C9961t90 a;

    public ViewOnLayoutChangeListenerC7903n90(C9961t90 c9961t90) {
        this.a = c9961t90;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        if (i7 - i5 == i9 && i8 - i6 == i4 - i2) {
            return;
        }
        this.a.b.a(new Cdo(8), new C4636df4(i9, i4 - i2));
    }
}
