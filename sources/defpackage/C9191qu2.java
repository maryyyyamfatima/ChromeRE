package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qu2 */
/* loaded from: classes2.dex */
public final class C9191qu2 extends AbstractC10705vK2 {
    public final int a;
    public final int g;
    public final /* synthetic */ ViewOnClickListenerC9876su2 h;

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        int i;
        int i2;
        boolean z = this.h.x;
        int i3 = this.g;
        if (z) {
            rect.set(0, 0, 0, i3);
            return;
        }
        recyclerView.getClass();
        int J2 = RecyclerView.J(view);
        if (J2 >= 0) {
            int i4 = this.a;
            int i5 = J2 % i4;
            int i6 = i3 - ((i5 * i3) / i4);
            i2 = ((i5 + 1) * i3) / i4;
            i = J2 < i4 ? i3 : 0;
            r1 = i6;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        rect.set(r1, i, i2, i3);
    }

    public C9191qu2(ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2, int i, int i2) {
        this.h = viewOnClickListenerC9876su2;
        this.a = i;
        this.g = i2;
    }
}
