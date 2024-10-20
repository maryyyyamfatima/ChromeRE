package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oc */
/* loaded from: classes.dex */
public final class C8394oc extends QX0 implements InterfaceC7327lV1 {
    public static final C8394oc m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public boolean k;
    public float l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8394oc();
            case 4:
                return new C8050nc(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C8394oc.class) {
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
        C8394oc c8394oc = new C8394oc();
        m = c8394oc;
        QX0.u(C8394oc.class, c8394oc);
        o = QX0.t(SenderStateOuterClass$SenderState.l, c8394oc, c8394oc, null, 196573526, EnumC10540uq4.k, C8394oc.class);
    }
}
