package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GE3 extends AbstractMap {
    public static final DE3 k = new DE3();
    public final Object[] a;
    public final int[] g;
    public final FE3 h = new FE3(this, -1);
    public Integer i = null;
    public String j = null;

    public GE3(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size() + 0;
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                iArr[0] = 0;
                this.a = size > 16 && size * 9 > 0 ? Arrays.copyOf(objArr, 0) : objArr;
                this.g = iArr;
                return;
            }
            X5.a(it2.next());
            throw null;
        }
        X5.a(it.next());
        throw null;
    }

    public GE3(GE3 ge3, GE3 ge32) {
        int i;
        int i2;
        int i3;
        Object obj;
        Object[] objArr;
        int i4 = -1;
        int size = ge32.size() + ge3.size();
        int i5 = ge32.g[ge32.size()] + ge3.g[ge3.size()];
        Object[] objArr2 = new Object[i5];
        int i6 = size + 1;
        int[] iArr = new int[i6];
        int i7 = 0;
        iArr[0] = size;
        Map.Entry b = ge3.b(0);
        int i8 = size;
        Map.Entry b2 = ge32.b(0);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (b == null && b2 == null) {
                break;
            }
            int i12 = b == null ? 1 : b2 == null ? i4 : i7;
            if (i12 == 0 && (i12 = ((String) b.getKey()).compareTo((String) b2.getKey())) == 0) {
                objArr2[i9] = new AbstractMap.SimpleImmutableEntry((String) b.getKey(), new FE3(this, i9));
                int i13 = i9 + 1;
                FE3 fe3 = (FE3) b.getValue();
                FE3 fe32 = (FE3) b2.getValue();
                int i14 = i7;
                int i15 = i14;
                while (true) {
                    if (i14 >= fe3.size() && i15 >= fe32.size()) {
                        break;
                    }
                    int i16 = i14 == fe3.size() ? 1 : i15 == fe32.size() ? i4 : i7;
                    GE3 ge33 = fe3.g;
                    if (i16 == 0) {
                        i2 = i13;
                        i16 = ME3.b.compare(ge33.a[fe3.a() + i14], fe32.g.a[fe32.a() + i15]);
                    } else {
                        i2 = i13;
                    }
                    if (i16 < 0) {
                        i3 = i14 + 1;
                        obj = ge33.a[fe3.a() + i14];
                    } else {
                        int i17 = i15 + 1;
                        Object obj2 = fe32.g.a[fe32.a() + i15];
                        i3 = i16 == 0 ? i14 + 1 : i14;
                        i15 = i17;
                        obj = obj2;
                    }
                    objArr2[i8] = obj;
                    i14 = i3;
                    i8++;
                    i13 = i2;
                    i4 = -1;
                    i7 = 0;
                }
                iArr[i13] = i8;
                int i18 = i10 + 1;
                b = ge3.b(i18);
                int i19 = i11 + 1;
                b2 = ge32.b(i19);
                i10 = i18;
                i11 = i19;
                i9 = i13;
            } else {
                if (i12 < 0) {
                    i = i9 + 1;
                    int a = a(b, i9, i8, objArr2, iArr);
                    int i20 = i10 + 1;
                    b = ge3.b(i20);
                    i8 = a;
                    i10 = i20;
                } else {
                    i = i9 + 1;
                    int a2 = a(b2, i9, i8, objArr2, iArr);
                    int i21 = i11 + 1;
                    b2 = ge32.b(i21);
                    i8 = a2;
                    i11 = i21;
                }
                i9 = i;
                i4 = -1;
                i7 = 0;
            }
        }
        int i22 = iArr[i7];
        int i23 = i22 - i9;
        if (i23 != 0) {
            for (int i24 = i7; i24 <= i9; i24++) {
                iArr[i24] = iArr[i24] - i23;
            }
            int i25 = iArr[i9];
            int i26 = i25 - i9;
            if (((i5 <= 16 || i5 * 9 <= i25 * 10) ? i7 : 1) != 0) {
                objArr = new Object[i25];
                System.arraycopy(objArr2, i7, objArr, i7, i9);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i22, objArr, i9, i26);
            objArr2 = objArr;
        }
        this.a = objArr2;
        int i27 = iArr[i7] + 1;
        if (i6 > 16 && i6 * 9 > i27 * 10) {
            i7 = 1;
        }
        this.g = i7 != 0 ? Arrays.copyOf(iArr, i27) : iArr;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        FE3 fe3 = (FE3) entry.getValue();
        int a = fe3.g.g[fe3.a + 1] - fe3.a();
        System.arraycopy(fe3.g.a, fe3.a(), objArr, i2, a);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new FE3(this, i));
        int i3 = i2 + a;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry b(int i) {
        if (i < this.g[0]) {
            return (Map.Entry) this.a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.i == null) {
            this.i = Integer.valueOf(super.hashCode());
        }
        return this.i.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.j == null) {
            this.j = super.toString();
        }
        return this.j;
    }
}
