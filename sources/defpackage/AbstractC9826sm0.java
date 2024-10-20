package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9826sm0 extends Preference {
    public final CharSequence T;
    public CharSequence U;
    public final Drawable V;
    public final String W;
    public final String X;
    public int Y;

    public AbstractC9826sm0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.K, i, 0);
        String f = AbstractC9067qZ3.f(obtainStyledAttributes, 9, 0);
        this.T = f;
        if (f == null) {
            this.T = this.m;
        }
        this.U = AbstractC9067qZ3.f(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.V = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.W = AbstractC9067qZ3.f(obtainStyledAttributes, 11, 3);
        this.X = AbstractC9067qZ3.f(obtainStyledAttributes, 10, 4);
        this.Y = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public AbstractC9826sm0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC9067qZ3.a(R.attr.f6240_resource_name_obfuscated_res_0x7f05019d, android.R.attr.dialogPreferenceStyle, context));
    }

    @Override // androidx.preference.Preference
    public final void w() {
        InterfaceC0903Gy2 interfaceC0903Gy2 = this.g.i;
        if (interfaceC0903Gy2 != null) {
            interfaceC0903Gy2.x(this);
        }
    }
}
