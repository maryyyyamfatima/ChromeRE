package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G41 extends P41 {
    public int d;

    @Override // defpackage.P41
    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    @Override // defpackage.P41
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // defpackage.P41
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }

    @Override // defpackage.P41
    public final int a(GridLayout gridLayout, View view, J41 j41, int i, boolean z) {
        return Math.max(0, super.a(gridLayout, view, j41, i, z));
    }
}
