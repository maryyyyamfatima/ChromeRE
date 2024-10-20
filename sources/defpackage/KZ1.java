package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KZ1 implements InterfaceC11179wj {
    public final /* synthetic */ LZ1 a;

    public KZ1(LZ1 lz1) {
        this.a = lz1;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 4) {
            LZ1 lz1 = this.a;
            KZ1 kz1 = lz1.g;
            if (kz1 != null) {
                ApplicationStatus.h(kz1);
                lz1.g = null;
            }
            lz1.n();
        }
    }
}
