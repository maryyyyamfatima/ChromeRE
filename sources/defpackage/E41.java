package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E41 extends J41 {
    public final /* synthetic */ J41 a;
    public final /* synthetic */ J41 b;

    public E41(J41 j41, J41 j412) {
        this.a = j41;
        this.b = j412;
    }

    @Override // defpackage.J41
    public final int d(View view, int i) {
        WeakHashMap weakHashMap = Ec4.a;
        return (!(view.getLayoutDirection() == 1) ? this.a : this.b).d(view, i);
    }

    @Override // defpackage.J41
    public final int a(View view, int i, int i2) {
        WeakHashMap weakHashMap = Ec4.a;
        return (!(view.getLayoutDirection() == 1) ? this.a : this.b).a(view, i, i2);
    }

    @Override // defpackage.J41
    public final String c() {
        return "SWITCHING[L:" + this.a.c() + ", R:" + this.b.c() + "]";
    }
}
