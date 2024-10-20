package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.endpoint_fetcher.EndpointResponse;
import org.chromium.chrome.browser.profiles.Profile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oB3 */
/* loaded from: classes.dex */
public final class C8261oB3 implements InterfaceC5167fB3 {
    public final Context a;

    public C8261oB3(Activity activity) {
        this.a = activity;
    }

    public static String b(C6448iv3 c6448iv3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (C6106hv3 c6106hv3 : c6448iv3.a) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", c6106hv3.i);
            jSONObject3.put("url", c6106hv3.a);
            jSONObject3.put("title", c6106hv3.j);
            jSONObject3.put("timestamp", c6106hv3.h);
            String str = c6106hv3.g;
            if (str != null) {
                jSONObject3.put("referrer", str);
            }
            jSONArray.put(jSONObject3);
        }
        return jSONObject.put("tabContext", jSONObject2.put("tabs", jSONArray)).toString();
    }

    @Override // defpackage.InterfaceC5167fB3
    public final boolean isEnabled() {
        if (US.a(C1202Jg1.a(), 1)) {
            C7928nE c7928nE = UN.a;
            if (N.M6bsIDpc("CloseTabSuggestions", "server_fetcher_enabled", false) && AbstractC5177fD3.e(this.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC5167fB3
    public final void a(final C6448iv3 c6448iv3, final C6199iB3 c6199iB3) {
        try {
            Iterator it = c6448iv3.a.iterator();
            while (it.hasNext()) {
                if (((C6106hv3) it.next()).l) {
                    c6199iB3.onResult(new C5511gB3(Collections.emptyList(), c6448iv3));
                    return;
                }
            }
            N.MiPC31k4(Profile.d(), "https://memex-pa.googleapis.com/v1/suggestions", "POST", "application/json; charset=UTF-8", b(c6448iv3), 10000L, new String[0], C5463g32.b.a, new Callback() { // from class: nB3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    JSONObject jSONObject;
                    int i;
                    Callback callback = c6199iB3;
                    C6448iv3 c6448iv32 = c6448iv3;
                    EndpointResponse endpointResponse = (EndpointResponse) obj;
                    C8261oB3.this.getClass();
                    LinkedList linkedList = new LinkedList();
                    try {
                        jSONObject = new JSONObject(endpointResponse.a);
                    } catch (JSONException e) {
                        AbstractC4851eH1.a("TSSF", String.format("There was a problem parsing the JSON\n Details: %s", e.getMessage()), new Object[0]);
                    }
                    if (jSONObject.isNull("suggestions")) {
                        callback.onResult(new C5511gB3(Collections.emptyList(), c6448iv32));
                        return;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("suggestions");
                    for (int i2 = 0; i2 < jSONObject.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        LinkedList a = C6448iv3.a(jSONObject2.getJSONArray("tabs").toString());
                        String str = (String) jSONObject2.get("action");
                        str.getClass();
                        if (str.equals("Close")) {
                            i = 1;
                        } else if (str.equals("Group")) {
                            i = 0;
                        } else {
                            AbstractC4851eH1.a("TSSF", String.format("Unknown action: %s\n", str), new Object[0]);
                            i = -1;
                        }
                        linkedList.add(new VA3(i, a));
                    }
                    callback.onResult(new C5511gB3(linkedList, c6448iv32));
                }
            });
        } catch (JSONException e) {
            AbstractC4851eH1.a("TSSF", "There was a problem parsing the JSON" + e.getMessage(), new Object[0]);
            c6199iB3.onResult(new C5511gB3(Collections.emptyList(), c6448iv3));
        }
    }
}
