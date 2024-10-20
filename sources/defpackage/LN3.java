package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LN3 extends BitmapDrawable {
    public ColorStateList a;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public LN3(Context context, Bitmap bitmap) {
        super(context.getResources(), bitmap);
        this.a = Y50.b(context, R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
    }

    public void c(ColorStateList colorStateList) {
        if (this.a == colorStateList) {
            return;
        }
        this.a = colorStateList;
        if (colorStateList == null) {
            return;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        c(ColorStateList.valueOf(i));
    }

    public static LN3 b(Context context, int i) {
        return new LN3(context, BitmapFactory.decodeResource(context.getResources(), i));
    }

    public static LN3 a(int i, int i2, Context context) {
        LN3 b = b(context, i);
        b.c(Y50.b(context, i2));
        return b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.a;
        boolean z = false;
        if (colorStateList != null) {
            setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
            z = true;
        }
        super.onStateChange(iArr);
        return z;
    }
}
