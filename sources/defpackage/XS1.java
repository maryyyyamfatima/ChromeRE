package defpackage;

import android.os.Bundle;
import com.android.chrome.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XS1 implements InterfaceC3999bo0 {
    public static final Map d;
    public final InterfaceC9377rT1 a;
    public final InterfaceC10590uz3 b;
    public HashSet c = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("go_forward", Integer.valueOf(R.id.forward_menu_id));
        hashMap.put("reload", Integer.valueOf(R.id.reload_menu_id));
        hashMap.put("bookmark_this_page", Integer.valueOf(R.id.bookmark_this_page_id));
        hashMap.put("downloads", Integer.valueOf(R.id.downloads_menu_id));
        hashMap.put("help", Integer.valueOf(R.id.help_id));
        hashMap.put("new_tab", Integer.valueOf(R.id.new_tab_menu_id));
        hashMap.put("open_history", Integer.valueOf(R.id.open_history_menu_id));
        hashMap.put("preferences", Integer.valueOf(R.id.preferences_id));
        hashMap.put("close_all_tabs", Integer.valueOf(R.id.close_all_tabs_menu_id));
        d = Collections.unmodifiableMap(hashMap);
    }

    public XS1(InterfaceC9377rT1 interfaceC9377rT1, InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC9377rT1;
        this.b = interfaceC10590uz3;
    }

    @Override // defpackage.InterfaceC3999bo0
    public final void b(C3185Yn0 c3185Yn0) {
        HashSet hashSet = new HashSet();
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.b;
        Tab h = abstractC11276wz3.h();
        if (h != null && h.isUserInteractable()) {
            if (h.j()) {
                hashSet.add(Integer.valueOf(R.id.forward_menu_id));
            }
            hashSet.add(Integer.valueOf(R.id.reload_menu_id));
            hashSet.add(Integer.valueOf(R.id.bookmark_this_page_id));
            hashSet.add(Integer.valueOf(R.id.open_history_menu_id));
        }
        if (abstractC11276wz3.n() > 0) {
            hashSet.add(Integer.valueOf(R.id.close_all_tabs_menu_id));
        }
        hashSet.add(Integer.valueOf(R.id.downloads_menu_id));
        hashSet.add(Integer.valueOf(R.id.help_id));
        hashSet.add(Integer.valueOf(R.id.new_tab_menu_id));
        hashSet.add(Integer.valueOf(R.id.preferences_id));
        HashSet hashSet2 = this.c;
        if (hashSet2 != null) {
            hashSet.retainAll(hashSet2);
        }
        for (Map.Entry entry : d.entrySet()) {
            if (hashSet.contains(entry.getValue())) {
                c3185Yn0.a((String) entry.getKey());
            }
        }
    }

    @Override // defpackage.InterfaceC3999bo0
    public final boolean a(String str, Bundle bundle, C2925Wn0 c2925Wn0) {
        HashSet hashSet;
        Integer num = (Integer) d.get(str);
        if (num == null || !(((hashSet = this.c) == null || hashSet.contains(num)) && this.a.Y(num.intValue(), false))) {
            return false;
        }
        c2925Wn0.onResult(Bundle.EMPTY);
        return true;
    }
}
