package org.chromium.chrome.browser.toolbar.menu_button;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC9771sd;
import defpackage.C4499dF2;
import defpackage.Ec4;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceViewOnTouchListenerC0040Ai;
import defpackage.QJ3;
import defpackage.US1;
import defpackage.ZE2;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MenuButton extends FrameLayout implements QJ3 {
    public ImageButton a;
    public ImageView g;
    public int h;
    public InterfaceViewOnTouchListenerC0040Ai i;
    public boolean j;
    public C4499dF2 k;
    public Drawable l;
    public AnimatorSet m;
    public boolean n;
    public BitmapDrawable o;
    public BitmapDrawable p;
    public InterfaceC0079Ap3 q;

    public MenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageButton) findViewById(R.id.menu_button);
        this.g = (ImageView) findViewById(R.id.menu_badge);
        this.l = getBackground();
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        ImageButton imageButton = this.a;
        if (imageButton == null) {
            return;
        }
        imageButton.setOnKeyListener(onKeyListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }

    public final void a() {
        ImageView imageView;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.a.getDrawable().getConstantState().newDrawable().mutate();
        this.o = bitmapDrawable;
        bitmapDrawable.setBounds(this.a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getWidth() - this.a.getPaddingRight(), this.a.getHeight() - this.a.getPaddingBottom());
        this.o.setGravity(17);
        this.o.setColorFilter(AbstractC3494aK3.c(getContext(), this.h).getDefaultColor(), PorterDuff.Mode.SRC_IN);
        US1 us1 = (US1) this.q.get();
        if (us1 == null || (imageView = this.g) == null) {
            return;
        }
        int i = this.h;
        int i2 = us1.d;
        if (i == 1 || i == 2) {
            i2 = us1.c;
        } else if (i == 0) {
            i2 = us1.b;
        }
        imageView.setImageDrawable(AbstractC9771sd.c(getResources(), i2, 0));
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) this.g.getDrawable().getConstantState().newDrawable().mutate();
        this.p = bitmapDrawable2;
        bitmapDrawable2.setBounds(this.g.getPaddingLeft(), this.g.getPaddingTop(), this.g.getWidth() - this.g.getPaddingRight(), this.g.getHeight() - this.g.getPaddingBottom());
        this.p.setGravity(17);
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.j) {
            if (this.k == null) {
                C4499dF2 b = C4499dF2.b(getContext(), new ZE2());
                this.k = b;
                ImageButton imageButton = this.a;
                WeakHashMap weakHashMap = Ec4.a;
                b.d(imageButton.getPaddingStart(), this.a.getPaddingTop(), this.a.getPaddingEnd(), this.a.getPaddingBottom());
            }
            int i = this.h;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            this.k.e(getContext(), z);
            setBackground(this.k);
            this.k.start();
            return;
        }
        setBackground(this.l);
    }

    @Override // defpackage.QJ3
    public final void c(int i, ColorStateList colorStateList) {
        this.a.setImageTintList(colorStateList);
        this.h = i;
        a();
        b();
    }
}
