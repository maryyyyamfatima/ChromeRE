package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zp0 */
/* loaded from: classes.dex */
public final class C12245zp0 extends QX0 implements InterfaceC7327lV1 {
    public static final C12245zp0 j;
    public static volatile KX0 k;
    public static final OX0 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(j, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C12245zp0();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C12245zp0.class) {
                        kx0 = k;
                        if (kx0 == null) {
                            kx0 = new KX0(j);
                            k = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C12245zp0 c12245zp0 = new C12245zp0();
        j = c12245zp0;
        QX0.u(C12245zp0.class, c12245zp0);
        l = QX0.t(CommandOuterClass$Command.l, c12245zp0, c12245zp0, null, 301192007, EnumC10540uq4.k, C12245zp0.class);
    }
}
