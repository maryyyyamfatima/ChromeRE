package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cc0 */
/* loaded from: classes.dex */
public final class C4270cc0 {
    public HashMap a;

    public final void c(Context context, GURL gurl, GURL gurl2, boolean z) {
        String uri;
        C7928nE c7928nE = UN.a;
        GURL gurl3 = new GURL(N.MMltG$kc("ShareCrowButton", "DebugServerURL"));
        String a = a(gurl);
        C9626sA2 g = C9626sA2.g();
        g.getClass();
        boolean z2 = AbstractC1171Ja0.a(g) && N.Mfmn09fr(Profile.d());
        String i = gurl3.i();
        if (i.isEmpty()) {
            uri = "";
        } else {
            Uri.Builder buildUpon = Uri.parse(i).buildUpon();
            buildUpon.appendQueryParameter("pageUrl", gurl.i());
            buildUpon.appendQueryParameter("entry", "menu");
            buildUpon.appendQueryParameter("relCanonUrl", gurl2.i());
            buildUpon.appendQueryParameter("publicationId", a);
            buildUpon.appendQueryParameter("metrics", z2 ? "true" : "false");
            if (z) {
                buildUpon.appendQueryParameter("following", "true");
            }
            uri = buildUpon.build().toString();
        }
        C3140Ye0 c3140Ye0 = new C3140Ye0();
        c3140Ye0.d();
        c3140Ye0.b(AbstractC3899bX.e(context) ? 2 : 1);
        c3140Ye0.c(2);
        C3270Ze0 a2 = c3140Ye0.a();
        String name = CustomTabActivity.class.getName();
        Intent intent = a2.a;
        intent.setClassName(context, name);
        intent.setData(Uri.parse(uri));
        Object obj = Y50.a;
        context.startActivity(intent, null);
    }

    public final void b(GURL gurl, final Callback callback) {
        C7928nE c7928nE = UN.a;
        if (!(AbstractC8293oI0.a() && N.M09VlOh_("ShareCrowButton"))) {
            callback.onResult(Boolean.FALSE);
            return;
        }
        if (!a(gurl).equals("0")) {
            callback.onResult(Boolean.TRUE);
        } else if (!N.M6bsIDpc("ShareCrowButton", "UsePageOptimizations", false)) {
            callback.onResult(Boolean.FALSE);
        } else {
            AbstractC3927bc0.a.a().a(gurl, R71.C, new OptimizationGuideBridge.OptimizationGuideCallback() { // from class: ac0
                @Override // org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge.OptimizationGuideCallback
                public final void a(int i, DY dy) {
                    Callback.this.onResult(Boolean.valueOf(i == 1));
                }
            });
        }
    }

    public final String a(GURL gurl) {
        String d = gurl.d();
        String MluxpBTY = N.MluxpBTY(d);
        if (!MluxpBTY.isEmpty()) {
            return MluxpBTY;
        }
        if (this.a == null) {
            C7928nE c7928nE = UN.a;
            String MMltG$kc = N.MMltG$kc("ShareCrowButton", "DomainList");
            HashMap hashMap = new HashMap();
            for (String str : MMltG$kc.split("\\;", 20)) {
                String[] split = str.split("\\^", 2);
                if (split.length < 2) {
                    break;
                }
                hashMap.put(split[0], split[1]);
            }
            this.a = hashMap;
        }
        return !this.a.containsKey(d) ? "0" : (String) this.a.get(d);
    }
}
