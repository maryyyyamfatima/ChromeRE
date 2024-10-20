package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kb4 */
/* loaded from: classes.dex */
public final class C7017kb4 extends QX0 implements InterfaceC7327lV1 {
    public static final C7017kb4 r;
    public static volatile KX0 s;
    public int j;
    public Object l;
    public float m;
    public long n;
    public int p;
    public int k = 0;
    public String o = "";
    public String q = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005ခ\u0004\u0007ဈ\u0006\bဌ\u0007\tဈ\b\nဂ\u0005\u000bြ\u0000", new Object[]{"l", "k", "j", C6673jb4.class, C6331ib4.class, C5643gb4.class, "m", "o", "p", C4955eb4.a, "q", "n", C5987hb4.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7017kb4();
            case 4:
                return new C5299fb4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C7017kb4.class) {
                        kx0 = s;
                        if (kx0 == null) {
                            kx0 = new KX0(r);
                            s = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C7017kb4 c7017kb4 = new C7017kb4();
        r = c7017kb4;
        QX0.u(C7017kb4.class, c7017kb4);
    }
}
