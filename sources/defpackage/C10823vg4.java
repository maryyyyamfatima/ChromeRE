package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10823vg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public String h = null;
    public C9109qg4 i = null;
    public Integer j = null;
    public Integer k = null;
    public Integer l = null;
    public Boolean m = null;

    public static void b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append(i);
                sb.append(" is not a valid enum State");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public C10823vg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C10823vg4 clone() {
        try {
            C10823vg4 c10823vg4 = (C10823vg4) a();
            C9109qg4 c9109qg4 = this.i;
            if (c9109qg4 != null) {
                try {
                    c10823vg4.i = (C9109qg4) c9109qg4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c10823vg4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Integer num2 = this.g;
        if (num2 != null) {
            gv.r(2, num2.intValue());
        }
        String str = this.h;
        if (str != null) {
            gv.x(3, str);
        }
        C9109qg4 c9109qg4 = this.i;
        if (c9109qg4 != null) {
            gv.t(4, c9109qg4);
        }
        Integer num3 = this.j;
        if (num3 != null) {
            gv.r(5, num3.intValue());
        }
        Integer num4 = this.k;
        if (num4 != null) {
            gv.r(6, num4.intValue());
        }
        Integer num5 = this.l;
        if (num5 != null) {
            gv.r(7, num5.intValue());
        }
        Boolean bool = this.m;
        if (bool != null) {
            gv.n(8, bool.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.a;
        if (num != null) {
            computeSerializedSize += GV.d(1, num.intValue());
        }
        Integer num2 = this.g;
        if (num2 != null) {
            computeSerializedSize += GV.d(2, num2.intValue());
        }
        String str = this.h;
        if (str != null) {
            computeSerializedSize += GV.i(3, str);
        }
        C9109qg4 c9109qg4 = this.i;
        if (c9109qg4 != null) {
            computeSerializedSize += GV.f(4, c9109qg4);
        }
        Integer num3 = this.j;
        if (num3 != null) {
            computeSerializedSize += GV.d(5, num3.intValue());
        }
        Integer num4 = this.k;
        if (num4 != null) {
            computeSerializedSize += GV.d(6, num4.intValue());
        }
        Integer num5 = this.l;
        if (num5 != null) {
            computeSerializedSize += GV.d(7, num5.intValue());
        }
        Boolean bool = this.m;
        if (bool == null) {
            return computeSerializedSize;
        }
        bool.booleanValue();
        return computeSerializedSize + GV.a(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0108, code lost:            return r7;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r8) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10823vg4.mergeFrom(zV):nV1");
    }
}
