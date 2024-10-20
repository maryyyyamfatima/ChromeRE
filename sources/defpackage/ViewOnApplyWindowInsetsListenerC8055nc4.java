package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nc4 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC8055nc4 implements View.OnApplyWindowInsetsListener {
    public C5389fq4 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ InterfaceC11483xc2 c;

    public ViewOnApplyWindowInsetsListenerC8055nc4(View view, InterfaceC11483xc2 interfaceC11483xc2) {
        this.b = view;
        this.c = interfaceC11483xc2;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C5389fq4 g = C5389fq4.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC11483xc2 interfaceC11483xc2 = this.c;
        if (i < 30) {
            View view2 = this.b;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
            }
            if (g.equals(this.a)) {
                return interfaceC11483xc2.a(view, g).f();
            }
        }
        this.a = g;
        C5389fq4 a = interfaceC11483xc2.a(view, g);
        if (i >= 30) {
            return a.f();
        }
        WeakHashMap weakHashMap = Ec4.a;
        view.requestApplyInsets();
        return a.f();
    }
}
