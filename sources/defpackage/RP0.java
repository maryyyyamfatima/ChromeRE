package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RP0 {
    public final AbstractC9896sy0 a;

    public static boolean l(AbstractC11362xE3 abstractC11362xE3, AbstractC11362xE3 abstractC11362xE32) {
        if (abstractC11362xE3 == null && abstractC11362xE32 == null) {
            return true;
        }
        if (abstractC11362xE3 != null && abstractC11362xE32 != null) {
            ByteBuffer byteBuffer = abstractC11362xE3.b;
            ByteBuffer byteBuffer2 = abstractC11362xE32.b;
            if (byteBuffer == null && byteBuffer2 == null) {
                return true;
            }
            if (byteBuffer != null && byteBuffer2 != null) {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining() && byteBuffer.array() == byteBuffer2.array()) {
                    return true;
                }
                return abstractC11362xE3.b.equals(abstractC11362xE32.b);
            }
        }
        return false;
    }

    public RP0(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }

    public static boolean m(UF0 uf0, C8884q1 c8884q1) {
        ByteBuffer j;
        if (uf0 == null || (j = j(uf0, 168774763)) == null) {
            return false;
        }
        C8884q1.h(j, c8884q1);
        return true;
    }

    public static ByteBuffer j(UF0 uf0, int i) {
        TF0 k = k(uf0, i);
        if (k == null) {
            return null;
        }
        return k.h();
    }

    public static int i(UP0 up0, int i, float f, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9) {
        up0.o(13);
        up0.e(0, i);
        up0.b(1, f);
        up0.c(2, i2);
        up0.c(3, i3);
        up0.e(4, i4);
        up0.e(5, i5);
        up0.e(8, i6);
        up0.a(9, z, true);
        up0.c(10, i7);
        up0.e(11, i8);
        up0.e(12, i9);
        return up0.i();
    }

    public static TF0 k(UF0 uf0, int i) {
        if (uf0 == null) {
            return null;
        }
        TF0 tf0 = new TF0();
        for (int i2 = 0; i2 < uf0.i(); i2++) {
            uf0.h(tf0, i2);
            if (tf0.j() == i) {
                return tf0;
            }
        }
        return null;
    }

    public final QP0 o(TF0 tf0, U80 u80) {
        if (tf0 == null) {
            return null;
        }
        return new QP0(tf0, this.a, u80);
    }

    public static String a(TF0 tf0) {
        return String.format("(format:%d id:%d datalength:%d)", Integer.valueOf(tf0.k()), Integer.valueOf(tf0.j()), Integer.valueOf(tf0.i()));
    }

    public static int h(UP0 up0, BR0 br0) {
        if (br0 == null) {
            return 0;
        }
        float h = br0.h();
        int b = br0.b(6);
        int i = b != 0 ? br0.b.getInt(b + br0.a) : 0;
        up0.o(2);
        up0.c(1, i);
        up0.b(0, h);
        return up0.i();
    }

    public static int c(UP0 up0, C5704gm c5704gm) {
        int i;
        int j;
        UP0 up02;
        int i2;
        int j2;
        int j3;
        UP0 up03 = up0;
        C5704gm c5704gm2 = c5704gm;
        if (c5704gm2 == null || c5704gm.n() == null) {
            return 0;
        }
        int g = up03.g(c5704gm.n());
        float s = c5704gm.s();
        int h = c5704gm.h();
        int q = c5704gm.q();
        int i3 = 4;
        if (c5704gm.m() == 0) {
            i = 0;
            j = 0;
        } else {
            int m = c5704gm.m();
            int[] iArr = new int[m];
            for (int i4 = 0; i4 < c5704gm.m(); i4++) {
                C3904bY l = c5704gm2.l(i4);
                int f = f(up03, l.j());
                int f2 = f(up03, l.i());
                long k = l.k();
                long h2 = l.h();
                up03.o(4);
                up03.e(3, f2);
                up03.e(2, f);
                up03.c(1, (int) h2);
                up03.c(0, (int) k);
                iArr[i4] = up0.i();
            }
            i = 0;
            up03.p(4, m, 4);
            while (true) {
                m--;
                if (m < 0) {
                    break;
                }
                up03.d(iArr[m]);
            }
            j = up0.j();
        }
        if (c5704gm.u() == 0) {
            i2 = 4;
            j2 = i;
            up02 = up03;
        } else {
            int u = c5704gm.u();
            int[] iArr2 = new int[u];
            int i5 = i;
            while (i5 < c5704gm.u()) {
                C9841so3 t = c5704gm2.t(i5);
                int i6 = i5;
                int[] iArr3 = iArr2;
                iArr3[i6] = C9841so3.k(up0, t.s(), t.q(), t.n() == null ? i : up03.g(t.n()), t.o(), t.l(), t.v(), g(up03, t.u()), t.r(), t.w(), t.x(), t.p(), t.t(), t.j(), t.m() == null ? i : up03.g(t.m()), t.h(), t.i());
                i5 = i6 + 1;
                i3 = 4;
                i = 0;
                up03 = up0;
                c5704gm2 = c5704gm;
                iArr2 = iArr3;
                u = u;
            }
            int[] iArr4 = iArr2;
            up02 = up0;
            i2 = i3;
            int i7 = u;
            up02.p(i2, i7, i2);
            int i8 = i7;
            while (true) {
                i8--;
                if (i8 < 0) {
                    break;
                }
                up02.d(iArr4[i8]);
            }
            j2 = up0.j();
        }
        if (c5704gm.k() == 0) {
            j3 = 0;
        } else {
            int k2 = c5704gm.k();
            int[] iArr5 = new int[k2];
            for (int i9 = 0; i9 < c5704gm.k(); i9++) {
                C1225Jl j4 = c5704gm.j(i9);
                int e = e(up02, j4.i());
                long k3 = j4.k();
                long j5 = j4.j();
                int h3 = j4.h();
                up02.o(i2);
                up02.c(3, h3);
                up02.e(2, e);
                up02.c(1, (int) j5);
                up02.c(0, (int) k3);
                iArr5[i9] = up0.i();
            }
            up02.p(i2, k2, i2);
            while (true) {
                k2--;
                if (k2 < 0) {
                    break;
                }
                up02.d(iArr5[k2]);
            }
            j3 = up0.j();
        }
        return i(up0, g, s, h, q, j, j2, j3, c5704gm.i(), c5704gm.v(), d(up0, c5704gm), h(up02, c5704gm.r()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5704gm b(C5704gm c5704gm) {
        int i;
        int i2;
        int i3;
        int j;
        int i4;
        long j2;
        long j3;
        int i5;
        float f;
        int i6;
        int j4;
        int i7;
        long j5;
        long j6;
        int j7;
        int[] iArr = null;
        if (c5704gm == null) {
            return null;
        }
        String n = c5704gm.n();
        if (n == null) {
            return c5704gm;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = 0;
        if (c5704gm.k() != 0) {
            ArrayList arrayList2 = new ArrayList();
            PriorityQueue priorityQueue = new PriorityQueue(1, new Comparator() { // from class: xg3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (int) (((C1225Jl) obj).k() - ((C1225Jl) obj2).k());
                }
            });
            for (int i8 = 0; i8 < c5704gm.k(); i8++) {
                C1225Jl j8 = c5704gm.j(i8);
                if (j8.j() == 0) {
                    priorityQueue.add(j8);
                } else {
                    arrayList2.add(j8);
                }
            }
            if (priorityQueue.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C1225Jl c1225Jl = (C1225Jl) it.next();
                    arrayList.add(new C12194zg3(c1225Jl, c1225Jl.k(), c1225Jl.j()));
                }
            } else {
                int size = priorityQueue.size();
                int[] iArr2 = new int[size];
                int i9 = 0;
                while (!priorityQueue.isEmpty()) {
                    C1225Jl c1225Jl2 = (C1225Jl) priorityQueue.poll();
                    if (c1225Jl2 != null) {
                        iArr2[i9] = (int) c1225Jl2.k();
                        arrayList.add(new C12194zg3(c1225Jl2, ((int) c1225Jl2.k()) + i9, 1L));
                        i9++;
                    }
                }
                iArr = i9 < size ? Arrays.copyOf(iArr2, i9) : iArr2;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C1225Jl c1225Jl3 = (C1225Jl) it2.next();
                    C11851yg3 a = AbstractC0034Ag3.a((int) c1225Jl3.k(), (int) c1225Jl3.j(), iArr, false);
                    arrayList.add(new C12194zg3(c1225Jl3, a.a, a.b));
                }
            }
        }
        if (iArr == null || iArr.length == 0) {
            return c5704gm;
        }
        UP0 up0 = new UP0();
        if (iArr.length != 0) {
            StringBuilder sb = new StringBuilder(n);
            int length = iArr.length;
            int length2 = n.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                int i10 = iArr[length];
                if (i10 >= 0 && i10 <= length2) {
                    sb.insert(i10, '^');
                }
            }
            n = sb.toString();
        }
        int g = up0.g(n);
        float s = c5704gm.s();
        int h = c5704gm.h();
        int q = c5704gm.q();
        if (c5704gm.m() == 0) {
            j = 0;
            i3 = 4;
            i2 = 3;
            i = 0;
        } else {
            int m = c5704gm.m();
            int[] iArr3 = new int[m];
            int i11 = 0;
            while (i11 < c5704gm.m()) {
                C3904bY l = c5704gm.l(i11);
                int f2 = f(up0, l.j());
                int f3 = f(up0, l.i());
                long k = l.k();
                long h2 = l.h();
                if (iArr.length > 0) {
                    C11851yg3 a2 = AbstractC0034Ag3.a((int) l.k(), (int) l.h(), iArr, z);
                    j2 = a2.a;
                    i4 = m;
                    j3 = a2.b;
                } else {
                    i4 = m;
                    j2 = k;
                    j3 = h2;
                }
                up0.o(4);
                up0.e(3, f3);
                up0.e(2, f2);
                up0.c(1, (int) j3);
                up0.c(0, (int) j2);
                iArr3[i11] = up0.i();
                i11++;
                z = 0;
                m = i4;
            }
            int i12 = m;
            i = z;
            i2 = 3;
            int i13 = i12;
            i3 = 4;
            up0.p(4, i13, 4);
            while (true) {
                i13--;
                if (i13 < 0) {
                    break;
                }
                up0.d(iArr3[i13]);
            }
            j = up0.j();
        }
        if (c5704gm.u() == 0) {
            i5 = g;
            f = s;
            j4 = i;
            i6 = i3;
        } else {
            int u = c5704gm.u();
            int[] iArr4 = new int[u];
            int i14 = i;
            int i15 = i2;
            int i16 = i14;
            while (i16 < c5704gm.u()) {
                C9841so3 t = c5704gm.t(i16);
                long s2 = t.s();
                long q2 = t.q();
                if (iArr.length > 0) {
                    C11851yg3 a3 = AbstractC0034Ag3.a((int) t.s(), (int) t.q(), iArr, true);
                    i7 = i14;
                    j5 = a3.a;
                    j6 = a3.b;
                } else {
                    i7 = i14;
                    j5 = s2;
                    j6 = q2;
                }
                int g2 = t.n() == null ? i7 : up0.g(t.n());
                float o = t.o();
                long l2 = t.l();
                int v = t.v();
                int[] iArr5 = iArr;
                int g3 = g(up0, t.u());
                float r = t.r();
                long w = t.w();
                int x = t.x();
                boolean p = t.p();
                int t2 = t.t();
                int j9 = t.j();
                if (t.m() != null) {
                    i7 = up0.g(t.m());
                }
                int[] iArr6 = iArr4;
                iArr6[i16] = C9841so3.k(up0, j5, j6, g2, o, l2, v, g3, r, w, x, p, t2, j9, i7, t.h(), t.i());
                i16++;
                i14 = 0;
                i3 = 4;
                u = u;
                iArr = iArr5;
                i15 = 3;
                iArr4 = iArr6;
                s = s;
                g = g;
            }
            i5 = g;
            f = s;
            int[] iArr7 = iArr4;
            i6 = i3;
            up0.p(i6, u, i6);
            while (true) {
                u--;
                if (u < 0) {
                    break;
                }
                up0.d(iArr7[u]);
            }
            j4 = up0.j();
            i2 = i15;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            if (arrayList.get(size2) == null) {
                arrayList.remove(size2);
            }
        }
        if (arrayList.isEmpty()) {
            j7 = 0;
        } else {
            int size3 = arrayList.size();
            int[] iArr8 = new int[size3];
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                C12194zg3 c12194zg3 = (C12194zg3) arrayList.get(i17);
                int e = e(up0, ((C1225Jl) c12194zg3.a).i());
                C11851yg3 c11851yg3 = c12194zg3.b;
                long j10 = c11851yg3.a;
                long j11 = c11851yg3.b;
                int h3 = ((C1225Jl) c12194zg3.a).h();
                up0.o(i6);
                up0.c(i2, h3);
                up0.e(2, e);
                up0.c(1, (int) j11);
                up0.c(0, (int) j10);
                iArr8[i17] = up0.i();
            }
            up0.p(i6, size3, i6);
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                up0.d(iArr8[size3]);
            }
            j7 = up0.j();
        }
        up0.k(i(up0, i5, f, h, q, j, j4, j7, c5704gm.i(), c5704gm.v(), d(up0, c5704gm), h(up0, c5704gm.r())));
        ByteBuffer h4 = up0.h();
        C5704gm c5704gm2 = new C5704gm();
        c5704gm2.c(h4.position() + TW1.a(h4, ByteOrder.LITTLE_ENDIAN), h4);
        return c5704gm2;
    }

    public static int d(UP0 up0, C5704gm c5704gm) {
        if (c5704gm.p() == 0) {
            return 0;
        }
        int[] iArr = new int[c5704gm.p()];
        for (int i = 0; i < c5704gm.p(); i++) {
            iArr[i] = f(up0, c5704gm.o(i).h());
        }
        int p = c5704gm.p();
        int[] iArr2 = new int[p];
        for (int i2 = 0; i2 < c5704gm.p(); i2++) {
            int i3 = iArr[i2];
            up0.o(1);
            up0.e(0, i3);
            iArr2[i2] = up0.i();
        }
        up0.p(4, p, 4);
        while (true) {
            p--;
            if (p < 0) {
                return up0.j();
            }
            up0.d(iArr2[p]);
        }
    }

    public static int f(UP0 up0, TF0 tf0) {
        int i;
        if (tf0 == null) {
            return 0;
        }
        if (tf0.i() > 0) {
            int i2 = tf0.i();
            byte[] bArr = new byte[i2];
            tf0.f(6).get(bArr);
            up0.p(1, i2, 1);
            ByteBuffer byteBuffer = up0.a;
            int i3 = up0.b - i2;
            up0.b = i3;
            byteBuffer.position(i3);
            up0.a.put(bArr);
            i = up0.j();
        } else {
            i = 0;
        }
        int j = tf0.j();
        int k = tf0.k();
        up0.o(3);
        up0.c(2, k);
        up0.e(1, i);
        up0.c(0, j);
        return up0.i();
    }

    public static int g(UP0 up0, UF0 uf0) {
        if (uf0 == null) {
            return 0;
        }
        int i = uf0.i();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < uf0.i(); i2++) {
            iArr[i2] = f(up0, uf0.h(new TF0(), i2));
        }
        up0.p(4, i, 4);
        while (true) {
            i--;
            if (i < 0) {
                int j = up0.j();
                up0.o(1);
                up0.e(0, j);
                return up0.i();
            }
            up0.d(iArr[i]);
        }
    }

    public static int e(UP0 up0, C5427fx0 c5427fx0) {
        int i;
        if (c5427fx0 == null) {
            return 0;
        }
        int f = f(up0, c5427fx0.m());
        int g = g(up0, c5427fx0.l());
        if (c5427fx0.i() > 0) {
            int i2 = c5427fx0.i();
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < c5427fx0.i(); i3++) {
                iArr[i3] = e(up0, c5427fx0.h(i3));
            }
            up0.p(4, i2, 4);
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                up0.d(iArr[i2]);
            }
            i = up0.j();
        } else {
            i = 0;
        }
        int g2 = c5427fx0.k() != null ? up0.g(c5427fx0.k()) : 0;
        up0.o(4);
        up0.e(3, g2);
        up0.e(2, i);
        up0.e(1, g);
        up0.e(0, f);
        return up0.i();
    }

    public static IntersectionCriteria n(C9514rr1 c9514rr1) {
        int b = c9514rr1.b(4);
        float f = b != 0 ? c9514rr1.b.getFloat(b + c9514rr1.a) : 0.0f;
        int b2 = c9514rr1.b(6);
        return new IntersectionCriteria(f, (b2 != 0 ? c9514rr1.b.getInt(b2 + c9514rr1.a) : 0) != 2);
    }
}
