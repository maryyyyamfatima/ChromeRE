package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ts4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10209ts4 {
    g("LEFT"),
    h("TOP"),
    i("RIGHT"),
    j("BOTTOM"),
    k("START"),
    l("END"),
    m("HORIZONTAL"),
    n("VERTICAL"),
    o("ALL");

    public final int a;

    EnumC10209ts4(String str) {
        this.a = r2;
    }

    public static EnumC10209ts4 a(int i2) {
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
            case 8:
                return o;
            default:
                throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i2));
        }
    }
}
