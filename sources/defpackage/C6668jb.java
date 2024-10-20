package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6668jb implements InterfaceC10445ub {
    public final List a;

    public C6668jb(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.InterfaceC10445ub
    public final List b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10445ub
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((C12282zv1) list.get(0)).c();
    }

    @Override // defpackage.InterfaceC10445ub
    public final AbstractC11251wv a() {
        List list = this.a;
        if (((C12282zv1) list.get(0)).c()) {
            return new C2712Uw2(list);
        }
        return new C2537Tn2(list);
    }
}
