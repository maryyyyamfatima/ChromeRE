package defpackage;

import android.view.ViewGroup;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kW3 */
/* loaded from: classes.dex */
public abstract class AbstractC6990kW3 {
    public static final C1105In a = new C1105In();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static C4317ck b() {
        C4317ck c4317ck;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c4317ck = (C4317ck) weakReference.get()) != null) {
            return c4317ck;
        }
        C4317ck c4317ck2 = new C4317ck();
        threadLocal.set(new WeakReference(c4317ck2));
        return c4317ck2;
    }

    public static void a(ViewGroup viewGroup, QV3 qv3) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = Ec4.a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (qv3 == null) {
                qv3 = a;
            }
            QV3 clone = qv3.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((QV3) it.next()).v(viewGroup);
                }
            }
            if (clone != null) {
                clone.i(viewGroup, true);
            }
            X5.a(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                ViewTreeObserverOnPreDrawListenerC4928eW3 viewTreeObserverOnPreDrawListenerC4928eW3 = new ViewTreeObserverOnPreDrawListenerC4928eW3(viewGroup, clone);
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC4928eW3);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4928eW3);
            }
        }
    }
}
