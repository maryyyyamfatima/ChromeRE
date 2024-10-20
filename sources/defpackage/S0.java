package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.android.chrome.R;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S0 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        final T0 t0 = (T0) obj;
        C2924Wn c2924Wn = (C2924Wn) abstractC9053qX;
        final View view = c2924Wn.a;
        if (view == null) {
            view = c2924Wn.b;
        }
        if (view != null) {
            if (((t0.j & 1) != 0) && !t0.k.isEmpty()) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getApplicationContext().getSystemService("accessibility");
                if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                    return C5971hZ.a;
                }
                return new C6657jZ(new H4() { // from class: R0
                    @Override // defpackage.H4
                    public final void run() {
                        View view2;
                        S0.this.getClass();
                        String str = t0.k;
                        View view3 = view;
                        View rootView = view3.getRootView();
                        if (rootView == null) {
                            throw new IllegalStateException("Unable to locate the root View.");
                        }
                        View d = S0.d(rootView, str);
                        if (d == null) {
                            Context context = view3.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    view2 = null;
                                    break;
                                } else {
                                    if (context instanceof Activity) {
                                        view2 = ((Activity) context).getWindow().getDecorView();
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (view2 != null) {
                                d = S0.d(view2, str);
                            }
                        }
                        if (d == null) {
                            throw new IllegalArgumentException(AbstractC4809e90.a("Unable to locate view with accessibility id: ", str));
                        }
                        WeakHashMap weakHashMap = Ec4.a;
                        d.performAccessibilityAction(64, null);
                    }
                });
            }
            return new C6315iZ(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        return new C6315iZ(new IllegalStateException("Unable to locate the component's view."));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return T0.n;
    }

    public static View d(View view, String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.pollFirst();
            if (view2 != null) {
                if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                    return view2;
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return null;
    }
}
