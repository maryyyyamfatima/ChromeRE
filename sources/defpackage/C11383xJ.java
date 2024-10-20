package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xJ */
/* loaded from: classes.dex */
public final class C11383xJ extends AbstractC11726yJ {
    public final int k;
    public final C5348fk l;
    public int m;

    @Override // defpackage.AbstractC11726yJ
    public final int e() {
        return -1;
    }

    public C11383xJ(Handler handler, RunnableC6240iK runnableC6240iK, String str, String str2, String str3) {
        super(handler, runnableC6240iK, str, str2, str3, false);
        this.l = new C5348fk(0);
        this.k = 98;
    }

    @Override // defpackage.AbstractC11726yJ
    public final VJ c(Context context, Bundle bundle, C10011tJ c10011tJ) {
        VJ f = f(context, bundle);
        if (f == null) {
            return null;
        }
        this.l.add(f);
        f.l(this.i, c10011tJ);
        return f;
    }

    public final VJ f(Context context, Bundle bundle) {
        C5348fk c5348fk = this.l;
        c5348fk.getClass();
        if (c5348fk.h >= this.k) {
            AbstractC4851eH1.f("ChildConnAllocator", "Ran out of UIDs to allocate.", new Object[0]);
            return null;
        }
        String str = this.d;
        ComponentName componentName = new ComponentName(str, this.e);
        String str2 = this.f;
        ComponentName componentName2 = str2 != null ? new ComponentName(str, str2) : null;
        String num = Integer.toString(this.m);
        this.m++;
        C10697vJ c10697vJ = this.j;
        boolean z = this.g;
        boolean z2 = this.h;
        c10697vJ.getClass();
        return new VJ(context, componentName, componentName2, z, z2, bundle, num);
    }

    @Override // defpackage.AbstractC11726yJ
    public final void d(VJ vj) {
        this.l.remove(vj);
    }
}
