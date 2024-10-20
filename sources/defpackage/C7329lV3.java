package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lV3 */
/* loaded from: classes.dex */
public final class C7329lV3 extends QX0 implements InterfaceC7327lV1 {
    public static final C7329lV3 o;
    public static volatile KX0 p;
    public int j;
    public SenderStateOuterClass$SenderState l;
    public C6641jV3 m;
    public byte n = 2;
    public AbstractC4147cE k = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ည\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7329lV3();
            case 4:
                return new C6985kV3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C7329lV3.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C7329lV3 c7329lV3 = new C7329lV3();
        o = c7329lV3;
        QX0.u(C7329lV3.class, c7329lV3);
    }
}
