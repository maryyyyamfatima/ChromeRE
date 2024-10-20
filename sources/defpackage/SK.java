package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class SK {
    public static void a(final PropertyModel propertyModel, ChipView chipView, FD2 fd2) {
        if (OK.a == fd2) {
            chipView.setOnClickListener(new View.OnClickListener() { // from class: RK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PD2 pd2 = OK.a;
                    PropertyModel propertyModel2 = PropertyModel.this;
                    ((Callback) propertyModel2.i(pd2)).onResult(propertyModel2);
                }
            });
            return;
        }
        PD2 pd2 = OK.b;
        if (pd2 == fd2) {
            chipView.g.setContentDescription((CharSequence) propertyModel.i(pd2));
            return;
        }
        LD2 ld2 = OK.c;
        if (ld2 == fd2) {
            chipView.setEnabled(propertyModel.j(ld2));
            return;
        }
        ND2 nd2 = OK.d;
        LD2 ld22 = OK.f;
        if (nd2 == fd2) {
            int h = propertyModel.h(nd2);
            boolean z = false;
            if (h == -1) {
                chipView.b(-1, false);
                return;
            }
            if (propertyModel.b().contains(ld22) && propertyModel.j(ld22)) {
                z = true;
            }
            if (z) {
                h = R.drawable.0_resource_name_obfuscated_res_0x7f0901d5;
            }
            chipView.b(h, true);
            return;
        }
        if (OK.e == fd2) {
            return;
        }
        if (ld22 == fd2) {
            chipView.setSelected(propertyModel.j(ld22));
            return;
        }
        JD2 jd2 = OK.g;
        if (jd2 == fd2) {
            chipView.g.setText((CharSequence) propertyModel.i(jd2));
            return;
        }
        ND2 nd22 = OK.h;
        if (nd22 == fd2) {
            int h2 = propertyModel.h(nd22);
            if (h2 == 0) {
                chipView.g.setEllipsize(null);
                chipView.g.setMaxWidth(Integer.MAX_VALUE);
            } else {
                chipView.g.setEllipsize(TextUtils.TruncateAt.END);
                chipView.g.setMaxWidth(h2);
            }
        }
    }
}
