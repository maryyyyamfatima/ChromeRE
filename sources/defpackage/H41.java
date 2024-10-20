package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H41 extends J41 {
    @Override // defpackage.J41
    public final String c() {
        return "BASELINE";
    }

    @Override // defpackage.J41
    public final int d(View view, int i) {
        return 0;
    }

    @Override // defpackage.J41
    public final int a(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int baseline = view.getBaseline();
        if (baseline == -1) {
            return Integer.MIN_VALUE;
        }
        return baseline;
    }

    @Override // defpackage.J41
    public final P41 b() {
        return new G41();
    }
}
