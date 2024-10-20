package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X41 extends GridLayoutManager {
    public X41(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, defpackage.AbstractC12077zK2
    public final AK2 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof IJ2) {
            return new W41((IJ2) layoutParams);
        }
        return super.u(layoutParams);
    }
}
