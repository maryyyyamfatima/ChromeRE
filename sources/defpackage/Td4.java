package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Td4 implements BK2 {
    @Override // defpackage.BK2
    public final void b(View view) {
    }

    @Override // defpackage.BK2
    public final void d(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) ak2).width != -1 || ((ViewGroup.MarginLayoutParams) ak2).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
