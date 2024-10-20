package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10616v4 {
    public static C8765pg3 a(final Context context, final String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new C8765pg3(new C11997z52(context, new Callback() { // from class: t4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CustomTabActivity.W1(context, str);
            }
        }), AbstractC4199cO1.a("<", str2, ">"), AbstractC4199cO1.a("</", str2, ">"));
    }
}
