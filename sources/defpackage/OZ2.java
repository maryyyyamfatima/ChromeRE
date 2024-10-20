package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OZ2 extends BroadcastReceiver {
    public static OZ2 b;
    public boolean a;

    public static boolean b(boolean z) {
        String string = Settings.Secure.getString(V60.a.getContentResolver(), "selected_search_engine_chrome");
        if (string == null) {
            JZ2.a(4);
            return false;
        }
        NZ2 nz2 = null;
        try {
            JSONObject jSONObject = new JSONObject(string);
            nz2 = new NZ2(jSONObject.getString("name"), jSONObject.getString("keyword"), jSONObject.getString("search_url"), jSONObject.has("suggest_url") ? jSONObject.getString("suggest_url") : null, jSONObject.has("favicon_url") ? jSONObject.getString("favicon_url") : null);
        } catch (JSONException unused) {
        }
        if (nz2 == null) {
            JZ2.a(5);
            return false;
        }
        if (z) {
            TemplateUrlService a = IG3.a();
            TemplateUrl c = a.c();
            int MJpD6RKI = c == null ? -1 : N.MJpD6RKI(a.c, a, c.b());
            EI2.h(MJpD6RKI, 64, "Android.SearchEngineChoice.SearchEngineBeforeChoicePrompt");
            O83.a.q(MJpD6RKI, "search_engine_choice_default_type_before");
        }
        TemplateUrlService a2 = IG3.a();
        if (!N.Mtum8rvb(a2.c, a2, nz2.a, nz2.b, nz2.c, nz2.d, nz2.e, z)) {
            JZ2.a(6);
        }
        if (!z) {
            return true;
        }
        JZ2.b();
        return true;
    }

    public final void a() {
        if (V60.a.getPackageManager().hasSystemFeature("com.google.android.feature.EEA_V2_DEVICE")) {
            SharedPreferences sharedPreferences = T60.a;
            String string = sharedPreferences.getString("search_engine_choice_propagated_package_name", null);
            if (string != null) {
                if (TextUtils.equals(string, "NO_DATA") || sharedPreferences.getInt("search_engine_choice_propagate_state", 0) == 1) {
                    return;
                }
                IG3.a().i(new Runnable() { // from class: MZ2
                    @Override // java.lang.Runnable
                    public final void run() {
                        OZ2.this.getClass();
                        OZ2.b(false);
                        T60.a.edit().putInt("search_engine_choice_propagate_state", 1).apply();
                    }
                });
                return;
            }
            JZ2.a(0);
            final String string2 = Settings.Secure.getString(V60.a.getContentResolver(), "selected_search_engine");
            if (string2 == null) {
                JZ2.a(1);
                if (this.a) {
                    return;
                }
                V60.c(V60.a, this, new IntentFilter("com.google.android.finsky.intent.action.UPDATE_DSE"), "com.google.android.finsky.permission.DSE");
                this.a = true;
                return;
            }
            if (this.a) {
                V60.a.unregisterReceiver(this);
                this.a = false;
            }
            if (string2.equals("NO_DATA")) {
                JZ2.a(2);
                sharedPreferences.edit().putString("search_engine_choice_propagated_package_name", "NO_DATA").apply();
            } else {
                JZ2.a(3);
                IG3.a().i(new Runnable() { // from class: LZ2
                    @Override // java.lang.Runnable
                    public final void run() {
                        OZ2.this.getClass();
                        if (OZ2.b(true)) {
                            SharedPreferences sharedPreferences2 = T60.a;
                            sharedPreferences2.edit().putString("search_engine_choice_propagated_package_name", string2).apply();
                            sharedPreferences2.edit().putInt("search_engine_choice_propagate_state", 1).apply();
                            JZ2.a(7);
                        }
                    }
                });
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.finsky.intent.action.UPDATE_DSE".equals(intent.getAction())) {
            if (this.a) {
                V60.a.unregisterReceiver(this);
                this.a = false;
            }
            a();
        }
    }
}
