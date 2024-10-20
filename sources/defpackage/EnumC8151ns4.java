package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ns4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8151ns4 {
    g("AUTO"),
    h("FLEX_START"),
    i("CENTER"),
    j("FLEX_END"),
    k("STRETCH"),
    l("BASELINE"),
    m("SPACE_BETWEEN"),
    n("SPACE_AROUND");

    public final int a;

    EnumC8151ns4(String str) {
        this.a = r2;
    }

    public static EnumC8151ns4 a(int i2) {
        switch (i2) {
            case 0:
                return g;
            case 1:
                return h;
            case 2:
                return i;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return j;
            case 4:
                return k;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                return m;
            case 7:
                return n;
            default:
                throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i2));
        }
    }
}
