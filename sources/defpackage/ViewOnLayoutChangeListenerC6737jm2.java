package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.task.PostTask;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jm2 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC6737jm2 implements View.OnLayoutChangeListener {
    public final ZX1 a;
    public final View g;
    public final JC h;
    public final BD2 i;
    public PropertyModel j;
    public PropertyModel k;
    public Resources l;
    public int m;

    public ViewOnLayoutChangeListenerC6737jm2(BD2 bd2, ZX1 zx1, View view, CC cc) {
        this.a = zx1;
        this.i = bd2;
        this.g = view;
        this.h = cc;
        view.addOnLayoutChangeListener(this);
    }

    public final boolean a(int i) {
        Resources resources = this.l;
        if (resources == null) {
            return false;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807af);
        CC cc = (CC) this.h;
        return (i - (cc.m - dimensionPixelSize)) - cc.o >= this.l.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08065a);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final int i9;
        if (this.k == null || (i9 = i4 - i2) == i8 - i6) {
            return;
        }
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: hm2
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC6737jm2 viewOnLayoutChangeListenerC6737jm2 = ViewOnLayoutChangeListenerC6737jm2.this;
                viewOnLayoutChangeListenerC6737jm2.k.k(AbstractC7081km2.c, viewOnLayoutChangeListenerC6737jm2.a(i9));
            }
        });
    }
}
