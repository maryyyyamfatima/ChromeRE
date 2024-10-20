package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.chromium.base.LocaleUtils;
import org.chromium.chrome.browser.translate.TranslateBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9549rx1 {
    public static C9549rx1 c;
    public final LinkedHashMap a = new LinkedHashMap();
    public InterfaceC9207qx1 b;

    public static void g(int i) {
        EI2.h(i, 17, "LanguageSettings.Actions");
    }

    public static void h(int i) {
        EI2.h(i, 12, "LanguageSettings.PageImpression");
    }

    public final C10230tw1 c(String str) {
        if (TextUtils.equals(str, null)) {
            return C10230tw1.a();
        }
        LinkedHashMap linkedHashMap = this.a;
        C10230tw1 c10230tw1 = (C10230tw1) linkedHashMap.get(str);
        return c10230tw1 != null ? c10230tw1 : (C10230tw1) linkedHashMap.get(LocaleUtils.b(str));
    }

    public C9549rx1() {
        ArrayList arrayList = new ArrayList();
        N.MlwSZWfW(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10230tw1 c10230tw1 = (C10230tw1) it.next();
            this.a.put(c10230tw1.a, c10230tw1);
        }
    }

    public final ArrayList e() {
        ArrayList b = TranslateBridge.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(str)) {
                arrayList.add((C10230tw1) linkedHashMap.get(str));
            }
        }
        return arrayList;
    }

    public final ArrayList d(List list) {
        final HashSet hashSet = new HashSet(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InterfaceC7496ly2 interfaceC7496ly2 = new InterfaceC7496ly2() { // from class: ox1
            @Override // defpackage.InterfaceC7496ly2
            public final boolean a(C10230tw1 c10230tw1) {
                boolean z;
                boolean z2 = c10230tw1.d;
                String str = c10230tw1.a;
                if (z2) {
                    if (TextUtils.equals(str, "zh-CN") || TextUtils.equals(str, "zh-TW")) {
                        z = true;
                    } else if (!TextUtils.equals(str, "nb")) {
                        z = !str.contains("-");
                    }
                    return (z || hashSet.contains(str)) ? false : true;
                }
                z = false;
                if (z) {
                }
            }
        };
        a(linkedHashSet, e(), interfaceC7496ly2);
        a(linkedHashSet, this.a.values(), interfaceC7496ly2);
        return new ArrayList(linkedHashSet);
    }

    public static void a(LinkedHashSet linkedHashSet, Collection collection, InterfaceC7496ly2 interfaceC7496ly2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C10230tw1 c10230tw1 = (C10230tw1) it.next();
            if (interfaceC7496ly2.a(c10230tw1)) {
                linkedHashSet.add(c10230tw1);
            }
        }
    }

    public static C9549rx1 b() {
        if (c == null) {
            c = new C9549rx1();
        }
        return c;
    }

    public final void f(String str, int i) {
        if (i == 0) {
            return;
        }
        N.MLlzo6h2(str, i);
        g(8);
        InterfaceC9207qx1 interfaceC9207qx1 = this.b;
        if (interfaceC9207qx1 != null) {
            ((A50) interfaceC9207qx1).S();
        }
    }
}
