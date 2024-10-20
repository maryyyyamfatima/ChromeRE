package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MV1 implements QW2 {
    public final MessageLite a;
    public final A14 b;
    public final boolean c;
    public final YF0 d;

    public MV1(A14 a14, YF0 yf0, MessageLite messageLite) {
        this.b = a14;
        yf0.getClass();
        this.c = messageLite instanceof MX0;
        this.d = yf0;
        this.a = messageLite;
    }

    @Override // defpackage.QW2
    public final Object i() {
        return this.a.g().b1();
    }

    @Override // defpackage.QW2
    public final boolean g(Object obj, Object obj2) {
        A14 a14 = this.b;
        a14.getClass();
        C11975z14 c11975z14 = ((QX0) obj).g;
        a14.getClass();
        if (!c11975z14.equals(((QX0) obj2).g)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        YF0 yf0 = this.d;
        yf0.getClass();
        C5563gM0 c5563gM0 = ((MX0) obj).j;
        yf0.getClass();
        return c5563gM0.equals(((MX0) obj2).j);
    }

    @Override // defpackage.QW2
    public final int j(Object obj) {
        this.b.getClass();
        int hashCode = ((QX0) obj).g.hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.getClass();
        return (hashCode * 53) + ((MX0) obj).j.hashCode();
    }

    @Override // defpackage.QW2
    public final void a(Object obj, Object obj2) {
        YW2.C(this.b, obj, obj2);
        if (this.c) {
            YW2.B(this.d, obj, obj2);
        }
    }

    @Override // defpackage.QW2
    public final void d(Object obj, LV lv) {
        this.d.getClass();
        Iterator h = ((MX0) obj).j.h();
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            NX0 nx0 = (NX0) entry.getKey();
            if (nx0.g.a != EnumC10883vq4.o) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            Object value = entry.getValue();
            lv.getClass();
            boolean z = value instanceof AbstractC4147cE;
            int i = nx0.a;
            KV kv = lv.a;
            if (z) {
                kv.L(i, (AbstractC4147cE) value);
            } else {
                kv.K((MessageLite) value, i);
            }
        }
        this.b.getClass();
        C11975z14 c11975z14 = ((QX0) obj).g;
        c11975z14.getClass();
        lv.getClass();
        for (int i2 = 0; i2 < c11975z14.a; i2++) {
            int i3 = c11975z14.b[i2] >>> 3;
            Object obj2 = c11975z14.c[i2];
            boolean z2 = obj2 instanceof AbstractC4147cE;
            KV kv2 = lv.a;
            if (z2) {
                kv2.L(i3, (AbstractC4147cE) obj2);
            } else {
                kv2.K((MessageLite) obj2, i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[EDGE_INSN: B:28:0x00d4->B:29:0x00d4 BREAK  A[LOOP:1: B:13:0x007c->B:21:0x00d0], SYNTHETIC] */
    @Override // defpackage.QW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r17, byte[] r18, int r19, int r20, defpackage.C2254Rj r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MV1.f(java.lang.Object, byte[], int, int, Rj):void");
    }

    @Override // defpackage.QW2
    public final void e(Object obj, FH2 fh2, XF0 xf0) {
        this.b.getClass();
        QX0 qx0 = (QX0) obj;
        C11975z14 c11975z14 = qx0.g;
        if (c11975z14 == C11975z14.f) {
            c11975z14 = C11975z14.b();
            qx0.g = c11975z14;
        }
        YF0 yf0 = this.d;
        yf0.getClass();
        MX0 mx0 = (MX0) obj;
        C5563gM0 c5563gM0 = mx0.j;
        if (c5563gM0.b) {
            mx0.j = c5563gM0.clone();
        }
        C5563gM0 c5563gM02 = mx0.j;
        while (fh2.z() != Integer.MAX_VALUE && k(fh2, xf0, yf0, c5563gM02, c11975z14)) {
            try {
            } finally {
                A14.b(obj, c11975z14);
            }
        }
    }

    @Override // defpackage.QW2
    public final void b(Object obj) {
        this.b.getClass();
        ((QX0) obj).g.e = false;
        this.d.getClass();
        ((MX0) obj).j.i();
    }

    public final boolean k(FH2 fh2, XF0 xf0, YF0 yf0, C5563gM0 c5563gM0, C11975z14 c11975z14) {
        int tag = fh2.getTag();
        MessageLite messageLite = this.a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return fh2.G();
            }
            OX0 b = xf0.b(messageLite, tag >>> 3);
            if (b == null) {
                return A14.a(c11975z14, fh2);
            }
            c5563gM0.k(b.d, fh2.a(b.c.getClass(), xf0));
            return true;
        }
        OX0 ox0 = null;
        int i = 0;
        AbstractC4147cE abstractC4147cE = null;
        while (fh2.z() != Integer.MAX_VALUE) {
            int tag2 = fh2.getTag();
            if (tag2 == 16) {
                i = fh2.m();
                ox0 = xf0.b(messageLite, i);
            } else if (tag2 == 26) {
                if (ox0 == null) {
                    abstractC4147cE = fh2.D();
                } else {
                    c5563gM0.k(ox0.d, fh2.a(ox0.c.getClass(), xf0));
                }
            } else if (!fh2.G()) {
                break;
            }
        }
        if (fh2.getTag() != 12) {
            throw C1127Ir1.a();
        }
        if (abstractC4147cE != null) {
            if (ox0 == null) {
                c11975z14.c((i << 3) | 2, abstractC4147cE);
            } else {
                MessageLite b1 = ox0.c.g().b1();
                ByteBuffer wrap = ByteBuffer.wrap(abstractC4147cE.p());
                if (wrap.hasArray()) {
                    C1934Ox c1934Ox = new C1934Ox(wrap);
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    c7931nE2.b(b1.getClass()).e(b1, c1934Ox, xf0);
                    c5563gM0.k(ox0.d, b1);
                    if (c1934Ox.z() != Integer.MAX_VALUE) {
                        throw C1127Ir1.a();
                    }
                } else {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
            }
        }
        return true;
    }

    @Override // defpackage.QW2
    public final boolean c(Object obj) {
        this.d.getClass();
        return ((MX0) obj).j.g();
    }

    @Override // defpackage.QW2
    public final int h(Object obj) {
        C0284Ce3 c0284Ce3;
        this.b.getClass();
        C11975z14 c11975z14 = ((QX0) obj).g;
        int i = c11975z14.d;
        int i2 = 0;
        if (i == -1) {
            i = 0;
            for (int i3 = 0; i3 < c11975z14.a; i3++) {
                int i4 = c11975z14.b[i3] >>> 3;
                i += KV.c(3, (AbstractC4147cE) c11975z14.c[i3]) + KV.t(2, i4) + (KV.s(1) * 2);
            }
            c11975z14.d = i;
        }
        int i5 = i + 0;
        if (!this.c) {
            return i5;
        }
        this.d.getClass();
        C5563gM0 c5563gM0 = ((MX0) obj).j;
        int i6 = 0;
        while (true) {
            c0284Ce3 = c5563gM0.a;
            if (i2 >= c0284Ce3.i()) {
                break;
            }
            i6 += C5563gM0.d(c0284Ce3.h(i2));
            i2++;
        }
        Iterator it = c0284Ce3.j().iterator();
        while (it.hasNext()) {
            i6 += C5563gM0.d((Map.Entry) it.next());
        }
        return i5 + i6;
    }
}
