package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cM2 */
/* loaded from: classes.dex */
public final class C4190cM2 {
    public final S70 a;

    public C4190cM2(S70 s70) {
        this.a = s70;
    }

    public final boolean a(String str) {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("RelatedSearches", "language_allowlist");
        if (TextUtils.isEmpty(MMltG$kc)) {
            MMltG$kc = "en";
        }
        if (!(TextUtils.isEmpty(MMltG$kc) || MMltG$kc.contains(str))) {
            return false;
        }
        this.a.getClass();
        if (!(N.M6bsIDpc("RelatedSearches", "needs_url", false) || TextUtils.isEmpty(N.MMltG$kc("RelatedSearches", "stamp"))) || N.Mfmn09fr(Profile.d())) {
            return !(N.M6bsIDpc("RelatedSearches", "needs_content", false) || TextUtils.isEmpty(N.MMltG$kc("RelatedSearches", "stamp"))) || S70.c() || S70.d();
        }
        return false;
    }

    public static Uri b(int i, Uri uri) {
        String queryParameter = uri.getQueryParameter("ctxsl_rs");
        if (queryParameter == null || queryParameter.isEmpty()) {
            return uri;
        }
        String a = AbstractC7848n0.a(queryParameter, "Up" + Integer.toString(i));
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter2 = uri.getQueryParameter(str);
            if (str.equals("ctxsl_rs")) {
                queryParameter2 = a;
            }
            if (queryParameter2 != null) {
                clearQuery.appendQueryParameter(str, queryParameter2);
            }
        }
        return clearQuery.build();
    }
}
