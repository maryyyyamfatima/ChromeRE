package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Th4 extends RF0 implements Cloneable {
    public Sh4 a = null;
    public Rh4 g = null;

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
                return;
            default:
                StringBuilder sb = new StringBuilder(36);
                sb.append(i);
                sb.append(" is not a valid enum Step");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public Th4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Th4 clone() {
        try {
            Th4 th4 = (Th4) a();
            Sh4 sh4 = this.a;
            if (sh4 != null) {
                try {
                    th4.a = (Sh4) sh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Rh4 rh4 = this.g;
            if (rh4 != null) {
                try {
                    th4.g = (Rh4) rh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return th4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Sh4 sh4 = this.a;
        if (sh4 != null) {
            gv.t(1, sh4);
        }
        Rh4 rh4 = this.g;
        if (rh4 != null) {
            gv.t(2, rh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Sh4 sh4 = this.a;
        if (sh4 != null) {
            computeSerializedSize += GV.f(1, sh4);
        }
        Rh4 rh4 = this.g;
        return rh4 != null ? computeSerializedSize + GV.f(2, rh4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                if (this.a == null) {
                    this.a = new Sh4();
                }
                c12129zV.f(this.a);
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.g == null) {
                    this.g = new Rh4();
                }
                c12129zV.f(this.g);
            }
        }
        return this;
    }
}
