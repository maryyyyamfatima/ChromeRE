package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.tile.TileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10335uF0 {
    public static void a(TileView tileView, Profile profile, Activity activity) {
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        String string = tileView.getContext().getString(R.string.f73390_resource_name_obfuscated_res_0x7f14047b);
        String string2 = tileView.getContext().getString(R.string.f73400_resource_name_obfuscated_res_0x7f14047c);
        final KU3 a = LU3.a(profile);
        if (a.shouldTriggerHelpUI("IPH_ExploreSitesTile")) {
            C3823bH3 c3823bH3 = new C3823bH3(tileView.getContext(), (View) tileView, string, string2, true, (LI2) new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(tileView), C10021tL.f().c());
            c3823bH3.g(true);
            final View findViewById = tileView.findViewById(R.id.tile_view_highlight);
            if (findViewById == null) {
                return;
            }
            Yc4 yc4 = new Yc4(1);
            yc4.d = new C9992tF0();
            AbstractC3593ad4.b(findViewById, yc4);
            c3823bH3.a(new PopupWindow.OnDismissListener() { // from class: rF0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    AbstractC3593ad4.a(findViewById);
                    a.dismissed("IPH_ExploreSitesTile");
                }
            });
            c3823bH3.h();
        }
    }
}
