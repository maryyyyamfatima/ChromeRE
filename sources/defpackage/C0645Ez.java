package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ez */
/* loaded from: classes.dex */
public final class C0645Ez extends QX0 implements InterfaceC7327lV1 {
    public static final C0645Ez j;
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
                return new C0645Ez();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C0645Ez.class) {
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
        C0645Ez c0645Ez = new C0645Ez();
        j = c0645Ez;
        QX0.u(C0645Ez.class, c0645Ez);
        l = QX0.t(CommandOuterClass$Command.l, c0645Ez, c0645Ez, null, 336926123, EnumC10540uq4.k, C0645Ez.class);
    }
}
