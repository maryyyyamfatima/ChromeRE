package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1844Of extends ImageButton {
    public final C3944bf a;
    public final C1974Pf g;
    public boolean h;

    public C1844Of(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f8410_resource_name_obfuscated_res_0x7f050276);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844Of(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FN3.a(context);
        this.h = false;
        AbstractC3838bK3.a(getContext(), this);
        C3944bf c3944bf = new C3944bf(this);
        this.a = c3944bf;
        c3944bf.d(attributeSet, i);
        C1974Pf c1974Pf = new C1974Pf(this);
        this.g = c1974Pf;
        c1974Pf.b(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.g.c(i);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        C1974Pf c1974Pf = this.g;
        if (c1974Pf != null && drawable != null && !this.h) {
            c1974Pf.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1974Pf != null) {
            c1974Pf.a();
            if (this.h) {
                return;
            }
            ImageView imageView = c1974Pf.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1974Pf.b);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.g.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1974Pf c1974Pf = this.g;
        if (c1974Pf != null) {
            c1974Pf.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1974Pf c1974Pf = this.g;
        if (c1974Pf != null) {
            c1974Pf.a();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.a();
        }
        C1974Pf c1974Pf = this.g;
        if (c1974Pf != null) {
            c1974Pf.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }
}
