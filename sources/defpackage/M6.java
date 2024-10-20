package defpackage;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class M6 {
    public static Integer a;

    public static boolean b() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("AdaptiveButtonInTopToolbarCustomizationV2") && N.M37SqSAy("AdaptiveButtonInTopToolbarCustomizationV2", "min_version_adaptive", 0) <= 4;
    }

    public static int a() {
        Integer num = a;
        if (num != null) {
            return num.intValue();
        }
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("AdaptiveButtonInTopToolbarCustomizationV2", "default_segment");
        if (TextUtils.isEmpty(MMltG$kc)) {
            MMltG$kc = "new-tab";
        }
        MMltG$kc.getClass();
        char c = 65535;
        switch (MMltG$kc.hashCode()) {
            case 109400031:
                if (MMltG$kc.equals("share")) {
                    c = 0;
                    break;
                }
                break;
            case 112386354:
                if (MMltG$kc.equals("voice")) {
                    c = 1;
                    break;
                }
                break;
            case 1844055528:
                if (MMltG$kc.equals("new-tab")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                a = 3;
                break;
            case 1:
                a = 4;
                break;
            case 2:
                a = 2;
                break;
            default:
                a = 0;
                break;
        }
        return a.intValue();
    }
}
