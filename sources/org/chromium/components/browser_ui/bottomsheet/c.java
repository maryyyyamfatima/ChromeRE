package org.chromium.components.browser_ui.bottomsheet;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class c implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomSheet a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 == i8 - i6 && i3 - i == i7 - i5) {
            return;
        }
        BottomSheet bottomSheet = this.a;
        if (!bottomSheet.l.d) {
            if (bottomSheet.m != null) {
                return;
            }
        }
        bottomSheet.t(bottomSheet.r, 0, false);
    }

    public c(BottomSheet bottomSheet) {
        this.a = bottomSheet;
    }
}
