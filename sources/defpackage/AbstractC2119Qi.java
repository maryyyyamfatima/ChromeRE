package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.android.chrome.R;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qi */
/* loaded from: classes2.dex */
public abstract class AbstractC2119Qi {
    public static final int[] a = {R.id.button_one, R.id.button_two, R.id.button_three, R.id.button_four, R.id.button_five};

    public static void a(PropertyModel propertyModel, View view, FD2 fd2) {
        int[] iArr;
        AnimatorSet animatorSet;
        PD2 pd2 = AbstractC1470Li.n;
        if (fd2 == pd2) {
            C7616mK1 c7616mK1 = (C7616mK1) propertyModel.i(pd2);
            int size = c7616mK1.size();
            ImageButton[] imageButtonArr = new ImageButton[size];
            int i = 0;
            while (true) {
                iArr = a;
                if (i >= size) {
                    break;
                }
                imageButtonArr[i] = (ImageButton) view.findViewById(iArr[i]);
                i++;
            }
            for (int i2 = size; i2 < 5; i2++) {
                ((ViewGroup) view).removeView(view.findViewById(iArr[i2]));
            }
            InterfaceC0300Ci interfaceC0300Ci = (InterfaceC0300Ci) propertyModel.i(AbstractC1470Li.l);
            for (int i3 = 0; i3 < size; i3++) {
                b(imageButtonArr[i3], ((C7272lK1) c7616mK1.get(i3)).b, interfaceC0300Ci);
            }
            boolean j = propertyModel.j(AbstractC1470Li.m);
            if (size < 1) {
                animatorSet = new AnimatorSet();
            } else {
                float f = imageButtonArr[0].getContext().getResources().getDisplayMetrics().density * 10.0f * (LocalizationUtils.isLayoutRtl() == j ? 1.0f : -1.0f);
                animatorSet = new AnimatorSet();
                AnimatorSet.Builder builder = null;
                for (int i4 = 0; i4 < size; i4++) {
                    ImageButton imageButton = imageButtonArr[i4];
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageButton, (Property<ImageButton, Float>) View.ALPHA, 0.0f, 1.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, (Property<ImageButton, Float>) View.TRANSLATION_X, f, 0.0f);
                    long j2 = i4 * 30;
                    ofFloat.setStartDelay(j2);
                    ofFloat2.setStartDelay(j2);
                    ofFloat.setDuration(350L);
                    ofFloat2.setDuration(350L);
                    if (builder == null) {
                        builder = animatorSet.play(ofFloat);
                    } else {
                        builder.with(ofFloat);
                    }
                    builder.with(ofFloat2);
                }
                animatorSet.setStartDelay(80L);
                animatorSet.setInterpolator(InterpolatorC0485Dt.e);
                animatorSet.addListener(new C3624aj(size, imageButtonArr));
            }
            view.setTag(R.id.menu_item_enter_anim_id, animatorSet);
            view.setBackgroundResource(R.drawable.0_resource_name_obfuscated_res_0x7f09038f);
            view.setEnabled(false);
        }
    }

    public static void b(ImageButton imageButton, PropertyModel propertyModel, InterfaceC0300Ci interfaceC0300Ci) {
        Drawable drawable = (Drawable) propertyModel.i(AbstractC1470Li.h);
        int level = drawable.getLevel();
        imageButton.setImageDrawable(drawable);
        drawable.setLevel(level);
        if (propertyModel.j(AbstractC1470Li.g)) {
            imageButton.setImageTintList(Y50.b(imageButton.getContext(), R.color.0_resource_name_obfuscated_res_0x7f070113));
        }
        c(imageButton, interfaceC0300Ci, propertyModel);
    }

    public static void c(final View view, final InterfaceC0300Ci interfaceC0300Ci, final PropertyModel propertyModel) {
        LD2 ld2 = AbstractC1470Li.d;
        view.setEnabled(propertyModel.j(ld2));
        view.setFocusable(propertyModel.j(ld2));
        CharSequence charSequence = (CharSequence) propertyModel.i(AbstractC1470Li.c);
        if (TextUtils.isEmpty(charSequence)) {
            view.setImportantForAccessibility(2);
        } else {
            view.setContentDescription(charSequence);
            view.setImportantForAccessibility(0);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: Mi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((ViewOnKeyListenerC11859yi) InterfaceC0300Ci.this).b(propertyModel);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: Ni
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = (ViewOnKeyListenerC11859yi) interfaceC0300Ci;
                viewOnKeyListenerC11859yi.getClass();
                LD2 ld22 = AbstractC1470Li.d;
                PropertyModel propertyModel2 = propertyModel;
                if (!propertyModel2.j(ld22)) {
                    return false;
                }
                viewOnKeyListenerC11859yi.t = true;
                CharSequence charSequence2 = (CharSequence) propertyModel2.i(AbstractC1470Li.c);
                if (TextUtils.isEmpty(charSequence2)) {
                    charSequence2 = (CharSequence) propertyModel2.i(AbstractC1470Li.b);
                }
                View view3 = view;
                Context context = view3.getContext();
                int c = AbstractC11746yN.c(context, R.dimen.0_resource_name_obfuscated_res_0x7f0807fa);
                YN3 yn3 = new YN3(context);
                yn3.b = charSequence2;
                yn3.c = view3;
                yn3.d = Integer.valueOf(c);
                yn3.e = Integer.valueOf(R.style.f103010_resource_name_obfuscated_res_0x7f15046a);
                if (yn3.b == null) {
                    return false;
                }
                yn3.a().d();
                return true;
            }
        });
        if (propertyModel.j(AbstractC1470Li.e)) {
            AbstractC3593ad4.b(view, new Yc4(1));
        } else {
            AbstractC3593ad4.a(view);
        }
        view.setVisibility(0);
    }
}
