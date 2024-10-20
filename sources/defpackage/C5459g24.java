package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g24 */
/* loaded from: classes.dex */
public final class C5459g24 implements InterfaceC6007hf0 {
    public final C6629jT1 a = C4771e24.a().d.a;

    @Override // defpackage.InterfaceC6007hf0
    public final int e(int i) {
        if (i == 0) {
            return R.layout.0_resource_name_obfuscated_res_0x7f0e02df;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC6007hf0
    public final int getItemViewType(int i) {
        return i == R.id.update_menu_id ? 0 : -1;
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
        C6629jT1 c6629jT1 = this.a;
        if (fd2 == nd2) {
            view.setId(propertyModel.h(nd2));
            if (c6629jT1 != null) {
                TextView textView = (TextView) view.findViewById(R.id.menu_item_summary);
                if (!TextUtils.isEmpty(c6629jT1.c)) {
                    textView.setText(c6629jT1.c);
                    textView.setVisibility(0);
                    return;
                } else {
                    textView.setText("");
                    textView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        PD2 pd2 = AbstractC1470Li.b;
        if (fd2 == pd2) {
            TextView textView2 = (TextView) view.findViewById(R.id.menu_item_text);
            if (c6629jT1 == null) {
                textView2.setText((CharSequence) propertyModel.i(pd2));
                return;
            } else {
                textView2.setText(c6629jT1.a);
                textView2.setTextColor(Y50.b(view.getContext(), c6629jT1.b));
                return;
            }
        }
        PD2 pd22 = AbstractC1470Li.c;
        if (fd2 == pd22) {
            TextView textView3 = (TextView) view.findViewById(R.id.menu_item_text);
            if (c6629jT1 == null) {
                textView3.setContentDescription((CharSequence) propertyModel.i(pd22));
                return;
            } else {
                textView3.setContentDescription(view.getResources().getString(c6629jT1.a));
                return;
            }
        }
        PD2 pd23 = AbstractC1470Li.h;
        if (fd2 == pd23) {
            ImageView imageView = (ImageView) view.findViewById(R.id.menu_item_icon);
            if (c6629jT1 == null) {
                imageView.setImageDrawable((Drawable) propertyModel.i(pd23));
                imageView.setVisibility(0);
                return;
            } else {
                imageView.setImageResource(c6629jT1.d);
                return;
            }
        }
        LD2 ld2 = AbstractC1470Li.d;
        if (fd2 == ld2) {
            view.findViewById(R.id.menu_item_text).setEnabled(propertyModel.j(ld2));
            if (c6629jT1 != null) {
                view.setEnabled(c6629jT1.e);
                return;
            }
            return;
        }
        if (fd2 == AbstractC1470Li.l) {
            view.setOnClickListener(new View.OnClickListener() { // from class: f24
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
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080637);
        return (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080638) * 2) + Math.max(dimensionPixelSize, AbstractC2884Wf.a(contextThemeWrapper, R.drawable.0_resource_name_obfuscated_res_0x7f090393).getIntrinsicHeight());
    }
}
