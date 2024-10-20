package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ur2 */
/* loaded from: classes.dex */
public final class C10544ur2 extends QX0 implements InterfaceC7327lV1 {
    public static final C10544ur2 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public CommandOuterClass$Command l;
    public byte m = 2;
    public String k = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10544ur2();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C10544ur2.class) {
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
        C10544ur2 c10544ur2 = new C10544ur2();
        n = c10544ur2;
        QX0.u(C10544ur2.class, c10544ur2);
        p = QX0.t(CommandOuterClass$Command.l, c10544ur2, c10544ur2, null, 325347951, EnumC10540uq4.k, C10544ur2.class);
    }
}
