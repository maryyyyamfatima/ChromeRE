package defpackage;

import J.N;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.text.TextViewWithCompoundDrawables;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rj1 */
/* loaded from: classes.dex */
public final class C9466rj1 implements InterfaceC6007hf0 {
    @Override // defpackage.InterfaceC6007hf0
    public final int e(int i) {
        if (i == 0) {
            return R.layout.0_resource_name_obfuscated_res_0x7f0e00ba;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC6007hf0
    public final int getItemViewType(int i) {
        return i == R.id.new_incognito_tab_menu_id ? 0 : -1;
    }

    @Override // defpackage.InterfaceC6007hf0
    public final void getViewTypeCount() {
    }

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        final PropertyModel propertyModel = (PropertyModel) wd2;
        View view = (View) obj;
        FD2 fd2 = (FD2) obj2;
        AbstractC3968bj.a(propertyModel, view, fd2);
        ND2 nd2 = AbstractC1470Li.a;
        if (fd2 == nd2) {
            view.setId(propertyModel.h(nd2));
            if (N.MRzPUMq7()) {
                ChromeImageView chromeImageView = (ChromeImageView) view.findViewById(R.id.trailing_icon);
                chromeImageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901cc);
                chromeImageView.setVisibility(0);
                return;
            }
            return;
        }
        PD2 pd2 = AbstractC1470Li.b;
        if (fd2 == pd2) {
            ((TextViewWithCompoundDrawables) view.findViewById(R.id.title)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = AbstractC1470Li.c;
        if (fd2 == pd22) {
            view.findViewById(R.id.title).setContentDescription((CharSequence) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = AbstractC1470Li.h;
        if (fd2 == pd23) {
            ((TextViewWithCompoundDrawables) view.findViewById(R.id.title)).setCompoundDrawablesRelative((Drawable) propertyModel.i(pd23), null, null, null);
            return;
        }
        LD2 ld2 = AbstractC1470Li.d;
        if (fd2 == ld2) {
            boolean j = propertyModel.j(ld2);
            TextViewWithCompoundDrawables textViewWithCompoundDrawables = (TextViewWithCompoundDrawables) view.findViewById(R.id.title);
            textViewWithCompoundDrawables.setEnabled(j);
            textViewWithCompoundDrawables.setFocusable(false);
            view.setFocusable(j);
            return;
        }
        LD2 ld22 = AbstractC1470Li.e;
        if (fd2 == ld22) {
            if (propertyModel.j(ld22)) {
                AbstractC3593ad4.b(view, new Yc4(2));
                return;
            } else {
                AbstractC3593ad4.a(view);
                return;
            }
        }
        if (fd2 == AbstractC1470Li.l) {
            view.setOnClickListener(new View.OnClickListener() { // from class: qj1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PD2 pd24 = AbstractC1470Li.l;
                    PropertyModel propertyModel2 = PropertyModel.this;
                    ((ViewOnKeyListenerC11859yi) ((InterfaceC0300Ci) propertyModel2.i(pd24))).b(propertyModel2);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC6007hf0
    public final int f(ContextThemeWrapper contextThemeWrapper) {
        return contextThemeWrapper.obtainStyledAttributes(new int[]{android.R.attr.listPreferredItemHeightSmall}).getDimensionPixelSize(0, 0);
    }
}
