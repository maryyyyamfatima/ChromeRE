package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rf3 */
/* loaded from: classes.dex */
public final class C2238Rf3 extends VB1 {
    public final /* synthetic */ AbstractC2368Sf3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238Rf3(AbstractC2368Sf3 abstractC2368Sf3, Context context) {
        super(context);
        this.q = abstractC2368Sf3;
    }

    @Override // defpackage.VB1
    public final void i(View view, JK2 jk2) {
        AbstractC2368Sf3 abstractC2368Sf3 = this.q;
        RecyclerView recyclerView = abstractC2368Sf3.a;
        if (recyclerView == null) {
            return;
        }
        int[] b = abstractC2368Sf3.b(recyclerView.s, view);
        int i = b[0];
        int i2 = b[1];
        int c = c(Math.max(Math.abs(i), Math.abs(i2)));
        if (c > 0) {
            jk2.b(i, i2, c, this.j);
        }
    }

    @Override // defpackage.VB1
    public final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
