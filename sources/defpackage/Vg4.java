package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Vg4 extends RF0 implements Cloneable {
    public Integer g = null;
    public Long h = null;
    public Float i = null;
    public Long j = null;
    public Tg4 k = null;
    public int a = -1;
    public Ug4 l = null;

    public Vg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Vg4 clone() {
        try {
            Vg4 vg4 = (Vg4) a();
            Tg4 tg4 = this.k;
            if (tg4 != null) {
                vg4.k = tg4.clone();
            }
            Ug4 ug4 = this.l;
            if (ug4 != null) {
                vg4.l = ug4.clone();
            }
            return vg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.g;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Long l = this.h;
        if (l != null) {
            gv.s(2, l.longValue());
        }
        Float f = this.i;
        if (f != null) {
            gv.p(3, f.floatValue());
        }
        Long l2 = this.j;
        if (l2 != null) {
            gv.s(4, l2.longValue());
        }
        Tg4 tg4 = this.k;
        if (tg4 != null) {
            gv.t(5, tg4);
        }
        if (this.a == 0) {
            gv.t(6, this.l);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(1, num.intValue());
        }
        Long l = this.h;
        if (l != null) {
            computeSerializedSize += GV.e(2, l.longValue());
        }
        Float f = this.i;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(3);
        }
        Long l2 = this.j;
        if (l2 != null) {
            computeSerializedSize += GV.e(4, l2.longValue());
        }
        Tg4 tg4 = this.k;
        if (tg4 != null) {
            computeSerializedSize += GV.f(5, tg4);
        }
        return this.a == 0 ? computeSerializedSize + GV.f(6, this.l) : computeSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0075. Please report as an issue. */
    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m != 0) {
                if (m == 8) {
                    int i = c12129zV.e - c12129zV.b;
                    try {
                        int j = c12129zV.j();
                        switch (j) {
                            case 0:
                            case 1:
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            case 4:
                            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            case 6:
                            case 7:
                                this.g = Integer.valueOf(j);
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(46);
                                sb.append(j);
                                sb.append(" is not a valid enum FallBackReason");
                                throw new IllegalArgumentException(sb.toString());
                                break;
                        }
                    } catch (IllegalArgumentException unused) {
                        c12129zV.n(i);
                        storeUnknownField(c12129zV, m);
                    }
                } else if (m == 16) {
                    this.h = Long.valueOf(c12129zV.k());
                } else if (m == 29) {
                    this.i = Float.valueOf(c12129zV.e());
                } else if (m == 32) {
                    this.j = Long.valueOf(c12129zV.k());
                } else if (m == 42) {
                    if (this.k == null) {
                        this.k = new Tg4();
                    }
                    c12129zV.f(this.k);
                } else if (m != 50) {
                    if (!super.storeUnknownField(c12129zV, m)) {
                    }
                } else {
                    if (this.l == null) {
                        this.l = new Ug4();
                    }
                    c12129zV.f(this.l);
                    this.a = 0;
                }
            }
        }
        return this;
    }
}
