package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zR3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12113zR3 {
    public static void a(final KU3 ku3, final View view, View view2) {
        C3823bH3 c3823bH3 = new C3823bH3(view2.getContext(), view2, R.string.f75260_resource_name_obfuscated_res_0x7f14054a, R.string.f75250_resource_name_obfuscated_res_0x7f140549, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view), C10021tL.f().c());
        c3823bH3.g(true);
        c3823bH3.a(new PopupWindow.OnDismissListener() { // from class: wR3
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ku3.dismissed("IPH_DownloadSettings");
                AbstractC3593ad4.a(view);
            }
        });
        AbstractC3593ad4.b(view, new Yc4(1));
        c3823bH3.h();
    }
}
