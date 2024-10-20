package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Dc4 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a = null;
    public SparseArray b = null;
    public WeakReference c = null;

    public final View a(View view) {
        View a;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    a = a(viewGroup.getChildAt(childCount));
                }
            } while (a == null);
            return a;
        }
        b(view);
        return null;
    }

    public static void b(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return;
        }
        X5.a(arrayList.get(size));
        throw null;
    }
}
