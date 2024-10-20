package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iV3 */
/* loaded from: classes.dex */
public final class C6299iV3 extends MX0 {
    public static final C6299iV3 o;
    public static volatile KX0 p;
    public static final OX0 q;
    public int k;
    public C6641jV3 m;
    public byte n = 2;
    public String l = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6299iV3();
            case 4:
                return new LX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C6299iV3.class) {
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
        C6299iV3 c6299iV3 = new C6299iV3();
        o = c6299iV3;
        QX0.u(C6299iV3.class, c6299iV3);
        q = QX0.t(CommandOuterClass$Command.l, c6299iV3, c6299iV3, null, 194114827, EnumC10540uq4.k, C6299iV3.class);
    }
}
