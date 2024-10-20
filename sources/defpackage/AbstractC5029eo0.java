package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5029eo0 {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("go_back", 2);
        hashMap.put("reload", 3);
        hashMap.put("go_forward", 4);
        hashMap.put("bookmark_this_page", 5);
        hashMap.put("downloads", 6);
        hashMap.put("preferences", 7);
        hashMap.put("open_history", 8);
        hashMap.put("help", 9);
        hashMap.put("new_tab", 10);
        hashMap.put("close_tab", 11);
        hashMap.put("close_all_tabs", 12);
        hashMap.put("find_in_page", 13);
        a = Collections.unmodifiableMap(hashMap);
    }
}
