package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Bd4 extends AbstractC3779b90 {
    public Cd4 a;
    public int b;

    public Bd4() {
        this.b = 0;
    }

    public Bd4(int i) {
        super(0);
        this.b = 0;
    }

    @Override // defpackage.AbstractC3779b90
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new Cd4(view);
        }
        Cd4 cd4 = this.a;
        View view2 = cd4.a;
        cd4.b = view2.getTop();
        cd4.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        Cd4 cd42 = this.a;
        if (cd42.d != i2) {
            cd42.d = i2;
            cd42.a();
        }
        this.b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public final int q() {
        Cd4 cd4 = this.a;
        if (cd4 != null) {
            return cd4.d;
        }
        return 0;
    }
}
