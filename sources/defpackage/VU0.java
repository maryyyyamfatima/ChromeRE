package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VU0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ WU0 g;

    public VU0(WU0 wu0, View view) {
        this.g = wu0;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.g.sendEmptyMessageDelayed(2, 20L);
        this.a.removeOnLayoutChangeListener(this);
    }
}
