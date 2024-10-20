package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hX3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5965hX3 {
    public final C6309iX3 a;

    public final void a(Object obj, String str) {
        this.a.a.put(str, obj);
    }

    public C5965hX3(C6309iX3 c6309iX3) {
        this.a = c6309iX3;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    boolean startsWith = str.startsWith("org.chromium.chrome.browser.autofill_assistant.device_only.");
                    C6309iX3 c6309iX3 = this.a;
                    if (startsWith) {
                        c6309iX3.b.put(str.substring(59), obj);
                    } else if (str.startsWith("org.chromium.chrome.browser.autofill_assistant.")) {
                        if (str.equals("org.chromium.chrome.browser.autofill_assistant.EXPERIMENT_IDS")) {
                            String a = C6309iX3.a(obj.toString());
                            c6309iX3.getClass();
                            if (!TextUtils.isEmpty(a)) {
                                StringBuilder sb = c6309iX3.c;
                                if (sb.length() > 0 && !sb.toString().endsWith(",")) {
                                    sb.append(",");
                                }
                                sb.append(a);
                            }
                        }
                        c6309iX3.a.put(str.substring(47), obj);
                    }
                }
            }
        }
    }
}
