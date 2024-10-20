package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ex3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639Ex3 extends LinearLayout {
    public C0249Bx3 a;
    public TextView g;
    public ImageView h;
    public View i;
    public TextView j;
    public ImageView k;
    public Drawable l;
    public int m;
    public final /* synthetic */ TabLayout n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Ex3, android.widget.LinearLayout, android.view.View] */
    public C0639Ex3(TabLayout tabLayout, Context context) {
        super(context);
        C3232Yw2 c3232Yw2;
        PointerIcon systemIcon;
        this.n = tabLayout;
        this.m = 2;
        int i = tabLayout.v;
        if (i != 0) {
            Drawable a = AbstractC2884Wf.a(context, i);
            this.l = a;
            if (a != null && a.isStateful()) {
                this.l.setState(getDrawableState());
            }
        } else {
            this.l = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        ColorStateList colorStateList = tabLayout.p;
        if (colorStateList != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            int[] iArr = AbstractC9363rQ2.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{AbstractC9363rQ2.d, iArr, StateSet.NOTHING}, new int[]{AbstractC9363rQ2.a(colorStateList, AbstractC9363rQ2.c), AbstractC9363rQ2.a(colorStateList, iArr), AbstractC9363rQ2.a(colorStateList, AbstractC9363rQ2.a)});
            boolean z = tabLayout.G;
            gradientDrawable = new RippleDrawable(colorStateList2, z ? null : gradientDrawable, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = Ec4.a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.i, tabLayout.j, tabLayout.k, tabLayout.l);
        setGravity(17);
        setOrientation(!tabLayout.E ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 24) {
            c3232Yw2 = new C3232Yw2(null);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context2, 1002);
            c3232Yw2 = new C3232Yw2(systemIcon);
        }
        if (i2 >= 24) {
            setPointerIcon(c3232Yw2.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.l;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | this.l.setState(drawableState);
        }
        if (z) {
            invalidate();
            this.n.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.a.b();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        if (isSelected() != z) {
        }
        super.setSelected(z);
        TextView textView = this.g;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.i;
        if (view != null) {
            view.setSelected(z);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.a.e, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.n(false);
            accessibilityNodeInfoCompat.j(C5792h1.g);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.f75610_resource_name_obfuscated_res_0x7f140572));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L31;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            com.google.android.material.tabs.TabLayout r2 = r7.n
            int r3 = r2.w
            if (r3 <= 0) goto L18
            if (r1 == 0) goto L12
            if (r0 <= r3) goto L18
        L12:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
        L18:
            super.onMeasure(r8, r9)
            android.widget.TextView r0 = r7.g
            if (r0 == 0) goto L99
            float r0 = r2.t
            int r1 = r7.m
            android.widget.ImageView r3 = r7.h
            r4 = 1
            if (r3 == 0) goto L30
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L30
            r1 = r4
            goto L3c
        L30:
            android.widget.TextView r3 = r7.g
            if (r3 == 0) goto L3c
            int r3 = r3.getLineCount()
            if (r3 <= r4) goto L3c
            float r0 = r2.u
        L3c:
            android.widget.TextView r3 = r7.g
            float r3 = r3.getTextSize()
            android.widget.TextView r5 = r7.g
            int r5 = r5.getLineCount()
            android.widget.TextView r6 = r7.g
            int r6 = r6.getMaxLines()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L56
            if (r6 < 0) goto L99
            if (r1 == r6) goto L99
        L56:
            int r2 = r2.D
            r6 = 0
            if (r2 != r4) goto L8a
            if (r3 <= 0) goto L8a
            if (r5 != r4) goto L8a
            android.widget.TextView r2 = r7.g
            android.text.Layout r2 = r2.getLayout()
            if (r2 == 0) goto L89
            float r3 = r2.getLineWidth(r6)
            android.text.TextPaint r2 = r2.getPaint()
            float r2 = r2.getTextSize()
            float r2 = r0 / r2
            float r2 = r2 * r3
            int r3 = r7.getMeasuredWidth()
            int r5 = r7.getPaddingLeft()
            int r3 = r3 - r5
            int r5 = r7.getPaddingRight()
            int r3 = r3 - r5
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L8a
        L89:
            r4 = r6
        L8a:
            if (r4 == 0) goto L99
            android.widget.TextView r2 = r7.g
            r2.setTextSize(r6, r0)
            android.widget.TextView r0 = r7.g
            r0.setMaxLines(r1)
            super.onMeasure(r8, r9)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0639Ex3.onMeasure(int, int):void");
    }

    public final void a() {
        C0249Bx3 c0249Bx3 = this.a;
        View view = c0249Bx3 != null ? c0249Bx3.f : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.i = view;
            TextView textView = this.g;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.h.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.j = textView2;
            if (textView2 != null) {
                this.m = textView2.getMaxLines();
            }
            this.k = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view2 = this.i;
            if (view2 != null) {
                removeView(view2);
                this.i = null;
            }
            this.j = null;
            this.k = null;
        }
        boolean z = false;
        if (this.i == null) {
            if (this.h == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.f56970_resource_name_obfuscated_res_0x7f0e00c4, (ViewGroup) this, false);
                this.h = imageView2;
                addView(imageView2, 0);
            }
            if (this.g == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.f56980_resource_name_obfuscated_res_0x7f0e00c5, (ViewGroup) this, false);
                this.g = textView3;
                addView(textView3);
                this.m = this.g.getMaxLines();
            }
            TextView textView4 = this.g;
            TabLayout tabLayout = this.n;
            textView4.setTextAppearance(tabLayout.m);
            ColorStateList colorStateList = tabLayout.n;
            if (colorStateList != null) {
                this.g.setTextColor(colorStateList);
            }
            b(this.g, this.h);
            ImageView imageView3 = this.h;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0509Dx3(this, imageView3));
            }
            TextView textView5 = this.g;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0509Dx3(this, textView5));
            }
        } else {
            TextView textView6 = this.j;
            if (textView6 != null || this.k != null) {
                b(textView6, this.k);
            }
        }
        if (c0249Bx3 != null && !TextUtils.isEmpty(c0249Bx3.d)) {
            setContentDescription(c0249Bx3.d);
        }
        if (c0249Bx3 != null && c0249Bx3.a()) {
            z = true;
        }
        setSelected(z);
    }

    public final void b(TextView textView, ImageView imageView) {
        Drawable drawable;
        C0249Bx3 c0249Bx3 = this.a;
        Drawable mutate = (c0249Bx3 == null || (drawable = c0249Bx3.b) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.n;
        if (mutate != null) {
            mutate.setTintList(tabLayout.o);
            PorterDuff.Mode mode = tabLayout.s;
            if (mode != null) {
                mutate.setTintMode(mode);
            }
        }
        C0249Bx3 c0249Bx32 = this.a;
        CharSequence charSequence = c0249Bx32 != null ? c0249Bx32.c : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                this.a.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int a = (z && imageView.getVisibility() == 0) ? (int) Ee4.a(getContext(), 8) : 0;
            if (tabLayout.E) {
                if (a != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(a);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (a != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = a;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C0249Bx3 c0249Bx33 = this.a;
        CharSequence charSequence2 = c0249Bx33 != null ? c0249Bx33.d : null;
        if (Build.VERSION.SDK_INT > 23) {
            if (!z) {
                charSequence = charSequence2;
            }
            AbstractC3878bS3.a(charSequence, this);
        }
    }
}
