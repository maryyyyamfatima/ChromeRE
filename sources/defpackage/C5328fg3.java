package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fg3 */
/* loaded from: classes.dex */
public final class C5328fg3 extends QX0 implements InterfaceC7327lV1 {
    public static final C5328fg3 n;
    public static volatile KX0 o;
    public int j;
    public Object l;
    public int k = 0;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"l", "k", "j", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5328fg3();
            case 4:
                return new C4984eg3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C5328fg3.class) {
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
        C5328fg3 c5328fg3 = new C5328fg3();
        n = c5328fg3;
        QX0.u(C5328fg3.class, c5328fg3);
    }
}