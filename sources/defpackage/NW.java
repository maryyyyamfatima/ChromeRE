package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.bottom_bar.ColorSelectorView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NW implements TD2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v79 */
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        final ColorSelectorView colorSelectorView = (ColorSelectorView) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = SW.a;
        ND2 nd2 = PW.d;
        ND2 nd22 = PW.e;
        ?? r8 = 0;
        if (pd2 == fd2) {
            ArrayList arrayList = (ArrayList) propertyModel.i(pd2);
            colorSelectorView.setVisibility(0);
            C7616mK1 c7616mK1 = new C7616mK1();
            Context context = colorSelectorView.R0;
            Drawable a = AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090126);
            int color = context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070105);
            Iterator it = arrayList.iterator();
            int i = -1;
            int i2 = 0;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                PropertyModel propertyModel2 = new PropertyModel(PW.f);
                Drawable mutate = AbstractC2884Wf.a(colorSelectorView.getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f09034f).getConstantState().newDrawable().mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.MULTIPLY));
                PD2 pd22 = PW.b;
                if (intValue == color) {
                    propertyModel2.o(pd22, new LayerDrawable(new Drawable[]{mutate, a}));
                    propertyModel2.m(nd22, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080112));
                    i = i2;
                } else {
                    propertyModel2.o(pd22, mutate);
                }
                propertyModel2.o(PW.a, new Callback() { // from class: TW
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        int i3 = ColorSelectorView.S0;
                        ColorSelectorView colorSelectorView2 = ColorSelectorView.this;
                        colorSelectorView2.getClass();
                        int intValue2 = ((Integer) obj3).intValue();
                        Callback callback = colorSelectorView2.P0;
                        if (callback != null) {
                            callback.onResult(Integer.valueOf(intValue2));
                        }
                    }
                });
                propertyModel2.m(nd2, intValue);
                propertyModel2.o(PW.c, intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705bf) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b7) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070583) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b3) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700de) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409a9) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705c2) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409ba) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070830) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409bf) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e1) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409ac) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705be) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b6) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700ff) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409a7) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700dd) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409a8) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705c3) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409bb) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0708d9) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409c4) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e3) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409ad) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705c0) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b8) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070584) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b4) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700df) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409aa) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705c1) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409b9) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f07082c) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409bd) : intValue == context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e0) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1409ab) : null);
                r8 = 0;
                c7616mK1.s(new C7272lK1(0, propertyModel2));
                i2++;
            }
            colorSelectorView.getContext();
            colorSelectorView.q0(new LinearLayoutManager(r8, r8));
            WW ww = new WW(context, c7616mK1, a, i);
            colorSelectorView.Q0 = ww;
            ww.Q(r8, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e0169), new TD2() { // from class: UW
                @Override // defpackage.TD2
                public final void d(WD2 wd22, Object obj3, Object obj4) {
                    PropertyModel propertyModel3 = (PropertyModel) wd22;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) obj3;
                    FD2 fd22 = (FD2) obj4;
                    int i3 = ColorSelectorView.S0;
                    PD2 pd23 = PW.b;
                    if (pd23.equals(fd22)) {
                        ((ImageView) appCompatImageView.findViewById(R.id.icon)).setImageDrawable((Drawable) propertyModel3.i(pd23));
                        return;
                    }
                    PD2 pd24 = PW.c;
                    if (pd24.equals(fd22)) {
                        appCompatImageView.setContentDescription((CharSequence) propertyModel3.i(pd24));
                        return;
                    }
                    PD2 pd25 = PW.a;
                    if (pd25.equals(fd22)) {
                        final Callback callback = (Callback) propertyModel3.i(pd25);
                        final int h = propertyModel3.h(PW.d);
                        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: VW
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = ColorSelectorView.S0;
                                Callback callback2 = Callback.this;
                                if (callback2 != null) {
                                    callback2.onResult(Integer.valueOf(h));
                                }
                            }
                        });
                    } else {
                        ND2 nd23 = PW.e;
                        if (nd23.equals(fd22)) {
                            int h2 = propertyModel3.h(nd23);
                            appCompatImageView.setPadding(h2, h2, h2, h2);
                        }
                    }
                }
            });
            colorSelectorView.n0(colorSelectorView.Q0);
            return;
        }
        ND2 nd23 = SW.c;
        if (nd23 != fd2) {
            PD2 pd23 = SW.b;
            if (pd23 == fd2) {
                colorSelectorView.P0 = (Callback) propertyModel.i(pd23);
                return;
            }
            return;
        }
        int h = propertyModel.h(nd23);
        WW ww2 = colorSelectorView.Q0;
        if (ww2 != null) {
            for (int i3 = 0; i3 < ww2.q(); i3++) {
                C7616mK1 c7616mK12 = ww2.l;
                if (h == ((C7272lK1) c7616mK12.get(i3)).b.h(nd2)) {
                    if (ww2.o != null && i3 >= 0 && i3 < ww2.q()) {
                        ImageView imageView = (ImageView) ww2.o.r(ww2.p);
                        if (imageView != null) {
                            imageView.setSelected(false);
                            imageView.setImageDrawable(((LayerDrawable) imageView.getDrawable()).getDrawable(0));
                            ((C7272lK1) c7616mK12.get(ww2.p)).b.m(nd22, ww2.m);
                        }
                        ww2.p = i3;
                        ImageView imageView2 = (ImageView) ww2.o.r(i3);
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(new LayerDrawable(new Drawable[]{imageView2.getDrawable(), ww2.k}));
                            ((C7272lK1) c7616mK12.get(ww2.p)).b.m(nd22, ww2.n);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
