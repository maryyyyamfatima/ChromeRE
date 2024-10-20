package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bj */
/* loaded from: classes2.dex */
public abstract class AbstractC3968bj {
    public static PropertyModel b(MenuItem menuItem) {
        BD2 bd2 = new BD2(AbstractC1470Li.o);
        bd2.c(AbstractC1470Li.a, menuItem.getItemId());
        bd2.e(AbstractC1470Li.b, menuItem.getTitle());
        bd2.e(AbstractC1470Li.c, menuItem.getTitleCondensed());
        bd2.e(AbstractC1470Li.h, menuItem.getIcon());
        bd2.b(AbstractC1470Li.f, menuItem.isCheckable());
        bd2.b(AbstractC1470Li.g, menuItem.isChecked());
        bd2.b(AbstractC1470Li.d, menuItem.isEnabled());
        return bd2.a();
    }

    public static void a(PropertyModel propertyModel, View view, FD2 fd2) {
        LD2 ld2 = AbstractC1470Li.k;
        if (fd2 == ld2) {
            if (propertyModel.j(ld2)) {
                int h = propertyModel.h(AbstractC1470Li.j);
                float f = view.getContext().getResources().getDisplayMetrics().density;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f * (-10.0f), 0.0f));
                animatorSet.setStartDelay((h * 30) + 80);
                animatorSet.setDuration(350L);
                animatorSet.setInterpolator(InterpolatorC0485Dt.e);
                animatorSet.addListener(new C3289Zi(view));
                view.setTag(R.id.menu_item_enter_anim_id, animatorSet);
                return;
            }
            view.setTag(R.id.menu_item_enter_anim_id, null);
        }
    }
}
