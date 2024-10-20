package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4363cr3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4363cr3 s;
    public static volatile KX0 t;
    public Object k;
    public int l;
    public int p;
    public boolean q;
    public C4020br3 r;
    public int j = 0;
    public String m = "";
    public String n = "";
    public InterfaceC1377Kp1 o = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(s, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000b\t", new Object[]{"k", "j", "l", "m", "p", C7800mr3.class, C2293Rq3.class, C5050er3.class, C2423Sq3.class, "q", "n", "o", C8488or3.class, "r"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4363cr3();
            case 4:
                return new JX0(s);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (C4363cr3.class) {
                        kx0 = t;
                        if (kx0 == null) {
                            kx0 = new KX0(s);
                            t = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4363cr3 c4363cr3 = new C4363cr3();
        s = c4363cr3;
        QX0.u(C4363cr3.class, c4363cr3);
    }
}
