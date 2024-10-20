package defpackage;

import com.android.chrome.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10374uN {
    public static final Map a;
    public static final Set b;

    static {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        hashMap.put("browser", PI.a(R.string.f78360_resource_name_obfuscated_res_0x7f1406d9, "browser", 2));
        hashSet.add("browser");
        hashMap.put("downloads", PI.a(R.string.f78390_resource_name_obfuscated_res_0x7f1406dc, "downloads", 2));
        hashSet.add("downloads");
        hashMap.put("incognito", PI.a(R.string.f78440_resource_name_obfuscated_res_0x7f1406e1, "incognito", 2));
        hashSet.add("incognito");
        hashMap.put("media", PI.a(R.string.f78450_resource_name_obfuscated_res_0x7f1406e2, "media", 2));
        hashSet.add("media");
        hashMap.put("webrtc_cam_and_mic", PI.a(R.string.f78560_resource_name_obfuscated_res_0x7f1406ee, "webrtc_cam_and_mic", 2));
        hashMap.put("screen_capture", PI.a(R.string.f78470_resource_name_obfuscated_res_0x7f1406e5, "screen_capture", 4));
        hashMap.put("sharing", PI.a(R.string.f78490_resource_name_obfuscated_res_0x7f1406e7, "sharing", 4));
        hashMap.put("sites", PI.a(R.string.f78500_resource_name_obfuscated_res_0x7f1406e8, "sites", 3));
        hashMap.put("content_suggestions", PI.a(R.string.f78380_resource_name_obfuscated_res_0x7f1406db, "content_suggestions", 2));
        hashMap.put("webapp_actions", PI.a(R.string.f78410_resource_name_obfuscated_res_0x7f1406de, "webapp_actions", 1));
        hashMap.put("vr", PI.a(R.string.f78530_resource_name_obfuscated_res_0x7f1406eb, "vr", 4));
        hashMap.put("updates", PI.a(R.string.f78510_resource_name_obfuscated_res_0x7f1406e9, "updates", 4));
        hashMap.put("completed_downloads", new PI("completed_downloads", R.string.f78370_resource_name_obfuscated_res_0x7f1406da, 2, true, false));
        hashMap.put("announcement", new PI("announcement", R.string.f78340_resource_name_obfuscated_res_0x7f1406d7, 2, true, false));
        hashMap.put("twa_disclosure_initial", new PI("twa_disclosure_initial", R.string.f78540_resource_name_obfuscated_res_0x7f1406ec, 5, false, true));
        hashMap.put("twa_disclosure_subsequent", PI.a(R.string.f78550_resource_name_obfuscated_res_0x7f1406ed, "twa_disclosure_subsequent", 1));
        hashMap.put("shopping_price_drop_alerts", PI.a(R.string.f78460_resource_name_obfuscated_res_0x7f1406e4, "shopping_price_drop_alerts", 2));
        hashMap.put("security_key", PI.a(R.string.f78480_resource_name_obfuscated_res_0x7f1406e6, "security_key", 4));
        hashMap.put("chrome_tips", PI.a(R.string.f78400_resource_name_obfuscated_res_0x7f1406dd, "chrome_tips", 4));
        hashMap.put("bluetooth", PI.a(R.string.f78350_resource_name_obfuscated_res_0x7f1406d8, "bluetooth", 2));
        hashMap.put("usb", PI.a(R.string.f78520_resource_name_obfuscated_res_0x7f1406ea, "usb", 2));
        a = Collections.unmodifiableMap(hashMap);
        b = Collections.unmodifiableSet(hashSet);
    }
}
