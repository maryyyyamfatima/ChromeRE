package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jh */
/* loaded from: classes.dex */
public final class C1205Jh extends DK2 {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ ImageView g;

    public C1205Jh(ImageView imageView, ImageView imageView2) {
        this.a = imageView;
        this.g = imageView2;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        ImageView imageView = this.a;
        if (canScrollVertically) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean canScrollVertically2 = recyclerView.canScrollVertically(1);
        ImageView imageView2 = this.g;
        if (canScrollVertically2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
