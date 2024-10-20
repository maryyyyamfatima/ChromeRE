package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Li1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1472Li1 extends AbstractC11861yi1 implements Set {
    public static final /* synthetic */ int h = 0;
    public transient AbstractC0562Ei1 g;

    public static AbstractC1472Li1 r(Object obj, Object obj2) {
        return n(2, obj, obj2);
    }

    public static AbstractC1472Li1 s(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    public static AbstractC1472Li1 t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return n(length, objArr2);
    }

    public static AbstractC1472Li1 n(int i, Object... objArr) {
        if (i == 0) {
            return UL2.o;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C4629de3(obj);
        }
        int m = m(i);
        Object[] objArr2 = new Object[m];
        int i2 = m - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 != null) {
                int hashCode = obj2.hashCode();
                int a = AbstractC7198l61.a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 == null) {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (obj3.equals(obj2)) {
                        break;
                    }
                    a++;
                }
            } else {
                throw new NullPointerException(AbstractC9076qb1.a("at index ", i5));
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C4629de3(obj4);
        }
        if (m(i4) < m / 2) {
            return n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new UL2(i3, i2, i4, objArr, objArr2);
    }

    public static int m(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit <<= 1;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static AbstractC1472Li1 o(Collection collection) {
        if ((collection instanceof AbstractC1472Li1) && !(collection instanceof SortedSet)) {
            AbstractC1472Li1 abstractC1472Li1 = (AbstractC1472Li1) collection;
            if (!abstractC1472Li1.k()) {
                return abstractC1472Li1;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static AbstractC1472Li1 p(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return UL2.o;
        }
        if (length == 1) {
            return new C4629de3(objArr[0]);
        }
        return n(objArr.length, (Object[]) objArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1472Li1) && (this instanceof UL2)) {
            AbstractC1472Li1 abstractC1472Li1 = (AbstractC1472Li1) obj;
            abstractC1472Li1.getClass();
            if ((abstractC1472Li1 instanceof UL2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC7882n53.a(this);
    }

    @Override // defpackage.AbstractC11861yi1
    public AbstractC0562Ei1 a() {
        AbstractC0562Ei1 abstractC0562Ei1 = this.g;
        if (abstractC0562Ei1 != null) {
            return abstractC0562Ei1;
        }
        AbstractC0562Ei1 q = q();
        this.g = q;
        return q;
    }

    public AbstractC0562Ei1 q() {
        Object[] array = toArray();
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        return AbstractC0562Ei1.m(array.length, array);
    }
}
