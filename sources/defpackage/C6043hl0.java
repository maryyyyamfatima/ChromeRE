package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hl0 */
/* loaded from: classes.dex */
public final class C6043hl0 extends QX0 implements InterfaceC7327lV1 {
    public static final C6043hl0 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public float k;
    public CommandOuterClass$Command l;
    public byte m = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ခ\u0000\u0002ᐉ\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6043hl0();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C6043hl0.class) {
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
        C6043hl0 c6043hl0 = new C6043hl0();
        n = c6043hl0;
        QX0.u(C6043hl0.class, c6043hl0);
        p = QX0.t(CommandOuterClass$Command.l, c6043hl0, c6043hl0, null, 182590845, EnumC10540uq4.k, C6043hl0.class);
    }
}
