package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4066c extends QX0 implements InterfaceC7327lV1 {
    public static final C4066c p;
    public static volatile KX0 q;
    public int j;
    public C3379a n;
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ဈ\u0004\u0005ဈ\u0001", new Object[]{"j", "k", "m", "n", "o", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4066c();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C4066c.class) {
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
        C4066c c4066c = new C4066c();
        p = c4066c;
        QX0.u(C4066c.class, c4066c);
    }
}
