package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gj3 */
/* loaded from: classes.dex */
public final class C5690gj3 extends VB1 {
    public final /* synthetic */ C6034hj3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5690gj3(C6034hj3 c6034hj3, Context context) {
        super(context);
        this.q = c6034hj3;
    }

    @Override // defpackage.VB1
    public final void i(View view, JK2 jk2) {
        C6034hj3 c6034hj3 = this.q;
        int[] b = c6034hj3.b(c6034hj3.h.s, view);
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

    @Override // defpackage.VB1
    public final int d(int i) {
        return Math.min(100, super.d(i));
    }
}
