package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rw0 */
/* loaded from: classes.dex */
public final class C9543rw0 extends QX0 implements InterfaceC7327lV1 {
    public static final C9543rw0 p;
    public static volatile KX0 q;
    public static final OX0 r;
    public int j;
    public C6391im k;
    public int l;
    public boolean m;
    public int n;
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
                return QX0.s(p, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9543rw0();
            case 4:
                return new C9201qw0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C9543rw0.class) {
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
        C9543rw0 c9543rw0 = new C9543rw0();
        p = c9543rw0;
        QX0.u(C9543rw0.class, c9543rw0);
        r = QX0.t(SenderStateOuterClass$SenderState.l, c9543rw0, c9543rw0, null, 194116769, EnumC10540uq4.k, C9543rw0.class);
    }
}
