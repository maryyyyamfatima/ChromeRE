package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ie2 */
/* loaded from: classes.dex */
public final class C6347ie2 extends QX0 implements InterfaceC7327lV1 {
    public static final C6347ie2 p;
    public static volatile KX0 q;
    public static final OX0 r;
    public int j;
    public CommandOuterClass$Command k;
    public CommandOuterClass$Command l;
    public CommandOuterClass$Command m;
    public CommandOuterClass$Command n;
    public byte o = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6347ie2();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C6347ie2.class) {
                        kx0 = q;
                        if (kx0 == null) {
                            kx0 = new KX0(p);
                            q = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C6347ie2 c6347ie2 = new C6347ie2();
        p = c6347ie2;
        QX0.u(C6347ie2.class, c6347ie2);
        r = QX0.t(CommandOuterClass$Command.l, c6347ie2, c6347ie2, null, 170382629, EnumC10540uq4.k, C6347ie2.class);
    }
}
