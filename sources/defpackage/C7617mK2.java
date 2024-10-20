package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mK2 */
/* loaded from: classes.dex */
public final class C7617mK2 {
    public final /* synthetic */ RecyclerView a;

    public C7617mK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final void b(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
