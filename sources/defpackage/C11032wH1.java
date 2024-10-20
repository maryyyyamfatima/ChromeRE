package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wH1 */
/* loaded from: classes.dex */
public final class C11032wH1 extends QX0 implements InterfaceC7327lV1 {
    public static final C11032wH1 k;
    public static volatile KX0 l;
    public static final OX0 m;
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
                return new C11032wH1();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C11032wH1.class) {
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
        C11032wH1 c11032wH1 = new C11032wH1();
        k = c11032wH1;
        QX0.u(C11032wH1.class, c11032wH1);
        m = QX0.t(CommandOuterClass$Command.l, c11032wH1, c11032wH1, null, 372233181, EnumC10540uq4.k, C11032wH1.class);
    }
}
