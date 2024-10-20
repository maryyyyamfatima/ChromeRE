package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10409uU extends QX0 implements InterfaceC7327lV1 {
    public static final C10409uU v;
    public static volatile KX0 w;
    public static final OX0 x;
    public int j;
    public VT l;
    public int m;
    public boolean o;
    public boolean p;
    public boolean q;
    public int s;
    public KU t;
    public byte u = 2;
    public String k = "";
    public String n = "";
    public String r = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(v, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဈ\u0007\u0006ᐉ\u0001\u0007င\b\bဇ\u0006\tᐉ\t\nဇ\u0005", new Object[]{"j", "k", "m", Hf4.a, "n", "o", "r", "l", "s", "q", "t", "p"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10409uU();
            case 4:
                return new JX0(v);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return v;
            case 6:
                KX0 kx0 = w;
                if (kx0 == null) {
                    synchronized (C10409uU.class) {
                        kx0 = w;
                        if (kx0 == null) {
                            kx0 = new KX0(v);
                            w = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C10409uU c10409uU = new C10409uU();
        v = c10409uU;
        QX0.u(C10409uU.class, c10409uU);
        x = QX0.t(C9984tD2.l, c10409uU, c10409uU, null, 218597920, EnumC10540uq4.k, C10409uU.class);
    }
}
