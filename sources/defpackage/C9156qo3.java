package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9156qo3 extends QX0 implements InterfaceC7327lV1 {
    public static final C9156qo3 o;
    public static volatile KX0 p;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9156qo3();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C9156qo3.class) {
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
        C9156qo3 c9156qo3 = new C9156qo3();
        o = c9156qo3;
        QX0.u(C9156qo3.class, c9156qo3);
    }
}