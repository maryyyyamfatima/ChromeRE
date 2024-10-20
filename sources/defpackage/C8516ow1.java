package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ow1 */
/* loaded from: classes.dex */
public final class C8516ow1 extends DK2 {
    public final RecyclerView a;
    public final ImageView g;
    public final ImageView h;

    public C8516ow1(RecyclerView recyclerView, ImageView imageView, ImageView imageView2) {
        this.a = recyclerView;
        this.g = imageView;
        this.h = imageView2;
        recyclerView.o0 = this;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        boolean canScrollVertically = recyclerView2.canScrollVertically(-1);
        ImageView imageView = this.g;
        if (canScrollVertically) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean canScrollVertically2 = recyclerView2.canScrollVertically(1);
        ImageView imageView2 = this.h;
        if (canScrollVertically2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
