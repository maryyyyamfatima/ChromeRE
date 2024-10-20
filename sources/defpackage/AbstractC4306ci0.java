package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ci0 */
/* loaded from: classes.dex */
public abstract class AbstractC4306ci0 {
    public static final HashSet a = new HashSet();

    public static void a(ComponentTree componentTree, WZ wz, C7070kk3 c7070kk3, int i) {
        if (a.remove(Integer.valueOf(componentTree.Z)) || i == 8) {
            return;
        }
        new C7070kk3(c7070kk3);
        C3963bi0 c3963bi0 = componentTree.f;
        if (c3963bi0 != null) {
            ArrayList arrayList = c3963bi0.a;
            arrayList.add(new C3619ai0(System.currentTimeMillis(), ((C3619ai0) arrayList.get(arrayList.size() - 1)).a + 1));
            return;
        }
        componentTree.f = new C3963bi0(wz, i);
    }
}
