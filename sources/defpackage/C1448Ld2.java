package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ld2 */
/* loaded from: classes.dex */
public final class C1448Ld2 extends QX0 implements InterfaceC7327lV1 {
    public static final C1448Ld2 m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public C1577Md2 k;
    public byte l = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1448Ld2();
            case 4:
                return new JX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C1448Ld2.class) {
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
        C1448Ld2 c1448Ld2 = new C1448Ld2();
        m = c1448Ld2;
        QX0.u(C1448Ld2.class, c1448Ld2);
        o = QX0.t(CommandOuterClass$Command.l, c1448Ld2, c1448Ld2, null, 267449278, EnumC10540uq4.k, C1448Ld2.class);
    }
}