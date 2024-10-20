package defpackage;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JK2 {
    public int d = -1;
    public boolean f = false;
    public int g = 0;
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public Interpolator e = null;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.T(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.e;
        if (interpolator != null && this.c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.c;
        if (i2 >= 1) {
            recyclerView.k0.c(this.a, this.b, i2, interpolator);
            int i3 = this.g + 1;
            this.g = i3;
            if (i3 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = baseInterpolator;
        this.f = true;
    }
}
