package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public enum R71 implements InterfaceC0467Dp1 {
    g("TYPE_UNSPECIFIED"),
    h("NOSCRIPT"),
    i("RESOURCE_LOADING"),
    j("LITE_PAGE_REDIRECT"),
    k("METADATA_FETCH_VALIDATION"),
    l("DEFER_ALL_SCRIPT"),
    m("PERFORMANCE_HINTS"),
    n("LITE_PAGE"),
    o("COMPRESS_PUBLIC_IMAGES"),
    p("LOADING_PREDICTOR"),
    q("FAST_HOST_HINTS"),
    r("LITE_VIDEO"),
    s("LINK_PERFORMANCE"),
    t("SHOPPING_PAGE_PREDICTOR"),
    u("LOGIN_DETECTION"),
    v("MERCHANT_TRUST_SIGNALS"),
    w("PRICE_TRACKING"),
    x("BLOOM_FILTER_VALIDATION"),
    y("ABOUT_THIS_SITE"),
    z("MERCHANT_TRUST_SIGNALS_V2"),
    A("PAGE_ENTITIES"),
    B("HISTORY_CLUSTERS"),
    C("THANK_CREATOR_ELIGIBLE");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static R71 b(int i2) {
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
            case 9:
                return p;
            case 10:
                return q;
            case 11:
            case 12:
            default:
                return null;
            case 13:
                return r;
            case 14:
                return s;
            case 15:
                return t;
            case 16:
                return u;
            case 17:
                return v;
            case 18:
                return w;
            case 19:
                return x;
            case 20:
                return y;
            case 21:
                return z;
            case 22:
                return A;
            case 23:
                return B;
            case 24:
                return C;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + R71.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    R71(String str) {
        this.a = r2;
    }
}
