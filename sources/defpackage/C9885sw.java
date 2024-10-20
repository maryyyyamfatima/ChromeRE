package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sw */
/* loaded from: classes.dex */
public final class C9885sw implements TD2 {
    public final TD2 a;

    public C9885sw(TD2 td2) {
        this.a = td2;
    }

    @Override // defpackage.TD2
    /* renamed from: a */
    public final void d(PropertyModel propertyModel, C8170nw c8170nw, FD2 fd2) {
        this.a.d(propertyModel, c8170nw.g.g, fd2);
        PD2 pd2 = AbstractC0240Bw.a;
        C3290Zi0 c3290Zi0 = c8170nw.g;
        if (pd2 == fd2) {
            h(propertyModel, c8170nw);
            c(propertyModel, c3290Zi0);
            return;
        }
        if (AbstractC0240Bw.d == fd2) {
            c(propertyModel, c3290Zi0);
            return;
        }
        ND2 nd2 = AbstractC5038ep3.b;
        if (nd2 == fd2) {
            int h = propertyModel.h(nd2);
            WeakHashMap weakHashMap = Ec4.a;
            c8170nw.setLayoutDirection(h);
            c(propertyModel, c3290Zi0);
            return;
        }
        ND2 nd22 = AbstractC5038ep3.a;
        ArrayList arrayList = c8170nw.a;
        if (nd22 != fd2) {
            PD2 pd22 = AbstractC0240Bw.b;
            if (pd22 == fd2) {
                List list = (List) propertyModel.i(pd22);
                int size = list != null ? list.size() : 0;
                int size2 = arrayList.size();
                if (size2 < size) {
                    for (int size3 = arrayList.size(); size3 < size; size3++) {
                        AppCompatImageView appCompatImageView = new AppCompatImageView(c8170nw.getContext(), null);
                        appCompatImageView.setClickable(true);
                        appCompatImageView.setFocusable(true);
                        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
                        appCompatImageView.setLayoutParams(new C2088Qb3(c8170nw.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080627), -1));
                        arrayList.add(appCompatImageView);
                        c8170nw.addView(appCompatImageView);
                    }
                } else if (size2 > size) {
                    for (int i = size; i < arrayList.size(); i++) {
                        c8170nw.removeView((View) arrayList.get(i));
                    }
                    arrayList.subList(size, arrayList.size()).clear();
                }
                Drawable b = b(c8170nw, propertyModel);
                for (int i2 = 0; i2 < size; i2++) {
                    ImageView imageView = (ImageView) arrayList.get(i2);
                    final C0110Aw c0110Aw = (C0110Aw) list.get(i2);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: qw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0110Aw.this.b.run();
                        }
                    });
                    imageView.setContentDescription(c0110Aw.c);
                    imageView.setBackground(b.getConstantState().newDrawable());
                    g(imageView, c0110Aw.a, propertyModel.h(nd22) == 2 ? R.color.0_resource_name_obfuscated_res_0x7f070122 : R.color.0_resource_name_obfuscated_res_0x7f07012b);
                    imageView.setAccessibilityDelegate(new C9542rw(c0110Aw, imageView));
                }
                return;
            }
            PD2 pd23 = AbstractC0240Bw.c;
            if (pd23 != fd2) {
                PD2 pd24 = AbstractC0240Bw.e;
                if (pd24 == fd2) {
                    final Runnable runnable = (Runnable) propertyModel.i(pd24);
                    if (runnable == null) {
                        c3290Zi0.setOnClickListener(null);
                        return;
                    } else {
                        c3290Zi0.setOnClickListener(new View.OnClickListener() { // from class: ow
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                runnable.run();
                            }
                        });
                        return;
                    }
                }
                PD2 pd25 = AbstractC0240Bw.f;
                if (pd25 == fd2) {
                    final Runnable runnable2 = (Runnable) propertyModel.i(pd25);
                    if (runnable2 == null) {
                        c3290Zi0.setOnLongClickListener(null);
                        return;
                    } else {
                        c3290Zi0.setOnLongClickListener(new View.OnLongClickListener() { // from class: pw
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                runnable2.run();
                                return true;
                            }
                        });
                        return;
                    }
                }
                return;
            }
            c8170nw.h = (Runnable) propertyModel.i(pd23);
            return;
        }
        h(propertyModel, c8170nw);
        Drawable b2 = b(c8170nw, propertyModel);
        c3290Zi0.setBackground(b2);
        List list2 = (List) propertyModel.i(AbstractC0240Bw.b);
        if (list2 == null) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ImageView imageView2 = (ImageView) arrayList.get(i3);
            imageView2.setBackground(b2.getConstantState().newDrawable());
            g(imageView2, ((C0110Aw) list2.get(i3)).a, propertyModel.h(nd22) == 2 ? R.color.0_resource_name_obfuscated_res_0x7f070122 : R.color.0_resource_name_obfuscated_res_0x7f07012b);
        }
    }

    public static void h(PropertyModel propertyModel, C8170nw c8170nw) {
        ImageView imageView = c8170nw.g.a;
        C5726gp3 c5726gp3 = (C5726gp3) propertyModel.i(AbstractC0240Bw.a);
        if (c5726gp3 != null) {
            Resources resources = imageView.getContext().getResources();
            boolean z = c5726gp3.d;
            int dimensionPixelSize = resources.getDimensionPixelSize(z ? R.dimen.0_resource_name_obfuscated_res_0x7f080625 : R.dimen.0_resource_name_obfuscated_res_0x7f080622);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(z ? R.dimen.0_resource_name_obfuscated_res_0x7f080624 : R.dimen.0_resource_name_obfuscated_res_0x7f080621);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(z ? R.dimen.0_resource_name_obfuscated_res_0x7f080626 : R.dimen.0_resource_name_obfuscated_res_0x7f080623);
            imageView.setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
            imageView.setMinimumHeight(dimensionPixelSize3);
            imageView.setClipToOutline(c5726gp3.c);
        }
        g(imageView, c5726gp3, propertyModel.h(AbstractC5038ep3.a) == 2 ? R.color.0_resource_name_obfuscated_res_0x7f070129 : R.color.0_resource_name_obfuscated_res_0x7f07012a);
    }

    public static void c(PropertyModel propertyModel, C3290Zi0 c3290Zi0) {
        int i;
        int i2;
        c3290Zi0.setPaddingRelative(((C5726gp3) propertyModel.i(AbstractC0240Bw.a)) == null ? c3290Zi0.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080634) : 0, 0, c3290Zi0.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080631), 0);
        if (propertyModel.h(AbstractC0240Bw.d) != 1) {
            i = R.dimen.0_resource_name_obfuscated_res_0x7f080633;
            i2 = R.dimen.0_resource_name_obfuscated_res_0x7f080632;
        } else {
            i = R.dimen.0_resource_name_obfuscated_res_0x7f08062a;
            i2 = R.dimen.0_resource_name_obfuscated_res_0x7f080629;
        }
        int dimensionPixelSize = c3290Zi0.getResources().getDimensionPixelSize(i);
        c3290Zi0.g.setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        c3290Zi0.g.setMinimumHeight(c3290Zi0.getResources().getDimensionPixelSize(i2));
    }

    public static Drawable b(View view, PropertyModel propertyModel) {
        return AbstractC5647gc2.e(propertyModel.h(AbstractC5038ep3.a), R.attr.0_resource_name_obfuscated_res_0x7f0503f1, view.getContext());
    }

    public static void g(ImageView imageView, C5726gp3 c5726gp3, int i) {
        imageView.setVisibility(c5726gp3 == null ? 8 : 0);
        if (c5726gp3 != null) {
            ColorStateList b = c5726gp3.b ? Y50.b(imageView.getContext(), i) : null;
            imageView.setImageDrawable(c5726gp3.a);
            imageView.setImageTintList(b);
            return;
        }
        imageView.setImageDrawable(null);
    }
}
