package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DA3 implements View.OnClickListener {
    public final /* synthetic */ GA3 a;

    public DA3(GA3 ga3) {
        this.a = ga3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC10590uz3 interfaceC10590uz3;
        ArrayList arrayList = new ArrayList();
        GA3 ga3 = this.a;
        Iterator it = ga3.j.c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            interfaceC10590uz3 = ga3.g;
            if (!hasNext) {
                break;
            }
            arrayList.add(AbstractC1558Lz3.c(((AbstractC11276wz3) interfaceC10590uz3).g(), ((Integer) it.next()).intValue()));
        }
        C10656vA3 c10656vA3 = ga3.m;
        if (c10656vA3 == null) {
            return;
        }
        c10656vA3.a(arrayList, interfaceC10590uz3);
    }
}
