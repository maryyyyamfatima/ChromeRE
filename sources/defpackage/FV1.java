package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FV1 implements QW2 {
    public static final int[] q = new int[0];
    public static final Unsafe r = Q14.o();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final C7181l32 l;
    public final BC1 m;
    public final A14 n;
    public final YF0 o;
    public final PL1 p;

    public static long B(int i) {
        return i & 1048575;
    }

    public FV1(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, C7181l32 c7181l32, BC1 bc1, A14 a14, YF0 yf0, PL1 pl1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof QX0;
        this.h = z;
        this.f = yf0 != null && (messageLite instanceof MX0);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = c7181l32;
        this.m = bc1;
        this.n = a14;
        this.o = yf0;
        this.e = messageLite;
        this.p = pl1;
    }

    public static FV1 z(InterfaceC6297iV1 interfaceC6297iV1, C7181l32 c7181l32, BC1 bc1, A14 a14, YF0 yf0, PL1 pl1) {
        if (interfaceC6297iV1 instanceof C8976qH2) {
            return A((C8976qH2) interfaceC6297iV1, c7181l32, bc1, a14, yf0, pl1);
        }
        X5.a(interfaceC6297iV1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.FV1 A(defpackage.C8976qH2 r34, defpackage.C7181l32 r35, defpackage.BC1 r36, defpackage.A14 r37, defpackage.YF0 r38, defpackage.PL1 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.A(qH2, l32, BC1, A14, YF0, PL1):FV1");
    }

    public static Field N(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a = AbstractC10975w63.a("Field ", str, " for ", name, " not found. Known fields are ");
            a.append(arrays);
            throw new RuntimeException(a.toString());
        }
    }

    @Override // defpackage.QW2
    public final Object i() {
        this.l.getClass();
        return ((QX0) this.e).l(PX0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:            if (defpackage.YW2.D(defpackage.Q14.n(r7, r11), defpackage.Q14.n(r7, r12)) != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:            if (defpackage.YW2.D(defpackage.Q14.n(r7, r11), defpackage.Q14.n(r7, r12)) != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:            if (defpackage.Q14.m(r7, r11) == defpackage.Q14.m(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:            if (defpackage.Q14.m(r7, r11) == defpackage.Q14.m(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:            if (defpackage.YW2.D(defpackage.Q14.n(r7, r11), defpackage.Q14.n(r7, r12)) != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:            if (defpackage.YW2.D(defpackage.Q14.n(r7, r11), defpackage.Q14.n(r7, r12)) != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:            if (defpackage.YW2.D(defpackage.Q14.n(r7, r11), defpackage.Q14.n(r7, r12)) != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:            if (defpackage.Q14.f(r7, r11) == defpackage.Q14.f(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:            if (defpackage.Q14.m(r7, r11) == defpackage.Q14.m(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:            if (defpackage.Q14.l(r7, r11) == defpackage.Q14.l(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:            if (defpackage.Q14.m(r7, r11) == defpackage.Q14.m(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:            if (defpackage.Q14.m(r7, r11) == defpackage.Q14.m(r7, r12)) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:            if (java.lang.Float.floatToIntBits(defpackage.Q14.k(r7, r11)) == java.lang.Float.floatToIntBits(defpackage.Q14.k(r7, r12))) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:            if (java.lang.Double.doubleToLongBits(defpackage.Q14.j(r7, r11)) == java.lang.Double.doubleToLongBits(defpackage.Q14.j(r7, r12))) goto L475;     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[LOOP:0: B:2:0x0005->B:89:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb A[SYNTHETIC] */
    @Override // defpackage.QW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f2, code lost:            if (r4 != false) goto L455;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:            if (r4 != false) goto L455;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f5, code lost:            r8 = 1237;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f6, code lost:            r4 = r8;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // defpackage.QW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.j(java.lang.Object):int");
    }

    @Override // defpackage.QW2
    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                YW2.C(this.n, obj, obj2);
                if (this.f) {
                    YW2.B(this.o, obj, obj2);
                    return;
                }
                return;
            }
            int R = R(i);
            long j = 1048575 & R;
            int i2 = iArr[i];
            switch ((R & 267386880) >>> 20) {
                case 0:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.t(j, obj, Q14.j(j, obj2));
                        O(i, obj);
                        break;
                    }
                case 1:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.u(Q14.k(j, obj2), j, obj);
                        O(i, obj);
                        break;
                    }
                case 2:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.w(j, Q14.m(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.w(j, Q14.m(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 4:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.w(j, Q14.m(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 6:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 7:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.p(j, obj, Q14.f(j, obj2));
                        O(i, obj);
                        break;
                    }
                case 8:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.x(j, obj, Q14.n(j, obj2));
                        O(i, obj);
                        break;
                    }
                case 9:
                    x(obj, i, obj2);
                    break;
                case 10:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.x(j, obj, Q14.n(j, obj2));
                        O(i, obj);
                        break;
                    }
                case 11:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 12:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 13:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 14:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.w(j, Q14.m(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 15:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.v(j, Q14.l(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 16:
                    if (!t(i, obj2)) {
                        break;
                    } else {
                        Q14.w(j, Q14.m(j, obj2), obj);
                        O(i, obj);
                        break;
                    }
                case 17:
                    x(obj, i, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.m.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = YW2.a;
                    Object n = Q14.n(j, obj);
                    Object n2 = Q14.n(j, obj2);
                    this.p.getClass();
                    Q14.x(j, obj, PL1.e(n, n2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!u(obj2, i2, i)) {
                        break;
                    } else {
                        Q14.x(j, obj, Q14.n(j, obj2));
                        P(obj, i2, i);
                        break;
                    }
                case 60:
                    y(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!u(obj2, i2, i)) {
                        break;
                    } else {
                        Q14.x(j, obj, Q14.n(j, obj2));
                        P(obj, i2, i);
                        break;
                    }
                case 68:
                    y(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    public final void x(Object obj, int i, Object obj2) {
        long R = R(i) & 1048575;
        if (t(i, obj2)) {
            Object n = Q14.n(R, obj);
            Object n2 = Q14.n(R, obj2);
            if (n != null && n2 != null) {
                Q14.x(R, obj, AbstractC1507Lp1.b(n, n2));
                O(i, obj);
            } else if (n2 != null) {
                Q14.x(R, obj, n2);
                O(i, obj);
            }
        }
    }

    public final void y(Object obj, int i, Object obj2) {
        int R = R(i);
        int i2 = this.a[i];
        long j = R & 1048575;
        if (u(obj2, i2, i)) {
            Object n = u(obj, i2, i) ? Q14.n(j, obj) : null;
            Object n2 = Q14.n(j, obj2);
            if (n != null && n2 != null) {
                Q14.x(j, obj, AbstractC1507Lp1.b(n, n2));
                P(obj, i2, i);
            } else if (n2 != null) {
                Q14.x(j, obj, n2);
                P(obj, i2, i);
            }
        }
    }

    @Override // defpackage.QW2
    public final int h(Object obj) {
        return this.h ? s(obj) : r(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0035. Please report as an issue. */
    public final int r(Object obj) {
        int i;
        int d;
        int q2;
        int i2;
        int s;
        int u;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 < iArr.length) {
                int R = R(i4);
                int i7 = iArr[i4];
                int i8 = (267386880 & R) >>> 20;
                Unsafe unsafe = r;
                if (i8 <= 17) {
                    int i9 = iArr[i4 + 2];
                    int i10 = i9 & 1048575;
                    i = 1 << (i9 >>> 20);
                    if (i10 != i3) {
                        i6 = unsafe.getInt(obj, i10);
                        i3 = i10;
                    }
                } else {
                    i = 0;
                }
                long j = R & 1048575;
                switch (i8) {
                    case 0:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.d(i7);
                            i5 += d;
                            break;
                        }
                    case 1:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.h(i7);
                            i5 += d;
                            break;
                        }
                    case 2:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.l(i7, unsafe.getLong(obj, j));
                            i5 += d;
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.v(i7, unsafe.getLong(obj, j));
                            i5 += d;
                            break;
                        }
                    case 4:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.j(i7, unsafe.getInt(obj, j));
                            i5 += d;
                            break;
                        }
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.g(i7);
                            i5 += d;
                            break;
                        }
                    case 6:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.f(i7);
                            i5 += d;
                            break;
                        }
                    case 7:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.b(i7);
                            i5 += d;
                            break;
                        }
                    case 8:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof AbstractC4147cE) {
                                q2 = KV.c(i7, (AbstractC4147cE) object);
                            } else {
                                q2 = KV.q(i7, (String) object);
                            }
                            i5 = q2 + i5;
                            break;
                        }
                    case 9:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = YW2.o(i7, p(i4), unsafe.getObject(obj, j));
                            i5 += d;
                            break;
                        }
                    case 10:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.c(i7, (AbstractC4147cE) unsafe.getObject(obj, j));
                            i5 += d;
                            break;
                        }
                    case 11:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.t(i7, unsafe.getInt(obj, j));
                            i5 += d;
                            break;
                        }
                    case 12:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.e(i7, unsafe.getInt(obj, j));
                            i5 += d;
                            break;
                        }
                    case 13:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.m(i7);
                            i5 += d;
                            break;
                        }
                    case 14:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.n(i7);
                            i5 += d;
                            break;
                        }
                    case 15:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.o(i7, unsafe.getInt(obj, j));
                            i5 += d;
                            break;
                        }
                    case 16:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.p(i7, unsafe.getLong(obj, j));
                            i5 += d;
                            break;
                        }
                    case 17:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            d = KV.i(i7, (MessageLite) unsafe.getObject(obj, j), p(i4));
                            i5 += d;
                            break;
                        }
                    case 18:
                        d = YW2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 19:
                        d = YW2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 20:
                        d = YW2.m(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 21:
                        d = YW2.x(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 22:
                        d = YW2.k(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 23:
                        d = YW2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 24:
                        d = YW2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 25:
                        d = YW2.a(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 26:
                        d = YW2.u(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 27:
                        d = YW2.p(i7, (List) unsafe.getObject(obj, j), p(i4));
                        i5 += d;
                        break;
                    case 28:
                        d = YW2.c(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 29:
                        d = YW2.v(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 30:
                        d = YW2.d(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 31:
                        d = YW2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 32:
                        d = YW2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 33:
                        d = YW2.q(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 34:
                        d = YW2.s(i7, (List) unsafe.getObject(obj, j));
                        i5 += d;
                        break;
                    case 35:
                        i2 = YW2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 36:
                        i2 = YW2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 37:
                        i2 = YW2.n((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 38:
                        i2 = YW2.y((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 39:
                        i2 = YW2.l((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 40:
                        i2 = YW2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 41:
                        i2 = YW2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 42:
                        i2 = YW2.b((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 43:
                        i2 = YW2.w((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 44:
                        i2 = YW2.e((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 45:
                        i2 = YW2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 46:
                        i2 = YW2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 47:
                        i2 = YW2.r((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 48:
                        i2 = YW2.t((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            s = KV.s(i7);
                            u = KV.u(i2);
                            i5 = u + s + i2 + i5;
                            break;
                        }
                    case 49:
                        d = YW2.j(i7, (List) unsafe.getObject(obj, j), p(i4));
                        i5 += d;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(obj, j);
                        Object o = o(i4);
                        this.p.getClass();
                        d = PL1.c(object2, i7, o);
                        i5 += d;
                        break;
                    case 51:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.d(i7);
                            i5 += d;
                            break;
                        }
                    case 52:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.h(i7);
                            i5 += d;
                            break;
                        }
                    case 53:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.l(i7, D(j, obj));
                            i5 += d;
                            break;
                        }
                    case 54:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.v(i7, D(j, obj));
                            i5 += d;
                            break;
                        }
                    case 55:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.j(i7, C(j, obj));
                            i5 += d;
                            break;
                        }
                    case 56:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.g(i7);
                            i5 += d;
                            break;
                        }
                    case 57:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.f(i7);
                            i5 += d;
                            break;
                        }
                    case 58:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.b(i7);
                            i5 += d;
                            break;
                        }
                    case 59:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j);
                            if (object3 instanceof AbstractC4147cE) {
                                q2 = KV.c(i7, (AbstractC4147cE) object3);
                            } else {
                                q2 = KV.q(i7, (String) object3);
                            }
                            i5 = q2 + i5;
                            break;
                        }
                    case 60:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = YW2.o(i7, p(i4), unsafe.getObject(obj, j));
                            i5 += d;
                            break;
                        }
                    case 61:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.c(i7, (AbstractC4147cE) unsafe.getObject(obj, j));
                            i5 += d;
                            break;
                        }
                    case 62:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.t(i7, C(j, obj));
                            i5 += d;
                            break;
                        }
                    case 63:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.e(i7, C(j, obj));
                            i5 += d;
                            break;
                        }
                    case 64:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.m(i7);
                            i5 += d;
                            break;
                        }
                    case 65:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.n(i7);
                            i5 += d;
                            break;
                        }
                    case 66:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.o(i7, C(j, obj));
                            i5 += d;
                            break;
                        }
                    case 67:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.p(i7, D(j, obj));
                            i5 += d;
                            break;
                        }
                    case 68:
                        if (!u(obj, i7, i4)) {
                            break;
                        } else {
                            d = KV.i(i7, (MessageLite) unsafe.getObject(obj, j), p(i4));
                            i5 += d;
                            break;
                        }
                }
                i4 += 3;
            } else {
                this.n.getClass();
                int a = ((QX0) obj).g.a() + i5;
                if (!this.f) {
                    return a;
                }
                this.o.getClass();
                return a + YF0.b(obj).e();
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public final int s(Object obj) {
        int d;
        int q2;
        int i;
        int s;
        int u;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int R = R(i2);
                int i4 = (267386880 & R) >>> 20;
                int i5 = iArr[i2];
                long j = R & 1048575;
                if (i4 >= EnumC5907hM0.g.a() && i4 <= EnumC5907hM0.h.a()) {
                    int i6 = iArr[i2 + 2];
                }
                Unsafe unsafe = r;
                switch (i4) {
                    case 0:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.d(i5);
                            i3 += d;
                            break;
                        }
                    case 1:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.h(i5);
                            i3 += d;
                            break;
                        }
                    case 2:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.l(i5, Q14.m(j, obj));
                            i3 += d;
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.v(i5, Q14.m(j, obj));
                            i3 += d;
                            break;
                        }
                    case 4:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.j(i5, Q14.l(j, obj));
                            i3 += d;
                            break;
                        }
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.g(i5);
                            i3 += d;
                            break;
                        }
                    case 6:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.f(i5);
                            i3 += d;
                            break;
                        }
                    case 7:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.b(i5);
                            i3 += d;
                            break;
                        }
                    case 8:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            Object n = Q14.n(j, obj);
                            if (n instanceof AbstractC4147cE) {
                                q2 = KV.c(i5, (AbstractC4147cE) n);
                            } else {
                                q2 = KV.q(i5, (String) n);
                            }
                            i3 = q2 + i3;
                            break;
                        }
                    case 9:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = YW2.o(i5, p(i2), Q14.n(j, obj));
                            i3 += d;
                            break;
                        }
                    case 10:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.c(i5, (AbstractC4147cE) Q14.n(j, obj));
                            i3 += d;
                            break;
                        }
                    case 11:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.t(i5, Q14.l(j, obj));
                            i3 += d;
                            break;
                        }
                    case 12:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.e(i5, Q14.l(j, obj));
                            i3 += d;
                            break;
                        }
                    case 13:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.m(i5);
                            i3 += d;
                            break;
                        }
                    case 14:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.n(i5);
                            i3 += d;
                            break;
                        }
                    case 15:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.o(i5, Q14.l(j, obj));
                            i3 += d;
                            break;
                        }
                    case 16:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.p(i5, Q14.m(j, obj));
                            i3 += d;
                            break;
                        }
                    case 17:
                        if (!t(i2, obj)) {
                            break;
                        } else {
                            d = KV.i(i5, (MessageLite) Q14.n(j, obj), p(i2));
                            i3 += d;
                            break;
                        }
                    case 18:
                        d = YW2.h(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 19:
                        d = YW2.f(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 20:
                        d = YW2.m(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 21:
                        d = YW2.x(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 22:
                        d = YW2.k(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 23:
                        d = YW2.h(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 24:
                        d = YW2.f(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 25:
                        d = YW2.a(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 26:
                        d = YW2.u(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 27:
                        d = YW2.p(i5, v(j, obj), p(i2));
                        i3 += d;
                        break;
                    case 28:
                        d = YW2.c(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 29:
                        d = YW2.v(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 30:
                        d = YW2.d(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 31:
                        d = YW2.f(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 32:
                        d = YW2.h(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 33:
                        d = YW2.q(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 34:
                        d = YW2.s(i5, v(j, obj));
                        i3 += d;
                        break;
                    case 35:
                        i = YW2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 36:
                        i = YW2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 37:
                        i = YW2.n((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 38:
                        i = YW2.y((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 39:
                        i = YW2.l((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 40:
                        i = YW2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 41:
                        i = YW2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 42:
                        i = YW2.b((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 43:
                        i = YW2.w((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 44:
                        i = YW2.e((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 45:
                        i = YW2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 46:
                        i = YW2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 47:
                        i = YW2.r((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 48:
                        i = YW2.t((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            s = KV.s(i5);
                            u = KV.u(i);
                            i3 = u + s + i + i3;
                            break;
                        }
                    case 49:
                        d = YW2.j(i5, v(j, obj), p(i2));
                        i3 += d;
                        break;
                    case 50:
                        Object n2 = Q14.n(j, obj);
                        Object o = o(i2);
                        this.p.getClass();
                        d = PL1.c(n2, i5, o);
                        i3 += d;
                        break;
                    case 51:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.d(i5);
                            i3 += d;
                            break;
                        }
                    case 52:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.h(i5);
                            i3 += d;
                            break;
                        }
                    case 53:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.l(i5, D(j, obj));
                            i3 += d;
                            break;
                        }
                    case 54:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.v(i5, D(j, obj));
                            i3 += d;
                            break;
                        }
                    case 55:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.j(i5, C(j, obj));
                            i3 += d;
                            break;
                        }
                    case 56:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.g(i5);
                            i3 += d;
                            break;
                        }
                    case 57:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.f(i5);
                            i3 += d;
                            break;
                        }
                    case 58:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.b(i5);
                            i3 += d;
                            break;
                        }
                    case 59:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            Object n3 = Q14.n(j, obj);
                            if (n3 instanceof AbstractC4147cE) {
                                q2 = KV.c(i5, (AbstractC4147cE) n3);
                            } else {
                                q2 = KV.q(i5, (String) n3);
                            }
                            i3 = q2 + i3;
                            break;
                        }
                    case 60:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = YW2.o(i5, p(i2), Q14.n(j, obj));
                            i3 += d;
                            break;
                        }
                    case 61:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.c(i5, (AbstractC4147cE) Q14.n(j, obj));
                            i3 += d;
                            break;
                        }
                    case 62:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.t(i5, C(j, obj));
                            i3 += d;
                            break;
                        }
                    case 63:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.e(i5, C(j, obj));
                            i3 += d;
                            break;
                        }
                    case 64:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.m(i5);
                            i3 += d;
                            break;
                        }
                    case 65:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.n(i5);
                            i3 += d;
                            break;
                        }
                    case 66:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.o(i5, C(j, obj));
                            i3 += d;
                            break;
                        }
                    case 67:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.p(i5, D(j, obj));
                            i3 += d;
                            break;
                        }
                    case 68:
                        if (!u(obj, i5, i2)) {
                            break;
                        } else {
                            d = KV.i(i5, (MessageLite) Q14.n(j, obj), p(i2));
                            i3 += d;
                            break;
                        }
                }
                i2 += 3;
            } else {
                this.n.getClass();
                return ((QX0) obj).g.a() + i3;
            }
        }
    }

    public static List v(long j, Object obj) {
        return (List) Q14.n(j, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024e  */
    @Override // defpackage.QW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r18, defpackage.LV r19) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.d(java.lang.Object, LV):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.Object r21, defpackage.LV r22) {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.S(java.lang.Object, LV):void");
    }

    public final void T(LV lv, int i, Object obj, int i2) {
        if (obj != null) {
            Object o = o(i2);
            this.p.getClass();
            LL1 ll1 = ((ML1) o).a;
            KV kv = lv.a;
            kv.getClass();
            for (Map.Entry entry : ((OL1) obj).entrySet()) {
                kv.O(i, 2);
                kv.Q(ML1.a(ll1, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                C5563gM0.l(kv, ll1.a, 1, key);
                C5563gM0.l(kv, ll1.c, 2, value);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06df A[LOOP:1: B:32:0x06dd->B:33:0x06df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06a2 A[Catch: all -> 0x06d4, TryCatch #4 {all -> 0x06d4, blocks: (B:97:0x0683, B:76:0x069d, B:78:0x06a2, B:80:0x06a9), top: B:96:0x0683 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06b1  */
    @Override // defpackage.QW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r22, defpackage.FH2 r23, defpackage.XF0 r24) {
        /*
            Method dump skipped, instructions count: 1920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.e(java.lang.Object, FH2, XF0):void");
    }

    public static C11975z14 q(Object obj) {
        QX0 qx0 = (QX0) obj;
        C11975z14 c11975z14 = qx0.g;
        if (c11975z14 != C11975z14.f) {
            return c11975z14;
        }
        C11975z14 b = C11975z14.b();
        qx0.g = b;
        return b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static int l(byte[] bArr, int i, int i2, EnumC10540uq4 enumC10540uq4, Class cls, C2254Rj c2254Rj) {
        switch (enumC10540uq4.ordinal()) {
            case 0:
                c2254Rj.c = Double.valueOf(Double.longBitsToDouble(AbstractC2384Sj.i(i, bArr)));
                return i + 8;
            case 1:
                c2254Rj.c = Float.valueOf(Float.intBitsToFloat(AbstractC2384Sj.g(i, bArr)));
                return i + 4;
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int J2 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                c2254Rj.c = Long.valueOf(c2254Rj.b);
                return J2;
            case 4:
            case 12:
            case 13:
                int H = AbstractC2384Sj.H(bArr, i, c2254Rj);
                c2254Rj.c = Integer.valueOf(c2254Rj.a);
                return H;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 15:
                c2254Rj.c = Long.valueOf(AbstractC2384Sj.i(i, bArr));
                return i + 8;
            case 6:
            case 14:
                c2254Rj.c = Integer.valueOf(AbstractC2384Sj.g(i, bArr));
                return i + 4;
            case 7:
                int J3 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                c2254Rj.c = Boolean.valueOf(c2254Rj.b != 0);
                return J3;
            case 8:
                return AbstractC2384Sj.E(bArr, i, c2254Rj);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return AbstractC2384Sj.o(C7931nE2.c.b(cls), bArr, i, i2, c2254Rj);
            case 11:
                return AbstractC2384Sj.b(bArr, i, c2254Rj);
            case 16:
                int H2 = AbstractC2384Sj.H(bArr, i, c2254Rj);
                c2254Rj.c = Integer.valueOf(DV.b(c2254Rj.a));
                return H2;
            case 17:
                int J4 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                c2254Rj.c = Long.valueOf(DV.c(c2254Rj.b));
                return J4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0031. Please report as an issue. */
    public final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C2254Rj c2254Rj) {
        int I;
        Unsafe unsafe = r;
        AbstractC7504m0 abstractC7504m0 = (AbstractC7504m0) ((InterfaceC1377Kp1) unsafe.getObject(obj, j2));
        boolean b = abstractC7504m0.b();
        InterfaceC1377Kp1 interfaceC1377Kp1 = abstractC7504m0;
        if (!b) {
            int size = abstractC7504m0.size();
            InterfaceC1377Kp1 c = abstractC7504m0.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, c);
            interfaceC1377Kp1 = c;
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return AbstractC2384Sj.r(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 1) {
                    return AbstractC2384Sj.e(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return AbstractC2384Sj.u(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 5) {
                    return AbstractC2384Sj.l(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return AbstractC2384Sj.y(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 0) {
                    return AbstractC2384Sj.K(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return AbstractC2384Sj.x(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 0) {
                    return AbstractC2384Sj.I(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return AbstractC2384Sj.t(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 1) {
                    return AbstractC2384Sj.j(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return AbstractC2384Sj.s(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 5) {
                    return AbstractC2384Sj.h(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return AbstractC2384Sj.q(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 0) {
                    return AbstractC2384Sj.a(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return AbstractC2384Sj.C(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                    }
                    return AbstractC2384Sj.D(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return AbstractC2384Sj.p(p(i6), i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return AbstractC2384Sj.c(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        I = AbstractC2384Sj.I(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                    }
                    return i;
                }
                I = AbstractC2384Sj.x(bArr, i, interfaceC1377Kp1, c2254Rj);
                QX0 qx0 = (QX0) obj;
                C11975z14 c11975z14 = qx0.g;
                if (c11975z14 == C11975z14.f) {
                    c11975z14 = null;
                }
                C11975z14 c11975z142 = (C11975z14) YW2.z(i4, interfaceC1377Kp1, n(i6), c11975z14, this.n);
                if (c11975z142 != null) {
                    qx0.g = c11975z142;
                }
                return I;
            case 33:
            case 47:
                if (i5 == 2) {
                    return AbstractC2384Sj.v(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 0) {
                    return AbstractC2384Sj.z(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return AbstractC2384Sj.w(bArr, i, interfaceC1377Kp1, c2254Rj);
                }
                if (i5 == 0) {
                    return AbstractC2384Sj.A(i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return AbstractC2384Sj.n(p(i6), i3, bArr, i, i2, interfaceC1377Kp1, c2254Rj);
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, long j, C2254Rj c2254Rj) {
        Object o = o(i3);
        Unsafe unsafe = r;
        Object object = unsafe.getObject(obj, j);
        this.p.getClass();
        if (PL1.d(object)) {
            OL1 f = PL1.f();
            PL1.e(f, object);
            unsafe.putObject(obj, j, f);
            object = f;
        }
        LL1 a = PL1.a(o);
        OL1 b = PL1.b(object);
        int H = AbstractC2384Sj.H(bArr, i, c2254Rj);
        int i4 = c2254Rj.a;
        if (i4 < 0 || i4 > i2 - H) {
            throw C1127Ir1.h();
        }
        int i5 = H + i4;
        Object obj2 = a.b;
        Object obj3 = a.d;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (H < i5) {
            int i6 = H + 1;
            byte b2 = bArr[H];
            if (b2 < 0) {
                i6 = AbstractC2384Sj.G(b2, bArr, i6, c2254Rj);
                b2 = c2254Rj.a;
            }
            int i7 = b2 >>> 3;
            int i8 = b2 & 7;
            if (i7 == 1) {
                EnumC10540uq4 enumC10540uq4 = a.a;
                if (i8 == enumC10540uq4.g) {
                    H = l(bArr, i6, i2, enumC10540uq4, null, c2254Rj);
                    obj4 = c2254Rj.c;
                } else {
                    H = AbstractC2384Sj.L(b2, bArr, i6, i2, c2254Rj);
                }
            } else {
                if (i7 == 2) {
                    EnumC10540uq4 enumC10540uq42 = a.c;
                    if (i8 == enumC10540uq42.g) {
                        H = l(bArr, i6, i2, enumC10540uq42, obj3.getClass(), c2254Rj);
                        obj5 = c2254Rj.c;
                    }
                }
                H = AbstractC2384Sj.L(b2, bArr, i6, i2, c2254Rj);
            }
        }
        if (H != i5) {
            throw C1127Ir1.g();
        }
        b.put(obj4, obj5);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C2254Rj c2254Rj) {
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = r;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC2384Sj.d(i, bArr)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC2384Sj.k(i, bArr)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int J2 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, Long.valueOf(c2254Rj.b));
                    unsafe.putInt(obj, j2, i4);
                    return J2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    int H = AbstractC2384Sj.H(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, Integer.valueOf(c2254Rj.a));
                    unsafe.putInt(obj, j2, i4);
                    return H;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC2384Sj.i(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC2384Sj.g(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int J3 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, Boolean.valueOf(c2254Rj.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return J3;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int H2 = AbstractC2384Sj.H(bArr, i, c2254Rj);
                    int i13 = c2254Rj.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !AbstractC7551m74.f(bArr, H2, H2 + i13)) {
                            throw C1127Ir1.c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, H2, i13, AbstractC1507Lp1.a));
                        H2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return H2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int o = AbstractC2384Sj.o(p(i8), bArr, i, i2, c2254Rj);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, c2254Rj.c);
                    } else {
                        unsafe.putObject(obj, j, AbstractC1507Lp1.b(object, c2254Rj.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return o;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int b = AbstractC2384Sj.b(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, c2254Rj.c);
                    unsafe.putInt(obj, j2, i4);
                    return b;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int H3 = AbstractC2384Sj.H(bArr, i, c2254Rj);
                    int i14 = c2254Rj.a;
                    InterfaceC0727Fp1 n = n(i8);
                    if (n == null || n.a(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        q(obj).c(i3, Long.valueOf(i14));
                    }
                    return H3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int H4 = AbstractC2384Sj.H(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, Integer.valueOf(DV.b(c2254Rj.a)));
                    unsafe.putInt(obj, j2, i4);
                    return H4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int J4 = AbstractC2384Sj.J(bArr, i, c2254Rj);
                    unsafe.putObject(obj, j, Long.valueOf(DV.c(c2254Rj.b)));
                    unsafe.putInt(obj, j2, i4);
                    return J4;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    int m = AbstractC2384Sj.m(p(i8), bArr, i, i2, (i3 & (-8)) | 4, c2254Rj);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, c2254Rj.c);
                    } else {
                        unsafe.putObject(obj, j, AbstractC1507Lp1.b(object2, c2254Rj.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                return i;
            default:
                return i;
        }
    }

    public final QW2 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        QW2 qw2 = (QW2) objArr[i2];
        if (qw2 != null) {
            return qw2;
        }
        QW2 b = C7931nE2.c.b((Class) objArr[i2 + 1]);
        objArr[i2] = b;
        return b;
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final InterfaceC0727Fp1 n(int i) {
        return (InterfaceC0727Fp1) this.b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x00a4. Please report as an issue. */
    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, C2254Rj c2254Rj) {
        Unsafe unsafe;
        FV1 fv1;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        byte[] bArr2;
        int i18;
        int i19;
        int J2;
        byte[] bArr3;
        int i20;
        int J3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        FV1 fv12 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i29 = i2;
        C2254Rj c2254Rj2 = c2254Rj;
        Unsafe unsafe2 = r;
        int i30 = i;
        int i31 = i3;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1048575;
        int i36 = 0;
        while (true) {
            if (i30 < i29) {
                int i37 = i30 + 1;
                int i38 = bArr4[i30];
                if (i38 < 0) {
                    i37 = AbstractC2384Sj.G(i38, bArr4, i37, c2254Rj2);
                    i38 = c2254Rj2.a;
                }
                int i39 = i38 >>> 3;
                int i40 = i38 & 7;
                int i41 = fv12.d;
                int i42 = i38;
                int i43 = fv12.c;
                int i44 = i31;
                if (i39 > i32) {
                    i6 = (i39 < i43 || i39 > i41) ? -1 : fv12.Q(i39, i33 / 3);
                    i7 = -1;
                    i4 = 0;
                } else {
                    if (i39 < i43 || i39 > i41) {
                        i4 = 0;
                        i5 = -1;
                    } else {
                        i4 = 0;
                        i5 = fv12.Q(i39, 0);
                    }
                    i6 = i5;
                    i7 = -1;
                }
                if (i6 == i7) {
                    i8 = i37;
                    i9 = i35;
                    i10 = i36;
                    i11 = i39;
                    unsafe = unsafe2;
                    i12 = i44;
                    i13 = i42;
                } else {
                    int[] iArr = fv12.a;
                    int i45 = iArr[i6 + 1];
                    int i46 = (i45 & 267386880) >>> 20;
                    long j = i45 & 1048575;
                    if (i46 <= 17) {
                        int i47 = iArr[i6 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i35) {
                            if (i35 != 1048575) {
                                unsafe2.putInt(obj3, i35, i36);
                            }
                            i10 = unsafe2.getInt(obj3, i49);
                            i14 = i49;
                        } else {
                            i10 = i36;
                            i14 = i35;
                        }
                        switch (i46) {
                            case 0:
                                i15 = i42;
                                i16 = i14;
                                i17 = i39;
                                bArr2 = bArr;
                                i18 = i6;
                                if (i40 != 1) {
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    Q14.t(j, obj3, AbstractC2384Sj.d(i37, bArr2));
                                    i19 = i37 + 8;
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 1:
                                i15 = i42;
                                i16 = i14;
                                i17 = i39;
                                bArr2 = bArr;
                                i18 = i6;
                                if (i40 != 5) {
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    Q14.u(AbstractC2384Sj.k(i37, bArr2), j, obj3);
                                    i19 = i37 + 4;
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                i15 = i42;
                                i16 = i14;
                                i17 = i39;
                                bArr2 = bArr;
                                i18 = i6;
                                if (i40 != 0) {
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    J2 = AbstractC2384Sj.J(bArr2, i37, c2254Rj2);
                                    unsafe2.putLong(obj, j, c2254Rj2.b);
                                    i23 = i10 | i48;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = i42;
                                i16 = i14;
                                i17 = i39;
                                bArr2 = bArr;
                                i18 = i6;
                                if (i40 != 0) {
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i19 = AbstractC2384Sj.H(bArr2, i37, c2254Rj2);
                                    unsafe2.putInt(obj3, j, c2254Rj2.a);
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            case 14:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 1) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    unsafe2.putLong(obj, j, AbstractC2384Sj.i(i37, bArr3));
                                    i19 = i37 + 8;
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 5) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, AbstractC2384Sj.g(i37, bArr3));
                                    i20 = i37 + 4;
                                    J3 = i20;
                                    i21 = i10 | i48;
                                    i22 = i21;
                                    i30 = J3;
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 7:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 0) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    J3 = AbstractC2384Sj.J(bArr3, i37, c2254Rj2);
                                    Q14.p(j, obj3, c2254Rj2.b != 0);
                                    i21 = i10 | i48;
                                    i22 = i21;
                                    i30 = J3;
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 8:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 2) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    if ((i45 & 536870912) == 0) {
                                        i20 = AbstractC2384Sj.B(bArr3, i37, c2254Rj2);
                                    } else {
                                        i20 = AbstractC2384Sj.E(bArr3, i37, c2254Rj2);
                                    }
                                    unsafe2.putObject(obj3, j, c2254Rj2.c);
                                    J3 = i20;
                                    i21 = i10 | i48;
                                    i22 = i21;
                                    i30 = J3;
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 2) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i20 = AbstractC2384Sj.o(fv12.p(i18), bArr3, i37, i2, c2254Rj2);
                                    if ((i10 & i48) == 0) {
                                        unsafe2.putObject(obj3, j, c2254Rj2.c);
                                    } else {
                                        unsafe2.putObject(obj3, j, AbstractC1507Lp1.b(unsafe2.getObject(obj3, j), c2254Rj2.c));
                                    }
                                    J3 = i20;
                                    i21 = i10 | i48;
                                    i22 = i21;
                                    i30 = J3;
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 10:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 2) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i19 = AbstractC2384Sj.b(bArr3, i37, c2254Rj2);
                                    unsafe2.putObject(obj3, j, c2254Rj2.c);
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 12:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 0) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i19 = AbstractC2384Sj.H(bArr3, i37, c2254Rj2);
                                    int i50 = c2254Rj2.a;
                                    InterfaceC0727Fp1 n = fv12.n(i18);
                                    if (n == null || n.a(i50)) {
                                        unsafe2.putInt(obj3, j, i50);
                                        i16 = i14;
                                        bArr2 = bArr3;
                                        i10 |= i48;
                                        J2 = i19;
                                        i23 = i10;
                                        i22 = i23;
                                        i30 = J2;
                                        i32 = i17;
                                        bArr4 = bArr2;
                                        i33 = i18;
                                        i34 = i15;
                                        i35 = i16;
                                        i29 = i2;
                                        i36 = i22;
                                        i31 = i3;
                                        break;
                                    } else {
                                        q(obj).c(i15, Long.valueOf(i50));
                                        i16 = i14;
                                        bArr2 = bArr3;
                                        J2 = i19;
                                        i23 = i10;
                                        i22 = i23;
                                        i30 = J2;
                                        i32 = i17;
                                        bArr4 = bArr2;
                                        i33 = i18;
                                        i34 = i15;
                                        i35 = i16;
                                        i29 = i2;
                                        i36 = i22;
                                        i31 = i3;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i15 = i42;
                                i17 = i39;
                                i18 = i6;
                                if (i40 != 0) {
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i19 = AbstractC2384Sj.H(bArr3, i37, c2254Rj2);
                                    unsafe2.putInt(obj3, j, DV.b(c2254Rj2.a));
                                    i16 = i14;
                                    bArr2 = bArr3;
                                    i10 |= i48;
                                    J2 = i19;
                                    i23 = i10;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 16:
                                i15 = i42;
                                int i51 = i6;
                                if (i40 != 0) {
                                    i17 = i39;
                                    i18 = i51;
                                    i16 = i14;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    J2 = AbstractC2384Sj.J(bArr, i37, c2254Rj2);
                                    i17 = i39;
                                    i18 = i51;
                                    unsafe2.putLong(obj, j, DV.c(c2254Rj2.b));
                                    i16 = i14;
                                    bArr2 = bArr;
                                    i23 = i10 | i48;
                                    i22 = i23;
                                    i30 = J2;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            case 17:
                                if (i40 != 3) {
                                    i15 = i42;
                                    i16 = i14;
                                    i17 = i39;
                                    i18 = i6;
                                    i11 = i17;
                                    i12 = i3;
                                    i8 = i37;
                                    i4 = i18;
                                    unsafe = unsafe2;
                                    i13 = i15;
                                    i9 = i16;
                                    break;
                                } else {
                                    i15 = i42;
                                    int i52 = i6;
                                    i30 = AbstractC2384Sj.m(fv12.p(i6), bArr, i37, i2, (i39 << 3) | 4, c2254Rj);
                                    if ((i10 & i48) == 0) {
                                        unsafe2.putObject(obj3, j, c2254Rj2.c);
                                    } else {
                                        unsafe2.putObject(obj3, j, AbstractC1507Lp1.b(unsafe2.getObject(obj3, j), c2254Rj2.c));
                                    }
                                    i22 = i10 | i48;
                                    i16 = i14;
                                    i17 = i39;
                                    i18 = i52;
                                    bArr2 = bArr;
                                    i32 = i17;
                                    bArr4 = bArr2;
                                    i33 = i18;
                                    i34 = i15;
                                    i35 = i16;
                                    i29 = i2;
                                    i36 = i22;
                                    i31 = i3;
                                    break;
                                }
                            default:
                                i15 = i42;
                                i16 = i14;
                                i17 = i39;
                                i18 = i6;
                                i11 = i17;
                                i12 = i3;
                                i8 = i37;
                                i4 = i18;
                                unsafe = unsafe2;
                                i13 = i15;
                                i9 = i16;
                                break;
                        }
                    } else {
                        int i53 = i36;
                        int i54 = i6;
                        if (i46 != 27) {
                            i9 = i35;
                            i24 = i53;
                            if (i46 <= 49) {
                                int i55 = i37;
                                i11 = i39;
                                i26 = i54;
                                unsafe = unsafe2;
                                i27 = i42;
                                i30 = I(obj, bArr, i37, i2, i42, i39, i40, i26, i45, i46, j, c2254Rj);
                                if (i30 != i55) {
                                    fv12 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i34 = i27;
                                    i29 = i2;
                                    i31 = i3;
                                    c2254Rj2 = c2254Rj;
                                    i32 = i11;
                                    i33 = i26;
                                    i35 = i9;
                                    i36 = i24;
                                    unsafe2 = unsafe;
                                } else {
                                    i28 = i30;
                                    i13 = i27;
                                    i12 = i3;
                                    i8 = i28;
                                    i4 = i26;
                                    i10 = i24;
                                }
                            } else {
                                i11 = i39;
                                i25 = i37;
                                unsafe = unsafe2;
                                i27 = i42;
                                i26 = i54;
                                if (i46 != 50) {
                                    i30 = F(obj, bArr, i25, i2, i27, i11, i40, i45, i46, j, i26, c2254Rj);
                                    if (i30 != i25) {
                                        fv12 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i34 = i27;
                                        i29 = i2;
                                        i31 = i3;
                                        c2254Rj2 = c2254Rj;
                                        i32 = i11;
                                        i33 = i26;
                                        i35 = i9;
                                        i36 = i24;
                                        unsafe2 = unsafe;
                                    } else {
                                        i28 = i30;
                                        i13 = i27;
                                        i12 = i3;
                                        i8 = i28;
                                        i4 = i26;
                                        i10 = i24;
                                    }
                                } else if (i40 == 2) {
                                    i30 = E(obj, bArr, i25, i2, i26, j, c2254Rj);
                                    if (i30 != i25) {
                                        fv12 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i34 = i27;
                                        i29 = i2;
                                        i31 = i3;
                                        c2254Rj2 = c2254Rj;
                                        i32 = i11;
                                        i33 = i26;
                                        i35 = i9;
                                        i36 = i24;
                                        unsafe2 = unsafe;
                                    } else {
                                        i28 = i30;
                                        i13 = i27;
                                        i12 = i3;
                                        i8 = i28;
                                        i4 = i26;
                                        i10 = i24;
                                    }
                                }
                            }
                        } else if (i40 == 2) {
                            AbstractC7504m0 abstractC7504m0 = (AbstractC7504m0) ((InterfaceC1377Kp1) unsafe2.getObject(obj3, j));
                            boolean b = abstractC7504m0.b();
                            InterfaceC1377Kp1 interfaceC1377Kp1 = abstractC7504m0;
                            if (!b) {
                                int size = abstractC7504m0.size();
                                InterfaceC1377Kp1 c = abstractC7504m0.c(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, c);
                                interfaceC1377Kp1 = c;
                            }
                            i30 = AbstractC2384Sj.p(fv12.p(i54), i42, bArr, i37, i2, interfaceC1377Kp1, c2254Rj);
                            bArr4 = bArr;
                            i32 = i39;
                            i31 = i3;
                            i33 = i54;
                            i34 = i42;
                            i35 = i35;
                            i36 = i53;
                            i29 = i2;
                        } else {
                            i9 = i35;
                            i24 = i53;
                            i11 = i39;
                            i25 = i37;
                            i26 = i54;
                            unsafe = unsafe2;
                            i27 = i42;
                        }
                        i28 = i25;
                        i13 = i27;
                        i12 = i3;
                        i8 = i28;
                        i4 = i26;
                        i10 = i24;
                    }
                }
                if (i13 != i12 || i12 == 0) {
                    if (this.f && c2254Rj.d != XF0.c()) {
                        i30 = AbstractC2384Sj.f(i13, bArr, i8, i2, obj, this.e, this.n, c2254Rj);
                    } else {
                        i30 = AbstractC2384Sj.F(i13, bArr, i8, i2, q(obj), c2254Rj);
                    }
                    obj3 = obj;
                    i31 = i12;
                    i34 = i13;
                    i33 = i4;
                    fv12 = this;
                    i36 = i10;
                    c2254Rj2 = c2254Rj;
                    i32 = i11;
                    i35 = i9;
                    unsafe2 = unsafe;
                    bArr4 = bArr;
                    i29 = i2;
                } else {
                    fv1 = this;
                    i30 = i8;
                    i31 = i12;
                    i34 = i13;
                    i36 = i10;
                    i35 = i9;
                }
            } else {
                unsafe = unsafe2;
                fv1 = fv12;
            }
        }
        if (i35 != 1048575) {
            long j2 = i35;
            obj2 = obj;
            unsafe.putInt(obj2, j2, i36);
        } else {
            obj2 = obj;
        }
        C11975z14 c11975z14 = null;
        int i56 = fv1.j;
        while (true) {
            int i57 = fv1.k;
            A14 a14 = fv1.n;
            if (i56 >= i57) {
                if (c11975z14 != null) {
                    a14.getClass();
                    A14.b(obj2, c11975z14);
                }
                if (i31 == 0) {
                    if (i30 != i2) {
                        throw C1127Ir1.g();
                    }
                } else if (i30 > i2 || i34 != i31) {
                    throw C1127Ir1.g();
                }
                return i30;
            }
            c11975z14 = (C11975z14) fv1.m(obj2, fv1.i[i56], c11975z14, a14);
            i56++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0266, code lost:            if (r0 != r32) goto L629;     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026a, code lost:            r4 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c1, code lost:            r5 = r17;        r2 = r18;        r6 = r25;     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a0, code lost:            if (r0 != r15) goto L629;     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02bf, code lost:            if (r0 != r15) goto L629;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00a3. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.Object r30, byte[] r31, int r32, int r33, defpackage.C2254Rj r34) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FV1.H(java.lang.Object, byte[], int, int, Rj):void");
    }

    @Override // defpackage.QW2
    public final void f(Object obj, byte[] bArr, int i, int i2, C2254Rj c2254Rj) {
        if (this.h) {
            H(obj, bArr, i, i2, c2254Rj);
        } else {
            G(obj, bArr, i, i2, 0, c2254Rj);
        }
    }

    @Override // defpackage.QW2
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long R = R(iArr[i2]) & 1048575;
            Object n = Q14.n(R, obj);
            if (n != null) {
                this.p.getClass();
                ((OL1) n).a = false;
                Q14.x(R, obj, n);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.a(iArr[i], obj);
            i++;
        }
        this.n.getClass();
        ((QX0) obj).g.e = false;
        if (this.f) {
            this.o.getClass();
            ((MX0) obj).j.i();
        }
    }

    public final void w(Object obj, int i, Object obj2, XF0 xf0, FH2 fh2) {
        long R = R(i) & 1048575;
        Object n = Q14.n(R, obj);
        PL1 pl1 = this.p;
        if (n == null) {
            pl1.getClass();
            n = PL1.f();
            Q14.x(R, obj, n);
        } else {
            pl1.getClass();
            if (PL1.d(n)) {
                Object f = PL1.f();
                PL1.e(f, n);
                Q14.x(R, obj, f);
                n = f;
            }
        }
        pl1.getClass();
        fh2.x((OL1) n, ((ML1) obj2).a, xf0);
    }

    @Override // defpackage.QW2
    public final boolean c(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < this.j) {
                int i4 = this.i[i2];
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int R = R(i4);
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i) {
                    if (i7 != 1048575) {
                        i3 = r.getInt(obj, i7);
                    }
                    i = i7;
                }
                if ((268435456 & R) != 0) {
                    if (i == 1048575) {
                        z = t(i4, obj);
                    } else {
                        z = (i3 & i8) != 0;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i9 = (267386880 & R) >>> 20;
                if (i9 == 9 || i9 == 17) {
                    if (i == 1048575) {
                        z2 = t(i4, obj);
                    } else if ((i8 & i3) == 0) {
                        z2 = false;
                    }
                    if (z2 && !p(i4).c(Q14.n(R & 1048575, obj))) {
                        return false;
                    }
                } else {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (u(obj, i5, i4) && !p(i4).c(Q14.n(R & 1048575, obj))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                Object n = Q14.n(R & 1048575, obj);
                                this.p.getClass();
                                OL1 ol1 = (OL1) n;
                                if (!ol1.isEmpty() && ((ML1) o(i4)).a.c.a == EnumC10883vq4.o) {
                                    Iterator it = ol1.values().iterator();
                                    QW2 qw2 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (qw2 == null) {
                                            qw2 = C7931nE2.c.b(next.getClass());
                                        }
                                        if (!qw2.c(next)) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z2) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) Q14.n(R & 1048575, obj);
                    if (!list.isEmpty()) {
                        QW2 p = p(i4);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            }
                            if (!p.c(list.get(i10))) {
                                z2 = false;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
                i2++;
            } else {
                if (this.f) {
                    this.o.getClass();
                    if (!YF0.b(obj).g()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void U(int i, Object obj, LV lv) {
        if (obj instanceof String) {
            lv.a.M(i, (String) obj);
        } else {
            lv.b(i, (AbstractC4147cE) obj);
        }
    }

    public final void L(Object obj, int i, FH2 fh2) {
        if ((536870912 & i) != 0) {
            Q14.x(i & 1048575, obj, fh2.N());
        } else if (this.g) {
            Q14.x(i & 1048575, obj, fh2.w());
        } else {
            Q14.x(i & 1048575, obj, fh2.D());
        }
    }

    public final void M(Object obj, int i, FH2 fh2) {
        boolean z = (536870912 & i) != 0;
        BC1 bc1 = this.m;
        if (z) {
            fh2.C(bc1.c(i & 1048575, obj));
        } else {
            fh2.B(bc1.c(i & 1048575, obj));
        }
    }

    public final void K(Object obj, int i, FH2 fh2, QW2 qw2, XF0 xf0) {
        fh2.j(this.m.c(i & 1048575, obj), qw2, xf0);
    }

    public final void J(Object obj, long j, FH2 fh2, QW2 qw2, XF0 xf0) {
        fh2.K(this.m.c(j, obj), qw2, xf0);
    }

    public final Object m(Object obj, int i, Object obj2, A14 a14) {
        InterfaceC0727Fp1 n;
        int i2 = this.a[i];
        Object n2 = Q14.n(R(i) & 1048575, obj);
        if (n2 == null || (n = n(i)) == null) {
            return obj2;
        }
        this.p.getClass();
        LL1 ll1 = ((ML1) o(i)).a;
        Iterator it = ((OL1) n2).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!n.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    a14.getClass();
                    obj2 = C11975z14.b();
                }
                int a = ML1.a(ll1, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a];
                boolean z = KV.b;
                HV hv = new HV(bArr, a);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C5563gM0.l(hv, ll1.a, 1, key);
                    C5563gM0.l(hv, ll1.c, 2, value);
                    if (hv.T() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    ZD zd = new ZD(bArr);
                    a14.getClass();
                    ((C11975z14) obj2).c((i2 << 3) | 2, zd);
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final int R(int i) {
        return this.a[i + 1];
    }

    public final void O(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        Q14.v(j, (1 << (i2 >>> 20)) | Q14.l(j, obj), obj);
    }

    public final void P(Object obj, int i, int i2) {
        Q14.v(this.a[i2 + 2] & 1048575, i, obj);
    }

    public final boolean t(int i, Object obj) {
        boolean equals;
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & Q14.l(j, obj)) != 0;
        }
        int R = R(i);
        long j2 = R & 1048575;
        switch ((R & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(Q14.j(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(Q14.k(j2, obj)) != 0;
            case 2:
                return Q14.m(j2, obj) != 0;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return Q14.m(j2, obj) != 0;
            case 4:
                return Q14.l(j2, obj) != 0;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return Q14.m(j2, obj) != 0;
            case 6:
                return Q14.l(j2, obj) != 0;
            case 7:
                return Q14.f(j2, obj);
            case 8:
                Object n = Q14.n(j2, obj);
                if (n instanceof String) {
                    equals = ((String) n).isEmpty();
                    break;
                } else if (n instanceof AbstractC4147cE) {
                    equals = AbstractC4147cE.g.equals(n);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return Q14.n(j2, obj) != null;
            case 10:
                equals = AbstractC4147cE.g.equals(Q14.n(j2, obj));
                break;
            case 11:
                return Q14.l(j2, obj) != 0;
            case 12:
                return Q14.l(j2, obj) != 0;
            case 13:
                return Q14.l(j2, obj) != 0;
            case 14:
                return Q14.m(j2, obj) != 0;
            case 15:
                return Q14.l(j2, obj) != 0;
            case 16:
                return Q14.m(j2, obj) != 0;
            case 17:
                return Q14.n(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean u(Object obj, int i, int i2) {
        return Q14.l((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public static int C(long j, Object obj) {
        return ((Integer) Q14.n(j, obj)).intValue();
    }

    public static long D(long j, Object obj) {
        return ((Long) Q14.n(j, obj)).longValue();
    }

    public final boolean k(Object obj, int i, Object obj2) {
        return t(i, obj) == t(i, obj2);
    }

    public final int Q(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
