package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: md0 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC7713md0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ C8057nd0 g;

    public ViewOnLayoutChangeListenerC7713md0(C8057nd0 c8057nd0, View view) {
        this.g = c8057nd0;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        C8057nd0 c8057nd0 = this.g;
        ((CC) c8057nd0.h).k(c8057nd0.a(), 0);
    }
}
