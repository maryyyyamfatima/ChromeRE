package defpackage;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JZ1 implements DisplayManager.DisplayListener {
    public final /* synthetic */ LZ1 a;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        LZ1 lz1 = this.a;
        if (i == lz1.r || !LZ1.d(lz1, i)) {
            return;
        }
        ArrayList d = AbstractC9771sd.d(lz1.h);
        if (d.size() == 1 && ((Integer) d.get(0)).equals(Integer.valueOf(lz1.r))) {
            lz1.n();
        }
    }

    public JZ1(LZ1 lz1) {
        this.a = lz1;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        if (LZ1.d(this.a, i)) {
            LZ1.t = null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        LZ1 lz1 = this.a;
        if (LZ1.d(lz1, i)) {
            if (i == lz1.r) {
                if (lz1.k.l == 3) {
                    lz1.p = true;
                }
            } else if (lz1.j() == null) {
                lz1.n();
            }
        }
    }
}
