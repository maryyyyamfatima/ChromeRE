package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4529dL2 implements CA1 {
    public final Object a;
    public final LS b;

    public C4529dL2(Object obj) {
        this.a = obj;
        this.b = NS.c.b(obj.getClass());
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(enumC11340xA1);
        Object obj = this.a;
        LS.a(list, ja1, enumC11340xA1, obj);
        LS.a((List) hashMap.get(EnumC11340xA1.ON_ANY), ja1, enumC11340xA1, obj);
    }
}
