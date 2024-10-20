package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kW */
/* loaded from: classes.dex */
public final class C6986kW extends QX0 implements InterfaceC7327lV1 {
    public static final C6986kW q;
    public static volatile KX0 r;
    public static final OX0 s;
    public int j;
    public int k;
    public float l;
    public int n;
    public C5956hW p;
    public boolean m = true;
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"j", "k", "l", "m", "n", C7330lW.a, "o", "p"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6986kW();
            case 4:
                return new JX0(q);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C6986kW.class) {
                        kx0 = r;
                        if (kx0 == null) {
                            kx0 = new KX0(q);
                            r = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C6986kW c6986kW = new C6986kW();
        q = c6986kW;
        QX0.u(C6986kW.class, c6986kW);
        s = QX0.t(CommandOuterClass$Command.l, c6986kW, c6986kW, null, 281539545, EnumC10540uq4.k, C6986kW.class);
    }
}
