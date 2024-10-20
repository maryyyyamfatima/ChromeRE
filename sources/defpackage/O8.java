package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import org.chromium.chrome.browser.language.settings.AlwaysTranslateListFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O8 implements InterfaceC11945yw1 {
    @Override // defpackage.InterfaceC11945yw1
    public final TreeSet b() {
        C9549rx1 b = C9549rx1.b();
        b.getClass();
        ArrayList arrayList = new ArrayList(Arrays.asList(N.MAJqSbXG()));
        TreeSet treeSet = new TreeSet(C10230tw1.f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LinkedHashMap linkedHashMap = b.a;
            if (linkedHashMap.containsKey(str)) {
                treeSet.add((C10230tw1) linkedHashMap.get(str));
            }
        }
        return treeSet;
    }

    @Override // defpackage.InterfaceC11945yw1
    public final String a() {
        return AlwaysTranslateListFragment.class.getName();
    }
}
