package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: is4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6432is4 implements InterfaceC0467Dp1 {
    g("CLIENT_ID_UNSPECIFIED"),
    h("DISCOVER_ANDROID"),
    i("DISCOVER_IOS"),
    j("GOOGLE_ON_CONTENT_AGSA_CLASSIC_ANDROID"),
    k("GOOGLE_ON_CONTENT_IOS"),
    l("ASSISTANT_ANDROID"),
    m("ASSISTANT_IOS"),
    n("GOOGLE_GO_ANDROID"),
    o("DISCOVER_CHROME_ANDROID"),
    p("ASSISTANT_ANDROID_TV"),
    q("DISCOVER_NIU_ANDROID"),
    r("ASSISTANT_SYMBIOTE_ANDROID"),
    s("GOOGLE_ON_CONTENT_AGSA_TNG_ANDROID"),
    t("MESSAGES_ANDROID"),
    u("LENS_ANDROID"),
    v("PLAYGROUND_ANDROID"),
    w("WEATHER_ANDROID"),
    x("ASSISTANT_SNAPSHOT_ANDROID"),
    y("CARD_VIEWER"),
    z("ASSISTANT_KIT_SNAPSHOT_IOS"),
    A("ASSISTANT_KIT_OPA_IOS"),
    B("ASSISTANT_KIT_PLATE_IOS"),
    C("LENS_IOS"),
    D("PLAYGROUND_IOS"),
    E("XBLEND_IOS"),
    F("XBLEND_ANDROID"),
    G("AMBIENT_ANDROID_TV"),
    H("DYNAMIC_HOME_IOS"),
    I("SEARCH_XRAY_IOS"),
    f11513J("ASSISTANT_LEARNING_CENTER_ANDROID"),
    K("JUMP_BACK_IN_IOS"),
    L("TITAN_HUBUI_ANDROID"),
    M("MAIN_ASSISTANT_TNG_ANDROID"),
    N("SEARCH_NOTIFICATIONS_IOS"),
    O("LAUNCHERX_ANDROID_TV"),
    P("FEATURE_INTEGRATION_POINT_IGA_TASK_RESUMPTION_IOS"),
    Q("SUGGEST_ANDROID"),
    R("XBLEND_BUBBLES_ANDROID"),
    S("SUGGEST_IOS");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static EnumC6432is4 b(int i2) {
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
                return r;
            case 12:
                return s;
            case 13:
                return t;
            case 14:
                return u;
            case 15:
                return v;
            case 16:
                return w;
            case 17:
                return x;
            case 18:
                return y;
            case 19:
                return z;
            case 20:
                return A;
            case 21:
                return B;
            case 22:
                return C;
            case 23:
                return D;
            case 24:
                return E;
            case 25:
                return F;
            case 26:
                return G;
            case 27:
                return H;
            case 28:
                return I;
            case 29:
                return f11513J;
            case 30:
                return K;
            case 31:
                return L;
            case 32:
                return M;
            case 33:
                return N;
            case 34:
                return O;
            case 35:
                return P;
            case 36:
                return Q;
            case 37:
                return R;
            case 38:
                return S;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC6432is4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC6432is4(String str) {
        this.a = r2;
    }
}
