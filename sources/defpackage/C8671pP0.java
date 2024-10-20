package defpackage;

import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pP0 */
/* loaded from: classes.dex */
public final class C8671pP0 extends LT0 {
    public final List r;
    public final ArrayList s;

    public C8671pP0(VS0 vs0, ArrayList arrayList) {
        super(vs0);
        this.s = new ArrayList();
        this.r = arrayList;
    }

    @Override // defpackage.LT0
    public final c O(int i) {
        c cVar;
        C7984nP0 c7984nP0 = (C7984nP0) this.r.get(i);
        c7984nP0.getClass();
        try {
            cVar = (c) c7984nP0.a.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            cVar = null;
        }
        ArrayList arrayList = this.s;
        for (int size = arrayList.size(); size <= i; size++) {
            arrayList.add(null);
        }
        arrayList.set(i, (InterfaceC7640mP0) cVar);
        return cVar;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.r.size();
    }
}
