package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.chromium.components.browser_ui.widget.text.TemplatePreservingTextView;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pf3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1978Pf3 {
    public final WindowAndroid a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final TemplatePreservingTextView d;
    public final TextView e;
    public final ImageView f;
    public final int g;
    public final boolean h;
    public final ViewGroup i;
    public ViewGroup j;
    public C12188zf3 k;
    public final View l;
    public final Rect m = new Rect();
    public final Rect n = new Rect();
    public final int[] o = new int[2];
    public final ViewOnLayoutChangeListenerC1588Mf3 p = new ViewOnLayoutChangeListenerC1588Mf3(this);

    public C1978Pf3(Activity activity, View.OnClickListener onClickListener, C12188zf3 c12188zf3, ViewGroup viewGroup, WindowAndroid windowAndroid) {
        this.h = DeviceFormFactor.a(activity);
        this.i = viewGroup;
        this.a = windowAndroid;
        this.l = activity.findViewById(R.id.content);
        this.j = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(activity).inflate(com.android.chrome.R.layout.f60960_resource_name_obfuscated_res_0x7f0e0284, this.j, false);
        this.b = viewGroup2;
        this.c = (ViewGroup) viewGroup2.findViewById(com.android.chrome.R.id.snackbar);
        this.g = viewGroup2.getResources().getInteger(R.integer.config_mediumAnimTime);
        this.d = (TemplatePreservingTextView) viewGroup2.findViewById(com.android.chrome.R.id.snackbar_message);
        TextView textView = (TextView) viewGroup2.findViewById(com.android.chrome.R.id.snackbar_button);
        this.e = textView;
        textView.setOnClickListener(onClickListener);
        this.f = (ImageView) viewGroup2.findViewById(com.android.chrome.R.id.snackbar_profile_image);
        g(c12188zf3, false);
    }

    public final void b() {
        this.e.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.g);
        animatorSet.addListener(new C1848Of3(this));
        Property property = View.TRANSLATION_Y;
        ViewGroup viewGroup = this.b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, d());
        ofFloat.setInterpolator(AbstractC8142nr1.a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f);
        ofFloat2.setInterpolator(InterpolatorC0485Dt.d);
        animatorSet.playTogether(ofFloat2, ofFloat);
        WindowAndroid windowAndroid = this.a;
        if (windowAndroid != null) {
            windowAndroid.C(animatorSet);
        } else {
            animatorSet.start();
        }
    }

    public int d() {
        ViewGroup viewGroup = this.b;
        return viewGroup.getHeight() + ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).bottomMargin;
    }

    public int c() {
        ViewGroup viewGroup = this.j;
        int[] iArr = this.o;
        viewGroup.getLocationInWindow(iArr);
        return Math.max(0, (this.j.getHeight() + iArr[1]) - this.m.bottom);
    }

    public final void e(ViewGroup viewGroup) {
        View view = this.l;
        ViewOnLayoutChangeListenerC1588Mf3 viewOnLayoutChangeListenerC1588Mf3 = this.p;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1588Mf3);
        if (viewGroup == null) {
            viewGroup = this.i;
        }
        this.j = viewGroup;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2.isShown()) {
            ((ViewGroup) viewGroup2.getParent()).removeView(viewGroup2);
        }
        this.j.addView(viewGroup2);
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1588Mf3);
    }

    public void a() {
        TemplatePreservingTextView templatePreservingTextView = this.d;
        StringBuilder sb = new StringBuilder(templatePreservingTextView.getContentDescription());
        TextView textView = this.e;
        if (textView.getContentDescription() != null) {
            sb.append(". ");
            sb.append(textView.getContentDescription());
            sb.append(". ");
            sb.append(this.b.getResources().getString(com.android.chrome.R.string.f69550_resource_name_obfuscated_res_0x7f1402b6));
        }
        templatePreservingTextView.announceForAccessibility(sb);
    }

    public final boolean g(C12188zf3 c12188zf3, boolean z) {
        int i;
        int i2;
        if (this.k == c12188zf3) {
            return false;
        }
        this.k = c12188zf3;
        int i3 = c12188zf3.i ? 1 : 5;
        TemplatePreservingTextView templatePreservingTextView = this.d;
        templatePreservingTextView.setMaxLines(i3);
        String str = c12188zf3.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        templatePreservingTextView.k = str;
        f(templatePreservingTextView, c12188zf3.b, z);
        if (c12188zf3.n == 1) {
            i = com.android.chrome.R.style.f102760_resource_name_obfuscated_res_0x7f150451;
        } else {
            i = c12188zf3.h;
            if (i == 0) {
                i = com.android.chrome.R.style.f102720_resource_name_obfuscated_res_0x7f15044d;
            }
        }
        templatePreservingTextView.setTextAppearance(templatePreservingTextView.getContext(), i);
        int i4 = c12188zf3.n == 1 ? com.android.chrome.R.style.f100150_resource_name_obfuscated_res_0x7f15034c : com.android.chrome.R.style.f103210_resource_name_obfuscated_res_0x7f15047e;
        TextView textView = this.e;
        AbstractC9771sd.i(i4, textView);
        int i5 = c12188zf3.n;
        ViewGroup viewGroup = this.b;
        if (i5 == 1) {
            i2 = viewGroup.getContext().getColor(com.android.chrome.R.color.f17580_resource_name_obfuscated_res_0x7f070106);
        } else {
            i2 = c12188zf3.g;
            if (i2 == 0) {
                i2 = AbstractC11746yN.c(viewGroup.getContext(), com.android.chrome.R.dimen.f40340_resource_name_obfuscated_res_0x7f080738);
            }
        }
        boolean z2 = this.h;
        ViewGroup viewGroup2 = this.c;
        if (z2) {
            viewGroup2.setBackgroundResource(com.android.chrome.R.drawable.f53440_resource_name_obfuscated_res_0x7f09049c);
            ((GradientDrawable) viewGroup2.getBackground().mutate()).setColor(i2);
        } else {
            viewGroup2.setBackgroundColor(i2);
        }
        if (c12188zf3.d != null) {
            textView.setVisibility(0);
            textView.setContentDescription(c12188zf3.d);
            f(textView, c12188zf3.d, z);
            if (templatePreservingTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) templatePreservingTextView.getLayoutParams();
                layoutParams.setMarginEnd(0);
                templatePreservingTextView.setLayoutParams(layoutParams);
            }
        } else {
            textView.setVisibility(8);
            if (templatePreservingTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) templatePreservingTextView.getLayoutParams();
                layoutParams2.setMarginEnd(this.j.getResources().getDimensionPixelSize(com.android.chrome.R.dimen.f40390_resource_name_obfuscated_res_0x7f08073d));
                templatePreservingTextView.setLayoutParams(layoutParams2);
            }
        }
        Drawable drawable = c12188zf3.k;
        ImageView imageView = this.f;
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
        if (z2) {
            viewGroup.findViewById(com.android.chrome.R.id.snackbar_shadow_left).setVisibility(0);
            viewGroup.findViewById(com.android.chrome.R.id.snackbar_shadow_right).setVisibility(0);
        }
        return true;
    }

    public final void f(TextView textView, CharSequence charSequence, boolean z) {
        if (textView.getText().toString().equals(charSequence)) {
            return;
        }
        textView.animate().cancel();
        if (z) {
            textView.setAlpha(0.0f);
            textView.setText(charSequence);
            textView.animate().alpha(1.0f).setDuration(this.g).setListener(null);
            return;
        }
        textView.setText(charSequence);
    }
}
