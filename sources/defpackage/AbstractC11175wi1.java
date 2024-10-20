package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11175wi1 extends AbstractC11518xi1 {
    public Object[] a;
    public int b;
    public boolean c;

    public AbstractC11175wi1(int i) {
        RV.b(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final void c(Object obj) {
        e(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final AbstractC11175wi1 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size() + this.b);
            if (collection instanceof AbstractC11861yi1) {
                this.b = ((AbstractC11861yi1) collection).b(this.b, this.a);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
