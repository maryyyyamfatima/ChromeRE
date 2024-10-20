package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UK extends AbstractC10705vK2 {
    public final int a;
    public final int g;

    public UK(int i, int i2) {
        this.a = i;
        this.g = i2;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        recyclerView.getClass();
        int J2 = RecyclerView.J(view);
        boolean z = J2 == 0;
        boolean z2 = J2 == recyclerView.r.q() - 1;
        int i = this.g;
        int i2 = this.a;
        rect.left = z ? i : i2;
        if (!z2) {
            i = i2;
        }
        rect.right = i;
    }
}
