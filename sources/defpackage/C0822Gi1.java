package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822Gi1 {
    public Object[] a;
    public int b = 0;
    public C0692Fi1 c;

    public C0822Gi1(int i) {
        this.a = new Object[i * 2];
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i));
        }
        RV.a(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public final void c(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }

    public final TL2 a(boolean z) {
        C0692Fi1 c0692Fi1;
        C0692Fi1 c0692Fi12;
        if (z && (c0692Fi12 = this.c) != null) {
            throw c0692Fi12.a();
        }
        TL2 h = TL2.h(this.b, this.a, this);
        if (!z || (c0692Fi1 = this.c) == null) {
            return h;
        }
        throw c0692Fi1.a();
    }
}
