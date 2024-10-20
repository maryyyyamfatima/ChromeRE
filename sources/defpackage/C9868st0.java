package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: st0 */
/* loaded from: classes.dex */
public final class C9868st0 extends QX0 implements InterfaceC7327lV1 {
    public static final C9868st0 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public String k = "";
    public int l;
    public int m;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9868st0();
            case 4:
                return new C9525rt0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C9868st0.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9868st0 c9868st0 = new C9868st0();
        n = c9868st0;
        QX0.u(C9868st0.class, c9868st0);
        p = QX0.t(SenderStateOuterClass$SenderState.l, c9868st0, c9868st0, null, 449848976, EnumC10540uq4.k, C9868st0.class);
    }
}
