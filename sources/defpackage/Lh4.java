package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Lh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Boolean g = null;

    public Lh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Lh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Lh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Boolean bool = this.g;
        if (bool != null) {
            gv.n(2, bool.booleanValue());
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
        Boolean bool = this.g;
        if (bool == null) {
            return computeSerializedSize;
        }
        bool.booleanValue();
        return computeSerializedSize + GV.a(2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0029. Please report as an issue. */
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
                                this.a = Integer.valueOf(j);
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(54);
                                sb.append(j);
                                sb.append(" is not a valid enum DashboardDismissReason");
                                throw new IllegalArgumentException(sb.toString());
                                break;
                        }
                    } catch (IllegalArgumentException unused) {
                        c12129zV.n(i);
                        storeUnknownField(c12129zV, m);
                    }
                } else if (m != 16) {
                    if (!super.storeUnknownField(c12129zV, m)) {
                    }
                } else {
                    this.g = Boolean.valueOf(c12129zV.c());
                }
            }
        }
        return this;
    }
}
