package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LJ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ VJ b;

    public LJ(VJ vj, Context context) {
        this.b = vj;
        this.a = context;
    }

    public final DK a(Intent intent, int i, OJ oj, String str) {
        Context context = this.a;
        VJ vj = this.b;
        return new DK(context, intent, i, vj.b, vj.c, oj, str);
    }
}
