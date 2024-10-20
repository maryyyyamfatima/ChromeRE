package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC0881Gu0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C1141Iu0 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1141Iu0 c1141Iu0 = this.a;
        if (view == c1141Iu0.a) {
            c1141Iu0.b();
        }
    }

    public ViewOnLayoutChangeListenerC0881Gu0(C1141Iu0 c1141Iu0) {
        this.a = c1141Iu0;
    }
}
