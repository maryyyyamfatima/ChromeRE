package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eK3 */
/* loaded from: classes.dex */
public final class C4868eK3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4868eK3 k;
    public static volatile KX0 l;
    public byte j = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4868eK3();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C4868eK3.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4868eK3 c4868eK3 = new C4868eK3();
        k = c4868eK3;
        QX0.u(C4868eK3.class, c4868eK3);
    }
}
