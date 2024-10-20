package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jW */
/* loaded from: classes.dex */
public final class C6642jW extends QX0 implements InterfaceC7327lV1 {
    public static final C6642jW m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public C2972Ww2 k;
    public int l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6642jW();
            case 4:
                return new C6300iW(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C6642jW.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C6642jW c6642jW = new C6642jW();
        m = c6642jW;
        QX0.u(C6642jW.class, c6642jW);
        o = QX0.t(SenderStateOuterClass$SenderState.l, c6642jW, c6642jW, null, 198239242, EnumC10540uq4.k, C6642jW.class);
    }
}
