package defpackage;

import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.endpoint_fetcher.EndpointResponse;
import org.chromium.chrome.browser.profiles.Profile;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9743sY {
    public static final String[] b = {"https://www.googleapis.com/auth/chromememex"};
    public static final String[] c = {"https://www.googleapis.com/auth/chromesync"};
    public final Profile a;

    public C9743sY(Profile profile) {
        this.a = profile;
    }

    public final void a(JSONObject jSONObject, final Callback callback) {
        AbstractC4133cB0.a(new Callback() { // from class: qY
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9743sY.this.getClass();
                boolean z = false;
                try {
                    z = new JSONObject(((EndpointResponse) obj).a).getJSONObject("status").getInt("code") == 0;
                } catch (JSONException e) {
                    AbstractC4851eH1.a("CSSP", String.format(Locale.US, "Failed to create CreateSubscriptionRequestParams. Details: %s", e.getMessage()), new Object[0]);
                }
                callback.onResult(Boolean.valueOf(z));
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, this.a, "susbcriptions_svc", AbstractC7684mY.a(), "POST", b, jSONObject.toString(), 1000L, C5463g32.b);
    }
}
