package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ti3 */
/* loaded from: classes.dex */
public final class C2513Ti3 extends AbstractC6169i62 {
    public final Context w;

    public C2513Ti3(Context context) {
        super(context.getResources());
        this.w = context;
    }

    @Override // defpackage.AbstractC6169i62
    public final W72 c(C7893n72 c7893n72) {
        PO a = X72.a(this.g, c7893n72);
        a.h(this.d);
        a.g(this.e);
        a.n(this.f);
        CharSequence charSequence = this.h;
        K62 k62 = a.a;
        k62.E.tickerText = K62.c(charSequence);
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            CharSequence charSequence2 = this.e;
            I62 i62 = new I62();
            i62.d = bitmap;
            if (Build.VERSION.SDK_INT >= 24) {
                i62.b = K62.c(charSequence2);
                i62.c = true;
            }
            k62.k(i62);
        } else {
            CharSequence charSequence3 = this.e;
            J62 j62 = new J62();
            j62.d = K62.c(charSequence3);
            k62.k(j62);
        }
        a.j(f());
        int i = this.j;
        Bitmap bitmap2 = this.k;
        if (bitmap2 != null) {
            a.m(Icon.createWithBitmap(bitmap2));
        } else {
            a.l(i);
        }
        a.f(this.m);
        a.i(this.n);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            AbstractC6169i62.a(a, (C5825h62) it.next());
        }
        C5825h62 c5825h62 = this.p;
        if (c5825h62 != null) {
            AbstractC6169i62.a(a, c5825h62);
        }
        k62.k = 0;
        k62.g(this.q);
        long[] jArr = this.r;
        if (jArr != null) {
            k62.E.vibrate = jArr;
        }
        k62.F = this.s;
        k62.E.when = this.t;
        k62.l = true;
        k62.h(8, !this.u);
        CharSequence charSequence4 = this.f;
        if (charSequence4 != null) {
            a.a.r = "Web:" + ((Object) charSequence4);
        }
        k62.y = d(this.w);
        return a.d();
    }
}
