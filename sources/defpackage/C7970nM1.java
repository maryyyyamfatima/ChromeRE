package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nM1 */
/* loaded from: classes.dex */
public final class C7970nM1 {
    public final MaterialButton a;
    public S53 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public ColorStateList j;
    public ColorStateList k;
    public DM1 l;
    public boolean n;
    public RippleDrawable p;
    public int q;
    public boolean m = false;
    public boolean o = true;

    public C7970nM1(MaterialButton materialButton, S53 s53) {
        this.a = materialButton;
        this.b = s53;
    }

    public final DM1 b(boolean z) {
        RippleDrawable rippleDrawable = this.p;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (DM1) ((LayerDrawable) ((InsetDrawable) this.p.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final InterfaceC12004z63 a() {
        RippleDrawable rippleDrawable = this.p;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.p.getNumberOfLayers() > 2) {
            return (InterfaceC12004z63) this.p.getDrawable(2);
        }
        return (InterfaceC12004z63) this.p.getDrawable(1);
    }

    public final void c(S53 s53) {
        this.b = s53;
        if (b(false) != null) {
            b(false).b(s53);
        }
        if (b(true) != null) {
            b(true).b(s53);
        }
        if (a() != null) {
            a().b(s53);
        }
    }
}
