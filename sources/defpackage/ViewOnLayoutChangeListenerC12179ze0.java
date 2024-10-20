package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ze0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC12179ze0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int[] g;
    public final /* synthetic */ C0021Ae0 h;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0021Ae0 c0021Ae0 = this.h;
        c0021Ae0.b.removeOnLayoutChangeListener(this);
        c0021Ae0.b.getLocationInWindow(new int[2]);
        TextView textView = c0021Ae0.b;
        float f = this.a;
        textView.setScaleX(f);
        c0021Ae0.b.setScaleY(f);
        TextView textView2 = c0021Ae0.b;
        int[] iArr = this.g;
        textView2.setTranslationX(iArr[0] - r2[0]);
        c0021Ae0.b.setTranslationY(iArr[1] - r2[1]);
        c0021Ae0.b.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200L).setInterpolator(InterpolatorC0485Dt.c).setListener(new C11836ye0(this)).start();
    }

    public ViewOnLayoutChangeListenerC12179ze0(C0021Ae0 c0021Ae0, float f, int[] iArr) {
        this.h = c0021Ae0;
        this.a = f;
        this.g = iArr;
    }
}
