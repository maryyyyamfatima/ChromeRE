package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211Bq0 implements N74 {
    public static final C0211Bq0 a = new C0211Bq0();
    public static final C2826Vt1 b = C2826Vt1.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // defpackage.N74
    public final Object a(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        abstractC3086Xt1.c();
        int i = 3;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (abstractC3086Xt1.i()) {
            switch (abstractC3086Xt1.C(b)) {
                case 0:
                    str = abstractC3086Xt1.s();
                    break;
                case 1:
                    str2 = abstractC3086Xt1.s();
                    break;
                case 2:
                    f2 = (float) abstractC3086Xt1.k();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    int r = abstractC3086Xt1.r();
                    if (r <= 2 && r >= 0) {
                        i = AbstractC2373Sg3.c(3)[r];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    i2 = abstractC3086Xt1.r();
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    f3 = (float) abstractC3086Xt1.k();
                    break;
                case 6:
                    f4 = (float) abstractC3086Xt1.k();
                    break;
                case 7:
                    i3 = AbstractC4036bu1.a(abstractC3086Xt1);
                    break;
                case 8:
                    i4 = AbstractC4036bu1.a(abstractC3086Xt1);
                    break;
                case 9:
                    f5 = (float) abstractC3086Xt1.k();
                    break;
                case 10:
                    z = abstractC3086Xt1.j();
                    break;
                default:
                    abstractC3086Xt1.F();
                    abstractC3086Xt1.I();
                    break;
            }
        }
        abstractC3086Xt1.f();
        return new C0081Aq0(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z);
    }
}
