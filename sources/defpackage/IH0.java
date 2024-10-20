package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IH0 extends IT2 {
    public final HashMap j = new HashMap();

    @Override // defpackage.IT2
    public final ET2 a(Object obj) {
        return (ET2) this.j.get(obj);
    }

    public final Object d(Object obj, Object obj2) {
        ET2 a = a(obj);
        if (a != null) {
            return a.g;
        }
        HashMap hashMap = this.j;
        ET2 et2 = new ET2(obj, obj2);
        this.i++;
        ET2 et22 = this.g;
        if (et22 == null) {
            this.a = et2;
            this.g = et2;
        } else {
            et22.h = et2;
            et2.i = et22;
            this.g = et2;
        }
        hashMap.put(obj, et2);
        return null;
    }

    @Override // defpackage.IT2
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
