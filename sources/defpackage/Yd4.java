package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Yd4 implements S1 {
    public final /* synthetic */ C3943be4 a;

    public Yd4(C3943be4 c3943be4) {
        this.a = c3943be4;
    }

    @Override // defpackage.S1
    public final boolean a(View view) {
        int i = ((ViewPager2) view).i + 1;
        ViewPager2 viewPager2 = this.a.d;
        if (viewPager2.t) {
            viewPager2.e(i, true);
        }
        return true;
    }
}
