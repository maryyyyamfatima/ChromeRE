package defpackage;

import android.view.View;
import android.widget.ListPopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P12 implements View.OnLayoutChangeListener {
    public final /* synthetic */ S12 a;

    public P12(S12 s12) {
        this.a = s12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ListPopupWindow listPopupWindow = this.a.h;
        int width = (listPopupWindow.getAnchorView().getWidth() - listPopupWindow.getWidth()) / 2;
        if (width > 0) {
            listPopupWindow.setHorizontalOffset(width);
        }
        listPopupWindow.show();
    }
}
