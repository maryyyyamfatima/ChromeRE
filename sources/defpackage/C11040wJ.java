package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wJ */
/* loaded from: classes.dex */
public final class C11040wJ extends AbstractC11726yJ {
    public final VJ[] k;
    public final ArrayList l;

    public C11040wJ(Handler handler, RunnableC6240iK runnableC6240iK, String str, String str2, boolean z, int i) {
        super(handler, runnableC6240iK, str, str2, null, z);
        this.k = new VJ[i];
        this.l = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.l.add(Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC11726yJ
    public final VJ c(Context context, Bundle bundle, C10011tJ c10011tJ) {
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            AbstractC4851eH1.f("ChildConnAllocator", "Ran out of services to allocate.", new Object[0]);
            return null;
        }
        int intValue = ((Integer) arrayList.remove(0)).intValue();
        ComponentName componentName = new ComponentName(this.d, this.e + intValue);
        C10697vJ c10697vJ = this.j;
        boolean z = this.g;
        boolean z2 = this.h;
        c10697vJ.getClass();
        VJ vj = new VJ(context, componentName, null, z, z2, bundle, null);
        this.k[intValue] = vj;
        vj.l(this.i, c10011tJ);
        return vj;
    }

    @Override // defpackage.AbstractC11726yJ
    public final void d(VJ vj) {
        VJ[] vjArr = this.k;
        int indexOf = Arrays.asList(vjArr).indexOf(vj);
        if (indexOf == -1) {
            AbstractC4851eH1.a("ChildConnAllocator", "Unable to find connection to free.", new Object[0]);
        } else {
            vjArr[indexOf] = null;
            this.l.add(Integer.valueOf(indexOf));
        }
    }

    @Override // defpackage.AbstractC11726yJ
    public final int e() {
        return this.k.length;
    }
}
