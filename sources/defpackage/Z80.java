package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z80 implements InterfaceC11483xc2 {
    public final /* synthetic */ CoordinatorLayout a;

    @Override // defpackage.InterfaceC11483xc2
    public final C5389fq4 a(View view, C5389fq4 c5389fq4) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.r, c5389fq4)) {
            coordinatorLayout.r = c5389fq4;
            boolean z = c5389fq4.d() > 0;
            coordinatorLayout.s = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            Up4 up4 = c5389fq4.a;
            if (!up4.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = Ec4.a;
                    if (childAt.getFitsSystemWindows() && ((C5153f90) childAt.getLayoutParams()).a != null && up4.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c5389fq4;
    }

    public Z80(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }
}
