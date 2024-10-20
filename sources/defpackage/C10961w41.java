package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w41 */
/* loaded from: classes.dex */
public final class C10961w41 extends QX0 implements InterfaceC7327lV1 {
    public static final C10961w41 o;
    public static volatile KX0 p;
    public Object k;
    public Object m;
    public int j = 0;
    public int l = 0;
    public byte n = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"k", "j", "m", "l", VD0.class, VT.class, TD0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10961w41();
            case 4:
                return new C10618v41(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C10961w41.class) {
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
        C10961w41 c10961w41 = new C10961w41();
        o = c10961w41;
        QX0.u(C10961w41.class, c10961w41);
    }
}
