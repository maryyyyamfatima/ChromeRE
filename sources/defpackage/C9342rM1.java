package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9342rM1 extends C4974ef {
    public static final int[] x = {R.attr.f12800_resource_name_obfuscated_res_0x7f05042d};
    public static final int[][] y = {new int[]{android.R.attr.state_enabled, R.attr.f12800_resource_name_obfuscated_res_0x7f05042d}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;
    public final boolean l;
    public final boolean m;
    public final CharSequence n;
    public Drawable o;
    public Drawable p;
    public boolean q;
    public ColorStateList r;
    public final ColorStateList s;
    public final PorterDuff.Mode t;
    public int[] u;
    public final C6674jc v;
    public final C9000qM1 w;

    public C9342rM1(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.f4190_resource_name_obfuscated_res_0x7f0500d0, R.style.f112860_resource_name_obfuscated_res_0x7f150847), attributeSet);
        new LinkedHashSet();
        this.v = C6674jc.b(getContext(), R.drawable.f51560_resource_name_obfuscated_res_0x7f0903b9);
        this.w = new C9000qM1(this);
        Context context2 = getContext();
        this.o = this.o;
        ColorStateList colorStateList = this.r;
        if (colorStateList == null) {
            if (super.getButtonTintList() == null) {
                C6006hf c6006hf = this.a;
                colorStateList = c6006hf != null ? c6006hf.b : null;
            } else {
                colorStateList = super.getButtonTintList();
            }
        }
        this.r = colorStateList;
        C6006hf c6006hf2 = this.a;
        if (c6006hf2 != null) {
            c6006hf2.b = null;
            c6006hf2.d = true;
            c6006hf2.a();
        }
        int[] iArr = JG2.k0;
        SJ3.a(context2, attributeSet, R.attr.f4190_resource_name_obfuscated_res_0x7f0500d0, R.style.f112860_resource_name_obfuscated_res_0x7f150847);
        SJ3.b(context2, attributeSet, iArr, R.attr.f4190_resource_name_obfuscated_res_0x7f0500d0, R.style.f112860_resource_name_obfuscated_res_0x7f150847, new int[0]);
        IN3 in3 = new IN3(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.f4190_resource_name_obfuscated_res_0x7f0500d0, R.style.f112860_resource_name_obfuscated_res_0x7f150847));
        this.p = in3.e(0);
        if (this.o == null) {
            this.o = AbstractC2884Wf.a(context2, R.drawable.f51550_resource_name_obfuscated_res_0x7f0903b8);
            this.q = true;
            if (this.p == null) {
                this.p = AbstractC2884Wf.a(context2, R.drawable.f51570_resource_name_obfuscated_res_0x7f0903ba);
            }
        }
        this.s = AM1.a(context2, in3, 1);
        this.t = Ee4.b(in3.h(2, -1), PorterDuff.Mode.SRC_IN);
        this.k = in3.a(7, false);
        this.l = in3.a(4, true);
        this.m = in3.a(6, false);
        this.n = in3.k(5);
        in3.n();
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        C6006hf c6006hf = this.a;
        if (c6006hf != null) {
            c6006hf.c = mode;
            c6006hf.e = true;
            c6006hf.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.l && TextUtils.isEmpty(getText()) && (drawable = this.o) != null) {
            WeakHashMap weakHashMap = Ec4.a;
            int width = ((getWidth() - drawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = drawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && this.r == null && this.s == null) {
            this.k = true;
            if (this.j == null) {
                int d = AbstractC9685sM1.d(this, R.attr.f4850_resource_name_obfuscated_res_0x7f050112);
                int d2 = AbstractC9685sM1.d(this, R.attr.f4880_resource_name_obfuscated_res_0x7f050115);
                int d3 = AbstractC9685sM1.d(this, R.attr.f5490_resource_name_obfuscated_res_0x7f050152);
                int d4 = AbstractC9685sM1.d(this, R.attr.f5130_resource_name_obfuscated_res_0x7f05012e);
                this.j = new ColorStateList(y, new int[]{AbstractC9685sM1.e(1.0f, d3, d2), AbstractC9685sM1.e(1.0f, d3, d), AbstractC9685sM1.e(0.54f, d3, d4), AbstractC9685sM1.e(0.38f, d3, d4), AbstractC9685sM1.e(0.38f, d3, d4)});
            }
            setButtonTintList(this.j);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.m) {
            View.mergeDrawableStates(onCreateDrawableState, x);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                }
                i2++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.u = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.m) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.n));
        }
    }

    @Override // defpackage.C4974ef, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC2884Wf.a(getContext(), i));
    }

    @Override // defpackage.C4974ef, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.o = drawable;
        this.q = false;
        b();
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.o;
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.r;
    }

    public final void b() {
        int intrinsicHeight;
        int i;
        ColorStateList colorStateList;
        Drawable drawable = this.o;
        ColorStateList colorStateList2 = this.r;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        Drawable drawable2 = null;
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList2 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.o = drawable;
        Drawable drawable3 = this.p;
        ColorStateList colorStateList3 = this.s;
        if (drawable3 != null) {
            if (colorStateList3 != null) {
                drawable3 = drawable3.mutate();
                PorterDuff.Mode mode = this.t;
                if (mode != null) {
                    drawable3.setTintMode(mode);
                }
            }
            drawable2 = drawable3;
        }
        this.p = drawable2;
        if (this.q) {
            C6674jc c6674jc = this.v;
            if (c6674jc != null) {
                C9000qM1 c9000qM1 = this.w;
                c6674jc.e(c9000qM1);
                c6674jc.a(c9000qM1);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable4 = this.o;
                if ((drawable4 instanceof AnimatedStateListDrawable) && c6674jc != null) {
                    ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, c6674jc, false);
                }
            }
        }
        Drawable drawable5 = this.o;
        if (drawable5 != null && (colorStateList = this.r) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.p;
        if (drawable6 != null && colorStateList3 != null) {
            drawable6.setTintList(colorStateList3);
        }
        Drawable drawable7 = this.o;
        Drawable drawable8 = this.p;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            if (drawable8.getIntrinsicWidth() == -1 || drawable8.getIntrinsicHeight() == -1) {
                int intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
                i = intrinsicWidth;
            } else if (drawable8.getIntrinsicWidth() <= drawable7.getIntrinsicWidth() && drawable8.getIntrinsicHeight() <= drawable7.getIntrinsicHeight()) {
                i = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
            } else {
                float intrinsicWidth2 = drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    i = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (i / intrinsicWidth2);
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    i = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            }
            layerDrawable.setLayerSize(1, i, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
