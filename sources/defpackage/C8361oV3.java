package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oV3 */
/* loaded from: classes.dex */
public final class C8361oV3 extends QX0 implements InterfaceC7327lV1 {
    public static final C8361oV3 n;
    public static volatile KX0 o;
    public int j;
    public SenderStateOuterClass$SenderState l;
    public OL1 k = OL1.g;
    public byte m = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u00012\u0002ᐉ\u0000", new Object[]{"j", "k", AbstractC8017nV3.a, "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8361oV3();
            case 4:
                return new C7673mV3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C8361oV3.class) {
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
        C8361oV3 c8361oV3 = new C8361oV3();
        n = c8361oV3;
        QX0.u(C8361oV3.class, c8361oV3);
    }
}