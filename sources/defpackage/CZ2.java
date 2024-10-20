package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CZ2 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        PropertyModel propertyModel = (PropertyModel) wd2;
        View view = (View) obj;
        FD2 fd2 = (FD2) obj2;
        ImageView imageView = (ImageView) view.findViewById(R.id.voice_search_button);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.lens_camera_button);
        TextView textView = (TextView) view.findViewById(R.id.search_box_text);
        LD2 ld2 = BZ2.c;
        if (ld2 == fd2) {
            view.setVisibility(propertyModel.j(ld2) ? 0 : 8);
            return;
        }
        MD2 md2 = BZ2.a;
        if (md2 == fd2) {
            view.setAlpha(propertyModel.g(md2));
            Ge4.g(view, view.getAlpha() == 1.0f);
            return;
        }
        PD2 pd2 = BZ2.b;
        if (pd2 == fd2) {
            view.setBackground((Drawable) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = BZ2.f;
        if (pd22 != fd2) {
            PD2 pd23 = BZ2.e;
            if (pd23 == fd2) {
                imageView.setImageDrawable((Drawable) propertyModel.i(pd23));
                return;
            }
            LD2 ld22 = BZ2.d;
            if (ld22 == fd2) {
                imageView.setVisibility(propertyModel.j(ld22) ? 0 : 8);
                return;
            }
            LD2 ld23 = BZ2.h;
            if (ld23 == fd2) {
                imageView2.setVisibility(propertyModel.j(ld23) ? 0 : 8);
                return;
            }
            PD2 pd24 = BZ2.i;
            if (pd24 == fd2) {
                imageView2.setOnClickListener((View.OnClickListener) propertyModel.i(pd24));
                return;
            }
            PD2 pd25 = BZ2.l;
            if (pd25 == fd2) {
                textView.setOnClickListener((View.OnClickListener) propertyModel.i(pd25));
                return;
            }
            PD2 pd26 = BZ2.m;
            if (pd26 == fd2) {
                textView.addTextChangedListener((TextWatcher) propertyModel.i(pd26));
                return;
            }
            PD2 pd27 = BZ2.j;
            if (pd27 == fd2) {
                textView.setText((CharSequence) propertyModel.i(pd27));
                return;
            }
            LD2 ld24 = BZ2.k;
            if (ld24 == fd2) {
                textView.setHint(propertyModel.j(ld24) ? view.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f1409cf) : null);
                return;
            }
            PD2 pd28 = BZ2.g;
            if (pd28 == fd2) {
                imageView.setOnClickListener((View.OnClickListener) propertyModel.i(pd28));
                return;
            }
            ND2 nd2 = BZ2.n;
            if (nd2 == fd2) {
                textView.setHintTextColor(propertyModel.h(nd2));
                return;
            }
            ND2 nd22 = BZ2.o;
            if (nd22 == fd2) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = propertyModel.h(nd22);
                view.setLayoutParams(layoutParams);
                return;
            }
            ND2 nd23 = BZ2.p;
            if (nd23 == fd2) {
                ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = propertyModel.h(nd23);
                return;
            }
            ND2 nd24 = BZ2.q;
            if (nd24 == fd2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), propertyModel.h(nd24), view.getPaddingBottom());
                return;
            }
            MD2 md22 = BZ2.r;
            if (md22 == fd2) {
                textView.setTranslationX(propertyModel.g(md22));
                return;
            }
            ND2 nd25 = BZ2.s;
            if (nd25 == fd2) {
                int h = propertyModel.h(nd25);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = h;
                    imageView.setLayoutParams(layoutParams2);
                }
                ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = h;
                    imageView2.setLayoutParams(layoutParams3);
                    return;
                }
                return;
            }
            ND2 nd26 = BZ2.t;
            if (nd26 == fd2) {
                int h2 = propertyModel.h(nd26);
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.width = h2;
                    imageView.setLayoutParams(layoutParams4);
                }
                ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.width = h2;
                    imageView2.setLayoutParams(layoutParams5);
                    return;
                }
                return;
            }
            ND2 nd27 = BZ2.u;
            if (nd27 != fd2 || (marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()) == null) {
                return;
            }
            marginLayoutParams.leftMargin = propertyModel.h(nd27);
            return;
        }
        imageView.setImageTintList((ColorStateList) propertyModel.i(pd22));
        imageView2.setImageTintList((ColorStateList) propertyModel.i(pd22));
    }
}
