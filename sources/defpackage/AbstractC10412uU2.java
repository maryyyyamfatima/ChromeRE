package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uU2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10412uU2 {
    public static final ND2 a;
    public static final ND2 b;
    public static final ND2 c;
    public static final ND2 d;
    public static final PD2 e;
    public static final PD2 f;
    public static final PD2 g;
    public static final PD2 h;
    public static final OD2 i;
    public static final FD2[] j;

    public static int a(int i2) {
        switch (i2) {
            case 0:
            default:
                return 7;
            case 1:
                return 0;
            case 2:
                return 1;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 2;
            case 4:
                return 3;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
            case 9:
                return 7;
        }
    }

    static {
        ND2 nd2 = new ND2();
        a = nd2;
        ND2 nd22 = new ND2();
        b = nd22;
        ND2 nd23 = new ND2();
        c = nd23;
        ND2 nd24 = new ND2();
        d = nd24;
        PD2 pd2 = new PD2();
        e = pd2;
        PD2 pd22 = new PD2();
        f = pd22;
        PD2 pd23 = new PD2();
        g = pd23;
        PD2 pd24 = new PD2();
        h = pd24;
        OD2 od2 = new OD2();
        i = od2;
        j = new FD2[]{nd2, nd22, nd23, nd24, pd2, pd22, pd23, pd24, od2};
    }
}
