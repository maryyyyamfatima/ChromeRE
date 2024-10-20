package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class YW2 {
    public static final Class a;
    public static final A14 b;
    public static final A14 c;
    public static final A14 d;

    public static void H(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                boolean z2 = KV.b;
                i3 += 8;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.F(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            double doubleValue = ((Double) list.get(i2)).doubleValue();
            kv.getClass();
            kv.E(i, Double.doubleToRawLongBits(doubleValue));
            i2++;
        }
    }

    public static void L(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                boolean z2 = KV.b;
                i3 += 4;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.D(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            float floatValue = ((Float) list.get(i2)).floatValue();
            kv.getClass();
            kv.C(i, Float.floatToRawIntBits(floatValue));
            i2++;
        }
    }

    public static void O(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += KV.w(((Long) list.get(i4)).longValue());
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.S(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.R(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void W(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += KV.w(((Long) list.get(i4)).longValue());
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.S(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.R(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void T(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += KV.w((longValue >> 63) ^ (longValue << 1));
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                kv.S((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            kv.R(i, (longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void K(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                boolean z2 = KV.b;
                i3 += 8;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.E(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void R(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                boolean z2 = KV.b;
                i3 += 8;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.E(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void N(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += KV.k(((Integer) list.get(i4)).intValue());
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.H(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.G(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void V(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += KV.u(((Integer) list.get(i4)).intValue());
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.P(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void S(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += KV.u((intValue >> 31) ^ (intValue << 1));
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                kv.Q((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            kv.P(i, (intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void J(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                boolean z2 = KV.b;
                i3 += 4;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.D(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.C(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void Q(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                boolean z2 = KV.b;
                i3 += 4;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.D(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.C(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void I(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += KV.k(((Integer) list.get(i4)).intValue());
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.H(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.G(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void F(int i, List list, LV lv, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            kv.O(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                boolean z2 = KV.b;
                i3++;
            }
            kv.Q(i3);
            while (i2 < list.size()) {
                kv.x(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.y(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static void U(int i, List list, LV lv) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lv.getClass();
        boolean z = list instanceof InterfaceC6812jz1;
        KV kv = lv.a;
        int i2 = 0;
        if (z) {
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            while (i2 < list.size()) {
                Object j = interfaceC6812jz1.j(i2);
                if (j instanceof String) {
                    kv.M(i, (String) j);
                } else {
                    kv.A(i, (AbstractC4147cE) j);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            kv.M(i, (String) list.get(i2));
            i2++;
        }
    }

    public static void G(int i, List list, LV lv) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lv.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            lv.a.A(i, (AbstractC4147cE) list.get(i2));
        }
    }

    public static void P(int i, List list, LV lv, QW2 qw2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lv.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            lv.k(i, qw2, list.get(i2));
        }
    }

    public static void M(int i, List list, LV lv, QW2 qw2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lv.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            lv.h(i, qw2, list.get(i2));
        }
    }

    public static int n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            i = 0;
            while (i2 < size) {
                di1.f(i2);
                i += KV.w(di1.g[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += KV.w(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (KV.s(i) * list.size()) + n(list);
    }

    public static int y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            i = 0;
            while (i2 < size) {
                di1.f(i2);
                i += KV.w(di1.g[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += KV.w(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + y(list);
    }

    public static int t(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            i = 0;
            while (i2 < size) {
                di1.f(i2);
                long j = di1.g[i2];
                i += KV.w((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += KV.w((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + t(list);
    }

    public static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            i = 0;
            while (i2 < size) {
                c0072Ao1.f(i2);
                i += KV.k(c0072Ao1.g[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += KV.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + e(list);
    }

    public static int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            i = 0;
            while (i2 < size) {
                c0072Ao1.f(i2);
                i += KV.k(c0072Ao1.g[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += KV.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + l(list);
    }

    public static int w(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            i = 0;
            while (i2 < size) {
                c0072Ao1.f(i2);
                i += KV.u(c0072Ao1.g[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += KV.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + w(list);
    }

    public static int r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            i = 0;
            while (i2 < size) {
                c0072Ao1.f(i2);
                int i3 = c0072Ao1.g[i2];
                i += KV.u((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += KV.u((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KV.s(i) * size) + r(list);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return KV.f(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return KV.g(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return KV.b(i) * size;
    }

    public static int u(int i, List list) {
        int r;
        int r2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int s = KV.s(i) * size;
        if (list instanceof InterfaceC6812jz1) {
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            while (i2 < size) {
                Object j = interfaceC6812jz1.j(i2);
                if (!(j instanceof AbstractC4147cE)) {
                    r2 = KV.r((String) j);
                } else {
                    int size2 = ((AbstractC4147cE) j).size();
                    r2 = KV.u(size2) + size2;
                }
                s += r2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (!(obj instanceof AbstractC4147cE)) {
                    r = KV.r((String) obj);
                } else {
                    int size3 = ((AbstractC4147cE) obj).size();
                    r = KV.u(size3) + size3;
                }
                s += r;
                i2++;
            }
        }
        return s;
    }

    public static int o(int i, QW2 qw2, Object obj) {
        int s = KV.s(i);
        AbstractC4754e0 abstractC4754e0 = (AbstractC4754e0) ((MessageLite) obj);
        abstractC4754e0.getClass();
        QX0 qx0 = (QX0) abstractC4754e0;
        int i2 = qx0.h;
        if (i2 == -1) {
            i2 = qw2.h(abstractC4754e0);
            qx0.h = i2;
        }
        return KV.u(i2) + i2 + s;
    }

    public static int p(int i, List list, QW2 qw2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = KV.s(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC4754e0 abstractC4754e0 = (AbstractC4754e0) ((MessageLite) list.get(i2));
            abstractC4754e0.getClass();
            QX0 qx0 = (QX0) abstractC4754e0;
            int i3 = qx0.h;
            if (i3 == -1) {
                i3 = qw2.h(abstractC4754e0);
                qx0.h = i3;
            }
            s += KV.u(i3) + i3;
        }
        return s;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = KV.s(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((AbstractC4147cE) list.get(i2)).size();
            s += KV.u(size2) + size2;
        }
        return s;
    }

    public static int j(int i, List list, QW2 qw2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += KV.i(i, (MessageLite) list.get(i3), qw2);
        }
        return i2;
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = A(false);
        c = A(true);
        d = new A14();
    }

    public static A14 A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (A14) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean D(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void B(YF0 yf0, Object obj, Object obj2) {
        C0284Ce3 c0284Ce3;
        yf0.getClass();
        C5563gM0 c5563gM0 = ((MX0) obj2).j;
        if (c5563gM0.f()) {
            return;
        }
        MX0 mx0 = (MX0) obj;
        C5563gM0 c5563gM02 = mx0.j;
        if (c5563gM02.b) {
            mx0.j = c5563gM02.clone();
        }
        C5563gM0 c5563gM03 = mx0.j;
        c5563gM03.getClass();
        int i = 0;
        while (true) {
            c0284Ce3 = c5563gM0.a;
            if (i >= c0284Ce3.i()) {
                break;
            }
            c5563gM03.j(c0284Ce3.h(i));
            i++;
        }
        Iterator it = c0284Ce3.j().iterator();
        while (it.hasNext()) {
            c5563gM03.j((Map.Entry) it.next());
        }
    }

    public static void C(A14 a14, Object obj, Object obj2) {
        a14.getClass();
        QX0 qx0 = (QX0) obj;
        C11975z14 c11975z14 = qx0.g;
        C11975z14 c11975z142 = ((QX0) obj2).g;
        if (!c11975z142.equals(C11975z14.f)) {
            int i = c11975z14.a + c11975z142.a;
            int[] copyOf = Arrays.copyOf(c11975z14.b, i);
            System.arraycopy(c11975z142.b, 0, copyOf, c11975z14.a, c11975z142.a);
            Object[] copyOf2 = Arrays.copyOf(c11975z14.c, i);
            System.arraycopy(c11975z142.c, 0, copyOf2, c11975z14.a, c11975z142.a);
            c11975z14 = new C11975z14(i, copyOf, copyOf2, true);
        }
        qx0.g = c11975z14;
    }

    public static Object z(int i, List list, InterfaceC0727Fp1 interfaceC0727Fp1, Object obj, A14 a14) {
        if (interfaceC0727Fp1 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC0727Fp1.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = E(i, intValue, obj, a14);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC0727Fp1.a(intValue2)) {
                    obj = E(i, intValue2, obj, a14);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object E(int i, int i2, Object obj, A14 a14) {
        if (obj == null) {
            a14.getClass();
            obj = C11975z14.b();
        }
        a14.getClass();
        ((C11975z14) obj).c((i << 3) | 0, Long.valueOf(i2));
        return obj;
    }
}
