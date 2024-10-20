package defpackage;

import J.N;
import java.util.Locale;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5622gY {
    public static CommerceSubscription a(JSONObject jSONObject) {
        try {
            return new CommerceSubscription(jSONObject.getString("type"), jSONObject.getString("identifier"), jSONObject.getString("managementType"), jSONObject.getString("identifierType"), Long.parseLong(jSONObject.getString("eventTimestampMicros")));
        } catch (JSONException e) {
            AbstractC4851eH1.a("CSJS", String.format(Locale.US, "Failed to deserialize CommerceSubscription. Details: %s", e.getMessage()), new Object[0]);
            return null;
        }
    }

    public static JSONObject b(CommerceSubscription commerceSubscription) {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", commerceSubscription.b);
            jSONObject.put("managementType", commerceSubscription.d);
            jSONObject.put("identifierType", commerceSubscription.e);
            jSONObject.put("identifier", commerceSubscription.c);
            C5278fY c5278fY = commerceSubscription.f;
            if (AbstractC8293oI0.a()) {
                C7928nE c7928nE = UN.a;
                z = N.M6bsIDpc("CommercePriceTracking", "price_tracking_parse_seen_offer_to_server", true);
            } else {
                z = true;
            }
            if (z && c5278fY != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("offerId", c5278fY.a);
                jSONObject2.put("seenPriceMicros", c5278fY.b);
                jSONObject2.put("countryCode", c5278fY.c);
                jSONObject.put("userSeenOffer", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            AbstractC4851eH1.a("CSJS", String.format(Locale.US, "Failed to serialize CommerceSubscription. Details: %s", e.getMessage()), new Object[0]);
            return null;
        }
    }
}
