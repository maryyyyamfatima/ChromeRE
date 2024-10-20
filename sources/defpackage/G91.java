package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G91 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ H91 a;
    public final /* synthetic */ I91 g;
    public final /* synthetic */ EnumC9866ss4 h;

    public G91(H91 h91, I91 i91, EnumC9866ss4 enumC9866ss4) {
        this.a = h91;
        this.g = i91;
        this.h = enumC9866ss4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        H91 h91 = this.a;
        h91.getViewTreeObserver().removeOnPreDrawListener(this);
        I91 i91 = this.g;
        int i = i91.a;
        if (i == -1) {
            if (this.h == EnumC9866ss4.i) {
                h91.fullScroll(66);
            }
            i91.a = h91.getScrollX();
            return true;
        }
        h91.setScrollX(i);
        return true;
    }
}
