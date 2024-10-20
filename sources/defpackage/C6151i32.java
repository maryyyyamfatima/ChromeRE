package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import org.chromium.chrome.browser.language.settings.NeverTranslateListFragment;
import org.chromium.chrome.browser.translate.TranslateBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6151i32 implements InterfaceC11945yw1 {
    @Override // defpackage.InterfaceC11945yw1
    public final TreeSet b() {
        C9549rx1 b = C9549rx1.b();
        b.getClass();
        ArrayList a = TranslateBridge.a();
        TreeSet treeSet = new TreeSet(C10230tw1.f);
        Iterator it = a.iterator();
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
        return NeverTranslateListFragment.class.getName();
    }
}
