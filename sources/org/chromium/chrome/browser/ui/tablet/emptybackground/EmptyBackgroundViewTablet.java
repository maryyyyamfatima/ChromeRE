package org.chromium.chrome.browser.ui.tablet.emptybackground;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC10569uv3;
import defpackage.C2985Wz0;
import defpackage.C3115Xz0;
import defpackage.InterfaceC10590uz3;
import defpackage.ViewOnClickListenerC2855Vz0;
import org.chromium.chrome.browser.ui.tablet.emptybackground.incognitotoggle.IncognitoToggleButtonTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class EmptyBackgroundViewTablet extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public InterfaceC10590uz3 a;
    public AbstractC10569uv3 g;
    public Animator h;
    public ObjectAnimator i;
    public ObjectAnimator j;
    public IncognitoToggleButtonTablet k;

    public EmptyBackgroundViewTablet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.empty_new_tab_button).setOnClickListener(new ViewOnClickListenerC2855Vz0(this));
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R.style.f107050_resource_name_obfuscated_res_0x7f1505fe, new int[]{android.R.attr.layout_height});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(R.id.empty_layout_button_container);
        float f = -dimensionPixelSize;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.TRANSLATION_Y, f, 0.0f);
        this.i = ofFloat;
        ofFloat.setDuration(200L);
        this.i.addListener(new C2985Wz0(this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
        this.j = ofFloat2;
        ofFloat2.setDuration(200L);
        this.j.addListener(new C3115Xz0(this));
    }
}
