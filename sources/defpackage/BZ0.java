package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BZ0 extends ContextWrapper {
    public static final C5623gY0 k = new C5623gY0();
    public final C3492aK1 a;
    public final C5100f01 b;
    public final C6369ii1 c;
    public final C10092tZ0 d;
    public final List e;
    public final Map f;
    public final C6538jB0 g;
    public final NZ0 h;
    public final int i;
    public C7981nO2 j;

    public BZ0(Context context, C3492aK1 c3492aK1, ML2 ml2, C6369ii1 c6369ii1, C10092tZ0 c10092tZ0, C4317ck c4317ck, List list, C6538jB0 c6538jB0, NZ0 nz0, int i) {
        super(context.getApplicationContext());
        this.a = c3492aK1;
        this.c = c6369ii1;
        this.d = c10092tZ0;
        this.e = list;
        this.f = c4317ck;
        this.g = c6538jB0;
        this.h = nz0;
        this.i = i;
        this.b = new C5100f01(ml2);
    }

    public final LL2 a() {
        return (LL2) this.b.get();
    }
}
