package defpackage;

import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Yh4 extends RF0 implements Cloneable {
    public Uh4 A;
    public Vr$VREvent$SdkConfigurationParams B;
    public Qg4 C;
    public C6023hh4 D;
    public C8772ph4 E;
    public Xh4 F;
    public Og4 G;
    public Vg4 H;
    public Bh4 I;

    /* renamed from: J */
    public Ng4 f11476J;
    public Integer a = null;
    public C4310ci4 g = null;
    public C4298cg4 h = null;
    public Long i = null;
    public C4298cg4[] j;
    public C6360ig4 k;
    public C10143th4 l;
    public String m;
    public Integer n;
    public C8429oh4 o;
    public C11515xh4 p;
    public C4642dg4 q;
    public Dg4 r;
    public Oh4 s;
    public Ag4 t;
    public C7397lh4 u;
    public C7053kh4 v;
    public C10486uh4 w;
    public C8085nh4 x;
    public Eh4 y;
    public C9800sh4 z;

    public Yh4() {
        if (C4298cg4.i == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C4298cg4.i == null) {
                    C4298cg4.i = new C4298cg4[0];
                }
            }
        }
        this.j = C4298cg4.i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f11476J = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Yh4 clone() {
        try {
            Yh4 yh4 = (Yh4) a();
            C4310ci4 c4310ci4 = this.g;
            if (c4310ci4 != null) {
                try {
                    yh4.g = (C4310ci4) c4310ci4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C4298cg4 c4298cg4 = this.h;
            if (c4298cg4 != null) {
                yh4.h = c4298cg4.clone();
            }
            C4298cg4[] c4298cg4Arr = this.j;
            if (c4298cg4Arr != null && c4298cg4Arr.length > 0) {
                yh4.j = new C4298cg4[c4298cg4Arr.length];
                int i = 0;
                while (true) {
                    C4298cg4[] c4298cg4Arr2 = this.j;
                    if (i >= c4298cg4Arr2.length) {
                        break;
                    }
                    C4298cg4 c4298cg42 = c4298cg4Arr2[i];
                    if (c4298cg42 != null) {
                        yh4.j[i] = c4298cg42.clone();
                    }
                    i++;
                }
            }
            C6360ig4 c6360ig4 = this.k;
            if (c6360ig4 != null) {
                yh4.k = c6360ig4.clone();
            }
            C10143th4 c10143th4 = this.l;
            if (c10143th4 != null) {
                try {
                    yh4.l = (C10143th4) c10143th4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            C8429oh4 c8429oh4 = this.o;
            if (c8429oh4 != null) {
                yh4.o = c8429oh4.clone();
            }
            C11515xh4 c11515xh4 = this.p;
            if (c11515xh4 != null) {
                yh4.p = c11515xh4.clone();
            }
            C4642dg4 c4642dg4 = this.q;
            if (c4642dg4 != null) {
                yh4.q = c4642dg4.clone();
            }
            Dg4 dg4 = this.r;
            if (dg4 != null) {
                yh4.r = dg4.clone();
            }
            Oh4 oh4 = this.s;
            if (oh4 != null) {
                yh4.s = oh4.clone();
            }
            Ag4 ag4 = this.t;
            if (ag4 != null) {
                yh4.t = ag4.clone();
            }
            C7397lh4 c7397lh4 = this.u;
            if (c7397lh4 != null) {
                try {
                    yh4.u = (C7397lh4) c7397lh4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            C7053kh4 c7053kh4 = this.v;
            if (c7053kh4 != null) {
                yh4.v = c7053kh4.clone();
            }
            C10486uh4 c10486uh4 = this.w;
            if (c10486uh4 != null) {
                try {
                    yh4.w = (C10486uh4) c10486uh4.a();
                } catch (CloneNotSupportedException e4) {
                    throw new AssertionError(e4);
                }
            }
            C8085nh4 c8085nh4 = this.x;
            if (c8085nh4 != null) {
                yh4.x = c8085nh4.clone();
            }
            Eh4 eh4 = this.y;
            if (eh4 != null) {
                yh4.y = eh4.clone();
            }
            C9800sh4 c9800sh4 = this.z;
            if (c9800sh4 != null) {
                yh4.z = c9800sh4.clone();
            }
            Uh4 uh4 = this.A;
            if (uh4 != null) {
                yh4.A = uh4.clone();
            }
            Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.B;
            if (vr$VREvent$SdkConfigurationParams != null) {
                yh4.B = vr$VREvent$SdkConfigurationParams.clone();
            }
            Qg4 qg4 = this.C;
            if (qg4 != null) {
                yh4.C = qg4.clone();
            }
            C6023hh4 c6023hh4 = this.D;
            if (c6023hh4 != null) {
                yh4.D = c6023hh4.clone();
            }
            C8772ph4 c8772ph4 = this.E;
            if (c8772ph4 != null) {
                yh4.E = c8772ph4.clone();
            }
            Xh4 xh4 = this.F;
            if (xh4 != null) {
                yh4.F = xh4.clone();
            }
            Og4 og4 = this.G;
            if (og4 != null) {
                try {
                    yh4.G = (Og4) og4.a();
                } catch (CloneNotSupportedException e5) {
                    throw new AssertionError(e5);
                }
            }
            Vg4 vg4 = this.H;
            if (vg4 != null) {
                yh4.H = vg4.clone();
            }
            Bh4 bh4 = this.I;
            if (bh4 != null) {
                yh4.I = bh4.clone();
            }
            Ng4 ng4 = this.f11476J;
            if (ng4 != null) {
                yh4.f11476J = ng4.clone();
            }
            return yh4;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C4310ci4 c4310ci4 = this.g;
        if (c4310ci4 != null) {
            gv.t(1, c4310ci4);
        }
        C4298cg4 c4298cg4 = this.h;
        if (c4298cg4 != null) {
            gv.t(2, c4298cg4);
        }
        Long l = this.i;
        if (l != null) {
            gv.s(3, l.longValue());
        }
        C4298cg4[] c4298cg4Arr = this.j;
        if (c4298cg4Arr != null && c4298cg4Arr.length > 0) {
            int i = 0;
            while (true) {
                C4298cg4[] c4298cg4Arr2 = this.j;
                if (i >= c4298cg4Arr2.length) {
                    break;
                }
                C4298cg4 c4298cg42 = c4298cg4Arr2[i];
                if (c4298cg42 != null) {
                    gv.t(4, c4298cg42);
                }
                i++;
            }
        }
        C6360ig4 c6360ig4 = this.k;
        if (c6360ig4 != null) {
            gv.t(5, c6360ig4);
        }
        C10143th4 c10143th4 = this.l;
        if (c10143th4 != null) {
            gv.t(6, c10143th4);
        }
        String str = this.m;
        if (str != null) {
            gv.x(7, str);
        }
        Integer num = this.n;
        if (num != null) {
            gv.r(8, num.intValue());
        }
        C8429oh4 c8429oh4 = this.o;
        if (c8429oh4 != null) {
            gv.t(9, c8429oh4);
        }
        C11515xh4 c11515xh4 = this.p;
        if (c11515xh4 != null) {
            gv.t(10, c11515xh4);
        }
        C4642dg4 c4642dg4 = this.q;
        if (c4642dg4 != null) {
            gv.t(11, c4642dg4);
        }
        Dg4 dg4 = this.r;
        if (dg4 != null) {
            gv.t(12, dg4);
        }
        Oh4 oh4 = this.s;
        if (oh4 != null) {
            gv.t(13, oh4);
        }
        Ag4 ag4 = this.t;
        if (ag4 != null) {
            gv.t(14, ag4);
        }
        C7397lh4 c7397lh4 = this.u;
        if (c7397lh4 != null) {
            gv.t(15, c7397lh4);
        }
        C7053kh4 c7053kh4 = this.v;
        if (c7053kh4 != null) {
            gv.t(16, c7053kh4);
        }
        C10486uh4 c10486uh4 = this.w;
        if (c10486uh4 != null) {
            gv.t(17, c10486uh4);
        }
        C8085nh4 c8085nh4 = this.x;
        if (c8085nh4 != null) {
            gv.t(18, c8085nh4);
        }
        Eh4 eh4 = this.y;
        if (eh4 != null) {
            gv.t(19, eh4);
        }
        C9800sh4 c9800sh4 = this.z;
        if (c9800sh4 != null) {
            gv.t(20, c9800sh4);
        }
        Uh4 uh4 = this.A;
        if (uh4 != null) {
            gv.t(21, uh4);
        }
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.B;
        if (vr$VREvent$SdkConfigurationParams != null) {
            gv.t(22, vr$VREvent$SdkConfigurationParams);
        }
        Qg4 qg4 = this.C;
        if (qg4 != null) {
            gv.t(23, qg4);
        }
        C6023hh4 c6023hh4 = this.D;
        if (c6023hh4 != null) {
            gv.t(24, c6023hh4);
        }
        C8772ph4 c8772ph4 = this.E;
        if (c8772ph4 != null) {
            gv.t(25, c8772ph4);
        }
        Xh4 xh4 = this.F;
        if (xh4 != null) {
            gv.t(26, xh4);
        }
        Og4 og4 = this.G;
        if (og4 != null) {
            gv.t(27, og4);
        }
        Vg4 vg4 = this.H;
        if (vg4 != null) {
            gv.t(28, vg4);
        }
        Bh4 bh4 = this.I;
        if (bh4 != null) {
            gv.t(29, bh4);
        }
        Integer num2 = this.a;
        if (num2 != null) {
            gv.r(30, num2.intValue());
        }
        Ng4 ng4 = this.f11476J;
        if (ng4 != null) {
            gv.t(31, ng4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C4310ci4 c4310ci4 = this.g;
        if (c4310ci4 != null) {
            computeSerializedSize += GV.f(1, c4310ci4);
        }
        C4298cg4 c4298cg4 = this.h;
        if (c4298cg4 != null) {
            computeSerializedSize += GV.f(2, c4298cg4);
        }
        Long l = this.i;
        if (l != null) {
            computeSerializedSize += GV.e(3, l.longValue());
        }
        C4298cg4[] c4298cg4Arr = this.j;
        if (c4298cg4Arr != null && c4298cg4Arr.length > 0) {
            int i = 0;
            while (true) {
                C4298cg4[] c4298cg4Arr2 = this.j;
                if (i >= c4298cg4Arr2.length) {
                    break;
                }
                C4298cg4 c4298cg42 = c4298cg4Arr2[i];
                if (c4298cg42 != null) {
                    computeSerializedSize += GV.f(4, c4298cg42);
                }
                i++;
            }
        }
        C6360ig4 c6360ig4 = this.k;
        if (c6360ig4 != null) {
            computeSerializedSize += GV.f(5, c6360ig4);
        }
        C10143th4 c10143th4 = this.l;
        if (c10143th4 != null) {
            computeSerializedSize += GV.f(6, c10143th4);
        }
        String str = this.m;
        if (str != null) {
            computeSerializedSize += GV.i(7, str);
        }
        Integer num = this.n;
        if (num != null) {
            computeSerializedSize += GV.d(8, num.intValue());
        }
        C8429oh4 c8429oh4 = this.o;
        if (c8429oh4 != null) {
            computeSerializedSize += GV.f(9, c8429oh4);
        }
        C11515xh4 c11515xh4 = this.p;
        if (c11515xh4 != null) {
            computeSerializedSize += GV.f(10, c11515xh4);
        }
        C4642dg4 c4642dg4 = this.q;
        if (c4642dg4 != null) {
            computeSerializedSize += GV.f(11, c4642dg4);
        }
        Dg4 dg4 = this.r;
        if (dg4 != null) {
            computeSerializedSize += GV.f(12, dg4);
        }
        Oh4 oh4 = this.s;
        if (oh4 != null) {
            computeSerializedSize += GV.f(13, oh4);
        }
        Ag4 ag4 = this.t;
        if (ag4 != null) {
            computeSerializedSize += GV.f(14, ag4);
        }
        C7397lh4 c7397lh4 = this.u;
        if (c7397lh4 != null) {
            computeSerializedSize += GV.f(15, c7397lh4);
        }
        C7053kh4 c7053kh4 = this.v;
        if (c7053kh4 != null) {
            computeSerializedSize += GV.f(16, c7053kh4);
        }
        C10486uh4 c10486uh4 = this.w;
        if (c10486uh4 != null) {
            computeSerializedSize += GV.f(17, c10486uh4);
        }
        C8085nh4 c8085nh4 = this.x;
        if (c8085nh4 != null) {
            computeSerializedSize += GV.f(18, c8085nh4);
        }
        Eh4 eh4 = this.y;
        if (eh4 != null) {
            computeSerializedSize += GV.f(19, eh4);
        }
        C9800sh4 c9800sh4 = this.z;
        if (c9800sh4 != null) {
            computeSerializedSize += GV.f(20, c9800sh4);
        }
        Uh4 uh4 = this.A;
        if (uh4 != null) {
            computeSerializedSize += GV.f(21, uh4);
        }
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.B;
        if (vr$VREvent$SdkConfigurationParams != null) {
            computeSerializedSize += GV.f(22, vr$VREvent$SdkConfigurationParams);
        }
        Qg4 qg4 = this.C;
        if (qg4 != null) {
            computeSerializedSize += GV.f(23, qg4);
        }
        C6023hh4 c6023hh4 = this.D;
        if (c6023hh4 != null) {
            computeSerializedSize += GV.f(24, c6023hh4);
        }
        C8772ph4 c8772ph4 = this.E;
        if (c8772ph4 != null) {
            computeSerializedSize += GV.f(25, c8772ph4);
        }
        Xh4 xh4 = this.F;
        if (xh4 != null) {
            computeSerializedSize += GV.f(26, xh4);
        }
        Og4 og4 = this.G;
        if (og4 != null) {
            computeSerializedSize += GV.f(27, og4);
        }
        Vg4 vg4 = this.H;
        if (vg4 != null) {
            computeSerializedSize += GV.f(28, vg4);
        }
        Bh4 bh4 = this.I;
        if (bh4 != null) {
            computeSerializedSize += GV.f(29, bh4);
        }
        Integer num2 = this.a;
        if (num2 != null) {
            computeSerializedSize += GV.d(30, num2.intValue());
        }
        Ng4 ng4 = this.f11476J;
        return ng4 != null ? computeSerializedSize + GV.f(31, ng4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x02a7, code lost:            return r6;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x01e7. Please report as an issue. */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yh4.mergeFrom(zV):nV1");
    }
}
