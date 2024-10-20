package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KJ3 extends AbstractC11574xr3 {
    public final C9168qq3 c;

    public KJ3(C9168qq3 c9168qq3) {
        this.c = c9168qq3;
        this.a = 5;
    }

    @Override // defpackage.AbstractC11574xr3
    public final c a(int i, Integer num) {
        NJ3 nj3 = new NJ3();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.toByteArray());
        nj3.E0(bundle);
        return nj3;
    }
}
