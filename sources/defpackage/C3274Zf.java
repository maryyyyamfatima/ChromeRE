package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3274Zf extends AbstractViewOnTouchListenerC12115zS0 {
    public final /* synthetic */ C5668gg o;
    public final /* synthetic */ AppCompatSpinner p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3274Zf(AppCompatSpinner appCompatSpinner, View view, C5668gg c5668gg) {
        super(view);
        this.p = appCompatSpinner;
        this.o = c5668gg;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final Q93 b() {
        return this.o;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.p;
        if (appCompatSpinner.k.a()) {
            return true;
        }
        appCompatSpinner.k.o(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
