package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gM0 */
/* loaded from: classes.dex */
public final class C5563gM0 {
    public static final C5563gM0 d = new C5563gM0(0);
    public final C0284Ce3 a = new C0284Ce3(16);
    public boolean b;
    public boolean c;

    public C5563gM0() {
    }

    public C5563gM0(int i) {
        i();
        i();
    }

    /* renamed from: a */
    public final C5563gM0 clone() {
        C0284Ce3 c0284Ce3;
        C5563gM0 c5563gM0 = new C5563gM0();
        int i = 0;
        while (true) {
            c0284Ce3 = this.a;
            if (i >= c0284Ce3.i()) {
                break;
            }
            Map.Entry h = c0284Ce3.h(i);
            c5563gM0.k((NX0) h.getKey(), h.getValue());
            i++;
        }
        for (Map.Entry entry : c0284Ce3.j()) {
            c5563gM0.k((NX0) entry.getKey(), entry.getValue());
        }
        c5563gM0.c = this.c;
        return c5563gM0;
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    public final void i() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        C0284Ce3 c0284Ce3 = this.a;
        if (!c0284Ce3.i) {
            for (int i = 0; i < c0284Ce3.i(); i++) {
                ((NX0) c0284Ce3.h(i).getKey()).getClass();
            }
            Iterator it = c0284Ce3.j().iterator();
            while (it.hasNext()) {
                ((NX0) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!c0284Ce3.i) {
            if (c0284Ce3.h.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(c0284Ce3.h);
            }
            c0284Ce3.h = unmodifiableMap;
            if (c0284Ce3.k.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(c0284Ce3.k);
            }
            c0284Ce3.k = unmodifiableMap2;
            c0284Ce3.i = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5563gM0)) {
            return false;
        }
        return this.a.equals(((C5563gM0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator h() {
        boolean z = this.c;
        C0284Ce3 c0284Ce3 = this.a;
        if (z) {
            return new C4750dz1(c0284Ce3.entrySet().iterator());
        }
        return c0284Ce3.entrySet().iterator();
    }

    public final Object c(NX0 nx0) {
        return this.a.get(nx0);
    }

    public final boolean g() {
        boolean z;
        int i = 0;
        while (true) {
            C0284Ce3 c0284Ce3 = this.a;
            boolean z2 = true;
            if (i >= c0284Ce3.i()) {
                for (Map.Entry entry : c0284Ce3.j()) {
                    if (((NX0) entry.getKey()).g.a == EnumC10883vq4.o) {
                        Object value = entry.getValue();
                        if (!(value instanceof InterfaceC7327lV1)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        z = ((InterfaceC7327lV1) value).isInitialized();
                    } else {
                        z = true;
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }
            Map.Entry h = c0284Ce3.h(i);
            if (((NX0) h.getKey()).g.a == EnumC10883vq4.o) {
                Object value2 = h.getValue();
                if (!(value2 instanceof InterfaceC7327lV1)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                z2 = ((InterfaceC7327lV1) value2).isInitialized();
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }

    public final void j(Map.Entry entry) {
        NX0 nx0 = (NX0) entry.getKey();
        Object value = entry.getValue();
        nx0.getClass();
        EnumC10883vq4 enumC10883vq4 = nx0.g.a;
        EnumC10883vq4 enumC10883vq42 = EnumC10883vq4.o;
        C0284Ce3 c0284Ce3 = this.a;
        if (enumC10883vq4 != enumC10883vq42) {
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                value = bArr2;
            }
            c0284Ce3.put(nx0, value);
            return;
        }
        Object c = c(nx0);
        if (c == null) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c0284Ce3.put(nx0, value);
            return;
        }
        JX0 d2 = ((MessageLite) c).d();
        d2.m((QX0) ((MessageLite) value));
        c0284Ce3.put(nx0, d2.j());
    }

    public static void l(KV kv, EnumC10540uq4 enumC10540uq4, int i, Object obj) {
        if (enumC10540uq4 != EnumC10540uq4.j) {
            kv.O(i, enumC10540uq4.g);
            switch (enumC10540uq4.ordinal()) {
                case 0:
                    kv.F(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    kv.D(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    kv.S(((Long) obj).longValue());
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    kv.S(((Long) obj).longValue());
                    return;
                case 4:
                    kv.H(((Integer) obj).intValue());
                    return;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    kv.F(((Long) obj).longValue());
                    return;
                case 6:
                    kv.D(((Integer) obj).intValue());
                    return;
                case 7:
                    kv.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof AbstractC4147cE) {
                        kv.B((AbstractC4147cE) obj);
                        return;
                    } else {
                        kv.N((String) obj);
                        return;
                    }
                case 9:
                    ((MessageLite) obj).f(kv);
                    return;
                case 10:
                    kv.J((MessageLite) obj);
                    return;
                case 11:
                    if (obj instanceof AbstractC4147cE) {
                        kv.B((AbstractC4147cE) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        kv.z(bArr, bArr.length);
                        return;
                    }
                case 12:
                    kv.Q(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof InterfaceC0467Dp1) {
                        kv.H(((InterfaceC0467Dp1) obj).a());
                        return;
                    } else {
                        kv.H(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    kv.D(((Integer) obj).intValue());
                    return;
                case 15:
                    kv.F(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    kv.Q((intValue >> 31) ^ (intValue << 1));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    kv.S((longValue >> 63) ^ (longValue << 1));
                    return;
                default:
                    return;
            }
        }
        Charset charset = AbstractC1507Lp1.a;
        kv.O(i, 3);
        ((MessageLite) obj).f(kv);
        kv.O(i, 4);
    }

    public final int e() {
        C0284Ce3 c0284Ce3;
        int i = 0;
        int i2 = 0;
        while (true) {
            c0284Ce3 = this.a;
            if (i >= c0284Ce3.i()) {
                break;
            }
            Map.Entry h = c0284Ce3.h(i);
            NX0 nx0 = (NX0) h.getKey();
            i2 += b(nx0.g, nx0.a, h.getValue());
            i++;
        }
        for (Map.Entry entry : c0284Ce3.j()) {
            NX0 nx02 = (NX0) entry.getKey();
            i2 += b(nx02.g, nx02.a, entry.getValue());
        }
        return i2;
    }

    public static int d(Map.Entry entry) {
        NX0 nx0 = (NX0) entry.getKey();
        Object value = entry.getValue();
        EnumC10540uq4 enumC10540uq4 = nx0.g;
        if (enumC10540uq4.a != EnumC10883vq4.o) {
            return b(enumC10540uq4, nx0.a, value);
        }
        int i = ((NX0) entry.getKey()).a;
        int t = KV.t(2, i) + (KV.s(1) * 2);
        int s = KV.s(3);
        int e = ((MessageLite) value).e();
        return KV.u(e) + e + s + t;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    public static int b(EnumC10540uq4 enumC10540uq4, int i, Object obj) {
        int size;
        int u;
        int s = KV.s(i);
        if (enumC10540uq4 == EnumC10540uq4.j) {
            Charset charset = AbstractC1507Lp1.a;
            s *= 2;
        }
        int i2 = 1;
        switch (enumC10540uq4.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                return i2 + s;
            case 1:
                ((Float) obj).floatValue();
                i2 = 4;
                return i2 + s;
            case 2:
                i2 = KV.w(((Long) obj).longValue());
                return i2 + s;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = KV.w(((Long) obj).longValue());
                return i2 + s;
            case 4:
                i2 = KV.k(((Integer) obj).intValue());
                return i2 + s;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                ((Long) obj).longValue();
                i2 = 8;
                return i2 + s;
            case 6:
                ((Integer) obj).intValue();
                i2 = 4;
                return i2 + s;
            case 7:
                ((Boolean) obj).booleanValue();
                return i2 + s;
            case 8:
                if (!(obj instanceof AbstractC4147cE)) {
                    i2 = KV.r((String) obj);
                    return i2 + s;
                }
                size = ((AbstractC4147cE) obj).size();
                u = KV.u(size);
                i2 = u + size;
                return i2 + s;
            case 9:
                i2 = ((MessageLite) obj).e();
                return i2 + s;
            case 10:
                size = ((MessageLite) obj).e();
                u = KV.u(size);
                i2 = u + size;
                return i2 + s;
            case 11:
                if (obj instanceof AbstractC4147cE) {
                    size = ((AbstractC4147cE) obj).size();
                    u = KV.u(size);
                } else {
                    size = ((byte[]) obj).length;
                    u = KV.u(size);
                }
                i2 = u + size;
                return i2 + s;
            case 12:
                i2 = KV.u(((Integer) obj).intValue());
                return i2 + s;
            case 13:
                i2 = obj instanceof InterfaceC0467Dp1 ? KV.k(((InterfaceC0467Dp1) obj).a()) : KV.k(((Integer) obj).intValue());
                return i2 + s;
            case 14:
                ((Integer) obj).intValue();
                i2 = 4;
                return i2 + s;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                return i2 + s;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = KV.u((intValue >> 31) ^ (intValue << 1));
                return i2 + s;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = KV.w((longValue >> 63) ^ (longValue << 1));
                return i2 + s;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:            if ((r7 instanceof defpackage.InterfaceC0467Dp1) == false) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:            if ((r7 instanceof byte[]) == false) goto L134;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.NX0 r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.getClass()
            java.nio.charset.Charset r0 = defpackage.AbstractC1507Lp1.a
            r7.getClass()
            uq4 r0 = r6.g
            vq4 r1 = r0.a
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 1
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L22;
                case 7: goto L19;
                case 8: goto L16;
                default: goto L15;
            }
        L15:
            goto L3e
        L16:
            boolean r1 = r7 instanceof com.google.protobuf.MessageLite
            goto L3f
        L19:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L2a
            boolean r1 = r7 instanceof defpackage.InterfaceC0467Dp1
            if (r1 == 0) goto L3e
            goto L2a
        L22:
            boolean r1 = r7 instanceof defpackage.AbstractC4147cE
            if (r1 != 0) goto L2a
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L3e
        L2a:
            r1 = r3
            goto L3f
        L2c:
            boolean r1 = r7 instanceof java.lang.String
            goto L3f
        L2f:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L3f
        L32:
            boolean r1 = r7 instanceof java.lang.Double
            goto L3f
        L35:
            boolean r1 = r7 instanceof java.lang.Float
            goto L3f
        L38:
            boolean r1 = r7 instanceof java.lang.Long
            goto L3f
        L3b:
            boolean r1 = r7 instanceof java.lang.Integer
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r1 == 0) goto L47
            Ce3 r0 = r5.a
            r0.put(r6, r7)
            return
        L47:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r6 = r6.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r2] = r6
            vq4 r6 = r0.a
            r4[r3] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r4[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5563gM0.k(NX0, java.lang.Object):void");
    }
}
