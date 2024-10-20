package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lx1 */
/* loaded from: classes2.dex */
public final class C1546Lx1 extends DK2 {
    public final /* synthetic */ View a;
    public final /* synthetic */ RecyclerView g;

    public C1546Lx1(View view, RecyclerView recyclerView) {
        this.a = view;
        this.g = recyclerView;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        this.a.setVisibility(this.g.canScrollVertically(-1) ? 0 : 8);
    }
}
