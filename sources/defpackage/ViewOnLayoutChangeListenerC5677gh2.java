package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC5677gh2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C7739mh2 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C7739mh2 c7739mh2 = this.a;
        c7739mh2.b.removeOnLayoutChangeListener(this);
        c7739mh2.b.setVisibility(0);
        C7739mh2.a(c7739mh2, true, null).start();
    }

    public ViewOnLayoutChangeListenerC5677gh2(C7739mh2 c7739mh2) {
        this.a = c7739mh2;
    }
}
