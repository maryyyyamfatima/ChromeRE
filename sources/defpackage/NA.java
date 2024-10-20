package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NA implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        int color;
        PropertyModel propertyModel = (PropertyModel) wd2;
        ViewLookupCachingFrameLayout viewLookupCachingFrameLayout = (ViewLookupCachingFrameLayout) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = MA.a;
        if (fd2 == pd2) {
            viewLookupCachingFrameLayout.findViewById(R.id.bookmark_edit).setOnClickListener((View.OnClickListener) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = MA.b;
        if (fd2 == pd22) {
            ((ImageView) viewLookupCachingFrameLayout.findViewById(R.id.bookmark_select_folder)).setImageDrawable((Drawable) propertyModel.i(pd22));
            return;
        }
        LD2 ld2 = MA.c;
        if (fd2 == ld2) {
            ((ImageView) viewLookupCachingFrameLayout.findViewById(R.id.bookmark_select_folder)).setEnabled(propertyModel.j(ld2));
            return;
        }
        PD2 pd23 = MA.d;
        if (fd2 == pd23) {
            viewLookupCachingFrameLayout.findViewById(R.id.bookmark_select_folder).setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
            return;
        }
        PD2 pd24 = MA.e;
        if (fd2 == pd24) {
            ((ImageView) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_start_icon)).setImageDrawable((Drawable) propertyModel.i(pd24));
            return;
        }
        PD2 pd25 = MA.f;
        if (fd2 == pd25) {
            ((TextView) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_subtitle)).setText((CharSequence) propertyModel.i(pd25));
            return;
        }
        PD2 pd26 = MA.g;
        if (fd2 == pd26) {
            ((TextView) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_title)).setText((CharSequence) propertyModel.i(pd26));
            return;
        }
        LD2 ld22 = MA.h;
        if (fd2 == ld22) {
            ((CompoundButton) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch)).setChecked(propertyModel.j(ld22));
            return;
        }
        PD2 pd27 = MA.i;
        if (fd2 == pd27) {
            ((CompoundButton) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) propertyModel.i(pd27));
            return;
        }
        LD2 ld23 = MA.j;
        if (fd2 == ld23) {
            viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_divider).setVisibility(propertyModel.j(ld23) ? 0 : 8);
            viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_container).setVisibility(propertyModel.j(ld23) ? 0 : 8);
            return;
        }
        LD2 ld24 = MA.k;
        if (fd2 == ld24) {
            boolean j = propertyModel.j(ld24);
            Drawable drawable = ((ImageView) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_start_icon)).getDrawable();
            if (drawable != null) {
                if (j) {
                    color = AbstractC10957w33.c(viewLookupCachingFrameLayout.getContext());
                } else {
                    Context context = viewLookupCachingFrameLayout.getContext();
                    Object obj3 = Y50.a;
                    color = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070119);
                }
                drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            AbstractC9771sd.i(j ? R.style.f102720_resource_name_obfuscated_res_0x7f15044d : R.style.f102690_resource_name_obfuscated_res_0x7f15044a, (TextView) viewLookupCachingFrameLayout.findViewById(R.id.notification_switch_title));
            return;
        }
        PD2 pd28 = MA.l;
        if (fd2 == pd28) {
            ((TextView) viewLookupCachingFrameLayout.findViewById(R.id.subtitle_text)).setText((CharSequence) propertyModel.i(pd28));
            return;
        }
        PD2 pd29 = MA.m;
        if (fd2 == pd29) {
            ((TextView) viewLookupCachingFrameLayout.findViewById(R.id.title_text)).setText((CharSequence) propertyModel.i(pd29));
        }
    }
}
