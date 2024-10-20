package defpackage;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10007tI0 {
    public static boolean a(String str, String str2, boolean z) {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc(str, str2);
        Boolean valueOf = TextUtils.isEmpty(MMltG$kc) ? null : Boolean.valueOf(Boolean.parseBoolean(MMltG$kc));
        return (valueOf == null || valueOf.booleanValue() == z) ? false : true;
    }
}
